-- ---------------------------------------------------------------------------------------------------------------------
-- Information table about car
-- ---------------------------------------------------------------------------------------------------------------------
CREATE TABLE car
(
    id                   integer (11)           NOT NULL AUTO_INCREMENT,
    brand                varchar(45)            DEFAULT NULL,
    model                varchar(45)            DEFAULT NULL,
    color                varchar(45)            DEFAULT NULL,
    power                integer(11)            DEFAULT NULL,
    year_of_manufacture  integer(4)             DEFAULT NULL,
    vin_number           varchar(45)            DEFAULT NULL,
    PRIMARY KEY (id)
);

COMMENT ON TABLE car IS 'Information about car (id, brand, model, etc.)';

INSERT INTO car (id, brand, model, color, power, year_of_manufacture, vin_number)
VALUES (6,'Mazda','3','blue',105,2005,'JMZCU08B21KM39032'),
(7,'Volvo','S60','green',250,2001,'YV4492DZ4A1029421'),
(8,'Ford','Mondeo','silver',130,2009,'WF05ZXGCD17E75243'),
(9,'Alfa Romeo','Brera','red',150,2006,'ZAR83202001173832'),
(10,'BMW','E46','blue',231,2003,'WBAPX81020CU59571'),
(11,'Nissan','Almera','green',90,2004,'SJNFFAJ12U2631414'),
(12,'Opel','Astra','silver',100,2002,'W0LGD5EY5B1014357'),
(13,'Audi','A4','black',140,2004,'WAUZZZ8K09B089377'),
(14,'Subaru','Impreza','blue',290,2003,'JF1GP3LC1DG052738'),
(15,'Kia','Picanto','white',82,2009,'KNAHU815AE7049218'),
(16,'Seat','Ibiza','yellow',104,1999,'VSSZXZ5FZJR117828');