package br.itb.projeto.AKECY.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Cod_categoria;
	private String Descrição_Categoria;
	
	@ManyToOne
	@JoinColumn(name = "Id_produto")
	private Produto produto;
	
	
	public long getCod_categoria() {
		return Cod_categoria;
	}
	public void setCod_categoria(long cod_categoria) {
		Cod_categoria = cod_categoria;
	}
	public String getDescrição_Categoria() {
		return Descrição_Categoria;
	}
	public void setDescrição_Categoria(String descrição_Categoria) {
		Descrição_Categoria = descrição_Categoria;
	}
}

	

