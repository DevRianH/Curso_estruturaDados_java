/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.pilha.labs;

import com.rian.estrutura.dados.pilha.Pilha;

/**
 *
 * @author rianh
 */
public class Ex02 {

    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == 0) {

                if (pilhaPar.estaVazio() || pilhaImpar.estaVazio()) {
                    System.out.println("Atenção, pilha vazia");
                }

                pilhaImpar.desempilha();
                pilhaPar.desempilha();

            } else if (numeros[i] % 2 == 0) {
                pilhaPar.empilha(numeros[i]);
            } else if (numeros[i] % 2 != 0) {
                pilhaImpar.empilha(numeros[i]);

            }

        }

        System.out.print("Par: " + pilhaPar);
        System.out.println("");
        System.out.print("Ímpar" + pilhaImpar);
        System.out.println("");

        pilhaImpar.mostraDesempilha();
        pilhaPar.mostraDesempilha();

        System.out.print("Par: " + pilhaPar);
        System.out.println("");
        System.out.print("Ímpar" + pilhaImpar);
        
    }
}
