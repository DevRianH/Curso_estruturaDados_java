/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.pilha.teste;

import com.rian.estrutura.dados.pilha.Pilha;

/**
 *
 * @author rhezequias
 */
public class Aula15 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazio());

        pilha.empilha(1);

        System.out.println(pilha.estaVazio());

    }

}
