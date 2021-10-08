INSERT INTO tb_person VALUES (null, 'João', 'BR', '999-9999'),
							 (null, 'Luiz', 'BR', '999-9999'),
							 (null, 'José', 'BR', '999-9999'),
							 (null, 'Caio', 'BR', '999-9999'); 

INSERT INTO tb_organization VALUES(null, '2020-10-10', '2021-10-10'), 
								  (null, '2020-10-05', '2021-10-05'),
								  (null, '2020-10-20', '2021-10-20'),
								  (null, '2020-10-16', '2021-10-16'),
								  (null, '2020-10-23', '2021-10-23'),
								  (null, '2020-10-25', '2021-10-25');
								  
INSERT INTO tb_party VALUES (null, 'Evolution I - A FESTA','2021-10-10', 'Evolution I - A FESTA', '2021-10-10', 1, 1),
							(null, 'Evolution II - A FESTA', '2021-10-05', 'Evolution II - A FESTA', '2021-10-05', 2, 2),
							(null, 'Evolution III - A FESTA', '2021-10-20', 'Evolution III - A FESTA', '2021-10-20', 3, 3),
							(null, 'Evolution IV - A FESTA', '2021-10-16', 'Evolution IV - A FESTA', '2021-10-16', 4, 4),
							(null, 'Evolution V - A FESTA', '2021-10-23', 'Evolution V - A FESTA', '2021-10-23', 2, 2),
							(null, 'Evolution IV - A FESTA', '2021-10-25', 'Evolution VI - A FESTA', '2021-10-25', 4, 4);

							
INSERT INTO tb_guest VALUES (null, false, 1, 2),
							(null, false, 2, 2),
							(null, false, 3, 1),
							(null, false, 1, 4),
							(null, true, 4, 1),
							(null, true, 2, 3),
							(null, false, 1, 3),
							(null, true, 3, 2),
							(null, false, 4, 4),
							(null, false, 4, 2);