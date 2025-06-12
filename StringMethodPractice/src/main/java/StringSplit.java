import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        System.out.println(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
