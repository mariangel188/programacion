/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplos;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreHospital;
        String ciudadHospital;
        int numeroCamas;
        int numeroDoctores;
        double presupuestoAnual;
        int opcion;
        System.out.println("Que tipo de hospital desea ingresar "
                + "\n Opcion 1 "
                + "\n Opcion 2"
                + "\n Opcion 3");
        opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion == 1) {
            System.out.println("Ingrese el nombre del hospital: ");
            nombreHospital = entrada.nextLine();
            System.out.println("Ingrese el numero de camas del hospital: ");
            numeroCamas = entrada.nextInt();
            System.out.println("Ingrese el numero de doctores del hospital: ");
            numeroDoctores = entrada.nextInt();
            System.out.println("Ingrese el presupuesto anual del hospital: ");
            presupuestoAnual = entrada.nextDouble();
            Hospital hosp1 = new Hospital(nombreHospital, numeroCamas, numeroDoctores, presupuestoAnual);
            System.out.printf("Datos del hospital\n"
                    + "Nombre del hospital: %s\n"
                    + "Ciudad del hospital: %s\n"
                    + "Numero de camas: %d\n"
                    + "Numero de doctores:  %d\n "
                    + "Presupuesto anual: %.2f\n",
                    hosp1.getNombreHospital(),
                    hosp1.getCiudadHospital(),
                    hosp1.getNumeroCamas(),
                    hosp1.getNumeroDoctores(),
                    hosp1.getPresupuestoAnual());
        } else {
            if (opcion == 2) {
                System.out.println("Ingrese el nombre del hospital: ");
                nombreHospital = entrada.nextLine();
                System.out.println("Ingrese el numero de camas del hospital: ");
                numeroCamas = entrada.nextInt();
                System.out.println("Ingrese el numero de doctores del hospital: ");
                numeroDoctores = entrada.nextInt();
                Hospital hosp2 = new Hospital(nombreHospital, numeroCamas, numeroDoctores);
                System.out.printf("Datos del hospital\n"
                        + "Nombre del hospital: %s\n"
                        + "Ciudad del hospital: %s\n"
                        + "Numero de camas: %d\n"
                        + "Presupuesto anual: %.2f\n",
                        hosp2.getNombreHospital(),
                        hosp2.getCiudadHospital(),
                        hosp2.getNumeroCamas(),
                        hosp2.getNumeroDoctores(),
                        hosp2.getPresupuestoAnual());
            } else {
                if (opcion == 3) {
                    System.out.println("Ingrese el nombre del hospital: ");
                    nombreHospital = entrada.nextLine();
                    System.out.println("Ingrese la ciudad del hospital: ");
                    ciudadHospital = entrada.nextLine();
                    System.out.println("Ingrese el numero de camas del hospital: ");
                    numeroCamas = entrada.nextInt();
                    System.out.println("Ingrese el numero de doctores del hospital: ");
                    numeroDoctores = entrada.nextInt();
                    System.out.println("Ingrese el presupuesto anual del hospital: ");
                    presupuestoAnual = entrada.nextDouble();
                    Hospital hosp3 = new Hospital(nombreHospital, ciudadHospital, numeroCamas, numeroDoctores, presupuestoAnual);
                    System.out.printf("Datos del hospital\n"
                            + "Nombre del hospital: %s\n"
                            + "Ciudad del hospital: %s\n"
                            + "Numero de camas: %d\n"
                            + "Numero de doctores:  %d\n"
                            + "Presupuesto anual: %.2f\n",
                            hosp3.getNombreHospital(),
                            hosp3.getCiudadHospital(),
                            hosp3.getNumeroCamas(),
                            hosp3.getNumeroDoctores(),
                            hosp3.getPresupuestoAnual());
                } else {
                    System.out.println("Opcion fuera de rango");
                }
            }
        }
    }
}
