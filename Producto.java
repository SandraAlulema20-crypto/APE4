public class Producto {

    String nombre;
    double precio;
    int stock;

    public static void main(String[] args) {
        Producto[] p = {
            new Producto(), new Producto(),
            new Producto(), new Producto()
        };

        String[] nombres = {"Arroz", "Leche", "Pan", "Aceite"};
        double[] precios = {1.50, 1.00, 0.50, 3.00};
        int[] stocks = {8, 6, 4, 10};

        for (int i = 0; i < 4; i++) {
            p[i].nombre = nombres[i];
            p[i].precio = precios[i];
            p[i].stock = stocks[i];
        }

        p[0].stock -= 3;
        p[1].stock -= 3;
        double total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print(p[i].nombre + " : " + p[i].precio);
            if (p[i].stock < 5) System.out.print(" Reponer");
            System.out.println(" Stock: " + p[i].stock);
            total += p[i].precio * p[i].stock;
        }

        System.out.println("Total inventario: " + total);
    }
}

