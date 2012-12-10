package elsys;

import java.util.ArrayList;

public class Mainx {
	void print(ArrayList<Vehicle> ve){
		for(int i=0;i<ve.size();i++){
			Vehicle V=ve.get(i);
			System.out.println(V.ID+" "+V.x+" "+V.y+" "+V.rload);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> veh=new ArrayList<Vehicle>();
		System.out.println("here"+ args.length);	
		for(int i=0;i<5;i++){
			veh.add(new Car(i,0,0));
		}
		for(int i=6;i<10;i++){
			veh.add(new Truck(i,0,0));
		}
		int i=0;
		System.out.println(args[i]);
		while(i<args.length){
			if(args[i].equals("move")){
				System.out.println("move");
				Vehicle h=veh.get(Integer.parseInt(args[i+1]));
				h.move(Integer.parseInt(args[i+2]),Integer.parseInt(args[i+3]));
				i+=4;
			}
			else if(args[i].equals("print")){
				Mainx x=new Mainx();
				x.print(veh);
				i+=1;
			}
			else if(args[i].equals("load")){
				Load l=veh.get(Integer.parseInt(args[i+1]));
				l.load(Integer.parseInt(args[i+2]));
				i=i+3;
			}
		}
	}

}
