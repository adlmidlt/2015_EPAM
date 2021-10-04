-- -----------------------------------------------------
-- Schema homework_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema homework_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `homework_db` DEFAULT CHARACTER SET utf8 ;
USE `homework_db` ;

-- -----------------------------------------------------
-- Table `homework_db`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `homework_db`.`student` (
  `id_student` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `group` VARCHAR(45) NULL,
  `sex` VARCHAR(1) NULL,
  PRIMARY KEY (`id_student`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `homework_db`.`marks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `homework_db`.`marks` (
  `id_marks` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(45) NULL,
  `mark` INT NULL,
  `student_id` INT NOT NULL,
  PRIMARY KEY (`id_marks`),
  INDEX `fk_marks_student_idx` (`student_id` ASC),
  CONSTRAINT `fk_marks_student`
    FOREIGN KEY (`student_id`)
    REFERENCES `homework_db`.`student` (`id_student`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `homework_db`.`student`
-- -----------------------------------------------------
START TRANSACTION;
USE `homework_db`;
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (1, 'Иван', 'Иванов', 'Информатика', 'м');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (2, 'Алексей', 'Алексеев', 'Информатика', 'м');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (3, 'Петр', 'Петров', 'Ифнорматика', 'м');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (4, 'Елена', 'Елеванова', 'Информатика', 'ж');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (5, 'Ксенья', 'Ксеевна', 'Информатика', 'ж');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (6, 'Ульяна', 'Закирова', 'Матиматика', 'ж');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (7, 'Григорий', 'Григорьев', 'Математика', 'м');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (8, 'Михайл', 'Махайлов', 'Математика', 'м');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (9, 'Евгения', 'Сидорова', 'Математика', 'ж');
INSERT INTO `homework_db`.`student` (`id_student`, `first_name`, `last_name`, `group`, `sex`) VALUES (10, 'Евгений', 'Петров', 'Математика', 'м');

COMMIT;


-- -----------------------------------------------------
-- Data for table `homework_db`.`marks`
-- -----------------------------------------------------
START TRANSACTION;
USE `homework_db`;
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'Java', 5, 1);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'Java', 5, 2);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'Java', 4, 3);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'Java', 5, 4);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'Java', 5, 5);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'C++', 3, 6);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'C++', 3, 7);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'C++', 2, 8);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'C++', 2, 9);
INSERT INTO `homework_db`.`marks` (`id_marks`, `subject`, `mark`, `student_id`) VALUES (DEFAULT, 'C++', 2, 10);

COMMIT;