# Avistei_API

![Captura de tela de 2023-03-31 17-17-02](https://user-images.githubusercontent.com/96485637/229222379-334d572f-c8d4-4b5f-9521-bda9ec376e31.png)

Essa API se trata de um projeto de TCC onde será posteriormente Consumida para um projeto Front end cujo, 
tem como o objetivo a catalogação de animais que causam algum problema para a saúde humana, seja por meio de
peçonha, vírus ou parasitas. A mesma esta utilizando um sistema de autenticação por JWT, e tem as seguintes funções.

# Enviar e receber JSON

![Captura de tela de 2023-03-31 17-09-45](https://user-images.githubusercontent.com/96485637/229223333-cda64215-b943-4301-8306-d31df537d945.png)

Após os recebimento da chave ela será informada nas operações crud's para que as mesmas sejam executadas. 

![Captura de tela de 2023-03-31 17-10-35](https://user-images.githubusercontent.com/96485637/229223505-e12ac12b-a47b-486f-9836-fbfe1d9cc305.png)

![Captura de tela de 2023-03-31 17-10-43](https://user-images.githubusercontent.com/96485637/229223560-5d555bcf-2e20-44c9-8749-5bf87c497026.png)

# Leitura

Para realizar a leitura também iremos informar o token.

![Captura de tela de 2023-03-31 17-11-20](https://user-images.githubusercontent.com/96485637/229223725-eec0bf81-3369-415b-8da5-ce6e3f529121.png)


# Atualizar

![Captura de tela de 2023-03-31 17-12-17](https://user-images.githubusercontent.com/96485637/229223901-b6958b46-144e-4189-856e-0899976cfc69.png)

# Leitura Única

![Captura de tela de 2023-03-31 17-13-26](https://user-images.githubusercontent.com/96485637/229223988-aa4a82bc-8eea-401e-9d92-979a8b1f0be5.png)

# Excluir 

![Captura de tela de 2023-03-31 17-13-54](https://user-images.githubusercontent.com/96485637/229224105-7c4bf481-a8a8-4d06-8141-8508a0096803.png)


# Retorno para o Front end

Os endereços tem o id específico da postagem


![Captura de tela de 2023-03-31 17-12-36](https://user-images.githubusercontent.com/96485637/229224261-19aa98c2-d5f3-468c-ba80-2f56e9c36b5c.png)

E também é retornado toda a paginação do projeto para que tenha uma melhor comunicação com o Front.

![Captura de tela de 2023-03-31 17-14-17](https://user-images.githubusercontent.com/96485637/229224394-1cf75e8b-03ba-4be1-a73b-9f784f7ff1d6.png)


# Usuário padrão 

O usuário padrão terá que ter um cadastro prévio no banco de dados, e a senha estará Encriptadas onde o Spring Security irá realizar
um Decode.

![Captura de tela de 2023-03-31 17-15-03](https://user-images.githubusercontent.com/96485637/229224698-6e955b30-5af6-42db-9417-4098d2d0b9d5.png)

Caso seja forçado um acesso, os Endpoints estarão bloqueados.

![Captura de tela de 2023-03-31 17-15-32](https://user-images.githubusercontent.com/96485637/229224829-1a944535-e67c-4fa1-8bbe-5cfd1afc4a10.png)


# Endpoints

* http://localhost:8080/login <- Para autenticar

* http://localhost:8080/noticia

* http://localhost:8080/animal

* http://localhost:8080/integrante





