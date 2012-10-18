require "java"

require 'open3'

require  "/Users/joshuac/RubymineProjects/Patch on Launch/Code/retroguard.jar"

require 'fileutils'

module Commands
  #puts "Starting"

  LAUNCH_COMMAND = '/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -Xms512M -Xmx1024M -Xincgc -cp "/Applications/Minecraft.app/Contents/Resources/Java/MinecraftLauncher.jar" net.minecraft.LauncherFrame'

  def Commands.run_shell_command(command)
    output = ""
    errors = ""
    puts "Running Command [#{command}]"
    Open3.popen3(command) do |stdin, stdout, stderr|
      output = stdout.read
      errors = stderr.read
    end
    puts "  Output [#{output}]"
    puts "  Errors [#{errors}]"
  end

  def Commands.de_compile
    Dir.chdir("../../../Users/joshuac/RubymineProjects/Patch on Launch/Code/vanilla")
    puts Dir.getwd
    #TODO Fix bug/crash later but HomeWork now.
    FileUtils.cp("minecraft.jar", '../Work/RG/minecraft_Run.jar')
    #run_shell_command("ls")
    #run_shell_command ("java RetroGuard minecraft_Run.jar minecraft_dobf.jar")

  end

  def Commands.launch
    run_shell_command(LAUNCH_COMMAND)
  end

  # Old stuff

  def Commands.prep
    Dir.chdir("vinilla")
    run_shell_command("cp minecraft.jar ../Code/mcp/jars")
    Dir.chdir("../")
  end

  def Commands.patch
    Dir.chdir("../patches")
    run_shell_command("patch */*")
    Dir.chdir("../Code")
  end

  def Commands.install
    Dir.chdir("mcp")
    Dir.chdir("forge")
    run_shell_command("./install.sh")
    Dir.chdir("../..")
  end

  def Commands.remake
    Dir.chdir("mcp")
    run_shell_command("./recompile.sh")
    run_shell_command("./reobfuscate.sh")
    Dir.chdir("../")
  end

  def Commands.foo
    puts " Test"
  end
end