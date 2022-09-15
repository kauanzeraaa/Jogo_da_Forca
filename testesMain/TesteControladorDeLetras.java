package testesMain;

import servidor.ControladorDeLetrasJaDigitadas;

public class TesteControladorDeLetras {
    public static void main (String args[]) {
        try {
            
            ControladorDeLetrasJaDigitadas controladorLetras = new ControladorDeLetrasJaDigitadas();
            
            // testando registre
            char letra = 'e';
            controladorLetras.registre(letra);
            letra = 'k';
            controladorLetras.registre(letra);


            // testando isJaDigitada() 
            if (controladorLetras.isJaDigitada((letra))) {
                System.out.println("A letra '" + letra + "' já foi digitada");
            }
            else {
                System.out.println("A letra '" + letra + "' ainda não foi digitada");
            }
            
            // testando toString() 
            System.out.println("Todos os caracteres já digitados: " + controladorLetras.toString());

            // testando equals()
            if (controladorLetras.equals(new ControladorDeLetrasJaDigitadas())) 
                System.out.println("This e obj são iguais");
                                                                         
            else {
                System.out.println("This e obj não são iguais");
            }

             // testando método hashCode
             System.out.println("\nhashCode de ControladorDeLetrasJaDigitadas: " + controladorLetras.hashCode());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
