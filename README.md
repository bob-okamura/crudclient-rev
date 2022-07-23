# DESAFIO 1 - CRUD

## BOOTCAMP 3.0 DEVSUPERIOR
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/bob-okamura/crudclient-rev/blob/main/LICENCE)

# Sobre o desafio

### Entregar um projeto Spring Boot 2.4.x ou superior contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

### -Busca paginada de recursos;
### -Busca de recurso por id;
### -Inserir novo recurso;
### -Atualizar recurso;
### -Deletar recurso.

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 ou 17 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

![Diagrama](https://user-images.githubusercontent.com/78389467/180585672-1870d29f-206c-4ae0-ac47-8b47de354fb8.png)

O projeto deverá ter um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS.

## Como testar a funcionalidade do projeto?

## 1) Importação do projeto
Fazer o clone do projeto no link https://github.com/bob-okamura/crudclient-rev, importar e executar o mesmo no STS(ou IDE de sua escolha) sem necessidade de qualquer configuração especial ou complexa.

## 2) Testes manuais no Postman
Conteúdo de teste preparado e todas elas deverão funcionar corretamente:

### Busca paginada de clientes
```bash
GET /clients?page=0&size=6&sort=name,asc
```
### Busca de cliente por id
```bash
GET /clients/1
```
### Inserção de novo cliente
POST /clients
```bash
{
  "name": "Maria Silva",
  "cpf": "123.456.789-01",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
### Atualização de cliente
PUT /clients/1
```bash
{
  "name": "Maria Update",
  "cpf": "987.654.321-00",
  "income": 5000.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

### Deleção de cliente
```bash
DELETE /clients/1
```

# Tecnologias utilizadas
```bash
-Java
-Springboot
-JPA / Hibernate
-Maven
-Banco de dados H2
```

# Autor

Roberto Okamura

https://www.linkedin.com/in/roberto-okamura-6a9b59b4/

