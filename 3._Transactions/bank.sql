CREATE TABLE IF NOT EXISTS accounts (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(120),
  balance FLOAT
);


START TRANSACTION;
    SELECT balance FROM accounts WHERE id = 1;
    UPDATE accounts SET balance = 1100 WHERE id = 1;
COMMIT;


