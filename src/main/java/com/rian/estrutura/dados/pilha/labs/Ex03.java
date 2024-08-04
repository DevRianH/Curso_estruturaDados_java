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
public class Ex03 {

    public static void main(String[] args) {

        Pilha<Livro> pilhaLivros = new Pilha<>(20);

        Livro livro = new Livro("Jogos Vorazes", "123456", "2016", "Josué");
        Livro livro2 = new Livro("Livro2", "987456", "2024", "Rian");

        pilhaLivros.empilha(livro);
        pilhaLivros.empilha(livro2);

        System.out.println(pilhaLivros);
    }

}
