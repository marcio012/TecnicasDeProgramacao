package Exercicio.data0808.Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario {

	private String nome; 
	private LocalDate dataAdmisao;
	private BigDecimal salario;
	private BigDecimal bonus;
	private BigDecimal salarioBruto;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	
	public Funcionario(String nome, int ano, int mes, int dia, BigDecimal salario, BigDecimal bonus) {
		super();
		this.nome = nome;
		this.dataAdmisao = transformData(ano, mes, dia);
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
	
	public LocalDate transformData(int ano, int mes, int dia) {
		LocalDate dataAdmisao = LocalDate.of(ano, mes, dia);
		return dataAdmisao;
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
				" Salário Bruto: R$ " + getSalarioBruto();
				
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios() {
		
		for(Funcionario funcionario: funcionarios) {
			System.out.println(funcionario.toString());
		}
		
	}
	
	
}
