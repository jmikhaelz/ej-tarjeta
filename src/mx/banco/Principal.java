package mx.banco;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import mx.banco.herramientas.LimpiarConsola;
import mx.banco.operaciones.Compra;
import mx.banco.operaciones.Tarjeta;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        new LimpiarConsola().start();

        System.out.println("===================================");
        System.out.println("       Bienvenido/a Usuario");
        System.out.println("===================================");
        System.out.println("Seleccione el tipo de tarjeta:");
        System.out.println("  [0] Crédito");
        System.out.println("  [1] Débito");
        System.out.print("Opción seleccionada: ");
        int tipo = in.nextInt();

        System.out.print("Ingrese el monto disponible en su tarjeta: $ ");
        double limite = in.nextDouble();

        Tarjeta tarjeta = new Tarjeta(tipo, limite);
        
        while (true) {

            new LimpiarConsola().start();

            System.out.print("Ingrese el nombre del artículo que desea comprar: ");
            String nombre = in.next();

            System.out.print("Ingrese el costo del artículo: $");
            double costo = in.nextDouble();

            Compra articulo = new Compra(nombre, costo);

            if (tarjeta.addCompra(articulo)) {
                System.out
                        .println("\n✅ Compra realizada con éxito: " + nombre + " por $" + String.format("%.2f", costo));

                if (tarjeta.getSaldo() == 0)
                    break;

                System.out.print("¿Desea realizar otra compra? (Tecla [Y] para salir, cualquier otra tecla para continuar) + Enter: ");
                String opcion = in.next();
                if (opcion.equalsIgnoreCase("Y")) {
                    break;
                }
            } else {
                System.out.println("\n❌ No se pudo completar la compra.");
                tarjeta.status();
                System.out.println("Motivo: saldo en tarjeta de " +
                        (tarjeta.getTipo() == 0 ? "crédito" : "débito") + " insuficiente.");
                break;
            }

        }
        new LimpiarConsola().start();
        List<Compra> historial = tarjeta.getHistorialDeCompras();
        Collections.sort(historial);
        historial.sort(Comparator.comparing(Compra::getCosto));
        int totalCompras = historial.size();
        double totalGastado = 0;

        System.out.println("\n===================================");
        System.out.println("  Lista de Compras Realizadas");
        System.out.println("===================================");
        if (totalCompras == 0) {
            System.out.println("No se realizaron compras.");
        } else {
            System.out.println(" Artículo\t|\tCosto");
            for (Compra compra : historial) {
                System.out.println("-\t" + compra);
                totalGastado += compra.getCosto();
            }
            System.out.println("-----------------------------------");
            System.out.println("Total de compras realizadas : " + totalCompras);
            System.out.printf("Total gastado         : $%.2f\n", totalGastado);
        }
        tarjeta.status();

    }
}