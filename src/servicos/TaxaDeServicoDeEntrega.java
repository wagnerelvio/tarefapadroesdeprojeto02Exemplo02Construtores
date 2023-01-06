package servicos;

/**
 * @author wagne
 *
 */
public class TaxaDeServicoDeEntrega {
	public double taxa(String regiao) {
		if ("SE".equalsIgnoreCase(regiao)) {return 20.0;
		} else if ("S".equalsIgnoreCase(regiao)) { return 40.0;
		} else if ("CO".equalsIgnoreCase(regiao)) { return 80.0;
		} else if ("NE".equalsIgnoreCase(regiao))  { return 100.0;
		} else if ("N".equalsIgnoreCase(regiao))  { return 200.0;
		} else {
				return 500.00;
	    }
	}
}