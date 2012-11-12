package org.elsys.AirPlane;
import java.util.*;
public class Human {

	String[] sexList = {"male","female"}; 
	String[] nameList = {"Anton","Victorya","Gogo","Mimi","Nikolay","Desislava"};   
    
	 public boolean isTaken;
	 int random = new Random().nextInt(6);
	 int gender;
	{
		
		if(random % 2 ==0 ){
			gender=0;
		}else{
			gender=1;
		}
	}
	
	public String sex = sexList[gender];
	public String name = nameList[random];
	
	public Human(){
		isTaken=false;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getGender(){
		return sex;
	}
	public void setGender(String sex){
		this.sex = sex;
	}

}