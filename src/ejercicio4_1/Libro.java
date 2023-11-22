package ejercicio4_1;
    public class Libro {
        private String titulo;
        private String autor;
        private double precio;

        public Libro(String titulo, String autor, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void mostrarInformacion() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Precio: $" + precio);
        }
    }

    class LibroDeTexto extends Libro {
        private String curso;

        public LibroDeTexto(String titulo, String autor, double precio, String curso) {
            super(titulo, autor, precio);
            this.curso = curso;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Curso: " + curso);
        }
    }

    class LibroDeTextoUNAL extends LibroDeTexto {
        private String facultad;

        public LibroDeTextoUNAL(String titulo, String autor, double precio, String curso, String facultad) {
            super(titulo, autor, precio, curso);
            this.facultad = facultad;
        }

        public String getFacultad() {
            return facultad;
        }

        public void setFacultad(String facultad) {
            this.facultad = facultad;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Facultad: " + facultad);
        }
    }

    class Novela extends Libro {
        private String tipo;

        public Novela(String titulo, String autor, double precio, String tipo) {
            super(titulo, autor, precio);
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Tipo: " + tipo);
        }
}
