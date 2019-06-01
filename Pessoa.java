package Entidades;

public class Pessoa {

	private ArrayList<String> s = new ArrayList<String>();
	public void andar() {
		System.out.print("Andando");
	}

	public void fala(String informacao) {
		System.out.print(informacao);
		s.add(informacao);
	}
	public String informcao(){
		
		return s.get(s.size())
	}

	
	public void ouvindo(Pessoa pessoa) {
		pessoa.informcao();
	}

	public void comer(Produto produto) {
		produto.getNome();

	}

}
