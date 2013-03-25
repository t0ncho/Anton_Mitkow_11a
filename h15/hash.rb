#Anton Mitkov 
#11a
#¹2
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

  #counts the number of times the argument is present as a sub-array
				  def subarray_count(subarray)
					each_cons(subarray.length).count(subarray)
				  end

  #counts how many times an element is present in an array
					  def occurences_count
						Hash.new(0).tap do |result|
						  each { |item| result[item] += 1 }
						end
					  end
end