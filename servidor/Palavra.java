package servidor;
public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if (texto != null && texto != "") {
            this.texto = texto;
        }
        else {
            throw new Exception("[ERRO] Texto não declarado");
        }
		
    }

    public int getQuantidade (char letra) 
    {
        int qtdLetra = 0;
        for (int k = 0; k<this.texto.length(); k++) {
            if (letra == this.texto.charAt(k)) {
                qtdLetra ++;
            }
        }
        return qtdLetra;
    } 

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int contador = -1;
        for (int k = 0; k<this.texto.length(); k++) { 

            if (letra == this.texto.charAt(k)) { 
                contador ++;
            }
            if (contador == i) {
                return k;
            }
        }
        throw new Exception("[ERRO] A iézima ocorrência da letra inserida não é válida");
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj) 
    {
        if (this == obj) return true;
        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        Palavra p = (Palavra)obj;
        if (this.texto != p.texto) return false;
        
        return true;
    }

    public int hashCode ()
    {
        int hash = 2;
        hash = 2 * 3 + new String (this.texto).hashCode();
        if(hash < 0) hash = - hash;  
        return hash;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
