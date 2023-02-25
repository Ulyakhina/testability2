public class BmiService {
    public int calculate(int weightKilogram, double heightMeter) {
        int result = (int) ((int) weightKilogram / (heightMeter * heightMeter));
        return result;
    }
}
