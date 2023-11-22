package ejercicio3_6;
    public class Tienda {
        String nombre;
        String propietario;
        int identificadorTributario;
        Computador [] computadores;
        static int numeroComputadores;

        public Tienda(String nombre, String propietario, int identificadorTributario, int tamaño) {
            if (tamaño < 1) {
                System.out.println("Cantidad de computadores insuficientes.");
            } else {
                this.nombre = nombre;
                this.propietario = this.propietario;
                this.identificadorTributario = identificadorTributario;
                computadores = new Computador[tamaño];
                numeroComputadores = 0;
            }
        }

        public boolean tiendaLlena() {
            return numeroComputadores == computadores.length;
        }

        public boolean tiendaVacia(Computador computador1) {
            return numeroComputadores == 0;
        }

        public void añadir(Computador computador) {
            if (tiendaLlena()) {
                System.out.println("La tienda está llena. No se puede añadir elemento.");
            } else {
                computadores[numeroComputadores] = computador;
                numeroComputadores++;
            }
        }

        public boolean eliminar(String marcaComputador) {
            int pos = buscar(marcaComputador);
            if (pos < 0) {
                return false;
            }
            for (int i = pos; i < numeroComputadores; i++) {
                computadores[i] = computadores[i + 1];
            }
            numeroComputadores--;
            return true;
        }

        public int buscar(String marcaComputador) {
            for (int i = 0; i < numeroComputadores; i++) {
                if (computadores[i].marca.equals(marcaComputador))
                    return i;
            }
            return 1;
        }
        public void imprimir () {
            for (int i = 0; i < numeroComputadores; i++) {
                System.out.println("Computador" + i);
                System.out.println("Marca = " + computadores[i].marca);
                System.out.println("Cantidad de memoria = " + computadores[i].cantidadMemoria);
                System.out.println("Características del procesador = " + computadores[i].característicasProcesador);
                System.out.println("Sistema operativo = " + computadores[i].sistemaOperativo);
                System.out.println("Precio = " + computadores[i].precio);
            }
        }

        public  void imprimirTienda(){
            System.out.println("Nombre :"+nombre);
            System.out.println("Propietario :"+propietario);
            System.out.println("IdentificadorTributario"+identificadorTributario);
        }
}
