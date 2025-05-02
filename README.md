# SERVIÇO DE CONFIGURAÇÃO DAS APLICAÇÕES [ COS ]

__[descrição do repositório: ]__ Esse aplicativo tem a função de centralizar o fornecimento de informações de configuração das aplicações, possibilitando classificar os arquivos em perfils, assim entregando as configurações especifica de cada ambiente.

## Versões

__[relação das versões de aplicativos externos: ]__ A aplicação utiliza as seguintes versões:

| Software | Versão |
| --- | --- |
| JDK | 11.0.12 |

## Estrutura do projeto

__[descrição da estrutura do diretório: ]__

``` text

├── .github
│   └── workflows
│       └── script
│           └── manifest.sh
│       └── pipeline-build-deploy.yml
│   └── branch_default_rule.json
│   └── dependabot.yml
│   └── tag_default_rule.json
├── app
│   └── src
│   └── deployment.yml
│   └── docker-compose.yml
│   └── Dockerfile
├── docs
│   └── CONTRIBUTING.md
│   └── CODE_OF_CONDUCT.md
│   └── PULL_REQUEST_TEMPLATE.md
└── README.md
```

## Deploy da Aplicação

__[descrição do processo de deploy em ambiente cloud: ]__ O fluxo de trabalho são processos definidos para dar direção a etapa de desenvolvimento , homologação e lançamento.

As alterações são aplicadas em determinado ambiente através das **branchs**, ao publicar uma alteração numa das branchs ***principais*** o pipeline executa a atualização, a tabela abaixo descreve a relação entre branch e o respectivo ambiente:

### Tabela Branch x Ambiente

| Branch | Evento | Ambiente |
| --- | --- | --- |
| develop | Pull Request | Aplica no ambiente __DSV__ |
| release/** | Pull Request | Aplica no ambiente __HMG__ |
| pre-release/** | Pull Request | Aplica no ambiente __STG__ |
| main | Pull | Aplica no ambiente __PRD__ |

## Execução Local Host

__[descrição do processo de execução da aplicação localhost: ]__ No diretório raiz desse repositório, execute o comando abaixo num termina bash:

``` sh
mvn clean install &&
mvn spring-boot:run
```

> [!NOTE]
> Para executar o comando acima citado, é necessário incluir no diretório **app/**, o arquivo .env, que fornecerá as variáveis de ambiente.
> Procure o arquiteto do projeto e solicite o arquivo **.env**.

Se a instalação ocorrer com sucesso, estará disponível no host: __http://localhost:8080__

## Execução docker compose

__[descrição do processo de execução da aplicação localhost com docker compose: ]__ Para atender a necessidade de executar a os servidor em ambiente local, foi criado um manifesto compose que inicia as configurações iniciais dos servidores, proporcionando os recursos da arquitetura em ambiente **localhost.**

Para executar essa instrução basta abrir o terminal na raiz desse diretóerio e executar com exemplo abaixo:

```bash
cd app && docker compose --env-file .env up -d --build --force-recreate
```

> [!NOTE]
> Para executar o comando acima citado, é necessário incluir no diretório **app/**, o arquivo .env, que fornecerá ao docker compose as variáveis de ambiente.
> Procure o arquiteto do projeto e solicite o arquivo **.env**.

## Licença

> [!IMPORTANT]
> *O código fonte neste projeto não possui licença de uso.*

É terminantemente proibido reproduzir, distribuir, alterar, utilizar engenharia reversa ou valer-se de qualquer tentativa de reverter ao seu código-fonte qualquer dos componentes que compõem o SOFTWARE, bem como utilizar subterfúgios para burlar a quantidade de usuários licenciados.
