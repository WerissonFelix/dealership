
package models;

public class Carro extends Veiculo {
    private int quantidadePortas;
    private String tipoCombustivel;
    private String tipoCarro;

    //Composição: É usada quando um objeto depende inteiramente do outro para existir.
    // No exemplo, a Carro depende do Dono, e o vínculo é mais forte, indicando que os dois têm um ciclo de vida conjunto.
    
    private Dono dono;

    public Carro(String marca, String modelo, int ano, int quantidadePortas, String tipoCombustivel,
    int QtdPassageiros, boolean Seguro, String tipoCarro, Dono dono) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.quantidadePortas = quantidadePortas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoCarro = tipoCarro;
        this.dono = dono;
    }

    public Dono getDono() {
        return this.dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }


    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoCarro() {
        return this.tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    // imprimir dados do carro

    public String imprimirCarro(){
        return "\nQuantidade de portas: " + quantidadePortas +  "\nTipo de combustível: " + tipoCombustivel 
        + "\nTipo do carro: " + tipoCarro + dono.imprimirDono();

    }

}
