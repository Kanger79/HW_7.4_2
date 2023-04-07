public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87;
        double w = 98;
        double i = service.calculate(h, w);
        int index = (int)i ;

        System.out.println("Для человека, ростом " + h + "м, и весом " + w + "кг, индекс массы тела будет равен " + index);

    }
}