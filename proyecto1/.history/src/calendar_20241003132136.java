import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {
    // COLORES
    public static final String ANSI_RESET = "\u001B[0m"; // default
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_Negro = "\033[30m";
    public static final String ANSI_Rojo = "\033[31m";
    public static final String ANSI_Verde = "\033[32m";
    public static final String ANSI_Amarillo = "\033[33m";
    public static final String ANSI_Azul = "\033[34m";
    public static final String ANSI_Magenta = "\033[35m";
    public static final String ANSI_Cian = "\033[36m";
    public static final String ANSI_Blanco = "\033[37m";
    // fondo de colores
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // SALIDA X PANTALLA
    public static void main(String[] args) {
        // Crear una instancia de Calendar para el mes actual
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DAY_OF_MONTH); // N de dia

        // Establecer el calendario al primer día del mes
        calendar.set(year, month, 1);

        // Obtener el día de la semana del primer día del mes
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Obtener el número de días en el mes
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Imprimir el encabezado del calendario
        System.out.println("Lun Mar Mie Jue Vie Sab Dom");

        // Imprimir espacios en blanco para los días antes del primer día del mes
        for (int i = Calendar.MONDAY; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Imprimir los días del mes
        for (int day = 1; day <= daysInMonth; day++) {
           /* if (day == taskday) {

            } else  */ if (day == date) {
                System.out.printf(ANSI_PURPLE_BACKGROUND + ANSI_Cian + "%3d " + ANSI_RESET, day); // BUSCAR COMO COLERAR EL RESULTADO 
            } else {
                System.out.printf("%3d ", day);
            }

            // Salto de línea al final de la semana
            if ((day + firstDayOfWeek - 2) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
