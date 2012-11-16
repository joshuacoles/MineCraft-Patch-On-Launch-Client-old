require "java"
require_relative "commands"
puts "Starting..."

def start()
  Dir.chdir("../../../Users/joshuac/git/checkouts/Minecraft-Patch-on-Launch/Code/")
  #Commands.foo
  Commands.de_compile
  #Commands.launch
end

start()
puts "Finished..."