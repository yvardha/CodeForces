package educationalcodeforces1;

import java.util.Scanner;

public class QueriesOnAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cases = sc.nextInt();
		String new_str;
		for(int i=0;i<cases;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			new_str = str.charAt(l)  +  str.substring(0,l-1) ;
		}
	}
}
