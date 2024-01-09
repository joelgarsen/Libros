
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    
    private String titulo;
    
    private int numeroPaginas;
    
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro,int numeroDePaginasDelLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginasDelLibro;
        numeroReferencia = "A1OB";
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getPaginas(){
        return numeroPaginas;
    }
    
    public void setNuevoNumeroReferencia (String nuevaReferencia){
        numeroReferencia = nuevaReferencia;
    }
    
    public String getDetalles(){
        return "Título: " + titulo +", "+ "Autor: " + autor +", "+ "Páginas: " + numeroPaginas +", "+ "Referencia: " + numeroReferencia;
    }
    
    public void imprimirDatosAutor(){
        System.out.println("Autor: " + autor);
    }
    
    public void imprimirDatosLibro(){
        System.out.println("Titulo: " + titulo);
    }
    
    public void imprimirDatosGenerales(){
        System.out.println("Título: " + titulo +", "+ "Autor: " + autor +", "+ "Páginas: " + numeroPaginas +", "+ "Referencia " + numeroReferencia);
    }
}
