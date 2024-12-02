package models;

public class Moto extends Veiculo {
    private String Cor;
    private int NumMotor;
    private String Categoria;

    //Agregação: É usada quando um objeto pode existir independentemente do outro.
    //No exemplo, uma Moto pode existir sem um ServicoPedido, mas um ServicoPedido pode ter um Moto associado.
    
    private ServicoPedido servicoPedido;

    public Moto(String marca, String modelo, int ano,int QtdPassageiros, boolean Seguro, 
    String Cor, int NumMotor, String Categoria, ServicoPedido servicoPedido) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.Cor = Cor;
        this.NumMotor = NumMotor;
        this.Categoria = Categoria;
        this.servicoPedido = servicoPedido;
    }

    public ServicoPedido getServicoPedido() {
        return this.servicoPedido;
    }

    public void setServicoPedido(ServicoPedido servicoPedido) {
        this.servicoPedido = servicoPedido;
    }

    public String getCor() {
        return this.Cor;
    }
    public void setCor(String Cor) {
        this.Cor = Cor;
    }
  
    public int getNumMotor() {
        return this.NumMotor;
    }

    public void setNumMotor(int NumMotor) {
        this.NumMotor = NumMotor;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    // imprimir dados



    public String imprimirMoto(){
        return "\nCor: " + Cor + "\nNúmero do motor: " + NumMotor + "\nCategoria: " + Categoria + servicoPedido.imprimirServico();
    }

}
