package testesMain;
import servidor.Tracinhos;
public class TesteTracinhos {
    public static void main (String args[]) {
        try {
            
            int qtdDeTracinhos = 5;
            Tracinhos tracinhos = new Tracinhos(qtdDeTracinhos);

            // testando método revele
            tracinhos.revele(0, 'a'); 
            tracinhos.revele(3, 'b');

            //testando isAindaComTracinhos
            if (tracinhos.isAindaComTracinhos()) System.out.println("Ainda há tracinhos");
            else System.out.println("Não há mais tracinhos");

            // testando toString()
            System.out.println("Mostrar todos os caracteres: " + tracinhos.toString());

            // testando equals
            if (tracinhos.equals(new Tracinhos(5))) {
                System.out.println("\nMétodo equals: As quantidades de tracinhos são iguais!");
            }
            else {
                System.out.println("\nMétodo equals: As quantidades de tracinhos não são iguais.");
            }

            // testando hashCode 
            System.out.println("\nhashCode: " + tracinhos.hashCode());

            // testando clone
            tracinhos.clone();

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}