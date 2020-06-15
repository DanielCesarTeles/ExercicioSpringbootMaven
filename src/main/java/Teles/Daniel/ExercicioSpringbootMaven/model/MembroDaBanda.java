package Teles.Daniel.ExercicioSpringbootMaven.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 21:28
 * @category model
 */
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MembroDaBanda {

    private String nomeMembro;
    private String instrumemto;
    private int anosDeInstrumento;
    private double salarioMembro;

    public double calcularBonusSalarial() {
        return this.salarioMembro + (salarioMembro * this.anosDeInstrumento /100);
    }

    @Override
    public String toString() {
        return "\nNome do membro: '" + this.nomeMembro +
               "\nToca :'" + this.instrumemto +
               "\nTempo de instrumento: " + this.anosDeInstrumento + " anos" +
               "\nsalario do membro: R$" + this.salarioMembro +
               "\nSalario com bonus: R$" + this.calcularBonusSalarial()
               ;
    }
}
