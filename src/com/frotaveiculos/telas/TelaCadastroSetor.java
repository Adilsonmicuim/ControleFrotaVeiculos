package com.frotaveiculos.telas;
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
@Table(name = "TelaCadastroSetor")

public class TelaCadastroSetor implements Serializable { //Serializable: captura estado objeto ex: Gravando, excluindo...

    @Id
    //Identifica a chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsetor")
    private Integer idsetor;

    @Column(name = "nome_setor")
    private String nome_setor;

    public TelaCadastroSetor() {

    }

    public Integer getIdsetor() {
	return idsetor;
    }

    public void setIdsetor(Integer idsetor) {
	this.idsetor = idsetor;
    }

    public String getNome_setor() {
	return nome_setor;
    }

    public void setNome_setor(String nome_setor) {
	this.nome_setor = nome_setor;
    }

    public void setNome(String text) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
