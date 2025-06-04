-- Database: RobotPrototipuProjekts
CREATE DATABASE IF NOT EXISTS RobotPrototipuProjekts CHARACTER SET utf8mb4 COLLATE utf8mb4_latvian_ci;



-- Table: users          
CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.users (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL,
	 role VARCHAR(255) NOT NULL );
	 
	 
-- Table: microControler    

CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.microControler (
    id_microControler INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    clock_speed INT,
	progarm_memory INT,
	RAM INT,
    size VARCHAR(255) NOT NULL,
	volt_usage INT);

    -- Table: board    

CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.board (
    id_board INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    size VARCHAR(255) NOT NULL,
    size_of_micro VARCHAR(255) NOT NULL
);
	
	
-- Table: battery    

CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.battery (
    id_battery INT AUTO_INCREMENT PRIMARY KEY,
    battery_type VARCHAR(255) NOT NULL,
    voltage INT,
	capacity INT,
	life_cycle INT);


-- Table: motor
	CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.motor (
    id_motor INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    voltage INT,
	maxRMP INT,
	current_draw INT);

-- Table: frame

	CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.frame (
    id_frame INT AUTO_INCREMENT PRIMARY KEY,
    material VARCHAR(255) NOT NULL,
    dimension VARCHAR(255) NOT NULL,
	weight INT);
	
	
-- Table: sensors
	CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.sensors (
    id_sensors INT AUTO_INCREMENT PRIMARY KEY,
    sensor_type VARCHAR(255) NOT NULL,
    rangee INT,
	accuracy INT,
	sensitivity INT);
	
-- Table: remote
   	CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.remote (
    id_remote INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(255) NOT NULL,
    frequency INT,
	rangee INT,
	battery_type VARCHAR(255) NOT NULL);     
 
	
-- Table: microBoard
CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.microBoard (
    id_microBoard INT AUTO_INCREMENT PRIMARY KEY,
    id_board INT,
    id_microControler INT,
    
    
    CONSTRAINT board_fk FOREIGN KEY (id_board) REFERENCES board(id_board) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT microControler_fk FOREIGN KEY (id_microControler) REFERENCES microControler(id_microControler) ON UPDATE CASCADE ON DELETE CASCADE
);   

-- Table: completedBot
CREATE TABLE IF NOT EXISTS RobotPrototipuProjekts.completedBot (
    id_bot INT AUTO_INCREMENT PRIMARY KEY,
    id_user INT NOT NULL,
    id_microBoard INT NOT NULL,
    id_battery INT NOT NULL,
    id_motor INT NOT NULL,
    id_frame INT NOT NULL,
    id_sensors INT NOT NULL,
    id_remote INT NOT NULL,
    

    CONSTRAINT user_fk FOREIGN KEY (id_user) REFERENCES users(id_user) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT microBoard_fk FOREIGN KEY (id_microBoard) REFERENCES microBoard(id_microBoard) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT battery_fk FOREIGN KEY (id_battery) REFERENCES battery(id_battery) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT motor_fk FOREIGN KEY (id_motor) REFERENCES motor(id_motor) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT frame_fk FOREIGN KEY (id_frame) REFERENCES frame(id_frame) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT sensors_fk FOREIGN KEY (id_sensors) REFERENCES sensors(id_sensors) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT remote_fk FOREIGN KEY (id_remote) REFERENCES remote(id_remote) ON UPDATE CASCADE ON DELETE CASCADE
);

