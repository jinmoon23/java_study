public class InterestExample {
    public static void main(String[] args) {
        int principle = 10_000;
        principle *= 1.04;
        principle *= 1.04;
        principle *= 1.04;
        System.out.printf("3년 후 원리금: %d", principle);
    }
}
