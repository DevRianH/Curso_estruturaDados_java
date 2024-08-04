/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.pilha.teste;

import com.rian.estrutura.dados.pilha.Pilha;

/**
 *
 * @author rianh
 */
public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elemento " + pilha.desempilha());

        System.out.println(pilha);

    }

}
