package br.jus.tremt.arquiteturajsf.teste;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.jus.tremt.arquiteturajsf.negocio.GeradorNumeroService;

@RunWith(Arquillian.class)
public class GeradorNumeroTest {

	@Deployment
	public static JavaArchive createDeployment() {
		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addClasses(GeradorNumeroService.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

		System.out.println(jar.toString(true));

		return jar;
	}

	@Inject
	private GeradorNumeroService geradorNumeroService;

	@Test
	public void should_be_in_range() {
		assertThat(geradorNumeroService.gerarNumero()).isBetween(1, 100);
	}
}