CREATE TABLE papel(
    id BIGINT NOT NULL,
    nome VARCHAR(255),
    CONSTRAINT pk_papel PRIMARY KEY(id)
);


CREATE TABLE pessoa(
    id BIGINT NOT NULL,
    nome VARCHAR(255),
    usuario VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255),
    papel_id BIGINT NOT NULL,
    CONSTRAINT pk_pessoa PRIMARY KEY(id)
);

ALTER TABLE pessoa ADD CONSTRAINT FK_PESSOA_ON_PAPEL FOREIGN KEY (papel_id) REFERENCES papel(id);

CREATE TABLE verbete(
    id BIGINT NOT NULL,
    verbete VARCHAR(255),
    pessoa_id BIGINT NOT NULL,
    CONSTRAINT pk_verbete PRIMARY KEY(id)
);

ALTER TABLE verbete ADD CONSTRAINT FK_VERBETE_ON_PAPEL FOREIGN KEY (pessoa_id) REFERENCES pessoa(id);

CREATE TABLE significado(
    id BIGINT NOT NULL,
    significado VARCHAR(1500),
    verbete_id BIGINT NOT NULL,
    pessoa_id BIGINT NOT NULL,
    CONSTRAINT pk_significado PRIMARY KEY(id)

);

ALTER TABLE significado ADD CONSTRAINT FK_SIGNIFICADO_ON_PAPEL FOREIGN KEY (verbete_id) REFERENCES verbete(id);

