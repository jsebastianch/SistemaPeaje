package com.uide.autonomo.tres.modelo;

/**
 * Clase que representa un camión, hereda de Vehiculo.
 * El valor del peaje depende del número de ejes.
 */
public class Camion extends Vehiculo {
    private int valorPeajeEje = 1; // Valor del peaje por eje
    private final int numeroEjes; // Número de ejes del camión

    /**
     * Constructor de la clase Camion.
     * @param placa Placa del camión
     * @param numeroEjes Número de ejes
     */
    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    /**
     * Calcula el valor del peaje según el número de ejes.
     * @return Valor del peaje
     */
    @Override
    public int getValorPeaje() {
        return getValorPeajeEje() * getNumeroEjes();
    }

    /**
     * Imprime la información del camión.
     */
    @Override
    public void imprimir() {
        System.out.println("Camión - Placa: " + getPlaca() +
                " - Ejes: " + getNumeroEjes() +
                " - Peaje: $" + getValorPeaje());
    }

    /**
     * Obtiene el valor del peaje por eje.
     * @return Valor del peaje por eje
     */
    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    /**
     * Establece el valor del peaje por eje.
     * @param valorPeajeEje Valor del peaje por eje
     */
    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    /**
     * Obtiene el número de ejes del camión.
     * @return Número de ejes
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }
}
