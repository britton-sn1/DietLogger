cd  ~/java/DietLogger
export MAVEN_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000"
mvn spring-boot:run -Dspring-boot.run.arguments=--spring.datasource.password=H...3