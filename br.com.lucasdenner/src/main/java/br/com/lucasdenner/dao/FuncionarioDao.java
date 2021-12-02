package br.com.lucasdenner.dao;

import java.util.List;

import br.com.lucasdenner.domain.Funcionario;


public interface FuncionarioDao {
	
	void save (Funcionario funcionario);
	void update (Funcionario funcionario);
	
	void delete (Long id);
	
	Funcionario findByID(Long id);
	List<Funcionario>findALL();

}
