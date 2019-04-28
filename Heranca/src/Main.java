public class Main {

    public static void main(String[] args) {

        //Pessoa é uma classe abstrata, não pode ser instanciada
        //Visitante pode, pq só herda de pessoa
        Aluno p2 = new Aluno("Gabriel", 19, "Masculino", 19918, "CC");
        Professor p3 = new Professor("Cris", 36, "Feminino", "Quimica", 900);
        Funcionario p4 = new Funcionario("Maria", 32, "Feminino", "Administrativo", true);

        p3.receberAum(200);
        System.out.println(p3);

    }



}