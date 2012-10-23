# Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
# 11 А клас
# Номер 2
# Антон Андреев Митков
#  Програма приемаща името на csv ,чете и записва в друг csv файл ш две колони разделени числата от първия файл на 2.

require 'csv'

input_file = ARGV[0]
puts input_file

output_file = "output" + input_file 

CSV.open(output_file, "w") do |csv|
	CSV.foreach(input_file) do |row|
	   csv << [row[0].to_i/2, row[1].to_i/2]
	end
end


