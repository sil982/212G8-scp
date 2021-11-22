# 212G8-scp
## Projeto - Sistema Integrado de Gestão 
### Fatec - Curso de Análise e Desenvolvimento de Sistemas 
### Disciplina – Programação Web – Prof. Edson Saraiva de Almeida 
### Grupo 212G8-scp
- Antonio Vaunilson da Silva 
- Diogo Pereira de Lucena 
#### Objetivo 

1. Desenvolver uma aplicação para controle de salas de cinemas, otimizando o cadastro de filmes disponíveis, horários e as respectivas salas de exibição.
2. Justificativa – Apesar dos avanços tecnológicos e da facilidade de ver filmes em casa, o brasileiro mantém o hábito de ir ao cinema, portanto é imprescindível tornar essa experiencia prazerosa e ágil tanto na escolha do filme, localização da sala e compra do ingresso.
3. Necessidades do cliente – O sistema deve permitir o cadastro de salas e sua capacidade, deve permitir cadastro de filmes com suas especificações (título, duração), também permitir cadastro de apresentações de filmes identificando a sala e o horário referente ao título, e permitir a venda de ingressos e o controle de ingressos referentes a capacidades das salas.
4. Tarefas (entregáveis)
   Planejamento
   Plano de projeto
   Análise
5. Especificação de Requisitos – estórias de usuário

Especificação de Requisitos – Projeto Cine Fácil
Como usuário
Eu quero cadastrar as salas de cinemas por nome e número de maneira que seja possível consultar informações referentes a cada sala especifica.

O Sistemas de informação frequentemente devem ser integrados a outros sistemas para atender necessidades de negócios. A dinâmica das 
mudanças e inovações nos negócios frequentes tem gerado uma demanda na manutenção e integração de sistemas que os 
departamentos de TI têm se mostrado incapazes de atender. Diante deste cenário, a Computação Orientada a Serviços fornece um 
modelo que pode auxiliar a minimizar os problemas de integração, além de proporcionar o reuso e o gerenciamento de componentes de 
software com o alinhamento de TI e negócios. 
O objetivo deste trabalho é estudar e propor uma arquitetura orientada a serviços como base para a criação de um sistema integrado de 
gestão. Uma arquitetura orientada a serviços se justifica nos casos nos quais existe a necessidade da evolução da arquitetura de 
sistemas permitindo responder mais rapidamente as mudanças exigidas nos negócios. 
### Processo de Desenvolvimento 
O processo de desenvolvimento segue um modelo interativo e incremental e utiliza as diretrizes propostas pela norma ISO 29110 para 
desenvolvimento de software em pequenas organizações. Cada interação tem a duração de 2 aulas. Ao final da interação o código é 
avaliado pelo time junto com o professor na atividade de revisão do projeto. Em seguida o código aprovado é colocado em baseline e 
publicado para avaliação em um ambiente muito próximo da produção. A reunião de retrospectiva avalia o processo utilizado 
discutindo aspectos do processo que foram positivos e propondo melhorias para aspectos que não estavam agregando valor. 
#### 1. Planejamento da Sprint 
Durante a fase de planejamento as funcionalidades nesta interação são selecionadas do backlog do produto. 
##### Backlog do produto 
REQ01 - Cadastrar cliente 
REQ02 - Consultar cliente 
REQ03 - Alterar cliente 
REQ04 - Excluir cliente 
REQ05 - Login de Usuário 
#### 2. Estratégia de desenvolvimento. 
Na primeira interação a meta é criar um baseline (base de sustentação) da arquitetura do sistema a fim de definir como o código será 
organizado nas próximas interações. A arquitetura se desenvolve a partir de um exame dos requisitos mais significativos (aqueles que 
têm grande impacto na arquitetura do sistema) e de uma avaliação de risco. A estabilidade da arquitetura é avaliada através de um ou 
mais protótipos de arquitetura. O projeto do “Sistema de Controle de Clientes” deve se utilizar de uma arquitetura que permita 
flexibilidade na configuração do sistema de persistência (mudança do sistema de gerenciamento de banco de dados) e manutenções na 
interface de usuário com poucos efeitos colaterais. A arquitetura selecionada para atender esta necessidade é a arquitetura MVC. 
A estratégia de construção e integração do software será ascendente na hierarquia de controle, ou seja, da base de dados (backend) para 
a interface de interação homem máquina (frontend). 
![cap06 diagrama de classes de projeto front](https://user-images.githubusercontent.com/68782201/114472495-
b1949000-9bc8-11eb-8a07-14d3db52cb2b.png)
