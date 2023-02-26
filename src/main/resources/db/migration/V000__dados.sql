CREATE TABLE papel(
                      id BIGINT NOT NULL,
                      nome VARCHAR(255),
                      CONSTRAINT pk_papel PRIMARY KEY(id)
);
/*CREATE SEQUENCE papel_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1;*/


CREATE TABLE pessoa(
                       id BIGINT NOT NULL,
                       nome VARCHAR(255),
                       usuario VARCHAR(255),
                       email VARCHAR(255),
                       senha VARCHAR(255),
                       papel_id BIGINT NOT NULL,
                       CONSTRAINT pk_pessoa PRIMARY KEY(id)
);
/*CREATE SEQUENCE pessoa_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1;*/

ALTER TABLE pessoa ADD CONSTRAINT FK_PESSOA_ON_PAPEL FOREIGN KEY (papel_id) REFERENCES papel(id);

CREATE TABLE verbete(
                        id BIGINT NOT NULL,
                        verbete VARCHAR(255),
                        pessoa_id BIGINT NOT NULL,
                        CONSTRAINT pk_verbete PRIMARY KEY(id)
);
/*CREATE SEQUENCE verbete_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1;*/

ALTER TABLE verbete ADD CONSTRAINT FK_VERBETE_ON_PAPEL FOREIGN KEY (pessoa_id) REFERENCES pessoa(id);

CREATE TABLE significado(
                            id BIGINT NOT NULL,
                            significado VARCHAR(1500),
                            verbete_id BIGINT NOT NULL,
                            pessoa_id BIGINT NOT NULL,
                            CONSTRAINT pk_significado PRIMARY KEY(id)

);
/*CREATE SEQUENCE significado_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1;*/

ALTER TABLE significado ADD CONSTRAINT FK_SIGNIFICADO_ON_PAPEL FOREIGN KEY (verbete_id) REFERENCES verbete(id);

INSERT INTO papel (id, nome) VALUES
    (1, 'administrador'),
    (2, 'moderador'),
    (3, 'usuario');


INSERT INTO pessoa(id, nome, usuario, email, senha, papel_id)VALUES
    (1, 'José Antônio', 'jantonio', 'jantonio@email.com', '12345', 1),
    (2, 'Maria Fernanda', 'fernanda', 'fernanda@email.com', '12345', 2),
    (3, 'André', 'andre', 'andre@email.com', '12345', 3);

INSERT INTO verbete(id, verbete, pessoa_id) VALUES
    (1, 'A contento', 1),
    (2, 'Abertura de falência', 1),
    (3, 'Abolitio criminis', 2),
    (4, 'Ab-rogação', 2),
    (5, 'Abuso de autoridade', 2),
    (6, 'Abuso de poder', 1);

INSERT INTO significado(id, significado, verbete_id, pessoa_id) VALUES
    (1, 'Diz-se de tudo que se fez satisfatoriamente, ou que se concluiu segundo os próprios desejos anteriormente manifestados.', 1, 1),
    (2, 'Ato pelo qual se declara o estado de insolvência de um devedor comerciante e se autoriza o processo de falência correspondente, com a nomeação do síndico, arrecadação dos bens e verificação dos credores etc. A falência se abre no domicílio do devedor ou no lugar em que ele tem o seu principal estabelecimento.', 2, 1),
    (3, 'Expressão latina utilizada em Direito Penal. Significa a extinção do crime devido à publicação de lei que extingue o delito anteriormente previsto no ordenamento jurídico.', 3, 2),
    (4, 'É a revogação total de uma lei ou decreto, de uma regra ou regulamento, por uma nova lei, decreto ou regulamento. É ainda a ação de cassar, revogar, tornar nulo ou sem efeito um ato anterior. Em regra, ab-rogação somente ocorre em virtude de lei ou regulamento que venha implantar novos princípios, determinando a anulação ou cassação da lei, regulamento ou costume anteriormente vigentes.', 4,2 ),
    (5, 'Abuso de poder conferido a alguém, seja poder público (administrativo), como poder privado (pátrio poder, poder conjugal).', 5, 2),
    (6, ' Excesso de limites nas funções administrativas cujas atribuições são definidas e determinadas em lei. ', 5, 3),
    (7, 'Emprego de violência para execução de um ato, que se efetiva sob proteção de um princípio de autoridade. A jurisprudência caracteriza a sua existência, quando ocorrem os seguintes elementos: a) que o fato incriminado constitua crime; b) que o tenha praticado um funcionário público ou pessoa investida de autoridade pública; c) que haja sido cometido no exercício de sua função; d) que não se verifique motivo legítimo, que o justifique. O Código Penal prevê pena de detenção, de um mês a um ano, para quem comete esse crime.', 5, 2),
    (8, '1. Exorbitância dos poderes conferidos. Excesso de mandato. Exercícios de atos não outorgados ou não expressos no mandato ou na procuração.', 6, 1),
    (9, 'Prática de atos que excedem as atribuições conferidas em lei ou que escapam à alçada funcional. Arbitrariedade. A Lei nº 4.898/65 regula o direito de representação e o processo de responsabilidade administrativa civil e penal nos casos de abuso de poder.', 6, 1);