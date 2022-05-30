import java.util.Scanner;

public class Timestable {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >=2 && num <=9) {
			System.out.println(num+"단을 출력합니다");

			for(int i=1; i<10; i++) {
				int result = num*i;
				System.out.println(num + "*" + i + "=" + result);
			}
		}else {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
	}
}
