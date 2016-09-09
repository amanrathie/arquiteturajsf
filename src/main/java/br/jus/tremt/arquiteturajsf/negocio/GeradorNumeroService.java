package br.jus.tremt.arquiteturajsf.negocio;

import java.util.Random;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class GeradorNumeroService
 */
@Stateless
public class GeradorNumeroService {

    /**
     * Default constructor. 
     */
    public GeradorNumeroService() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Gera um numero alteatorio de 1 a 100
     */
    public Integer gerarNumero() {
    	Random ran = new Random();
    	return ran.nextInt(100) + 1;
    }

}
