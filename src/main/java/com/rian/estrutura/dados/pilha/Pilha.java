/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.pilha;

import com.rian.estrutura.dados.base.EstruturaEstatica;

/**
 *
 * @author rhezequias
 */
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {

        if (estaVazio()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilha() {

        if (this.estaVazio()) {
            return null;
        }
        /*
        T elemento = this.elementos[tamanho - 1];
        tamanho--;

        return elemento;*/

        return this.elementos[--tamanho];

    }

    public T mostraDesempilha() {

        for (int i = this.tamanho; i > 0; i--) {

            System.out.println("Desempilhando: " + this.topo());

            this.desempilha();
        }
        return (T) "";
    }

}
