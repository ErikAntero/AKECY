package br.itb.projeto.AKECY.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.AKECY.model.entity.Itens_pedido;


@Repository
public interface Itens_pedidoRepository 
              extends JpaRepository<Itens_pedido, Long> {

}
