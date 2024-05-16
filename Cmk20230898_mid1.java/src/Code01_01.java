import java.util.Random;
import java.util.Scanner;

public class Code01_01{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"가위", "바위", "보"};
		
		System.out.println("가위, 바위, 보 중 하나를 선택하세요: ");
		String userChoice = scanner.next();
		String computerChoice = choices[random.nextInt(3)];
		
		System.out.println("사용자의 선택: " + userChoice);
		System.out.println("컴퓨터의 선택: " + computerChoice);
		
		if (userChoice.equals(computerChoice)) {
			System.out.println("비겼습니다!");
		} else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
				(userChoice.equals("바위") && computerChoice.equals("가위")) ||
				(userChoice.equals("보") && computerChoice.equals("바위"))) {
			System.out.println("사용자가 이겼습니다!");
		} else {
			System.out.println("컴퓨터가 이겼습니다!");
		}
		
		scanner.close();
		
		}
	}