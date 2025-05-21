package jtt.projekts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "board")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_board")
	private int id;
	private String name;
	private String size;
	@Column(name = "size_of_micro")
	private String sizeOfMicro;
	
	public Board(String name, String size, String sizeOfMicro) {
		this.name = name;
		this.size = size;
		this.sizeOfMicro = sizeOfMicro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeOfMicro() {
		return sizeOfMicro;
	}

	public void setSizeOfMicro(String sizeOfMicro) {
		this.sizeOfMicro = sizeOfMicro;
	}
}
