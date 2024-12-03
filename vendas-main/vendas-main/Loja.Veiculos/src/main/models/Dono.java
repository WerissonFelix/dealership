package models;

public class Dono{
    private String Nome;
    private String Cpf;
    private String Telefone;

    public Dono(String Nome, String Cpf, String Telefone) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;

    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return this.Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String imprimirDono(){
        return "\nNome do dono: " + Nome + "\nCpf do dono: " + Cpf + "\nTelefone do dono: " + Telefone;
    }

}