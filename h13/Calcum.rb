# Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
# 11 А клас
# Номер 2
# Антон Андреев Митков
# Програма - калкулатор за смятане на числа написани в обратен полски запис.

def Function()

args = gets.chomp.split(" ")


for i in 0 ..(args.length-1)

  if args[i] == "+" then
	args[i-2] = args[i-1].to_f + args[i-2].to_f
  end
  if args[i] == "-" then
  	args[i-2] = args[i-2].to_f - args[i-1].to_f
  end
  if args[i] == "*" then
	args[i-2] = args[i-1].to_f * args[i-2].to_f
  end
  if args[i] == "/" then
	args[i-2].to_f = args[i-2].to_f / args[i-1].to_f
  end 

end

puts args[i-2]
end

Function()



