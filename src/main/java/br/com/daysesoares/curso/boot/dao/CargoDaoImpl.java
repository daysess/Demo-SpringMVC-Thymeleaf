package br.com.daysesoares.curso.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.daysesoares.curso.boot.domain.Cargo;
import br.com.daysesoares.curso.boot.util.PaginacaoUtil;

@Repository 
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

	public PaginacaoUtil<Cargo>  buscaPaginada(int pagina){
		int tamanho = 5;
		int inicio = (pagina - 1) * tamanho;
		long totalRegistros = count();
		long totalPaginas = (totalRegistros +(pagina - 1))/tamanho;
		List<Cargo> cargos = getEntityManager()
				.createQuery("select c from Cargo c order by c.nome asc", Cargo.class)
				.setFirstResult(inicio)
				.setMaxResults(tamanho)
				.getResultList();
		
		return new PaginacaoUtil<>(tamanho, pagina, totalPaginas, cargos);
	}
	
	public long count() {
		return getEntityManager()
				.createQuery("select count(1) from Cargo", Long.class)
				.getSingleResult();
	}
	
}
