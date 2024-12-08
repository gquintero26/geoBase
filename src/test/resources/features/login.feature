Feature: Yo como usuario requiero hacer login

  @loginExitoso @HP
  Scenario Outline: Test - validar login exitoso
    Given Ana  que al ingresar a la web
    When se ingresa las credenciales "<username>" y "<password>"
    Then se valida la pantalla de bienvenida
    Examples:
    |username|password|
    |     Admin   |  admin123      |

