import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("찾을 값을 입력하세요: ");
        int userInput = scanner.nextInt();
        boolean found = false;

        for (int number : numbers) {
            if (number == userInput) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("존재합니다");
        } else {
            System.out.println("존재하지 않습니다");
        }

        scanner.close();
    }
}