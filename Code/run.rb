require "java"
require_relative "commands"
puts "Starting..."

def start()
  #Commands.foo
  Commands.de_compile
  #Commands.launch
end

start()
puts "Finished..."