/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javam2018
 */
public class Tv {

    private int nocanal = 1;
    private int volumencanal = 10;
    private String estado = "";

    public Tv() {
    }

    public Tv(int nocanal, int volumencanal, String estado) {
        this.nocanal = nocanal;
        this.volumencanal = volumencanal;
        this.estado = estado;

    }

    public String encendido() {
        if (estado.equals("La Tv esta encendida")) {
            this.estado = "apagado, encienda la Tv";

            this.nocanal = this.nocanal+0;

        } else {
            this.estado = "La Tv esta encendida";

        }
        return this.estado;
    }

    public int getnocanalS() {

        if (estado.equals("La Tv esta encendida")) {

            this.nocanal = this.nocanal + 1;

            if (this.nocanal == 6) {

                this.nocanal = 1;
            }

        } else if (estado.equals("apagado, encienda la Tv")) {
            this.nocanal = this.nocanal+0;
        }
        return nocanal;
    }

    public void setNocanal(int nocanal) {
        this.nocanal = nocanal;

    }

    public void setVolumencanal(int volumencanal) {
        this.volumencanal = volumencanal;
    }

    public int getnocanalR() {

        if (estado.equals("La Tv esta encendida")) {
            if (this.nocanal == 0) {

                this.nocanal = 5;
            }
            if (this.nocanal == 1) {

                this.nocanal = 6;
            }

            this.nocanal = this.nocanal - 1;

        } else if (estado.equals("apagado, encienda la Tv")) {
            this.nocanal = this.nocanal+0;
        }
        return nocanal;
    }
    
    public int getVolumencanalS() {
        if (estado.equals("La Tv esta encendida")) {
             if (this.volumencanal==25) 
            {
              this.volumencanal=25;
            }
             else
             {
                 this.volumencanal++;
             }
               
            
            
             
             
                
        }
       
         else if (estado.equals("apagado, encienda la Tv")) {
           this.volumencanal=this.volumencanal+0;
        }
        return volumencanal;
    }
    public int getVolumencanalB() {
        if (estado.equals("La Tv esta encendida")) {
             if (this.volumencanal==1) 
            {
              this.volumencanal=1;
            }
             else
             {
                 this.volumencanal--;
             }
               
            
            
            
             
                
        }
       
         else if (estado.equals("apagado, encienda la Tv")) {
           this.volumencanal=this.volumencanal+0;
        }
        return volumencanal;
    }
}
