-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hospital
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hospital
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hospital` DEFAULT CHARACTER SET utf8 ;
USE `hospital` ;

-- -----------------------------------------------------
-- Table `hospital`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `patronymic` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_users`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital`.`patient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`patient` (
  `id_patient` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(45) NULL,
  `phone_number` INT(20) NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id_patient`),
  INDEX `fk_patient_users1_idx` (`users_id` ASC) VISIBLE,
  CONSTRAINT `fk_patient_users1`
  FOREIGN KEY (`users_id`)
  REFERENCES `hospital`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital`.`personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`personal` (
  `id_personal` INT NOT NULL,
  `specialization` VARCHAR(45) NOT NULL,
  `personal_role` VARCHAR(45) NOT NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id_personal`),
  INDEX `fk_personal_users1_idx` (`users_id` ASC) VISIBLE,
  CONSTRAINT `fk_personal_users1`
  FOREIGN KEY (`users_id`)
  REFERENCES `hospital`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital`.`reception`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`reception` (
  `id_reception` INT NOT NULL AUTO_INCREMENT,
  `patient_id` INT NOT NULL,
  `reception_date` DATE NOT NULL,
  `preliminary_diagnosis` VARCHAR(45) NOT NULL,
  `discharge_date` DATE NULL,
  `final_diagnosis` VARCHAR(45) NULL,
  `personal_id` INT NOT NULL,
  PRIMARY KEY (`id_reception`),
  INDEX `fk_reception_patient1_idx` (`patient_id` ASC) VISIBLE,
  INDEX `fk_reception_personal1_idx` (`personal_id` ASC) VISIBLE,
  CONSTRAINT `fk_reception_patient1`
  FOREIGN KEY (`patient_id`)
  REFERENCES `hospital`.`patient` (`id_patient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reception_personal1`
  FOREIGN KEY (`personal_id`)
  REFERENCES `hospital`.`personal` (`id_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital`.`prescrition`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`prescrition` (
  `id_prescrition` INT NOT NULL AUTO_INCREMENT,
  `name_prescription` VARCHAR(45) NOT NULL,
  `type_prescription` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `personal_id` INT NOT NULL,
  PRIMARY KEY (`id_prescrition`),
  INDEX `fk_prescrition_personal1_idx` (`personal_id` ASC) VISIBLE,
  CONSTRAINT `fk_prescrition_personal1`
  FOREIGN KEY (`personal_id`)
  REFERENCES `hospital`.`personal` (`id_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hospital`.`reception_prescrition`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital`.`reception_prescrition` (
  `prescrition_id` INT NOT NULL,
  `reception_id` INT NOT NULL,
  PRIMARY KEY (`prescrition_id`, `reception_id`),
  INDEX `fk_prescrition_has_reception_reception1_idx` (`reception_id` ASC) VISIBLE,
  INDEX `fk_prescrition_has_reception_prescrition1_idx` (`prescrition_id` ASC) VISIBLE,
  CONSTRAINT `fk_prescrition_has_reception_prescrition1`
  FOREIGN KEY (`prescrition_id`)
  REFERENCES `hospital`.`prescrition` (`id_prescrition`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_prescrition_has_reception_reception1`
  FOREIGN KEY (`reception_id`)
  REFERENCES `hospital`.`reception` (`id_reception`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
