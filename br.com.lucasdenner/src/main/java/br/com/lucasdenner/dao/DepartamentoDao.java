package br.com.lucasdenner.dao;

import java.util.List;

import br.com.lucasdenner.domain.Departamento;

public interface DepartamentoDao {

	void save (Departamento departamento);
	void update (Departamento departamento);
	
	void delete (Long id);
	
	Departamento findByID(Long id);
	List<Departamento>findALL();
}
