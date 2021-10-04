-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hospital_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hospital_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hospital_db` DEFAULT CHARACTER SET utf8 ;
USE `hospital_db` ;

-- -----------------------------------------------------
-- Table `hospital_db`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(20) NOT NULL,
  `first_name` VARCHAR(20) NOT NULL,
  `patronymic` VARCHAR(20) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `login` VARCHAR(20) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id_users`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital_db`.`patient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`patient` (
  `id_patient` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(50) NULL,
  `phone_number` INT(20) NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id_patient`),
  INDEX `fk_patient_users_idx` (`users_id` ASC) VISIBLE,
  CONSTRAINT `fk_patient_users`
    FOREIGN KEY (`users_id`)
    REFERENCES `hospital_db`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital_db`.`personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`personal` (
  `id_personal` INT NOT NULL AUTO_INCREMENT,
  `specialization` VARCHAR(30) NOT NULL,
  `personal_role` VARCHAR(10) NOT NULL,
  `users_id` INT NOT NULL,
  INDEX `fk_table1_users1_idx` (`users_id` ASC) VISIBLE,
  PRIMARY KEY (`id_personal`),
  CONSTRAINT `fk_table1_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `hospital_db`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital_db`.`reception`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`reception` (
  `id_reception` INT NOT NULL AUTO_INCREMENT,
  `patient_id` INT NOT NULL,
  `reception_date` DATE NOT NULL,
  `preliminary_diagnosis` VARCHAR(30) NOT NULL,
  `discharge_date` DATE NULL,
  `final_diagnosis` VARCHAR(30) NULL,
  `personal_id` INT NOT NULL,
  PRIMARY KEY (`id_reception`),
  INDEX `fk_reception_patient1_idx` (`patient_id` ASC) VISIBLE,
  INDEX `fk_reception_personal1_idx` (`personal_id` ASC) VISIBLE,
  CONSTRAINT `fk_reception_patient1`
    FOREIGN KEY (`patient_id`)
    REFERENCES `hospital_db`.`patient` (`id_patient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reception_personal1`
    FOREIGN KEY (`personal_id`)
    REFERENCES `hospital_db`.`personal` (`id_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital_db`.`prescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`prescription` (
  `id_prescription` INT NOT NULL AUTO_INCREMENT,
  `name_prescription` VARCHAR(20) NOT NULL,
  `type_prescription` VARCHAR(10) NOT NULL,
  `description` VARCHAR(255) NULL,
  `personal_id` INT NOT NULL,
  PRIMARY KEY (`id_prescription`),
  INDEX `fk_prescription_personal1_idx` (`personal_id` ASC) VISIBLE,
  CONSTRAINT `fk_prescription_personal1`
    FOREIGN KEY (`personal_id`)
    REFERENCES `hospital_db`.`personal` (`id_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital_db`.`reception_and_prescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital_db`.`reception_and_prescription` (
  `reception_id` INT NOT NULL,
  `prescription_id` INT NOT NULL,
  PRIMARY KEY (`reception_id`, `prescription_id`),
  INDEX `fk_reception_has_prescription_prescription1_idx` (`prescription_id` ASC) VISIBLE,
  INDEX `fk_reception_has_prescription_reception1_idx` (`reception_id` ASC) VISIBLE,
  CONSTRAINT `fk_reception_has_prescription_reception1`
    FOREIGN KEY (`reception_id`)
    REFERENCES `hospital_db`.`reception` (`id_reception`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reception_has_prescription_prescription1`
    FOREIGN KEY (`prescription_id`)
    REFERENCES `hospital_db`.`prescription` (`id_prescription`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
