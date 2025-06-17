import java.util.Arrays;

public class EasyArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30}, {40,50,60}, {70,80,90}
        };
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(arr.length);
    }
}
