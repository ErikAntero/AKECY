package br.itb.projeto.AKECY.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.AKECY.model.entity.Categoria;
import br.itb.projeto.AKECY.service.CategoriaService;

@RestController
@RequestMapping("/Itens_pedido/")
public class Itens_pedidoController {
	
	private Itens_pedidoService itens_pedidoService;
	
	public Itens_pedidoController(Itens_pedidoService itens_pedidoService) {
		super();
		this.itens_pedidoService = itens_pedidoService;
	}
	
	@GetMapping("findAll")
	public ResponseEntity<List<Itens_pedidos>> findAll() {
		List<Itens_pedido> itens_pedidos = itens_pedidosService.findAll();

		return new ResponseEntity<List<Itens_pedido>>(
								itens_pedidos, HttpStatus.OK);
	}
	
	@PostMapping("create")
	public ResponseEntity<Itens_pedido> create(
			@RequestBody Itens_pedido itens_pedidos){
		
		Itens_pedidos _itens_pedidos = 
				itens_pedidosService.create(itens_pedidos);
		
		return new ResponseEntity<Itens_pedidos>
					(_itens_pedidos, HttpStatus.OK);
	}

}
