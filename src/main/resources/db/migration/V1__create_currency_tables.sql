CREATE TABLE currency (
  id SERIAL primary key ,
  name VARCHAR(100) NOT NULL,
  dollar_conversion FLOAT NOT NULL);

INSERT INTO currency (name, dollar_conversion) VALUES ('USD', 1.0);
INSERT INTO currency (name, dollar_conversion) VALUES ('COP', 3441.35);
INSERT INTO currency (name, dollar_conversion) VALUES ('EUR', 0.91);
