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
@Table(name = "candidato")
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    private String turno;
    
    @Column(name = "lingua_estrangeira")
    private String linguaEstrangeira;

    @ManyToOne
    @JoinColumn(name = "fk_id_cargo")
    private Cargo cargo;

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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLinguaEstrangeira() {
        return linguaEstrangeira;
    }

    public void setLinguaEstrangeira(String linguaEstrangeira) {
        this.linguaEstrangeira = linguaEstrangeira;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((linguaEstrangeira == null) ? 0 : linguaEstrangeira.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((turno == null) ? 0 : turno.hashCode());
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
        Prova other = (Prova) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (linguaEstrangeira == null) {
            if (other.linguaEstrangeira != null)
                return false;
        } else if (!linguaEstrangeira.equals(other.linguaEstrangeira))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (turno == null) {
            if (other.turno != null)
                return false;
        } else if (!turno.equals(other.turno))
            return false;
        return true;
    }

    
}
