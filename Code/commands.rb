require "java"

require 'open3'
require 'zip/zip'
require 'fileutils'

module Commands
  LAUNCH_COMMAND = '/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -Xms512M -Xmx1024M -Xincgc -cp "/Applications/Minecraft.app/Contents/Resources/Java/MinecraftLauncher.jar" net.minecraft.LauncherFrame'

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
  end

  #TODO Make time keeper method to check time taken by each process.

  def Commands.de_compile
    Dir.chdir("../../../Users/joshuac/RubymineProjects/Patch on Launch/Code/")
    retroguard()
    fernflower()
    #Patch()
  end

  def Commands.retroguard(run = true)
    FileUtils.cp("vanilla/minecraft.jar", 'Work/RG/minecraft_Run.jar')
    if run
      Dir.chdir("Work/RG/retroguard")
      run_shell_command("java -jar retroguard.jar ../minecraft_Run.jar ../minecraft_dobf.jar", false)
      FileUtils.rm("../minecraft_Run.jar")
      Dir.chdir("../../..")
    end
  end

  def Commands.fernflower(run = true)
    FileUtils.mv("Work/RG/minecraft_dobf.jar", "Work/FF/")
    if run
      Dir.chdir("Work/FF/")
      run_shell_command("java -jar fernflower.jar minecraft_dobf.jar Decomp", false)
      File.rename("Decomp/minecraft_dobf.jar", "Decomp/minecraftJar.jar")
      FileUtils.rm("minecraft_dobf.jar")
      if Dir.entries("Decomp").size <= 2 || Dir.entries("Decomp").include?("minecraftJar.jar")
          puts("Unzipping")
        Dir.chdir("Decomp")
        run_shell_command("unzip minecraftJar.jar", true)
        FileUtils.rm("minecraftJar.jar")
      end
      Dir.chdir("../../..")
    end
  end

  def Commands.launch
    run_shell_command(LAUNCH_COMMAND, true)
  end

  def Commands.patch
    Dir.getwd()
    Dir.chdir("Code/Work/FF/Decomp")
    run_shell_command("patch ../../../../Patches/* ",true)
  end

  def Commands.cleanup

  end

  def Commands.foo
    puts " Test"
  end
end