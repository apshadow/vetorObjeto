package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.shift.Aluno;

public class TesteAluno {

	public static void main(String[] args) {

		int resp = 0, faltas = 0, idade = 0, indice = 0, qtd = 0;

		double media = 0;
		String nome = null;

		qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));

		Aluno[] alunos = new Aluno[qtd];

		while (resp == 0 && indice < qtd) {

			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média"));
			faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas"));
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));

			alunos[indice] = new Aluno();

			// @formatter:off
 			alunos[indice]
				.setFaltas(faltas)
				.setIdade(idade)
				.setMedia(media)
				.setNome(nome);
 			// @formatter:on

			indice++;

			// @formatter:off
			resp = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Alunos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			// @formatter:on
		}

		for (Aluno a : alunos) {
			System.out.println(a);
		}

		System.out.println("Média de nota dos Alunos: " + media(alunos));

		System.out.println("Total de faltas dos Alunos: " + totalFaltas(alunos));

		System.out.println("Média de idade dos Alunos: " + mediaDeIdade(alunos));

		System.out.println("Aluno mais velho: " + alunoMaisVelho(alunos));

		System.out.println("Aluno mais novo: " + alunoMaisNovo(alunos));

	}

	private static Aluno alunoMaisNovo(Aluno[] alunos) {
		Aluno maisNovo = null;
		for (Aluno a : alunos) {
			if (maisNovo == null || maisNovo.getIdade() >= a.getIdade())
				maisNovo = a;
		}
		return maisNovo;
	}

	private static Aluno alunoMaisVelho(Aluno[] alunos) {
		Aluno maisVelho = null;
		for (Aluno a : alunos) {
			if (maisVelho == null || maisVelho.getIdade() < a.getIdade())
				maisVelho = a;
		}
		return maisVelho;
	}

	private static double mediaDeIdade(Aluno[] alunos) {
		double soma = 0;
		for (Aluno a : alunos) {
			soma += a.getIdade();
		}
		return soma / alunos.length;
	}

	private static int totalFaltas(Aluno[] alunos) {
		int faltas = 0;
		for (Aluno a : alunos) {
			faltas += a.getFaltas();
		}
		return faltas;
	}

	public static double media(Aluno[] alunos) {
		double soma = 0;
		for (Aluno a : alunos) {
			soma += a.getMedia();
		}
		return soma / alunos.length;
	}

	public static int menor(int[] numeros) {
		int menor = Integer.MAX_VALUE; // (2^32)-1
		for (int n : numeros) {
			if (menor > n)
				menor = n;
		}
		return menor;
	}

	public static int maior(int[] numeros) {
		int maior = Integer.MIN_VALUE; // -(2^32)
		for (int n : numeros) {
			if (maior < n)
				maior = n;
		}
		return maior;
	}

}
