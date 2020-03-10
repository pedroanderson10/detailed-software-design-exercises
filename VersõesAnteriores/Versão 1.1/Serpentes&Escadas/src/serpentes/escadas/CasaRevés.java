
package serpentes.escadas;

import java.util.Random;

public class CasaRevés extends CasaRandom{
    
    @Override
    public int getDestinoRandom(){
         //randon gera 0~(range-1); somo +1 ao range(0~5) para se tornar (1~6) 
        return super.getNumCasa() - new Random().nextInt(3)+1;
    }
}
