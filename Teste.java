package teste;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Teste 
{
    static Automato automato;
    public static void main(String[] args) throws FileNotFoundException, Exception 
    {
        SalvarAbrir io = new SalvarAbrir();
        File file = new File("C:/temp/MakeYourAutomata/automato.xml");
        /*if (!file.exists()) 
        {*/
            automato = new Automato();
            

            Estado e = new Estado();
            Transicao t = new Transicao();

            e.editarEstado(0, "qo");
            automato.criarEstado((Estado) e.clone());
            e.editarEstado(1, "q1");
            automato.criarEstado((Estado) e.clone());
            e.editarEstado(1, "q2");
            automato.criarEstado((Estado) e.clone());
            e.editarEstado(2, "q3");
            automato.criarEstado((Estado) e.clone());

            t.createTransition(automato.estados.get(0), automato.estados.get(1), "A");
            automato.transicoes.add((Transicao) t.clone());
            
            t.createTransition(automato.estados.get(0), automato.estados.get(0), "D");
            automato.transicoes.add((Transicao) t.clone());

            t.createTransition(automato.estados.get(1), automato.estados.get(2), "A");
            automato.transicoes.add((Transicao) t.clone());

            t.createTransition(automato.estados.get(2), automato.estados.get(3), "B");
            automato.transicoes.add((Transicao) t.clone());

            automato.getAlfabeto();
            io.gerarXml(automato);
        /*}
        else
            automato = io.lerXml();*/
       
        automato.mostrarAutomato();
        
    }
    
}
