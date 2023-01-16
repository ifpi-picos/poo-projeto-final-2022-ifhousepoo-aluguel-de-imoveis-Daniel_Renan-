
import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private String data_nasc;
    private String endereco_completo;
    
    public Usuario(String nome, String email, String data_nasc, String endereco_completo) {
        this.nome = nome;
        this.email = email;
        this.data_nasc = data_nasc;
        this.endereco_completo = endereco_completo;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

	
	
    
}
