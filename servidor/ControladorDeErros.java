package servidor;
public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr = 0;

    /* FEITO */
    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax < 0) throw new Exception();
        qtdMax = this.qtdMax;
		// verifica se qtdMax fornecida n�o � positiva, lan�ando
		// uma exce��o.
		// armazena qtdMax fornecida em this.qtdMax.
    }

    /* CONFERIR */
    public void registreUmErro () throws Exception
    {
        if(this.qtdErr == this.qtdMax) throw new Exception();
        this.qtdErr = this.qtdMax;
        // verifica se this.qtdErr ja � igual a this.qtdMax, 
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    /* FEITO */
    public boolean isAtingidoMaximoDeErros()
    {
        if (this.qtdErr == this.qtdMax) return true;
        return false;   
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals(Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        return true;
    }

    /* Boa sorte kauan, jóia */
    public int hashCode()
    {
        int hash = 2;
        hash = 2 * 3 + new int (this.qtdMax).hashCode();        
        hash = 2 * 3 + Byte.valueOf (this.qtdErr).hashCode();   
        if(hash < 0) hash = - hash;
        return hash;
        return 2;
    }

    /* FEITO */
    // construtor de cópia
    public ControladorDeErros (ControladorDeErros c) throws Exception 
    {
        c.qtdMax = this.qtdMax;
        c.qtdErr = this.qtdErr;
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone(Object x) // Remover x kakakak eu que adicionei 
    {
        // returnar uma c�pia de this
        return x;
    }
}
