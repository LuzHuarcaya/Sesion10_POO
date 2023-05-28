/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Luz Huarcaya
 */
public class Celular
    extends Dispositivo
    implements Camara, Navegador, Reproductor{

    private String marca;
    private String modelo;
    
    @Override
    public String getNombre(){
        return marca + " | " + modelo; 
    } 
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tomarFoto() {
        
    }

    @Override
    public void grabarVideo() {
        
    }

    @Override
    public void getApertura() {
        
    }

    @Override
    public void navegar() {
       
    }

    @Override
    public void abrirLink() {
       
    }
    
 
    
    
    
}
