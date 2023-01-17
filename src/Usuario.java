
import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private LocalDate dataNasc;
    private Endereco enderecoCompleto;
    
    public Usuario(String nome, String email, LocalDate dataNasc, Endereco enderecoCompleto) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(Endereco enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

	
	
    
}
