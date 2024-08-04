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
public class Ex01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                pilha.empilha(numeros[i]);
            } else if (numeros[i] % 2 != 0) {
                pilha.desempilha();
            } else if (pilha.estaVazio()) {
                System.out.println("A pilha está vazia");
            }

        }

        System.out.print("Pilha depois da seleção dos pares:" + pilha + " ");

        if (!pilha.estaVazio()) {

            System.out.print(pilha.mostraDesempilha());
        }

        System.out.print("\nUltimo toString: " + pilha);

    }

}
