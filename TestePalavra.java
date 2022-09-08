public class TestePalavra {
    public static void main (String  args[]) {
        
        try {
            System.out.println("ss");
            String texto = "aaeee";
            Palavra palavra = new Palavra(texto);
            System.out.println(palavra.getPosicaoDaIezimaOcorrencia(2, 'e')); // String (aspas duplas) enquanto char (aspas simples)
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}