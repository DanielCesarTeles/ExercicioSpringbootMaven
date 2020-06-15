package Teles.Daniel.ExercicioSpringbootMaven;

import Teles.Daniel.ExercicioSpringbootMaven.model.MembroDaBanda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 21:39
 * @category view
 */
public class ExercicioSpringbootMavenApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExercicioSpringbootMavenApplication.class, args);

		MembroDaBanda membroDaBanda = applicationContext.getBean(MembroDaBanda.class);

		membroDaBanda.setNomeMembro("Fulano");
		membroDaBanda.setInstrumemto("Violão");
		membroDaBanda.setAnosDeInstrumento(10);
		membroDaBanda.setSalarioMembro(5000.0);

		System.out.println(membroDaBanda);
		}

}
