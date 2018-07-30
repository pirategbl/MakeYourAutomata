package teste;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import static teste.Teste.automato;

public class Automato implements Serializable
{
    List<Character> alfabeto;
    List<Estado> estados;
    List<Transicao> transicoes;
    public Automato()
    {
        alfabeto = new ArrayList<Character>();
        estados = new ArrayList<Estado>();
        transicoes = new ArrayList<Transicao>();
    }
    public void mostrarAutomato()
    {
        int i;
        for(i = 0; i < automato.transicoes.size(); i++)
        {
            System.out.println("Com " + this.transicoes.get(i).palavras);
            System.out.println("Sai de: " + this.transicoes.get(i).estadoQueVem.nomeDoEstado);
            System.out.println("Vai para: " + this.transicoes.get(i).estadoQueVai.nomeDoEstado);
            
            System.out.println("\n");
        }
    }
    protected void getDelta()
    {
        //Delta é um algoritmo
    }
    protected void getAlfabeto()
    {
        int i, j;
        
        for(i = 0; i < transicoes.size(); i++)
        {
            for(j = 0; j < transicoes.get(i).palavras.length(); j++)
            {
                alfabeto.add(transicoes.get(i).palavras.charAt(j));
            }
        }
        for(i = 0; i < alfabeto.size(); i++)
            {
                for(j = i + 1; j < alfabeto.size(); j++)
                {
                    if(alfabeto.get(i).equals(alfabeto.get(j)))
                    {
                        alfabeto.remove(j);
                    }   
                }  
            }
    }
    public void criarEstado(Estado estado)
    {
            estados.add(estado);
    }
}