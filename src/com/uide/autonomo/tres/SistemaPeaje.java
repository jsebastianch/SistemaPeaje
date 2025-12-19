package com.uide.autonomo.tres;

import com.uide.autonomo.tres.modelo.Camion;
import com.uide.autonomo.tres.modelo.Carro;
import com.uide.autonomo.tres.modelo.Moto;
import com.uide.autonomo.tres.modelo.Peaje;

/**
 * Clase principal que ejecuta el sistema de peaje.
 * Permite crear un peaje, registrar vehículos y mostrar el total recaudado.
 */
public class SistemaPeaje {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Peaje peaje = null;
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear peaje");
            System.out.println("2. Añadir Carro");
            System.out.println("3. Añadir Moto");
            System.out.println("4. Añadir Camion");
            System.out.println("5. Añadir vehículos aleatoriamente");
            System.out.println("6. Calcular peajes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    if (peaje != null) {
                        System.out.println("Ya existe un peaje creado.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del peaje: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String departamento = scanner.nextLine();
                    peaje = new Peaje(nombre, departamento);
                    System.out.println("Peaje creado exitosamente.");
                    break;
                case "2":
                    if (peaje == null) {
                        System.out.println("Debe crear un peaje antes de realizar esta acción.");
                        break;
                    }
                    System.out.print("Ingrese la placa del carro: ");
                    String placaCarro = scanner.nextLine();
                    peaje.anadirVehiculo(new Carro(placaCarro));
                    System.out.println("Carro añadido exitosamente.");
                    break;
                case "3":
                    if (peaje == null) {
                        System.out.println("Debe crear un peaje antes de realizar esta acción.");
                        break;
                    }
                    System.out.print("Ingrese la placa de la moto: ");
                    String placaMoto = scanner.nextLine();
                    peaje.anadirVehiculo(new Moto(placaMoto));
                    System.out.println("Moto añadida exitosamente.");
                    break;
                case "4":
                    if (peaje == null) {
                        System.out.println("Debe crear un peaje antes de realizar esta acción.");
                        break;
                    }
                    System.out.print("Ingrese la placa del camión: ");
                    String placaCamion = scanner.nextLine();
                    System.out.print("Ingrese el número de ejes: ");
                    int ejes = 0;
                    try {
                        ejes = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Número de ejes inválido.");
                        break;
                    }
                    peaje.anadirVehiculo(new Camion(placaCamion, ejes));
                    System.out.println("Camión añadido exitosamente.");
                    break;
                case "5":
                    if (peaje == null) {
                        System.out.println("Debe crear un peaje antes de realizar esta acción.");
                        break;
                    }
                    System.out.print("¿Cuántos vehículos aleatorios desea añadir?: ");
                    int cantidad = 0;
                    try {
                        cantidad = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad inválida.");
                        break;
                    }
                    java.util.Random rand = new java.util.Random();
                    for (int i = 0; i < cantidad; i++) {
                        int tipo = rand.nextInt(3); // 0: Carro, 1: Moto, 2: Camion
                        String placa = "ALE-" + (rand.nextInt(900) + 100) + "-" + (rand.nextInt(900) + 100);
                        switch (tipo) {
                            case 0:
                                peaje.anadirVehiculo(new Carro(placa));
                                break;
                            case 1:
                                peaje.anadirVehiculo(new Moto(placa));
                                break;
                            case 2:
                                int ejesAleatorio = rand.nextInt(4) + 2; // 2 a 5 ejes
                                peaje.anadirVehiculo(new Camion(placa, ejesAleatorio));
                                break;
                        }
                    }
                    System.out.println("Vehículos aleatorios añadidos exitosamente.");
                    break;
                case "6":
                    if (peaje == null) {
                        System.out.println("Debe crear un peaje antes de realizar esta acción.");
                        break;
                    }
                    peaje.imprimir();
                    break;
                case "7":
                    salir = true;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }



}
