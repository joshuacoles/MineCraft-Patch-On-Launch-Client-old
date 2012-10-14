puts "importing stuff"
require "java"
puts "done java"
require_relative "retroguard.jar"
puts "done retroguard.jar"
require_relative "commands"
puts "done commands"

puts "done importing"

puts "Starting..."

 def main
  #Commands.foo
  Commands.de_compile
  #Commands.run
 end

puts "Finished..."