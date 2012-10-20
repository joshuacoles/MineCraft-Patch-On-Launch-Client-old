require "java"

require 'open3'

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
    #run_shell_command("ls",true)
    retroguard(false)
    fernflower(false)
  end

  def Commands.retroguard(run)
    #puts Dir.getwd
    FileUtils.cp("vanilla/minecraft.jar", 'Work/RG/minecraft_Run.jar')
    Dir.chdir("Work/RG/retroguard")
    if run
      run_shell_command("java RetroGuard ../minecraft_Run.jar ../minecraft_dobf.jar", false)
    end
    Dir.chdir("../../..")
    puts Dir.getwd
  end

  def Commands.fernflower(run)
    FileUtils.cp("Work/RG/minecraft_dobf.jar","Work/FF/")
    Dir.chdir("Work/FF/fernflower")
    if run
      run_shell_command("java -jar minecraft_dobf.jar minecraft_RG_FF",false)
    end
    Dir.chdir("../../..")
    puts Dir.getwd
  end

  def Commands.launch
    run_shell_command(LAUNCH_COMMAND, true)
  end

  def Commands.cleanup

  end






  # Old stuff

  def Commands.prep
    Dir.chdir("vinilla")
    run_shell_command("cp minecraft.jar ../Code/mcp/jars",false)
    Dir.chdir("../")
  end

  def Commands.patch
    Dir.chdir("../patches")
    run_shell_command("patch */*",false)
    Dir.chdir("../Code")
  end

  def Commands.install
    Dir.chdir("mcp")
    Dir.chdir("forge")
    run_shell_command("./install.sh",true)
    Dir.chdir("../..")
  end

  def Commands.remake
    Dir.chdir("mcp")
    run_shell_command("./recompile.sh",true)
    run_shell_command("./reobfuscate.sh",true)
    Dir.chdir("../")
  end

  def Commands.foo
    puts " Test"
  end
end