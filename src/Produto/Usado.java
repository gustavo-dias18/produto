package Produto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usado extends Produto{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date fabricado;
	
	public Usado() {
	}

	public Usado(String nome, Double preco, Date fabricado) {
		super(nome, preco);
		this.fabricado = fabricado;
	}

	public Date getFabricado() {
		return fabricado;
	}

	public void setFabricado(Date fabricado) {
		this.fabricado = fabricado;
	}
	
	@Override
	public String Etiqueta() {
		return super.Etiqueta() + " - Fabricado em: " + sdf.format(fabricado);
	}
}