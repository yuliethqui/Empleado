/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;
//Yulieth Natalia Quiroga Alape
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Natalia Quiroga", 4000000, "(30, 04, 2024)");

        System.out.println(empleado.getInformacion());

        empleado.aumentarsalario(1000000);

        System.out.println(empleado.getInformacion());
    }
}
