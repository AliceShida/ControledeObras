package pacote;
import java.util.Random;
import java.util.Date;

public class Reclamacoes {
    private int numIdentificacao; // Identificação da reclamação
    private String endereco; // Rua, número, bairro
    private int tamanhoBuraco; // Tamanho do buraco (0 a 10)
    private String localizacao; // Localização (rua ou calçada)
    private Date dataHora; // Data e hora da reclamação
    private String situacao; // Situação (registrada ou consertada)

    public Reclamacoes(String endereco, int tamanhoBuraco, String localizacao, Date dataHoraReclamacao) {
        this.numIdentificacao = new Random().nextInt(1000); // Número de identificação aleatório
        this.endereco = endereco;
        this.tamanhoBuraco = tamanhoBuraco;
        this.localizacao = localizacao;
        this.dataHora = dataHoraReclamacao;
        this.situacao = "registrada";
    }

    public int getNumIdentificacao() {
        return numIdentificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTamanhoBuraco() {
        return tamanhoBuraco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void registrarReclamacao() {
        // Lógica para registrar a reclamação aqui
        // Por exemplo, salvar no banco de dados ou enviar para um sistema externo
        // Implemente conforme necessário.
    }
}
