import java.util.Scanner;
public class rightTriangleNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter row");
		int row = sc.nextInt();
		
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}

}