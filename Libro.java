
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String mensaje;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        if (numeroReferencia == ""){
            numeroReferencia = "ZZZ";
        }
    }

    public String getAutorLibro(){
        return autor;
    }

    public String getTituloLibro(){
        return titulo;
    }

    public int getPaginas(){
        return numeroPaginas;
    }
    
    public String  getDetalles(){
        return mensaje = "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: " + numeroReferencia + "";
    }
        
    public String getNumeroReferencia(){
        return numeroReferencia;
    }   
        
    public void setNumeroReferencia(String numeroReferencia){
        if (numeroReferencia.length() < 3){
            System.out.println("Error: numero de referencia como minimo 3 caracteres.");
        }
        else {
            this.numeroReferencia = numeroReferencia;
        }
    }
        
    public void  imprimirDetalles(){ 
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: " + numeroReferencia + "");
    }
    
    public void  imprimeAutor() {
        System.out.println(""+ autor +"");
    }
    
    public void  imprimeTitulo() {
        System.out.println(""+ titulo +"");
    }
}
