package testesMain;

import servidor.ControladorDeLetrasJaDigitadas;

public class TesteControladorDeLetras {
    public static void main (String args[]) {
        try {
            char letrasJaDigitadas = 'e';
            ControladorDeLetrasJaDigitadas controladorLetras = new ControladorDeLetrasJaDigitadas();
            
            // testando isJaDigitada() 
            char letra = 'e';
            if (controladorLetras.isJaDigitada((letra))) {
                System.out.println("A letra" + letra + " já foi digitada");
            }
            else {
                System.out.println("A letra " + letra + " ainda não foi digitada");
            }

            // testando registre
            
            // testando toString() 
            System.out.println("Todos os caracteres já digitados: ");

            // testando equals()
            if (controladorLetras.equals(new ControladorDeLetrasJaDigitadas())) {
                System.out.println("This e obj são iguais");
            }
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
