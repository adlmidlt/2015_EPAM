# Добавления пользователя
insert into users (last_name, first_name, patronymic, date_of_birth, login, password, email)
VALUES
       ('Petrov', 'Pety', 'Petrovich', '2000-02-02', 'log1', 'pas1', 'petrov@tak.com');

insert into users (last_name, first_name, patronymic, date_of_birth, login, password, email)
VALUES
       ('Sidorov', 'Sidr', 'Sidrovich', '1998-05-05', 'log2', 'pas2', 'sidorov@tak.com');

insert into users (last_name, first_name, patronymic, date_of_birth, login, password, email)
VALUES
       ('Lebedev', 'Leb', 'Lebedovich', '2001-01-01', 'log3', 'pas3', 'lebed@tak.com');

insert into users (last_name, first_name, patronymic, date_of_birth, login, password, email)
VALUES
       ('Sinka', 'Sina', 'Sinovna', '2000-02-02', 'log4', 'pas4', 'sinba@tak.com');

# Добавление информации о пациенте и присвоение идентификатора
insert into patient (address, phone_number, users_id)
values
       ('Edinstva', +79845165, 1);

select * from users;

# Добавление информации о персонале и присвоение идентификатора
insert into personal(specialization, personal_role, users_id)
values
       ('Terapeft', 'Doctor', 2);

# Добавление доп информации о персонале
insert into personal(specialization, personal_role, users_id)
values
       ('Okulist', 'Nurse', 4);

# Добавление информации о пациенте и присвоение идентификатора
insert into patient (address, phone_number, users_id)
values
       ('Edin', +79231, 3);

# Вывести пациентов список
select * from users, patient
where users.id_users = patient.users_id;

# Вывести персонал список
select * from users, personal
where users.id_users = personal.users_id;

# Добавить лечение
insert into reception (patient_id, reception_date, preliminary_diagnosis, personal_id)
values
       (2, '2018-08-08', 'ORZ12', 1);

# Вывести информацию о диагнозе и лечении
select * from reception;

# Добавить назначение пациенту и добавить идентификатор пациента
insert into prescrition (name_prescription, type_prescription, description, personal_id)
values
       ('Ykol', 'procedure', '', 1);

# По идентификатору пациента достает информацию о пациенте
select distinct CONCAT_WS(' ', last_name, first_name, patronymic) as FIO,
reception_date, preliminary_diagnosis, discharge_date, final_diagnosis
from users inner join patient p on users.id_users = p.users_id
           right join reception r on p.id_patient = r.patient_id
where patient_id = 1;

# По идентификатору персонала достает информацию о назначений и кто его сделал
select distinct CONCAT_WS(' ', last_name, first_name, patronymic) as FIO,
specialization, personal_role, name_prescription, type_prescription
from users inner join personal p on users.id_users = p.users_id
right join prescrition p2 on p.id_personal = p2.personal_id
where id_personal = 2;

# Выписать пациента
update reception
set
    discharge_date = '2018-02-05',
    final_diagnosis = 'ORZ'
where patient_id = 1;

# Описание типа назначения
update prescrition
set
    description = 'Vse Kleva'
where personal_id = 1;

# Вывести назначения пациента
select * from prescrition;
