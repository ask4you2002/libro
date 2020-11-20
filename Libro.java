
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
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
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
    public void  imprimeAutor() {
        System.out.println(""+ autor +"");
    }
    public void  imprimeTitulo() {
        System.out.println(""+ titulo +"");
    }
}
