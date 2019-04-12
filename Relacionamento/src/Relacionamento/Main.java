package Relacionamento;

public class Main {
    public static void main(String[] args) {
        int len = 4;
        Lutador[] L = new Lutador[len];
        L[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        L[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        L[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        L[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        L[1].status();
        for(int i = 0; i < len ; i++) L[i].apresentar();
    }
}
