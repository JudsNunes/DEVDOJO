package academy.devdojo.maratonajava.Gassociacao.teste;


import academy.devdojo.maratonajava.Gassociacao.dominio.Curso;
import academy.devdojo.maratonajava.Gassociacao.dominio.Estudante;

public class CursoTeste01 {
    public static void main(String[] args) {

        Estudante estudante1  = new Estudante("Lucas Nascimento");
        Estudante estudante2 = new Estudante("Victor Demetrius");
        Curso curso = new Curso("DevDojo");

        //vamos realizar o refereciamento do objeto Estudante ao Array de Estudantes;
        Estudante [] estudantes = {estudante1,estudante2};


        estudante1.setCurso(curso);
        estudante1.imprime();

        curso.setEstudantes(estudantes);
        curso.imprime();




    }
}
