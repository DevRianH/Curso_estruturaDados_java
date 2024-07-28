/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.estrutura.dados.vetor.labs;

import com.rian.estrutura.dados.vetor.Lista;
import com.rian.estrutura.dados.vetor.teste.Contato;
import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex06 {

    public static void main(String[] args) {
//        criação das variáveis
        Scanner scan = new Scanner(System.in);

//        criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<Contato>(20);

//        criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);
//        1 - criar um menu para que o usuário escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

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

    private static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {

        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            lista.remove(pos);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            boolean existe = lista.contem(contato);

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

    private static void pesquisarPorUltimoIndice(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome", scan);
        String telefone = lerInformacao("Entre com o telefone", scan);
        String email = lerInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

    }

    private static String lerInformacao(String msg, Scanner scan) {

        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;

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

    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final de vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho vetor");
            System.out.println("10: Escluir todos os contatos do vetor");
            System.out.println("11: imprime vetor");
            System.out.println("0: Sair");

            try {

                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {

                System.out.println("Entrada inválida, digite novamente");
            }

        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

        Contato contato;

        for (int i = 1; i < quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111" + 1);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.adiciona(contato);

        }

    }

}
