
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.teste;

import com.rian.estrutura.dados.vetor.Lista;

/**
 *
 * @author rhezequias
 */
public class Aula12 {

    public static void main(String[] args) {

        Lista<Contato> lista = new Lista<Contato>(2);

        Contato c1 = new Contato("Contato 1", "123456", "Contato01gmail.com");
        Contato c2 = new Contato("Contato 2", "987654", "Contato02gmail.com");
        Contato c3 = new Contato("Contato 3", "321987", "Contato03gmail.com");

        lista.adiciona(c1);

        System.out.println(lista);

    }

}
