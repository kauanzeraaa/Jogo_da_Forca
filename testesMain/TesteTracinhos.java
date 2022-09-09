package testesMain;
import servidor.Tracinhos;
public class TesteTracinhos {
    public static void main (String args[]) {
        try {
            
            int qtdDeTracinhos = 5;
            Tracinhos tracinhos = new Tracinhos(qtdDeTracinhos);

            // testando método revele
            tracinhos.revele(0, 'a'); 
            tracinhos.revele(1, 'b');

            //testando isAindaComTracinhos
            if (tracinhos.isAindaComTracinhos()) System.out.println("Ainda há tracinhos");
            else System.out.println("Não há mais tracinhos");

            // testando toString()
            System.out.println(tracinhos.toString());

            // testando hashCode 
            System.out.println(tracinhos.hashCode());

            
        

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
