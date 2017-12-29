import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WczytajPlik {

	public static void main(String[] args)  {
		File plik=new File("lancuchy_bialkowe.txt");
		try(Scanner in=new Scanner(plik)){
		//in.useDelimiter("[^\\p{L}]+");
			while(in.hasNext()==true) {
			String aminokwas1=in.next();
			String aminokwas2=in.next();
			boolean zgodność = Zgodnosc.sprawdzenie(aminokwas1, aminokwas2);
			System.out.println(zgodność);
		}	
		in.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}		
}


	

