package models;

public class Carro extends Veiculo {
    private int quantidadePortas;
    private String tipoCombustivel;
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int quantidadePortas, String tipoCombustivel, int QtdPassageiros, boolean Seguro, String tipoCarro ) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.quantidadePortas = quantidadePortas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoCarro = tipoCarro;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int QuantidadePortas) {
        this.quantidadePortas = QuantidadePortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.tipoCombustivel = TipoCombustivel;
    }
    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String TipoCarro) {
        this.tipoCarro = TipoCarro;
    }

}
