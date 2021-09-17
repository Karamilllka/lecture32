public class BmiService {
    public double calculate(int weight, double height) {
        double height2 = height * height;
        double bmi = weight / height2;
        return (bmi);
    }
}
