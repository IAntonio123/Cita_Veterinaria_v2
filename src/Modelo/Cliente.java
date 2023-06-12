/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Antonio
 */
public class Cliente {
    private String dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;
    
    public Cliente() {
    }
    
    public String getDni() {    return dni;}
    public void setDni(String dni) {    this.dni = dni;}
    public String getNombres() {    return nombres;}
    public void setNombres(String nombres) {    this.nombres = nombres;}
    public String getApellidos() {    return apellidos;}
    public void setApellidos(String apellidos) {    this.apellidos = apellidos;}
    public String getDireccion() {    return direccion;}
    public void setDireccion(String direccion) {    this.direccion = direccion;}
    public String getTelefono() {    return telefono;}
    public void setTelefono(String telefono) {    this.telefono = telefono;}
    public String getCorreo() {    return correo;}
    public void setCorreo(String correo) {    this.correo = correo;}
    public String Informacion(){
    
        return "\n------------ INFORMACION LLAMADA ------------"+
               "\nDNI                   : "+dni+
               "\nNombres               : "+nombres+
               "\nDireccion             : "+direccion+
               "\nTelefono              : "+telefono+
               "\nCorreo                : "+correo;
        
    }
    public Object[] Registo(int num){
    
        Object[] fila={num,dni,nombres,apellidos,direccion,telefono,correo};
        return fila;
    }
    
}
