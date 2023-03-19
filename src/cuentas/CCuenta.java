/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Esta clase almacena datos de la cuenta bancaria.
 *
 * @author Alberto
 */
public class CCuenta {

    /**
     * Metodo getter que devuelve la cuenta del cliente
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter que establece la cuenta del usuario.
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter que devuelde el valor del saldo en la cuenta.
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter que establece el saldo de la cuenta.
     *
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Crea una cuenta a través de los parámetros indicados.
     *
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nom nombre
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve la cantidad de saldo.
     *
     * @return saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método que ingresa una determinada cantidad de dinero.
     *
     * @param cantidad
     * @throws Exception que controla los ingresos negativos de saldo.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar dinero de la cuenta.
     *
     * @param cantidad
     * @throws Exception que controla las retiradas negativas de efectivo, así
     * como retirar más saldo del disponible en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodo que devuelve la cuenta
     *
     * @return cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
