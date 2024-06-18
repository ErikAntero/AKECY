package br.itb.projeto.AKECY.model.repository;

import java.util.List;

import br.itb.projeto.AKECY.model.entity.Aluno;

public interface AlunoRepository {

	Aluno find();
	
	List<Aluno> findAll();
	
	Aluno findByRm(long rm);
}






