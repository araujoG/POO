public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private boolean matriculado;


    public void cancelarMatr(){
        System.out.println("A matrícula está cancelada");
        this.setMatriculado(false);
    }


    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.setMatriculado(true);
        this.setMatricula(matricula);
        this.setCurso(curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +   super.toString() +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", matriculado=" + matriculado +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
}
