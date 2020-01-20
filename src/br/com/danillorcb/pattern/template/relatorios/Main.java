package br.com.danillorcb.pattern.template.relatorios;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta("0123", "12345-6", "Alberto Felipe", 4250.00));
		contas.add(new Conta("0456", "67890-6", "Felipe Gonçalves", 3550.00));
		contas.add(new Conta("0789", "45678-6", "João Pedro da Silva", 9850.00));

		Banco banco = new Banco();
		banco.setNome("Itau");
		banco.setEndereco("Av. Paulista");
		banco.setEmail("itau.unibanco@email.com");
		banco.setTelefone("(11) 3333-9999");
		banco.setContas(contas);
		
		RelatorioSimples simples = new RelatorioSimples();
		simples.gerar(banco);
		
		System.out.println();
		System.out.println();
		
		RelatorioComplexo complexo = new RelatorioComplexo();
		complexo.gerar(banco);
	}

}
