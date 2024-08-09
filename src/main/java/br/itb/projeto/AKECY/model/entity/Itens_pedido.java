package br.itb.projeto.AKECY.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Itens_pedido")
public class Itens_pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cod_itens_pedidos;
	private String quantidade;
	
	@ManyToOne
	@JoinColumn(name = "Codigo")
	private Pedido pedido;

	
	public String getCod_itens_pedidos() {
		return cod_itens_pedidos;
	}

	public void setCod_itens_pedidos(String cod_itens_pedidos) {
		this.cod_itens_pedidos = cod_itens_pedidos;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	

}
