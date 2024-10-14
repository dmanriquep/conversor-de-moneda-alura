# Conversor de Moneda en Java

Este proyecto es una aplicación de consola que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real obtenidas de una API. El programa permite al usuario seleccionar una conversión de moneda desde un menú interactivo y calcular el valor convertido basado en las tasas actuales.

## Características

- Conversión entre varias monedas:
  - Dólar (USD) a Peso Argentino (ARS)
  - Peso Argentino (ARS) a Dólar (USD)
  - Dólar (USD) a Real Brasileño (BRL)
  - Real Brasileño (BRL) a Dólar (USD)
  - Dólar (USD) a Peso Colombiano (COP)
  - Peso Colombiano (COP) a Dólar (USD)
- Tasa de cambio en tiempo real obtenida desde la [API de ExchangeRate](https://www.exchangerate-api.com/)
- Interfaz de consola fácil de usar
- Programa estructurado en múltiples clases para mejor mantenimiento del código

## Requisitos

- **Java 11** o superior
- Dependencias de **Gson** para el manejo de JSON

## Uso
Ejecuta el programa desde tu IDE o desde la línea de comandos.
Selecciona la opción de conversión de moneda introduciendo un número entre 1 y 6.
Introduce el valor que deseas convertir.
El programa te mostrará el resultado de la conversión usando la tasa de cambio actual.
Si deseas salir del programa, selecciona la opción 7.

## Arquitectura del Código
El proyecto está dividido en las siguientes clases principales:

ConversorMoneda: Clase principal que maneja el menú interactivo y la lógica del flujo del programa.

Conversiones: Clase que realiza las conversiones de moneda, haciendo solicitudes HTTP a la API y procesando la respuesta JSON con Gson.

## API
Este proyecto utiliza la API gratuita de ExchangeRate-API. Para obtener la tasa de cambio, se hace una solicitud a la URL:
https://v6.exchangerate-api.com/v6/3aeed8d7a1539d316a5c28c2/latest/USD
