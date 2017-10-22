package DTO;

public class Erro {

    private String erro;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String enedereco) {
        this.endereco = enedereco;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String retornaErroStatico() {
        return "Erro ao carregar a pagina";
    }

}
