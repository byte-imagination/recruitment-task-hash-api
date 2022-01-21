CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    last_name  VARCHAR(64) NOT NULL,
    first_name VARCHAR(64) NOT NULL
);

INSERT INTO users(id, last_name, first_name)
VALUES (1, 'Kowalsky', 'John'),
       (2, 'Smith', 'Johanna');