
require 'csv'

def process_file_with_csv
	sbor_pyth = 0
	sbor_perl = 0
	sbor = 0

	CSV.foreach("/home/t0ncho/csv_example.csv") do |row|
		
	       if row[6] == "Python"
		sbor_pyth = sbor_pyth + row[2].to_i
		end

	       if row[6] == "Perl"
		sbor_perl = sbor_perl + row[2].to_i
		end

	sbor = sbor_pyth + sbor_perl

	end	
	p sbor_pyth
	p sbor_perl
	p sbor
end


	process_file_with_csv
