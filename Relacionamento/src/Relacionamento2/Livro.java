package Relacionamento2;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livro{" +
                "titulo= " + titulo + '\n' +
                " autor= " + autor + '\n' +
                " totPaginas= " + totPaginas + '\n' +
                " pagAtual= " + pagAtual + '\n' +
                " aberto= " + aberto + '\n' +
                " leitor= " + leitor.getNome() + '\n' +
                " idade= " + leitor.getIdade() + '\n' +
                " Sexo= " + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setPagAtual(0);
        this.setAberto(false);
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (this.isAberto() && p <= this.getTotPaginas()) this.setPagAtual(p);
        else System.out.println("Não é possível folhear...");
    }

    @Override
    public void avancarPag() {
        if (this.isAberto() && this.getPagAtual()<this.getTotPaginas()) this.setPagAtual(this.getPagAtual() + 1);
        else System.out.println("Não é possível avançar a página...");
    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && this.getPagAtual() > 0) this.setPagAtual(this.getPagAtual() - 1);
        else System.out.println("Não é possível voltar a página...");
    }
}

