Create table AdminDetails(admin_id varchar(10) not null,
first_name varchar(50),
dob date not null,
phone_number int(20) not null,
email varchar(50) not null,
batch_id varchar(20) default null,
primary key (admin_id)); 