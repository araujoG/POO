public class Professor extends Pessoa{
    private String especialidade;
    private double salario;


    public void receberAum(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }


    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    @Override
    public String toString() {
        return "Professor{" +   super.toString() +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
