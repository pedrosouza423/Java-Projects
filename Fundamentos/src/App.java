import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar atributos para a conta
        int numeroConta = 12345;
        int numeroAgencia = 54321;
        String nome = "Fulano";
        double saldo = 1000.0;
        Date dataCriacao = new Date();

        // instanciar uma conta corrente
        ContaCorrente conta = new ContaCorrente(numeroConta, numeroAgencia, nome, saldo, dataCriacao);
        System.out.println(conta.verSaldo());
    }
}
