package br.com.lucasdenner.dao;

import org.springframework.stereotype.Repository;

import br.com.lucasdenner.domain.Funcionario;

@Repository
public abstract class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	
}
