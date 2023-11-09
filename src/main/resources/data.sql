INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (1, 'Maquillage', 1, 'Maquillage');
INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (2, 'Parfum', 1, 'Parfum');
INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (3, 'Soin Visage', 1, 'Soin Visage');
INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (4, 'Corps & Bain', 1, 'Corps & Bain');
INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (5, 'Cheveux', 1, 'Cheveux');
INSERT INTO `salakommercebdd`.`t_univers` (`id`, `description`, `level`, `name`)
VALUES (6, 'Bons Plans', 1, 'Bons Plans');

INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('1', 'Parfum Hommes', 'Parfum Hommes', '2');
INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('2', 'Parfum Femmes', 'Parfum Femmes', '2');
INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('3', 'Parfum Enfants', 'Parfum Enfants', '2');
INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('4', 'Parfum Petit Prix', 'Parfum Petit Prix', '2');
INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('5', 'Parfum Mixte', 'Parfum Mixte', '2');
INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('6', 'Mini Parfum', 'Mini Parfum', '2');

INSERT INTO `salakommercebdd`.`t_category` (`id`, `description`, `name`, `univers_id`)
VALUES ('7', 'Coffret Parfum', 'Coffret Parfum', '2');
INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('1', 'Eau De Parfum', '1', 'Eau De Parfum', '1');
INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('2', 'Eau De Toilette', '1', 'Eau De Toilette', '1');
INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('3', 'Eau De Cologne', '1', 'Eau De Cologne', '1');
INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('4', 'Diodorant', '1', 'Diodorant', '1');
INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('5', 'Gel Douche & Savon', '1', 'Gel Douche & Savon', '1');

INSERT INTO `salakommercebdd`.`t_subcategory` (`id`, `description`, `level`, `name`, `category_id`)
VALUES ('6', 'Gel Rasage & Après Rasage', '1', 'Gel Rasage & Après Rasage', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('1', 'terre d\'hermes', 'terre d\'hermes', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('2', 'blue de channel', 'blue de channel', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('3', 'versace', 'versace', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('4', 'La Nuit Trésor', 'La Nuit Trésor', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('5', 'Black Opium', 'Black Opium', '1');
INSERT INTO `salakommercebdd`.`t_product` (`id`, `description`, `name`, `subcategory_id`)
VALUES ('6', 'Paradoxe', 'Paradoxe', '1');

INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`, `old_price`)
VALUES ('1', '1', '10', '12');
INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`, `old_price`)
VALUES ('2', '2', '15', '20');
INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`, `old_price`)
VALUES ('3', '3', '20', '30');
INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`, `old_price`)
VALUES ('4', '4', '17', '17');
INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`, `old_price`)
VALUES ('5', '5', '5', '5');
INSERT INTO `salakommercebdd`.`t_price` (`id`, `product_id`, `new_price`)
VALUES ('6', '6', '6');




