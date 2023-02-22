    public class BancoTerminal{

     public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 30.0;
        
        double novoSaldo = saldo - valorSolicitado;

        if(saldo > valorSolicitado)
        System.out.println("Seu saldo atual é de:" + novoSaldo);

       else
        System.out.println("Saldo insuficiente");
    }
}