
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
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        String mensaje = "";
        if (numeroReferencia == ""){
            mensaje = "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: ZZZ, Veces prestado: " + vecesPrestado + "";
        }
        else {
            mensaje = "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: " + numeroReferencia + "";
        }
        return mensaje; 
    }
        
    public String getNumeroReferencia(){
        return numeroReferencia;
    }   
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
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
        if (numeroReferencia == ""){
            System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: ZZZ, Veces prestado: " + vecesPrestado +"");
        }
        else {
            System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero referencia: " + numeroReferencia + " ,Veces prestado: " + vecesPrestado +"");
        }
    }
    
    public void  imprimeAutor() {
        System.out.println(""+ autor +"");
    }
    
    public void  imprimeTitulo() {
        System.out.println(""+ titulo +"");
    }
}
