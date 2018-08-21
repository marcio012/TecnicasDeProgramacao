package Exercicio.data0808.Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, int ano, int mes, int dia, BigDecimal salario, BigDecimal bonus) {
		super(nome, ano, mes, dia, salario, bonus);
	}

	public Gerente() {
		
	}

	public void aumentaSalario(BigDecimal percentual) {
		LocalDate dataAtual = LocalDate.now();
		int bonus = dataAtual.compareTo(getDataAdmisao());
		percentual = percentual.add(new BigDecimal(bonus));
		super.aumentaSalario(percentual);  
	}
	
	@Override
	public String toString() {
		return 	"Nome Gerente: " + getNome() + 
				" Data de Admisão: " + getDataAdmisao() + 
				" Salário Liquido: R$ " + getSalario() + 
				" Bonus anual: " + getBonus() + "% " +
				" Salário Bruto: R$ " + getSalarioBruto();
	}
}
