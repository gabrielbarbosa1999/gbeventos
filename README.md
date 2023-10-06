# GBEventos - Sistema de Gerenciamento de Participantes

Este é um projeto desenvolvido em Spring Boot com Java e banco de dados H2 para gerenciar informações dos participantes das atividades de um evento acadêmico. Este desafio faz parte do curso Java Spring da DevSuperior e é necessário para conquistar o certificado do curso.

## Descrição

O sistema permite o gerenciamento das atividades do evento, incluindo palestras, cursos, oficinas práticas, entre outras. Cada atividade é caracterizada por seu nome, descrição, preço e pode ser dividida em blocos de horários, onde é necessário armazenar o dia, a hora de início e fim de cada bloco.

Além disso, o sistema possibilita o cadastro de participantes, onde cada participante é registrado com seu nome e email.

## Funcionalidades

- Cadastro de Atividades: Permite a criação de atividades do evento com nome, descrição e preço.
- Agendamento de Blocos de Horários: Permite a divisão das atividades em blocos de horários com data, hora de início e fim.
- Cadastro de Participantes: Permite registrar os participantes com nome e email.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- Java Development Kit (JDK)
- Spring Boot
- Banco de Dados H2

## Execução

1. Clone este repositório para a sua máquina local.

git clone https://github.com/gabrielbarbosa1999/gbeventos.git

2. Abra o projeto na sua IDE preferida.

3. Execute o projeto Spring Boot.

Ao iniciar servidor e o aplicativo estará acessível em `http://localhost:8080`.

4. Acesse o H2 Console em `http://localhost:8080/h2-console` para verificar o banco de dados. Use as configurações padrão para se conectar ao banco de dados H2.

## Diagrama de Classe

![Diagrama de Classe](https://i.imgur.com/55Jqfpk.png)

O diagrama de classe do projeto descreve a estrutura de dados do sistema, incluindo as entidades Atividade e Participante, bem como seus relacionamentos.

## Seeding do Banco de Dados

O banco de dados é preenchido automaticamente com dados iniciais com base no diagrama de objetos fornecido.

## Autor

- Gabriel Barbosa de Oliveira
- Contato: gabrielbarbosaoliveira1999@gmail.com
