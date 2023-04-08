public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double result = service.calculate(height, weight);
        int index = (int) result;

        System.out.println("Для человека, ростом " + height + "м, и весом " + weight + "кг, индекс массы тела будет равен " + index);

    }
}