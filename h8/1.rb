# Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
# 11 А клас
# Номер 2
# Антон Андреев Митков
# Най-популярен ученик в клас (Само "а" и "б" подточка)


require 'csv'

def process_file_with_csv
	
	array = Array.new 30,0
	i = 1
	j = 1
	max = 0
	min = 0
	h = 0
	file = Dir.glob("*.csv")
	file.each do |file|
	CSV.foreach(file) do |row|
			
		for i in 1..30 
				if i == row[1].to_i
       					array[i] = array[i] + 1
					
								
				   end
			end
		end
	end
	
		max = array.max
		min = array.min		
		
		
		 	
		for j in 1..30
			print"#{array[j] } "		
		
	end
	puts
	print "nai-svyrzaniqt e:"
	p max
	print "nai-malko svyrzaniqt e:"
	p min	
	
	
end
 	process_file_with_csv
