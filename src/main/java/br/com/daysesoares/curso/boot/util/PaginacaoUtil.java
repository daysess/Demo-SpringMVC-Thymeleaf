package br.com.daysesoares.curso.boot.util;

import java.util.ArrayList;
import java.util.List;

public class PaginacaoUtil<T> {

	private int tamanho;
	private int pagina;
	private long totalPaginas;
	private List<T> registros = new ArrayList<>();
	
	public PaginacaoUtil(int tamanho, int pagina, long totalPaginas, List<T> registros) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalPaginas = totalPaginas;
		this.registros = registros;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public List<T> getRegistros() {
		return registros;
	}


	public long getTotalPaginas() {
		return totalPaginas;
	}
	
	
	
}
