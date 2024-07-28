/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor;

import java.lang.reflect.Array;

/**
 *
 * @author rhezequias
 */
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];//Solução do livro Efetivo Java, solução mais elegante e simples para entender
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    //
    public boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    // B D E E F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public T busca(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" ,");

        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);

        }

        s.append("]");

        return s.toString();
    }

    public T mostraElemento(T elemento) {
        return elemento;
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {

        return busca(elemento) > -1;
    }

    /* ex 01 que resolvi 
    public boolean contem(T elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }
     */
    public T[] getElementos() {
        return elementos;
    }

    public T ultimoIndice() {
        T ultimo = this.elementos[this.tamanho - 1];

        return ultimo;
    }

    public int ultimoIndice(T elemento) {

        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);
        }

    }

//    método feito por mim para remover por elemento
    /*public void removeElemento(T elemento) {
        
        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {

                for (int j = i; j < this.tamanho - 1; j++) {

                    this.elementos[j] = this.elementos[j + 1];

                }
                this.tamanho--;
            }
        }

    }*/
    public T obtem(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];

    }

    public void limpar() {

        //opção 1
//        this.elementos = (T[]) new Object[this.elementos.length];
        //opção 2
//        this.tamanho = 0;
        //opção 3
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;

    }

//    método criado por mim de acordo com o exercicio 
    /*    public void limpar() {

        for (int i = 0; i < this.tamanho; i++) {

            this.elementos[i] = null;

        }
    this.tamanho = 0;
    }
     */
}
