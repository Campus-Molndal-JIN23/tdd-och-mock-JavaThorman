# Testrapport:

Jonas Torjman

Testrapport: WeatherService-klass



Datum vid inlämning: 2023-06-23

Översikt över tester:

## testGetWeatherData:
Testar getWeatherData-metoden i WeatherService-klassen med en giltig väderprognos.


## testGetWeatherDataWithEmptyResponse: 
Testar getWeatherData-metoden i WeatherService-klassen när API:et returnerar en tom respons.
## testGetWeatherDataWithNullResponse: 
Testar getWeatherData-metoden i WeatherService-klassen när API:et returnerar null.
## testGetWeatherDataWithException: 
Testar getWeatherData-metoden i WeatherService-klassen när API:et kastar ett undantag (exception).
## Bedömning
Under testningen av WeatherService-klassen har den visat sig vara pålitlig och fungera enligt förväntningarna i de testfall som har genomförts. Alla testfall har passerat och getWeatherData-metoden i WeatherService har returnerat korrekta resultat enligt API:ets svar eller specificerade scenarier.

Inga fel, problem eller avvikelser har upptäckts under testningen av WeatherService-klassen. Mockningen av WeatherAPI har fungerat korrekt och returnerat förväntade värden eller kastat undantag när det har varit lämpligt.


