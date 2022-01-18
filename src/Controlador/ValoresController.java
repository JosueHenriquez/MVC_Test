/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ValoresModelo;
import java.sql.ResultSet;

public class ValoresController {
    
    public int idvalor;
    public int valor;
    ValoresModelo objModelo = new ValoresModelo();

    public ValoresController() {
    }

    public ValoresController(int idvalor, int valor) {
        this.idvalor = idvalor;
        this.valor = valor;
    }

    public int getIdvalor() {
        return idvalor;
    }

    public void setIdvalor(int idvalor) {
        this.idvalor = idvalor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ValoresModelo getObjModelo() {
        return objModelo;
    }

    public void setObjModelo(ValoresModelo objModelo) {
        this.objModelo = objModelo;
    }
    
    public int ejecutarSentenciaSQLController(){
        int dato = objModelo.ejecutarSentenciaSQL(valor);
        return dato;
    }
    
    public ResultSet obtenerDatosResultSetController(){
        return objModelo.mostrarDatosResultSet();
    }
    public int elimnarRegistroSQLController(){
        int dato = objModelo.eliminarRegistroSQL(idvalor);
        return dato;
    }
}
