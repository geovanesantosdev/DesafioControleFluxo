/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gdsant.contador.exceptions;

/**
 *
 * @author Geovane
 */
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
