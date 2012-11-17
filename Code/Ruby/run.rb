require "java"
require_relative "commands"
puts "Starting..."

def start()
  #Dir.chdir("../../../Users/joshuac/git/checkouts/Minecraft-Patch-on-Launch/Code/Ruby")
  Basic_Commands.debug
  #Commands.foo
  Commands.de_compile
  #Commands.launch
end

start()
puts "Finished..."