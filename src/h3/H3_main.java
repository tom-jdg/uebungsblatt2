package h3;

public class H3_main {
	public static void main(String[] args) {
		int i=2, j=3, k=3;
		k=-10;
		if (i>j) { // Ausdruck 1 true
			if (i>200) { // Ausdruck 2 true
				if (j>100) { // Ausdruck 3 true
					k=3;
				} else { // Ausdruck 3 false
					k=2;
				}
				
			} else { // Ausdruck 2 false
				if (j>100) { // Ausdruck 3 true
								
								
				} else { //Ausdruck 3 false
					k=1;
				}
				
			}
			
		} else { // Ausdruck 1 false
			if (i>200) { // Ausdruck 2 true
				
			} else { // Ausdruck 2 false
				if (j>100) { // Ausdruck 3 true
					
				} else { // Ausdruck 3 false
					k=4;
				}
			}
		}
		// System.out.println(k);
	}
}
