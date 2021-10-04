select title, full_name
from items, users
where items.id_tems = id_users;

select title, full_name, start_price
from items, users
where items.id_tems = id_users;

select avg(start_price) as avgItemsPrice, items.title
from items
group by id_tems;

select title, max(bid_value)
from items, bids
group by items.id_tems = bids.items_id;

delete items, users
from items inner join users on items.id_tems = users.id_users;

select items.start_price * 2, users.full_name
from items, users
where items.id_tems = id_users;

insert into items (title, description, start_price, bid_increment, start_date, users_id) values
('Клык', 'Кабана 14 века', 2000, 50, '2018-08-08', 1);