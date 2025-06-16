import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[3];
        iArr[0] = 1;
        iArr[1] = 3;
        iArr[2] = 7;

        int[] iArr2 = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(iArr));
        System.out.printf("[%d, %d, %d, %d]",iArr2[0],iArr2[1],iArr2[2],iArr2[3]);
    }
}
