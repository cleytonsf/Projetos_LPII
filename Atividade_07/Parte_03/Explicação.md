A utilização da herança nesse sistema traz benefícios claros para a arquitetura do software:

**Redução de Duplicação de Código:** Sem a herança, você teria que escrever os atributos nome, cpf, email, além de seus respectivos métodos getters, setters e de exibição, tanto na classe Aluno quanto na classe Professor. Com a herança, isso é escrito apenas uma vez em Pessoa.

**Facilidade de Manutenção:** Se o sistema precisar coletar o "Genero" de todas as pessoas, você só precisará alterar a classe Pessoa. Automaticamente, tanto Aluno quanto Professor passarão a ter o atributo genero, sem que você precise mexer em seus códigos isolados.

**Extensibilidade**: É possível adicionar novas subclasses (por exemplo, Funcionario, Coordenador) sem modificar as classes existentes.

**Padronização do Sistema:** Garante que todas as entidades que representam pessoas no sistema sigam a mesma estrutura básica, tornando o código mais legível e organizado para novos desenvolvedores.