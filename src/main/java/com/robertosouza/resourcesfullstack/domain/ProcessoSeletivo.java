package com.robertosouza.resourcesfullstack.domain;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processo_seletivo")
public class ProcessoSeletivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    private Integer vagas;

    @Column(name = "data_prova_conhecimentos")
    private LocalTime dataProvaConhecimentos;

    @Column(name = "data_inicio_recurso_prova_conhecimentos")
    private LocalTime dataInicioRecursoProvaConhecimentos;

    @Column(name = "data_fim_recurso_prova_conhecimentos")
    private LocalTime dataFimRecursoProvaConhecimentos;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public LocalTime getDataProvaConhecimentos() {
        return dataProvaConhecimentos;
    }

    public void setDataProvaConhecimentos(LocalTime dataProvaConhecimentos) {
        this.dataProvaConhecimentos = dataProvaConhecimentos;
    }

    public LocalTime getDataInicioRecursoProvaConhecimentos() {
        return dataInicioRecursoProvaConhecimentos;
    }

    public void setDataInicioRecursoProvaConhecimentos(LocalTime dataInicioRecursoProvaConhecimentos) {
        this.dataInicioRecursoProvaConhecimentos = dataInicioRecursoProvaConhecimentos;
    }

    public LocalTime getDataFimRecursoProvaConhecimentos() {
        return dataFimRecursoProvaConhecimentos;
    }

    public void setDataFimRecursoProvaConhecimentos(LocalTime dataFimRecursoProvaConhecimentos) {
        this.dataFimRecursoProvaConhecimentos = dataFimRecursoProvaConhecimentos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result
                + ((dataFimRecursoProvaConhecimentos == null) ? 0 : dataFimRecursoProvaConhecimentos.hashCode());
        result = prime * result
                + ((dataInicioRecursoProvaConhecimentos == null) ? 0 : dataInicioRecursoProvaConhecimentos.hashCode());
        result = prime * result + ((dataProvaConhecimentos == null) ? 0 : dataProvaConhecimentos.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((vagas == null) ? 0 : vagas.hashCode());
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
        ProcessoSeletivo other = (ProcessoSeletivo) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (dataFimRecursoProvaConhecimentos == null) {
            if (other.dataFimRecursoProvaConhecimentos != null)
                return false;
        } else if (!dataFimRecursoProvaConhecimentos.equals(other.dataFimRecursoProvaConhecimentos))
            return false;
        if (dataInicioRecursoProvaConhecimentos == null) {
            if (other.dataInicioRecursoProvaConhecimentos != null)
                return false;
        } else if (!dataInicioRecursoProvaConhecimentos.equals(other.dataInicioRecursoProvaConhecimentos))
            return false;
        if (dataProvaConhecimentos == null) {
            if (other.dataProvaConhecimentos != null)
                return false;
        } else if (!dataProvaConhecimentos.equals(other.dataProvaConhecimentos))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (vagas == null) {
            if (other.vagas != null)
                return false;
        } else if (!vagas.equals(other.vagas))
            return false;
        return true;
    }

    


    
}
