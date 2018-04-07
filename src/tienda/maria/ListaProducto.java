/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.maria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Melara
 */
public class ListaProducto {

    private ArrayList<Producto> productos;

    public ListaProducto() {
        productos = new ArrayList<>();
    }

    public void add() {
        Producto producto = new Producto();
        productos.add(producto);
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del Producto");
        System.out.print(": ");
        producto.setNombreP(leer.nextLine());
        
        System.out.println("Ingrese el precio del producto");
        System.out.print(": ");
        producto.setPrecio(Float.parseFloat(leer.nextLine()));
        
        System.out.println("Ingrese la canridad del producto");
        System.out.print(": ");
        producto.setCant(Integer.parseInt(leer.nextLine()));
    }
    
    public void mostrar(){
        for (Producto e : productos){
            System.out.println(e.getNombreP());
            System.out.println(e.getCant());
            System.out.println(e.getPrecio());
            
        }
    }
    
    public void eliminar(){
        
    }
    
   public void Modificar(){

   }

   public void Descargar(){
       
   }
   
 }
