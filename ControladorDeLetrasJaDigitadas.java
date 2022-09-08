public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = " ";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        boolean torna = false;
        int contador = 0;
        for (i = 0; letrasJaDigitadas.charAt(); i++)
        {
            if(letrasJaDigitadas.charAt(i) == letras)
            {
                contador ++;
            }
        }

        // CONTINUAR PROGRAMANDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre (char letra) throws Exception
    {
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
        return "bruno";
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj s�o iguais
        return true;
        
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return 2;
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de c�pia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone (Object x)
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        return x;
    }
}
