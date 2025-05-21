package jtt.projekts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "motor")
public class Motor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_motor")
	private int id;
	private String name;
	private int voltage;
	@Column(name = "max_rmp")
	private int maxRMP;
	@Column(name = "current_draw")
	private int currnetDraw;
	
	public Motor(String name,int voltage, int maxRMP, int currnetDraw) {
		this.name = name;
		this.voltage = voltage;
		this.maxRMP = maxRMP;
		this.currnetDraw = currnetDraw;
		
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

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getMaxRMP() {
		return maxRMP;
	}

	public void setMaxRMP(int maxRMP) {
		this.maxRMP = maxRMP;
	}

	public int getCurrnetDraw() {
		return currnetDraw;
	}

	public void setCurrnetDraw(int currnetDraw) {
		this.currnetDraw = currnetDraw;
	}


	
	
}
