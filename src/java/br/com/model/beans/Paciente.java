package br.com.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
public class Paciente extends Pessoa implements Serializable {
    
    private String tipoSanguineo;
    private boolean fatorRH;
    private int dependentes;
    private String limitacao;
    private String alergias;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataMorte;
    private boolean doador;

    public Paciente() {
    }

    public Paciente(String tipoSanguineo, boolean fatorRH, int dependentes, String limitacao, String alergias, Date dataMorte, boolean doador, String nome, String cpf, String sexo, Date dataNascimento, Endereco endereco, Contato contato) {
        super(nome, cpf, sexo, dataNascimento, endereco, contato);
        this.tipoSanguineo = tipoSanguineo;
        this.fatorRH = fatorRH;
        this.dependentes = dependentes;
        this.limitacao = limitacao;
        this.alergias = alergias;
        this.dataMorte = dataMorte;
        this.doador = doador;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public boolean isFatorRH() {
        return fatorRH;
    }

    public void setFatorRH(boolean fatorRH) {
        this.fatorRH = fatorRH;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public String getLimitacao() {
        return limitacao;
    }

    public void setLimitacao(String limitacao) {
        this.limitacao = limitacao;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public boolean isDoador() {
        return doador;
    }

    public void setDoador(boolean doador) {
        this.doador = doador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.tipoSanguineo);
        hash = 47 * hash + (this.fatorRH ? 1 : 0);
        hash = 47 * hash + this.dependentes;
        hash = 47 * hash + Objects.hashCode(this.limitacao);
        hash = 47 * hash + Objects.hashCode(this.alergias);
        hash = 47 * hash + Objects.hashCode(this.dataMorte);
        hash = 47 * hash + (this.doador ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.fatorRH != other.fatorRH) {
            return false;
        }
        if (this.dependentes != other.dependentes) {
            return false;
        }
        if (this.doador != other.doador) {
            return false;
        }
        if (!Objects.equals(this.tipoSanguineo, other.tipoSanguineo)) {
            return false;
        }
        if (!Objects.equals(this.limitacao, other.limitacao)) {
            return false;
        }
        if (!Objects.equals(this.alergias, other.alergias)) {
            return false;
        }
        if (!Objects.equals(this.dataMorte, other.dataMorte)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "tipoSanguineo=" + tipoSanguineo + ", fatorRH=" + fatorRH + ", dependentes=" + dependentes + ", limitacao=" + limitacao + ", alergias=" + alergias + ", dataMorte=" + dataMorte + ", doador=" + doador + '}';
    }

    

}
