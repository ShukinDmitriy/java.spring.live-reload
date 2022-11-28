# Пример проекта с java spring-boot-devtools в докере

Для настройки проекта потребовалось изменить [pom.xml](pom.xml)
```xml 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```
Также [application.properties](src%2Fmain%2Fresources%2Fapplication.properties)
```yaml
spring.devtools.remote.secret=mysecret
spring.devtools.livereload.enabled=true
```

Работает live-reload для браузера, hot-swap кода.

Необходимо настроить auto build для ide. 
Intellij IDEA:
- `File - Settings - Compiler - Build project automatically`
- `File - Settings - Advanced settings - Compiler - Allow auto-make to start even if developed application is currently running`

Настройка debug в Intellij IDEA:
- `Run - Edit configurations - Add New configuration - Remote JVM debug:`
  - `Debugger mode: Attach to remote JVM`
  - `host: 0.0.0.0`
  - `port: 5005 (указывается в` [docker-compose.yaml](docker-compose.yaml)`)`
  - `Use module classmap: live-reload.demo`

Далее запускаем `docker-compose up`. 

Приложение отвечает на [localhost:8080](http://localhost:8080/hello).

При необходимости ставим точки остановки в коде и жмем `Run - Debug`.