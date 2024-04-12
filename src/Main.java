import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float n1;
        float n2;
        String operacao;

        Scanner ler = new Scanner(System.in);

        System.out.print("Qual operação voce quer fazer? (Divisao, Multiplicacao, Somar, Diminuir) ");
        operacao = ler.next();
        System.out.print("Digite o número ");
        n1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = ler.nextFloat();


        float total;

        if (operacao.equals("Divisao")){
            total = n1 / n2;
            System.out.printf("O seu total é %.2f", total);
        } else if (operacao.equals("Multiplicacao")){
            total = n1 * n2;
            System.out.printf("O seu total é %.2f", total);
        } else if (operacao.equals("Somar")){
            total = n1 + n2;
            System.out.printf("O seu total é %.2f", total);
        } else if (operacao.equals("Diminuir")){
            total = n1 - n2;
            System.out.printf("O seu total é %.2f", total);
        } else{
            System.out.println("Operação inválida");
        }



    }
}