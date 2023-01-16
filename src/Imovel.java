

	import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private String valorAluguel;
    private String enderecoCompleto;
    private String dataCadastro;
    
    public Imovel(String descricao, String valorAluguel, String enderecoCompleto, String dataCadastro) {
        this.descricao = descricao;
        this.valorAluguel = valorAluguel;
        this.enderecoCmpleto = enderecoCompleto;
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEndereco_completo(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
