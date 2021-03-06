/**
 * classe que faz teste de String 
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class TesteString
{
    public static void main(String args[]) { 
    //String é uma classe do Java
    //portanto as variáveis são "objetos"...
    
    String texto1 = "texto de teste e coisa e tal";
    String texto2 = new String("outro texto bla bla bla");
    
    System.out.println( texto1.toUpperCase() );
    System.out.println( texto1.substring(5,10) );
    System.out.println( texto1.equals("asdf") );
    System.out.println( texto1.charAt(15) );
    
    //declaramos um vetor (array) usando colchetes
    //no Java, temos vetor comtipos definidos
    String[] vetor = texto1.split(" ");
    System.out.println( vetor[4] );
    }
}
