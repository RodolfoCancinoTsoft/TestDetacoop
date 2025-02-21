#Automatizador Rodolfo Cancino
 #ID historia de usuario en JIRA: IDJIRA001
Feature: Informacion sobre el uso adecuado del servicio o producto financiero
  Como cliente de la cooperativa
  deseo obtener informacion sobre el uso adecuado de los productos financieros
  para cuidar mi platita a fin de mes


  Scenario: Visuallizacion del uso adecuado de servicios financieros

    Given El cliente se encuentra en la pagina de inicio de Detaccop
    When Hace click en el boton Uso adecuado de servicios financieros
    Then Se visualiza PDF con informacion sobre el uso adecuado del servicio

