/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor;

import java.lang.reflect.Array;

/**
 *
 * @author rianh
 */
public class ListaExercicio<T> {

    private T[] elementos;
    private int tamanho;

    public ListaExercicio(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];//Solução do livro Efetivo Java, solução mais elegante e simples para entender
        this.tamanho = 0;
    }

    public ListaExercicio(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean contem(T elemento){
        
        for(T ele  : elementos){
            
        }
        
        return false;
    }
    
}
