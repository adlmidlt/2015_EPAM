select *
from student;

select *
from student
order by last_name;

select mark, last_name
from student, marks
where id_student = id_marks and subject = 'Java';

select avg(mark) as avgMark
from marks, student
where id_student = id_marks and last_name = 'Ксеевна';

select subject, avg(mark) as avgMark
from marks
;

select last_name, first_name
from student, marks
where mark = 2 and id_student = id_marks;

select subject, count(mark)
from marks
where mark = 2;

delete student, marks
from student inner join marks on marks.student_id = student.id_student
where marks.mark = 2;

select last_name, count(distinct mark) as countMark
from student, marks
group by id_marks;