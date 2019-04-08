import java.util.Scanner;

//-----Retorna as iniciais de um nome

public class string2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        String array[] = nome.toUpperCase().split(" ");
        String resp = "";
        for (String aux :   array){
            if (aux.length() == 1 && aux.charAt(0) == 'E')
            if(aux.charAt(0) == 'D'){
                if (aux.length() > 1 && aux.charAt(1) == 'A' | aux.charAt(1) == 'E' | aux.charAt(1) == 'I' | aux.charAt(1) == 'O' | aux.charAt(1) == 'U'){
                    if (aux.length() == 2) continue;
                    if (aux.length() == 3 && aux.charAt(2) == 'S') continue;
                }
            }
            resp += aux.charAt(0);
        }
        System.out.println(nome + " => " + resp);
    }
}
