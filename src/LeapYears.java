public class LeapYears {
    public static boolean isLeapYear(int year) {
            if (year % 100 != 0 && year % 4 == 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else return false;
    }
    public static void main(String [] args) {
        int anio = 2019;
        boolean resultado = isLeapYear(anio);
        System.out.println(resultado);
    }
}