**Qual a diferença entre atributo de instância e atributo estático?**  
Atributos de instância são únicos para cada objeto criado a partir de uma classe, ou seja, cada instância possui sua própria cópia desses atributos. Já os atributos estáticos pertencem à classe em si e são compartilhados por todas as instâncias, existindo independentemente dos objetos. Enquanto o primeiro é acessado por meio de uma instância, o segundo é acessado diretamente pela classe. Além disso, atributos de instância ocupam memória para cada objeto, enquanto atributos estáticos ocupam memória apenas uma vez, na área de métodos da classe.

**Por que utilizamos atributos private?**  
Atributos private são usados para aplicar o princípio do encapsulamento, que restringe o acesso direto aos dados de uma classe. Isso permite que a classe controle como seus atributos são lidos ou modificados, adicionando validações e lógicas específicas por meio de métodos públicos.

**O que aconteceria se os atributos fossem public?**  
Se os atributos fossem public, qualquer classe poderia acessá-los e modificá-los diretamente, sem qualquer controle ou validação. Isso poderia levar a estados inválidos do objeto, como valores negativos em atributos que não deveriam aceitá-los. 

**Qual a função do construtor?**  
O construtor é um método especial responsável por inicializar os objetos de uma classe quando eles são instanciados. Sua função principal é garantir que o objeto comece em um estado válido e consistente, definindo valores iniciais para os atributos e, se necessário, alocando recursos. O construtor é chamado automaticamente quando um novo objeto é criado, por meio do operador `new`, e pode ser sobrecarregado para oferecer diferentes formas de inicialização, de acordo com as necessidades da classe.

**Como o encapsulamento ajuda na manutenção do sistema?**  
O encapsulamento melhora a manutenção do sistema ao isolar a implementação interna de uma classe, expondo apenas o que é necessário por meio de uma interface pública. Isso permite que a lógica interna seja modificada sem afetar outras partes do código, desde que a interface permaneça inalterada. Além disso, o encapsulamento centraliza o controle sobre os dados, permitindo a adição de validações, logs ou outras lógicas nos métodos de acesso. Isso reduz efeitos colaterais, pois evita que outras classes dependam da estrutura interna da classe encapsulada, facilitando testes e atualizações.
