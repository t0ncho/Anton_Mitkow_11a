// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Програма приемаща името на файл от аргументния ред , след което сумира и извевда сумата

import java.io.*;

public class ExamCsv {
	public static void main(String[] args){
		String fileName = null;
		if (args.length > 0){
			fileName = args[0];
		}else{
			System.out.println("No file name!");		
		}	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		int summ = 0;
		while ((line = reader.readLine()) != null) {
			summ += Integer.parseInt(line.split(",")[1]);
			}
			System.out.println(summ);
		} catch (Exception e){

		}
	}
}
