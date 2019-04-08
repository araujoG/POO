import com.sun.nio.sctp.PeerAddressChangeNotification;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class array1 {
    public static class Pessoa implements Comparable<Pessoa>{
        //Naturalmente ordenado por idade
        String nome;
        int idade;

        private Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        private String getNome() {
            return this.nome;
        }

        private int getIdade() {
            return this.idade;
        }

        public int compareTo(Pessoa outraPessoa){
            if(this.idade < outraPessoa.getIdade()){
                return -1;
            }
            else if(this.idade > outraPessoa.getIdade()){
                return 1;
            }
            return  0;
        }
    }

    static class PessoasNomeComparator implements Comparator <Pessoa>{
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.getNome().compareTo(p2.getNome());
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int len = 3;

        Pessoa[] lista = new Pessoa[len];

        String nome;
        int idade;

        for (int i = 0; i<len; i++){
            System.out.println("Digite o nome da pessoa "+(i+1)+":");
            nome = teclado.next();
            System.out.println("Digite a idade da pessoa "+(i+1)+":");
            idade = teclado.nextInt();
            lista[i] = new Pessoa(nome,idade);
        }

        System.out.println("Lista de pessoas em ordem crescente de idade:");
        Arrays.sort(lista);
        for (int i = 0; i<len ; i++){
            System.out.println(lista[i].getNome() + " " + lista[i].getIdade());
        }

        System.out.println("Lista de pessoas em ordem alfabética:");
        Arrays.sort(lista,new PessoasNomeComparator());
        for (int i = 0; i<len ; i++){
            System.out.println(lista[i].getNome() + " " + lista[i].getIdade());
        }
    }
}
