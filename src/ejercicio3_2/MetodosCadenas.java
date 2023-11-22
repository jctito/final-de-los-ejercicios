package ejercicio3_2;

    public class MetodosCadenas {
        public static int Mayusculas1(String cadena) {
            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                if (Character.isUpperCase(caracter)) {
                    contador++;
                }
            }
            return contador;
        }

        public static int Letra1(String texto, char letra) {
            int contador = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (Character.toLowerCase(caracter) == Character.toLowerCase(letra)) {
                    contador++;
                }
            }
            return contador;
        }

        public static void EspaciosEliminados(String cadena) {
            String EspacosEliminados = cadena.replaceAll(" ", "");
            System.out.println("Cadena sin espacios: " +EspacosEliminados);
        }

        public static String CadenaAlReves(String cadena) {
            StringBuilder reverso = new StringBuilder(cadena);
            return reverso.reverse().toString();
        }
    }