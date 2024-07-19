/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor;

/**
 *
 * @author rhezequias
 */
public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Adiciona 1");
        vetor.adiciona("Adiciona 2");
        vetor.adiciona("Adiciona 3");

        System.out.println(vetor.busca(15));
    }

}
