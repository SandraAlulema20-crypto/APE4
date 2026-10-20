public class Mascota {
    String nombre, especie;
    int edad;
    double peso;

    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Luka"; m1.especie = "Gato";
        m1.edad = 3; m1.peso = 26;

        Mascota m2 = new Mascota();
        m2.nombre = "Moon"; m2.especie = "Reptil";
        m2.edad = 4; m2.peso = 20;

        Mascota m3 = new Mascota();
        m3.nombre = "Juliet"; m3.especie = "Roedor";
        m3.edad = 2; m3.peso = 17;

        Mascota[] mascotas = {m1, m2, m3};

        for (Mascota m : mascotas) {
            System.out.print(m.nombre + " : " + m.especie + " : " + m.peso);
            if (m.peso > 20) System.out.print(" Revisar peso");
            System.out.println();
        }

        Mascota m4 = m1;
        m4.edad++;
        System.out.println("Edad de Luka: " + m1.edad);
        // m4 y m1 apuntan al mismo objeto.
    }
}