package encapsulamento;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override //sobreescrever o método abstrato
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("-----MENU-----");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 10; i<= this.getVolume(); i += 10 ) System.out.print("|");
            System.out.println("");
        } else System.out.println("A tv está desligada...");
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando menu....");
        } else System.out.println("A tv está desligada...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()) this.setVolume(this.getVolume() + 5);
        else System.out.println("Impossível aumentar o volume.");
    }

    @Override
    public void menosVolume() {
        if(getLigado() && this.getVolume()>4) this.setVolume(this.getVolume() - 5);
        else System.out.println("Impossível diminuir o volume...");
    }

    @Override
    public void definirVolume(int v) {
        if(getLigado() && v > -1) this.setVolume(v);
        else System.out.println("Impossível definir o volume inserido...");
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0) this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0) this.setVolume(50);
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.getLigado() && (this.getTocando())) this.setTocando(false);
    }
}
