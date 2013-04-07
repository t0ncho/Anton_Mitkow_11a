#Anton Mitkov 
#11a
#?2
# monkey patching

class Array

  #converts an array to a hash
		  def to_hash 
				{}.tap do |result|
				  each { |key, value| result[key] = value }
				end
		  end

  #indexes the array elemens by a block
		  def index_by
				map { |n| [yield(n), n] }.to_hash
		  end

	#counts the number of times the argument is present as a subarray as list in the array
			  def subarray_count(subarray)
					each_cons(subarray.length).count(subarray)
			  end
			  
	#counts how many times an element is present in an array
			  def occurences_count
						Hash.new(0).tap do |result|
						  each { |item| result[item] += 1 }
						end
				end
				
		# maps each element to the number of occurences in the original array	
		  def densities
			map { |n| count n }
		  end
	
end