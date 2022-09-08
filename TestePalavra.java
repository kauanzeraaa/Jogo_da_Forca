public class TestePalavra {
    public static void main (String  args[]) {
        
        try {
            System.out.println("ss");
            String texto = "elefante";
            Palavra palavra = new Palavra(texto);
            
            // testando método getPosicaoDaIezimaOcorrencia
            System.out.println(palavra.getPosicaoDaIezimaOcorrencia(2, 'e')); // String (aspas duplas) enquanto char (aspas simples) 

            // testando método equals
            if (palavra.equals(new Palavra("elefante"))) {
                System.out.println("Object e palavra são iguais!");
            }
            else {
                System.out.println("Object e palavra não são iguais :P");
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}