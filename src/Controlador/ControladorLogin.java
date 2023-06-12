/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.FormInicio;
import Vista.FormLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorLogin implements ActionListener{
    FormLogin vista;
    FormInicio vistaMenu;
    public ControladorLogin(FormLogin fl,FormInicio fi){
        vistaMenu=fi;
        vista=fl;
        vista.jbtnIniciarSesion.addActionListener(this);
        fl.setDefaultCloseOperation(fl.EXIT_ON_CLOSE);
        fl.setVisible(true);
        fl.setTitle("Login");
    }
    public Boolean ValidarDatos(FormLogin fl){
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnIniciarSesion){
            vistaMenu.setVisible(true);
            vista.dispose();
        }
    }
    
}
