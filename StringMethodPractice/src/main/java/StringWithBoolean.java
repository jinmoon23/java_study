public class StringWithBoolean {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";

        Boolean result = str1.substring(0,1) == str2;
        // 서로 다른 주소값이기 때문!
        // str1.substring 하게 되면 str1과 다른 메모리 주소에 값이 저장됨
        // 기본적으로 자바의 == 연산자는 값이 아닌 메모리 주소를 비교한다.
        System.out.println(result);
        // 문자열 자체를 비교하기 위해선 equals 메서드를 사용해야 한다.
        System.out.println(str1.substring(0,1).equals(str2));

    }
}
