public class Cuenta {
    String titular;
    double saldo;

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.titular = "Javier";
        c1.saldo = 200;

        Cuenta c2 = new Cuenta();
        c2.titular = "Luna";
        c2.saldo = 350;

        int meses1 = 0, meses2 = 0;

        while (c1.saldo < 500 || c2.saldo < 500) {
            if (c1.saldo < 500) {
                c1.saldo += 50;
                meses1++;
                System.out.println(c1.titular + " : " + c1.saldo);
            }
            if (c2.saldo < 500) {
                c2.saldo += 50;
                meses2++;
                System.out.println(c2.titular + " : " + c2.saldo);
            }
        }

        System.out.println("Meses de Javier: " + meses1);
        System.out.println("Meses de Luna: " + meses2);
    }
}
