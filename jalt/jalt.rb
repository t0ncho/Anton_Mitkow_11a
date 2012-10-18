require 'csv'
def process_file_with_csv


n = ARGV[0].to_i

i = 0;
count = 0;

arr1 = Hash.new(0)
arr2 = Hash.new(0) 

CSV.foreach("belt1_1.csv") do |row|
	count = row[0].to_i

	
		arr1[i] = Integer(row[1])
		arr2[i] = (i*n.to_i)/arr1[i]
		i = i + 1
	
end




CSV.open("belt1_2.csv", "w") do |row|
	for count in 0..50
		row << [count, arr1[count], arr2[count]]
		end
end

end

process_file_with_csv
