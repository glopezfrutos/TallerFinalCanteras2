-- -----------------------------------------------------
-- Schema VirtualBingoDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema VirtualBingoDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `VirtualBingoDB` DEFAULT CHARACTER SET utf8 ;
USE `VirtualBingoDB` ;

-- -----------------------------------------------------
-- Table `VirtualBingoDB`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VirtualBingoDB`.`player` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `player_id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VirtualBingoDB`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VirtualBingoDB`.`game` (
  `game_id` INT NOT NULL AUTO_INCREMENT,
  `player_id` INT NOT NULL,
  PRIMARY KEY (`game_id`),
  UNIQUE INDEX `game_id_UNIQUE` (`game_id` ASC) VISIBLE,
  INDEX `fk_game_player_idx` (`player_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_player`
    FOREIGN KEY (`player_id`)
    REFERENCES `VirtualBingoDB`.`player` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VirtualBingoDB`.`rolled_number`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VirtualBingoDB`.`rolled_number` (
  `rolled_number_id` INT NOT NULL AUTO_INCREMENT,
  `rolled_number` INT NOT NULL,
  `game_id` INT NOT NULL,
  INDEX `fk_rolled_number_game1_idx` (`game_id` ASC) VISIBLE,
  PRIMARY KEY (`rolled_number_id`),
  UNIQUE INDEX `rolled_number_id_UNIQUE` (`rolled_number_id` ASC) VISIBLE,
  CONSTRAINT `fk_rolled_number_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `VirtualBingoDB`.`game` (`game_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VirtualBingoDB`.`card`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VirtualBingoDB`.`card` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `player_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_card_player1_idx` (`player_id` ASC) INVISIBLE,
  CONSTRAINT `fk_card_player1`
    FOREIGN KEY (`player_id`)
    REFERENCES `VirtualBingoDB`.`player` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VirtualBingoDB`.`card_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VirtualBingoDB`.`card_detail` (
  `line` INT NOT NULL,
  `card_id` INT UNSIGNED NOT NULL,
  `b` INT NULL,
  `i` INT NULL,
  `n` INT NULL,
  `g` INT NULL,
  `o` INT NULL,
  `is_b` TINYINT(1) NULL DEFAULT 0,
  `is_i` TINYINT(1) NULL DEFAULT 0,
  `is_n` TINYINT(1) NULL DEFAULT 0,
  `is_g` TINYINT(1) NULL DEFAULT 0,
  `is_o` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`line`, `card_id`),
  INDEX `fk_card_detail_card1_idx` (`card_id` ASC) VISIBLE,
  CONSTRAINT `fk_card_detail_card1`
    FOREIGN KEY (`card_id`)
    REFERENCES `VirtualBingoDB`.`card` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;