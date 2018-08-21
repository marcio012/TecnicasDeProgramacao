package Exercicio.data0808.Repositorio;

import java.util.ArrayList;

import Exercicio.data0808.Entidades.Funcionario;

public interface IRepositorioFuncionario {

	public String salvarFuncionario(Funcionario funcionario);
	public String deletarFuncionario(Funcionario funcionario);
	public ArrayList<Funcionario> listarFuncionarios();
	public boolean alteraFuncionario(Funcionario funcionario);
	
}
