package testesMain;
import servidor.Tracinhos;
public class TesteTracinhos {
    public static void main (String args[]) {
        try {
            
            int qtdDeTracinhos = 10;
            Tracinhos tracinhos = new Tracinhos(qtdDeTracinhos);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
