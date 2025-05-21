package jtt.projekts.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "microboard")
public class Microboard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_microboard")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_board")
	private Board board;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_microcontroler")
	private Microcontroller micro;
	
	public Microboard(Board board,Microcontroller micro ) {
		this.board =board;
		this.micro = micro;
	}
}
