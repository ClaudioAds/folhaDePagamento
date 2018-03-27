import modelo.Funcionario;
import modelo.Gerente;
import visao.InterfaceTextual;

public class Principal {
	private static final int SETE = 7;

	public static void main(String[] args) {
		InterfaceTextual interfaceTextual = new InterfaceTextual();
		int opcao = 0;
		do{
			opcao = interfaceTextual.menu();
			
			switch (opcao) {
			case 1:
				interfaceTextual.cadastrar(new Funcionario());
				break;
			case 2:
				interfaceTextual.cadastrar(new Gerente());
				break;
			case 3:
				interfaceTextual.buscar();
				break;
			case 4:
				interfaceTextual.alterar();
				break;
			case 5:
				interfaceTextual.remover();
				break;
			case 6:
				interfaceTextual.exibirTodos();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while (opcao != SETE);
	}
}
