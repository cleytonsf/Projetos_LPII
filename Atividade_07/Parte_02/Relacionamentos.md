### **Justificativa dos Relacionamentos**

#### **Agregação**

- **Livro --> Autor**: Um livro tem um autor, mas o autor pode existir independentemente do livro. Se o livro for excluído, o autor não é excluído.
- **Emprestimo --> Exemplar**: Um empréstimo usa um exemplar, mas o exemplar pode existir sem estar emprestado.
- **Emprestimo --> Funcionario**: Um empréstimo é realizado por um funcionário, mas o funcionário pode existir sem estar associado a um empréstimo.

#### **Composição**

- **Exemplar --> Livro**: Um exemplar é parte de um livro. Se o livro for excluído, todos os seus exemplares também devem ser excluídos.