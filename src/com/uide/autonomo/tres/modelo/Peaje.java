package com.uide.autonomo.tres.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un peaje.
 * Permite registrar vehículos y calcular el total recaudado.
 */
public class Peaje {
    private String nombre; // Nombre del peaje
    private String departamento; // Departamento donde se ubica el peaje
    private int totalPeaje = 0; // Total recaudado en el peaje
    private int totalCamiones = 0; // Total de camiones registrados
    private int totalCarros = 0; // Total de carros registrados
    private int totalMotos = 0; // Total de motos registradas



    private List<Vehiculo> vehiculos = new ArrayList<>(); // Lista de vehículos registrados

    /**
     * Constructor de la clase Peaje.
     * @param nombre Nombre del peaje
     * @param departamento Departamento donde se ubica el peaje
     */
    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    /**
     * Añade un vehículo al peaje y suma su valor al total recaudado.
     * @param vehiculo Vehículo a registrar
     */
    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalPeaje += vehiculo.getValorPeaje();
        if (vehiculo instanceof Camion) {
            totalCamiones++;
        } else if (vehiculo instanceof Carro) {
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
        }
        this.animarLlegadaVehiculo(vehiculo);
    }

    /**
     * Imprime la información del peaje y de los vehículos registrados.
     */
    public void imprimir() {
        System.out.println("\nPeaje: " + nombre + " - " + departamento);
        int recaudadoCamiones = 0;
        int recaudadoCarros = 0;
        int recaudadoMotos = 0;
        for (Vehiculo v : vehiculos) {
            v.imprimir();
            if (v instanceof Camion) {
                recaudadoCamiones += v.getValorPeaje();
            } else if (v instanceof Carro) {
                recaudadoCarros += v.getValorPeaje();
            } else if (v instanceof Moto) {
                recaudadoMotos += v.getValorPeaje();
            }
        }
        System.out.println("Subtotal Camiones: " + totalCamiones + " valor: $" + recaudadoCamiones);
        System.out.println("Subtotal Carros: " + totalCarros + " valor: $" + recaudadoCarros);
        System.out.println("Subtotal Motos: " + totalMotos + " valor: $" + recaudadoMotos);
        System.out.println("Total recaudado: $" + totalPeaje);

    }

    /**
     * Simula en consola la llegada de un vehículo al peaje.
     * El ícono del vehículo se adapta según el tipo de instancia.
     */
    public void animarLlegadaVehiculo(Vehiculo vehiculo) {
        String icono = "🚙";
        if (vehiculo instanceof Carro) {
            icono = "🚗";
        } else if (vehiculo instanceof Moto) {
            icono = "🏍️";
        } else if (vehiculo instanceof Camion) {
            icono = "🚛";
        }

        String[] animacion = {
                "||          " + icono,
                "  ||      " + icono + "  ",
                "    ||  " + icono + "    ",
                "      ||      ",
                "    " + icono + "  ||    ",
                "  " + icono + "      ||  ",
                icono + "           ||"
        };

        System.out.println("\nVehículo en camino al peaje...");
        for (String frame : animacion) {
            System.out.print("\r" + frame);
            try {
                Thread.sleep(300); // pausa de 300 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nVehículo llegó al peaje: " + vehiculo.getPlaca());
    }
}
