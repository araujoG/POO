package Relacionamento;

public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public void apresentar(){
        System.out.println("------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("Perdeu: " + getDerrotas());
    }

    public void status(){
        System.out.print(getNome());
        System.out.println(" é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getEmpates() + " empates");
        System.out.println(getDerrotas() + " derrotas");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    //Métodos especiais


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setCategoria();
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        String categoria;
        if (this.getPeso() < 52.2){
            categoria = "Inválido";
        } else if (this.getPeso() < 70.3){
            categoria = "Leve";
        } else if (this.getPeso() < 83.9){
            categoria = "Médio";
        } else if (this.getPeso() < 120.2){
            categoria = "Pesado";
        } else categoria = "Inválido";
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
