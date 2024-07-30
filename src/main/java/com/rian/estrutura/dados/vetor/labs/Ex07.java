/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.labs;

import com.rian.estrutura.dados.vetor.teste.Contato;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex07 extends Ex06 {

    public static void main(String[] args) {
//        criação das variáveis
        Scanner scan = new Scanner(System.in);

        Ex06 ex06 = new Ex06();
//        criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<Contato>(20);

//        criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);
//        1 - criar um menu para que o usuário escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = ex06.obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;

                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;

                case 4:
                    obtemContato(scan, lista);
                    break;

                case 5:
                    pesquisarPorUltimoIndice(scan, lista);
                    break;

                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;

                case 7:
                    excluirPorPosicao(scan, lista);
                    break;

                case 8:
                    excluirContato(scan, lista);
                    break;

                case 9:
                    imprimeTamanhoVetor(lista);
                    break;

                case 10:
                    limparVetor(lista);
                    break;

                case 11:
                    imprimirVetor(lista);
                    break;

            }

            System.out.println("Usuário digitou 0, programa encerrado");
        }
    }

    protected static void imprimirVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    protected static void limparVetor(ArrayList<Contato> lista) {

        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    protected static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            lista.remove(pos);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            boolean existe = lista.contains(contato);

            if (existe) {
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static void pesquisarPorUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

        Contato contato;

        for (int i = 1; i < quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111" + 1);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.add(contato);

        }

    }

    private static int lerInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }

        }
        return num;
    }

    private static String lerInformacao(String msg, Scanner scan) {

        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;

    }

}
