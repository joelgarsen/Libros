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
    
    private int vecesPrestado;
    
    private boolean libroTexto;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro,int numeroDePaginasDelLibro,boolean esLibroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginasDelLibro;
        numeroReferencia ="";
        vecesPrestado = 0;
        this.libroTexto = esLibroTexto;
    }
    
    public boolean getEsLibroDeTexto() {
        return libroTexto;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public void prestar (){
        vecesPrestado++;
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
        if (nuevaReferencia.length() >= 3){
            numeroReferencia = nuevaReferencia;
        }
        else {
            System.out.println("Error el numero de referencia necesita al menos 3 caracteres");
        }
    }
    
    public String getDetalles(){
        String referencia = (numeroReferencia.equals("")) ? "--" : numeroReferencia;
        
        String texto = libroTexto ? "Es libro de texto" : "No es libro de texto";
    
        return "T�tulo: " + titulo +", "+ "Autor: " + autor +", "+ "P�ginas: " + numeroPaginas +", "+ "Referencia: " + referencia +", "+ "Prestamos: " + vecesPrestado + "|" + texto;
    }
    
    public void imprimirDatosAutor(){
        System.out.println("Autor: " + autor);
    }
    
    public void imprimirDatosLibro(){
        System.out.println("Titulo: " + titulo);
    }
    
    public void imprimirDatosGenerales(){
        String referencia = (numeroReferencia.equals("")) ? "--" : numeroReferencia;
        
        String texto = libroTexto ? "Es libro de texto" : "No es libro de texto";
        
        System.out.println("T�tulo: " + titulo +", "+ "Autor: " + autor +", "+ "P�ginas: " + numeroPaginas +", "+ "Referencia: " + referencia +", "+ "Prestamos: " + vecesPrestado + "|" + texto);
    }
}
