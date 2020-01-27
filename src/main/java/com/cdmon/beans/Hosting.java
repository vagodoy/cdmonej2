/**
 * 
 */
package com.cdmon.beans;

/**
 * @author Alex
 *
 */
public class Hosting {

	private Long id;

	private String nombre;
	private int cores;
	private int memoria;
	private int disco;

	/**
	 * 
	 */
	public Hosting() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cores
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * @param cores the cores to set
	 */
	public void setCores(int cores) {
		this.cores = cores;
	}

	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}

	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	/**
	 * @return the disco
	 */
	public int getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(int disco) {
		this.disco = disco;
	}

	
	
}
