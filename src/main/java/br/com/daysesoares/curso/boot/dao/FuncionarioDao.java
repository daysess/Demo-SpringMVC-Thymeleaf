package br.com.daysesoares.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import br.com.daysesoares.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

	List<Funcionario> findByNomeExemplo1(String nome);
	
	List<Funcionario> findByNomeExemplo2(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataSaida(LocalDate saida);
	
}
