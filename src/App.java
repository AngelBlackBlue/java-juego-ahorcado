import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Clase escaner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Decalaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentoMaximo = 10;
        int intentos = 0;
        boolean isAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!isAdivinada && intentos < intentoMaximo) {
            System.out.println("Palabras adivinadas: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor");
            // String.valueOf(letrasAdivinadas)) ESTO SE USA CUANDO TENEMOS UN ARRAY DE CHARS
            // clase escaner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                // estructura de control
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! te queda " + (intentoMaximo - intentos + " intentos,"));

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                isAdivinada = true;
                System.out.println("¡Felicidades, has adivinido la palabra secreta: " + palabraSecreta);

            }

        }

        if (!isAdivinada) {
            System.out.println("¡Qué pena te has quedado sin intentos! GAME OVER");

        }
        //cierra el scanner
        scanner.close();

    }
}
