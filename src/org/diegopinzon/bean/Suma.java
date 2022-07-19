package org.diegopinzon.bean;

/**
 *
 * @author Diego Pinzon
 * @date 8/04/2021
 * @time 8:26:37
 *
 */
public class Suma extends Operaciones{
    public Suma(){
    }
    @Override
    public float operar(float numero1, float numero2) {
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setOperador("+");
        this.setResultado(this.getNumero1() + this.getNumero2());
        return this.getResultado();
    }

    
}
