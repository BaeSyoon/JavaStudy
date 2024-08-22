import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		
		System.out.print("정수 열을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println();
		
		for(int k = 1; k <= 9; k += row) {
			for(int i = 1; i <= 9; i++) {
				for(int j = k; j < k + row; j++) {
					if(j<10) {
						System.out.printf("%d x %d = %d\t",j , i, j*i);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}


