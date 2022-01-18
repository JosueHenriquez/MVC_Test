/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ValoresModelo;
import java.sql.ResultSet;

public class ValoresController {

    public int valor;
    ValoresModelo objModelo = new ValoresModelo();

    public ValoresController() {
    }

    public ValoresController(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int ejecutarSentenciaSQLController(){
        int dato = objModelo.ejecutarSentenciaSQL(valor);
        return dato;
    }
    
    public ResultSet obtenerDatosResultSetController(){
        return objModelo.mostrarDatosResultSet();
    }
}
