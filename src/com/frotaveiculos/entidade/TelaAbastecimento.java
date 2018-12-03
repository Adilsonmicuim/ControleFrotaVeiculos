package com.frotaveiculos.entidade;
/**
 *
 * @author Adilson
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TelaAbastecimento")

public class TelaAbastecimento implements Serializable { //Serializable: captura estado objeto ex: Gravando, excluindo...

    @Id
    //Identifica a chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idabastecimento")
    private Integer idabastecimento;

    @Column(name = "km_abastecimento")
    private Float km_abastecimento;

    @Column(name = "data_abasteceimento")
    private String data_abasteceimento;

    @Column(name = "nome_estabelecimento")
    private String nome_estabelecimento;

    @Column(name = "custo_abastecimento")
    private Float custo_abastecimento;

    @Column(name = "combustivel_tipo")
    private String combustivel_tipo;

    @Column(name = "tanque_cheio")
    private Boolean tanque_cheio;

    @Column(name = "total_litros")
    private Float total_litros;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "numerorecibo")
    private Integer numerorecibo;

    @Column(name = "tipo_recibo")
    private String tipo_recibo;

    @Column(name = "comentarios")
    private String comentarios;

    public TelaAbastecimento() {

    }

    public Integer getIdabastecimento() {
	return idabastecimento;
    }

    public void setIdabastecimento(Integer idabastecimento) {
	this.idabastecimento = idabastecimento;
    }

    public Float getKm_abastecimento() {
	return km_abastecimento;
    }

    public void setKm_abastecimento(Float km_abastecimento) {
	this.km_abastecimento = km_abastecimento;
    }

    public String getData_abasteceimento() {
	return data_abasteceimento;
    }

    public void setData_abasteceimento(String data_abasteceimento) {
	this.data_abasteceimento = data_abasteceimento;
    }

    public String getNome_estabelecimento() {
	return nome_estabelecimento;
    }

    public void setNome_estabelecimento(String nome_estabelecimento) {
	this.nome_estabelecimento = nome_estabelecimento;
    }

    public Float getCusto_abastecimento() {
	return custo_abastecimento;
    }

    public void setCusto_abastecimento(Float custo_abastecimento) {
	this.custo_abastecimento = custo_abastecimento;
    }

    public String getCombustivel_tipo() {
	return combustivel_tipo;
    }

    public void setCombustivel_tipo(String combustivel_tipo) {
	this.combustivel_tipo = combustivel_tipo;
    }

    public Boolean getTanque_cheio() {
	return tanque_cheio;
    }

    public void setTanque_cheio(Boolean tanque_cheio) {
	this.tanque_cheio = tanque_cheio;
    }

    public Float getTotal_litros() {
	return total_litros;
    }

    public void setTotal_litros(Float total_litros) {
	this.total_litros = total_litros;
    }

    public String getCidade() {
	return cidade;
    }

    public void setCidade(String cidade) {
	this.cidade = cidade;
    }

    public String getEstado() {
	return estado;
    }

    public void setEstado(String estado) {
	this.estado = estado;
    }

    public Integer getNumerorecibo() {
	return numerorecibo;
    }

    public void setNumerorecibo(Integer numerorecibo) {
	this.numerorecibo = numerorecibo;
    }

    public String getTipo_recibo() {
	return tipo_recibo;
    }

    public void setTipo_recibo(String tipo_recibo) {
	this.tipo_recibo = tipo_recibo;
    }

    public String getComentarios() {
	return comentarios;
    }

    public void setComentarios(String comentarios) {
	this.comentarios = comentarios;
    }

    public void setNome(String text) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
