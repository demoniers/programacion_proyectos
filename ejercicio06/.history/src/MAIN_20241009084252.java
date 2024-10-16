
public class MAIN {
    public static void main(String[] args) throws Exception {
        Ejercicio ejercicio = new Ejercicio(001,"Ejercicio 1");
        Nivel level = new Nivel(001,"Facil");
        Contenido content = new Contenido(001,"Java 1", "Este es un ejercicio de java sencillo en le que debes hacer un 'Hellow World'.");
        Categoria categoria = new Categoria(001,"Programacion");
        System.out.printf("%s%n%s%n%s%n%s%n",ejercicio,level,content,categoria);
    }
}