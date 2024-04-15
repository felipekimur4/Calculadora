import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float n1;
        float n2;
        float total = 0;
        String operacao;
        boolean reiniciar;
        String verificaLoop;
        Scanner ler = new Scanner(System.in);


        do {
            reiniciar = true;
            System.out.print("Qual operação voce quer fazer? (Divisao, Multiplicacao, Somar, Diminuir) ");
            operacao = ler.next();
            System.out.print("Digite o número ");
            n1 = ler.nextFloat();
            System.out.print("Digite o segundo número: ");
            n2 = ler.nextFloat();

            if (operacao.equals("Divisao")) {
                if (n1 == 0 && n2 == 0) {
                    System.out.println("Não é possivel dividir 0 por ele mesmo.\n");
                } else {
                    total = n1 / n2;
                }
            } else if (operacao.equals("Multiplicacao")) {
                total = n1 * n2;

            } else if (operacao.equals("Somar")) {
                total = n1 + n2;

            } else if (operacao.equals("Diminuir\n")) {
                total = n1 - n2;

            } else {
                System.out.println("Operação inválida\n");
                System.out.println("Deseja fazer outro  calculo?(sim ou nao)");
            }
            System.out.printf("O seu total é %.2f\n", total);
            System.out.println("Deseja fazer outro  calculo?(sim ou nao)");
            verificaLoop = ler.next();
            if (verificaLoop.equals("sim")) {
                reiniciar = true;
            } else {
                reiniciar = false;

            }
        } while (reiniciar) ;
    }
}