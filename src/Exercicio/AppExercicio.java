package Exercicio;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import Exercicio.data0808.Entidades.Funcionario;
import Exercicio.data0808.Entidades.Gerente;
import Exercicio.data0808.Repositorio.RepositorioFuncionario;
import Exercicio.data0808.Repositorio.RepositorioGerente;

public class AppExercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner gsc = new Scanner(System.in);
		
		RepositorioFuncionario arrayFunc = new RepositorioFuncionario();
		RepositorioGerente arrayGerente = new RepositorioGerente();
		
		
		int inicio = 0;

		menu();
		inicio = sc.nextInt();

		System.out.println();

		while (inicio != 0) {

			sc.nextLine();

			switch (inicio) {

			case 1:

				// Funcionario
				
				System.out.println("Nome Funcionário: ");
				String nome = sc.nextLine();

				System.out.println("Data de Admisão? ");
				System.out.println("Dia: ");
				int dia = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Ano: ");
				int ano = sc.nextInt();

				System.out.println("Salário Inicial? R$");
				BigDecimal salario = sc.nextBigDecimal();

				System.out.println("Bonus de salário? ");
				BigDecimal bonus = sc.nextBigDecimal();

				Funcionario func = new Funcionario(nome, ano, mes, dia, salario, bonus);
				System.out.println(func.toString());
				System.out.println(arrayFunc.salvarFuncionario(func));

				break;

			case 2:
//				Gerente
				
				System.out.println("Nome Gerente: ");
				nome = gsc.nextLine();
				System.out.println("Data da Admisão? ");
				System.out.println("Dia: ");
				dia = gsc.nextInt();
				System.out.println("Mes: ");
				mes = gsc.nextInt();
				System.out.println("Ano: ");
				ano = gsc.nextInt();

//				gerente.setDataAdmisao(ano, mes, dia);

				System.out.println("Salário Inicial? R$");
				salario = gsc.nextBigDecimal();

				System.out.println("Bonus de salário? ");
				bonus = gsc.nextBigDecimal();
				
				Gerente gerente = new Gerente(nome, ano, mes, dia, salario, bonus);
				gerente.aumentaSalario(gerente.getBonus());
				System.out.println(gerente.toString());
				System.out.println(arrayGerente.salvarGerente(gerente));

				break;
				
			case 3: 
		
				System.out.println("Relatorio: ");
				System.out.println("Lista de Funcionário: ");
				arrayFunc.imprimirListaFuncionarios();	
				System.out.println("--------------------------");
				System.out.println("Lista de Gerentes: ");
				arrayGerente.imprimirListaGerentes();	
				break;
				
			default:
				System.out.println("Informe uma cargo valido.");
				break;
			}

			System.out.println("=======================================================");
			menu();
			inicio = sc.nextInt();

		}

		System.out.println("Obrigado por usar o sistema de RH da Tabajara Empreendimentos");

		sc.close();
		gsc.close();

	}
	
	public static void menu() {
		System.out.println("Bem vindo ao sistema de RH da Tabajara Empreendimentos:");
		System.out.println("=======================================================");
		System.out.println("Digete a opção desejavel: ");
		System.out.println("1 - Funcionario: ");
		System.out.println("2 - Gerente: ");
		System.out.println("3 - Relatório: ");
		System.out.println("0 - Sair: ");
	}
}
