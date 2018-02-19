# Shorisha-no-kado(Java)
//「0123456789」の10枚のカードの内、4枚のカードが提示されます。   通常は、「最も数値が大きなカード」が勝利者のカードです。  4枚の中に0があれば、「0以外で最も小さなカード」が勝利者のカードです。   勝利者のカードの数値を割り出してください。
// We have 4 cards from set {1, 2, 3, ..., 9}. Usually, highest card win. But if one of this 4 cards is "0", then lowest card win.

import java.util.*;

class Main {
	public static void main (String argn[]) {
		
		int card[] = new int[4];
		char c;
	
		Scanner cin= new Scanner(System.in);
		for(;cin.hasNext();){
			int x=0;
			String n=cin.nextLine();
			for (int i=0; i<n.length(); i++) {
				c=n.charAt(i);
				card[i]=Character.digit(c,10);
				if (card[i]==0) x=1;
			}
			
			if (x==0) {
				int max=card[0];
				for (int i=0; i<n.length(); i++) {
					if (card[i]>max) max=card[i];
				}
				System.out.println(max);
			} else {
				int min=9;
				for (int i=0; i<n.length(); i++) {
					if (card[i]<min && card[i]!=0) min=card[i];
				}
				System.out.println(min);
			}
		}
	}
}
