class AdderGen
def initialize(n)
@block = lambda {|a| n + a}
end
def add(a)
@block.call a
end
end
twoAdder = AdderGen.new 2
incrementer = AdderGen.new 1
puts incrementer.add(4)
puts twoAdder.add(6)