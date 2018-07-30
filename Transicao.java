package teste;

public class Transicao implements Cloneable
{
    String palavras; //ABC
    Estado estadoQueVem, estadoQueVai; 
    
    public void createTransition(Estado vem, Estado vai, String p/*, int xPalavra, int yPalavra*/)
    {
        this.palavras = p;
        this.estadoQueVem = vem;
        this.estadoQueVai = vai;
    }
    public Object clone() 
    {
        try 
        {
            return (Transicao)super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            // This should never happen
        }
        return 0;
    }
}
