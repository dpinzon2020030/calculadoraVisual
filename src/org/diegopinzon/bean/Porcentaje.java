/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diegopinzon.bean;

/**
 *
 * @author Diego Pinzon
 * @date 21/04/2021
 * @time 16:48:35
 *
 */
public class Porcentaje extends Operaciones{
    public Porcentaje(){
    }
    @Override
    public float operar(float numero1, float numero2){
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setOperador("%");
        this.setResultado((this.getNumero1() / 100) * this.getNumero2());
        return this.getResultado();
    }
    
}
