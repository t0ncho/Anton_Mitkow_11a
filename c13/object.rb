class Objects
 attr_accessor :var #promenliva

 def var=(v)
 @var = v
 end

 def var
  @var ||= "akjsd"
 end
 
=begin
 def method
	puts"Smth in method"
  end

 private
 def method_private
	puts "Private!"
 end
 def method_private2

 end

 public
 def method_public
 
 end
=end

end

o = Objects.new
#o.send :method_private
p o.var
o.var = 10
p o.var

