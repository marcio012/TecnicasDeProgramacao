package Exercicio.data0808.Repositorio;

import java.util.ArrayList;

import Exercicio.data0808.Entidades.Funcionario;

public class RepositorioFuncionario implements IRepositoryInterfaceFuncionario {

	ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
	
	@Override
	public String salvarFuncionario(Funcionario funcionario) {
		
		try {
			listaDeFuncionarios.add(funcionario);
		} catch (Exception e) {
			return "Error";
		}
		
		return "Funcionario salvo";
		
	}

	@Override
	public String deletarFuncionario(Funcionario funcionario) {
		
		return "Teste";
	}

	@Override
	public ArrayList<Funcionario> listarFuncionarios() {
		return listaDeFuncionarios;
	}

	@Override
	public boolean alteraFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void imprimirListaFuncionarios() {
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		listaFuncionario = listarFuncionarios();
		
		for (Funcionario funcionario : listaFuncionario) {
			System.out.println(funcionario.toString());
		}
	}

	
}
