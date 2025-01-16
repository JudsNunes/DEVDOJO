package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private Curso curso;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, Curso curso) {
        this(nome);
        this.curso = curso;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(curso != null) {
            System.out.println(curso.getNome());
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
