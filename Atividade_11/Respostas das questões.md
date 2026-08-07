**1. O que é uma exceção em Java e sua importância em aplicações reais**  
Uma exceção no Java é um erro que acontece enquanto o programa está rodando, quebrando a execução normal do código. O tratamento de exceções é fundamental em aplicações reais para evitar que o sistema caia (crash) inesperadamente, garantindo a estabilidade, a segurança e para conseguirmos tratar a falha de forma amigável, mantendo a aplicação segura e estável.

---

**2. Tabela de Tipos de Exceções**

|Exceção|Tipo (Checked / Unchecked)|
|---|---|
|NullPointerException|Unchecked|
|IOException|Checked|
|ArithmeticException|Unchecked|
|FileNotFoundException|Checked|
|ArrayIndexOutOfBoundsException|Unchecked|

---

**3. Explicação do Código e Saída**  
O código tenta acessar o índice 5 de um array de tamanho 3 (numeros), o que lança uma exceção ArrayIndexOutOfBoundsException. Essa exceção é capturada pelo bloco catch e mostra a mensagem de erro, em seguida o bloco finally é executado obrigatoriamente.

**Saída no console:**

```
Erro: indice fora do limite!
Bloco finally executado.
```

---

**4. Problemas de capturar exceções genéricas (Exception e)**

Capturar a classe genérica Exception é ruim porque ela "esconde" qualquer erro do sistema, inclusive os que a gente não previa. Isso dificulta saber exatamente qual foi o problema e impede de dar uma tratativa específica para cada falha.

**Exemplo**: 
Se eu usar catch (Exception e) em um trecho que lê um arquivo, o programa vai tratar do mesmo jeito se o arquivo não existir (FileNotFoundException) ou se uma variável estiver nula (NullPointerException), dificultando encontrar o bug no código.
