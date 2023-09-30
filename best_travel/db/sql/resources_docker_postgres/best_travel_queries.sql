select * from fly where price < 20.00;

select * from fly where price between 10 and 15;

select * from fly where origin_name = 'Grecia' and destiny_name = 'Mexico';

select * from ticket t ;

select * from fly f;

select * from fly f join ticket t on f.id = t.fly_id where f.id = 1;