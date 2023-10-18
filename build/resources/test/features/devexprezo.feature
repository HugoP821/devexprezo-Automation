@exprezo
  Feature: Registro de cliente

    @registro
    Scenario: Como usuario deseo registrar un nuevo usuario y validar los datos
      Given El usuario navega a devexprezo
          And Da click en registrarse
          And Ingresa el nombre de Hugo
          And Ingresa apellidos Palomino Avila
          And Ingresa fecha de nacimiento 2000-01-27
          And Ingresa telefono 5543844314
          And Ingresa email test@test.com
          And Ingresa calle Cerrada de meseta
          And Ingreso numero exterior 45
          And Ingresa numero interior 8
          And Ingresa codigo postal 01759
          And Selecciona colonia
          And Validar ciudad
          And Validar estado
          And Ingresa sucursal
          And Ingresa numero de cliente red 13
          And Ingresa contrasena 12345678a
          And seleeciona los terminos y privacidad
          #And envia los datos