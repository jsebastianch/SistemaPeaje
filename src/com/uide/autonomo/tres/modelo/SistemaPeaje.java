package com.uide.autonomo.tres.modelo;

/**
 * Clase principal que ejecuta el sistema de peaje.
 * Permite crear un peaje, registrar vehículos y mostrar el total recaudado.
 */
public class SistemaPeaje {
    public static void main(String[] args) {
        // Crear un peaje
        Peaje peaje = new Peaje("Peaje Central", "Pichincha");

        // Registrar vehículos
        peaje.anadirVehiculo(new Carro("ABC-123"));
        peaje.anadirVehiculo(new Moto("MOT-777"));
        peaje.anadirVehiculo(new Camion("CAM-900", 4));

        // Imprimir información del peaje y vehículos
        peaje.imprimir();
    }



}
