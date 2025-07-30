/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Conta_Banco {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.dono = "JHEIMISON";
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 1500;
        minhaConta.salario = 1100;
        System.out.println("\n\n------------------Banco Senac-RR-------------------");
        System.out.println("Nome do Dono da conta: " + minhaConta.dono);
        System.out.println("Saldo atual: " + minhaConta.saldo);
        System.out.println("limite da conta: " + minhaConta.limite);
        System.out.println("Meu salirio é: " + minhaConta.salario);
        System.out.println("-------------Obrigado Pela preferência-------------\n\n");
        
        Conta contaX = new Conta();
        contaX.dono = "JOAO";// nome do cliente e dono da conta.
        contaX.saldo = 2000; // o saldo total do cliente.
        contaX.limite = 6000; // limite disponivel do cliente.
        
        System.out.println("\n\n------------------Banco Senac-RR-------------------");
        System.out.println("Nome do Dono da conta: " + contaX.dono);
        System.out.println("Saldo atual: " + contaX.saldo);
        System.out.println("limite da conta: " + contaX.limite);
        System.out.println("-------------Obrigado Pela preferência-------------\n\n\n");
        
        System.out.println("\n --- realizar saca---");
        minhaConta.saca(200);
        double sacar = leia.nextDouble();
        System.out.println("\n --- seu novo saldo---");
        System.out.println("Saldo atual: " + minhaConta.saldo);
        // deposita 500 reais
        minhaConta.deposita(500);
        if (minhaConta.saca(2000)) {
        System.out.println("Consegui sacar");
        } else {
        System.out.println("NAO CONSEGUI SACAR");
        System.out.println(minhaConta.saldo);
        }
    }
}

