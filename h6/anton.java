// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Програма за обработка на аргументите от командния ред


 public class anton
{
	public static void main(String[] args){

		int count;

		if (args[args.length-1].equals("up")){

			for(count=0; count<args.length-1; count++){
				System.out.println(System.getProperty (args[count]));
			}
		}

		if(args[args.length-1].equals("down")){

			for(count=args.length-1; count!=0; count--){
				System.out.println(System.getProperty (args[count]));

			}
		}
	}




}
