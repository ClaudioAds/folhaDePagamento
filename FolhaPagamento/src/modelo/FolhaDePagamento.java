package modelo;

public class FolhaDePagamento {
	private static final int MIL = 1000;
	private int indice = 0;

	private Funcionario[] funcionarios;

	public FolhaDePagamento() {
		this.funcionarios = new Funcionario[MIL];
	}

	public boolean adicionar(Funcionario funcionario) {
		if (getQuantidade() == this.funcionarios.length) {
			return false;
		} else {
			this.funcionarios[indice++] = funcionario;
			return true;
		}
	}

	public Funcionario buscar(int codigo) {
		for (int i = 0; i < getQuantidade(); i++) {
			if (funcionarios[i] != null && funcionarios[i].getCodigo() == codigo) {
				return funcionarios[i];
			}
		}

		return null;
	}

	public void atualizar(Funcionario funcionario) {
		for (int i = 0; i < getQuantidade(); i++) {
			if (funcionarios[i] != null
					&& funcionarios[i].getCodigo() == funcionario.getCodigo()) {
				funcionarios[i] = funcionario;
				break;
			}
		}
	}

	public void remover(Funcionario funcionario) {
		for (int i = 0; i < getQuantidade(); i++) {
			if (funcionarios[i] != null
					&& funcionarios[i].getCodigo() == funcionario.getCodigo()) {
				funcionarios[i] = null;
				//removendo posições vazias
				for (int j = i; j + 1 < this.funcionarios.length; j++) {
					funcionarios[j] = funcionarios[j + 1];
					funcionarios[j + 1] = null;
				}
				indice--;
				break;
			}
		}
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public int getQuantidade() {
		return indice;
	}

}
