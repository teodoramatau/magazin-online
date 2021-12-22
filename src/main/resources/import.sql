INSERT INTO products (name, soi, tip, culoare, pret, stoc) values ('Recas Sole', 'Chardonnay', 'sec', 'alb', 59.4, 10);
INSERT INTO products (name, soi, tip, culoare, pret, stoc) values ('Aurelia Visinescu Anima 3', 'Feteasca Neagra', 'sec', 'rosu', 96.09, 4);
INSERT INTO products (name, soi, tip, culoare, pret, stoc) values ('Rasova La Plage', 'Pinot Noir', 'sec', 'rose', 33.3, 6);
INSERT INTO products (name, soi, tip, culoare, pret, stoc) values ('Tarapaca Gran Reserva', 'Cabernet Sauvignon', 'sec', 'rosu', 69.5, 8);
INSERT INTO products (name, soi, tip, culoare, pret, stoc) values ('Dealu Negru Jelna', 'Merlot', 'sec', 'rose', 40.8, 7);

INSERT INTO orders VALUES(1, 'Str Nae Leonard', 'pampam@gmail.com', 'Pam Pam', '112');
INSERT INTO ordered_products (order_id, product_id, quantity) VALUES(1, 1, 10);