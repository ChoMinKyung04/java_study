import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요:");
        int playerChoice = scanner.nextInt();
        
        while (playerChoice < 1 || playerChoice > 3) {
            System.out.println("잘못된 선택입니다. 다시 선택하세요:");
            playerChoice = scanner.nextInt();
        }
        
        int computerChoice = random.nextInt(3) + 1;
        
        String[] choices = {"가위", "바위", "보"};
        
        System.out.println("플레이어 선택: " + choices[playerChoice - 1]);
        System.out.println("컴퓨터 선택: " + choices[computerChoice - 1]);
        
        if (playerChoice == computerChoice) {
            System.out.println("무승부입니다.");
        } else if ((playerChoice == 1 && computerChoice == 3) || 
                   (playerChoice == 2 && computerChoice == 1) || 
                   (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("플레이어 승리!");
        } else {
            System.out.println("컴퓨터 승리!");
        }
    }
}
