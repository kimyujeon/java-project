package java_ex100;
import java.util.Scanner;

public class ex100_14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시간 입력 받기
        int hour = scanner.nextInt();

        // 분 입력 받기
        int minute = scanner.nextInt();

        // 입력받은 시간과 분을 출력
        System.out.printf("%d:%02d", hour, minute);
    }

}