DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial PRIMARY KEY, title VARCHAR(255), cost int(255));
INSERT INTO products (id, title, cost) VALUES (15L,'box',100);
INSERT INTO products (id, title, cost) VALUES (31L,'box1',200);

DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO users (id, name) VALUES (2L,'Bob');
INSERT INTO users (id, name) VALUES (3L,'Vasya');

