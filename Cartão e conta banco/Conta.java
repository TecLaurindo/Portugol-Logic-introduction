/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author Windows
 */
public class Conta {
int numero;
String dono;
double saldo;
double limite;
double salario;
        
boolean saca(double valor) {
if (this.saldo < valor) {
return false;
} else {
this.saldo = this.saldo - valor;
return true;
}

}
boolean deposita(double quantidade) {
this.saldo += quantidade;
    return false;
    
}
}