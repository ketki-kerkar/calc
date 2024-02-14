FROM openjdk:18
WORKDIR ./
COPY ./target/CalculatorMiniProject-1.0-SNAPSHOT.jar ./
CMD ["java","-cp","CalculatorMiniProject-1.0-SNAPSHOT.jar","Calculator"] 
