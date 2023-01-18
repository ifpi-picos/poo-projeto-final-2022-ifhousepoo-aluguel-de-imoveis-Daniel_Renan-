package br.edu.ifpi.dominio;
import java.time.LocalDate;
import java.util.Arrays;

public class Registro{
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Imovel[] imovel;
    private Usuario usuario;
    
    public Registro(LocalDate dataInicio, LocalDate dataFim, Imovel[] imovel, Usuario usuario) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.usuario = usuario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
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

    public Imovel[] getImovel() {
        return imovel;
    }

    public void setImovel(Imovel[] imovel) {
        this.imovel = imovel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Registro [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", imovel=" + Arrays.toString(imovel)
                + ", usuario=" + usuario + "]";
    }
}
