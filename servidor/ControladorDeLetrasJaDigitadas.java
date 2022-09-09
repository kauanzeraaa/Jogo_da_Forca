package servidor;
public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas () 
    {
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra) 
    {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            if(letrasJaDigitadas.charAt(i) == letra)
                return true;            
        }
        return false;

        
    }

    
    public void registre (char letra) throws Exception
    {
        if(this.isJaDigitada(letra)) throw new Exception ("A letra fornecida já foi digitada");
        this.letrasJaDigitadas += letra;

		
    }

    public String toString()
    {
        String todosOsCaracteres = "";
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            todosOsCaracteres += this.letrasJaDigitadas.charAt(i) + ", ";
        }
        return todosOsCaracteres;
		
    }

    public boolean equals (Object obj) 
    {
        if (this == obj) return true; 
        if (obj == null) return false; 

        return false; 
    }

    public int hashCode ()
    {
        int hash = 3;
        hash = 2 * 3 + new String (this.letrasJaDigitadas).hashCode();
        if(hash < 0) hash = - hash;
        return hash;

    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception 
    {
        controladorDeLetrasJaDigitadas.letrasJaDigitadas = this.letrasJaDigitadas;
    }

    public Object clone (Object x)
    {
        try {
            return new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception e) {
            return null;
        }
    }
}
