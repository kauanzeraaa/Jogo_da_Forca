package testesMain;

import java.util.ResourceBundle.Control;

import servidor.ControladorDeErros;

public class TesteControladorDeErros {
    public static void main (String args[]) {
        try {
            int qtdMax = 10;
            ControladorDeErros controladorDeErros = new ControladorDeErros(qtdMax);

            // testando isAtingidoMaximoDeErros()
            if (controladorDeErros.isAtingidoMaximoDeErros()) 
                System.out.println("Qauntidade máxima de erros atingida");
            else 
                System.out.println("Quantidade máxima ainda não atingida");
            
            // testando toString()
            System.out.println("Erros já cometidos: " + controladorDeErros.toString());

            // testando hashCode()
            System.out.println("Amostra do hashCode: " + controladorDeErros.hashCode());
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}