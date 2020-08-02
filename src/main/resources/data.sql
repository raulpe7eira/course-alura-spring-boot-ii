INSERT INTO usuario(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');

INSERT INTO curso(nome, categoria) VALUES('Spring Boot', 'Back-end');
INSERT INTO curso(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 1', 'Erro ao criar projeto', '2020-08-01 13:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2020-08-01 13:10:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2020-08-01 14:00:00', 'NAO_RESPONDIDO', 1, 2);
