import java.util.Random;
import java.util.Scanner;

public class Code02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"묵", "찌", "빠"};
		
		System.out.println("묵, 찌, 빠 중 하나를 선택하세요: ");
		String userChoice = scanner.next();
		String computerChoice = choices[random.nextInt(3)];
		
		System.out.println("사용자의 선택: " + userChoice);
		System.out.println("컴퓨터의 선택: " + computerChoice);
		
		if ((userChoice.equals("묵") && computerChoice.equals("찌")) ||
				(userChoice.equals("찌") && computerChoice.equals("빠")) ||
				(userChoice.equals("빠") && computerChoice.equals("묵"))) {
			System.out.println("사용자가 이겼습니다!");
		} else if ((userChoice.equals("묵") && computerChoice.equals("빠")) ||
				(userChoice.equals("찌") && computerChoice.equals("묵")) ||
				(userChoice.equals("빠") && computerChoice.equals("찌"))) {
			System.out.println("사용자가 졌습니다!");
		} else {
			System.out.println("비겼습니다!");
		}
		
		scanner.close();
	}
}