-- MySQL Script generated by MySQL Workbench
-- Fri Sep 25 14:56:02 2015
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Customer` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Customer` (
  `customerID` INT NULL COMMENT '',
  `Address_addressID` INT NULL COMMENT '',
  `userID` INT NOT NULL COMMENT '',
  `Users_userID` INT NOT NULL COMMENT '',
  `surname` VARCHAR(45) NULL COMMENT '',
  `forename` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`userID`)  COMMENT '',
  INDEX `fk_Customer_Users1_idx` (`Users_userID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Users` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Users` (
  `userID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`userID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Customer` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Customer` (
  `customerID` INT NULL COMMENT '',
  `Address_addressID` INT NULL COMMENT '',
  `userID` INT NOT NULL COMMENT '',
  `Users_userID` INT NOT NULL COMMENT '',
  `surname` VARCHAR(45) NULL COMMENT '',
  `forename` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`userID`)  COMMENT '',
  INDEX `fk_Customer_Users1_idx` (`Users_userID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Address`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Address` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Address` (
  `addressID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Customer_customerID` INT NOT NULL COMMENT '',
  `Customer_Address_addressID` INT NOT NULL COMMENT '',
  `addressLine1` VARCHAR(45) NULL COMMENT '',
  `addressLine2` VARCHAR(45) NULL COMMENT '',
  `postcode` VARCHAR(45) NULL COMMENT '',
  `city` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`addressID`, `Customer_customerID`, `Customer_Address_addressID`)  COMMENT '',
  INDEX `fk_Address_Customer1_idx` (`Customer_customerID` ASC, `Customer_Address_addressID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LoyaltyPoints`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LoyaltyPoints` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LoyaltyPoints` (
  `loyaltyID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  `points` VARCHAR(45) NULL COMMENT '',
  `is_percent` TINYINT(1) NULL COMMENT '',
  PRIMARY KEY (`loyaltyID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OrderStatus`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`OrderStatus` ;

CREATE TABLE IF NOT EXISTS `mydb`.`OrderStatus` (
  `orderStatusID` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`orderStatusID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Orders`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Orders` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Orders` (
  `orderID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `customerID` INT NULL COMMENT '',
  `date` DATE NULL COMMENT '',
  `OrderStatus_orderStatusID` INT NOT NULL COMMENT '',
  `price` DECIMAL(9,2) NULL COMMENT '',
  PRIMARY KEY (`orderID`, `OrderStatus_orderStatusID`)  COMMENT '',
  INDEX `fk_Orders_OrderStatus1_idx` (`OrderStatus_orderStatusID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OrderedItems`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`OrderedItems` ;

CREATE TABLE IF NOT EXISTS `mydb`.`OrderedItems` (
  `orderedItemsID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `orderID` INT NULL COMMENT '',
  `stockID` INT NULL COMMENT '',
  `Orders_orderID` INT NOT NULL COMMENT '',
  `quantity` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`orderedItemsID`)  COMMENT '',
  INDEX `fk_OrderedItems_Orders1_idx` (`Orders_orderID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Stock`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Stock` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Stock` (
  `stockID` INT NOT NULL COMMENT '',
  `categoryID` INT NULL COMMENT '',
  `OrderedItems_orderedItemsID` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  `total_stock` INT NULL COMMENT '',
  `unit_price` DECIMAL(9,2) NULL COMMENT '',
  PRIMARY KEY (`stockID`)  COMMENT '',
  INDEX `fk_OrderInventory_OrderedItems1_idx` (`OrderedItems_orderedItemsID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ItemCategory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ItemCategory` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ItemCategory` (
  `categoryID` INT NOT NULL COMMENT '',
  `OrderInventory_orderInventoryID` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`categoryID`)  COMMENT '',
  INDEX `fk_ItemCategory_OrderInventory1_idx` (`OrderInventory_orderInventoryID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`table1` ;

CREATE TABLE IF NOT EXISTS `mydb`.`table1` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CustomerLoyalty`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`CustomerLoyalty` ;

CREATE TABLE IF NOT EXISTS `mydb`.`CustomerLoyalty` (
  `loyaltyID` INT NOT NULL COMMENT '',
  `LoyaltyPoints_loyaltyID` INT NOT NULL COMMENT '',
  `Customer_customerID` INT NOT NULL COMMENT '',
  `Customer_Address_addressID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`loyaltyID`, `LoyaltyPoints_loyaltyID`, `Customer_customerID`, `Customer_Address_addressID`)  COMMENT '',
  INDEX `fk_CustomerLoyalty_Customer1_idx` (`Customer_customerID` ASC, `Customer_Address_addressID` ASC)  COMMENT '',
  INDEX `fk_CustomerLoyalty_LoyaltyPoints1_idx` (`LoyaltyPoints_loyaltyID` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Employees` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Employees` (
  `userID` INT NOT NULL COMMENT '',
  `employeeID` INT NULL COMMENT '',
  `Users_userID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`userID`)  COMMENT '',
  INDEX `fk_Employees_Users1_idx` (`Users_userID` ASC)  COMMENT '')
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;