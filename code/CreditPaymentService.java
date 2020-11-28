public class CreditPaymentService {
    public double calculate (double sum, double month, double rate) {

        double i= rate / month / 100;
        double k = (i * Math.pow((1 + i),month) / Math.pow((1 + i),month) - 1);
        double A = k * sum;
        return A;




    }
}
