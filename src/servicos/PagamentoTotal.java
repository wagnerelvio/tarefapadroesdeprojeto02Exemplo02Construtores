package servicos;

/**
 * @author wagne
 *
 */
public class PagamentoTotal {

	private TaxaDeServico taxaDeServico;
	private TaxaDeServicoDeEntrega taxaDeServicoDeEntrega;

	public PagamentoTotal(TaxaDeServico taxaDeServico, TaxaDeServicoDeEntrega taxaDeServicoDeEntrega) {
		this.taxaDeServico = taxaDeServico;
		this.taxaDeServicoDeEntrega = taxaDeServicoDeEntrega;

	}

	public double precoTotal(double custo, String regiao) {
		return custo + taxaDeServicoDeEntrega.taxa(regiao) + taxaDeServico.taxa(custo);

	}

}