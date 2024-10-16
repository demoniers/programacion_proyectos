public class MAIN {
    public static void main(String[] args) throws Exception {
        // Nivel y categoria
        Nivel levelF = new Nivel(001,"Facil");
        Nivel levelM = new Nivel(002,"Medio");
        Nivel levelD = new Nivel(003,"Dificil");
        Ejercicio ejercicio = new Ejercicio(001, "Ejercicio 10","Quiero patatas",levelF);
        
        // Ahora puedes acceder a las propiedades del ejercicio
        System.out.printf("%s%n",ejercicio);
        System.out.printf("%nHubo un error%n");
        ejercicio.setNivel(levelD);
        System.out.printf("%s%n",ejercicio);
        
    }
}