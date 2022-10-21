package com.example.demo.entidades;

public class Votante {
	
	private int codVotante;
	private int identificacion;
	private String nombres;
	private String apellidos;
	private int sexo;
	private String fechaNac;
	private String fechaExp;
	private int lugNac;
	private int LugRes;
	private int telefono;
	private String correo;
	public int getCodVotante() {
		return codVotante;
	}
	public void setCodVotante(int codVotante) {
		this.codVotante = codVotante;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	public int getLugNac() {
		return lugNac;
	}
	public void setLugNac(int lugNac) {
		this.lugNac = lugNac;
	}
	public int getLugRes() {
		return LugRes;
	}
	public void setLugRes(int lugRes) {
		LugRes = lugRes;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
