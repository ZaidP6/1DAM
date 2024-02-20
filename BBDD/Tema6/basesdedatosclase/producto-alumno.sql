DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS alumno;
DROP TABLE IF EXISTS producto2;
DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS matricula;
DROP TABLE IF EXISTS nota;

CREATE TABLE producto(
	id_producto serial NOT NULL,
	nombre varchar,
	precio real,
	CONSTRAINT pk_producto PRIMARY KEY (id_producto)
);
	
CREATE TABLE alumno(
	cod_alumno serial NOT NULL,
	nombre varchar,
	aprellido1 varchar,
	apellido2 varchar,
	nombre_completo text,
	fecha_nacimiento date,
	edad_31_diciembre smallint, /*Indica que la eda va a ser menor de 200 y por tanto este le abarcará*/
	mail varchar(320),
	CONSTRAINT pk_alumno PRIMARY KEY(cod_alumno)
);
	
CREATE TABLE producto2(
	num_producto integer,
	nombre text NOT NULL, 
	precio numeric,
	precio_descontado numeric,
	CONSTRAINT precio_positivo CHECK (precio>0),
	CONSTRAINT precio_descontado_positivo CHECK(precio_descontado>0),
	CONSTRAINT descuento_valido CHECK(precio_descontado<precio),
	CONSTRAINT pk_producto2 PRIMARY KEY (num_producto)
);

CREATE TABLE pedido(
	id_pedido integer,
	num_producto integer,
	cantidad integer,
	CONSTRAINT pk_id_pedido PRIMARY KEY (id_pedido),
	CONSTRAINT fk_pedido_producto2 FOREIGN KEY (num_producto) REFERENCES producto2
);
CREATE TABLE nota(
	id_alumno integer,
	id_asignatura integer,
	anio_escolar varchar(10),
	tipo_evaluacion varchar,
	nota integer,
	CONSTRAINT pk_nota PRIMARY KEY (id_alumno,id_asignatura, anio_escolar, tipo_evaluacion),
	CONSTRAINT fk_nota_alumno FOREIGN KEY (id_alumno) REFERENCES alumno
);


CREATE TABLE matricula(
	id_alumno integer,
	id_asignatura integer,
	anio_escolar varchar(10),
	CONSTRAINT pk_matricula PRIMARY KEY (id_alumno, id_asignatura, anio_escolar),
	CONSTRAINT fk_matricula_alumno FOREIGN KEY (id_alumno) REFERENCES alumno,
	CONSTRAINT ck_nota_tipo_evaluacion CHECK 
);


INSERT INTO producto (nombre, precio) 
VALUES ('palomitas saladas',4.37),
		('palomitas caramelo', 5.18),
		('regaliz rojo',1.25),
		('regaliz negro',1.20),
		('fresitas', 0.15);
		
SELECT * FROM producto ORDER BY id_producto;

UPDATE producto

--SEQUENCE sirve para establecer su numero siguiente en el numero en el que nosotros queramos.
-- INCREMENT sirve para establecer el incremento en un serial, para que vaya contando de 5 en 5, 10 en 10, ect.

ALTER SEQUENCE producto_id_producto_seq
RESTART WITH 1000;

INSERT INTO producto (nombre, precio) 
VALUES ('huevo frito',0.16),
		('supositorio', 0.04),
		('lengua',0.22);
		
ALTER SEQUENCE producto_id_producto_seq
INCREMENT BY 5;

INSERT INTO producto (nombre, precio) 
VALUES ('huevo aplastao',0.16);


INSERT INTO producto (nombre, precio) 
VALUES ('tiza',0.47)
RETURNING id_producto;


insert into producto (nombre, precio) values ('Mcguinness - Blue Curacao', '12.13');
insert into producto (nombre, precio) values ('Pepsi - Diet, 355 Ml', '2.28');
insert into producto (nombre, precio) values ('Wine - Mas Chicet Rose, Vintage', '17.14');
insert into producto (nombre, precio) values ('Garam Masala Powder', '1.05');
insert into producto (nombre, precio) values ('Beer - Labatt Blue', '7.29');
insert into producto (nombre, precio) values ('Tarragon - Fresh', '14.38');
insert into producto (nombre, precio) values ('Coffee Beans - Chocolate', '12.08');
insert into producto (nombre, precio) values ('Salt - Sea', '14.48');
insert into producto (nombre, precio) values ('Wine - Bourgogne 2002, La', '11.53');
insert into producto (nombre, precio) values ('Bread - Crumbs, Bulk', '0.75');
insert into producto (nombre, precio) values ('Samosa - Veg', '0.27');
insert into producto (nombre, precio) values ('Tart - Lemon', '1.35');
insert into producto (nombre, precio) values ('Soup - Beef Conomme, Dry', '10.67');
insert into producto (nombre, precio) values ('Beer - Camerons Auburn', '6.08');
insert into producto (nombre, precio) values ('Berry Brulee', '7.38');
insert into producto (nombre, precio) values ('Bread - Focaccia Quarter', '0.73');
insert into producto (nombre, precio) values ('Yogurt - Raspberry, 175 Gr', '14.18');
insert into producto (nombre, precio) values ('Kumquat', '15.64');
insert into producto (nombre, precio) values ('Lumpfish Black', '4.01');
insert into producto (nombre, precio) values ('Cheese - St. Andre', '14.46');
insert into producto (nombre, precio) values ('Chilli Paste, Sambal Oelek', '2.48');
insert into producto (nombre, precio) values ('Red Currants', '8.24');
insert into producto (nombre, precio) values ('Bread - Pita, Mini', '5.88');
insert into producto (nombre, precio) values ('Veal - Knuckle', '1.03');
insert into producto (nombre, precio) values ('Alize Sunset', '7.21');
insert into producto (nombre, precio) values ('Versatainer Nc - 888', '6.08');
insert into producto (nombre, precio) values ('Soup - Campbells Tomato Ravioli', '13.64');
insert into producto (nombre, precio) values ('Instant Coffee', '12.19');
insert into producto (nombre, precio) values ('Wine - Masi Valpolocell', '11.48');
insert into producto (nombre, precio) values ('Fish - Atlantic Salmon, Cold', '19.18');
insert into producto (nombre, precio) values ('Spice - Paprika', '11.43');
insert into producto (nombre, precio) values ('Dc - Sakura Fu', '5.96');
insert into producto (nombre, precio) values ('Beef - Tongue, Fresh', '13.06');
insert into producto (nombre, precio) values ('Honey - Comb', '10.55');
insert into producto (nombre, precio) values ('Beef - Rib Roast, Cap On', '2.37');
insert into producto (nombre, precio) values ('Bread - Roll, Whole Wheat', '8.34');
insert into producto (nombre, precio) values ('Butter - Salted, Micro', '18.71');
insert into producto (nombre, precio) values ('Red Currant Jelly', '7.12');
insert into producto (nombre, precio) values ('Chutney Sauce', '12.66');
insert into producto (nombre, precio) values ('Cake - Lemon Chiffon', '2.95');
insert into producto (nombre, precio) values ('General Purpose Trigger', '16.10');
insert into producto (nombre, precio) values ('Coffee - Colombian, Portioned', '15.32');
insert into producto (nombre, precio) values ('Soup Campbells - Tomato Bisque', '19.84');
insert into producto (nombre, precio) values ('Butter Sweet', '18.35');
insert into producto (nombre, precio) values ('Urban Zen Drinks', '13.76');
insert into producto (nombre, precio) values ('Lid - 0090 Clear', '8.28');
insert into producto (nombre, precio) values ('Mortadella', '5.20');
insert into producto (nombre, precio) values ('Wine - Pinot Noir Stoneleigh', '2.91');
insert into producto (nombre, precio) values ('Trout - Rainbow, Frozen', '2.04');
insert into producto (nombre, precio) values ('Dasheen', '7.55');
insert into producto (nombre, precio) values ('Chicken - Tenderloin', '5.74');
insert into producto (nombre, precio) values ('Soda Water - Club Soda, 355 Ml', '9.59');
insert into producto (nombre, precio) values ('Veal - Inside, Choice', '14.47');
insert into producto (nombre, precio) values ('Rolled Oats', '15.33');
insert into producto (nombre, precio) values ('Juice - Apple 284ml', '12.80');
insert into producto (nombre, precio) values ('Guinea Fowl', '18.86');
insert into producto (nombre, precio) values ('Sprouts Dikon', '1.59');
insert into producto (nombre, precio) values ('The Pop Shoppe Pinapple', '3.75');
insert into producto (nombre, precio) values ('Apple - Delicious, Golden', '12.21');
insert into producto (nombre, precio) values ('Campari', '9.29');
insert into producto (nombre, precio) values ('Venison - Striploin', '7.16');
insert into producto (nombre, precio) values ('Celery', '18.88');
insert into producto (nombre, precio) values ('Longos - Chicken Wings', '14.98');
insert into producto (nombre, precio) values ('Burger Veggie', '18.79');
insert into producto (nombre, precio) values ('Wine - Ruffino Chianti Classico', '15.22');
insert into producto (nombre, precio) values ('Soup - Campbells, Spinach Crm', '1.53');
insert into producto (nombre, precio) values ('Mortadella', '9.34');
insert into producto (nombre, precio) values ('Cheese - Gouda', '5.89');
insert into producto (nombre, precio) values ('Initation Crab Meat', '13.81');
insert into producto (nombre, precio) values ('Potatoes - Mini White 3 Oz', '0.72');
insert into producto (nombre, precio) values ('Bouq All Italian - Primerba', '8.02');
insert into producto (nombre, precio) values ('Tea - Lemon Scented', '15.34');
insert into producto (nombre, precio) values ('Table Cloth 62x114 Colour', '1.64');
insert into producto (nombre, precio) values ('Wine - White, Pinot Grigio', '16.18');
insert into producto (nombre, precio) values ('Appetizer - Seafood Assortment', '0.55');
insert into producto (nombre, precio) values ('Bread Base - Toscano', '14.50');
insert into producto (nombre, precio) values ('Pizza Pizza Dough', '10.23');
insert into producto (nombre, precio) values ('Dip - Tapenade', '5.50');
insert into producto (nombre, precio) values ('Artichoke - Hearts, Canned', '9.26');
insert into producto (nombre, precio) values ('Sausage - Andouille', '13.19');
insert into producto (nombre, precio) values ('Seedlings - Clamshell', '5.41');
insert into producto (nombre, precio) values ('Soup - Beef Conomme, Dry', '2.03');
insert into producto (nombre, precio) values ('Lemonade - Mandarin, 591 Ml', '4.16');
insert into producto (nombre, precio) values ('Lamb - Shanks', '6.16');
insert into producto (nombre, precio) values ('Cheese - Blue', '5.73');
insert into producto (nombre, precio) values ('Veal - Kidney', '14.93');
insert into producto (nombre, precio) values ('Wine - White, Pinot Grigio', '12.54');
insert into producto (nombre, precio) values ('Cotton Wet Mop 16 Oz', '11.95');
insert into producto (nombre, precio) values ('Pastry - Baked Cinnamon Stick', '4.19');
insert into producto (nombre, precio) values ('Cake Slab', '7.37');
insert into producto (nombre, precio) values ('Juice - Propel Sport', '16.60');
insert into producto (nombre, precio) values ('Mix Pina Colada', '5.12');
insert into producto (nombre, precio) values ('Mushroom - Morel Frozen', '16.39');
insert into producto (nombre, precio) values ('Thyme - Lemon, Fresh', '2.72');
insert into producto (nombre, precio) values ('Wine - Casablanca Valley', '2.52');
insert into producto (nombre, precio) values ('Coconut - Creamed, Pure', '1.79');
insert into producto (nombre, precio) values ('Shortbread - Cookie Crumbs', '11.47');
insert into producto (nombre, precio) values ('Onions - Dried, Chopped', '18.93');
insert into producto (nombre, precio) values ('Sauce - Black Current, Dry Mix', '10.74');
insert into producto (nombre, precio) values ('Lid - 16 Oz And 32 Oz', '19.13');
insert into producto (nombre, precio) values ('Sauce - Rosee', '8.39');
insert into producto (nombre, precio) values ('Thermometer Digital', '5.15');
insert into producto (nombre, precio) values ('Soup - Cream Of Broccoli', '5.91');
insert into producto (nombre, precio) values ('Tea Leaves - Oolong', '9.06');
insert into producto (nombre, precio) values ('Venison - Racks Frenched', '14.97');
insert into producto (nombre, precio) values ('Pasta - Lasagna Noodle, Frozen', '3.85');
insert into producto (nombre, precio) values ('Chef Hat 20cm', '3.20');
insert into producto (nombre, precio) values ('Mangostein', '8.00');
insert into producto (nombre, precio) values ('Coffee - Cafe Moreno', '16.11');
insert into producto (nombre, precio) values ('Salsify, Organic', '7.20');
insert into producto (nombre, precio) values ('The Pop Shoppe Pinapple', '16.51');
insert into producto (nombre, precio) values ('Bread - Malt', '18.42');
insert into producto (nombre, precio) values ('Wine - Sicilia Igt Nero Avola', '2.06');
insert into producto (nombre, precio) values ('Wine - White, Colubia Cresh', '19.19');
insert into producto (nombre, precio) values ('True - Vue Containers', '15.17');
insert into producto (nombre, precio) values ('Cheese - Shred Cheddar / Mozza', '19.68');
insert into producto (nombre, precio) values ('Sobe - Orange Carrot', '15.92');
insert into producto (nombre, precio) values ('Arizona - Green Tea', '3.86');
insert into producto (nombre, precio) values ('Juice - Apple, 500 Ml', '4.23');
insert into producto (nombre, precio) values ('Veal - Insides Provini', '15.20');
insert into producto (nombre, precio) values ('Wine - Rubyport', '12.35');
insert into producto (nombre, precio) values ('Cookies - Englishbay Wht', '0.26');
insert into producto (nombre, precio) values ('Longos - Lasagna Veg', '12.90');
insert into producto (nombre, precio) values ('Onions - Cooking', '19.11');
insert into producto (nombre, precio) values ('Wine - Shiraz South Eastern', '16.49');
insert into producto (nombre, precio) values ('Soup - Base Broth Beef', '17.84');
insert into producto (nombre, precio) values ('Glass Clear 7 Oz Xl', '16.42');
insert into producto (nombre, precio) values ('Bread - Sour Batard', '2.51');
insert into producto (nombre, precio) values ('Ice Cream - Vanilla', '7.83');
insert into producto (nombre, precio) values ('Cornstarch', '10.40');
insert into producto (nombre, precio) values ('Soup - Campbells Chicken', '9.95');
insert into producto (nombre, precio) values ('Beef - Cow Feet Split', '11.85');
insert into producto (nombre, precio) values ('Shrimp - 31/40', '18.48');
insert into producto (nombre, precio) values ('Cinnamon Buns Sticky', '4.91');
insert into producto (nombre, precio) values ('Salt And Pepper Mix - Black', '15.10');
insert into producto (nombre, precio) values ('Apricots Fresh', '12.14');
insert into producto (nombre, precio) values ('Wine - Acient Coast Caberne', '3.50');
insert into producto (nombre, precio) values ('Pears - Bartlett', '0.35');
insert into producto (nombre, precio) values ('Bagel - Everything', '4.68');
insert into producto (nombre, precio) values ('Cheese - Grana Padano', '0.22');
insert into producto (nombre, precio) values ('Longos - Cheese Tortellini', '1.60');
insert into producto (nombre, precio) values ('Lobster - Live', '4.60');
insert into producto (nombre, precio) values ('Energy Drink - Franks Original', '19.45');
insert into producto (nombre, precio) values ('Pepper - Cayenne', '2.16');
insert into producto (nombre, precio) values ('Longos - Penne With Pesto', '12.46');
insert into producto (nombre, precio) values ('Wanton Wrap', '16.08');
insert into producto (nombre, precio) values ('Chicken - Wings, Tip Off', '15.60');
insert into producto (nombre, precio) values ('Yogurt - French Vanilla', '16.28');
insert into producto (nombre, precio) values ('Pasta - Fettuccine, Egg, Fresh', '11.16');
insert into producto (nombre, precio) values ('Turnip - Wax', '1.34');
insert into producto (nombre, precio) values ('Cake Circle, Foil, Scallop', '7.39');
insert into producto (nombre, precio) values ('Veal - Bones', '6.28');
insert into producto (nombre, precio) values ('Iced Tea Concentrate', '12.98');
insert into producto (nombre, precio) values ('Sauce - Hp', '13.57');
insert into producto (nombre, precio) values ('Scampi Tail', '16.25');
insert into producto (nombre, precio) values ('Bread - Pumpernickle, Rounds', '11.99');
insert into producto (nombre, precio) values ('Cod - Salted, Boneless', '8.75');
insert into producto (nombre, precio) values ('Icecream Bar - Del Monte', '5.42');
insert into producto (nombre, precio) values ('Bread Base - Toscano', '17.44');
insert into producto (nombre, precio) values ('Juice - Tomato, 48 Oz', '8.74');
insert into producto (nombre, precio) values ('Soup Campbells - Italian Wedding', '4.30');
insert into producto (nombre, precio) values ('Fish - Scallops, Cold Smoked', '8.13');
insert into producto (nombre, precio) values ('Shrimp - Prawn', '12.81');
insert into producto (nombre, precio) values ('Sponge Cake Mix - Vanilla', '16.67');
insert into producto (nombre, precio) values ('Cheese - Brick With Pepper', '11.34');
insert into producto (nombre, precio) values ('Sprouts - Peppercress', '17.09');
insert into producto (nombre, precio) values ('Mayonnaise - Individual Pkg', '6.36');
insert into producto (nombre, precio) values ('Cookies Almond Hazelnut', '0.76');
insert into producto (nombre, precio) values ('Crab - Claws, Snow 16 - 24', '5.97');
insert into producto (nombre, precio) values ('Soup Campbells Turkey Veg.', '7.94');
insert into producto (nombre, precio) values ('Coke - Diet, 355 Ml', '2.06');
insert into producto (nombre, precio) values ('Brandy Apricot', '12.96');
insert into producto (nombre, precio) values ('Tomato - Peeled Italian Canned', '12.82');
insert into producto (nombre, precio) values ('Salmon - Fillets', '2.87');
insert into producto (nombre, precio) values ('Grand Marnier', '15.35');
insert into producto (nombre, precio) values ('Chocolate Eclairs', '6.15');
insert into producto (nombre, precio) values ('Kumquat', '12.54');
insert into producto (nombre, precio) values ('Oil - Coconut', '3.55');
insert into producto (nombre, precio) values ('Gingerale - Diet - Schweppes', '10.74');
insert into producto (nombre, precio) values ('Skirt - 29 Foot', '10.03');
insert into producto (nombre, precio) values ('Tomatillo', '5.19');
insert into producto (nombre, precio) values ('Halibut - Fletches', '6.05');
insert into producto (nombre, precio) values ('Radish - Pickled', '2.88');
insert into producto (nombre, precio) values ('Nut - Pistachio, Shelled', '0.93');
insert into producto (nombre, precio) values ('Ecolab - Hand Soap Form Antibac', '10.00');
insert into producto (nombre, precio) values ('Raisin - Golden', '9.07');
insert into producto (nombre, precio) values ('Coconut - Shredded, Unsweet', '1.40');
insert into producto (nombre, precio) values ('Pea - Snow', '2.26');
insert into producto (nombre, precio) values ('Lime Cordial - Roses', '7.75');
insert into producto (nombre, precio) values ('Lid Tray - 12in Dome', '13.37');
insert into producto (nombre, precio) values ('Juice - Apple, 341 Ml', '5.06');
insert into producto (nombre, precio) values ('Flour - Whole Wheat', '18.47');
insert into producto (nombre, precio) values ('Carbonated Water - Blackberry', '16.46');
insert into producto (nombre, precio) values ('Macaroons - Homestyle Two Bit', '13.76');
insert into producto (nombre, precio) values ('Container - Hngd Cll Blk 7x7x3', '0.79');
insert into producto (nombre, precio) values ('Sauce - Apple, Unsweetened', '11.09');
insert into producto (nombre, precio) values ('Bacardi Mojito', '17.42');
insert into producto (nombre, precio) values ('Cookies - Oreo, 4 Pack', '12.02');
insert into producto (nombre, precio) values ('Rolled Oats', '8.51');
insert into producto (nombre, precio) values ('Crackers - Trio', '0.62');
insert into producto (nombre, precio) values ('Tofu - Soft', '7.43');
insert into producto (nombre, precio) values ('Wine - Riesling Dr. Pauly', '13.31');
insert into producto (nombre, precio) values ('Vacuum Bags 12x16', '3.28');
insert into producto (nombre, precio) values ('Pasta - Elbows, Macaroni, Dry', '2.45');
insert into producto (nombre, precio) values ('Wine - Beringer Founders Estate', '17.92');
insert into producto (nombre, precio) values ('Flour - Cake', '18.52');
insert into producto (nombre, precio) values ('Cookie Choc', '14.94');
insert into producto (nombre, precio) values ('Liqueur - Melon', '15.22');
insert into producto (nombre, precio) values ('Napkin - Dinner, White', '6.00');
insert into producto (nombre, precio) values ('Cheese - Mozzarella, Shredded', '9.25');
insert into producto (nombre, precio) values ('Foie Gras', '8.81');
insert into producto (nombre, precio) values ('Wine - Maipo Valle Cabernet', '8.62');
insert into producto (nombre, precio) values ('Carrots - Purple, Organic', '11.18');
insert into producto (nombre, precio) values ('Tart Shells - Sweet, 4', '14.33');
insert into producto (nombre, precio) values ('Pasta - Cappellini, Dry', '16.89');
insert into producto (nombre, precio) values ('Sauce - Plum', '8.41');
insert into producto (nombre, precio) values ('Eel Fresh', '2.16');
insert into producto (nombre, precio) values ('Muffin Mix - Banana Nut', '1.29');
insert into producto (nombre, precio) values ('Tomato - Green', '2.42');
insert into producto (nombre, precio) values ('Wine - Lamancha Do Crianza', '9.57');
insert into producto (nombre, precio) values ('Sausage - Breakfast', '16.64');
insert into producto (nombre, precio) values ('Turnip - Mini', '6.22');
insert into producto (nombre, precio) values ('Cheese - Cream Cheese', '18.53');
insert into producto (nombre, precio) values ('Ketchup - Tomato', '13.46');
insert into producto (nombre, precio) values ('Salami - Genova', '15.26');
insert into producto (nombre, precio) values ('Cheese - Havarti, Roasted Garlic', '12.87');
insert into producto (nombre, precio) values ('Icecream - Dstk Super Cone', '19.36');
insert into producto (nombre, precio) values ('Wine - Marlbourough Sauv Blanc', '2.18');
insert into producto (nombre, precio) values ('Mousse - Mango', '8.96');
insert into producto (nombre, precio) values ('Corn Kernels - Frozen', '12.05');
insert into producto (nombre, precio) values ('Eggplant - Asian', '18.92');
insert into producto (nombre, precio) values ('Chicken Breast Wing On', '1.59');
insert into producto (nombre, precio) values ('Tomato Puree', '9.78');
insert into producto (nombre, precio) values ('Rosemary - Fresh', '11.72');
insert into producto (nombre, precio) values ('Liners - Baking Cups', '3.02');
insert into producto (nombre, precio) values ('Salmon - Sockeye Raw', '14.76');
insert into producto (nombre, precio) values ('Table Cloth - 53x69 Colour', '14.38');
insert into producto (nombre, precio) values ('Soup Campbells', '10.83');
insert into producto (nombre, precio) values ('Wine - Magnotta - Bel Paese White', '15.40');
insert into producto (nombre, precio) values ('Hog / Sausage Casing - Pork', '0.32');
insert into producto (nombre, precio) values ('Salt And Pepper Mix - White', '8.23');
insert into producto (nombre, precio) values ('Soup - Campbells, Creamy', '16.97');
insert into producto (nombre, precio) values ('Flour - Masa De Harina Mexican', '13.44');
insert into producto (nombre, precio) values ('Wine - Placido Pinot Grigo', '17.65');
insert into producto (nombre, precio) values ('Nut - Walnut, Chopped', '6.42');
insert into producto (nombre, precio) values ('Goat - Whole Cut', '15.54');
insert into producto (nombre, precio) values ('Coffee - Decaffeinato Coffee', '4.32');
insert into producto (nombre, precio) values ('Tomatoes - Vine Ripe, Red', '8.56');
insert into producto (nombre, precio) values ('Sauce - Marinara', '4.15');
insert into producto (nombre, precio) values ('Pastry - Carrot Muffin - Mini', '13.66');
insert into producto (nombre, precio) values ('Bar Mix - Pina Colada, 355 Ml', '1.04');
insert into producto (nombre, precio) values ('Steampan - Half Size Shallow', '18.17');
insert into producto (nombre, precio) values ('Juice - Lemon', '17.51');
insert into producto (nombre, precio) values ('Chutney Sauce', '10.96');
insert into producto (nombre, precio) values ('Ocean Spray - Kiwi Strawberry', '15.28');
insert into producto (nombre, precio) values ('Hand Towel', '19.87');
insert into producto (nombre, precio) values ('Arctic Char - Fresh, Whole', '4.11');
insert into producto (nombre, precio) values ('Tarts Assorted', '3.78');
insert into producto (nombre, precio) values ('Rice - Wild', '6.19');
insert into producto (nombre, precio) values ('Table Cloth 120 Round White', '10.07');
insert into producto (nombre, precio) values ('Juice - Cranberry 284ml', '2.14');
insert into producto (nombre, precio) values ('Rabbit - Whole', '18.84');
insert into producto (nombre, precio) values ('Gherkin - Sour', '11.41');
insert into producto (nombre, precio) values ('Tea Leaves - Oolong', '3.84');
insert into producto (nombre, precio) values ('Soup - Campbells Chili', '7.84');
insert into producto (nombre, precio) values ('Oyster - In Shell', '1.35');
insert into producto (nombre, precio) values ('Zucchini - Mini, Green', '8.79');
insert into producto (nombre, precio) values ('Garbage Bags - Clear', '15.17');
insert into producto (nombre, precio) values ('Cafe Royale', '5.81');
insert into producto (nombre, precio) values ('Papadam', '7.05');
insert into producto (nombre, precio) values ('Bagelers - Cinn / Brown Sugar', '8.81');
insert into producto (nombre, precio) values ('Vacuum Bags 12x16', '3.28');
insert into producto (nombre, precio) values ('Wine - Chablis 2003 Champs', '10.47');
insert into producto (nombre, precio) values ('Cattail Hearts', '19.79');
insert into producto (nombre, precio) values ('Appetizer - Escargot Puff', '15.61');
insert into producto (nombre, precio) values ('Butter Balls Salted', '17.93');
insert into producto (nombre, precio) values ('Egg - Salad Premix', '13.85');
insert into producto (nombre, precio) values ('Pants Custom Dry Clean', '13.35');
insert into producto (nombre, precio) values ('Wine - Coteaux Du Tricastin Ac', '8.57');
insert into producto (nombre, precio) values ('Garbag Bags - Black', '4.79');
insert into producto (nombre, precio) values ('Sproutsmustard Cress', '9.25');
insert into producto (nombre, precio) values ('Puree - Strawberry', '16.30');
insert into producto (nombre, precio) values ('Nut - Pecan, Halves', '17.86');
insert into producto (nombre, precio) values ('Cheese - Taleggio D.o.p.', '9.98');
insert into producto (nombre, precio) values ('Vinegar - Red Wine', '10.32');
insert into producto (nombre, precio) values ('Butter - Pod', '10.17');
insert into producto (nombre, precio) values ('Beef Striploin Aaa', '16.76');
insert into producto (nombre, precio) values ('Avocado', '13.87');
insert into producto (nombre, precio) values ('Puff Pastry - Slab', '0.71');
insert into producto (nombre, precio) values ('Vinegar - Balsamic, White', '14.18');
insert into producto (nombre, precio) values ('Chocolate - Milk', '7.77');
insert into producto (nombre, precio) values ('Beef - Ground, Extra Lean, Fresh', '8.52');
insert into producto (nombre, precio) values ('Bok Choy - Baby', '8.97');
insert into producto (nombre, precio) values ('Cheese - Victor Et Berthold', '5.96');
insert into producto (nombre, precio) values ('Wine - Lamancha Do Crianza', '3.74');
insert into producto (nombre, precio) values ('Anchovy Fillets', '12.77');
insert into producto (nombre, precio) values ('Extract - Lemon', '0.54');
insert into producto (nombre, precio) values ('Sunflower Seed Raw', '10.07');
insert into producto (nombre, precio) values ('Sobe - Liz Blizz', '15.34');
insert into producto (nombre, precio) values ('Croissants Thaw And Serve', '10.37');
insert into producto (nombre, precio) values ('Nut - Pecan, Halves', '13.34');
insert into producto (nombre, precio) values ('Jam - Strawberry, 20 Ml Jar', '1.60');
insert into producto (nombre, precio) values ('Steel Wool', '13.26');
insert into producto (nombre, precio) values ('Chinese Foods - Cantonese', '13.38');
insert into producto (nombre, precio) values ('Filter - Coffee', '17.44');
insert into producto (nombre, precio) values ('Pork - Side Ribs', '16.50');
insert into producto (nombre, precio) values ('Chocolate - Sugar Free Semi Choc', '18.47');
insert into producto (nombre, precio) values ('Wine - Sawmill Creek Autumn', '6.79');
insert into producto (nombre, precio) values ('Brandy Cherry - Mcguinness', '1.61');
insert into producto (nombre, precio) values ('Table Cloth 72x144 White', '14.21');
insert into producto (nombre, precio) values ('Tuna - Sushi Grade', '0.35');
insert into producto (nombre, precio) values ('Salsify, Organic', '13.53');
insert into producto (nombre, precio) values ('Blue Curacao - Marie Brizard', '14.46');
insert into producto (nombre, precio) values ('Beets', '16.61');
insert into producto (nombre, precio) values ('Wine - Acient Coast Caberne', '6.84');
insert into producto (nombre, precio) values ('Pasta - Lasagna Noodle, Frozen', '7.47');
insert into producto (nombre, precio) values ('Shiro Miso', '2.52');
insert into producto (nombre, precio) values ('Lamb - Leg, Diced', '15.20');
insert into producto (nombre, precio) values ('Remy Red', '19.37');
insert into producto (nombre, precio) values ('Flour - All Purpose', '16.82');
insert into producto (nombre, precio) values ('Beef - Rib Eye Aaa', '7.00');
insert into producto (nombre, precio) values ('Pasta - Rotini, Colour, Dry', '17.24');
insert into producto (nombre, precio) values ('Veal - Sweetbread', '8.29');
insert into producto (nombre, precio) values ('Muffin Hinge 117n', '4.56');
insert into producto (nombre, precio) values ('Wine - Jafflin Bourgongone', '5.53');
insert into producto (nombre, precio) values ('Crush - Orange, 355ml', '9.20');
insert into producto (nombre, precio) values ('Chocolate - Unsweetened', '12.58');
insert into producto (nombre, precio) values ('Potatoes - Pei 10 Oz', '6.27');
insert into producto (nombre, precio) values ('Salt - Celery', '16.22');
insert into producto (nombre, precio) values ('Sauce Tomato Pouch', '15.81');
insert into producto (nombre, precio) values ('Huck White Towels', '12.56');
insert into producto (nombre, precio) values ('Bread - Bistro White', '8.32');
insert into producto (nombre, precio) values ('Apples - Spartan', '15.84');
insert into producto (nombre, precio) values ('Creme De Menthe Green', '11.08');
insert into producto (nombre, precio) values ('Sour Puss Raspberry', '17.09');
insert into producto (nombre, precio) values ('Tomato - Green', '1.09');
insert into producto (nombre, precio) values ('Syrup - Monin - Passion Fruit', '17.42');
insert into producto (nombre, precio) values ('Sage Ground Wiberg', '12.23');
insert into producto (nombre, precio) values ('Pork - Side Ribs', '9.84');
insert into producto (nombre, precio) values ('Soup - Beef, Base Mix', '1.50');
insert into producto (nombre, precio) values ('Bananas', '6.06');
insert into producto (nombre, precio) values ('Crab - Meat Combo', '3.52');
insert into producto (nombre, precio) values ('Bread - Bistro Sour', '7.87');
insert into producto (nombre, precio) values ('Sauce - Demi Glace', '14.39');
insert into producto (nombre, precio) values ('Halibut - Whole, Fresh', '16.30');
insert into producto (nombre, precio) values ('Beef - Sushi Flat Iron Steak', '2.42');
insert into producto (nombre, precio) values ('Bar Nature Valley', '17.89');
insert into producto (nombre, precio) values ('Apple - Fuji', '16.13');
insert into producto (nombre, precio) values ('Teriyaki Sauce', '11.32');
insert into producto (nombre, precio) values ('Beans - Fava, Canned', '9.33');
insert into producto (nombre, precio) values ('Glass - Wine, Plastic, Clear 5 Oz', '13.76');
insert into producto (nombre, precio) values ('Tarragon - Fresh', '7.26');
insert into producto (nombre, precio) values ('Flour - Strong Pizza', '15.42');
insert into producto (nombre, precio) values ('Table Cloth 54x72 Colour', '9.32');
insert into producto (nombre, precio) values ('Eggs - Extra Large', '6.38');
insert into producto (nombre, precio) values ('Cookie - Oatmeal', '18.11');
insert into producto (nombre, precio) values ('Shopper Bag - S - 4', '5.17');
insert into producto (nombre, precio) values ('Maple Syrup', '5.74');
insert into producto (nombre, precio) values ('Garlic Powder', '15.30');
insert into producto (nombre, precio) values ('Flavouring - Orange', '1.70');
insert into producto (nombre, precio) values ('Syrup - Monin - Blue Curacao', '5.68');
insert into producto (nombre, precio) values ('Shrimp - 16/20, Peeled Deviened', '19.46');
insert into producto (nombre, precio) values ('Puff Pastry - Sheets', '9.69');
insert into producto (nombre, precio) values ('Flour - Buckwheat, Dark', '16.66');
insert into producto (nombre, precio) values ('Wine - Acient Coast Caberne', '0.10');
insert into producto (nombre, precio) values ('Beer - Steamwhistle', '9.09');
insert into producto (nombre, precio) values ('Beer - Mcauslan Apricot', '14.37');
insert into producto (nombre, precio) values ('Bar Special K', '15.58');
insert into producto (nombre, precio) values ('Chicken Thigh - Bone Out', '11.33');
insert into producto (nombre, precio) values ('Pepper - Scotch Bonnet', '14.51');
insert into producto (nombre, precio) values ('Sprouts - Baby Pea Tendrils', '11.61');
insert into producto (nombre, precio) values ('Lamb - Shanks', '5.89');
insert into producto (nombre, precio) values ('Trueblue - Blueberry', '12.57');
insert into producto (nombre, precio) values ('Cream - 10%', '15.99');
insert into producto (nombre, precio) values ('Pur Value', '8.33');
insert into producto (nombre, precio) values ('Soup - Campbells, Lentil', '14.44');
insert into producto (nombre, precio) values ('Wine - Chateau Bonnet', '10.60');
insert into producto (nombre, precio) values ('Chicken Breast Halal', '6.51');
insert into producto (nombre, precio) values ('Flower - Daisies', '2.55');
insert into producto (nombre, precio) values ('Pasta - Shells, Medium, Dry', '6.36');
insert into producto (nombre, precio) values ('Bread - Onion Focaccia', '11.71');
insert into producto (nombre, precio) values ('Oil - Olive, Extra Virgin', '18.35');
insert into producto (nombre, precio) values ('Flour - So Mix Cake White', '5.08');
insert into producto (nombre, precio) values ('Rabbit - Saddles', '5.02');
insert into producto (nombre, precio) values ('Pate - Liver', '11.58');
insert into producto (nombre, precio) values ('Longos - Chicken Caeser Salad', '9.44');
insert into producto (nombre, precio) values ('Mace Ground', '3.76');
insert into producto (nombre, precio) values ('Bread Base - Toscano', '12.79');
insert into producto (nombre, precio) values ('Wine - Stoneliegh Sauvignon', '10.12');
insert into producto (nombre, precio) values ('Beans - Long, Chinese', '18.46');
insert into producto (nombre, precio) values ('Syrup - Pancake', '3.35');
insert into producto (nombre, precio) values ('Yucca', '17.80');
insert into producto (nombre, precio) values ('Cream Of Tartar', '12.34');
insert into producto (nombre, precio) values ('Icecream Bar - Del Monte', '1.15');
insert into producto (nombre, precio) values ('Juice - Grapefruit, 341 Ml', '15.36');
insert into producto (nombre, precio) values ('Sour Cream', '17.25');
insert into producto (nombre, precio) values ('Rhubarb', '15.97');
insert into producto (nombre, precio) values ('Carbonated Water - Cherry', '1.32');
insert into producto (nombre, precio) values ('Sauce - Roasted Red Pepper', '7.08');
insert into producto (nombre, precio) values ('Syrup - Pancake', '15.02');
insert into producto (nombre, precio) values ('Rabbit - Whole', '18.09');
insert into producto (nombre, precio) values ('Pepper - Green, Chili', '1.17');
insert into producto (nombre, precio) values ('Steampan - Half Size Shallow', '11.35');
insert into producto (nombre, precio) values ('Garlic Powder', '16.35');
insert into producto (nombre, precio) values ('Cinnamon - Stick', '0.31');
insert into producto (nombre, precio) values ('Spic And Span All Purpose', '16.45');
insert into producto (nombre, precio) values ('Turkey - Breast, Double', '5.17');
insert into producto (nombre, precio) values ('Tart Shells - Savory, 4', '15.86');
insert into producto (nombre, precio) values ('Salt - Sea', '6.67');
insert into producto (nombre, precio) values ('Appetizer - Assorted Box', '6.71');
insert into producto (nombre, precio) values ('Tea - Herbal I Love Lemon', '6.39');
insert into producto (nombre, precio) values ('Blackberries', '14.88');
insert into producto (nombre, precio) values ('Water - Perrier', '0.56');
insert into producto (nombre, precio) values ('Jam - Strawberry, 20 Ml Jar', '0.89');
insert into producto (nombre, precio) values ('Bagel - Whole White Sesame', '8.41');
insert into producto (nombre, precio) values ('Cookie Dough - Chunky', '11.07');
insert into producto (nombre, precio) values ('Salt - Table', '15.59');
insert into producto (nombre, precio) values ('Sole - Dover, Whole, Fresh', '14.79');
insert into producto (nombre, precio) values ('Bar - Sweet And Salty Chocolate', '1.45');
insert into producto (nombre, precio) values ('Sauce - Ranch Dressing', '4.82');
insert into producto (nombre, precio) values ('Bar Mix - Pina Colada, 355 Ml', '2.47');
insert into producto (nombre, precio) values ('Flour - Buckwheat, Dark', '4.30');
insert into producto (nombre, precio) values ('Sprouts - Alfalfa', '2.39');
insert into producto (nombre, precio) values ('Sauce - White, Mix', '16.49');
insert into producto (nombre, precio) values ('Waffle Stix', '11.34');
insert into producto (nombre, precio) values ('Compound - Mocha', '16.23');
insert into producto (nombre, precio) values ('Vermouth - White, Cinzano', '2.43');
insert into producto (nombre, precio) values ('Kaffir Lime Leaves', '6.61');
insert into producto (nombre, precio) values ('Soup - Clam Chowder, Dry Mix', '11.50');
insert into producto (nombre, precio) values ('Sponge Cake Mix - Chocolate', '9.89');
insert into producto (nombre, precio) values ('Skewers - Bamboo', '9.44');
insert into producto (nombre, precio) values ('Watercress', '3.44');
insert into producto (nombre, precio) values ('Bouillion - Fish', '13.81');
insert into producto (nombre, precio) values ('Pork - Smoked Kassler', '1.87');
insert into producto (nombre, precio) values ('Pepper - White, Ground', '4.11');
insert into producto (nombre, precio) values ('Appetizer - Sausage Rolls', '1.24');
insert into producto (nombre, precio) values ('Wine - Red, Gamay Noir', '17.92');
insert into producto (nombre, precio) values ('Truffle Cups - Brown', '3.60');
insert into producto (nombre, precio) values ('Ecolab - Medallion', '2.50');
insert into producto (nombre, precio) values ('Rosemary - Fresh', '4.18');
insert into producto (nombre, precio) values ('Molasses - Fancy', '2.64');
insert into producto (nombre, precio) values ('Ginger - Crystalized', '0.07');
insert into producto (nombre, precio) values ('Gatorade - Fruit Punch', '1.10');
insert into producto (nombre, precio) values ('Yogurt - Peach, 175 Gr', '7.25');
insert into producto (nombre, precio) values ('Pastry - Key Limepoppy Seed Tea', '7.56');
insert into producto (nombre, precio) values ('Sprouts - Pea', '18.47');
insert into producto (nombre, precio) values ('Flounder - Fresh', '3.97');
insert into producto (nombre, precio) values ('Tuna - Bluefin', '5.94');
insert into producto (nombre, precio) values ('Mustard Prepared', '16.41');
insert into producto (nombre, precio) values ('Bread - Multigrain', '12.58');
insert into producto (nombre, precio) values ('Wasabi Paste', '15.16');
insert into producto (nombre, precio) values ('Potatoes - Parissienne', '14.24');
insert into producto (nombre, precio) values ('Sole - Fillet', '9.00');
insert into producto (nombre, precio) values ('Chevere Logs', '9.59');
insert into producto (nombre, precio) values ('Crackers - Water', '2.00');
insert into producto (nombre, precio) values ('Pork - Back Ribs', '12.88');
insert into producto (nombre, precio) values ('V8 - Berry Blend', '14.35');
insert into producto (nombre, precio) values ('Wine - White, Ej Gallo', '9.78');
insert into producto (nombre, precio) values ('Cheese - Roquefort Pappillon', '8.53');
insert into producto (nombre, precio) values ('Cheese - Shred Cheddar / Mozza', '17.09');
insert into producto (nombre, precio) values ('Beets - Mini Golden', '7.30');
insert into producto (nombre, precio) values ('Lentils - Red, Dry', '2.68');
insert into producto (nombre, precio) values ('Tomatillo', '16.24');
insert into producto (nombre, precio) values ('Cheese - Pied De Vents', '5.80');
insert into producto (nombre, precio) values ('Vermouth - White, Cinzano', '15.47');
insert into producto (nombre, precio) values ('Beets', '5.66');
insert into producto (nombre, precio) values ('Peppercorns - Pink', '19.50');
insert into producto (nombre, precio) values ('Soup - Campbells, Spinach Crm', '11.40');
insert into producto (nombre, precio) values ('Pectin', '10.64');
insert into producto (nombre, precio) values ('Berry Brulee', '9.45');
insert into producto (nombre, precio) values ('Shichimi Togarashi Peppeers', '11.42');
insert into producto (nombre, precio) values ('Wine - White, Chardonnay', '15.00');
insert into producto (nombre, precio) values ('Cheese - Wine', '3.81');
insert into producto (nombre, precio) values ('Bread - Raisin Walnut Pull', '5.50');
insert into producto (nombre, precio) values ('Kellogs Raisan Bran Bars', '11.17');
insert into producto (nombre, precio) values ('Chips Potato All Dressed - 43g', '15.74');
insert into producto (nombre, precio) values ('Lamb - Shoulder', '10.40');
insert into producto (nombre, precio) values ('Vinegar - White Wine', '17.83');
insert into producto (nombre, precio) values ('Food Colouring - Pink', '14.54');
insert into producto (nombre, precio) values ('Crab - Back Fin Meat, Canned', '8.61');
insert into producto (nombre, precio) values ('Wine - German Riesling', '16.83');
insert into producto (nombre, precio) values ('Leeks - Large', '16.97');
insert into producto (nombre, precio) values ('Tea - Vanilla Chai', '6.49');
insert into producto (nombre, precio) values ('Cookie Dough - Oatmeal Rasin', '4.68');
insert into producto (nombre, precio) values ('Bay Leaf', '7.54');
insert into producto (nombre, precio) values ('Pails With Lids', '8.59');
insert into producto (nombre, precio) values ('Island Oasis - Mango Daiquiri', '13.52');
insert into producto (nombre, precio) values ('Jicama', '14.14');
insert into producto (nombre, precio) values ('Tea - Mint', '8.01');
insert into producto (nombre, precio) values ('Beef - Diced', '11.12');
insert into producto (nombre, precio) values ('Cake Sheet Combo Party Pack', '2.41');
insert into producto (nombre, precio) values ('Nori Sea Weed - Gold Label', '15.18');
insert into producto (nombre, precio) values ('Tarts Assorted', '13.01');
insert into producto (nombre, precio) values ('Napkin White - Starched', '6.95');
insert into producto (nombre, precio) values ('Beer - True North Strong Ale', '1.79');
insert into producto (nombre, precio) values ('Wine - Wyndham Estate Bin 777', '1.41');
insert into producto (nombre, precio) values ('Molasses - Fancy', '13.16');
insert into producto (nombre, precio) values ('Barley - Pearl', '12.25');
insert into producto (nombre, precio) values ('Mushrooms - Honey', '18.44');
insert into producto (nombre, precio) values ('Hog / Sausage Casing - Pork', '12.45');
