DROP TABLE users_products IF EXISTS;
DROP TABLE products IF EXISTS;
DROP TABLE users IF EXISTS;

CREATE TABLE IF NOT EXISTS products (id serial, title VARCHAR(255), cost int(255), PRIMARY KEY (id));
INSERT INTO products (id, title, cost) VALUES (15,'box',100);
INSERT INTO products (id, title, cost) VALUES (31,'box1',200);


CREATE TABLE IF NOT EXISTS users (id serial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (id, name) VALUES (2L,'Bob');
INSERT INTO users (id, name) VALUES (3L,'Vasya');

CREATE TABLE users_products(user_id serial REFERENCES users(id), product_id serial REFERENCES products(id));
INSERT INTO users_products(user_id, product_id) VALUES (2L,15L);
INSERT INTO users_products(user_id, product_id) VALUES (2L,31L);
INSERT INTO users_products(user_id, product_id) VALUES (3L,15L);
INSERT INTO users_products(user_id, product_id) VALUES (3L,31L);

