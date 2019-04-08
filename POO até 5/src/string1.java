import java.util.Scanner;

public class string1 {
    public static int nvogais(String str){
        int n = 0;
        String vogais = "aeiou";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j<5 ; j++) {
                if (str.charAt(i) == vogais.charAt(j))
                    n++;
            }
        }
        return n;
    }

    public static String substrinicio (String str){
        if(str.substring(0,3).compareToIgnoreCase("UNI") != 0) {
            return " não ";
        }
        return " ";
    }

    public static String substrfim (String str){
        if(str.substring(str.length()-3).compareToIgnoreCase("RIO") != 0) {
            return " não ";
        }
        return " ";
    }

    public static int ndigitos(String str){
        int n = 0;
        String num = "0123456789";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j<10 ; j++) {
                if (str.charAt(i) == num.charAt(j))
                    n++;
            }
        }
        return n;
    }

    public static String palindromo(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return " não é ";
        }
        return " é ";
    }

    public static void main(String[] args) {
        String str;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite uma string: ");
            str = teclado.nextLine();
            System.out.println("O tamanho da string é " + str.length());
            System.out.println("A string em maiúsculo é " + str.toUpperCase());
            System.out.println("O número de vogais da String é " + nvogais(str));
            System.out.println("A String digitada" + substrinicio(str) + "começa com 'UNI'");
            System.out.println("A String digitada" + substrfim(str) + "termina com 'RIO'");
            System.out.println("O número de dígitos na String é " + ndigitos(str));
            System.out.println("A String digitada" + palindromo(str) + "um palíndromo");
        } while (str != "00");
    }
}
