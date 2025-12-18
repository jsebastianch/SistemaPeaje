package com.uide.autonomo.tres.modelo;

/**
 * Clase abstracta que representa un vehículo genérico.
 * Proporciona la estructura base para los diferentes tipos de vehículos.
 */
public abstract class Vehiculo {
    private String placa;

    /**
     * Constructor de la clase Vehiculo.
     * @param placa Placa del vehículo
     */
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene la placa del vehículo.
     * @return Placa del vehículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método abstracto para obtener el valor del peaje según el tipo de vehículo.
     * @return Valor del peaje
     */
    public abstract int getValorPeaje();

    /**
     * Método abstracto para imprimir la información del vehículo.
     */
    public abstract void imprimir();
}
