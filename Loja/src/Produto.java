public class Produto {

	private String nome;
	private String codigo;
	private double valor;
	private int quantidade;
	private String dataDeValidade;

	public Produto() {
	}

	public Produto(String nome, String codigo, double valor, String dataDeValidade, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.dataDeValidade = dataDeValidade;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}