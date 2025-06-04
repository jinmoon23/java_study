import java.util.Scanner;

public class ScannerEx {
    public void readTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);

        String result = sc.next() + sc.next();

        System.out.println(result);
    }
}
