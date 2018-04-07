/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.maria;

/**
 *
 * @author Rafael Melara
 */
public class Producto {
    private String nombreP;
    private int cant;
    private float precio;
    
    public Producto(){}

    public Producto(String nombreP, int cant, float precio ){
        this.nombreP = nombreP;
        this.cant = cant;
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
   
}



