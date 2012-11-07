// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Програма за реализираща задачата с топките и кутията

package org.elsys.BallsAndBoxesAnton;

import java.util.LinkedList;

public class Box {
	char ball; 
	private int capacity = 10;
	private LinkedList<Ball> box = new LinkedList<Ball>();
	
//add ball	
	public void addBall (Ball ball){
		if(box.size() != capacity) {
			if(!box.contains(ball)){
				box.addLast(ball);
			} else {
				System.out.println("This ball is already in the box");
			}
		} else {
			System.out.println("The box is full");
		}
	}
	
//clear box
	public void clear(){
		box.clear();
	} 
	
//remove some ballfrom box
	public void clearBall(Ball ball){
		box.remove(ball);
	}
	
//get the capacity of the box	
	public int GetCapacity(){
		return capacity;
	}

//return the size
	public int size(){
		return capacity -  box.size();
	}
	
//return true is smth is in the box
	public boolean contains(Ball ball){
		return box.contains(ball);
	}
	
//printing the balls in the box
	public void print() {
		for(Ball p:box) {
			System.out.println(p.getColor());
		}
	}
}
