public class BmiService {

    public double calculate(double h, double w) {
        double index;
        index = w / (h * h);
        return index;
    }
}
