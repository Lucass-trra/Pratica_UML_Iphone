package Iphone.Musica;

import java.util.ArrayList;
import java.util.List;

public class Reprodutor_Musical implements Musica_Interface{
	private List<Reprodutor_Musical> musicasCurtidas;
	private String nome;
	private String genero;
	private double duracao;
	private boolean estado;
	
	
	public Reprodutor_Musical(String nome, String genero, double duracao, boolean estado) {
		this.musicasCurtidas = new ArrayList<>();
		this.nome = nome;
		this.genero = genero;
		this.duracao = duracao;
		this.estado = estado;
	}
	
	public void adicionarCurtida(String nome, String genero, double duracao, boolean estado) {
		musicasCurtidas.add(new Reprodutor_Musical(nome, genero, duracao, estado));
	}
	
	public void fecharReprodutorMusical() {
		System.out.println("Fechando reprodutor musical");
	}
	
	@Override
	public void tocar(String nome) {
		for(Reprodutor_Musical rp : musicasCurtidas) {
			if(rp.getNome().equals(nome)) {
				rp.setEstado(true);
				System.out.println("Tocando musica");
			}
		}
		
	}

	@Override
	public void pausar(String nome) {
		for(Reprodutor_Musical rp : musicasCurtidas) {
			if(rp.getNome().equals(nome)) {
				rp.setEstado(false);
				System.out.println("Pausando musica");
			}
		}
		
	}

	@Override
	public void selecionarMusica(String nome) {
		String musicaEscolhida = musicasCurtidas.stream()
				.filter(m -> m.getNome().equals(nome))
				.toString();
		
		System.out.println("Selecionando a musica: " + musicaEscolhida);
		
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public double getDuracao() {
		return duracao;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reprodutor_Musical [nome=" + nome + ", genero=" + genero + ", duracao=" + duracao + ", estado=" + estado
				+ "]";
	}
	
}
