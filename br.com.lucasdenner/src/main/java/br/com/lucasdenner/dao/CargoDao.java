package br.com.lucasdenner.dao;

import java.util.List;

import br.com.lucasdenner.domain.Cargo;


public interface CargoDao {
	void save (Cargo cargo);
	void update (Cargo cargo);
	
	void delete (Long id);
	
	Cargo findByID(Long id);
	List<Cargo>findALL();

}
