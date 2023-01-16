

	import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private String valor_aluguel;
    private String endereco_completo;
    private String data_cadastro;
    
    public Imovel(String descricao, String valor_aluguel, String endereco_completo, String data_cadastro) {
        this.descricao = descricao;
        this.valor_aluguel = valor_aluguel;
        this.endereco_completo = endereco_completo;
        this.data_cadastro = data_cadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(String valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
}
