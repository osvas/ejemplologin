Feature: Title of your feature
  I want to use this template for my feature file

  @CasoExitoso
  Scenario Outline: Ingreso exitoso al sitio transaccional Sucursal Virtual Empresas Bancolombia.
    Given SVE client Upload the Transaction Data
      | idCase   | channelLogType | channelLogRoute  | channelLogName | stiLogRoute  | stiLogName     | orientation   | transactionCode     | errorCode     | expectedResult      | channelCode   | systemCode      | transactionType   |
      | <idCaso> | <rutaLogCanal> | <nombreLogCanal> | <nombreLogSTI> | <rutaLogSTI> | <nombreLogSTI> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <codigoCanal> | <codigoSistema> | <tipoTransaccion> |
    When I authenticate in SVE with nit and user and password
      | <nit> | <username> | <password> | <tipoDocumento> | <primeraPregunta> | <validarClave> |

    Examples: 
      | idCaso | TipoLogCanal | rutaLogCanal                                          | nombreLogCanal        | rutaLogSTI | nombreLogSTI | nit       | username  | password | tipoDocumento | primeraPregunta | orientacion | codigoTransaccion | codigoError | resultadoEsperado                                    | codigoCanal | codigoSistema | tipoTransaccion | validarClave |
      ##@externaldata@./src/test/resources/datadriven/SVE_TRN0385_Autenticacion.xlsx@Datos@1
   |1   |WWW   |./src/test/resources/logs/canal/TRN0385_LogCanal.xlsx   |TRN0385_LogCanal.xlsx   |rutalogsti   |nombrelogsti   |800270811   |autouser1994   |12345678   |3   |bole   |Acierto   |0385   |000   |Estado de Transacciones - Aprobación - Preparación   |SVE   |BOLE   |Autenticacion   |ACTIVO |
