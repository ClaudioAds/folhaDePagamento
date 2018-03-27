package modelo;

public class Gerente extends Funcionario {
	
	public float calculaSalarioLiquido() {
		return super.calculaSalarioLiquido() + 1500;
	}

	@Override
	public String toString() {
		return "Gerente [toString()=" + super.toString() + "]";
	}
	
}
