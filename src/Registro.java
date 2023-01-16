import java.time.LocalDate;

public class Registro{
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Imovel imovel;
    private Usuario usuario;
    
    public Registro(LocalDate dataInicio, LocalDate dataFim, Imovel imovel, Usuario usuario) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.usuario = usuario;
    }

    public LocalDate getDataInicio() {
        return data_inicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
