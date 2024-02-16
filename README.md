# Weather Forecast API

## Project Information

This Weather Forecast API provides both summary and hourly weather forecasts for a given location. It is built using Java 17 and Spring version 3.2.2.

## Prerequisites

To run this project, you need:

- Java 17 installed on your system.
- Spring version 3.2.2.
- An API key from a weather data provider (replace `rapidapi.api-key` with your secret).

## How to Run

### Importing into IntelliJ IDEA

1. Clone or download the project from the repository.
2. Open IntelliJ IDEA.
3. Select `File` -> `Open` and navigate to the project folder.
4. Choose the `pom.xml` file and click `Open`.
5. IntelliJ IDEA will import the project.

### Configuration

Replace `rapidapi.api-key` with your API key in the project configuration.

## API Endpoints

### Summary API

#### Curl Request:

```bash
curl --location 'localhost:8080/weather/forecast/Berlin/summary' \
--header 'client_id: D5F14478654D38CE24' \
--header 'client_secret: E5R214478654D38CE24' \
--header 'Cookie: JSESSIONID=C4B47E2D5F14478654D38CE248AC2C32'
```
Sample Response:
```json
{
  "status": "OK",
  "statusCode": 200,
  "data": {
    "location": {
      "code": "DE0001020",
      "name": "Berlin",
      "timezone": "Europe/Berlin",
      "coordinates": {
        "latitude": 52.5244,
        "longitude": 13.4105
      }
    },
    "forecast": {
      "items": [
        {
          "date": "2024-02-15",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "n_3.svg"
          },
          "prec": {
            "sum": 0.5,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 9.0,
            "max": 13.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 6.0,
            "max": 9.0,
            "gusts": {
              "value": 23,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 8.0,
            "max": 13.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-15T06:48:18+01:00",
            "sunrise": "2024-02-15T07:23:44+01:00",
            "suntransit": "2024-02-15T12:20:28+01:00",
            "sunset": "2024-02-15T17:18:00+01:00",
            "dusk": "2024-02-15T17:53:30+01:00",
            "moonrise": "2024-02-15T09:24:23+01:00",
            "moontransit": "2024-02-15T17:10:44+01:00",
            "moonset": null,
            "moonphase": 2,
            "moonzodiac": 2
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-14T23:00:00Z"
        },
        {
          "date": "2024-02-16",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.48,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 8.0,
            "max": 14.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 8.0,
            "max": 13.0,
            "gusts": {
              "value": 30,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 6.0,
            "max": 13.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-16T06:46:25+01:00",
            "sunrise": "2024-02-16T07:21:45+01:00",
            "suntransit": "2024-02-16T12:20:25+01:00",
            "sunset": "2024-02-16T17:19:54+01:00",
            "dusk": "2024-02-16T17:55:17+01:00",
            "moonrise": "2024-02-16T09:42:14+01:00",
            "moontransit": "2024-02-16T18:03:03+01:00",
            "moonset": "2024-02-16T01:20:15+01:00",
            "moonphase": 3,
            "moonzodiac": 2
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-15T23:00:00Z"
        },
        {
          "date": "2024-02-17",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Nordwestwind",
            "text": "NW",
            "avg": 0.0,
            "min": 3.0,
            "max": 19.0,
            "gusts": {
              "value": 44,
              "text": null
            },
            "significationWind": true
          },
          "windchill": {
            "min": 4.0,
            "max": 9.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-17T06:44:30+01:00",
            "sunrise": "2024-02-17T07:19:44+01:00",
            "suntransit": "2024-02-17T12:20:22+01:00",
            "sunset": "2024-02-17T17:21:48+01:00",
            "dusk": "2024-02-17T17:57:05+01:00",
            "moonrise": "2024-02-17T10:06:39+01:00",
            "moontransit": "2024-02-17T18:57:14+01:00",
            "moonset": "2024-02-17T02:45:37+01:00",
            "moonphase": 3,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-16T23:00:00Z"
        },
        {
          "date": "2024-02-18",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 15,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 2.0,
          "rainHours": 0,
          "temperature": {
            "min": 1.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südostwind",
            "text": "SO",
            "avg": 0.0,
            "min": 4.0,
            "max": 12.0,
            "gusts": {
              "value": 28,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": -1.0,
            "max": 5.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-18T06:42:34+01:00",
            "sunrise": "2024-02-18T07:17:42+01:00",
            "suntransit": "2024-02-18T12:20:17+01:00",
            "sunset": "2024-02-18T17:23:41+01:00",
            "dusk": "2024-02-18T17:58:53+01:00",
            "moonrise": "2024-02-18T10:41:18+01:00",
            "moontransit": "2024-02-18T19:52:36+01:00",
            "moonset": "2024-02-18T04:04:15+01:00",
            "moonphase": 4,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-17T23:00:00Z"
        },
        {
          "date": "2024-02-19",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 4.14,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 6.0,
            "max": 8.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Westwind",
            "text": "W",
            "avg": 0.0,
            "min": 6.0,
            "max": 15.0,
            "gusts": {
              "value": 38,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 5.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-19T06:40:37+01:00",
            "sunrise": "2024-02-19T07:15:39+01:00",
            "suntransit": "2024-02-19T12:20:12+01:00",
            "sunset": "2024-02-19T17:25:35+01:00",
            "dusk": "2024-02-19T18:00:41+01:00",
            "moonrise": "2024-02-19T11:29:31+01:00",
            "moontransit": "2024-02-19T20:47:48+01:00",
            "moonset": "2024-02-19T05:10:27+01:00",
            "moonphase": 4,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-18T23:00:00Z"
        },
        {
          "date": "2024-02-20",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 35,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 9.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Westwind",
            "text": "W",
            "avg": 0.0,
            "min": 11.0,
            "max": 16.0,
            "gusts": {
              "value": 40,
              "text": null
            },
            "significationWind": true
          },
          "windchill": {
            "min": 2.0,
            "max": 7.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-20T06:38:38+01:00",
            "sunrise": "2024-02-20T07:13:34+01:00",
            "suntransit": "2024-02-20T12:20:06+01:00",
            "sunset": "2024-02-20T17:27:28+01:00",
            "dusk": "2024-02-20T18:02:28+01:00",
            "moonrise": "2024-02-20T12:31:35+01:00",
            "moontransit": "2024-02-20T21:41:17+01:00",
            "moonset": "2024-02-20T06:00:38+01:00",
            "moonphase": 4,
            "moonzodiac": 4
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-19T23:00:00Z"
        },
        {
          "date": "2024-02-21",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 8.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 11.0,
            "max": 13.0,
            "gusts": {
              "value": 26,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 1.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-21T06:36:38+01:00",
            "sunrise": "2024-02-21T07:11:29+01:00",
            "suntransit": "2024-02-21T12:19:59+01:00",
            "sunset": "2024-02-21T17:29:21+01:00",
            "dusk": "2024-02-21T18:04:16+01:00",
            "moonrise": "2024-02-21T13:43:22+01:00",
            "moontransit": "2024-02-21T22:31:49+01:00",
            "moonset": "2024-02-21T06:35:55+01:00",
            "moonphase": 4,
            "moonzodiac": 4
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-20T23:00:00Z"
        },
        {
          "date": "2024-02-22",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 15.0,
            "max": 15.0,
            "gusts": {
              "value": 33,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 2.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-22T06:34:36+01:00",
            "sunrise": "2024-02-22T07:09:23+01:00",
            "suntransit": "2024-02-22T12:19:52+01:00",
            "sunset": "2024-02-22T17:31:14+01:00",
            "dusk": "2024-02-22T18:06:04+01:00",
            "moonrise": "2024-02-22T14:59:06+01:00",
            "moontransit": "2024-02-22T23:18:55+01:00",
            "moonset": "2024-02-22T07:00:12+01:00",
            "moonphase": 4,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-21T23:00:00Z"
        },
        {
          "date": "2024-02-23",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 6.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 15.0,
            "max": 17.0,
            "gusts": {
              "value": 35,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 3.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-23T06:32:33+01:00",
            "sunrise": "2024-02-23T07:07:15+01:00",
            "suntransit": "2024-02-23T12:19:45+01:00",
            "sunset": "2024-02-23T17:33:06+01:00",
            "dusk": "2024-02-23T18:07:52+01:00",
            "moonrise": "2024-02-23T16:14:42+01:00",
            "moontransit": null,
            "moonset": "2024-02-23T07:17:23+01:00",
            "moonphase": 4,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-22T23:00:00Z"
        },
        {
          "date": "2024-02-24",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 15.0,
            "max": 17.0,
            "gusts": {
              "value": 35,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 2.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-24T06:30:29+01:00",
            "sunrise": "2024-02-24T07:05:07+01:00",
            "suntransit": "2024-02-24T12:19:36+01:00",
            "sunset": "2024-02-24T17:34:58+01:00",
            "dusk": "2024-02-24T18:09:39+01:00",
            "moonrise": "2024-02-24T17:28:25+01:00",
            "moontransit": "2024-02-24T00:02:44+01:00",
            "moonset": "2024-02-24T07:30:12+01:00",
            "moonphase": 5,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-23T23:00:00Z"
        },
        {
          "date": "2024-02-25",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 15,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 4.0,
          "rainHours": 0,
          "temperature": {
            "min": 3.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 7.0,
            "max": 17.0,
            "gusts": {
              "value": 33,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 1.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-25T06:28:24+01:00",
            "sunrise": "2024-02-25T07:02:57+01:00",
            "suntransit": "2024-02-25T12:19:27+01:00",
            "sunset": "2024-02-25T17:36:50+01:00",
            "dusk": "2024-02-25T18:11:27+01:00",
            "moonrise": "2024-02-25T18:40:09+01:00",
            "moontransit": "2024-02-25T00:43:27+01:00",
            "moonset": "2024-02-25T07:40:29+01:00",
            "moonphase": 5,
            "moonzodiac": 6
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-24T23:00:00Z"
        },
        {
          "date": "2024-02-26",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.38,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 3.0,
            "max": 6.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Nordostwind",
            "text": "NO",
            "avg": 0.0,
            "min": 10.0,
            "max": 13.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 0.0,
            "max": 4.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-26T06:26:18+01:00",
            "sunrise": "2024-02-26T07:00:47+01:00",
            "suntransit": "2024-02-26T12:19:18+01:00",
            "sunset": "2024-02-26T17:38:42+01:00",
            "dusk": "2024-02-26T18:13:15+01:00",
            "moonrise": "2024-02-26T19:50:45+01:00",
            "moontransit": "2024-02-26T01:23:03+01:00",
            "moonset": "2024-02-26T07:49:24+01:00",
            "moonphase": 6,
            "moonzodiac": 6
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-25T23:00:00Z"
        },
        {
          "date": "2024-02-27",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.19,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 2.0,
            "max": 5.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 4.0,
            "max": 7.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-27T06:24:11+01:00",
            "sunrise": "2024-02-27T06:58:36+01:00",
            "suntransit": "2024-02-27T12:19:08+01:00",
            "sunset": "2024-02-27T17:40:33+01:00",
            "dusk": "2024-02-27T18:15:02+01:00",
            "moonrise": "2024-02-27T21:01:26+01:00",
            "moontransit": "2024-02-27T02:01:56+01:00",
            "moonset": "2024-02-27T07:57:51+01:00",
            "moonphase": 6,
            "moonzodiac": 7
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-26T23:00:00Z"
        },
        {
          "date": "2024-02-28",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 6,
            "text": "Regen",
            "icon": "d_6.svg"
          },
          "prec": {
            "sum": 1.47,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Ostwind",
            "text": "O",
            "avg": 0.0,
            "min": 2.0,
            "max": 8.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 3.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-28T06:22:03+01:00",
            "sunrise": "2024-02-28T06:56:24+01:00",
            "suntransit": "2024-02-28T12:18:57+01:00",
            "sunset": "2024-02-28T17:42:24+01:00",
            "dusk": "2024-02-28T18:16:50+01:00",
            "moonrise": "2024-02-28T22:13:31+01:00",
            "moontransit": "2024-02-28T02:41:09+01:00",
            "moonset": "2024-02-28T08:06:40+01:00",
            "moonphase": 6,
            "moonzodiac": 7
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-27T23:00:00Z"
        }
      ],
      "forecastDate": "2024-02-15T16:20:51Z",
      "nextUpdate": "2024-02-15T17:30:00Z",
      "source": "w3Data",
      "point": "global",
      "fingerprint": "Uv+BAwEBC0ZpbmdlcnByaW50Af+CAAEFAQdWZXJzaW9uAQwAAQtSZXF1ZXN0VGltZQH/hAABA0xuZwEIAAEDTGF0AQgAAQZNb2RlbHMB/4gAAAAQ/4MFAQEEVGltZQH/hAAAADb/hwIBASdbXXN0cnVjdCB7IE5hbWUgc3RyaW5nOyBSdW4gdGltZS5UaW1lIH0B/4gAAf+GAAAe/4UDAQL/hgABAgEETmFtZQEMAAEDUnVuAf+EAAAA/gF1/4IBCWRldi0yLjAuMQEPAQAAAA7dYDoqBcLfkwAAAfgZBFYOLdIqQAH43gIJih9DSkABCwEOZXhwb3NlZF9tb3NtaXgBDwEAAAAO3V91MAAAAAAAAAABDmV4cG9zZWRfbW9zbWl4AQ8BAAAADt1ezHAAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt1f88AAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt1fSwAAAAAAAAAAAQtuYW1fY29udXNfNQEPAQAAAA7dX0sAAAAAAAAAAAELbmFtX2NvbnVzXzUBDwEAAAAO3V6iQAAAAAAAAAABBm1vc21peAEPAQAAAA7dYB3wAAAAAAAAAAEGbW9zbWl4AQ8BAAAADt1fdTAAAAAAAAAAAQlnZnNfc2ZsdXgBDwEAAAAO3V9LAAAAAAAAAAABCWdmc19zZmx1eAEPAQAAAA7dXqJAAAAAAAAAAAEGYXdlX2RlAQ8BAAAADt1fkVAAAAAAAAAAAA=="
    }
  }
}
```
Internal Server Error:
```json
{
  "status": "INTERNAL_SERVER_ERROR",
  "statusCode": 500,
  "error": "Error while fetching forecast summary for Berlin"
}
```
Unauthorized: 
```json
{
  "status": "UNAUTHORIZED",
  "statusCode": 401,
  "error": "Headers Missing"
}

```
### Hourly API

#### Curl Request:
```shell
curl --location 'localhost:8080/weather/forecast/Berlin/hourly' \
--header 'client_id: D5F14478654D38CE24' \
--header 'client_secret: E5R214478654D38CE24' \
--header 'Cookie: JSESSIONID=C4B47E2D5F14478654D38CE248AC2C32'
```
Sample Response:
```json
{
  "status": "OK",
  "statusCode": 200,
  "data": {
    "location": {
      "code": "DE0001020",
      "name": "Berlin",
      "timezone": "Europe/Berlin",
      "coordinates": {
        "latitude": 52.5244,
        "longitude": 13.4105
      }
    },
    "forecast": {
      "items": [
        {
          "date": "2024-02-15",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "n_3.svg"
          },
          "prec": {
            "sum": 0.5,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 9.0,
            "max": 13.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 6.0,
            "max": 9.0,
            "gusts": {
              "value": 23,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 8.0,
            "max": 13.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-15T06:48:18+01:00",
            "sunrise": "2024-02-15T07:23:44+01:00",
            "suntransit": "2024-02-15T12:20:28+01:00",
            "sunset": "2024-02-15T17:18:00+01:00",
            "dusk": "2024-02-15T17:53:30+01:00",
            "moonrise": "2024-02-15T09:24:23+01:00",
            "moontransit": "2024-02-15T17:10:44+01:00",
            "moonset": null,
            "moonphase": 2,
            "moonzodiac": 2
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-14T23:00:00Z"
        },
        {
          "date": "2024-02-16",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.48,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 8.0,
            "max": 14.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 8.0,
            "max": 13.0,
            "gusts": {
              "value": 30,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 6.0,
            "max": 13.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-16T06:46:25+01:00",
            "sunrise": "2024-02-16T07:21:45+01:00",
            "suntransit": "2024-02-16T12:20:25+01:00",
            "sunset": "2024-02-16T17:19:54+01:00",
            "dusk": "2024-02-16T17:55:17+01:00",
            "moonrise": "2024-02-16T09:42:14+01:00",
            "moontransit": "2024-02-16T18:03:03+01:00",
            "moonset": "2024-02-16T01:20:15+01:00",
            "moonphase": 3,
            "moonzodiac": 2
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-15T23:00:00Z"
        },
        {
          "date": "2024-02-17",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Nordwestwind",
            "text": "NW",
            "avg": 0.0,
            "min": 3.0,
            "max": 19.0,
            "gusts": {
              "value": 44,
              "text": null
            },
            "significationWind": true
          },
          "windchill": {
            "min": 4.0,
            "max": 9.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-17T06:44:30+01:00",
            "sunrise": "2024-02-17T07:19:44+01:00",
            "suntransit": "2024-02-17T12:20:22+01:00",
            "sunset": "2024-02-17T17:21:48+01:00",
            "dusk": "2024-02-17T17:57:05+01:00",
            "moonrise": "2024-02-17T10:06:39+01:00",
            "moontransit": "2024-02-17T18:57:14+01:00",
            "moonset": "2024-02-17T02:45:37+01:00",
            "moonphase": 3,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-16T23:00:00Z"
        },
        {
          "date": "2024-02-18",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 15,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 2.0,
          "rainHours": 0,
          "temperature": {
            "min": 1.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südostwind",
            "text": "SO",
            "avg": 0.0,
            "min": 4.0,
            "max": 12.0,
            "gusts": {
              "value": 28,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": -1.0,
            "max": 5.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-18T06:42:34+01:00",
            "sunrise": "2024-02-18T07:17:42+01:00",
            "suntransit": "2024-02-18T12:20:17+01:00",
            "sunset": "2024-02-18T17:23:41+01:00",
            "dusk": "2024-02-18T17:58:53+01:00",
            "moonrise": "2024-02-18T10:41:18+01:00",
            "moontransit": "2024-02-18T19:52:36+01:00",
            "moonset": "2024-02-18T04:04:15+01:00",
            "moonphase": 4,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-17T23:00:00Z"
        },
        {
          "date": "2024-02-19",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 4.14,
            "probability": 90,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 6.0,
            "max": 8.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Westwind",
            "text": "W",
            "avg": 0.0,
            "min": 6.0,
            "max": 15.0,
            "gusts": {
              "value": 38,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 5.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-19T06:40:37+01:00",
            "sunrise": "2024-02-19T07:15:39+01:00",
            "suntransit": "2024-02-19T12:20:12+01:00",
            "sunset": "2024-02-19T17:25:35+01:00",
            "dusk": "2024-02-19T18:00:41+01:00",
            "moonrise": "2024-02-19T11:29:31+01:00",
            "moontransit": "2024-02-19T20:47:48+01:00",
            "moonset": "2024-02-19T05:10:27+01:00",
            "moonphase": 4,
            "moonzodiac": 3
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-18T23:00:00Z"
        },
        {
          "date": "2024-02-20",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 35,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 9.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Westwind",
            "text": "W",
            "avg": 0.0,
            "min": 11.0,
            "max": 16.0,
            "gusts": {
              "value": 40,
              "text": null
            },
            "significationWind": true
          },
          "windchill": {
            "min": 2.0,
            "max": 7.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-20T06:38:38+01:00",
            "sunrise": "2024-02-20T07:13:34+01:00",
            "suntransit": "2024-02-20T12:20:06+01:00",
            "sunset": "2024-02-20T17:27:28+01:00",
            "dusk": "2024-02-20T18:02:28+01:00",
            "moonrise": "2024-02-20T12:31:35+01:00",
            "moontransit": "2024-02-20T21:41:17+01:00",
            "moonset": "2024-02-20T06:00:38+01:00",
            "moonphase": 4,
            "moonzodiac": 4
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-19T23:00:00Z"
        },
        {
          "date": "2024-02-21",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 1.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 8.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 11.0,
            "max": 13.0,
            "gusts": {
              "value": 26,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 1.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-21T06:36:38+01:00",
            "sunrise": "2024-02-21T07:11:29+01:00",
            "suntransit": "2024-02-21T12:19:59+01:00",
            "sunset": "2024-02-21T17:29:21+01:00",
            "dusk": "2024-02-21T18:04:16+01:00",
            "moonrise": "2024-02-21T13:43:22+01:00",
            "moontransit": "2024-02-21T22:31:49+01:00",
            "moonset": "2024-02-21T06:35:55+01:00",
            "moonphase": 4,
            "moonzodiac": 4
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-20T23:00:00Z"
        },
        {
          "date": "2024-02-22",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 15.0,
            "max": 15.0,
            "gusts": {
              "value": 33,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 2.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-22T06:34:36+01:00",
            "sunrise": "2024-02-22T07:09:23+01:00",
            "suntransit": "2024-02-22T12:19:52+01:00",
            "sunset": "2024-02-22T17:31:14+01:00",
            "dusk": "2024-02-22T18:06:04+01:00",
            "moonrise": "2024-02-22T14:59:06+01:00",
            "moontransit": "2024-02-22T23:18:55+01:00",
            "moonset": "2024-02-22T07:00:12+01:00",
            "moonphase": 4,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-21T23:00:00Z"
        },
        {
          "date": "2024-02-23",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 6.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwind",
            "text": "S",
            "avg": 0.0,
            "min": 15.0,
            "max": 17.0,
            "gusts": {
              "value": 35,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 3.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-23T06:32:33+01:00",
            "sunrise": "2024-02-23T07:07:15+01:00",
            "suntransit": "2024-02-23T12:19:45+01:00",
            "sunset": "2024-02-23T17:33:06+01:00",
            "dusk": "2024-02-23T18:07:52+01:00",
            "moonrise": "2024-02-23T16:14:42+01:00",
            "moontransit": null,
            "moonset": "2024-02-23T07:17:23+01:00",
            "moonphase": 4,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-22T23:00:00Z"
        },
        {
          "date": "2024-02-24",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 0,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 3.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 15.0,
            "max": 17.0,
            "gusts": {
              "value": 35,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 2.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-24T06:30:29+01:00",
            "sunrise": "2024-02-24T07:05:07+01:00",
            "suntransit": "2024-02-24T12:19:36+01:00",
            "sunset": "2024-02-24T17:34:58+01:00",
            "dusk": "2024-02-24T18:09:39+01:00",
            "moonrise": "2024-02-24T17:28:25+01:00",
            "moontransit": "2024-02-24T00:02:44+01:00",
            "moonset": "2024-02-24T07:30:12+01:00",
            "moonphase": 5,
            "moonzodiac": 5
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-23T23:00:00Z"
        },
        {
          "date": "2024-02-25",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 2,
            "text": "wolkig",
            "icon": "d_2.svg"
          },
          "prec": {
            "sum": 0.0,
            "probability": 15,
            "sumAsRain": 0.0,
            "class": 0
          },
          "sunHours": 4.0,
          "rainHours": 0,
          "temperature": {
            "min": 3.0,
            "max": 10.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 7.0,
            "max": 17.0,
            "gusts": {
              "value": 33,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 1.0,
            "max": 8.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-25T06:28:24+01:00",
            "sunrise": "2024-02-25T07:02:57+01:00",
            "suntransit": "2024-02-25T12:19:27+01:00",
            "sunset": "2024-02-25T17:36:50+01:00",
            "dusk": "2024-02-25T18:11:27+01:00",
            "moonrise": "2024-02-25T18:40:09+01:00",
            "moontransit": "2024-02-25T00:43:27+01:00",
            "moonset": "2024-02-25T07:40:29+01:00",
            "moonphase": 5,
            "moonzodiac": 6
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-24T23:00:00Z"
        },
        {
          "date": "2024-02-26",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.38,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 3.0,
            "max": 6.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Nordostwind",
            "text": "NO",
            "avg": 0.0,
            "min": 10.0,
            "max": 13.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 0.0,
            "max": 4.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-26T06:26:18+01:00",
            "sunrise": "2024-02-26T07:00:47+01:00",
            "suntransit": "2024-02-26T12:19:18+01:00",
            "sunset": "2024-02-26T17:38:42+01:00",
            "dusk": "2024-02-26T18:13:15+01:00",
            "moonrise": "2024-02-26T19:50:45+01:00",
            "moontransit": "2024-02-26T01:23:03+01:00",
            "moonset": "2024-02-26T07:49:24+01:00",
            "moonphase": 6,
            "moonzodiac": 6
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-25T23:00:00Z"
        },
        {
          "date": "2024-02-27",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 3,
            "text": "bedeckt",
            "icon": "d_3.svg"
          },
          "prec": {
            "sum": 0.19,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 5.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Südwestwind",
            "text": "SW",
            "avg": 0.0,
            "min": 2.0,
            "max": 5.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 4.0,
            "max": 7.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-27T06:24:11+01:00",
            "sunrise": "2024-02-27T06:58:36+01:00",
            "suntransit": "2024-02-27T12:19:08+01:00",
            "sunset": "2024-02-27T17:40:33+01:00",
            "dusk": "2024-02-27T18:15:02+01:00",
            "moonrise": "2024-02-27T21:01:26+01:00",
            "moontransit": "2024-02-27T02:01:56+01:00",
            "moonset": "2024-02-27T07:57:51+01:00",
            "moonphase": 6,
            "moonzodiac": 7
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-26T23:00:00Z"
        },
        {
          "date": "2024-02-28",
          "period": 0,
          "freshSnow": 0.0,
          "snowHeight": 0,
          "weather": {
            "state": 6,
            "text": "Regen",
            "icon": "d_6.svg"
          },
          "prec": {
            "sum": 1.47,
            "probability": 20,
            "sumAsRain": 0.0,
            "class": 1
          },
          "sunHours": 0.0,
          "rainHours": 0,
          "temperature": {
            "min": 4.0,
            "max": 7.0,
            "avg": 0.0
          },
          "pressure": 0.0,
          "wind": {
            "unit": "km/h",
            "direction": "Ostwind",
            "text": "O",
            "avg": 0.0,
            "min": 2.0,
            "max": 8.0,
            "gusts": {
              "value": 0,
              "text": null
            },
            "significationWind": false
          },
          "windchill": {
            "min": 3.0,
            "max": 6.0,
            "avg": 0.0
          },
          "snowLine": {
            "avg": 0.0,
            "min": 0.0,
            "max": 0.0,
            "unit": "m"
          },
          "astronomy": {
            "dawn": "2024-02-28T06:22:03+01:00",
            "sunrise": "2024-02-28T06:56:24+01:00",
            "suntransit": "2024-02-28T12:18:57+01:00",
            "sunset": "2024-02-28T17:42:24+01:00",
            "dusk": "2024-02-28T18:16:50+01:00",
            "moonrise": "2024-02-28T22:13:31+01:00",
            "moontransit": "2024-02-28T02:41:09+01:00",
            "moonset": "2024-02-28T08:06:40+01:00",
            "moonphase": 6,
            "moonzodiac": 7
          },
          "clouds": null,
          "relativeHumidity": 0,
          "night": false,
          "dateWithTimezone": "2024-02-27T23:00:00Z"
        }
      ],
      "forecastDate": "2024-02-15T16:20:51Z",
      "nextUpdate": "2024-02-15T17:30:00Z",
      "source": "w3Data",
      "point": "global",
      "fingerprint": "Uv+BAwEBC0ZpbmdlcnByaW50Af+CAAEFAQdWZXJzaW9uAQwAAQtSZXF1ZXN0VGltZQH/hAABA0xuZwEIAAEDTGF0AQgAAQZNb2RlbHMB/4gAAAAQ/4MFAQEEVGltZQH/hAAAADb/hwIBASdbXXN0cnVjdCB7IE5hbWUgc3RyaW5nOyBSdW4gdGltZS5UaW1lIH0B/4gAAf+GAAAe/4UDAQL/hgABAgEETmFtZQEMAAEDUnVuAf+EAAAA/gF1/4IBCWRldi0yLjAuMQEPAQAAAA7dYDoqBcLfkwAAAfgZBFYOLdIqQAH43gIJih9DSkABCwEOZXhwb3NlZF9tb3NtaXgBDwEAAAAO3V91MAAAAAAAAAABDmV4cG9zZWRfbW9zbWl4AQ8BAAAADt1ezHAAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt1f88AAAAAAAAAAAQdpY29uX2V1AQ8BAAAADt1fSwAAAAAAAAAAAQtuYW1fY29udXNfNQEPAQAAAA7dX0sAAAAAAAAAAAELbmFtX2NvbnVzXzUBDwEAAAAO3V6iQAAAAAAAAAABBm1vc21peAEPAQAAAA7dYB3wAAAAAAAAAAEGbW9zbWl4AQ8BAAAADt1fdTAAAAAAAAAAAQlnZnNfc2ZsdXgBDwEAAAAO3V9LAAAAAAAAAAABCWdmc19zZmx1eAEPAQAAAA7dXqJAAAAAAAAAAAEGYXdlX2RlAQ8BAAAADt1fkVAAAAAAAAAAAA=="
    }
  }
}
```
Internal Server Error:
```json
{
  "status": "INTERNAL_SERVER_ERROR",
  "statusCode": 500,
  "error": "Error while fetching forecast summary for Berlin"
}
```
Unauthorized:
```json
{
  "status": "UNAUTHORIZED",
  "statusCode": 401,
  "error": "Headers Missing"
}
```
