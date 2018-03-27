package visao;

import java.util.Scanner;

import modelo.Endereco;
import modelo.FolhaDePagamento;
import modelo.Funcionario;

public class InterfaceTextual {
	private Scanner in = new Scanner(System.in);
	private FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

	public int menu() {
		System.out.println("\nDigite uma opção:");
		System.out.println("1 - Cadastrar funcionario");
		System.out.println("2 - Cadastrar funcionario Gerente");
		System.out.println("3 - Buscar funcionario");
		System.out.println("4 - Alterar funcionario");
		System.out.println("5 - Remover funcionario");
		System.out.println("6 - Exibir todos os funcionarios");
		System.out.println("7 - Sair");
		int opcao = in.nextInt();
		in.nextLine();
		return opcao;
	}

	public void cadastrar(Funcionario funcionario) {
		informarDados(funcionario);
		boolean cadastrou = folhaDePagamento.adicionar(funcionario);
		if (cadastrou) {
			System.out.println("Cadastrado com sucesso!");
		} else {
			System.out.println("Não foi possível cadastrar");
		}
	}

	public void buscar() {
		System.out.println("Digite o codigo do funcionario");
		int codigo = in.nextInt();
		in.nextLine();
		Funcionario funcionario = folhaDePagamento.buscar(codigo);
		if (funcionario != null) {
			System.out.println(funcionario);
		} else {
			System.out.println("Funcionario Inexistente");
		}
	}

	public void alterar() {
		System.out.println("Digite o codigo do funcionario");
		int codigo = in.nextInt();
		in.nextLine();
		Funcionario funcionario = folhaDePagamento.buscar(codigo);
		if (funcionario != null) {
			informarDados(funcionario);
			// A linha seguinte é desnecessária porque toda alteração feita na
			// referencia retornada na busca já reflete no cadastro
			folhaDePagamento.atualizar(funcionario);
			System.out.println("Atualizado com sucesso!");
		} else {
			System.out.println("Funcionario Inexistente");
		}
	}
	public void exibirTodos() {
		Funcionario[] funcionarios = folhaDePagamento.getFuncionarios();
		if (folhaDePagamento.getQuantidade() > 0){
			for (int i = 0; i < folhaDePagamento.getQuantidade(); i++) {
				if (funcionarios[i] != null) {
					System.out.println(funcionarios[i]);
				}
			}
		} else {
			System.out.println("Cadastro vazio!");
		}
		
	}

	public void remover() {
		System.out.println("Digite o codigo do funcionario");
		int codigo = in.nextInt();
		in.nextLine();
		Funcionario funcionario = folhaDePagamento.buscar(codigo);
		if (funcionario != null) {
			folhaDePagamento.remover(funcionario);
			System.out.println("Removido com sucesso!");
		} else {
			System.out.println("Funcionario Inexistente");
		}
	}

	private void informarDados(Funcionario funcionario) {
		System.out.println("Digite o nome");
		funcionario.setNome(in.nextLine());
		System.out.println("Digite o CPF");
		funcionario.setCpf(in.nextLine());
		System.out.println("Digite a idade");
		funcionario.setIdade(in.nextInt());
		in.nextLine();
		System.out.println("Digite o salário");
		funcionario.setSalario(in.nextFloat());in.nextLine();
		System.out.println("Digite o telefone");
		funcionario.setTelefone(in.nextLine());

		Endereco endereco = new Endereco();
		funcionario.setEndereco(endereco);

		System.out.println("Digite a rua");
		endereco.setRua(in.nextLine());
		System.out.println("Digite o numero");
		endereco.setNumero(in.nextLine());
		System.out.println("Digite a cidade");
		endereco.setCidade(in.nextLine());
		System.out.println("Digite o bairro");
		endereco.setBairro(in.nextLine());
		System.out.println("Digite o cep");
		endereco.setCep(in.nextLine());
	}
}
