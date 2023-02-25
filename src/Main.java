public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.72;
        int weightKilogram = 62;
        int index = service.calculate(weightKilogram, heightMeter);
        System.out.println(index);
    }
}