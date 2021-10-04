# Query for Users

# Список пользователей
SELECT * FROM users;

# Добавить пользователя
INSERT INTO users(last_name, first_name, patronymic, date_of_birth, login, password, email)
VALUES
       ('Petrov', 'Petr', 'Petrovich', '1990-01-01', 'log1', 'pas1', 'pet@kak.com'),
       ('Sidorov', 'Sidr', 'Sidrovich', '1990-01-02', 'log2', 'pas2', 'dis@kak.com'),
       ('Sinka', 'Sina', 'Sinovna', '2000-02-02', 'log4', 'pas4', 'sinba@tak.com'),
       ('Lebedev', 'Leb', 'Lebedovich', '2001-01-01', 'log3', 'pas3', 'lebed@tak.com'),
       ('Simkova', 'Simka', 'Simkovich', '1998-02-06', 'log5', 'pas5', 'sim@kak.com');

# Удалить пользователя по идентификатору
DELETE FROM users
WHERE id_users = 6;

# Обновить пользователя по идентификатору
UPDATE users
SET login = 'pas2',
    password = 'pas2'
WHERE id_users = 3;

# Добавить информацию о персонале
INSERT INTO personal (specialization, personal_role, users_id)
VALUES
       ('Therapist', 'Doctor', 1),
       ('Oсulist', 'Nurse', 2);

# Вывести информацию о персонале
SELECT * FROM personal;

# Вывести полную информацию о персонале
SELECT CONCAT_WS(' ', last_name, first_name, patronymic) as LFP,
       specialization, personal_role, id_personal
FROM users LEFT JOIN personal p on users.id_users = p.users_id;

# Найти персонал по роли
SELECT concat_ws(' ', last_name, first_name, patronymic) as LFP,
       specialization, id_personal
FROM users LEFT JOIN personal p on users.id_users = p.users_id
WHERE p.personal_role = 'Doctor';

# Удалить персонал по идентификатору
DELETE FROM personal
WHERE id_personal = 1;

# Обновить специализацию по идентификатору
UPDATE personal
SET specialization = 'Allergist'
WHERE id_personal = 3;

# Добавить информацию о пациенте
INSERT INTO patient(address, phone_number, users_id)
VALUES
       ('Edinstva 32', 8954343, 3),
       ('Kirova 45', 98213465, 4);

# Вывести спиок пациентов
select * from patient;

# Вывести полную информацию о пациентах
SELECT concat_ws(' ', last_name, first_name, patronymic) as LFP,
       address, phone_number, id_patient
FROM users LEFT JOIN patient p on users.id_users = p.users_id;

# Вывести список поступивших в больницу
SELECT * FROM reception;

# Добавить в список поступившего пациента
INSERT INTO reception(patient_id, reception_date, preliminary_diagnosis, personal_id)
VALUES
       (3, '2018-01-01', 'ORZ', 3);

# Добавить выписку пациента
UPDATE reception
SET discharge_date = '2018-01-06',
    final_diagnosis = 'ORZ'
WHERE id_reception = 3;

# Добавить лечение
INSERT INTO prescription(name_prescription, type_prescription, personal_id)
VALUES
       ('Paracetamol', 'MEDICAMENT', 3);

# Обновить описание лечения
UPDATE prescription
SET description = 'Vse kleva'
WHERE id_prescription = 2;

# Вывести список лечений
SELECT * FROM prescription;

# По идентификатору пациента достает информацию о пациенте
SELECT CONCAT_WS(' ', last_name, first_name, patronymic) AS FIO,
                reception_date, preliminary_diagnosis, discharge_date,
                final_diagnosis, description
FROM users LEFT JOIN  patient p ON users.id_users = p.users_id
           LEFT JOIN reception r ON p.id_patient = r.patient_id
           LEFT JOIN personal p2 ON r.personal_id = p2.id_personal
           LEFT JOIN prescription p3 ON p2.id_personal = p3.personal_id
where patient_id = 3;

# По идентификатору персонала достает информацию о назначений и кто его сделал
SELECT CONCAT_WS(' ', last_name, first_name, patronymic) as FIO,
                specialization, personal_role, name_prescription, type_prescription
FROM users LEFT JOIN personal p ON users.id_users = p.users_id
           LEFT JOIN prescription p2 ON p.id_personal = p2.personal_id
WHERE id_personal = 3;














