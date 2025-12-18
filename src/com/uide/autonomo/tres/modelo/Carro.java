package com.uide.autonomo.tres.modelo;

/**
 * Clase que representa un carro, hereda de Vehiculo.
 * El valor del peaje es fijo para los carros.
 */
public class Carro extends Vehiculo {
    private int valorPeaje = 2; // Valor fijo del peaje para carro

    /**
     * Constructor de la clase Carro.
     * @param placa Placa del carro
     */
    public Carro(String placa) {
        super(placa);
    }

    /**
     * Retorna el valor fijo del peaje para el carro.
     * @return Valor del peaje
     */
    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    /**
     * Imprime la informacion del carro.
     */
    @Override
    public void imprimir() {
        System.out.println("Carro - Placa: " + getPlaca() + " - Peaje: $" + getValorPeaje());
    }

    /**
     * Establece el valor del peaje para el carro.
     * @param valorPeaje Valor del peaje
     */
    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }
}
