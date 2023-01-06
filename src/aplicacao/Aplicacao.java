package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import servicos.PagamentoTotal;
import servicos.TaxaDeServico;
import servicos.TaxaDeServicoDeEntrega;

/**
 * @author wagne
 *
 */
public class Aplicacao {

	public static void main(String[] args) {
			

		TaxaDeServico taxaDeServico = new TaxaDeServico();
		TaxaDeServicoDeEntrega taxaDeServicoDeEntrega = new TaxaDeServicoDeEntrega();

		PagamentoTotal pagamento = new PagamentoTotal(taxaDeServico, taxaDeServicoDeEntrega);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("\n **  Data e hora: "+dtf.format(LocalDateTime.now()) +"  **");
		System.out.println("\nValores totais (preço + frete) por região para um produto com o valor de R$ 1.000,00\n");
		
        
        
		
		System.out.println("Valor total (preço + frete) para a região Sudeste: " + pagamento.precoTotal(1000.0, "SE"));
		System.out.println("Valor total (preço + frete) para a região Sul: " + pagamento.precoTotal(1000.0, "S"));
		System.out.println("Valor total (preço + frete) para a região Centro Oeste: " + pagamento.precoTotal(1000.0, "CO"));
		System.out.println("Valor total (preço + frete) para a região Nordeste: " + pagamento.precoTotal(1000.0, "NE"));
		System.out.println("Valor total (preço + frete) para a região Norte: " + pagamento.precoTotal(1000.0, "N"));
		System.out.println("Valor total (preço + frete) para Montividéu: " + pagamento.precoTotal(1000.0, "Montivideu"));

	}

}