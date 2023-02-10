package br.com.fiap.shift;

public class Aluno {

	private String nome;
	private double media;
	private int faltas;
	private int idade;

	public Aluno(String nome, double media, int faltas, int idade) {
		super();
		this.nome = nome;
		this.media = media;
		this.faltas = faltas;
		this.idade = idade;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public Aluno setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public double getMedia() {
		return media;
	}

	public Aluno setMedia(double media) {
		this.media = media;
		return this;
	}

	public int getFaltas() {
		return faltas;
	}

	public Aluno setFaltas(int faltas) {
		this.faltas = faltas;
		return this;
	}

	public int getIdade() {
		return idade;
	}

	public Aluno setIdade(int idade) {
		this.idade = idade;
		return this;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", media=" + media + ", faltas=" + faltas + ", idade=" + idade + "]";
	}


}
