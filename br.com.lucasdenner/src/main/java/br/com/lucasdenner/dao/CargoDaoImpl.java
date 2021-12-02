package br.com.lucasdenner.dao;

import org.springframework.stereotype.Repository;

import br.com.lucasdenner.domain.Cargo;

@Repository
public abstract class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
