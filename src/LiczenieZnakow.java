import java.util.Arrays;

public class LiczenieZnakow {
	public static String policz(String napis) {
		int dlugosc=napis.length();
		int[]tab=new int[dlugosc];
		int suma=0;
		char litera='A';
		for(int a=0;a<dlugosc;a++) 
		{
			for( int i=0;i<dlugosc;i++) 
			{		
				if(napis.charAt(i)==litera)
				{
					suma++;
				}
			}
			litera++;
			tab[a]=suma;	 
			suma=0;
		}
		return Arrays.toString(tab);

}
}