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

        Lista lista = new Lista(5);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona("rian");

        System.out.println("Elemento: 'rian' tem na tabela? " + lista.contem("rian"));

    }

}
