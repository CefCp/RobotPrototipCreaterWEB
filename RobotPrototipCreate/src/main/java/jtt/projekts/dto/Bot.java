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
@Table(name = "completedbot")
public class Bot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bot")
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_microboard")
	private Microboard board;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_battery")
	private Battery battery;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_motor")
	private Motor motor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_frame")
	private FrameSize frame;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_sensors")
	private Sensors sensor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_remote")
	private Remote remote;
	
	public Bot(	User user, Microboard board, Battery battery, Motor motor, FrameSize frame,Sensors sensor, Remote remote) {
		this.user = user;
		this.board = board;
		this.battery = battery;
		this.motor = motor;
		this.frame = frame;
		this.sensor = sensor;
		this.remote = remote;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Microboard getBoard() {
		return board;
	}

	public void setBoard(Microboard board) {
		this.board = board;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public FrameSize getFrame() {
		return frame;
	}

	public void setFrame(FrameSize frame) {
		this.frame = frame;
	}

	public Sensors getSensor() {
		return sensor;
	}

	public void setSensor(Sensors sensor) {
		this.sensor = sensor;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	
}
