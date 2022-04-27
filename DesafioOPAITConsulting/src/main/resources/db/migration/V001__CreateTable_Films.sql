CREATE TABLE FILMS(
   id integer primary key not null,
   title varchar(200),
   episode_id long,
   opening_crawl varchar(155),
   director varchar(155),
   producer varchar(200),
   release_date DATETIME
);


