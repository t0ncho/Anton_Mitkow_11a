package elsys;

public class Vehicle implements Load{
	int x;
	int y;
	int ID;
	int rload;
	Vehicle(int ID_,int x_,int y_){
		x=x_;
		y=y_;
		ID=ID_;
		rload=0;		
	}
	void move(int x_,int y_){
		x=x_;
		y=y_;
	}
	public void load(int l){
		rload=l;
	}
	
	public int getLoad(){
		return rload;
	}
}
