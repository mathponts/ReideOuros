# Concurso de Beleza

Este projeto é uma implementação do jogo **Concurso de Beleza**, inspirado na série *Alice in Borderland*. O jogo combina estratégia e sorte, onde os jogadores escolhem números para competir entre si em várias rodadas.

## Sobre a Série

*Alice in Borderland* é uma série de jogos de sobrevivência que desafia os participantes a usarem suas habilidades de tomada de decisão e estratégia. Em cada rodada, os jogadores precisam escolher números que possam garantir sua vitória, enquanto interagem com os outros jogadores. Este projeto visa capturar a essência da série, permitindo que os jogadores escolham estratégias e tomem decisões a cada rodada.

## Regras do Jogo

1. **Número de Jogadores**: O jogo pode acomodar um número ilimitado de jogadores, permitindo que todos os participantes interajam.
2. **Rodadas**: O jogo consiste em várias rodadas (definidas no início), e em cada rodada, os jogadores escolhem um número.
3. **Estratégias de Seleção**:
    - **Aleatória**: Os jogadores podem optar por escolher um número aleatório.
    - **Personalizada**: Os jogadores podem escolher um número de sua preferência a cada rodada.
4. **Determinação do Vencedor**: Ao final das rodadas, o jogador que escolher o maior número é declarado o vencedor.
5. **Regras Especiais**: Se houver apenas dois jogadores restantes, regras adicionais podem ser aplicadas (implementadas no código).

## Habilidades Técnicas

Este projeto foi desenvolvido utilizando as seguintes habilidades técnicas de programação:

- **Programação Orientada a Objetos**: O projeto utiliza conceitos de POO para estruturar classes como `Game`, `Player`, e estratégias de seleção de números.
- **Design Patterns**: Implementação do padrão de design Strategy para permitir diferentes métodos de seleção de números.
- **Interação com o Usuário**: Utilização de `Scanner` para capturar entradas do usuário, permitindo uma experiência interativa.
- **Estruturas de Dados**: Uso de listas (`ArrayList`) para armazenar jogadores e gerenciar a dinâmica do jogo.
- **Lógica de Jogo**: Implementação da lógica do jogo, incluindo rodadas e seleção de vencedores com base nas escolhas dos jogadores.

## Instruções para Execução

Para executar o jogo, siga as instruções abaixo:

1. **Clone o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```

2. **Navegue até o diretório do projeto:**:
    ```bash
    cd <NOME_DIRETORIO>
    ```

3. **Execute o jogo:**:
```bash
    mvn exec:java -Dexec.mainClass="com.example.Main"
   ```