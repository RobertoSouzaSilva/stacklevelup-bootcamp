CREATE TABLE processo_seletivo(
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    vagas INTEGER,
    data_prova_conhecimentos DATE NOT NULL,
    data_inicio_recurso_prova_conhecimentos DATE NOT NULL
);