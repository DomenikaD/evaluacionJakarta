package ec.edu.ups.evaluacion63_delgado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	
	
	//Atributos
	
	@Id
	private int codigo;
	private String cedula;
	private String mes;
	private double valor;
	
	
	//Getters & Setters

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", cedula=" + cedula + ", mes=" + mes + ", valor=" + valor + "]";
	}
	
	
	

	

	
	
	

	

	
	
	

}
