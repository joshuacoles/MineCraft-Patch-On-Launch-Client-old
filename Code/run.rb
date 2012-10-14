
#puts "importing stuff"
require "java"
#puts "done java"

require_relative "commands"
#puts "done commands"

#puts "done importing"

puts "Starting..."

def start()
  #Commands.foo
  Commands.de_compile
  #Commands.launch
end

start()
puts "Finished..."