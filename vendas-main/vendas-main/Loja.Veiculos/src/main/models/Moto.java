package models;

public class Moto extends Veiculo {
    private String Cor;
    private int NumMotor;
    private String Categoria;

    public Moto(String marca, String modelo, int ano,int QtdPassageiros, boolean Seguro, String Cor, int NumMotor, String Categoria) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.Cor = Cor;
        this.NumMotor = NumMotor;
        this.Categoria = Categoria;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    }
  
    public int getNumMotor() {
        return NumMotor;
    }

    public void setNumMotor(int numMotor) {
        this.NumMotor = numMotor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

}