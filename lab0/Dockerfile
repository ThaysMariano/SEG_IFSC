FROM ubuntu:24.04 

WORKDIR /app

RUN apt-get update 
RUN apt-get install -y figlet nyancat

COPY mensagem.txt /app/

RUN echo "#!/bin/bash\ncat mensagem.txt | figlet" > entrypoint.sh
RUN echo "Boa noite 2" > mensagem.txt
RUN chmod +x entrypoint.sh
CMD ["/app/entrypoint.sh"]

docker run --rm -it -v `pwd`:/app minha-imagem












