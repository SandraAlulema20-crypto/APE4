public class Biblioteca {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "El Perfume";

        Libro l2 = new Libro();
        l2.titulo = "Harry Potter";

        Libro l3 = new Libro();
        l3.titulo = "Orgullo y Prejuicio";

        Libro l4 = new Libro();
        l4.titulo = "Sandy";

        Socio s1 = new Socio();
        s1.nombre = "Sandy";

        Socio s2 = new Socio();
        s2.nombre = "Emilio";

        l1.disponible = false;
        l2.disponible = false;
        s1.librosPrestados = 2;

        l3.disponible = false;
        s2.librosPrestados = 1;

        Libro[] libros = {l1, l2, l3, l4};
        int disponibles = 0;

        for (Libro l : libros) {
            System.out.println(l.titulo + " : " +
                (l.disponible ? "Disponible" : "Prestado"));

            if (l.disponible) {
                disponibles++;
            }
        }

        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);
        System.out.println("Libros disponibles: " + disponibles);
    }
}