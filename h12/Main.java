package org.elsys.AirPlane;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int random = new Random().nextInt(6);
		AirPlane Plane = new AirPlane();
		Human[] people = new Human[random];
		
		Plane.add(people[random]);
		System.out.println(Plane.getCapacity());
		System.out.println(Plane.getFemales());	
		System.out.println(Plane.getMales());

		Plane.clear();
	}

}
