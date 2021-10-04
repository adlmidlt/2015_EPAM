-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema auction
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema auction
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `auction` DEFAULT CHARACTER SET utf8 ;
USE `auction` ;

-- -----------------------------------------------------
-- Table `auction`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `auction`.`users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(45) NULL,
  `billing_address` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id_users`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `auction`.`items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `auction`.`items` (
  `id_tems` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `start_price` DOUBLE NULL,
  `bid_increment` DOUBLE NULL,
  `start_date` DATE NULL,
  `by_it_now` BINARY NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id_tems`),
  INDEX `fk_items_users_idx` (`users_id` ASC),
  CONSTRAINT `fk_items_users`
    FOREIGN KEY (`users_id`)
    REFERENCES `auction`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `auction`.`bids`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `auction`.`bids` (
  `id_bids` INT NOT NULL AUTO_INCREMENT,
  `bid_date` DATE NULL,
  `bid_value` DOUBLE NULL,
  `items_id` INT NOT NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id_bids`),
  INDEX `fk_bids_items1_idx` (`items_id` ASC),
  INDEX `fk_bids_users1_idx` (`users_id` ASC),
  CONSTRAINT `fk_bids_items1`
    FOREIGN KEY (`items_id`)
    REFERENCES `auction`.`items` (`id_tems`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bids_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `auction`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `auction`.`users`
-- -----------------------------------------------------
START TRANSACTION;
USE `auction`;
INSERT INTO `auction`.`users` (`id_users`, `full_name`, `billing_address`, `login`, `password`) VALUES (DEFAULT, 'Иванов Иван Иванович', 'Москва', 'log1', 'pas1');
INSERT INTO `auction`.`users` (`id_users`, `full_name`, `billing_address`, `login`, `password`) VALUES (DEFAULT, 'Сергеев Сергей Сергеевич', 'Ижевск', 'log2', 'pas2');
INSERT INTO `auction`.`users` (`id_users`, `full_name`, `billing_address`, `login`, `password`) VALUES (DEFAULT, 'Сидоров Петр петрович', 'Красноярск', 'Log3', 'pas3');

COMMIT;


-- -----------------------------------------------------
-- Data for table `auction`.`items`
-- -----------------------------------------------------
START TRANSACTION;
USE `auction`;
INSERT INTO `auction`.`items` (`id_tems`, `title`, `description`, `start_price`, `bid_increment`, `start_date`, `by_it_now`, `users_id`) VALUES (DEFAULT, 'Кольцо', 'Людвиг 14', 1000, 50, '2018-02-02', NULL, 1);
INSERT INTO `auction`.`items` (`id_tems`, `title`, `description`, `start_price`, `bid_increment`, `start_date`, `by_it_now`, `users_id`) VALUES (DEFAULT, 'Медальон', 'Екатерина 2', 1250, 50, '2018-02-02', NULL, 2);
INSERT INTO `auction`.`items` (`id_tems`, `title`, `description`, `start_price`, `bid_increment`, `start_date`, `by_it_now`, `users_id`) VALUES (DEFAULT, 'Ожерелье', 'Франческа', 1900, 50, '2018-02-05', NULL, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `auction`.`bids`
-- -----------------------------------------------------
START TRANSACTION;
USE `auction`;
INSERT INTO `auction`.`bids` (`id_bids`, `bid_date`, `bid_value`, `items_id`, `users_id`) VALUES (DEFAULT, '2018-02-05', 1050, 1, 1);
INSERT INTO `auction`.`bids` (`id_bids`, `bid_date`, `bid_value`, `items_id`, `users_id`) VALUES (DEFAULT, '2018-02-06', 1100, 2, 2);
INSERT INTO `auction`.`bids` (`id_bids`, `bid_date`, `bid_value`, `items_id`, `users_id`) VALUES (DEFAULT, '2018-02-08', 1500, 3, 3);

COMMIT;

