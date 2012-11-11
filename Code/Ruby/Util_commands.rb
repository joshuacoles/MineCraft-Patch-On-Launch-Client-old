module Util_commands
  
  def Util_commands.run_shell_command(command, out)
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

  def Util_commands.decompiled?(jar,class_name)
    Zip::ZipFile.open(jar) {
        |jarfile|
      if jarfile.find_entry(class_name) == nil
        return true
      else
        return false
      end
    }
  end

  def Util_commands.debug()
    puts Dir.getwd()
  end
  #TODO Make time keeper method to check time taken by each process.

end