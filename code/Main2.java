public class Main2 {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double A = service.calculate(100000, 12,9.99);
        System.out.println(A);

    }
}
