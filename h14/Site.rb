require 'net/http'
require 'open-uri'
require 'uri'
require 'csv'


class Site


 	def setURL
  
 	end
	
 	def getURL

 	return getURL
 	end

 	def getsite(link)
	i = 0
	CSV.open("sait.csv", "w") do |csv|
	file = open(link)
	source = file.read
	puts source
	source = source.split('<a href')
		  csv << [source]
		  csv << ['------------------------------------']
		  	for cnt in 0..source.length
			  if source[cnt].include? "http"
				csv << ['<' + source[cnt]]
				puts '<' + source[cnt]
				
				end
			end
	 end

		CSV.foreach("sait.csv") do |line|
		end


end

class Pages
	
end

class Links

end

end

var = Site.new
var.getsite(gets)

