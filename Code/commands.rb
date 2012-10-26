require "java"

require 'open3'
require 'zip/zip'
require 'fileutils'

module Commands
  LAUNCH_COMMAND = '/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -Xms512M -Xmx1024M -Xincgc -cp "/Applications/Minecraft.app/Contents/Resources/Java/MinecraftLauncher.jar" net.minecraft.LauncherFrame'

  # ====================================================================================================================
  # -------------------------------------------Level 0 commands---------------------------------------------------------
  # ====================================================================================================================

  def Commands.run_shell_command(command, out)
    output = ""
    errors = ""
    puts "Running Command [#{command}]"
    Open3.popen3(command) do |stdin, stdout, stderr|
      output = stdout.read
      errors = stderr.read
    end
    if out
      puts "  Output [#{output}]"
      puts "  Errors [#{errors}]"
    end
    puts "Command completed [#{command}]"
  end

  #TODO Make time keeper method to check time taken by each process.

  # ====================================================================================================================
  # -------------------------------------------Level 1 commands---------------------------------------------------------
  # ====================================================================================================================

  def Commands.de_compile
    Dir.chdir("../../../Users/joshuac/RubymineProjects/Patch on Launch/Code/")
    retroguard(true)
    fernflower()
    patch()
  end

  def Commands.launch
    run_shell_command(LAUNCH_COMMAND, true)
  end

  def Commands.foo
    puts " Test"
  end

  # ====================================================================================================================
  # -------------------------------------------Level 2 commands---------------------------------------------------------
  # ====================================================================================================================

  def Commands.retroguard(run = true)
    #TODO Make more efficient
    FileUtils.cp("vanilla/minecraft.jar", 'Work/RG/minecraft_Run.jar')
    if run
      puts "Test"
      puts Dir.getwd
      Dir.chdir("Work/RG")
      puts "Running Retroguard in directory #{Dir.getwd()}"
      run_shell_command("java -jar retroguard.jar minecraft_Run.jar minecraft_dobf.jar", false)
      puts "Retroguard might have finished"
      FileUtils.rm("minecraft_Run.jar")
      Dir.chdir("../../")
    end
  end

  def Commands.fernflower(run = true)
    #TODO Make more efficient
    has_jar = false
    if Dir.entries("Work/FF/").include?("minecraft_dobf.jar")
      has_jar = true
    else
      FileUtils.mv("Work/RG/minecraft_dobf.jar", "Work/FF/")
      has_jar = true
    end

    if run && has_jar && Commands.decompiled?("minecraft_dobf.jar")
      Dir.chdir("Work/FF/")
      run_shell_command("java -jar fernflower.jar minecraft_dobf.jar Decomp", false)
      File.rename("Decomp/minecraft_dobf.jar", "Decomp/minecraftJar.jar")
      FileUtils.rm("minecraft_dobf.jar")
    end
    if Dir.entries("Decomp").include?("minecraftJar.jar")
      unzip()
    end
    Dir.chdir("../../..")
  end

  # ====================================================================================================================
  # -------------------------------------------Level 3 commands---------------------------------------------------------
  # ====================================================================================================================

  def Commands.unzip
    puts("Unzipping")
    Dir.chdir("Decomp")
    run_shell_command("unzip -of minecraftJar.jar", false)
    FileUtils.rm("minecraftJar.jar")
  end

  def Commands.patch
    puts Dir.getwd()
    Dir.chdir("Work/FF/Decomp")
    run_shell_command("patch ../../../../Patches/* ", true)
    compile()
  end

  def Commands.compile()
    Dir.chdir("../../../Comp")
    run_shell_command("jar cf Work/FF/Decomp/*", true)
  end

  def Commands.decompiled?(jar)
    Zip::ZipFile.open(jar) {
        |jarfile|
      if jarfile.find_entry("a.class") == nil
        return true
      else
        return false
      end
    }
  end
end