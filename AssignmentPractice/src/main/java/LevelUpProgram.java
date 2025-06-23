import java.util.Scanner;

public class LevelUpProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsOfExp = sc.nextInt();
        int numOfProj = sc.nextInt();

        if (yearsOfExp > 5 || numOfProj > 10) {
            System.out.println("Level up!");
        } else {
            System.out.println("Not yet -_-;");
        }
    }
}
