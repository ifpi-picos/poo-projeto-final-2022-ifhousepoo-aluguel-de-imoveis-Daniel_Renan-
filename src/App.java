
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class App{

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    ArrayList<Usuario>usuarios=new ArrayList();
    ArrayList<Imovel>imoveis = new ArrayList();
    ArrayList<Registro>registro = new ArrayList();
    
    boolean rodando = true;
    while (rodando){
    	System.out.println("[1]Cadastrar um imóvel ");
    	System.out.println("[2]Cadastrar um usuário ");
    	System.out.print("Digite a opção: ");
    	String operacao=scanner.nextLine();
    	 switch(operacao){
 	    case "1":{
 	    	 while(rodando){
 	    		System.out.println("\n==== Bem-vindo ao cadastro de imóveis ==== ");
 	       	 System.out.println("\n[1]Cadastrar imóvel ");
 	       	    System.out.println("[2]Listar todos os imóvel");
 	       	    System.out.println("[3]Atualizar dados de um imóvel ");
 	       	    System.out.println("[4]Remover imóvel ");
 	       	    System.out.println("[5]Sair");
 	       	    System.out.print("Digite a opção: ");
 	       	    String opcao=scanner.nextLine();
 	       	    switch(opcao){
 	       	    case "1":{
 	       	    	System.out.println("==== CADASTRO DE IMÓVEL ==== ");
 	       	    	System.out.println(" Digite a descricao: ");
 	       	    	String descricao = scanner.nextLine();
 	       	    	System.out.println(" Digite o valor do aluguel: ");
 	       	    	String valor_aluguel = scanner.nextLine();
 	       	    	System.out.println(" Digite o endereco completo: ");
 	       	    	String endereco_completo = scanner.nextLine();
 	       	    	System.out.println(" Digite a data de cadastro: ");
 	       	    	String data_cadastro=scanner.nextLine();
 	       	    	Imovel im = new Imovel(data_cadastro, data_cadastro, data_cadastro, null);
 	       	    	im.setDescricao(descricao);
 	       	    	im.setValor_aluguel(valor_aluguel);
 	       	    	im.setEndereco_completo(endereco_completo);
 	       	    	im.setData_cadastro(data_cadastro);
 	       	    	
 	       	    	imoveis.add(im);
 	       	    	
 	       	    	
 	       	 
 	       	        break;
 	       	    	
 	       	    }
 	       	        
 	       	    case "2":{
 	       	    	System.out.println("==== IMÓVEIS CADASTRADOS ==== ");
 	       	    	for(int i=0;i<imoveis.size();i++){
 	       	    		
 	       	    		Imovel uTemp = imoveis.get(i);
 	       	    		System.out.println(" imóvel " +i);
 	       	    		System.out.println("\tdescrição: " + imoveis.get(i).getDescricao());
 	       	    		System.out.println("\tvalor do aluguel " + imoveis.get(i).getValor_aluguel());
 	       	    		System.out.println("\tEndereço completo: " + imoveis.get(i).getEndereco_completo());
 	       	    		System.out.println("\tData de cadastro " + imoveis.get(i).getData_cadastro());
 	       	    		
 	       	    		
 	       	    	}
 	       	        break;
 	       	    	
 	       	    }
 	       	        
 	       	    case "3":{
 	       	    	System.out.println("==== ATUALIZAÇÃO DE IMÓVEL ==== ");
 	       	    	for(int i=0;i<imoveis.size();i++){
 	       	    		Imovel uTemp=imoveis.get(i);
 	       	    		System.out.println("[" + i +"]" + uTemp.getDescricao());
 	       	    		
 	       	    	}
 	       	    	System.out.println(" Digite um valor de referência: ");
 	       	    	int referencia=scanner.nextInt();
 	       	    	scanner.nextLine();
 	       	    	System.out.println(" Digite o novo nome: ");
 	       	    	String novoDescricao = scanner.nextLine();
 	       	    	System.out.println(" Digite o novo email: ");
 	       	    	String novoValor_aluguel = scanner.nextLine();
 	       	    	System.out.println(" Digite o nova data de nascimento: ");
 	       	    	String novaEndereco_completo = scanner.nextLine();
 	       	    	System.out.println(" Digite o novo Endereço: ");
 	       	    	String novoData_cadastro = scanner.nextLine();
 	       	    	Imovel im = imoveis.get(referencia);
 	       	    	im.setDescricao(novoDescricao);
 	       	    	im.setValor_aluguel(novoData_cadastro);
 	       	    	im.setEndereco_completo(novaEndereco_completo);
 	       	    	im.setData_cadastro(novoData_cadastro);
 	       	    	
 	       	    	
 	       	    	
 	       	         break;
 	       	    }
 	       	       
 	       	    case "4":{
 	       	    	System.out.println("==== REMOVER USUÁRIO==== ");
 	       	    	
 	       	    	for(int i=0;i<imoveis.size();i++){
 	       	    		Imovel uTemp=imoveis.get(i);
 	       	    		System.out.println("[" + i +"]" + uTemp.getDescricao());
 	       	    	}
 	       	    		System.out.println(" Digite um valor de referência: ");
 	           	    	int referencia=scanner.nextInt();
 	           	    	scanner.nextLine();
 	           	    	imoveis.remove(referencia);
 	       	         break;
 	       	    }
 	       	    
 	       	       
 	       	    case "5":{
 	       	    	rodando=false;
 	       	    	
 	       	         break;
 	       	    }
 	       	    }
 	    	 }
 	    }
 	        
 	    case "2":{
 	    	while(rodando){
 	    		System.out.println("\n==== Bem-vindo ao cadastro de usuários ==== ");
 	      	 System.out.println("\n[1]Cadastrar usuário ");
 	      	    System.out.println("[2]Listar todos os usuário");
 	      	    System.out.println("[3]atualizar dados de um usuário ");
 	      	    System.out.println("[4]Remover usuário ");
 	      	    System.out.println("[5]Sair");
 	      	    System.out.print("Digite a opção: ");
 	      	    String opcao=scanner.nextLine();
 	      	    switch(opcao){
 	      	    case "1":{
 	      	    	System.out.println("==== CADASTRO DE USUÁRIO ==== ");
 	      	    	System.out.println(" Digite o nome: ");
 	      	    	String nome = scanner.nextLine();
 	      	    	System.out.println(" Digite o email: ");
 	      	    	String email = scanner.nextLine();
 	      	    	System.out.println(" Digite a data de nascimento: ");
 	      	    	String data_nasc = scanner.nextLine();
 	      	    	System.out.println(" Digite o endereço completo: ");
 	      	    	String endereco_completo= scanner.nextLine();
 	      	    	Usuario u = new Usuario(email, email, null, email);
 	      	    	u.setNome(nome);
 	      	    	u.setEmail(email);
 	      	    	u.setData_nasc(data_nasc);
 	      	    	u.setEndereco_completo(endereco_completo);
 	      	    	
 	      	    	usuarios.add(u);
 	      	    	
 	      	    	
 	      	 
 	      	        break;
 	      	    	
 	      	    }
 	      	        
 	      	    case "2":{
 	      	    	System.out.println("==== USUÁRIOS CADASTRADOS ==== ");
 	      	    	for(int i=0;i<usuarios.size();i++){
 	      	    		
 	      	    		Usuario uTemp = usuarios.get(i);
 	      	    		System.out.println(" Usuário " +i);
 	      	    		System.out.println("\tNome: " + usuarios.get(i).getNome());
 	      	    		System.out.println("\tEmail: " + usuarios.get(i).getEmail());
 	      	    		System.out.println("\tData de Nascimento: " + usuarios.get(i).getData_nasc());
 	      	    		System.out.println("\tEndereço completo: " + usuarios.get(i).getEndereco_completo());
 	      	    		
 	      	    		
 	      	    	}
 	      	        break;
 	      	    	
 	      	    }
 	      	        
 	      	    case "3":{
 	      	    	System.out.println("==== ATUALIZAÇÃO DE USUÁRIO ==== ");
 	      	    	for(int i=0;i<usuarios.size();i++){
 	      	    		Usuario uTemp=usuarios.get(i);
 	      	    		System.out.println("[" + i +"]" + uTemp.getNome());
 	      	    		
 	      	    	}
 	      	    	System.out.println(" Digite um valor de referência: ");
 	      	    	int referencia=scanner.nextInt();
 	      	    	scanner.nextLine();
 	      	    	System.out.println(" Digite o novo nome: ");
 	      	    	String novoNome = scanner.nextLine();
 	      	    	System.out.println(" Digite o novo email: ");
 	      	    	String novoEmail = scanner.nextLine();
 	      	    	System.out.println(" Digite o nova data de nascimento: ");
 	      	    	String novaData_nasc = scanner.nextLine();
 	      	    	System.out.println(" Digite o novo Endereço: ");
 	      	    	String novoEndereco = scanner.nextLine();
 	      	    	Usuario u = usuarios.get(referencia);
 	      	    	u.setNome(novoNome);
 	      	    	u.setEmail(novoEmail);
 	      	    	u.setData_nasc(novaData_nasc);
 	      	    	u.setEndereco_completo(novoEndereco);
 	      	    	
 	      	    	
 	      	    	
 	      	         break;
 	      	    }
 	      	       
 	      	    case "4":{
 	      	    	System.out.println("==== REMOVER USUÁRIO==== ");
 	      	    	
 	      	    	for(int i=0;i<usuarios.size();i++){
 	      	    		Usuario uTemp=usuarios.get(i);
 	      	    		System.out.println("[" + i +"]" + uTemp.getNome());
 	      	    	}
 	      	    		System.out.println(" Digite um valor de referência: ");
 	          	    	int referencia=scanner.nextInt();
 	          	    	scanner.nextLine();
 	          	    	usuarios.remove(referencia);
 	      	         break;
 	      	    }
 	      	    
 	      	       
 	      	    case "5":{
 	      	    	rodando=false;
 	      	    	
 	      	         break;
 	      	    }
    	
    }
    
    	
    	
    }
   
       
    
    }
    
}
}
}
}
