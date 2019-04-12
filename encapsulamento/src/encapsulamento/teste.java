package encapsulamento;

public class teste {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.definirVolume(100);
        c.abrirMenu();
        c.fecharMenu();
    }
}
