/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.teste;

import com.rian.estrutura.dados.vetor.Vetor;

/**
 *
 * @author rhezequias
 */
public class Aula04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Adiciona 01");
        vetor.adiciona("Adiciona 02");
        vetor.adiciona("Adiciona 03");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }

}
