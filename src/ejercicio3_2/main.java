package ejercicio3_2;

    public class main {
        public static void main(String args[]) {
            Cadena cadena = new Cadena();
            int longitud = cadena.cadenaInicial.length();
            System.out.println("La longitud del String es = " + longitud);
            String cadenaSinEspacios = cadena.cadenaInicial.trim();
            System.out.println("El String sin espacios en blanco = " + cadenaSinEspacios);
            String cadenaMayuscula = cadenaSinEspacios.toUpperCase();
            System.out.println("El String en mayúscula = " + cadenaMayuscula);
            String cadenaConcatenada = cadenaMayuscula.concat("12345");
            System.out.println("El String concatenado = " + cadenaConcatenada);
            String cadenaExtraida = cadenaConcatenada.substring(24, 31);
            System.out.println("El String extraído = " + cadenaExtraida);
            String cadenaReemplazada = cadenaExtraida.replace("O", "X");
            System.out.println("El String reemplazado = " + cadenaReemplazada);
            boolean comparacion = cadenaReemplazada.equals("Programación");
            System.out.println("Los String son iguales = " + comparacion);
            System.out.println("------------------------------------");

            MetodosCadenas contador = new MetodosCadenas();

            String texto = cadena.cadenaInicial;
            int mayusculas = contador.Mayusculas1(texto);
            System.out.println("Número de mayúsculas: " + mayusculas);

            char letra = 'a';
            int veces = contador.Letra1(texto, letra);
            System.out.println("La letra '" + letra + "' aparece " + veces + " veces en el texto.");

            String textoSinEspacios = cadena.cadenaInicial;
            contador.EspaciosEliminados(textoSinEspacios);

            String textoInvertido = contador.CadenaAlReves(texto);
            System.out.println("Texto invertido: " + textoInvertido);

        }
    }

