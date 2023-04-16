/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.negd.tpintegrador.presistencia;

import com.negd.tpintegrador.Equipo;
import com.negd.tpintegrador.Partido;

/**
 *
 * @author nicol
 */
public class ControladoraPersistencia {
    
    PartidoJpaController partidoJpa = new PartidoJpaController();
    EquipoJpaController equipoJpa = new EquipoJpaController();

    
    public void crearEquipo(Equipo eqi) {
        equipoJpa.create(eqi);
    }
    
    public void crearPartido(Partido par) {
        partidoJpa.create(par);
    }

    public Equipo traerEquipo(int id) {
        return equipoJpa.findEquipo(id);
    }
    
    public Partido traerPartido(int id) {
        return partidoJpa.findPartido(id);
    }
}
