package models;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int QtdPassageiros;
    private boolean Seguro;

    public Veiculo(String marca, String modelo, int ano, int QtdPassageiros, boolean Seguro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.QtdPassageiros = QtdPassageiros;
        this.Seguro = Seguro;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setQtdPassageiros(int QtdPassageiros) {
        this.QtdPassageiros = QtdPassageiros;
    }

    public int getQtdPassageiros() {
        return this.QtdPassageiros;
    }

    public boolean getSeguro() {
        return this.Seguro;
    }
    public void setSeguro(boolean Seguro) {
        this.Seguro = Seguro;
    }

}