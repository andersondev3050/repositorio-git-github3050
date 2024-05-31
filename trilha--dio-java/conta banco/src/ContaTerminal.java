

public class ContaTerminal { 
     public static void main(String[] args) {
        //variáveis simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        //métodos
        if(valorSolicitado > saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
     }
}   

