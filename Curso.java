package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Curso {
    private String nome;
    private Estudante [] estudantes;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, Estudante[] estudantes) {
        this.nome = nome;
        this.estudantes = estudantes;
    }

    public void imprime() {
        System.out.println(this.nome);
        for(Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
