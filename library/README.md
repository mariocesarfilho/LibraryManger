# LibraryManger
Projeto de gerenciamento de livros

O BibliotecaXP é um sistema desenvolvido para gerenciar de forma eficiente uma biblioteca, utilizando Java e o banco de dados SQLite para armazenar as informações. O principal objetivo é facilitar o controle sobre os usuários, livros, empréstimos e históricos, além de manter a organização com relação aos empréstimos atrasados e notificar os usuários que não cumpriram os prazos.

1.Cadastro de Usuários
O sistema permite cadastrar os usuários da biblioteca, registrando informações como nome, endereço e telefone. Além disso, ele identifica automaticamente os usuários que estão inadimplentes, ou seja, aqueles com livros atrasados.

2.Cadastro de Livros
Todos os livros da biblioteca são cadastrados com dados como título, autor, editora, ano de publicação e a quantidade de cópias disponíveis. O sistema ajuda a controlar o estoque de livros, garantindo que a quantidade de cópias seja sempre atualizada.

3.Empréstimos de Livros
Os usuários podem emprestar livros, e o sistema registra cada empréstimo com informações como a data de empréstimo, a data prevista de devolução e o status do empréstimo (ativo, atrasado ou devolvido). Ele também verifica automaticamente se algum empréstimo está atrasado e envia notificações para os usuários que não devolveram o livro dentro do prazo.

4.Histórico de Empréstimos
O sistema mantém um histórico detalhado de todos os empréstimos realizados, permitindo que tanto os usuários quanto os administradores da biblioteca vejam quantas vezes um livro foi emprestado, bem como o histórico de cada usuário.

5.Notificação de Atrasos
Para garantir o bom funcionamento da biblioteca, o sistema envia alertas automáticos para os usuários inadimplentes, lembrando-os de devolver os livros que estão em atraso.
