USE mydb;

delimiter //
DROP PROCEDURE IF EXISTS InsertarCliente //
CREATE PROCEDURE InsertarCliente(cNombre VARCHAR(60),cTelefono VARCHAR(10), cWhat VARCHAR(10), cCorreo VARCHAR(45))
BEGIN
    DECLARE IDcliente INT DEFAULT 0;
    SELECT MAX(id) INTO IDcliente FROM Cliente;
    IF (IDcliente=NULL) THEN
		SET IDcliente = 0;
	ELSE
		SET IDcliente = IDcliente + 1;
    END IF;
    IF (cWhat = null) THEN
		SET cWhat = cTelefono;
	elseif (cTelefono = null) THEN
		SET cTelefono = cWhat;
    END IF;
    IF NOT EXISTS (SELECT * FROM Cliente WHERE Cliente.Nombre = cNombre) THEN
        INSERT INTO Cliente(id, Nombre, Telefono, Whatsapp, Correo) VALUES(IDcliente, cNombre, cTelefono, cWhat, cCorreo);
	END IF;
END; //
delimiter ;

delimiter //
DROP PROCEDURE IF EXISTS InsertarPedido //
CREATE PROCEDURE InsertarPedido(cNombre VARCHAR(60),descripcion VARCHAR(1000),accesorios VARCHAR(200),fechaE VARCHAR(45),fechaI VARCHAR(45),fechaT1 VARCHAR(45), fechaT2 VARCHAR(45), total FLOAT, cBusto FLOAT, cCintura FLOAT, cTalle FLOAT, cLargoF FLOAT, cCadera FLOAT, cEspalda FLOAT, cLargoM FLOAT, cBoca FLOAT)
BEGIN
	DECLARE IDpedido INT DEFAULT 0;
    DECLARE IDcliente INT DEFAULT 0;
    DECLARE IDmedida INT DEFAULT 0;
    SELECT MAX(id) INTO IDpedido FROM Pedido;
    SELECT MAX(id) INTO IDmedida FROM Medidas;
    IF (IDpedido=NULL) THEN
		SET IDpedido = 0;
	ELSE
		SET IDpedido = IDpedido + 1;
    END IF;
    IF (IDmedida=NULL) THEN
		SET IDmedida = 0;
	ELSE
		SET IDmedida = IDmedida + 1;
    END IF;
    IF EXISTS (SELECT * FROM Cliente WHERE Cliente.Nombre = cNombre) THEN
		SELECT id INTO IDcliente FROM Cliente WHERE Cliente.Nombre = cNombre;
        INSERT INTO Medidas(id, Busto, Cintura, Talle, LargoFalda, Cadera, Espalda, LargoManga, BocaManga) VALUES(IDmedida, cBusto, cCintura, cTalle, cLargoF, cCadera, cEspalda, cLargoM, cBoca);
        INSERT INTO Pedido(id, Descripcion, Accesorios, Fecha_Entrega, Fecha_Inicial, Fecha_Tallado, Fecha_Tallado2, Total, Cliente_id, Medidas_id) VALUES (IDpedido, descripcion, accesorios, fechaE, fechaI, fechaT1, fechaT2, total, IDcliente, IDmedida);
	END IF;
END; //
delimiter ;

call InsertarCliente('Carlos','123','132','carlos@gmail.com');
call InsertarPedido('Carlos','Traje rojo', 'Espada', '13-04-2023', '13-04-2023', '13-04-2023', '13-04-2023', 300000.5, 90.0,60.0,90.0,90.0,60.0,90.0,60.0,90.0);