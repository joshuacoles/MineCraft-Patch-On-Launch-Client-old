require "java"

require 'open3'
#require 'zip/zip'
#require  "/Users/joshuac/RubymineProjects/Patch on Launch/Code/retroguard.jar"

require 'fileutils'

module Commands
  #puts "Starting"

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

  def Commands.de_compile
    Dir.chdir("../../../Users/joshuac/RubymineProjects/Patch on Launch/Code/")
    retroguard()
    fernflower()
  end

  def Commands.retroguard(run = true)
    #puts Dir.getwd
    FileUtils.cp("vanilla/minecraft.jar", 'Work/RG/minecraft_Run.jar')
    Dir.chdir("Work/RG/retroguard")
    if run
      run_shell_command("java RetroGuard ../minecraft_Run.jar ../minecraft_dobf.jar", false)
      FileUtils.rm("../minecraft_Run.jar")
    end
    Dir.chdir("../../..")
    #puts Dir.getwd
  end

  def Commands.fernflower(run = true)
    FileUtils.mv("Work/RG/minecraft_dobf.jar","Work/FF/")
    Dir.chdir("Work/FF/")
    if run
      run_shell_command("java -jar fernflower.jar minecraft_dobf.jar Decomp",false)
      File.rename("Decomp/minecraft_dobf.jar","Decomp/minecraftJar.jar")
      FileUtils.rm("minecraft_dobf.jar")
      Dir.chdir("Decomp")
      run_shell_command("unzip minecraftJar.jar",true)
      FileUtils.rm("minecraftJar.jar")
    end
    Dir.chdir("../../..")
    puts Dir.getwd
  end

  def Commands.launch
    run_shell_command(LAUNCH_COMMAND, true)
  end

  def Commands.patch
   run_shell_command("patch ",true)
  end

  def Commands.cleanup

  end

  def Commands.foo
    puts " Test"
  end
end