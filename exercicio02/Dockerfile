# usando uma imagem do JDK 21 Temurin sobre o Linux Alpine
 FROM eclipse-temurin:21-jdk-alpine
 # Diretório de trabalho para os comandos RUN, CMD, COPY, ADD, ENTRYPOINT
 WORKDIR /www
 # Porta que será exposta ao host
 EXPOSE 8000
 # Comando que será executado durante o 'docker run'
 CMD ["jwebserver", "-b", "0.0.0.0"]