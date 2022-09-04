public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		// verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
    }

    public void revele (int posicao, char letra) throws Exception
    {
		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        // retornar uma copia de this
    }
}
