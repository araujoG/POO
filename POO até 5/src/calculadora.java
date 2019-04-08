import java.util.Scanner;

public class calculadora {
    public static int soma(int n1, int n2){
        n1 += n2;
        return n1;
    }
    public static int subtracao(int n1, int n2){
        n1 -= n2;
        return n1;
    }
    public static int multiplicacao(int n1, int n2){
        n1 *= n2;
        return n1;
    }
    public static int divisao(int n1, int n2){
        n1 = n1/n2;
        return n1;
    }
    public static int limpar(int n1){
        return 0;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int op, n1 = 0, n2 = 0;
        do {
            System.out.println("Digite a operação desejada:");
            op = teclado.nextInt();
            if (op == 6) break;
            if (op == 5) {
                n1 = limpar(n1);
                System.out.println("O valor em memória é "+n1);
                continue;
            }
            System.out.println("Digite o segundo número da operação: ");
            n2 = teclado.nextInt();
            switch (op){
                case 1 :
                    n1 = soma(n1,n2);
                    break;
                case 2 :
                    n1 = subtracao(n1,n2);
                    break;
                case 3 :
                    n1 = multiplicacao(n1,n2);
                    break;
                case 4 :
                    if (n2!=0) n1 = divisao(n1,n2);
                    else System.out.println("Não é possível dividir por 0...");
                    break;

            }

            System.out.println("O valor em memória é "+n1);
        }while(true);
    }

}
