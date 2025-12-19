package com.uide.autonomo.tres.modelo;

/**
 * Clase que representa una moto, hereda de Vehiculo.
 * El valor del peaje es fijo para las motos.
 */
public class Moto extends Vehiculo {
    private int valorPeaje = 1; // Valor fijo del peaje para moto

    /**
     * Constructor de la clase Moto.
     * @param placa Placa de la moto
     */
    public Moto(String placa) {
        super(placa);
    }

    /**
     * Retorna el valor fijo del peaje para la moto.
     * @return Valor del peaje
     */
    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    /**
     * Imprime la informacion de la moto.
     */
    @Override
    public void imprimir() {
        System.out.println("Moto - Placa: " + getPlaca() + " - Peaje: $" + getValorPeaje());
    }

    /**
     * Establece el valor del peaje para la moto.
     * @param valorPeaje Valor del peaje
     */
    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }
}
