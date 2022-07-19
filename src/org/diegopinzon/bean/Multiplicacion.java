package org.diegopinzon.bean;

/**
 *
 * @author Diego Pinzon
 * @date 8/04/2021
 * @time 13:26:56
 *
 */
public class Multiplicacion extends Operaciones {
    public Multiplicacion(){
    }
    @Override
    public float operar(float numero1, float numero2){
       this.setNumero1(numero1);
       this.setNumero2(numero2);
       this.setOperador("*");
       this.setResultado(this.getNumero1() * this.getNumero2());
       return this.getResultado();
    }
}
