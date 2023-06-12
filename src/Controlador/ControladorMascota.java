/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mascota;
import Procesos.ProcesosFormMascota;
import Vista.FormMascota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorMascota implements ActionListener{
    
    FormMascota vista;
    Mascota mas;
    
    public ControladorMascota(FormMascota fmas){
        vista=fmas;
        ProcesosFormMascota.Presentacion(fmas);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
    }
    
    
    
}
