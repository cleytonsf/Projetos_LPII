# Respostas das Questões Teóricas 
#### a) O que acontece quando a ação da linha 5 é executada?

 **Resposta:** É criado um novo objeto do tipo Funcionario. O construtor da classe é chamado passando o nome "joão", salário base 25 e horas trabalhadas 44. Internamente, a variável estática geraMatricula é incrementada e gera automaticamente o número da matrícula dele, e a data de contratação é definida.

#### b) Por que a construção das linhas 7 e 8 é permitida?

**Resposta:** Porque os atributos rg e cpf foram declarados com o modificador de acesso public na classe Funcionario. Isso significa que qualquer outra classe (como a classe Programa) possui permissão para visualizá-los e alterá-los diretamente.

#### c) Nas linhas 9 e 10, acessamos os atributos salário e matrícula do funcionário. Essa construção é permitida? Justifique.

**Resposta:** Não é permitida. De acordo com as regras de encapsulamento solicitadas no exercício, os atributos salario e matricula devem ser definidos como private. Modificadores privados impedem o acesso direto ou modificação externa por outras classes. Para obter esses valores, a classe `Programa` deveria utilizar os métodos Getters, como f1.getSalario() e f1.getMatricula(), e nunca atribuir valores diretamente.