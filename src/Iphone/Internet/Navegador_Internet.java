package Iphone.Internet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Navegador_Internet implements Internet_Interface{
	private String nomeSite;
	private String dominio;
	private LocalDate dataAcesso;
	
	private List<Navegador_Internet> historico = new ArrayList<>();
	
	public Navegador_Internet(String nomeSite, String dominio, LocalDate dataAcesso) {
		this.nomeSite = nomeSite;
		this.dominio = dominio;
		this.dataAcesso = dataAcesso;
	}

	
	public void adicioanarHistorico(String nome, String dominio, LocalDate dataAcesso) {
		historico.add(new Navegador_Internet(nome, dominio, dataAcesso));
	}
	
	public void fecharNavegadorInternet() {
		System.out.println("fechando navegador");
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void adicionarNovaAba(String dominio) {
		String siteEscolhido = historico.stream()
				.filter(h -> h.getDominio().equals(dominio))
				.toString();
		
		System.out.println("adicionando o: " + siteEscolhido);
		
	}

	@Override
	public void atualizarPagina(String dominio) {
		String siteEscolhido = historico.stream()
				.filter(h -> h.getDominio().equals(dominio))
				.toString();
		
		System.out.println("Atualizando o: " + siteEscolhido);
		
	}


	public String getNomeSite() {
		return nomeSite;
	}


	public String getDominio() {
		return dominio;
	}


	public LocalDate getDataAcesso() {
		return dataAcesso;
	}


	@Override
	public String toString() {
		return "[nomeSite=" + nomeSite + ", dominio=" + dominio + ", dataAcesso=" + dataAcesso + "]";
	}
	
}
