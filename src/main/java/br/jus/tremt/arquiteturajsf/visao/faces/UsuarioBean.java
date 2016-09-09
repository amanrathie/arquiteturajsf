package br.jus.tremt.arquiteturajsf.visao.faces;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.jus.tremt.arquiteturajsf.modelo.Usuario;
import br.jus.tremt.arquiteturajsf.negocio.UsuarioService;

@ManagedBean
public class UsuarioBean {
	
	@Inject
	private UsuarioService usuarioService;

	public Usuario getUsuario() {
		Usuario pedro = new Usuario("Pedro");
		usuarioService.add(pedro);
		
		return usuarioService.findByNome("Pedro");
	}
}
