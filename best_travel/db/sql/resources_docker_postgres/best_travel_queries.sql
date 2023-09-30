select * from h where price < 20.00;

select * from fly where price between 10 and 15;

select * from fly where origin_name = 'Grecia' and destiny_name = 'Mexico';

select * from ticket t ;

select * from fly f;

select * from fly f join ticket t on f.id = t.fly_id where f.id = 1;

select * from customer c ;

SELECT f.* 
FROM fly f 
INNER JOIN ticket t ON f.id = t.fly_id 
WHERE t.id = '12345678-1234-5678-2236-567812345678';


# Supported keywords inside method names
select * from h where price < 20.00;
