use lpadmindb
update batch set batch_mentor_id = null where batch_id  != 'B001'

select * from batch
from batch bt inner join 
mentordetails md ON bt.batch_mentor_id != md.mentor_id
select batch_name,batch_id  from batch

where batch_mentor_id is NULL


update mentordetails set batch_id = ? where mentor_id = ?
select * from mentordetails;

select md.mentor_id, md.name, md.phone_number, md.email,bt.batch_name from mentordetails md 
left join batch bt  ON  md.mentor_id = bt.batch_mentor_id;
