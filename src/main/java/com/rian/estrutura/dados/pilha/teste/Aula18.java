/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.pilha.teste;

import com.rian.estrutura.dados.pilha.Pilha;
import java.util.Stack;

/**
 *
 * @author rianh
 */
public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty()); //Verifica se está vazio 

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // Verifica se está vazio
        System.out.println(stack.size()); // Mostra o tamanho da pilha
        System.out.println(stack); //Imprime os elementos da pilha - toString()
        System.out.println(stack.peek()); // Espiar
        System.out.println(stack.pop());// Remove um elemento
        System.out.println(stack);// Remove um elemento

    }

}
