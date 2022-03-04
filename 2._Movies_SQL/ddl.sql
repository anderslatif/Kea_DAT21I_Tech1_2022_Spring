SHOW TABLES;

CREATE TABLE IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    year YEAR
);


CREATE TABLE IF NOT EXISTS directors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    movie_id INT,
    FOREIGN KEY (movie_id) REFERENCES movies(id)
);



ALTER TABLE movies ADD COLUMN year YEAR NOT NULL AFTER title;

ALTER TABLE movies DROP COLUMN year;

ALTER TABLE movies MODIFY year INT(4);



DROP TABLE movies;

# DATABASES,TABLES,COLUMNS vs. DATA (in ROWS)
# DDL                      vs. DML
# CRUD



