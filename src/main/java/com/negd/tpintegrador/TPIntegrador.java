/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.negd.tpintegrador;

import com.negd.tpintegrador.controladora.Controladora;
import com.negd.tpintegrador.presistencia.ControladoraPersistencia;

/**
 *
 * @author nico
 */
public class TPIntegrador {

    public static void main(String[] args) {
        
       Controladora control = new Controladora();
        
//      Comparador comparador = new Comparador();
//      comparador.compararPronosticos();

       ControladoraPersistencia controlPersis = new ControladoraPersistencia();


  
       
 //    Equipo eqi2 = new Equipo(4,"Mexico");
               
               
//     Partido par2 = new Partido(2, control.traerEquipo(3), control.traerEquipo(4), 0, 0);
       
//       control.crearEquipo(eqi2);
 //      control.crearPartido(par2);

//     Equipo eqi = control.traerEquipo(4);
             
//     System.out.println(eqi.toString());
//
//
    Partido par = control.traerPartido(2);
//    
    System.out.println(par.toString());




    }
}
