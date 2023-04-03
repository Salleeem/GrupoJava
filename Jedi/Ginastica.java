package Jedi;

import java.util.Scanner;

public class Ginastica {
    Scanner sc = new Scanner(System.in);

    public void Exe() {

        String nome;
        int idade;
        char sexo;
        double altura;
        double peso;
        double pesoIdeal;
        double imc;

        System.out.println("Informe seu nome");
        nome = sc.nextLine();
        System.out.println("Informe sua idade");
        idade = sc.nextInt();
        System.out.println("Informe sua altura(Em metros)");
        altura = sc.nextDouble();
        System.out.println("Informe seu peso(Em kg)");
        peso = sc.nextDouble();
        System.out.println("Informe seu gênero(M/F)");
        sexo = sc.next().charAt(0);

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal para "+ nome + " é: " + pesoIdeal + " kg");

        imc = peso / (altura * altura);

        System.out.println("O IMC do "+ nome + " é " + imc);

        if (imc < 20) {
            System.out.println("Sugestão de atividade: Atividade Difícil (ganho de massa muscular)");
        } else if (imc >= 20 && imc < 27) {
            System.out.println("Sugestão de atividade: Atividade Moderada");
        } else {
            System.out.println("Sugestão de atividade: Atividade Leve (perda de peso)");
        }

        if (idade >= 16 && idade <= 25) {
            System.out.println("Faixa etária: Idade I");
        } else if (idade >= 26 && idade <= 35) {
            System.out.println("Faixa etária: Idade II");
        } else if (idade >= 36 && idade <= 45) {
            System.out.println("Faixa etária: Idade III");
        } else if (idade >= 46 && idade <= 55) {
            System.out.println("Faixa etária: Idade IV");
        } else if (idade >= 56 && idade <= 65) {
            System.out.println("Faixa etária: Idade V");
        } else {
            System.out.println("Faixa etária: Idade VI");
        }

    }
}
