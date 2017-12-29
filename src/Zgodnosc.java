
public class Zgodnosc {
	public static boolean sprawdzenie(String a1,String a2 ) {
		
			String am1=LiczenieZnakow.policz(a1);
			String am2=LiczenieZnakow.policz(a2);
			
			if(am1.equals(am2)) {
				return true;
			}else
				return false;
		}
	}


