package models;

public class ServicoPedido{
    private String Data;
    private String Descricao;
    private double Custo;


    public ServicoPedido(String Data, String Descricao, double Custo) {
        this.Data = Data;
        this.Descricao = Descricao;
        this.Custo = Custo;
    }

    public String getData() {
        return this.Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getCusto() {
        return this.Custo;
    }

    public void setCusto(double Custo) {
        this.Custo = Custo;
    }

    public String imprimirServico(){
        return "\nData: " + Data + "\nDescrição: " + Descricao + "\nCusto: "  + Custo; 
    }
}