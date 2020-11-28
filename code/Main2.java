public class Main2 {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double A = service.calculate(1000000, 12,9.99);
        System.out.println(A);
        double A1 = service.calculate(1000000,24, 9.99);
        System.out.println(A1);
        double A2 = service.calculate(1000000,36,9.99);
        System.out.println(A2);


    }
}
