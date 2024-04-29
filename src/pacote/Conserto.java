package pacote;

public class Conserto extends Reclamacoes {
	int numReclamacao;
	Date dataHoraConserto;
	double valorConserto;
	
	  public Conserto(int numReclamacao, String dataHoraConserto, double valorConserto) {
	        this.numReclamacao = numReclamacao;
	        this.dataHoraConserto = dataHoraConserto;
	        this.valorConserto = valorConserto;
	    }

	public int getNumReclamacao() {
		return numReclamacao;
	}

	public String getDataHoraConserto() {
		return dataHoraConserto;
	}

	public double getValorConserto() {
		return valorConserto;
	}

	   
	}
