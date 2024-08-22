import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int randInt = (int)(Math.random()*3);
			
			System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
			String user = sc.next();
			int userInt;
			
			switch(user) {
			case "바위":
				userInt = 2;
				break;
			case "가위":
				userInt = 1;
				break;
			case "보":
				userInt = 0;
				break;			
			default:
				System.out.println("입력이 올바르지 않습니다.");
				continue;
			}
			
			System.out.printf("사용자: %s%n",user);
			switch(randInt) {
			case 2:
				System.out.println("자바: 바위");
				break;
			case 1:
				System.out.println("자바: 가위");
				break;
			case 0:
				System.out.println("자바: 보");
				break;
			}
			
			
			int ans = Math.abs(userInt - randInt);
			switch(ans) {
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 1:
				if(userInt > randInt) {
					System.out.println("이겼습니다!!");
				}
				else {
					System.out.println("졌습니다.");
				}
				break;
			case 2:
				if(userInt == 0) {
					System.out.println("이겼습니다!!");
				}
				else {
					System.out.println("졌습니다.");
				}
				break;
			}
			
		}
		
	}
}
