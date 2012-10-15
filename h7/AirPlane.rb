# Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
# 11 А клас
# Номер 2
# Антон Андреев Митков
# Програма за автоматична подредба на местата в самолет 
 class AirPlane
	@@seats = Hash.new(0)
	
	def printSeats(@@seat[][])
		for a in (0..26)
			for b in (0..5)
				print @@seat[b][a] ""
				if(b == 2)
					print "     "	
				end
			    end
			   print ""
			end
		    print "---------------"
	end	
	
	def rvalue()
		val = 0
		val = rand(3) + 1
		
		return val
	end

	def add(rvalue, @@seat[][])
		for a in (0..5)
			for b in (0..26)
			   if(rvalue == 1)
				@@seat[a][b] = 1	
				break

			   else if(rvalue == 2)
					if((a != 5) && (a != 2) && (@@seat[a][b] == 0) && (@@seat[a+1][b] == 0))
						@@seat[a][b] = @@seat[a+1][b] = 2
						break

			   else if(rvalue == 3)
					if(((a == 0) || (a == 3)) && (@@seat[a][b] == 0) && (@@seat[a+1][b] == 0) && (@@seat[a+2][b] == 0))
						@@seat[a][b] = @@seat[a+1][b] = @@seat[a+2][b] = 3
						break
				end
			end
	end					

	def numPpl(@@seat[][])
		count = 0
		  for a in (0..5)
                        for b in (0..26)
				if(@@seat[b][a] != 0)
					count++
				end
			end
		  end
	    return count
	end

	def isFull(@@seat[][])
		!!total == total
			if(@@seat[5][26] != 0)
				!!total == total
			else
				!!total != total
			end
		return total;
	end
	
	def inPlane(seat[][],AirPlane plane)
		while(!plane.isFull(@@seat))
			plane.printSeats(@@seat)
			plane.add(rvalue(),@@seat)
		end
	end
	
	plane = AirPlane.new
	plane.inPlane(seat,plane)
	
	
