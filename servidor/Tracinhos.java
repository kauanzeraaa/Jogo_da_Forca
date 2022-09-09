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

            //System.out.print(this.texto[i]);
        }
		// verifica se qtd n�o � positiva, lan�ando uma exce��o.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if (posicao < 0 || posicao >= this.texto.length) {
            throw new Exception();
        }
        this.texto[posicao] = letra;
        
		// verifica se posicao � negativa ou ent�o igual ou maior
		// do que this.texto.length, lan�ando uma exce��o.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_')
                return true;
        }
        return false;
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        String todosOsCaracteres = "";
        for (int i = 0; i < this.texto.length; i++) {
            todosOsCaracteres += this.texto[i] + " ";
        }
        return todosOsCaracteres;
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
    }

    public boolean equals (Object obj) 
    {
        if (this == obj) return true;
        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        Tracinhos t = (Tracinhos)obj;
        if (this.texto != t.texto) return false;
        
        return true;
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int hash = 2;
        hash = 2 * 3 + new String (this.texto).hashCode();
        if(hash < 0) hash = - hash; 
        return hash;
        // calcular e retornar o hashcode de this
    }

    // construtor de cópia
    public Tracinhos (Tracinhos t) throws Exception 
    {
        char vetorTexto2[] = t.texto;
        this.texto = vetorTexto2;
        // faIz ai brunaum 

        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
    }

    public Object clone () // ASSISTIR A AULA DO MALIGNO CLONE 
    {
        int obj = 0; // SÓ PRA PARAR DE DAR ERRO - APAGAR DEPOIS - 
        return obj;
        // retornar uma copia de this
    }
}
