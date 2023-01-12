import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    static ArrayList<Usuario> usuario;
    static ArrayList<Imovel> imovel;
    static int tipo;

    public static void main(String[] args) {
        usuario = new ArrayList<>();
        imovel =new ArrayList<>();

        int comandoInteiro = 0;
        while (comandoInteiro != 5){
            opcoesServicos();
        }
    }
    public static void opcoesServicos(){
        System.out.println("SERVIÇOS:\n1-Cadastrar\n2-Alterar\n3-Listar\n4-Remover\n5-Sair");
        int comando;
        System.out.println("Digite sua opção");
        Scanner scanner = new Scanner(System.in);
        comando = scanner.nextInt();
        switch (comando) {
            case 1:
                cadastrar();
                break;
            case 2:
                alterar();
                break;
            case 3:
                listar();
                break;
            case 4:
                remover();
                break;
            case 5:
                sair();
                break;
            
            default:
        

        }

    }
    private static void cadastrar(){
        String[] options = {"Cadastrar Serviço", "Cadastrar Cliente"};
        int tipoCadastro = showOptionDialog(null, "Escolha o tipo de cadastro:",
                "Clique em uma opção",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, options, options[0]);
        if(tipoCadastro == 0) {
            tipo = 0;
            cadastrarServico();
        }
        else if (tipoCadastro == 1) {
            tipo = 1;
            cadastrarCliente();
        }
    }
    private static void cadastrarServico(){
           String nome = JOptionPane.showInputDialog("Qual o nome do serviço realizado: ");
           String descricao = JOptionPane.showInputDialog("Descreva o serviço realizado: ");
           String valorString = JOptionPane.showInputDialog("Qual o valor do serviço realizado: ");
           double valor = Double.parseDouble(valorString);
           String funcionario = JOptionPane.showInputDialog("Nome do funcionário que realizou o serviço: ");
           Funcionario Funcionarioo = new Funcionario(funcionario);
           Servicos servico = new Servicos(nome, descricao, valor,Funcionarioo);
           servicos.add(servico);
    }
    private static Servicos encontraServicos(int codigo){
        Servicos servico = null;
        if(servicos.size() > 0){
            for(Servicos s :servicos){
                if(s.getCodigo() == codigo){
                    servico = s;
                }
            }
        }

        return servico;
    }
    private static void cadastrarCliente(){
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        String email = JOptionPane.showInputDialog("Digite o email do cliente: ");
        String sexo = JOptionPane.showInputDialog("Digite o sexo do cliente: ");

        String uf = JOptionPane.showInputDialog("Digite a UF do cliente: ");
        String cidade = JOptionPane.showInputDialog("Digite o nome da cidade do cliente: ");
        String bairro = JOptionPane.showInputDialog("Digite o nome do bairro do cliente: ");
        String logradouro = JOptionPane.showInputDialog("Digite o logradouro do cliente: ");
        String numero = JOptionPane.showInputDialog("Digite o número da casa do cliente: ");
        Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
        Cliente cliente = new Cliente(nome, email, sexo, endereco);
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
    }
    private static Cliente encontrarClientes(int codigo){
        Cliente cliente = null;
        if(clientes.size() > 0){
            for(Cliente c : clientes){
                if(c.getCodigo() == codigo){
                    cliente = c;
                }
            }
        }
        return cliente;
    }
    private static void alterar(){
        String[] options = {"Alterar dados do Serviço", "Alterar dados do Cliente"};
        int opcao = showOptionDialog(null, "Escolha uma opção:",
                "Alterar",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, options, options[0]);
        if(opcao == 0) {
            alterarServicos();
        }
        else if (opcao == 1) {
            alterarCliente();
        }
    }
    public static void alterarServicos() {
        String codigoString = JOptionPane.showInputDialog("Digite o código do serviço a ser alterado :  ");
        int codigo = Integer.parseInt(codigoString);
        Servicos servico = encontraServicos(codigo);
        if( servico != null){
            String nome = JOptionPane.showInputDialog("Qual o nome do serviço realizado: ");
            String descricao = JOptionPane.showInputDialog("Descreva o serviço realizado: ");
            String valorString = JOptionPane.showInputDialog("Qual o valor do serviço realizado: ");
            double valor = Double.parseDouble(valorString);
            String nomefuncionario = JOptionPane.showInputDialog("Nome do funcionário que realizou o serviço: ");
            servico.alterar(servico, codigo, nome, valor, descricao, nomefuncionario);
            JOptionPane.showMessageDialog(null, " Serviço alterado com sucesso");
        }
    }
    public static void alterarCliente() {
        String codigoString = JOptionPane.showInputDialog("Digite o código do cliente a ser alterado :  ");
        int codigo = Integer.parseInt(codigoString);
        Cliente cliente =encontrarClientes(codigo);
        if( cliente != null){
            String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
            String email = JOptionPane.showInputDialog("Digite o email do cliente: ");
            String sexo = JOptionPane.showInputDialog("Digite o sexo do cliente: ");

            String uf = JOptionPane.showInputDialog("Digite a UF do cliente: ");
            String cidade = JOptionPane.showInputDialog("Digite o nome da cidade do cliente: ");
            String bairro = JOptionPane.showInputDialog("Digite o nome do bairro do cliente: ");
            String logradouro = JOptionPane.showInputDialog("Digite o logradouro do cliente: ");
            String numero = JOptionPane.showInputDialog("Digite o número da casa do cliente: ");
            cliente.alterarCliente(cliente, codigo, nome, email, sexo, uf, cidade, bairro, logradouro, numero);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        }
    }
    private static void listar(){
        String[] options = {"Listar serviços", "Listar clientes"};
        int opcao = showOptionDialog(null, "Escolha uma opção:",
                "Listar",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, options, options[0]);
        if(opcao == 0) {
            listarServicos();
        }
        else if (opcao == 1) {
            listarClientes();
        }
    }
    private static void listarServicos() {
        if (servicos.size() > 0) {
            for (Servicos servico : servicos) {
                JOptionPane.showMessageDialog(null,""+servico);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Não há serviços para listar!");
        }
    }
    private static void listarClientes() {
        if (clientes.size() > 0) {
            for (Cliente cliente : clientes) {
                JOptionPane.showMessageDialog(null,""+cliente);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Não há clientes para listar!");
        }
    }
    private static void remover(){
        String[] options = {"Remover serviço", "Remover cliente"};
        int opcao = showOptionDialog(null, "Escolha uma opção:",
                "Remover",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, options, options[0]);
        if(opcao == 0) {
            removerServico();
            JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso!");
        }
        else if (opcao == 1) {
            removerCliente();
            JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso!");
        }
    }
    public static void removerServico() {
        String codigoString = JOptionPane.showInputDialog("Digite o código do serviço a ser remolvido: ");
        int codigo = Integer.parseInt(codigoString);
        Servicos servico = encontraServicos(codigo);
        if(servico != null) {
            servico.remover(servico, codigo);
        }
    }
    public static void removerCliente() {
        String codigoString = JOptionPane.showInputDialog("Digite o código do cliente a ser remolvido: ");
        int codigo = Integer.parseInt(codigoString);
        Cliente cliente = encontrarClientes(codigo);
        if(cliente != null){
            cliente.removerClString comando = Systemientes(cliente, codigo);
        }
    }
    private static void sair(){
        showMessageDialog(null, "Saída executada!");
        System.exit(0);
    }

}
