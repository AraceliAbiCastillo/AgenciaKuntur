/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author uSUARIO
 */
public class Vuelo {

    public char getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(char codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
    }

    private char codVendedor;
    private String nombreVendedor;
    private String celularVendedor;
    public ArrayList<PaqueteTuristico> suscribeResgistroVenta = new ArrayList();
}
