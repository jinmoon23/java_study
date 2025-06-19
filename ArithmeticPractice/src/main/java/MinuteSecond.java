import java.util.Scanner;

public class MinuteSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        int minute = second / 60;
        int remainSecond = second % 60;

        System.out.printf("minute: %d remainSecond: %d", minute, remainSecond);
    }
}
