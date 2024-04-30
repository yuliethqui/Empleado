/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;
//Yulieth Natalia Quiroga Alape
public class Empleado {
    private String nombre;
    private double salario;
    private String fecha;

    public Empleado(String nombre, double salario, String fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha= fecha;
    }
    public String getnombre() {
        return nombre;
    }
    public double getsalario() {
        return salario;
    }
    public String getfecha() {
        return fecha;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void aumentarsalario(double aumento) {
        if (aumento > 0) {
            salario += aumento;
        }
    }
    // Método para obtener información del empleado
    public String getInformacion() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Fecha de contratación: " + fecha;
    }
}
