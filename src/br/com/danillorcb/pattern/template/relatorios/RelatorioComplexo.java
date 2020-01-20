package br.com.danillorcb.pattern.template.relatorios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelatorioComplexo extends TemplateRelatorios {

	@Override
	protected void imprimeRodape(Banco banco) {
		LocalDate data = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.printf("%n%-50s%40s", banco.getEmail(), data.format(dtf));
	}

	@Override
	protected void imprimeCorpo(Banco banco) {
		for (Conta conta : banco.getContas()) {
			System.out.printf("%-40s%-10s%-20s%20.2f%n", conta.getTitular(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
		}
	}

	@Override
	protected void imprimeCabecalho(Banco banco) {
		// nome do banco, endereço, telefone
		System.out.printf("%-40s%-30s%20s%n%n", banco.getNome(), banco.getEndereco(), banco.getTelefone());		
	}	

}
