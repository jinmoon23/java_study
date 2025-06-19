import java.util.Scanner;

public class ArraySplitParseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(", ");
        int v1 = Integer.parseInt(numbers[0]);
        int v2 = Integer.parseInt(numbers[1]);
        int v3 = Integer.parseInt(numbers[2]);

        System.out.println(v1 + v2 + v3);
    }
}
