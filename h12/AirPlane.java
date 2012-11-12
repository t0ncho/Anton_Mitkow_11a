package org.elsys.AirPlane;
import java.util.*;
public class AirPlane {
	
	public Human[][] seat = new Human[6][27];
	
			
public ArrayList<Human> Group(){
	ArrayList<Human> group = new ArrayList<Human>();
	int cnt = new Random().nextInt(3);
	for(int i=0; i<cnt; i++){
		Human h = new Human();
		group.add(h);
	}
	return group;
}
	
public void add(Human sex){
		Human h = new Human();
		int rvalue = new Random().nextInt(3) + 1;
		
		for(int a = 0; a < 6; a++){
			for(int b = 0; b < 27; b++){
				if(rvalue == 1){
					
					seat[a][b] = h;
					break;
				
				}else if(rvalue == 2){
	
					if((a != 5) && (a != 2) && (seat[a][b].isTaken == true) && (seat[a+1][b].isTaken == true)) {
						seat[a][b] = h;
						seat[a+1][b] = h;
						break;
			}
						
				}else if(rvalue == 3){
		
					if(((a == 0) || (a == 3)) && (seat[a][b].isTaken == true) && (seat[a+1][b].isTaken == true) && (seat[a+2][b].isTaken == true)){
						seat[a][b] = h;
						seat[a+1][b] = h;
						seat[a+2][b] = h;
						break;					

			}
		
	
				}
			}
		}
    }
   
public void remove(int[][] seat) {
   
       boolean check = false;
       
    		   for (int b=0; b<27; b++){
    			   for(int a=0; a<6; a++){
    				   
    					  seat[a][b]=0; 
    					check=true;   
    				   
    			   }
    			   if(check == false)
    				   System.out.println("nqma pytnici");
    		   }
    }
   
public void clear() {
	int[][] seat = new int[6][27];
    	for (int b=0; b<27; b++) {
    		for(int a=0; a<6; a++) {
    			seat[a][b]=0;	
    		}
    	}	
    }
   
public int getCapacity() {
	int seats=0;
	for(int b = 0; b < 27; b++){
		for(int a = 0; a < 6; a++){
			if(seat[a][b] == null){
					seats++;
				}
			}
		}
	   System.out.println("There are" + seats + "busy seats");
	   return seats;
    }
   
public int getMales() {
    	
        int male=0;
        for (int b=0; b<27; b++){
        	for(int a=0; a<6; a++){
        		if(seat[a][b].getGender() == "male"){
        			male++;
        		}
        	}
        }
        return male;
        
    }
   
 public int getFemales() {
    	int female=0;
        for (int b=0; b<27; b++){
        	for(int a=0; a<6; a++){
        		if(seat[a][b].getGender() == "female"){
        			female++;
        		}
        	}
        }
        return female;
    }
    
    
}



