package modelo;

public class Funcionario {
	private static final float ONZE_POR_CENTO = 0.11f;
	private int codigo;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private int idade;
	private float salario;
	
	private static int quantidadeDeFuncionarios = 0;

	public Funcionario() {
		this.codigo = ++quantidadeDeFuncionarios;		
	}

	public Funcionario(String nome, String cpf, Endereco endereco,
			String telefone, int idade, float salario) {
		this();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calculaSalarioLiquido(){
		return this.salario - (this.salario * ONZE_POR_CENTO);
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", cpf="
				+ cpf + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", idade=" + idade + ", salario=" + salario + "]";
	}

}
