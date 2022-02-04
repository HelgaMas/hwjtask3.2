public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = Math.round(service.calculate(165, 50));

        System.out.println("Индекс массы тела = " + index);
    }
}
