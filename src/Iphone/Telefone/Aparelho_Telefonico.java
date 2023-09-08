package Iphone.Telefone;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Aparelho_Telefonico implements Telefone_Interface {
	private Set<Aparelho_Telefonico> listaContatos;
	
	private String nome;
	private long numero;
	private String sms;
		
	public Aparelho_Telefonico(String nome, long numero, String sms) {
		this.listaContatos = new LinkedHashSet<>();
		this.nome = nome;
		this.numero = numero;
		this.sms = sms;
	}

	public void adicionarContato(String nome, long Numero, String sms) {
		listaContatos.add(new Aparelho_Telefonico(nome, Numero, sms));
	}
	
	public void fecharAparelhoTelefonico() {
		System.out.println("fechando aparelho telefonico");
	}
	
	@Override
	public void ligar(String nome) {
		String contatoEscolhido = listaContatos.stream()
				.filter(c -> c.getNome().equals(nome))
				.toString();
		
		System.out.println("Ligando para o: " + contatoEscolhido);
		
	}

	@Override
	public void atender(String nome) {
		String atender = listaContatos.stream()
				.filter(c -> c.getNome().equals(nome))
				.toString();
		
		System.out.println("Atendendo o: " + atender);
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando o correio de voz");
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho_Telefonico other = (Aparelho_Telefonico) obj;
		return numero == other.numero;
	}

	public String getNome() {
		return nome;
	}

	public long getNumero() {
		return numero;
	}

	public String getSms() {
		return sms;
	}

	@Override
	public String toString() {
		return "Aparelho_Telefonico [nome=" + nome + ", numero=" + numero + ", sms=" + sms + "]";
	}

}
