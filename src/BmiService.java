public class BmiService {
    public double calculate(int height, int weight) {
        double heightForIndex = (height / 100.0) * (height / 100.0);
        double index = Math.round(weight / heightForIndex);

        if (index < 16) {
            System.out.println("Результат: выраженный дефицит массы тела");
        } else if (index > 16 && index < 18.5) {
            System.out.println("Результат: недостаточная (дефицит) масса тела");
        } else if (index > 18.5 && index < 25) {
            System.out.println("Результат: норма");
        } else if (index > 25 && index < 30) {
            System.out.println("Результат: избыточная масса тела (предожирение)");
        } else if (index > 30 && index < 35) {
            System.out.println("Результат: ожирение первой степени");
        } else if (index > 35 && index < 40) {
            System.out.println("Результат: ожирение второй степени");
        } else if (index >= 40) {
            System.out.println("Результат: ожирение третьей степени (морбидное)");
        }
        return index;

    }
}
