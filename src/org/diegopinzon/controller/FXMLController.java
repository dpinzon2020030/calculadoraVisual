package org.carlosaceituno.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.diegopinzon.bean.*;

/**
 * FXML Controller class
 *
 * @author Diego Pinzon
 */
public class FXMLController implements Initializable {
    
    private float resultado;
    private float numero;
    private int contadorOperadores = 0; 
    private String operadorAnterior = "";
    private boolean ingresoNuevo = false;

    
    
    @FXML
    private Label lblPantalla;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnSigno;
    @FXML
    private Button btn7;
    @FXML
    private Button btn4;
    @FXML
    private Button btn1;
    @FXML
    private Button btn8;
    @FXML
    private Button btn5;
    @FXML
    private Button btn2;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btn9;
    @FXML
    private Button btn6;
    @FXML
    private Button btn3;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btn0;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnPunto;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicCuatro(ActionEvent event) {
        actualizarPantalla("4");
    
    }

    @FXML
    private void clicUno(ActionEvent event) {
        actualizarPantalla("1");
    }

    @FXML
    private void clicDos(ActionEvent event) {
        actualizarPantalla("2");       
    }

    @FXML
    private void clicTres(ActionEvent event) {
        actualizarPantalla("3"); 
    }

    @FXML
    private void clicSuma(ActionEvent event) {
        calcular("+");
    }

    @FXML
    private void clicLimpiar(ActionEvent event) {
       limpiar();
       resultado = 0.0f;
       numero = 0.0f;
       contadorOperadores = 0;
       operadorAnterior = "";
       contadorOperadores = 0;
       ingresoNuevo = false;
    }
    public void limpiar(){
        lblPantalla.setText("");
    }

    @FXML
    private void clicSigno(ActionEvent event) {
        
        // revisar
        cambioSigno();
    }
    
    public float cambioSigno(){
        String cadena = lblPantalla.getText();
        if(cadena.length() >= 1){
            numero = Float.parseFloat(cadena);
            String pantalla;
            if(numero < 0){
                this.resultado = numero * -1;
                pantalla = String.valueOf(resultado);
                lblPantalla.setText(pantalla);
            }else if(numero > 0){
                this.resultado = numero * -1;
                pantalla = String.valueOf(resultado);
                lblPantalla.setText(pantalla);
            }
        }
        return this.resultado;
    }

    @FXML
    private void clicSiete(ActionEvent event) {
       actualizarPantalla("7");
    }

    @FXML
    private void clicOcho(ActionEvent event) {
        actualizarPantalla("8");
    }

    @FXML
    private void clicCinco(ActionEvent event) {
        actualizarPantalla("5"); 
    }

    @FXML
    private void clicCero(ActionEvent event) {
        actualizarPantalla("0");
    }

    @FXML
    private void clicPorcentaje(ActionEvent event) {
       calcular("%");
    }

    @FXML
    private void clicNueve(ActionEvent event) {
        actualizarPantalla("9");
    }

    @FXML
    private void clicSeis(ActionEvent event) {
        actualizarPantalla("6"); 
    }

    @FXML
    private void clicDivision(ActionEvent event) {
        calcular("÷");
    }

    @FXML
    private void clicMulti(ActionEvent event) {
        calcular("×");
    }

    @FXML
    private void clicResta(ActionEvent event) {
        calcular("-");
    }

    @FXML
    private void clicIgual(ActionEvent event) {
        // Llamar al método calcular y
        // enviar como parámetro el operador ANTERIOR.
        calcular(operadorAnterior);
 
        lblPantalla.setText(String.valueOf(resultado));
    }

    @FXML
    private void clicPunto(ActionEvent event) {
        agregarPunto();
        
    }
    
    // Punto
    public void agregarPunto(){
        if(ingresoNuevo){
        lblPantalla.setText("");
        }
        
        String cadena = lblPantalla.getText();
        
        if(cadena.length() <= 0){
            lblPantalla.setText("0.");
            ingresoNuevo = false;
        }else if(!(lblPantalla.getText().contains("."))){
            actualizarPantalla(".");
        }
    }
    
    
    // Pantalla
    public void actualizarPantalla(String digito){
        if(ingresoNuevo){
        lblPantalla.setText("");
        ingresoNuevo = false;
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
    }
    
    private void calcular(String operador){
        //System.out.println("calcular");
        //System.out.println("operador"+operador);
        //System.out.println("lblPantalla.getText()"+lblPantalla.getText());
        
        if(!(lblPantalla.getText().equals(""))){
           //System.out.println("Dentro del primer if");
            
           String strPantalla = lblPantalla.getText();
           //System.out.println(strPantalla);
           //System.out.println("ingresoNuevo:"+ingresoNuevo);
           
           if(ingresoNuevo == false){
               //System.out.println("Dentor del segundo if");
               this.numero = Float.parseFloat(strPantalla);
               //System.out.println("numero"+numero);
               contadorOperadores++;
              // System.out.println("contadorOperadores"+contadorOperadores);
               if(contadorOperadores == 1){
                   this.resultado = numero;
               }else if(contadorOperadores >= 2){
                   //System.out.println("if del swicht");
                   switch(this.operadorAnterior){
                        case "+":
                            Suma s=new Suma();
                            s.setNumero1(resultado);
                            s.setNumero2(numero);
                            s.setOperador(operador);
                            this.resultado = s.operar(s.getNumero1(), s.getNumero2());
                            break;
                        case "-":
                            Resta r= new Resta();
                            r.setNumero1(resultado);
                            r.setNumero2(numero);
                            r.setOperador(operador);
                            this.resultado = r.operar(r.getNumero1(), r.getNumero2());
                            break;
                        case "×":
                            Multiplicacion m = new Multiplicacion();
                            m.setNumero1(resultado);
                            m.setNumero2(numero);
                            m.setOperador(operador);
                            this.resultado = m.operar(m.getNumero1(), m.getNumero2());
                            break;
                        case "÷":
                            Division d = new  Division();
                            d.setNumero1(resultado);
                            d.setNumero2(numero);
                            d.setOperador(operador);
                            this.resultado = d.operar(d.getNumero1(), d.getNumero2());
                            break;
                        case "%":
                            Porcentaje p = new Porcentaje();
                            p.setNumero1(resultado);
                            p.setNumero2(numero);
                            p.setOperador(operador);
                            this.resultado = p.operar(p.getNumero1(), p.getNumero2());
                            break;
                   }
                   //System.out.println("resultado"+this.resultado);
                   lblPantalla.setText(String.valueOf(this.resultado));
               }// fin el if contador
           }// finaliza el if de ingresoNuevo
           this.operadorAnterior = operador;
        }//if  fin del verificador del espacio vacio
        ingresoNuevo = true;
    }
    
    
    
    
}
