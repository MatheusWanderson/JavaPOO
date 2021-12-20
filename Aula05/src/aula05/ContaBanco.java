package aula05;

public class ContaBanco {

    //Atributos
    public int nunConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos Personalizados 
    public void estadoAtual(){
        System.out.println("==============================");
        System.out.println("Conta: " + this.getNunConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println(" Conta Aberta ");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println(" Conta com dinheiro ");

        } else if (this.getSaldo() < 0) {
            System.out.println(" Conta em debito ");
        } else {
            this.setStatus(false);
            System.out.println(" Conta fechada ");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println(" Deposito relizado ");
        } else {
            System.out.println(" A conta esta fechada ");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println(" Saque realizado ");
            } else {
                System.out.println(" Saldo Insuficiente ");
            }

        } else {
            System.out.println(" Conta fechada, saque não realizado  ");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {            
            v = 12;            
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v );
            System.out.println(" Mensalidade paga ");
            
        } else {
            System.out.println(" Conta fechada ");
        }

    }

    //Metodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNunConta() {
        return nunConta;
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
