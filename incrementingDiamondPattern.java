import java.util.Scanner;
public class incrementingDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int no = sc.nextInt();
        int count = no-1;
        
        for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) 
				System.out.print(count);
			count++;
			System.out.println();
		}
        for (int i = no; i>=1 ; i--) {
        	count--;
			for (int j = 1; j <=i; j++) 
				System.out.print(count);
			System.out.println();
		}
     }
 }