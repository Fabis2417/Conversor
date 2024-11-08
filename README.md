Este projeto é um conversor de moedas em Java que utiliza a API Exchangerate para obter taxas de câmbio atualizadas.
Ele oferece uma experiência de usuário aprimorada com um menu de opções e uma saída formatada.

Funcionalidades:

Conversão entre Dólar (USD), Real (BRL), Peso Argentino (ARS), Won sul-coreano (KRW) e Iene japonês (JPY).
Menu amigável com opções numeradas.
Saída formatada mostrando o valor convertido e a taxa de câmbio utilizada.
Utilização da API Exchangerate para taxas atualizadas.

Estrutura do código:

ConversorMoedas.java: Contém a classe principal que executa o programa e a lógica de conversão.
Conversao.java: Classe simples para representar o objeto de conversão retornado pela API.
Contribuindo:

Sinta-se à vontade para sugerir melhorias, correções de bugs ou novas funcionalidades! 
Você pode enviar um pull request no Github (se o código estiver versionado) ou reportar o problema aqui.

Licença:
Este projeto é fornecido sem licença específica. Você pode utilizá-lo para fins pessoais ou educacionais.

Autora:Fabiola Santiago.

Agradecimentos:
API Exchangerate (https://v6.exchangerate-api.com/).

Observações:
Este projeto utiliza a biblioteca Gson para parsear a resposta JSON da API.
O código pode ser expandido para incluir mais funcionalidades, como:
Histórico de conversões.
Interface gráfica.
Suporte a mais moedas.

Melhorias Possíveis:
Tratamento de erros: Implementar blocos try-catch para lidar com possíveis exceções durante a chamada da API, como erros de rede ou respostas inválidas.
Validação de entrada: Validar o valor digitado pelo usuário para garantir que seja um número.
Menu principal: Criar um menu principal que permite ao usuário escolher entre conversão de moedas e outras funcionalidades (se implementadas).
Limite de requisições: Considerar implementar um limite de chamadas à API para evitar uso excessivo.
