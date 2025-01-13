package academy.devdojo.maratonajava.FmodificadorEstatico.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    //estou criando um modificador de acesso do tipo estático,sendo assim estamos definindo o valor 250 como a referência
    //a classe e não mais
    public static double velocidadeLimite = 250;

    //modificador de acesso statico vai fazer o atributo pertencer a classe e todos os objetos vão pertencer ao mesmo valor
    //se você alterar em uma instância você está alterando para todos os objetos em existência dessa classe




    //criando um construtor para inicializar junto com o Objeto carro
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void imprime() {
        System.out.println("------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}


