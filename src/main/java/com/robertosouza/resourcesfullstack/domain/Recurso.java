package com.robertosouza.resourcesfullstack.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recurso")
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String justificativa;

    @ManyToOne
    @JoinColumn(name = "fk_id_candidato")
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "fk_id_questao")
    private Questao questao;

    private String situacao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((candidato == null) ? 0 : candidato.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((justificativa == null) ? 0 : justificativa.hashCode());
        result = prime * result + ((questao == null) ? 0 : questao.hashCode());
        result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
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
        Recurso other = (Recurso) obj;
        if (candidato == null) {
            if (other.candidato != null)
                return false;
        } else if (!candidato.equals(other.candidato))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (justificativa == null) {
            if (other.justificativa != null)
                return false;
        } else if (!justificativa.equals(other.justificativa))
            return false;
        if (questao == null) {
            if (other.questao != null)
                return false;
        } else if (!questao.equals(other.questao))
            return false;
        if (situacao == null) {
            if (other.situacao != null)
                return false;
        } else if (!situacao.equals(other.situacao))
            return false;
        return true;
    }

    
    
}
