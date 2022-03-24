cd  ~/java/DietLogger
export MAVEN_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000"
mvn spring-boot:run -Dspring-boot.run.arguments=--spring.datasource.password=H...3

In another window 
cd  ~/dev/Apache24/bin
./httpd

In another window
cd  ~/l2ee-eclipse-workspace/anglular-diet-logger-gui
ng serve


URLs: 
https://localhost
http://localhost:4200
http://localhost:8080/dietlogger/fooditems