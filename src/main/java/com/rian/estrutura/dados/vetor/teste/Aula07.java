/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.teste;

import com.rian.estrutura.dados.vetor.Vetor;

/**
 *
 * @author rianh
 */
public class Aula07 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);

        vetor.adiciona(3, "D");

        System.out.println(vetor);

    }

}
