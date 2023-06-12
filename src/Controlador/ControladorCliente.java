/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Procesos.ProcesosFormCliente;
import Vista.FormCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorCliente implements ActionListener{
    FormCliente vista;
    Cliente cli;
    
    public ControladorCliente(FormCliente fcli){
        vista=fcli;
        ProcesosFormCliente.Presentacion(fcli);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }
   
}
