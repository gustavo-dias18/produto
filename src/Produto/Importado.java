package Produto;

public class Importado extends Produto {
	
	private Double taxa;
	
	public Importado() {
	}

	public Importado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String Etiqueta() {
		return super.Etiqueta() + " - Taxa: " + String.format("%.2f", taxa);
	}
}
