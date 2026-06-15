### 1. Encapsulamento

O encapsulamento consiste em esconder os detalhes internos do funcionamento de uma classe e proteger os seus dados contra acessos indevidos, expondo-os apenas através de métodos públicos.

- **Onde foi utilizado:** Em todas as classes do sistema (Pessoa, Medico, Enfermeiro, Paciente, Prontuario e Consulta).
- **Como foi aplicado:** Todos os atributos (como id, nome, crm, status, etc.) foram declarados com o modificador de acesso private. Para permitir a leitura e modificação controlada desses atributos, foram criados métodos públicos Getters e Setters (ex: getNome(), setNome(), getStatus()).

### 2. Herança

A herança permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse), promovendo o reúso de código.

- **Onde foi utilizada:** Nas classes Medico, Enfermeiro e Paciente.
- **Como foi aplicada:** As três classes utilizam a palavra-chave extends para herdar as características comuns da classe base Pessoa.
	- Medico extends Pessoa
	- Enfermeiro extends Pessoa
	- Paciente extends Pessoa

Por isso, elas herdam os atributos id, nome, cpf, telefone e email sem a necessidade de reescrevê-los, além de utilizarem o super(...) nos construtores para repassar esses dados à classe pai.

### 3. Composição

A composição é uma relação de dependência forte entre dois objetos ("relação de todo-parte"). Se o objeto principal for destruído, o objeto dependente também deixa de existir. No diagrama UML, é representada pelo losango preenchido (preto).

- **Onde foi utilizada:** Entre as classes Paciente e Prontuario.
- **Como foi aplicada:** A classe Paciente possui um atributo privado do tipo Prontuario. No construtor da classe Paciente, a passagem de um objeto Prontuario válido é obrigatória, garantindo que nenhum paciente exista no sistema sem um prontuário vinculado, definindo o vínculo de ciclo de vida forte exigido no enunciado.

### 4. Agregação

A agregação é uma relação de dependência fraca ("relação de todo-parte"), onde o objeto associado pode existir independentemente do objeto principal. No diagrama UML, é representada pelo losango vazio (branco).

- **Onde foi utilizada:** Na classe Consulta em relação às classes Medico e Paciente.
- **Como foi aplicada:** A classe Consulta agrega instâncias de Medico e Paciente. Se uma consulta for cancelada ou excluída do sistema, o médico e o paciente continuam existindo de forma independente no cadastro do hospital.

### 5. Sobrescrita 

A sobrescrita ocorre quando uma subclasse modifica o comportamento de um método que foi herdado da superclasse.

- **Onde foi utilizada:** Nas classes Medico, Enfermeiro e Paciente.
- **Como foi aplicada:** A superclasse Pessoa possui o método genérico exibirPerfil(). Para atender ao requisito de que cada tipo de perfil cadastrado deve apresentar as suas informações de forma personalizada no terminal, as subclasses redefiniram o método exibirPerfil(), utilizando o polimorfismo para exibir dados específicos de cada um (como o CRM do médico ou o COREN do enfermeiro).

### 6. Sobrecarga

A sobrecarga permite que uma classe tenha múltiplos métodos ou construtores com o mesmo nome, desde que possuam assinaturas (parâmetros/argumentos) diferentes.

- **Onde foi utilizada:** Nas classes Consulta, Pessoa, Medico e Enfermeiro.
- **Como foi aplicada:**
    - **Nos Construtores:** Há mais de um construtor disponível nas classes de entidade (como Pessoa, Medico, Enfermeiro), permitindo instanciar objetos de forma completa ou apenas com dados essenciais (como id, nome e cpf). Na classe Consulta, foram criados múltiplos construtores para permitir flexibilidade na instanciação da agenda.
    - **Nos Métodos:** Foi implementada diretamente na classe Consulta através do método agendarConsulta. O sistema disponibiliza três variações do método para realizar o fluxo de agendamento de formas distintas conforme a necessidade de parâmetros:
        1. agendarConsulta(): Altera o status para agendado usando os valores padrão preexistentes.
        2. agendarConsulta(LocalDate data): Define uma data específica para o atendimento e atualiza o status.
        3. agendarConsulta(LocalDate data, String observacoes): Realiza o agendamento completo definindo a data e as observações clínicas simultaneamente.