package academy.devdojo.maratonajava.FmodificadorEstatico.teste;

import academy.devdojo.maratonajava.FmodificadorEstatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
       //variáveis de referência fazendo referencia a classe carro.
        Carro carro  =  new Carro("BMW",280);
        Carro carro2 =  new Carro("Mercedes",240);
        Carro carro3 =  new Carro("Porsche",275);

        //quando utilizamos o modificador de Acesso static fazemos referência a uma instância e não a classe.
        //em métodos estáticos não podemos utilizar o this.(referência de instância) e sim a classe Carro.(atributo)
        //dessa forma iremos modificar a Classe.
        //independer de ter uma instancia Carro ou não podemos utilizar o carro.velocidadeLimite();

        //carro.setVelocidadeLimite(180);

        carro.velocidadeLimite = 180;

        carro.imprime();
        carro2.imprime();
        carro3.imprime();


    }
}
