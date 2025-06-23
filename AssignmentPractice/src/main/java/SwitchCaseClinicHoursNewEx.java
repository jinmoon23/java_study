import java.util.Scanner;

public class SwitchCaseClinicHoursNewEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type day of the week.(ex, wednesday)");
        String day = sc.next();
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30 ~ 17:30";
            case "토" -> "09:30 ~ 13:30";
            case "수","일" -> "break";
            default -> throw new IllegalArgumentException("잘못된 요일"+day);
        };
        System.out.println(time);
    }
}
