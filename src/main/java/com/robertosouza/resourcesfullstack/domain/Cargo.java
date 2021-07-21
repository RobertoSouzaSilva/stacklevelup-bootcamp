package com.robertosouza.resourcesfullstack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @Column(name = "nome_simplificado")
    private String nomeSimplificado;

    private String nivel;

    @Column(name = "total_vagas")
    private Integer totalVagas;

    @ManyToOne
    @JoinColumn(name = "fk_id_processo_seletivo")
    private ProcessoSeletivo processoSeletivo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSimplificado() {
        return nomeSimplificado;
    }

    public void setNomeSimplificado(String nomeSimplificado) {
        this.nomeSimplificado = nomeSimplificado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(Integer totalVagas) {
        this.totalVagas = totalVagas;
    }

    public ProcessoSeletivo getProcessoSeletivo() {
        return processoSeletivo;
    }

    public void setProcessoSeletivo(ProcessoSeletivo processoSeletivo) {
        this.processoSeletivo = processoSeletivo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((processoSeletivo == null) ? 0 : processoSeletivo.hashCode());
        result = prime * result + ((totalVagas == null) ? 0 : totalVagas.hashCode());
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
        Cargo other = (Cargo) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (nivel == null) {
            if (other.nivel != null)
                return false;
        } else if (!nivel.equals(other.nivel))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (processoSeletivo == null) {
            if (other.processoSeletivo != null)
                return false;
        } else if (!processoSeletivo.equals(other.processoSeletivo))
            return false;
        if (totalVagas == null) {
            if (other.totalVagas != null)
                return false;
        } else if (!totalVagas.equals(other.totalVagas))
            return false;
        return true;
    }

    
    
}
