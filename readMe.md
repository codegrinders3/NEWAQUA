GENERAL INSTRUCTIONS

1. All your queries will be executed on MySQL version 5.7.

2. The sql files where you have to write the queries can be found under "src/main/resources/solution"

3. Refrain from writing anything else in those files except the SQL query.

4. Query problems can be found under the Problem Statement section below or inside each sql file present under "src/main/resources/solution"

5. Data for "hotel_details", "guest_details" and "hotel_room_details" tables below will not change for all system test cases. The "room_booking_details" table will have different data for different test cases.

6. SQL alias to be used for all columns in each query MUST EXACTLY match, how it's shown below under Problem statements section



SCHEMA

1. "hotel_details": The hotel_id is the id of the hotel, hotel_name is the name of the hotel, city is the city in which hotel is located.
 
2. "guest_details": The guest_no is the id of the guest, guest_name is the name of the guest, guest_address is the address of the guest.

3. "hotel_room_details": The room_id is the room number, hotel_id is the id of the hotel, room_type is the type of the room, price is the price of the room.

4. "room_booking_details": The hotel_id is the id of the hotel, guest_no is the id of the guest, room_id is the room number, date_from and date_to are the dates for which guest had booked that room.



PROBLEM STATEMENT

1. "hotel_year_count.sql": Select the list of total number of bookings on the basis on hotel and year.
OUTPUT- hotel_name as name of the hotel, year as year of booking, booking as total number of bookings in that year and hotel.
ALIAS- hotel_name,year,booking.

2. "hotel_price.sql": Select all unoccupied rooms at each hotel and total price of all unoccupied rooms in that hotel from 1st july 2019 to 31st july 2019.
OUTPUT- hotel_id as id of the hotel,price as total price of all unoccupied rooms in hotel.
ALIAS- hotel_id,price.
	
3. "guest_count.sql": Select how many guest were available in year = 2018 and  month = july .
OUTPUT- guest_number as total number of guests available.
ALIAS- guest_number.

4. "hotel_type_price.sql": Select list of hotels and how many bookings were happened corresponding to each room type  and total price of all rooms in that hotel.
OUTPUT-	hotel_name as name of the hotel,price as total price of all rooms in that hotel, single_room as number of rooms with room_type='single',double_room as number of room with room_type='double',family_room as number of rooms with room_type='family'.
ALIAS- hotel_name,price,single_room,double_room,family_room.
	
5. "guest_info.sql": Select list of guest who were stayed greater than 15 days.
OUTPUT-	guest_name as name of the guest,days as total number of days guest stayed in hotel,date_from and date_to as arriving and departure dates.
ALIAS- guest_name,days,date_from,date_to.
	
6. "hotel_max_booking.sql": Write select statement to identify which hotel had measured highest booking.
OUTPUT-	hotel_name as name of the hotel that had maximum bookings,total_booking as total number of bookings in that hotel.
ALIAS- hotel_name,total_booking.
	
7. "year_max_booking.sql": Write select statement to identify which year had measured highest booking.
OUTPUT- year as year that had maximum bookings,total_booking as total number of booking in that year.
ALIAS- year,total_booking.
