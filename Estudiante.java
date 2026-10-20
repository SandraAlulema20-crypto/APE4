public class Estudiante {
    String nombre;
    double nota1, nota2, nota3, promedio;

    public static void main(String[] args) {
        String[] nombres = {"Daniel", "Luis", "Manuel", "Gabriel", "Juliet"};
        double[][] notas = {
            {9, 8, 10}, {6, 5, 6}, {3, 4, 4},
            {7, 8, 9}, {5, 6, 5}
        };
        int aprobados = 0;

        for (int i = 0; i < 5; i++) {
            Estudiante e = new Estudiante();
            e.nombre = nombres[i];
            e.nota1 = notas[i][0];
            e.nota2 = notas[i][1];
            e.nota3 = notas[i][2];
            e.promedio = (e.nota1 + e.nota2 + e.nota3) / 3;

            System.out.println(e.nombre + " : " + e.promedio);

            if (e.promedio >= 7) {
                System.out.println("Aprobado");
                aprobados++;
            } else if (e.promedio >= 5) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        }

        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}

   