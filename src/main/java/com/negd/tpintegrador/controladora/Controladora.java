
package com.negd.tpintegrador.controladora;

import com.negd.tpintegrador.Equipo;
import com.negd.tpintegrador.Partido;
import com.negd.tpintegrador.presistencia.ControladoraPersistencia;

/**
 *
 * @author nicol
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearEquipo (Equipo eqi){
        
        controlPersis.crearEquipo (eqi);
    }
    
    public void crearPartido (Partido par){
        
        controlPersis.crearPartido (par);
    }
    
    public Equipo traerEquipo(int id){
        
        return controlPersis.traerEquipo(id);
    }
    
    public Partido traerPartido(int id){
        
        return controlPersis.traerPartido(id);
    }

    
}
