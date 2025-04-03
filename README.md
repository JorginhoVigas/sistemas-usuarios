# Sistema de Usuários

## Sobre o Projeto
Este projeto implementa um sistema de usuários em Java, utilizando herança para definir diferentes tipos de usuários: **Gerente, Vendedor e Atendente**. Cada um possui funcionalidades específicas para simular operações comuns dentro de um sistema empresarial.

## Funcionalidades

- **Gerente**
  - Gerar relatório financeiro 📊
  - Consultar vendas 📈
  - Alterar dados ✏️
  - Alterar senha 🔑
  - Realizar login e logoff 🔄

- **Vendedor**
  - Realizar vendas (incrementa a quantidade de vendas) 🛒
  - Consultar vendas 📊
  - Alterar dados ✏️
  - Alterar senha 🔑
  - Realizar login e logoff 🔄

- **Atendente**
  - Receber pagamentos (incrementa o valor em caixa) 💰
  - Fechar o caixa 🔐
  - Alterar dados ✏️
  - Alterar senha 🔑
  - Realizar login e logoff 🔄

## Regras de Implementação
- O **Gerente** é sempre um administrador do sistema.
- O **Vendedor** e o **Atendente** nunca são administradores.
- O **Vendedor** pode realizar vendas e consultar seu total de vendas.
- O **Atendente** pode receber pagamentos e fechar o caixa.
- Todos os usuários podem realizar login, logoff, alterar seus dados e senha.

## Tecnologias Utilizadas
- **Java**
- **Programação Orientada a Objetos (POO)**

## Autor
Desenvolvido por **Jorginho Vigas** 🚀

