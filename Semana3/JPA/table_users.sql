create database if not exists PWdatabase;

use PWdatabase;

drop table if exists users;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(64) DEFAULT NULL,
  `first_name` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `cellphone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (1,'Doe','John','john.doe@foo.com', '8181759370');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (2,'Public','Mary','mary.public@foo.com', '8181759375');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (3,'Queue','Susan','susan.queue@foo.com', '8181759374');

INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (4,'Williams','David','david.williams@foo.com', '8183759370');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (5,'Johnson','Lisa','lisa.johnson@foo.com', '8181759270');
INSERT INTO `users` (`id`,`last_name`,`first_name`,`email`, `cellphone`) VALUES (6,'Smith','Paul','paul.smith@foo.com', '8181759371');