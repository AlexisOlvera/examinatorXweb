/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author joshua
 */
public class tipo_examen {
    
    private int _id;
    private String _tipo;
    
    public tipo_examen(String _id, String _tipo){
        
        this._id=Integer.parseInt(_id);
        this._tipo=_tipo;
    }
    
    public String getTipo(){
    
    return this._tipo;
    }
    
    public int getId(){
        
        return this._id;
    }
    
    public void guardarBD(){
        /*
        
        aqui va el codigo chidorris que hace la magia
        
        */
    }
    
}
