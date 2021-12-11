package aula02;

public class Caneta {
    //ATRIBUTOS

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //METODO
    void status() {
        System.out.println("Modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A carga é: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERROR, não consigo rabiscar");

        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;

    }

}
