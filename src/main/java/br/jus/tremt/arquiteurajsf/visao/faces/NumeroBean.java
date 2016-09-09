package br.jus.tremt.arquiteurajsf.visao.faces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.jus.tremt.arquiteturajsf.negocio.GeradorNumeroService;

@ManagedBean
public class NumeroBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private GeradorNumeroService geradorNumeroService;

	public Integer getNumero() {
		return geradorNumeroService.gerarNumero();
	}

}