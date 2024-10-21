import java.util.Date;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nome;
    private double saldo;
    private Date dataCriacao = new Date();

    public ContaCorrente(int numeroConta, int numeroAgencia, String nome, double saldo, Date dataCriacao) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
    }

    public double verSaldo() {
        return this.saldo;
    }

    public void sacarValor(double saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositarValor(double saldo) {
        this.saldo += saldo;
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    
}
