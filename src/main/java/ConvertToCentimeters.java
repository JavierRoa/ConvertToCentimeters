public class ConvertToCentimeters {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6) + " cm");
        System.out.println(convertToCentimeters(6,5) + " cm");
    }
    // Método que convierte las pulgadas en centímetros
    private static double convertToCentimeters(int alturaPulgadas) {
        return alturaPulgadas * 2.54;
    }
    /* Método que llama al método anterior para convertir en centímetros el resultado
       una conversión de la altura en pies y pulgadas, a solo pulgadas */
    private static double convertToCentimeters(int alturaPies, int pulgadasRestantes) {
        return convertToCentimeters((alturaPies * 12) + pulgadasRestantes);
    }
}
