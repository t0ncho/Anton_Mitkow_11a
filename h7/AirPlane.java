// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Програма за автоматична подредба на местата в самолет 

import java.util.*; 

public class AirPlane{

	public void printSeats(int[][] seat){
		//print seats
                for(int a=0; a<=26; a++){
                for(int b=0; b<6; b++){
                        System.out.print(seat[b][a]+"");
                        if(b == 2) System.out.print("    ");
				
                                        }
                        System.out.println(" ");
		}
			System.out.println("-----------------------------------");
	}


	public int rvalue(){
		int val;
		val = new Random().nextInt(3) + 1;
			
		return val;
	}


	public void add(int rvalue, int[][] seat){

		for(int a = 0; a < 6; a++){
					for(int b = 0; b < 27; b++){
						if(rvalue == 1){
			
							seat[a][b] = 1;
							break;
						
						}else if(rvalue == 2){
			
							if((a != 5) && (a != 2) && (seat[a][b] == 0) && (seat[a+1][b] == 0)) {
								seat[a][b] = seat[a+1][b]=2;
								break;
					}
								
						}else if(rvalue == 3){
				
							if(((a == 0) || (a == 3)) && (seat[a][b] == 0) && (seat[a+1][b] == 0) && (seat[a+2][b] == 0)){
								seat[a][b] = seat[a+1][b] = seat[a+2][b] = 3;	
								break;						

					}
				
			
		}
	    }
	}	
}
	public int numPpl(int[][] seat){
		int count = 0;
		 for(int a = 0; a < 27; a++){
			for(int b = 0; b < 6; b++){
		    		if(seat[b][a] != 0){
					count++;
					}
		     }
		   }	
			System.out.println("broq patnici e" + count);
			return count;
		}
		
	public boolean isFull(int[][] seat){
		boolean total=false;
		if(seat[5][26] != 0){
			total=true;
		}else{
			total=false;
			}
		return total;
	}

	public void inPlane(int[][] seat,AirPlane plane){
		while(!plane.isFull(seat)){
			plane.printSeats(seat);
			plane.add(rvalue(),seat);
				
		}
		}	

	public static void main(String[] args){
		int[][] seat = new int[6][27];
		AirPlane plane = new AirPlane();
		

			plane.inPlane(seat,plane);
			
		
	}



}

