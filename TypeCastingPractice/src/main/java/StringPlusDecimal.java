public class StringPlusDecimal {
    public static void main(String[] args) {
        String value1 = "1.5123123123123213213";
        String value2 = "2.512313221312312312312";
        double result = Double.parseDouble(value1) + Double.parseDouble(value2);

        System.out.println(result);
    }
}
