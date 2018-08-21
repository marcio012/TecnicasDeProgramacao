package Exercicio.data0808.Repositorio;

import java.util.ArrayList;

import Exercicio.data0808.Entidades.Gerente;

public interface IRepositorioyGerente {

	public String salvarGerente(Gerente gerente);
	public String deletarGerente(Gerente gerente);
	public ArrayList<Gerente> listarGerentes();
	public boolean alteraGerente(Gerente gerente);
	
	
}
