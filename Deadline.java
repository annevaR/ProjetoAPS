package projetoaps;

import java.sql.Date;


public class Deadline {
    private Date dataSubmissao;
    private Date dataAtualizacao;
    private Date dataConclusao;
    private Atividade atividade;
   
    
    //

    public Date getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(Date dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }
   
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Deadline() {
        Date data;
        data = new java.sql.Date(2018, 01, 01);
        this.dataSubmissao = data;
        this.dataConclusao = data;
        this.dataAtualizacao = null;   
    }

    public Deadline(Date dataSubmissao, Date dataAtualizacao, Date dataConclusao) {
        this.dataSubmissao = dataSubmissao;
        this.dataAtualizacao = dataAtualizacao;
        this.dataConclusao = dataConclusao;
    }

    //

    @Override
    public String toString() {
        return "Deadline{" + "dataSubmissao=" + dataSubmissao + ", dataAtualizacao=" + dataAtualizacao + ", dataConclusao=" + dataConclusao + ", atividade=" + atividade + '}';
    }
    
    
    
    
}
