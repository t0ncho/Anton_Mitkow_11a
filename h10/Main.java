package org.elsys.BallsAndBoxesAnton;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box box = new Box();
		Ball b1 = new Ball("green");
		Ball b2 = new Ball("purple on blue dots");
		Ball b3 = new Ball("Blue");
		Ball b4 = new Ball("Yellow");
		
		box.addBall(b1);
		box.addBall(b2);
		System.out.println(box.contains(b2));
		box.addBall(b3);
		box.addBall(b4);
		
		System.out.println(box.size());
		System.out.println(box.GetCapacity());
		System.out.println(box.size());
		box.print();
		box.clearBall(b3);
		box.print();
		box.clear();
		box.print();
		
		
		
	}

}
