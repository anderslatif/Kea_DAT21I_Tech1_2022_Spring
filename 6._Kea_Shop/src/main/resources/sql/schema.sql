CREATE TABLE IF NOT EXISTS shop_name (
    shop_name VARCHAR(100)
);

INSERT INTO shop_name VALUES ('Kea Shop');


CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    stock INT UNSIGNED,
    price DOUBLE UNSIGNED,
    name VARCHAR(80)
);
