package com.robertosouza.resourcesfullstack.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "fk_id_disciplina")
    private Disciplina disciplina;

    private String codEquivalencia;

    private Integer numero;

    private Boolean alterada;

    @ManyToOne
    @JoinColumn(name = "fk_id_prova")
    private Prova prova;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodEquivalencia() {
        return codEquivalencia;
    }

    public void setCodEquivalencia(String codEquivalencia) {
        this.codEquivalencia = codEquivalencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getAlterada() {
        return alterada;
    }

    public void setAlterada(Boolean alterada) {
        this.alterada = alterada;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alterada == null) ? 0 : alterada.hashCode());
        result = prime * result + ((codEquivalencia == null) ? 0 : codEquivalencia.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((prova == null) ? 0 : prova.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Questao other = (Questao) obj;
        if (alterada == null) {
            if (other.alterada != null)
                return false;
        } else if (!alterada.equals(other.alterada))
            return false;
        if (codEquivalencia == null) {
            if (other.codEquivalencia != null)
                return false;
        } else if (!codEquivalencia.equals(other.codEquivalencia))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (prova == null) {
            if (other.prova != null)
                return false;
        } else if (!prova.equals(other.prova))
            return false;
        return true;
    }

    

    
}
