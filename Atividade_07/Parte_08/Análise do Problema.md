# Questão 1: Quais classes você identifica no estudo de caso?

- Pessoa
- Paciente
- Medico
- Enfermeiro
- Prontuario
- Consulta

# Questão 2: Quais atributos cada classe deve possuir?

- **Pessoa:** id, nome, cpf, telefone, email.
- **Paciente:** (herda de Pessoa) + prontuario (do tipo Prontuario).
- **Medico:** (herda de Pessoa) + crm, especialidade.
- **Enfermeiro:** (herda de Pessoa) + coren, setor.
- **Prontuario:** idProntuario, problema.
- **Consulta:** medico (do tipo Medico), paciente (do tipo Paciente), data, status, observacoes.

# Questão 3: Quais relacionamentos existem entre as classes?

1. **Medico** é uma Pessoa (Herança).
2. **Enfermeiro** é uma Pessoa (Herança).
3. **Paciente** é uma Pessoa (Herança).
4. **Paciente** possui um Prontuario (Composição).
5. **Consulta** associa-se a um Medico (Associação/Agregação).
6. **Consulta** associa-se a um Paciente (Associação/Agregação).

# Questão 4: Identifique onde existem relacionamentos de Composição, Agregação e Herança. Justifique.

### Herança

- **Onde ocorre:** Entre Pessoa (Superclasse) e as subclasses Medico, Enfermeiro e Paciente.
- **Justificativa:** Médicos e enfermeiros são pessoas que trabalham no hospital, mas possuem características específicas. Pacientes também compartilham dados de identificação (nome, CPF). A herança permite que as subclasses herdem os comportamentos e atributos comuns da superclasse sem redundância.

### Composição

- **Onde ocorre:** Entre Paciente e Prontuario.
- **Justificativa:** O enunciado estabelece uma dependência forte ("Todo objeto Paciente deve possuir obrigatoriamente um objeto Prontuario"). Se um paciente for removido permanentemente do sistema do hospital, o seu prontuário médico perde o sentido de existir isoladamente; ele pertence estritamente ao ciclo de vida do paciente.

### Agregação 

- **Onde ocorre:** Entre Consulta e as classes Medico e Paciente.
- **Justificativa:** A consulta agrega temporariamente um médico e um paciente para registrar o evento. Se a consulta for cancelada ou excluída do histórico, o médico e o paciente continuam existindo de forma independente no sistema.

# Questão 5: Explique por que o conceito de herança pode reduzir a duplicação de código neste sistema.

Sem o conceito de herança, o desenvolvedor teria que repetir manualmente a declaração de atributos como nome, cpf, telefone e email, além de todos os seus respectivos métodos getters e setters, em três classes diferentes (Paciente, Medico e Enfermeiro).

Ao criar a classe "PAI" ou genérica Pessoa, esse código de infraestrutura de dados comuns é escrito uma única vez.

**Vantagens práticas na redução de duplicação:**

1. **Manutenção Centralizada:** Se o hospital decidir que agora o sistema precisa coletar a "Data de Nascimento" de todas as pessoas, o desenvolvedor adiciona o atributo apenas na classe Pessoa. Automaticamente, médicos, enfermeiros e pacientes passam a ter esse atributo, sem a necessidade de alterar as três classes individualmente.
2. **Polimorfismo:** Permite criar listas genéricas de usuários ou aplicar regras de validação de documentos (como validar se o CPF é válido) em um único método que recebe um objeto do tipo Pessoa, funcionando perfeitamente para qualquer profissional ou paciente.