CREATE TABLE VEHICLE(
    id INTEGER primary key not null,
    nome varchar(200),
    model varchar(99),
    manufacturer varchar(85),
    cost_in_credits varchar(69),
    length double,
    max_atmosphering_speed integer,
    crew integer,
    passengers integer,
    cargo_capacity integer,
    consumables varchar(100)
);
