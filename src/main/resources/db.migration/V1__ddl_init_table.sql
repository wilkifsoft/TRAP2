CREATE TABLE IF NOT EXISTS `departement`
(
    `CODE` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `NAME` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`CODE`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;



CREATE TABLE IF NOT EXISTS `arrondissement`
(
    `CODE`       varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `NAME`       varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `DEPARTMENT` varchar(20) COLLATE utf8mb4_general_ci  DEFAULT NULL,
    PRIMARY KEY (`CODE`),
    KEY `FKmuneap29gi8s5r2b98vxic2nf` (`DEPARTMENT`),
    CONSTRAINT `FKmuneap29gi8s5r2b98vxic2nf` FOREIGN KEY (`DEPARTMENT`) REFERENCES `departement` (`CODE`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;


CREATE TABLE IF NOT EXISTS `commune`
(
    `CODE`           varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `NAME`           varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `ARRONDISSEMENT` varchar(20) COLLATE utf8mb4_general_ci  DEFAULT NULL,
    PRIMARY KEY (`CODE`),
    KEY `FK542ldhugi6ulxq98xrfwhnfvy` (`ARRONDISSEMENT`),
    CONSTRAINT `FK542ldhugi6ulxq98xrfwhnfvy` FOREIGN KEY (`ARRONDISSEMENT`) REFERENCES `arrondissement` (`CODE`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;


CREATE TABLE IF NOT EXISTS `sectioncommunale`
(
    `CODE`    varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
    `NAME`    varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `COMMUNE` varchar(20) COLLATE utf8mb4_general_ci  DEFAULT NULL,
    PRIMARY KEY (`CODE`),
    KEY `FK2qr8b2lnp4d40mffareoknmsy` (`COMMUNE`),
    CONSTRAINT `FK2qr8b2lnp4d40mffareoknmsy` FOREIGN KEY (`COMMUNE`) REFERENCES `commune` (`CODE`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;


CREATE TABLE IF NOT EXISTS `category`
(
    `ID`   bigint NOT NULL AUTO_INCREMENT,
    `NAME` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `shop`
(
    `ID`                 bigint NOT NULL AUTO_INCREMENT,
    `CREATED_BY`         varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
    `CREATED_DATE`       datetime(6)                             DEFAULT NULL,
    `LAST_MODIFIED_BY`   varchar(50) COLLATE utf8mb4_general_ci  DEFAULT NULL,
    `LAST_MODIFIED_DATE` datetime(6)                             DEFAULT NULL,
    `DESCRIPTION`        varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `EMAIL`              varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `IMAGE_PATH`         varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `LOGO`               varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `NAME`               varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `SELLER_EMAIL`       varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `WEB_SITE`           varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `STATUS`             tinyint                                 DEFAULT NULL,
    `TELEPHONE`          varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `CATEGORY`           bigint                                  DEFAULT NULL,
    PRIMARY KEY (`ID`),
    KEY `FK5sn76htq0c7y9cwlgrt7onggq` (`CATEGORY`),
    CONSTRAINT `FK5sn76htq0c7y9cwlgrt7onggq` FOREIGN KEY (`CATEGORY`) REFERENCES `category` (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;


-- Dumping structure for table shop.branches
CREATE TABLE IF NOT EXISTS `branches`
(
    `ID`                 bigint NOT NULL AUTO_INCREMENT,
    `CREATED_BY`         varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
    `CREATED_DATE`       datetime(6)                             DEFAULT NULL,
    `LAST_MODIFIED_BY`   varchar(50) COLLATE utf8mb4_general_ci  DEFAULT NULL,
    `LAST_MODIFIED_DATE` datetime(6)                             DEFAULT NULL,
    `CLOSING_TIME`       varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `FORM_DAY`           varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `NUMBER`             int                                     DEFAULT NULL,
    `OPENING_HOUR`       varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `STREET`             varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `TO_DAY`             varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `ARRONDISSEMENT`     varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `COMMUNE`            varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `DEPARTMENT`         varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
    `SEC_COMMUNALE`      varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
    `SHOP`               bigint                                 NOT NULL,
    PRIMARY KEY (`ID`),
    KEY `FKhmxsjiray855ud2r0iug9mh4y` (`ARRONDISSEMENT`),
    KEY `FK4h4uc9hfnnelc1v7pk1a2caf3` (`COMMUNE`),
    KEY `FKera8obf7ygswhnirssbydmlbn` (`DEPARTMENT`),
    KEY `FKptof1sylupthwcyonaghlr8ok` (`SEC_COMMUNALE`),
    KEY `FKr7sn315r3sleddcamn5q0mo7d` (`SHOP`),
    CONSTRAINT `FK4h4uc9hfnnelc1v7pk1a2caf3` FOREIGN KEY (`COMMUNE`) REFERENCES `commune` (`CODE`),
    CONSTRAINT `FKera8obf7ygswhnirssbydmlbn` FOREIGN KEY (`DEPARTMENT`) REFERENCES `departement` (`CODE`),
    CONSTRAINT `FKhmxsjiray855ud2r0iug9mh4y` FOREIGN KEY (`ARRONDISSEMENT`) REFERENCES `arrondissement` (`CODE`),
    CONSTRAINT `FKptof1sylupthwcyonaghlr8ok` FOREIGN KEY (`SEC_COMMUNALE`) REFERENCES `sectioncommunale` (`CODE`),
    CONSTRAINT `FKr7sn315r3sleddcamn5q0mo7d` FOREIGN KEY (`SHOP`) REFERENCES `shop` (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;



CREATE TABLE IF NOT EXISTS `comments`
(
    `id`                 bigint NOT NULL AUTO_INCREMENT,
    `CREATED_BY`         varchar(50) COLLATE utf8mb4_general_ci  NOT NULL,
    `CREATED_DATE`       datetime(6)                            DEFAULT NULL,
    `LAST_MODIFIED_BY`   varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
    `LAST_MODIFIED_DATE` datetime(6)                            DEFAULT NULL,
    `CONTAIN`            varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
    `shop_ID`            bigint                                 DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FKith6rdsys95orf3g1gqy0nyhn` (`shop_ID`),
    CONSTRAINT `FKith6rdsys95orf3g1gqy0nyhn` FOREIGN KEY (`shop_ID`) REFERENCES `shop` (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

