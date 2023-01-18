import br.edu.ifpi.dominio.*;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		List<Usuario> usuarios = new ArrayList<>();
		List<Imovel> imovels = new ArrayList<>();
		List<Registro> registros = new ArrayList<>();

		int opcao, outraOpcao;
		String nome, email, dtNascString;
		LocalDate dataNascimento;
		String rua; int numero; String bairro, cidade, uf;
		String descricao, dataCadastrosString; double valorAluguel; LocalDate dataCadastro;
		String dtInicioString, dtFimString; LocalDate dataInicio, dataFim;
		int resposta = 1, resposta2 = 1, cont = 1, x = 0;
		Imovel[] imoveisVetor = new Imovel[1];

		while (true) {
			System.out.println("\nO que deseja fazer?\n");

			System.out.println("[1] Cadastrar um Usuário");
			System.out.println("[2] Cadastrar um Imóvel");
			System.out.println("[3] Cadastrar um Registro");
			System.out.println("[4] Sair do Sistema");

			System.out.println();

			System.out.print("Sua opção: ");
			opcao = scanner.nextInt();

			System.out.println();

			switch (opcao) {
				case 1:
					while (resposta == 1) {
						System.out.println("\nCDASTRO DE USUÁRIO\n");
	
						System.out.print("Nome: ");
						nome = scanner.nextLine();
						nome = scanner.nextLine();
	
						System.out.println();;
	
						System.out.print("Email: ");
						email = scanner.next();
	
						System.out.println();;
	
						System.out.print("Data de Nascimento: ");
						dtNascString = scanner.next();
	
						String dString[] = dtNascString.split("/");
	
						dataNascimento = LocalDate.of(Integer.parseInt(dString[2]), Integer.parseInt(dString[1]), Integer.parseInt(dString[0]));
	
						System.out.println();
	
						System.out.print("Rua: ");
						rua = scanner.nextLine();
						rua = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("Número: ");
						numero = scanner.nextInt();
	
						System.out.println();
	
						System.out.print("Bairro: ");
						bairro = scanner.nextLine();
						bairro = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("Cidade: ");
						cidade = scanner.nextLine();
						//cidade = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("UF: ");
						uf = scanner.next();

						System.out.println();
	
						Endereco endereco = new Endereco(rua, numero, bairro, cidade, uf);
						Usuario usuario = new Usuario(nome, email, dataNascimento, endereco);
						usuarios.add(usuario);
						
						System.out.println("Cadastrar mais um Usuário?");
						System.out.println();
						System.out.println("[1] SIM");
						System.out.println("[2] NÃO");
						System.out.println();
						System.out.print("Sua opção: ");
						resposta = scanner.nextInt();
						System.out.println();
					}

					for (Usuario usuario : usuarios) {
						System.out.println(usuario);
					}

					resposta = 1;
					break;

				case 2:
					while (resposta == 1) {					
						System.out.println("\nCADASTRO DE IMÓVEIS\n");
	
						System.out.print("Descrição: ");
						descricao = scanner.nextLine();
						descricao = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("Valor do Aluguel: ");
						valorAluguel = scanner.nextDouble();
	
						System.out.println();
	
						System.out.print("Data de Cadastro: ");
						dataCadastrosString = scanner.next();
	
						System.out.println();
	
						String dString2[] = dataCadastrosString.split("/");
	
						dataCadastro = LocalDate.of(Integer.parseInt(dString2[2]), Integer.parseInt(dString2[1]), Integer.parseInt(dString2[0]));
	
						System.out.print("Rua: ");
						rua = scanner.nextLine();
						rua = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("Número: ");
						numero = scanner.nextInt();
	
						System.out.println();
	
						System.out.print("Bairro: ");
						bairro = scanner.nextLine();
						bairro = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("Cidade: ");
						cidade = scanner.nextLine();
						//cidade = scanner.nextLine();
	
						System.out.println();
	
						System.out.print("UF: ");
						uf = scanner.next();

						System.out.println();
						
						Endereco endereco2 = new Endereco(rua, numero, bairro, cidade, uf);
						Imovel imovel = new Imovel(descricao, valorAluguel, endereco2, dataCadastro);
						imovels.add(imovel);

						System.out.println("Cadastrar mais um Imóvel?");
						System.out.println();
						System.out.println("[1] SIM");
						System.out.println("[2] NÃO");
						System.out.println();
						System.out.print("Sua opção: ");
						resposta = scanner.nextInt();
						System.out.println();
					}

					for (Imovel imovel : imovels) {
						System.out.println(imovel);
					}

					resposta = 1;
					break;

				case 3:
					while (resposta == 1) {
						System.out.println("\nCADASTRO DE REGISTRO\n");
	
						System.out.print("Informe seu Nome de Usuário: ");
						nome = scanner.nextLine();
						nome = scanner.nextLine();
	
						System.out.println();
					
						for (Usuario iterable_element : usuarios) {
							if (nome.equals(iterable_element.getNome())) {
								
								System.out.print("Data de Inicio: ");
								dtInicioString = scanner.next();
	
								System.out.println();
	
								String dString3[] = dtInicioString.split("/");
	
								dataInicio = LocalDate.of(Integer.parseInt(dString3[2]), Integer.parseInt(dString3[1]), Integer.parseInt(dString3[0]));
						
								System.out.print("Data de Fim: ");
								dtFimString = scanner.next();
	
								System.out.println();
	
								String dString4[] = dtFimString.split("/");
	
								dataFim = LocalDate.of(Integer.parseInt(dString4[2]), Integer.parseInt(dString4[1]), Integer.parseInt(dString4[0]));
								
								while (resposta2 == 1) {
									System.out.println();
	
									for (Imovel  iterable_element2: imovels) {
										System.out.println("Digite " + cont + " para o Imovél: " + iterable_element2.getDescricao());
										cont ++;
									}

									cont = 1;
	
									System.out.println();
	
									System.out.print("Sua opção: ");
									outraOpcao = scanner.nextInt();
	
									System.out.println();
	
									for (int i = 0; i < imovels.size(); i ++) {
										if (outraOpcao - 1 == i) {
											imoveisVetor[x] = imovels.get(outraOpcao - 1);									
										}
									}
	
									x ++;
	
									System.out.println("Adicionar mais um Imóvel?");
									System.out.println();
									System.out.println("[1] SIM");
									System.out.println("[2] NÃO");
									System.out.println();
									System.out.print("Sua opção: ");
									resposta2 = scanner.nextInt();
									System.out.println();
								}

								resposta2 = 1;
								
								Registro registro = new Registro(dataInicio, dataFim, imoveisVetor, iterable_element);
								registros.add(registro);
							}
						}
	
						System.out.println("Fazer mais um registro?");
						System.out.println();
						System.out.println("[1] SIM");
						System.out.println("[2] NÃO");
						System.out.println();
						System.out.print("Sua opção: ");
						resposta = scanner.nextInt();
						System.out.println();
					}

					for (Registro registro : registros) {
						if (registro.getImovel() != null) {
							System.out.println(registro);
						}
					}
					
					resposta = 1;
					break;
			
				case 4:
					scanner.close();
					break;
			}
			
			if (opcao == 4) {
				System.out.println("\nSISTEMA ENCERRADO\n");
				break;
			}
		}
	}
}
