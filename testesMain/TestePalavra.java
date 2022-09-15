package testesMain;
import servidor.Palavra;

public class TestePalavra {
    public static void main (String  args[]) {
        
        try {
            String texto = "elefante";
            Palavra palavra = new Palavra(texto);
            
            // testando getQuantidade
            System.out.println("\nVezes que a letra 'e' aparece: " + palavra.getQuantidade('e'));

            // testando método getPosicaoDaIezimaOcorrencia
            System.out.println("\nA posição da 2ª vez que a letra 'e' aparece é: " +
                                palavra.getPosicaoDaIezimaOcorrencia(2, 'e')); // String (aspas duplas) enquanto char (aspas simples) 

            // testando método equals
            if (palavra.equals(new Palavra("elefante"))) {
                System.out.println("\nObject e palavra são iguais!");
            }
            else {
                System.out.println("\nObject e palavra não são iguais :P");
            }

            // testando método hashCode
            System.out.println("\nhashCode de Palavra: " + palavra.hashCode());

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}