package java_ex100;
import java.util.Scanner;

public class ex100_16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10진수 입력 받기
        int num = scanner.nextInt();

        // 입력받은 10진수를 8진수로 변환하여 출력
        System.out.printf("%o", num);
    }
}