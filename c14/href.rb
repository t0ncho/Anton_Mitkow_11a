#Pегулярни изрази

value = File.read("/home/t0ncho/Desktop/Regular_expression.html")
result = value.scan(/<a href=\".*?\"/)
result.each do |r|
	puts r[9.. -2]  #maha <a href i slaga samo link
	puts "####################################" #razdelitel :D
end
