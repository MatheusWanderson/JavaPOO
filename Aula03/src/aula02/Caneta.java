package aula02;

public class Caneta {
    //ATRIBUTOS

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //METODO
    public void status() {
        System.out.println("Modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A carga é: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERROR, não consigo rabiscar");

        } else {
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;

    }

}
