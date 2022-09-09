package servidor;
public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    /* FEITO */
    public ControladorDeLetrasJaDigitadas () 
    {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    /* FEITO */
    public boolean isJaDigitada (char letra) 
    {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            if(letrasJaDigitadas.charAt(i) == letra)
                return true;            
        }
        return false;

        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    /* FEITO */
    public void registre (char letra) throws Exception
    {
        if(this.isJaDigitada(letra)) throw new Exception ("A letra fornecida já foi digitada");
        System.out.println(this.letrasJaDigitadas + letra);

		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    /* FEITO */
    public String toString()
    {
        String todosOsCaracteres = "";
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            todosOsCaracteres += this.letrasJaDigitadas.charAt(i) + " ";
        }
        return todosOsCaracteres;
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
    }

    /* CONFERIR */
    public boolean equals (Object obj) 
    {
        if (this == obj) return true; 
        if (obj == null) return false; 

        return false; // logo tem que retornar false 

        
        // verificar se this e obj s�o iguais
    }

    /* FEITO */
    public int hashCode ()
    {
        int hash = 3;
        hash = 2 * 3 + new String (this.letrasJaDigitadas).hashCode();
        if(hash < 0) hash = - hash;
        return hash;

        // calcular e retornar o hashcode de this
    }

    /* FEITO */
    // construtor de copia 
    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception 
    {
        controladorDeLetrasJaDigitadas.letrasJaDigitadas = this.letrasJaDigitadas;
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone (Object x)
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        return x;
    }
}
