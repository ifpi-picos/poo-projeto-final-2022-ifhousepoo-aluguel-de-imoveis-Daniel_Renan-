import java.time.LocalDate;

public class Registro{
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private String imovel;
    private Usuario usuario;
    
    public Registro(LocalDate data_inicio, LocalDate data_fim, String imovel, Usuario usuario) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.imovel = imovel;
        this.usuario = usuario;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
