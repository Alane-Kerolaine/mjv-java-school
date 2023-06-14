import model.ContaCorrente;

public class Terminal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println(conta1.getSaldo());
        conta1.sacar(100.00);
        System.out.println(conta1.getSaldo());
    }
}
