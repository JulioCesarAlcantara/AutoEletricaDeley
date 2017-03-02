SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `AutoEletricaMartins` ;
CREATE SCHEMA IF NOT EXISTS `AutoEletricaMartins` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `AutoEletricaMartins` ;

-- -----------------------------------------------------
-- Table `AutoEletricaMartins`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `AutoEletricaMartins`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `AutoEletricaMartins`.`Usuario` (
  `idUsuario` INT NULL AUTO_INCREMENT,
  `nomeUsuario` VARCHAR(100) NOT NULL,
  `nomeDeUsuario` VARCHAR(45) NOT NULL,
  `emailUsuario` VARCHAR(70) NOT NULL,
  `telefoneUsuario` VARCHAR(11) NOT NULL,
  `dataNascimentoUsuario` DATE NOT NULL,
  `senhaUsuario` VARCHAR(45) NOT NULL,
  `cpfUsuario` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AutoEletricaMartins`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `AutoEletricaMartins`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `AutoEletricaMartins`.`Cliente` (
  `idClientes` INT NOT NULL AUTO_INCREMENT,
  `nomeCliente` VARCHAR(100) NOT NULL,
  `rgcliente` VARCHAR(45) NULL,
  `cpfCliente` VARCHAR(15) NOT NULL,
  `enderecoCliente` VARCHAR(200) NULL,
  `telefone1Cliente` VARCHAR(45) NOT NULL,
  `telefone2Cliente` VARCHAR(45) NULL,
  `telefoneResidenciaCliente` VARCHAR(45) NULL,
  PRIMARY KEY (`idClientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AutoEletricaMartins`.`Compra`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `AutoEletricaMartins`.`Compra` ;

CREATE TABLE IF NOT EXISTS `AutoEletricaMartins`.`Compra` (
  `idCompra` INT NOT NULL,
  `valorCompra` FLOAT NOT NULL,
  `dataCompra` DATE NOT NULL,
  `descricaoCompra` VARCHAR(500) NOT NULL,
  `parcelasCompra` INT NOT NULL,
  `formaPagamentoCompra` VARCHAR(45) NOT NULL,
  `statusCompra` ENUM('p','d','pd') NOT NULL COMMENT 'p: pago\nd:devendo\npd: pagando	',
  `idClienteCompra` INT NOT NULL,
  `idUsuarioCompra` INT NOT NULL,
  PRIMARY KEY (`idCompra`),
  INDEX `fk_Compra_Clientes_idx` (`idClienteCompra` ASC),
  INDEX `fk_Compra_Usuario1_idx` (`idUsuarioCompra` ASC),
  CONSTRAINT `fk_Compra_Clientes`
    FOREIGN KEY (`idClienteCompra`)
    REFERENCES `AutoEletricaMartins`.`Cliente` (`idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Usuario1`
    FOREIGN KEY (`idUsuarioCompra`)
    REFERENCES `AutoEletricaMartins`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
