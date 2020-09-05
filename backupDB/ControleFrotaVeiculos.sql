--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.9
-- Dumped by pg_dump version 9.5.9

-- Started on 2020-09-04 23:22:43

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12355)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2247 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- TOC entry 201 (class 1259 OID 17135)
-- Name: sq_pk_id_user; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_id_user
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_id_user OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 17048)
-- Name: sq_pk_idabastecimento; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idabastecimento
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idabastecimento OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 17087)
-- Name: sq_pk_iddeslocamento; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_iddeslocamento
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_iddeslocamento OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 17068)
-- Name: sq_pk_idmanutencao; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idmanutencao
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idmanutencao OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 17097)
-- Name: sq_pk_idmotorista; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idmotorista
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idmotorista OWNER TO postgres;

--
-- TOC entry 195 (class 1259 OID 17106)
-- Name: sq_pk_idmultas; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idmultas
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idmultas OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 17078)
-- Name: sq_pk_idseguro; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idseguro
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idseguro OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 17126)
-- Name: sq_pk_idsetor; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idsetor
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idsetor OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 17058)
-- Name: sq_pk_idtroca_oleo; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idtroca_oleo
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idtroca_oleo OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 17116)
-- Name: sq_pk_iduso; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_iduso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_iduso OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 17038)
-- Name: sq_pk_idveiculo; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_pk_idveiculo
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sq_pk_idveiculo OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 184 (class 1259 OID 17050)
-- Name: tb_abastecimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_abastecimento (
    idabastecimento bigint DEFAULT nextval('sq_pk_idabastecimento'::regclass) NOT NULL,
    km_abastecimento numeric(10,3) NOT NULL,
    data_abasteceimento date NOT NULL,
    nome_estabelecimento character varying(40) NOT NULL,
    custo_abastecimento money NOT NULL,
    combustivel_tipo character varying(20) NOT NULL,
    tanque_cheio boolean NOT NULL,
    total_litros numeric(5,3) NOT NULL,
    cidade character varying(40),
    estado character varying(2),
    numerorecibo integer,
    tipo_recibo character varying(2),
    comentarios character varying(50),
    data_hora_registro timestamp without time zone DEFAULT now(),
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    iduso integer NOT NULL
);


ALTER TABLE tb_abastecimento OWNER TO postgres;

--
-- TOC entry 2248 (class 0 OID 0)
-- Dependencies: 184
-- Name: COLUMN tb_abastecimento.tipo_recibo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_abastecimento.tipo_recibo IS 'Tipo do comprovante: Nota Fiscal (NF), Recibo (RC).';


--
-- TOC entry 194 (class 1259 OID 17099)
-- Name: tb_cadastro_motorista; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_cadastro_motorista (
    idmotorista bigint DEFAULT nextval('sq_pk_idmotorista'::regclass) NOT NULL,
    nome_motorista character varying(40) NOT NULL,
    telefone_motorista character varying(20),
    descricao_motorista character varying(100),
    data_hora_registro timestamp without time zone DEFAULT now()
);


ALTER TABLE tb_cadastro_motorista OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 17040)
-- Name: tb_cadastro_veiculo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_cadastro_veiculo (
    idveiculo bigint DEFAULT nextval('sq_pk_idveiculo'::regclass) NOT NULL,
    modelo_veiculo character varying(40) NOT NULL,
    placa_veiculo character varying(20) NOT NULL,
    km_atual numeric(10,3) NOT NULL,
    marca_veiculo character varying(40) NOT NULL,
    capacidade_tanque numeric(5,3) NOT NULL,
    situacao_veiculo character varying(10) NOT NULL,
    data_hora_registro_veiculo timestamp without time zone DEFAULT now(),
    idseguro integer
);


ALTER TABLE tb_cadastro_veiculo OWNER TO postgres;

--
-- TOC entry 2249 (class 0 OID 0)
-- Dependencies: 182
-- Name: COLUMN tb_cadastro_veiculo.km_atual; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_cadastro_veiculo.km_atual IS 'Quando iniciou a utilização do App no cadastro do veículo qual o km (odômetro - quilômetros rodados).';


--
-- TOC entry 2250 (class 0 OID 0)
-- Dependencies: 182
-- Name: COLUMN tb_cadastro_veiculo.situacao_veiculo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_cadastro_veiculo.situacao_veiculo IS 'Ativo
Inativo';


--
-- TOC entry 192 (class 1259 OID 17089)
-- Name: tb_deslocamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_deslocamento (
    iddeslocamento bigint DEFAULT nextval('sq_pk_iddeslocamento'::regclass) NOT NULL,
    data_saida date NOT NULL,
    km_saida numeric(10,3) NOT NULL,
    data_chegada date NOT NULL,
    km_chegada numeric(10,3) NOT NULL,
    detalhamento_acoes character varying(50) NOT NULL,
    finalizar_percurso boolean,
    km_rodado numeric(10,3),
    data_hora_registro timestamp without time zone DEFAULT now(),
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    iduso integer NOT NULL
);


ALTER TABLE tb_deslocamento OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 17137)
-- Name: tb_login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_login (
    id_user bigint DEFAULT nextval('sq_pk_id_user'::regclass) NOT NULL,
    usuario character varying NOT NULL,
    email character varying(40) NOT NULL,
    login character varying(20) NOT NULL,
    senha character varying(30) NOT NULL,
    perfil character varying(10) NOT NULL,
    data_hora_cadastro timestamp without time zone DEFAULT now()
);


ALTER TABLE tb_login OWNER TO postgres;

--
-- TOC entry 2251 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN tb_login.perfil; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_login.perfil IS 'Usuario comum:  user
Usuario administrador:  adim';


--
-- TOC entry 188 (class 1259 OID 17070)
-- Name: tb_manutencao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_manutencao (
    idmanutencao bigint DEFAULT nextval('sq_pk_idmanutencao'::regclass) NOT NULL,
    data_manutencao date NOT NULL,
    tipo_servico character varying(50) NOT NULL,
    custo_servico money NOT NULL,
    odometro_servico numeric(10,3),
    local_servico character varying(40),
    detalhes character varying(100),
    cidade character varying(40),
    estado character varying(2),
    data_hora_registro timestamp without time zone DEFAULT now(),
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    iduso integer NOT NULL
);


ALTER TABLE tb_manutencao OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 17108)
-- Name: tb_multas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_multas (
    idmultas bigint DEFAULT nextval('sq_pk_idmultas'::regclass) NOT NULL,
    data_multa date NOT NULL,
    valor_multa money NOT NULL,
    pontos_carteira numeric(4,2),
    data_hora_registro timestamp without time zone DEFAULT now(),
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    iduso integer NOT NULL
);


ALTER TABLE tb_multas OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 17080)
-- Name: tb_seguro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_seguro (
    idseguro bigint DEFAULT nextval('sq_pk_idseguro'::regclass) NOT NULL,
    custo_seguro money NOT NULL,
    seguradora character varying(20),
    apolice character varying(20),
    data_vigencia date,
    telefone_emergencia character varying(20),
    data_validade date,
    mais_detalhes character varying(50),
    data_hora_registro timestamp without time zone DEFAULT now()
);


ALTER TABLE tb_seguro OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 17128)
-- Name: tb_setor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_setor (
    idsetor bigint DEFAULT nextval('sq_pk_idsetor'::regclass) NOT NULL,
    nome_setor character varying(50) NOT NULL,
    data_hora_registro timestamp without time zone DEFAULT now()
);


ALTER TABLE tb_setor OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 17060)
-- Name: tb_troca_oleo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_troca_oleo (
    idtroca_oleo bigint DEFAULT nextval('sq_pk_idtroca_oleo'::regclass) NOT NULL,
    data_troca_oleo date NOT NULL,
    km_troca_oleo numeric(10,3) NOT NULL,
    custo_oleo money NOT NULL,
    local_troca character varying(20),
    km_proxima_troca numeric(10,3),
    detalhes character varying(50),
    cidade character varying(20),
    estado character varying(2),
    data_hora_registro timestamp without time zone DEFAULT now(),
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    iduso integer NOT NULL
);


ALTER TABLE tb_troca_oleo OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 17118)
-- Name: tb_uso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tb_uso (
    iduso bigint DEFAULT nextval('sq_pk_iduso'::regclass) NOT NULL,
    idveiculo integer NOT NULL,
    idmotorista integer NOT NULL,
    data_hora_registro timestamp without time zone DEFAULT now(),
    idsetor integer
);


ALTER TABLE tb_uso OWNER TO postgres;

--
-- TOC entry 2252 (class 0 OID 0)
-- Dependencies: 201
-- Name: sq_pk_id_user; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_id_user', 1, false);


--
-- TOC entry 2253 (class 0 OID 0)
-- Dependencies: 183
-- Name: sq_pk_idabastecimento; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idabastecimento', 1, false);


--
-- TOC entry 2254 (class 0 OID 0)
-- Dependencies: 191
-- Name: sq_pk_iddeslocamento; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_iddeslocamento', 1, false);


--
-- TOC entry 2255 (class 0 OID 0)
-- Dependencies: 187
-- Name: sq_pk_idmanutencao; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idmanutencao', 1, false);


--
-- TOC entry 2256 (class 0 OID 0)
-- Dependencies: 193
-- Name: sq_pk_idmotorista; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idmotorista', 1, false);


--
-- TOC entry 2257 (class 0 OID 0)
-- Dependencies: 195
-- Name: sq_pk_idmultas; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idmultas', 1, false);


--
-- TOC entry 2258 (class 0 OID 0)
-- Dependencies: 189
-- Name: sq_pk_idseguro; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idseguro', 1, false);


--
-- TOC entry 2259 (class 0 OID 0)
-- Dependencies: 199
-- Name: sq_pk_idsetor; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idsetor', 1, false);


--
-- TOC entry 2260 (class 0 OID 0)
-- Dependencies: 185
-- Name: sq_pk_idtroca_oleo; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idtroca_oleo', 1, false);


--
-- TOC entry 2261 (class 0 OID 0)
-- Dependencies: 197
-- Name: sq_pk_iduso; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_iduso', 1, false);


--
-- TOC entry 2262 (class 0 OID 0)
-- Dependencies: 181
-- Name: sq_pk_idveiculo; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sq_pk_idveiculo', 1, false);


--
-- TOC entry 2221 (class 0 OID 17050)
-- Dependencies: 184
-- Data for Name: tb_abastecimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_abastecimento (idabastecimento, km_abastecimento, data_abasteceimento, nome_estabelecimento, custo_abastecimento, combustivel_tipo, tanque_cheio, total_litros, cidade, estado, numerorecibo, tipo_recibo, comentarios, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (1, 10.500, '2018-08-24', 'Faleiro', 'R$ 100,00', 'Gasolina', true, 23.530, 'Lajeado', 'RS', 111111, 'NF', NULL, '2019-05-04 23:57:12.082142', 1, 1, 1);
INSERT INTO tb_abastecimento (idabastecimento, km_abastecimento, data_abasteceimento, nome_estabelecimento, custo_abastecimento, combustivel_tipo, tanque_cheio, total_litros, cidade, estado, numerorecibo, tipo_recibo, comentarios, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (2, 10.852, '2018-08-25', 'Faleiro', 'R$ 101,00', 'Gasolina', true, 24.250, 'Lajeado', 'RS', 111222, 'NF', NULL, '2019-05-04 23:57:12.082142', 1, 1, 2);
INSERT INTO tb_abastecimento (idabastecimento, km_abastecimento, data_abasteceimento, nome_estabelecimento, custo_abastecimento, combustivel_tipo, tanque_cheio, total_litros, cidade, estado, numerorecibo, tipo_recibo, comentarios, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (3, 62.330, '2018-08-26', 'Petrobras', 'R$ 161,50', 'Gasolina', true, 38.000, 'Vitorino', 'PR', 444444, 'NF', NULL, '2019-05-04 23:57:12.082142', 2, 2, 3);
INSERT INTO tb_abastecimento (idabastecimento, km_abastecimento, data_abasteceimento, nome_estabelecimento, custo_abastecimento, combustivel_tipo, tanque_cheio, total_litros, cidade, estado, numerorecibo, tipo_recibo, comentarios, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (4, 62.930, '2018-08-27', 'Petrobras', 'R$ 155,50', 'Gasolina', true, 36.000, 'Vitorino', 'PR', 555555, 'NF', NULL, '2019-05-04 23:57:12.082142', 2, 2, 4);


--
-- TOC entry 2231 (class 0 OID 17099)
-- Dependencies: 194
-- Data for Name: tb_cadastro_motorista; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_cadastro_motorista (idmotorista, nome_motorista, telefone_motorista, descricao_motorista, data_hora_registro) VALUES (1, 'Adilson Lima de Paula', '043-98837-8155', 'Descrição Motora A', '2019-05-04 23:56:15.299227');
INSERT INTO tb_cadastro_motorista (idmotorista, nome_motorista, telefone_motorista, descricao_motorista, data_hora_registro) VALUES (2, 'Juca Bala', '046-98803-3065', 'Descrição Motora B', '2019-05-04 23:56:15.299227');
INSERT INTO tb_cadastro_motorista (idmotorista, nome_motorista, telefone_motorista, descricao_motorista, data_hora_registro) VALUES (3, 'Zé Bolha', '046-97777-1111', 'Descrição Motora C', '2019-05-04 23:56:15.299227');


--
-- TOC entry 2219 (class 0 OID 17040)
-- Dependencies: 182
-- Data for Name: tb_cadastro_veiculo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_cadastro_veiculo (idveiculo, modelo_veiculo, placa_veiculo, km_atual, marca_veiculo, capacidade_tanque, situacao_veiculo, data_hora_registro_veiculo, idseguro) VALUES (1, 'Uno Way', 'ABC 3030', 50.000, 'Fiat', 45.000, 'Ativo', '2019-05-04 23:56:38.785016', NULL);
INSERT INTO tb_cadastro_veiculo (idveiculo, modelo_veiculo, placa_veiculo, km_atual, marca_veiculo, capacidade_tanque, situacao_veiculo, data_hora_registro_veiculo, idseguro) VALUES (2, 'Palio', 'ABC 4444', 50.000, 'Fiat', 45.000, 'Ativo', '2019-05-04 23:56:38.785016', NULL);


--
-- TOC entry 2229 (class 0 OID 17089)
-- Dependencies: 192
-- Data for Name: tb_deslocamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_deslocamento (iddeslocamento, data_saida, km_saida, data_chegada, km_chegada, detalhamento_acoes, finalizar_percurso, km_rodado, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (1, '2018-07-16', 56.863, '2018-07-16', 57.147, 'Detalhamento A', true, NULL, '2019-05-04 23:57:59.235778', 1, 1, 1);
INSERT INTO tb_deslocamento (iddeslocamento, data_saida, km_saida, data_chegada, km_chegada, detalhamento_acoes, finalizar_percurso, km_rodado, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (2, '2018-07-17', 57.147, '2018-07-17', 57.252, 'Detalhamento B', true, NULL, '2019-05-04 23:57:59.235778', 1, 1, 1);
INSERT INTO tb_deslocamento (iddeslocamento, data_saida, km_saida, data_chegada, km_chegada, detalhamento_acoes, finalizar_percurso, km_rodado, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (3, '2018-07-18', 57.252, '2018-07-18', 57.298, 'Detalhamento C', true, NULL, '2019-05-04 23:57:59.235778', 1, 1, 1);
INSERT INTO tb_deslocamento (iddeslocamento, data_saida, km_saida, data_chegada, km_chegada, detalhamento_acoes, finalizar_percurso, km_rodado, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (4, '2018-07-19', 57.298, '2018-07-19', 57.472, 'Detalhamento D', true, NULL, '2019-05-04 23:57:59.235778', 1, 1, 1);
INSERT INTO tb_deslocamento (iddeslocamento, data_saida, km_saida, data_chegada, km_chegada, detalhamento_acoes, finalizar_percurso, km_rodado, data_hora_registro, idveiculo, idmotorista, iduso) VALUES (5, '2018-07-21', 57.472, '2018-07-21', 57.527, 'Detalhamento E', true, NULL, '2019-05-04 23:57:59.235778', 1, 1, 1);


--
-- TOC entry 2239 (class 0 OID 17137)
-- Dependencies: 202
-- Data for Name: tb_login; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_login (id_user, usuario, email, login, senha, perfil, data_hora_cadastro) VALUES (1, 'adilson', 'adilson@gmail.com', 'adilson', '1', 'admin', '2019-05-04 23:56:15.299227');
INSERT INTO tb_login (id_user, usuario, email, login, senha, perfil, data_hora_cadastro) VALUES (2, 'juca', 'juca@gmail.com', 'juca', '1', 'user', '2019-05-04 23:56:15.299227');
INSERT INTO tb_login (id_user, usuario, email, login, senha, perfil, data_hora_cadastro) VALUES (3, 'Ze Bolha', 'ze_bolha@gmail.com', 'ze', '1', 'user', '2019-05-04 23:56:15.299227');


--
-- TOC entry 2225 (class 0 OID 17070)
-- Dependencies: 188
-- Data for Name: tb_manutencao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2233 (class 0 OID 17108)
-- Dependencies: 196
-- Data for Name: tb_multas; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2227 (class 0 OID 17080)
-- Dependencies: 190
-- Data for Name: tb_seguro; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2237 (class 0 OID 17128)
-- Dependencies: 200
-- Data for Name: tb_setor; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_setor (idsetor, nome_setor, data_hora_registro) VALUES (1, 'Setor A', '2019-05-04 23:56:43.058787');


--
-- TOC entry 2223 (class 0 OID 17060)
-- Dependencies: 186
-- Data for Name: tb_troca_oleo; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2235 (class 0 OID 17118)
-- Dependencies: 198
-- Data for Name: tb_uso; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tb_uso (iduso, idveiculo, idmotorista, data_hora_registro, idsetor) VALUES (1, 1, 1, '2019-05-04 23:57:07.339298', 1);
INSERT INTO tb_uso (iduso, idveiculo, idmotorista, data_hora_registro, idsetor) VALUES (2, 1, 1, '2019-05-04 23:57:07.339298', 1);
INSERT INTO tb_uso (iduso, idveiculo, idmotorista, data_hora_registro, idsetor) VALUES (3, 2, 2, '2019-05-04 23:57:07.339298', 1);
INSERT INTO tb_uso (iduso, idveiculo, idmotorista, data_hora_registro, idsetor) VALUES (4, 2, 2, '2019-05-04 23:57:07.339298', 1);


--
-- TOC entry 2092 (class 2606 OID 17148)
-- Name: email; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_login
    ADD CONSTRAINT email UNIQUE (email);


--
-- TOC entry 2094 (class 2606 OID 17146)
-- Name: pk_id_user; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_login
    ADD CONSTRAINT pk_id_user PRIMARY KEY (id_user);


--
-- TOC entry 2069 (class 2606 OID 17057)
-- Name: pk_idabastecimento; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_abastecimento
    ADD CONSTRAINT pk_idabastecimento PRIMARY KEY (idabastecimento);


--
-- TOC entry 2080 (class 2606 OID 17096)
-- Name: pk_iddeslocamento; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_deslocamento
    ADD CONSTRAINT pk_iddeslocamento PRIMARY KEY (iddeslocamento);


--
-- TOC entry 2075 (class 2606 OID 17077)
-- Name: pk_idmanutencao; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_manutencao
    ADD CONSTRAINT pk_idmanutencao PRIMARY KEY (idmanutencao);


--
-- TOC entry 2082 (class 2606 OID 17105)
-- Name: pk_idmotorista; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_cadastro_motorista
    ADD CONSTRAINT pk_idmotorista PRIMARY KEY (idmotorista);


--
-- TOC entry 2085 (class 2606 OID 17115)
-- Name: pk_idmultas; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_multas
    ADD CONSTRAINT pk_idmultas PRIMARY KEY (idmultas);


--
-- TOC entry 2077 (class 2606 OID 17086)
-- Name: pk_idseguro; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_seguro
    ADD CONSTRAINT pk_idseguro PRIMARY KEY (idseguro);


--
-- TOC entry 2090 (class 2606 OID 17134)
-- Name: pk_idsetor; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_setor
    ADD CONSTRAINT pk_idsetor PRIMARY KEY (idsetor);


--
-- TOC entry 2072 (class 2606 OID 17067)
-- Name: pk_idtroca_oleo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_troca_oleo
    ADD CONSTRAINT pk_idtroca_oleo PRIMARY KEY (idtroca_oleo);


--
-- TOC entry 2088 (class 2606 OID 17125)
-- Name: pk_iduso; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_uso
    ADD CONSTRAINT pk_iduso PRIMARY KEY (idveiculo, idmotorista, iduso);


--
-- TOC entry 2066 (class 2606 OID 17047)
-- Name: pk_idveiculo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_cadastro_veiculo
    ADD CONSTRAINT pk_idveiculo PRIMARY KEY (idveiculo);


--
-- TOC entry 2086 (class 1259 OID 17123)
-- Name: ix_relationship10; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship10 ON tb_uso USING btree (idsetor);


--
-- TOC entry 2067 (class 1259 OID 17055)
-- Name: ix_relationship4; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship4 ON tb_abastecimento USING btree (idveiculo, idmotorista, iduso);


--
-- TOC entry 2073 (class 1259 OID 17075)
-- Name: ix_relationship5; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship5 ON tb_manutencao USING btree (idveiculo, idmotorista, iduso);


--
-- TOC entry 2083 (class 1259 OID 17113)
-- Name: ix_relationship6; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship6 ON tb_multas USING btree (idveiculo, idmotorista, iduso);


--
-- TOC entry 2078 (class 1259 OID 17094)
-- Name: ix_relationship7; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship7 ON tb_deslocamento USING btree (idveiculo, idmotorista, iduso);


--
-- TOC entry 2064 (class 1259 OID 17045)
-- Name: ix_relationship8; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship8 ON tb_cadastro_veiculo USING btree (idseguro);


--
-- TOC entry 2070 (class 1259 OID 17065)
-- Name: ix_relationship9; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship9 ON tb_troca_oleo USING btree (idveiculo, idmotorista, iduso);


--
-- TOC entry 2095 (class 2606 OID 17149)
-- Name: relationship1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_cadastro_veiculo
    ADD CONSTRAINT relationship1 FOREIGN KEY (idseguro) REFERENCES tb_seguro(idseguro);


--
-- TOC entry 2103 (class 2606 OID 17189)
-- Name: relationship10; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_uso
    ADD CONSTRAINT relationship10 FOREIGN KEY (idsetor) REFERENCES tb_setor(idsetor);


--
-- TOC entry 2101 (class 2606 OID 17154)
-- Name: relationship2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_uso
    ADD CONSTRAINT relationship2 FOREIGN KEY (idveiculo) REFERENCES tb_cadastro_veiculo(idveiculo);


--
-- TOC entry 2102 (class 2606 OID 17159)
-- Name: relationship3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_uso
    ADD CONSTRAINT relationship3 FOREIGN KEY (idmotorista) REFERENCES tb_cadastro_motorista(idmotorista);


--
-- TOC entry 2096 (class 2606 OID 17164)
-- Name: relationship4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_abastecimento
    ADD CONSTRAINT relationship4 FOREIGN KEY (idveiculo, idmotorista, iduso) REFERENCES tb_uso(idveiculo, idmotorista, iduso);


--
-- TOC entry 2098 (class 2606 OID 17169)
-- Name: relationship5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_manutencao
    ADD CONSTRAINT relationship5 FOREIGN KEY (idveiculo, idmotorista, iduso) REFERENCES tb_uso(idveiculo, idmotorista, iduso);


--
-- TOC entry 2100 (class 2606 OID 17174)
-- Name: relationship6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_multas
    ADD CONSTRAINT relationship6 FOREIGN KEY (idveiculo, idmotorista, iduso) REFERENCES tb_uso(idveiculo, idmotorista, iduso);


--
-- TOC entry 2099 (class 2606 OID 17179)
-- Name: relationship7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_deslocamento
    ADD CONSTRAINT relationship7 FOREIGN KEY (idveiculo, idmotorista, iduso) REFERENCES tb_uso(idveiculo, idmotorista, iduso);


--
-- TOC entry 2097 (class 2606 OID 17184)
-- Name: relationship8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_troca_oleo
    ADD CONSTRAINT relationship8 FOREIGN KEY (idveiculo, idmotorista, iduso) REFERENCES tb_uso(idveiculo, idmotorista, iduso);


--
-- TOC entry 2246 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2020-09-04 23:22:44

--
-- PostgreSQL database dump complete
--

