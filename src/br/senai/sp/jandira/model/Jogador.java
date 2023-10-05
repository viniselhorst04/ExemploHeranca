package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

    String posicao;
    int numCamisa;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){

        System.out.println(" / --------- Cadastro --------- /");
        System.out.println(" Informe o nome: ");
        super.nome = scanner.nextLine();
        System.out.println(" Informe a idade: ");
        super.idade = scanner.nextInt();
        System.out.println(" Informe o CPF: ");
        super.cpf = scanner.nextLong();
        System.out.println(" Informe o RG: ");
        super.rg = scanner.nextLong();
        scanner.nextLine();
        System.out.println(" Informe a posição: ");
        posicao = scanner.nextLine();
        System.out.println(" Informe a N° da camisa: ");
        numCamisa = scanner.nextInt();
        scanner.nextLine();

    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
}
