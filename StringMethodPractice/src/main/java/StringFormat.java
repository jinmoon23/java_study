public class StringFormat {
    public static void main(String[] args) {
        String name = "jinmun";
        int balance = 10000;

        String resultMessage = String.format("%s 님의 통장 잔고는 %d원입니다.", name, balance);

        System.out.println(resultMessage);
    }
}
