require 'csv'

def process_file_with_csv
	zad = 0
	CSV.foreach("/home/t0ncho/csv_example.csv") do |row|
		zad = zad + row[6].to_i
	end
	p zad
end
 	process_file_with_csv
