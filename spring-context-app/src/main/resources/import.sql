DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial PRIMARY KEY, title VARCHAR(255), cost int(255));
INSERT INTO products (id, title, cost) VALUES (1l,'box',100);
INSERT INTO products (id, title, cost) VALUES (2l,'box1',200);

DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial PRIMARY KEY, name VARCHAR(255), product_id bigserial REFERENCES products(id));
INSERT INTO users (id, name, product_id) VALUES (2L, 'Bob', 1L);
INSERT INTO users (id, name, product_id) VALUES (3L, 'Vasya', 2L);