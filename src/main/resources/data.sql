CREATE DATABASE IF NOT EXISTS paymybuddy2;

DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100)NOT NULL,
    email VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL
)
ENGINE=InnoDB;

INSERT INTO user (firstName, lastName, email, password)
VALUES 	('Pierre', 'Dupond', 'pierre.dupond@gmail.cm', '1234'),
		('Jacques', 'Martin', 'jacques.martin@gmail.cm', '1234'),
		('Claude', 'Machin', 'claude.machin@gmail.cm', '1234');

DROP TABLE IF EXISTS bank;
CREATE TABLE bank
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    iban VARCHAR(100) UNIQUE NOT NULL,
    balance DOUBLE NOT NULL,
	user_id INT NOT NULL,
	CONSTRAINT user_id_bank_fk
		FOREIGN KEY (user_id)
		REFERENCES user(id)
)
ENGINE=InnoDB;
INSERT INTO bank (iban, balance,user_id)
VALUES	('123456789',100,1),
		('789456123',50.80,2),
		('159753452',400,3);
		
DROP TABLE IF EXISTS connection;
CREATE TABLE connection
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    lastName VARCHAR(100) NOT NULL,
	user_id INT NOT NULL,
	CONSTRAINT user_id_connection_fk
		FOREIGN KEY (user_id)
		REFERENCES user(id)
)
ENGINE=InnoDB;
INSERT INTO connection(lastName,user_id)
VALUES 	('test1',1),
		('test2',1),
		('test3',2),
		('test4',2),
		('test5',2),
		('test6',3);

DROP TABLE IF EXISTS transaction;
CREATE TABLE transaction
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	designation VARCHAR(255),
	amount DOUBLE NOT NULL,
	user_receiver_id int NOT NULL,
	user_sender_id int NOT NULL,
	CONSTRAINT user_receiver_fk
		FOREIGN KEY (user_receiver_id)
		REFERENCES connection(id),
	CONSTRAINT user_sender_fk
		FOREIGN KEY (user_sender_id)
		REFERENCES user(id)
)
ENGINE=InnoDB;
INSERT INTO transaction(designation,amount,user_receiver_id,user_sender_id)
VALUES	('paiement1',10,1,1),
		('paiement2',5,1,2),
		('paiement3',15,3,2),
		('paiement4',6,4,2),
		('paiement5',20,5,3)
