-- v2: Migrations para adicionar a coluna de RANK na tabela de Cadastros
ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);

