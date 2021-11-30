CREATE TABLE EXCHANGE_VALUE (
                         id   BIGINT NOT NULL AUTO_INCREMENT,
                         currency_from VARCHAR(128),
                         currency_to VARCHAR(128),
                         conversion_multiple BIGINT,
                         port INT,
                         PRIMARY KEY (id)
);