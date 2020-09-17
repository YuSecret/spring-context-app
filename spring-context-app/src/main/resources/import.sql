DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob');

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), cost int(255), PRIMARY KEY (id));
INSERT INTO products (id, title, cost) VALUES (1l,'box',100);