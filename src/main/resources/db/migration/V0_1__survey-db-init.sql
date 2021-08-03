-- create table Survey
-- (
--     id          BIGSERIAL PRIMARY KEY,
--     name        varchar(100) not null,
--     date_start  timestamp,
--     date_finish timestamp,
--     description varchar
-- );
--
-- create table Question
-- (
--     id               BIGSERIAL PRIMARY KEY,
--     text_question    VARCHAR(999) NOT NULL,
--     question_type_id int,
--     survey_id        bigint
-- );
--
-- create table Answer
-- (
--     id               BIGSERIAL PRIMARY KEY,
--     user_id     bigint,
--     text        varchar(999) not null,
--     question_id bigint
-- );
--
--
-- ALTER table Question
--     add foreign key (survey_id) references Survey (id);
--
--
-- insert into Survey (name, date_start, date_finish, description)
-- values ('Опрос 1', '2021-05-01 10:10:00', '2021-12-05 10:10:00', 'лалаа');
--
-- insert into Survey (name, date_start, date_finish, description)
-- values ('Опрос 2', '2021-05-01 10:10:00', '2021-12-05 10:10:00' , 'лалаа');
--
-- insert into Question (text_question, question_type_id, survey_id)
-- values ('Как звать?', 1,1);
-- insert into Question (text_question, question_type_id, survey_id)
-- values ('Как звать?', 1,1);
--
-- insert into Answer(user_id, text, question_id) values (2, 'Ответ такой-то', 1)
--



create table Survey
(
    id          BIGINT IDENTITY PRIMARY KEY,
    name        varchar(100) not null,
    date_start  timestamp,
    date_finish timestamp,
    description varchar(999)
);

create table Question
(
    id                BIGINT IDENTITY PRIMARY KEY,
    text_question    VARCHAR(999) NOT NULL,
    question_type_id int,
    survey_id        bigint
);

create table Answer
(
    id                BIGINT IDENTITY PRIMARY KEY,
    user_id     bigint,
    text        varchar(999) not null,
    question_id bigint
);

ALTER table Question
    add foreign key (survey_id) references Survey (id) ON DELETE CASCADE;

insert into Survey (name, date_start, date_finish, description)
values ('Опрос 1', '2021-05-01 10:10:00', '2021-12-05 10:10:00', 'лалаа');

insert into Survey (name, date_start, date_finish, description)
values ('Опрос 2', '2021-05-01 10:10:00', '2021-12-05 10:10:00' , 'лалаа');

insert into Question (text_question, question_type_id, survey_id)
values ('Как звать?', 1,1);
insert into Question (text_question, question_type_id, survey_id)
values ('Как звать?', 1,1);

insert into Answer(user_id, text, question_id) values (2, 'Ответ такой-то', 1)
