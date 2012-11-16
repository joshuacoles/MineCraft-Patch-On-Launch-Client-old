require "java"

require 'open3'
require 'zip/zip'
require 'fileutils'

module Commands
  LAUNCH_COMMAND = '/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -Xms512M -Xmx1024M -Xincgc -cp "/Applications/Minecraft.app/Contents/Resources/Java/MinecraftLauncher.jar" net.minecraft.LauncherFrame'

  def Commands.de_compile
    Dir.chdir("../../../Users/joshuac/RubymineProjects/Patch on Launch/Code/")
    Main_Processes.retroguard()
    Main_Processes.fernflower()
    install()
  end

  def Commands.install
    Main_Processes.patch(false)
    remake()
  end

  def Commands.remake
    Main_Processes.compile()
  end

  def Commands.launch
    Basic_Commands.run_shell_command(LAUNCH_COMMAND, true)
  end

  def Commands.foo
    puts " Test"
  end
end

module Main_Processes 

  def Main_Processes.retroguard(run = true)
    #TODO Make more efficient
    FileUtils.cp("vanilla/minecraft.jar", 'Work/RG/minecraft_Run.jar')
    if run && !Basic_Commands.decompiled?("Work/RG/minecraft_Run.jar","a.class")
      puts "Test"
      Dir.chdir("Work/RG")
      #puts "Running Retroguard in directory #{Dir.getwd()}"
      Basic_Commands.run_shell_command("java -jar retroguard.jar minecraft_Run.jar minecraft_dobf.jar", false)
      #puts "Retroguard might have finished"
      FileUtils.rm("minecraft_Run.jar")
      Dir.chdir("../../")
    end
  end
  
  def Main_Processes.unzip
    puts("Unzipping")
    Dir.chdir("Decomp")
    Basic_Commands.run_shell_command("unzip minecraftJar.jar", false)
    FileUtils.rm("minecraftJar.jar")
    Dir.chdir("..")
  end



  def Main_Processes.compile()
    Dir.chdir("Work/FF/")
    puts `pwd`
    puts `ls `
    #puts "DECOMP DIR [#{Dir.entries("Decomp/")}]"
    Basic_Commands.run_shell_command("javac -sourcepath Decomp/*.java ", true)
  end
  
  def Main_Processes.patch(run)
    if run
      #puts Dir.getwd()
      Dir.chdir("Work/FF/Decomp")
      Basic_Commands.run_shell_command("patch ../../../../Patches/* ", true)
    end
  end
  
  def Main_Processes.fernflower(run = true)
    #TODO Make more efficient
    FileUtils.mv("Work/RG/minecraft_dobf.jar", "Work/FF/")
    Dir.chdir("Work/FF")
    puts "About to try and run Fern Flower in #{Dir.getwd}"
    puts !Basic_Commands.decompiled?("minecraft_dobf.jar","a.class")
    if run && Basic_Commands.decompiled?("minecraft_dobf.jar","a.class")
      puts "  Fern Flower Running"
      Basic_Commands.run_shell_command("java -jar fernflower.jar minecraft_dobf.jar Decomp", false)
      puts "  Fern Flower Run, contents of Directory is #{Dir.entries(Dir.getwd).inspect}"
      File.rename("Decomp/minecraft_dobf.jar", "Decomp/minecraftJar.jar")
      FileUtils.rm("minecraft_dobf.jar")
    else
      File.rename("minecraft_dobf.jar","minecraftJar.jar")
      FileUtils.mv("minecraftJar.jar","Decomp/")
      #FileUtils.rm("minecraft_dobf.jar")
    end
    puts " T1 #{Dir.entries("Decomp").include?("minecraftJar.jar")}"
    if Dir.entries("Decomp").include?("minecraftJar.jar")
      unzip()
    end
    Dir.chdir("../../")
  end
end

module Basic_Commands
  
  def Basic_Commands.run_shell_command(command, out)
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

  def Basic_Commands.decompiled?(jar,class_name)
    Zip::ZipFile.open(jar) {
        |jarfile|
      if jarfile.find_entry(class_name) == nil
        return true
      else
        return false
      end
    }
  end

  def Basic_Commands.debug()
    puts Dir.getwd()
  end
  #TODO Make time keeper method to check time taken by each process. 
end