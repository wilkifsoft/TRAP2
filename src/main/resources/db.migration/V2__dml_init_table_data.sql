INSERT INTO departement(CODE, NAME)
VALUES ('A0001', 'Artibonite'),
       ('C0002', 'Centre'),
       ('GA0003', 'Grand-Anse'),
       ('N0004', 'Nippes'),
       ('N0005', 'Nord'),
       ('NE0006', 'Nord-Est'),
       ('NO0007', 'Nord-Ouest'),
       ('O0008', 'Ouest'),
       ('S0009', 'Sud'),
       ('SE0000', 'Sud-Est');

INSERT INTO arrondissement (CODE, NAME, DEPARTMENT)
VALUES
/*ARTIBONITE Arrondissement*/
    ('DE1001', 'Dessalines', 'A0001'),
    ('GE1002', 'Gonaïves', 'A0001'),
    ('GM1003', 'Gros-Morne', 'A0001'),
    ('M1004', 'Marmelade', 'A0001'),
    ('SM1005', 'Saint-Marc', 'A0001'),
/*CENTRE Arrondissement*/
    ('CS2001', 'Cerca-la-Source', 'C0002'),
    ('H2002', 'Hinche', 'C0002'),
    ('L2003', 'Lascahobas', 'C0002'),
    ('M2004', 'Mirebalais', 'C0002'),
/*Grand-Anse Arrondissement*/
    ('AH2001', 'Anse dHainault', 'GA0003'),
    ('C2002', 'Corail', 'GA0003'),
    ('J2003', 'Jérémie', 'GA0003'),
/*NIPPES Arrondissement*/
    ('AV3001', 'Anse-à-Veau', 'N0004'),
    ('B3002', 'Baradères', 'N0004'),
    ('M3003', 'Miragoâne', 'N0004'),
/*Nord Arrondissement*/
    ('AN4001', 'Acul-du-Nord', 'N0005'),
    ('B4002', 'Borgne', 'N0005'),
    ('CH4003', 'Cap-Haïtien', 'N0005'),
    ('GRN4004', 'Grande-Rivière-du-Nord', 'N0005'),
    ('L4005', 'Limbé', 'N0005'),
    ('P4006', 'Plaisance', 'N0005'),
    ('SR4007', 'Saint-Raphaël', 'N0005'),
/*Nord-Est Arrondissement*/
    ('FL5001', 'Fort-Liberté', 'NE0006'),
    ('O5002', 'Ouanaminthe', 'NE0006'),
    ('TR5003', 'Trou-du-Nord', 'NE0006'),
    ('V5004', 'Vallières', 'NE0006'),
/*Nord-Ouest Arrondissement*/
    ('PP6001', 'Port-de-Paix', 'NO0007'),
    ('SLN5002', 'Saint-Louis-du-Nord', 'NO0007'),
/*Ouest Arrondissement*/
    ('CB7001', 'Croix-des-Bouquets', 'O0008'),
    ('G7002', 'Gonâve', 'O0008'),
    ('L7003', 'Léogâne', 'O0008'),
    ('PP7004', 'Port-au-Prince', 'O0008'),
    ('A7005', 'Arcahaie', 'O0008'),
/*SUD Arrondissement*/
    ('A8001', 'Aquin', 'S0009'),
    ('C8002', 'Chardonnières', 'S0009'),
    ('C8003', 'Côteaux', 'S0009'),
    ('LC8004', 'Les Cayes', 'S0009'),
    ('PS8005', 'Port-Salut', 'S0009'),
/*Sud-Est Arrondissement*/
    ('B9001', 'Bainet', 'SE0000'),
    ('BA9002', 'Belle-Anse', 'SE0000'),
    ('J003', 'Jacmel', 'SE0000');

INSERT INTO commune (CODE, NAME, ARRONDISSEMENT)
VALUES ('D10001', 'Dessalines', 'DE1001'),
       ('D10002', 'Desdunes', 'DE1001'),
       ('GS10003', 'Grande-Saline', 'DE1001'),
       ('PRA10004', 'Petite Rivière de  lArtibonite', 'DE1001'),
/*Gonaives Communes*/
       ('G11001', 'Gonaïves', 'GE1002'),
       ('E11002', 'Ennery', 'GE1002'),
       ('L11003', 'L''Estère', 'GE1002'),
/*Gros-Morne Communes*/
       ('GM12001', 'Gros-Morne', 'GM1003'),
       ('AR12002', 'Anse-Rouge', 'GM1003'),
       ('TR12003', 'Terre-Neuve', 'GM1003'),
/*Marmelade Communes*/
       ('M13001', 'Marmelade', 'M1004'),
       ('SMA13002', 'Saint-Michel-de-l''Atalaye', 'M1004'),
/*Saint-Marc Communes*/
       ('SM14001', 'Saint-Marc', 'SM1005'),
       ('LC14002', 'La Chapelle', 'SM1005'),
       ('L14003', 'Liancourt', 'SM1005'),
       ('V14004', 'Verrettes', 'SM1005'),
       ('M14005', 'Montrouis', 'SM1005'),
/*Cerca-la-Source Communes*/
       ('CC15001', 'Cerca-la-Source', 'CS2001'),
       ('T15002', 'Thomassique', 'CS2001'),
/*Hinche Communes*/
       ('H16001', 'Hinche', 'H2002'),
       ('CC16002', 'Cerca-Carvajal', 'H2002'),
       ('M16003', 'Maïssade', 'H2002'),
       ('T16004', 'Thomonde', 'H2002'),
/*Lascahobas Communes*/
       ('L17001', 'Lascahobas', 'L2003'),
       ('L17002', 'Baptiste', 'L2003'),
       ('L17003', 'Belladère', 'L2003'),
       ('L17004', 'Savanette', 'L2003'),
/*Mirebalais Communes*/
       ('M18001', 'Mirebalais', 'M2004'),
       ('M18002', 'Boucan-Carré', 'M2004'),
       ('M18003', 'Saut-d''Eau', 'M2004'),
/*Grand-Anse Communes*/
       ('AH19001', 'Anse dHainault', 'AH2001'),
       ('AH19002', 'Dame-Marie', 'AH2001'),
       ('AH19003', 'Les Irois', 'AH2001'),
/*Corail Communes*/
       ('C20001', 'Corail', 'C2002'),
       ('B20002', 'JBeaumont', 'C2002'),
       ('P20003', 'Pestel', 'C2002'),
       ('R20004', 'Roseaux', 'C2002'),
/*Corail Communes*/
       ('J21001', 'Jérémie', 'J2003'),
       ('A21002', 'Abricots', 'J2003'),
       ('B21003', 'Bonbon', 'J2003'),
       ('C21004', 'Chambellan', 'J2003'),
       ('M21005', 'Marfranc', 'J2003'),
       ('M21006', 'Moron', 'J2003'),
/*Anse-à-Veau Communes*/
       ('AV22001', 'Anse-à-Veau', 'AV3001'),
       ('A22002', 'Arnaud', 'AV3001'),
       ('A22003', 'L''Asile', 'AV3001'),
       ('PTN22003', 'Petit-Trou-de-Nippes', 'AV3001'),
       ('PS22004', 'Plaisance-du-Sud', 'AV3001'),
/*Baradères Communes*/
       ('B23001', 'Baradères', 'B3002'),
       ('B23002', 'Grand-Boucan', 'B3002'),
/*Miragoâne Communes*/
       ('M24001', 'Miragoâne', 'M3003'),
       ('FN24002', 'Fonds-des-Nègres', 'M3003'),
       ('P24003', 'Paillant', 'M3003'),
       ('PRN24004', 'Petite-Rivière-de-Nippes', 'M3003'),
/*Acul-du-Nord Communes*/
       ('AN25001', 'Acul-du-Nord', 'AN4001'),
       ('M25001', 'Milot', 'AN4001'),
       ('PN25001', 'Plaine-du-Nord', 'AN4001'),
/*Borgne Communes*/
       ('B26001', 'Borgne', 'B4002'),
       ('PM26002', 'Port-Margot', 'B4002'),
/*Cap-Haïtien Communes*/
       ('CH27001', 'Cap-Haïtien', 'CH4003'),
       ('L27001', 'Limonade', 'CH4003'),
       ('QM27001', 'Quartier-Morin', 'CH4003'),
/*Grande-Rivière-du-Nord Communes*/
       ('GRN27001', 'Grande-Rivière-du-Nord', 'GRN4004'),
       ('B27002', 'Bahon', 'GRN4004'),
/*Limbé Communes*/
       ('L28001', 'Limbé', 'L4005'),
       ('BL28002', 'Bas-Limbé', 'L4005'),
/*Plaisance Communes*/
       ('P29001', 'Plaisance', 'P4006'),
       ('P29002', 'Pilate', 'P4006'),
/*Saint-Raphaël Communes*/
       ('SR30001', 'Saint-Raphaël', 'SR4007'),
       ('D30002', 'Dondon', 'SR4007'),
       ('LV30003', 'La Victoire', 'SR4007'),
       ('P30003', 'Pignon', 'SR4007'),
       ('R30003', 'Ranquitte', 'SR4007'),
/*Fort-Liberté Communes*/
       ('FL31001', 'Fort-Liberté', 'FL5001'),
       ('P31002', 'Perches', 'FL5001'),
       ('F31003', 'Ferrier', 'FL5001'),
/*Ouanaminthe Communes*/
       ('O32001', 'Ouanaminthe', 'O5002'),
       ('C32002', 'Capotille', 'O5002'),
       ('MO32003', 'Mont-Organisé', 'O5002'),
/*Trou-du-Nord Communes*/
       ('TR33001', 'Trou-du-Nord', 'TR5003'),
       ('C33002', 'Caracol', 'TR5003'),
       ('SZ33003', 'Sainte-Suzanne', 'TR5003'),
       ('GBTR33004', 'Grand-Bassin et Terrier-Rouge', 'TR5003'),
/*Vallières Communes*/
       ('V34001', 'Vallières', 'V5004'),
       ('C34002', 'Carice', 'V5004'),
       ('MC34003', 'Mombin-Crochu', 'V5004'),
/*Port-de-Paix Communes*/
       ('P35001', 'Port-de-Paix', 'PP6001'),
       ('BB35002', 'Bassin-Bleu', 'PP6001'),
       ('C35003', 'Chansolme', 'PP6001'),
       ('L35004', 'Lapointe', 'PP6001'),
       ('LT35005', 'La Tortue', 'PP6001'),
/*Saint-Louis-du-Nord Communes */
       ('SLN36001', 'Saint-Louis-du-Nord', 'SLN5002'),
       ('AF36002', 'Anse-à-Foleur', 'SLN5002'),
/*Croix-des-Bouquets Communes */
       ('CB37001', 'Croix-des-Bouquets', 'CB7001'),
       ('C37002', 'Cornillon', 'CB7001'),
       ('FV37003', 'Fonds-Verrettes', 'CB7001'),
       ('G37004', 'Ganthier', 'CB7001'),
       ('T37005', 'Thomazeau', 'CB7001'),
/*Gonâve Communes */
       ('AG38001', 'Anse-à-Galets', 'G7002'),
       ('PR38002', 'Pointe-à-Raquette', 'G7002'),
/*Léogâne Communes */
       ('L39001', 'Léogâne', 'L7003'),
       ('GG39002', 'Grand-Goâve', 'L7003'),
       ('PG39003', 'Petit-Goâve', 'L7003'),
/*Port-au-Prince Communes */
       ('PP40001', 'Port-au-Prince', 'PP7004'),
       ('C49002', 'Carrefour', 'PP7004'),
       ('CS49003', 'Cité Soleil', 'PP7004'),
       ('D49004', 'Delmas', 'PP7004'),
       ('G49005', 'Gressier', 'PP7004'),
       ('K49006', 'Kenscoff', 'PP7004'),
       ('PV49007', 'Pétion-Ville', 'PP7004'),
       ('T49008', 'Tabarre', 'PP7004'),
/*Arcahaie Communes */
       ('A50001', 'Arcahaie', 'A7005'),
       ('C50002', 'Cabaret', 'A7005'),
/*Aquin Communes */
       ('A51001', 'Aquin', 'A8001'),
       ('C51002', 'Cavaillon', 'A8001'),
       ('SLS51003', 'Saint-Louis-du-Sud', 'A8001'),
       ('FB51004', 'Fond des Blancs', 'A8001'),
/*Chardonnières Communes */
       ('C52001', 'Chardonnières', 'C8002'),
       ('LA52002', 'Les Anglais', 'C8002'),
       ('T52003', 'Tiburon', 'C8002'),
/*Côteaux Communes */
       ('C53001', 'Côteaux', 'C8003'),
       ('PP53002', 'Port-à-Piment', 'C8003'),
       ('RB53003', 'Roche-à-Bateaux', 'C8003'),
/*Cayes Communes */
       ('L54001', 'Les Cayes', 'LC8004'),
       ('CP54002', 'Camp-Perrin', 'LC8004'),
       ('C54003', 'Chantal', 'LC8004'),
       ('IV54004', 'Île-à-Vache', 'LC8004'),
       ('M54005', 'Maniche', 'LC8004'),
       ('T54006', 'Torbeck', 'LC8004'),
/*Port-Salut Communes */
       ('PS55001', 'Port-Salut', 'PS8005'),
       ('A55002', 'Arniquet', 'PS8005'),
       ('SJS55003', 'Saint-Jean-du-Sud', 'PS8005'),
/*Bainet Communes */
       ('B56001', 'Bainet', 'B9001'),
       ('CF56002', 'Côtes-de-Fer', 'B9001'),
/*Belle-Anse Communes */
       ('BA57001', 'Belle-Anse', 'BA9002'),
       ('AA57002', 'Anse-à-Pitres', 'BA9002'),
       ('GG57003', 'Grand-Gosier', 'BA9002'),
       ('T57004', 'Thiotte', 'BA9002'),
/*Jacmel Communes */
       ('J58001', 'Jacmel', 'J003'),
       ('CJ58002', 'Cayes-Jacmel', 'J003'),
       ('LV58003', 'La Vallée', 'J003'),
       ('M58004', 'Marigot', 'J003');


INSERT INTO sectioncommunale(CODE, NAME, COMMUNE)
VALUES
    /*Acul-du-Nord Section Communale*/
    ('CL59001', '1ère Sect. Camp Louise','AN25001'),
    ('BL59002', '2ème Sect. Bas de lAcul (Bassse Plaine)','AN25001'),
    ('M59003', '3ème Sect. Mornet','AN25001'),
    ('GR59004', '4ème Sect. Grande Ravine','AN25001'),
    ('CD59005', '5ème Sect. Coupe à David','AN25001'),
    ('S59006', '6ème Sect. Soufrière','AN25001'),
/*Borgne Section Communale*/
    ('M60001', '1ère Sect. Margot','B26001'),
    ('BM60002', '2ème Sect. Boucan Michel','B26001'),
    ('PBB60003', '3ème Sect. Petit Bourg de Borgne','B26001'),
    ('TE60004', '4ème Sect. Trou dEnfer','B26001'),
    ('C60005', '5ème Sect. Champagne','B26001'),
    ('M60006', '6ème Sect. Molas','B26001'),
    ('CFL60007', '7ème Sect. Côtes de Fer et Lagrange','B26001'),
/*Cap-Haïtien Section Communale*/
    ('BN61001', '1ère Sect. Bande du Nord','CH27001'),
    ('HC61002', '2ème Sect. Haut du Cap','CH27001'),
/*Grande-Rivière-du-Nord Section Communale*/
    ('GG62001', '1ère Sect. Grand Gilles','GRN27001'),
    ('S62002', '2ème Sect. Solon','GRN27001'),
    ('C62003', '3ème Sect. Carac','GRN27001'),
    ('G62004', '4ème Sect. Gambade','GRN27001'),
    ('JT62005', '5ème Sect. Joli trou','GRN27001'),
    ('C620016', '6ème Sect. Cormiers','GRN27001'),
/*Limbé Section Communale*/
    ('LAJ63001', '1ère Sect. Haut Limbé ou Acul Jeanot','GRN27001'),
    ('C630012', '2ème Sect. Chabotte','GRN27001'),
    ('CC63003', '3ème Sect. Camp Coq','GRN27001'),
    ('S63004', '4ème Sect. Soufrière','GRN27001'),
    ('RD63005', '5ème Sect. Ravine Desroches','GRN27001'),
    ('IC63006', '6ème Sect. Ilot à Corne','GRN27001'),
/*Plaisance Section Communale*/
    ('GCG64001', '1ère Sect. Gobert ou Colline Gobert','P29001'),
    ('C640012', '2ème Sect. Champagne','P29001'),
    ('HM64003', '3ème Sect. Haut Martineau','P29001'),
    ('M64004', '4ème Sect. Mapou','P29001'),
    ('LT64005', '5ème Sect. La Trouble','P29001'),
    ('LV64006', '6ème Sect. La Ville','P29001'),
    ('B64007', '7ème Sect. Bassin','P29001'),
    ('GR64008', '8ème Grande Rivière','P29001'),
/*Saint-Raphaël Section Communale*/
    ('BN65001', '1ère Sect. Bois Neuf','SR30001'),
    ('M65002', '2ème Sect. Mathurin','SR30001'),
    ('B65003', '3ème Sect. Bouyaha','SR30001'),
    ('SY65004', '4ème Sect. San Yago','SR30001'),
/*Plaine-du-Nord Section Communale*/
    ('MR66001', '1ère Sect. Morne Rouge', 'PN25001'),
    ('BP66002', '2ème Sect. Basse Plaine', 'PN25001'),
    ('GB66003', '3ème Sect. Grand Boucan', 'PN25001'),
    ('BD66004', '4ème Sect. Bassin Diamant', 'PN25001'),
/*Quartier-Morin Section Communale*/
    ('BP67001', '1ère Sect. Basse Plaine', 'QM27001'),
    ('MP67002', '3ème Sect. Morne Pelé', 'QM27001'),
/*Bahon Section Communale*/
    ('BP68001', '1ère Sect. de Bois Pin', 'B27002'),
    ('MN68002', '3ème Sect. Montagne Noire', 'B27002'),
    ('B68003', '2ème Sect. Bailla ou Bailly', 'B27002'),
/*Pilate Section Communale*/
    ('B69001', '1ère Sect. Ballon', 'P29002'),
    ('B69002', '2ème Sect. Baudin', 'P29002'),
    ('RT69003', '3ème Sect. Ravine Trompette', 'P29002'),
    ('J69004', '4ème Sect. Joly', 'P29002'),
    ('D69005', '5ème Sect. Dubourg', 'P29002'),
    ('P69006', '6ème Sect. Piment', 'P29002'),
    ('RL69007', '7ème Sect. Rivière Laporte', 'P29002'),
    ('M69008', '8ème Sect. Margot', 'P29002'),
/*Pignon Section Communale*/
    ('S70001', '1ère Sect. de Savannette', 'P30003'),
    ('LBM70002', '2ème Sect. La Belle Mère', 'P30003'),
/*Ranquitte Section Communale*/
    ('BC71001', '1ère Sect. de Bac à Soude', 'R30003'),
    ('C71002', '3ème Sect. Cracaraille', 'R30003'),
    ('BL71003', '2ème Sect. Bois de Lance', 'R30003'),
/*Limonade Section Communale*/
    ('BP72001', '1ère Sect. Basse Plaine', 'L27001'),
    ('BL72002', '2ème Sect. Bois de Lance', 'L27001'),
    ('R72003', '3ème Sect. Roucou', 'L27001'),
/*Port-Margot Section Communale*/
    ('GP73001', '1ère Sect. de Grande Plaine', 'PM26002'),
    ('BPB73002', '2ème Sect. Bas Petit Borgne', 'PM26002'),
    ('C73003', '3ème Sect. de Corail', 'PM26002'),
    ('HPB73004', '4ème Sect. Haut Petit Borgne', 'PM26002'),
    ('BQ73005', '5ème Sect. Bas Quartier', 'PM26002'),
    ('BG73006', '6ème Sect. Bras Gauche', 'PM26002'),
/*Dondon Section Communale*/
    ('B74001', '1ère Sect. Brostage', 'D30002'),
    ('BC74002', '2ème Sect. Bassin Caïman', 'D30002'),
    ('M74003', '3ème Sect. Matador', 'D30002'),
    ('L740014', '4ème Sect. Laguille', 'D30002'),
    ('HT74005', '5ème Sect. Haut du Trou', 'D30002'),
/*Milot Section Communale*/
    ('PB75001', '1ère Sect. Perches de Bonnet', 'M25001'),
    ('BE75002', '2ème Sect. Bonnet à lEvèque', 'M25001'),
    ('G75003', '3ème Sect. Génipailler', 'M25001'),
/*Bas-Limbé Section Communale*/
    ('GC76001', '1ère Sect. Garde Champètre (Bas Limbé)', 'BL28002'),
    ('PH76002', '2ème Sect. Petit Howars (La Fange', 'BL28002');
/*Dessalines Section communales
('V59001', 'Villard', 'DE1001'),
('FN59002', 'Fosse Naboth (ou Duvallon)', 'DE1001'),
('O59003', 'Ogé', 'DE1001'),
('PP59004', 'Poste Pierrot', 'DE1001'),
('F59005', 'Fiéfé (ou Petit Cahos)', 'DE1001'),
('LC59006', 'La Croix (ou Grand Cahos)', 'DE1001'),
/*Gonaïves Section communales*/
('GE1002', 'Gonaïves', 'GE1002'),*/


