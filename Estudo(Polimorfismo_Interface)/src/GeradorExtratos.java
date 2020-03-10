import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtratos {
     
    public void imprimeExtrato(Conta conta) {
        System.out.println("### Extrato da Conta ###");
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa - HH:mm:ss");
        Date date = new Date();
        
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Saldo: "+ conta.getSaldo());
        System.out.println("Data: " + sdf.format(date));
         
    }
}