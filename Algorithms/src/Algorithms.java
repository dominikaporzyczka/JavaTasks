
public class Algorithms {
	
	public int NWD (int a, int b) {
		
		while (a!=b) {
			if (a>b) {
				a -= b;
			}
			else
				b -= a;
		}
		return a;
	}
	
	public int NWW (int a, int b) {
		
		return (a*b)/NWD(a, b);
	}
	
	public int minElement (int [] tab) {
		
		int result = tab[0];
		
		for (int i = 0; i < tab.length; i++) {
			if (result > tab[i]) {
				result = tab[i];
			}
		}
		return result;
	}
	
	public int searchNumber (int [] tab, int a) {
		
		int result = -1;
		
		 for(int i = 0; i < tab.length && result == -1; i++) {
			 if (tab[i] == a) {
				 result = i;
			 }
		 }
		 return result;
	}
}
