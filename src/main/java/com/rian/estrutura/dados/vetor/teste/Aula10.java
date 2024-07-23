/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.teste;

import com.rian.estrutura.dados.vetor.VetorObjetos;

/**
 *
 * @author rianh
 */
public class Aula10 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "123456", "Contato01gmail.com");
        Contato c2 = new Contato("Contato 2", "987654", "Contato02gmail.com");
        Contato c3 = new Contato("Contato 3", "321987", "Contato03gmail.com");

        Contato c4 = new Contato("Contato 4", "654153", "Contato04gmail.com");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        
        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);

    }

}
