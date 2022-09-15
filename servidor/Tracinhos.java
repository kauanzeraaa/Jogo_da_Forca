package servidor;
public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd < 0) throw new Exception("Quantidade inserida não é válida");
        
        char vetorTexto[] = new char[qtd];
        this.texto = vetorTexto;

        for (int i = 0; i<this.texto.length; i++) {
            this.texto[i] = '_';

        }
		
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if (posicao < 0 || posicao >= this.texto.length) {
            throw new Exception();
        }
        this.texto[posicao] = letra;
        
		
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_')
                return true;
        }
        return false;
        
    }

    public String toString ()
    {
        String todosOsCaracteres = "";
        for (int i = 0; i < this.texto.length; i++) {
            todosOsCaracteres += this.texto[i] + " ";
        }
        return todosOsCaracteres;
        
    }

    public boolean equals (Object obj) 
    {
        if (this == obj) return true;
        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        Tracinhos t = (Tracinhos)obj;
        if (this.texto.length != t.texto.length) return false;
        
        return true;
        
    }

    public int hashCode ()
    {
        int hash = 2;
        hash = 2 * 3 + new String (this.texto).hashCode();
        if(hash < 0) hash = - hash; 
        return hash;
    }

    public Tracinhos (Tracinhos t) throws Exception 
    {
        char vetorTexto2[] = t.texto;
        this.texto = vetorTexto2;
        
    }

    public Object clone () 
    {
        try {
            return new Tracinhos(this);
        } catch (Exception e) {
            return null;
        }
    }
}
