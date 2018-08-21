package Exercicio.data0808.Repositorio;

import java.util.ArrayList;

import Exercicio.data0808.Entidades.Gerente;

public class RepositorioGerente implements IRepositorioyGerente{

	ArrayList<Gerente> listaDeGerentes = new ArrayList<Gerente>();

	@Override
	public String salvarGerente(Gerente gerente) {
		try {
			listaDeGerentes.add(gerente);
		} catch (Exception e) {
			return "Error";
		}
		
		return "Gerente salvo";
	}

	@Override
	public String deletarGerente(Gerente gerente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Gerente> listarGerentes() {
		return listaDeGerentes;
	}

	@Override
	public boolean alteraGerente(Gerente gerente) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public void imprimirListaGerentes() {
		ArrayList<Gerente> listaGerente = new ArrayList<Gerente>();
		listaGerente = listarGerentes();
		
		for (Gerente gerente : listaGerente) {
			
			if (listaGerente.isEmpty()) {
				System.out.println("Não ha Gerentes cadastrados em nossa base de dados.");
			} else {
				System.out.println(gerente.toString());
			}
			
		}
	}
	
}
