package Entidades;

public class Pessoa {

	public void andar() {
		System.out.print("Andando");
	}

	public void fala(String informacao) {
		System.out.print(informacao);
	}

	public void comer(Produto produto) {
		produto.getNome();

	}

}
