import java.util.Scanner;

public class Calculadora {

    //Atributos
    private int memoria;
    private int op;
    private int n;

    //Métodos Especiais

    public Calculadora() {
        setMemoria(0);
        setOp(0);
        setN(0);
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //Métodos

    public void soma(){
        setMemoria(getMemoria() + getN());
    }

    public void subtracao(){
        setMemoria(getMemoria() - getN());
    }

    public void divisao(){
        if (getN() != 0) setMemoria(getMemoria() / getN());
        else System.out.println("Impossível dividir por 0");
    }

    public void multiplicacao(){
        setMemoria(getMemoria() * getN());
    }

    public void limparMemoria(){
        setMemoria(0);
    }

    public void operacao(){
        Scanner teclado = new Scanner(System.in);
        if (getOp()<5){
            System.out.println("Digite o número que será operado: ");
            setN(teclado.nextInt());
            switch (getOp()){
                case 1:
                    soma();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
            }
        } else if(getOp() == 5) limparMemoria();

    }

    public static void menu(){
        System.out.println("Opções:");
        System.out.println("");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Limpar memória");
        System.out.println("6. Sair do programa");
        System.out.println("");
        System.out.println("Qual opção você deseja? ");
    }

    public void status(){
        System.out.println("O estado da memória é: " + getMemoria());
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        do {
            calc.status();
            menu();
            calc.setOp(teclado.nextInt());
            calc.operacao();
        }while (calc.getOp() != 6);
    }

}


