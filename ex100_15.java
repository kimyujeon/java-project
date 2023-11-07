package java_ex100;
import java.util.Scanner;

public class ex100_15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 년도 입력 받기
        int year = scanner.nextInt();

        // 월 입력 받기
        int month = scanner.nextInt();

        // 일 입력 받기
        int day = scanner.nextInt();

        // 입력받은 년, 월, 일을 출력
        System.out.printf("%d.%02d.%02d", year, month, day);
    }
}