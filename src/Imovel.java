import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private double valor_aluguel;
    private String endereco_completo;
    private LocalDate data_cadastro;
    
    public Imovel(String descricao, double valor_aluguel, String endereco_completo, LocalDate data_cadastro) {
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

    public double getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
}

