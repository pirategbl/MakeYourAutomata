package teste;

public class Estado implements Cloneable
{
    int tipo;                           //0 é estado inicial, 1 é estado normal, 2 é estado final
    String nomeDoEstado;                //qo, q1, q2,(...),qf
    
    public Estado()
    {
        
    }
    public void editarEstado(int tipo, String nome)
    {
        this.tipo = tipo;
        this.nomeDoEstado = nome;
    }
    
    public Object clone() 
    {
        try 
        {
            return (Estado)super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            // This should never happen
        }
        return 0;
    }

    void printStackTrace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
