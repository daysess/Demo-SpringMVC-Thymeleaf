package br.com.daysesoares.curso.boot.service;

import java.util.List;

import br.com.daysesoares.curso.boot.domain.Cargo;
import br.com.daysesoares.curso.boot.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPaginada(int pagina, String direcao);
	
}
