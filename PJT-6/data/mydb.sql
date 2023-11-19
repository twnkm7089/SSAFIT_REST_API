DROP database if exists mydb;

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8mb4 ;

USE `mydb` ;

DROP TABLE IF EXISTS `mydb`.`watchRecord` ;
DROP TABLE IF EXISTS `mydb`.`Review` ;
DROP TABLE IF EXISTS `mydb`.`Video` ;
DROP TABLE IF EXISTS `mydb`.`User` ;

CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `userId` VARCHAR(45) NOT NULL UNIQUE,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB;

DROP TABLE IF EXISTS `mydb`.`Video` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Video` (
  `youtubeId` VARCHAR(50) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `channelName` VARCHAR(45) NOT NULL,
  `fitPartName` VARCHAR(45) NOT NULL,
  `viewCnt` INT UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`youtubeId`)
  )
ENGINE = InnoDB;



DROP TABLE IF EXISTS `mydb`.`Review` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Review` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT ,
  `title` TINYTEXT NOT NULL,
  `content` MEDIUMTEXT NOT NULL,
  `regDate` DATETIME NOT NULL DEFAULT (current_time),
  `viewCnt` INT UNSIGNED NULL DEFAULT 0,
  `User_id` INT UNSIGNED NOT NULL,
  `Video_youtubeId` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Review_User1`
    FOREIGN KEY (`User_id`)
    REFERENCES `mydb`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Review_Video1`
    FOREIGN KEY (`Video_youtubeId`)
    REFERENCES `mydb`.`Video` (`youtubeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



DROP TABLE IF EXISTS `mydb`.`watchRecord` ;

CREATE TABLE IF NOT EXISTS `mydb`.`watchRecord` (
  `User_id` INT UNSIGNED NOT NULL,
  `Video_youtubeId` VARCHAR(50) NOT NULL,
  `watchDate` DATETIME NOT NULL,
  PRIMARY KEY (`User_id`, `Video_youtubeId`),
  CONSTRAINT `fk_User_has_Video_User`
    FOREIGN KEY (`User_id`)
    REFERENCES `mydb`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Video_Video1`
    FOREIGN KEY (`Video_youtubeId`)
    REFERENCES `mydb`.`Video` (`youtubeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

commit;