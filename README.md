# Kinoteca Client

# Описание
Микросервис для маршрутизации запросов в микросервис [KinotecaParser](https://github.com/navI-minkoff/KinotecaParser) для интеграции c [API Кинопоиска](https://api.kinopoisk.dev/documentation)
## Используемые технологии
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- SpringDoc OpenAPI (Swagger)
- Lombok

## Использование
1. Установите значениe `base-url` для подключения к микросервису [KinotecaParser](https://github.com/navI-minkoff/KinotecaParser):
    ```yaml
    kinopoisk-parser:
        base-url: your_parser_url
    ```

## Документация API
После запуска 2-х микросервисов, документация API будет доступна по следующему адресу:
> http://localhost:8082/swagger-ui/index.html

