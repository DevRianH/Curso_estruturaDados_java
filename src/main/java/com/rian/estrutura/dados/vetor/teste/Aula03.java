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
public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
