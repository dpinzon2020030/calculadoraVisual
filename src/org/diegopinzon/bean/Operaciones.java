/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diegopinzon.bean;

/**
 *
 * @author Diego Pinzon.
 * @date 21/04/2021
 * @time 08:36:23
 *
 */
public abstract class Operaciones {
    private float numero1;
    private float numero2;
    private float resultado;
    private String operador;
    
    // constructor
    public Operaciones(){ 
    }
    public Operaciones(float numero1, float numero2){ 
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Metodos get y set

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    protected void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    // operaciones
    
    public abstract float operar(float numero1 , float numero2);
    
    // metodo
    @Override
    public String toString(){
        return ""+this.numero1+" "+ this.operador+" "+this.numero2+" = "+this.resultado;
    }
}
