/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplos;

/**
 *
 * @author UTPL
 */
public class Hospital {
    private String nombreHospital;
    private String ciudadHospital;
    private int numeroCamas;
    private int numeroDoctores;
    private double presupuestoAnual;

    public Hospital(String nombre, int camas, int doctores,double presupuesto) {
        nombreHospital = nombre;
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestoAnual = presupuesto;
        ciudadHospital = "Quito";
    }

    public Hospital(String nombre, int camas, int doctores) {
        nombreHospital = nombre;
        numeroCamas = camas;
        numeroDoctores = doctores;
        ciudadHospital ="Quito";
        presupuestoAnual = 250000.10;
    }

    public Hospital(String nombre, String ciudad, int camas, int doctores, double presupuesto) {
        nombreHospital = nombre;
        ciudadHospital = ciudad;
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestoAnual = presupuesto;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getCiudadHospital() {
        return ciudadHospital;
    }

    public void setCiudadHospital(String ciudadHospital) {
        this.ciudadHospital = ciudadHospital;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroDoctores() {
        return numeroDoctores;
    }

    public void setNumeroDoctores(int numeroDoctores) {
        this.numeroDoctores = numeroDoctores;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }
    
    
    
    
    
}
