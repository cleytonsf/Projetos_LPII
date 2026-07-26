# Explique a diferença entre uma classe abstrata e uma interface em Java considerando os seguintes aspectos: 

## Objetivo 
**Classe Abstrata:** Define uma identidade comum e serve como base para classes fortemente relacionadas (relação do tipo "é um"). É ideal quando você deseja compartilhar implementação de código e estado entre subclasses.
   
**Interface:** Define um contrato de comportamento ou capacidade (relação do tipo "faz um" ou "é capaz de"). É ideal para garantir que classes diferentes, mesmo sem parentesco na hierarquia de herança, implementem os mesmos métodos.

## Instanciação 
**Classe Abstrata:** Não pode ser instanciada diretamente com o operador new.
  
**Interface:** Não pode ser instanciada diretamente com o operador new.

## Métodos 
**Classe Abstrata:**
Pode ter métodos abstratos (sem corpo) e métodos concretos (com corpo e implementação).
Métodos podem ter qualquer modificador de acesso (public, protected, private).

**Interface:**
Por padrão, todos os métodos declarados sem corpo são public abstract.
Pode conter métodos concretos usando os modificadores default e static.
Pode ter métodos private para auxiliar na reutilização de código interno da interface.

## Atributos 
**Classe Abstrata:**
Pode declarar variáveis de instância normais (com diferentes estados, mutáveis ou não).
Aceita qualquer modificador de acesso (private, protected, public, static).

**Interface:**
Todos os atributos são implicitamente public static final (ou seja, são sempre constantes).
Não pode conter estado/variáveis de instância mutáveis.

## Herança
**Classe Abstrata:**
Usa a palavra-chave extends.
O Java suporta apenas herança simples de classes, portanto uma subclasse pode estender apenas uma classe abstrata.

**Interface:**
Usa a palavra-chave implements.
Uma classe pode implementar múltiplas interfaces simultaneamente.
Uma interface também pode estender (extends) múltiplas outras interfaces.