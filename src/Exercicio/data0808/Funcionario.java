package Exercicio.data0808;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {

	private String nome; 
	private LocalDate dataAdmisao;
	private BigDecimal salario;
	private BigDecimal bonus;
	private BigDecimal salarioBruto;
	private ArrayList<Funcionario> funcionarios = new ArrayList();


	public Funcionario(String nome, LocalDate dataAdmisao, BigDecimal salario, BigDecimal bonus) {
		super();
		this.nome = nome;
		this.dataAdmisao = dataAdmisao;
		this.salario = salario;
		this.bonus = bonus;
		this.salarioBruto = salario.add(bonus);
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataAdmisao() {
		return dataAdmisao;
	}

	public void setDataAdmisao(int ano, int mes, int dia) {
		this.dataAdmisao = LocalDate.of(ano, mes, dia);
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public void setSalario(BigDecimal salarioPar) {
		this.salario = salarioPar;
	}

	public void aumentaSalario(BigDecimal percentual) {
		System.out.println("Bonus de Aumento de Salário " + percentual + "%.");
		BigDecimal base = new BigDecimal(100);
		this.salarioBruto = salario.multiply(percentual.divide(base).add(new BigDecimal(1)));	
	}
	
	public BigDecimal getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(BigDecimal salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public String toString() {
		return 	"Nome Funcionário: " + getNome() + 
				" Data de Admisão: " + getDataAdmisao() + 
				" Salário Liquido: R$ " + getSalario() + 
				" Bonus anual: " + getBonus() + "% " +
				" Salário Bruto: R$ " + getSalarioBruto() + 
				funcionarios.add(this);
	}
	
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public String listarFuncionarios() {
		
		String listaFuncionario= "";
		
		for (int i = 0; i < this.funcionarios.size(); i++) {
			Funcionario funcionario = this.funcionarios.get(i);
			listaFuncionario = funcionario.toString(); 
		}
		
		return listaFuncionario;
	}
	
	public void getArrayFuncionarios() {
		for (Funcionario funcionario : funcionarios) {
		
		}
	}
	
	public void getSpliceDataAdmisao() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Dia da Admisão: ");
		int dia = s.nextInt();
		System.out.println("Mes da Admisão: ");
		int mes = s.nextInt();
		System.out.println("Ano da Admisão: ");
		int ano = s.nextInt();
		setDataAdmisao(ano,mes,dia);
		
	}
	
	
	
	
}
