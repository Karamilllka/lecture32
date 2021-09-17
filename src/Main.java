import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;
        double height = 1.6;
        double bmi = service.calculate(weight, height);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " м");
        System.out.println("Индекс массы тела: " + df.format(bmi));
    }
}
