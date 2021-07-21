CREATE TABLE cargo(
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    nome_simplificado VARCHAR(50),
    nivel VARCHAR(20),
    total_vagas INTEGER,
    fk_id_processo_seletivo INTEGER NOT NULL REFERENCES processo_seletivo(codigo)
);