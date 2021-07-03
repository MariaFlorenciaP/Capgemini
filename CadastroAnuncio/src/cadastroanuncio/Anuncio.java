package cadastroanuncio;

import java.util.Date;

public class Anuncio {

    private String nomeAnuncio;
    private String cliente;
    private Date dataInicio;
    private Date dataTermino;
    private Double investimento;

    public Anuncio(String nomeAnuncio, String cliente, Date dataInicio, Date dataTermino, Double investimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Anuncio() {
        this.nomeAnuncio = null;
        this.cliente = null;
        this.dataInicio = null;
        this.dataTermino = null;
        this.investimento = 0.0;
    }

    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    public void setNomeAnuncio(String nomeAnuncio) {
        this.nomeAnuncio = nomeAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Double investimento) {
        this.investimento = investimento;
    }

    @Override
    public String toString() {
        return "Anúncio {Nome do anúncio: " + nomeAnuncio + ", Cliente: " + cliente + ", data inicial: " + dataInicio + ", data final: "
                + dataTermino + ", Investimento diário: " + investimento + "}";

    }

}
