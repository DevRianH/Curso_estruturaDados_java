/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.teste;

import com.rian.estrutura.dados.vetor.Lista;

/**
 *
 * @author rianh
 */
public class ExerciciosLista {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<Integer>(5);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("Elemento: 1 tem na tabela? ");

        if (lista.contem(1)) {
            System.out.println("Sim, tem na tabela");
        } else {
            System.out.println("Não tem na tabela");
        }

        System.out.println("Último índice: " + lista.ultimoIndice());

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);

        System.out.println(lista.obtem(2));

        lista.limpar();

        System.out.println(lista);

    }

}
