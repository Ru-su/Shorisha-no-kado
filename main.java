import java.util.*;

class Main {
	public static void main (String argn[]) {
		
		int card[] = new int[4];
		char c;
	
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			int x = 0;
			String n = cin.nextLine();
			for (int i = 0; i < n.length(); i++) {
				c = n.charAt(i);
				card[i] = Character.digit(c,10);
				if (card[i] == 0) x = 1;
			}
			
			if (x == 0) {
				int max = card[0];
				for (int i = 0; i < n.length(); i++) {
					if (card[i] > max) max = card[i];
				}
				System.out.println(max);
			} else {
				int min = 9;
				for (int i = 0; i < n.length(); i++) {
					if (card[i] < min && card[i] != 0) min = card[i];
				}
				System.out.println(min);
			}
		}
	}
}