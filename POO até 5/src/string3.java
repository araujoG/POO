import java.util.Scanner;

public class string3 {

    public static String[] recomb(String s1, String s2){
        String s3 = "";
        String s4 = "";
        String aux = "";
        if (s1.length() == s2.length()){
            int rand = (int)(Math.random() * s1.length());
            //System.out.println(rand);
            s3 = s1.substring(0,rand) + s2.substring(rand);
            s4 = s2.substring(0,rand) + s1.substring(rand);
        }else System.out.println("As strings não possuem o mesmo tamanho, impossível fazer a recombinação...");
        String[] resp = {s1, s2, s3, s4};
        return resp;
    }

    public static String mutacao(String s1){
        String bases = "ATGC";
        int rand = (int)(Math.random() * s1.length());
        int randb = (int)(Math.random() * 4);
        //System.out.println(rand);
        //System.out.println(bases.charAt(randb));
        s1 = s1.substring(0,rand) + bases.charAt(randb) + s1.substring(rand + 1);
        return s1;
    }

    public static void main(String args[]){
        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira os 2 indivíduos iniciais separados por enter");
            String[] individuos = {teclado.nextLine(), teclado.nextLine(), "", ""};
            if (individuos[0] == "x") {
                break;
            }
            individuos = recomb(individuos[0], individuos[1]);

            int rand = (int) (Math.random()*2) + 2;
            System.out.println(rand);
            individuos[rand] = mutacao(individuos[rand]);

            System.out.println("os 4 indivíduos são \nS1 => " + individuos[0] + "\nS2 => " + individuos[1] + "\nS3 => " + individuos[2] + "\nS4 => " + individuos[3]);
        }while (true);
    }
}
