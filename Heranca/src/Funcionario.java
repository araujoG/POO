public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;


    public void mudarTrabalho(String setor){
        this.setSetor(setor);
    }


    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() +
                "setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                '}';
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
