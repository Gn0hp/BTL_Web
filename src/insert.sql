-- Client
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `Username`, `Password`, `Role`)
		VALUES('phong', 'phong@gmail.com', '012423421', 'phong', 'phong', 0);
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `Username`, `Password`, `Role`)
		VALUES('tu', 'tu@gmail.com', '098423843', 'tu', 'tu', 0);
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `web_btlUsername`, `Password`, `Role`)
		VALUES('nguyen', 'nguyen@gmail.com', '093424853', 'nguyen', 'nguyen', 0);
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `Username`, `Password`, `Role`)
		VALUES('ClientA', 'ClientA@gmail.com', '052843928', 'ClientA', 'ClientA', 1);
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `Username`, `Password`, `Role`)
		VALUES('ClientB', 'ClientB@gmail.com', '098424538', 'ClientB', 'ClientB', 1);
INSERT INTO `web_btl`.`tblClient` (`Name`, `Email`, `PhoneNumber`, `Username`, `Password`, `Role`)
		VALUES('ClientC', 'ClientC@gmail.com', '089324853', 'ClientC', 'ClientC', 1);

-- Hotel
INSERT INTO `web_btl`.`tblHotel` (`Name`, `PhoneNumber`, `EmailAddress`, `Description`)
		VALUES('Miranda', '+908 987 877 09', 'info@webmail.com', 'The Perfect Base For You');

-- Room
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Luxury Hall Of Fame', 'Luxury', 345, 'Boasting great views from oversized windows, all Superior rooms are on the top floor. Well appointed with modern conveniences.', '/img/room/01.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Pendora Fame', 'Luxury', 345, 'Ideal for families or extended stays.Featuring a separate bedroom, 2 bathrooms, kitchen, balcony and modern amenities.', '/img/room/02.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Pacific Room', 'Luxury', 345, 'It offers two bathrooms, one with a shower and one with a bathtub, both detailed with handmade ceramic sicilian tiles. ', '/img/room/03.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Id`, `Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES(DEFAULT, 'Junior Suite', 'Luxury', 345, 'Equipped with twin beds that are easily converted to a king, private bathroom with shower and a private balcony overlooking the garden.', '/img/room/04.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Superior Queen', 'Superior', 113, '1 Queen bed, 1 king bed or 2 single beds, Superb location to enjoy everything', '/img/room/05.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Superior Twin', 'Superior', 113, '2 single beds, Superior Twin Rooms are accessible rooms with key features including bathroom with fixed grab bars, accessible toilet seat.', '/img/room/06.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Apartment', 'Superior', 185, '1 King bed and sofabed, beautifully appointed, spacious studio. Featuring a small kitchen with microwave and modern conveniences.', '/img/room/07.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Deluxe Studio', 'Superior', 131, '1 Queen bed and sofabed, has a balcony, seating area and washing machine.', '/img/room/08.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Single Room', 'Family', 95, '1 twin bed, Free WiFi, Flat-screen TV with premium channels and pay movies, refrigerator, electric kettle, and free bottled water', '/img/room/09.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Double Room', 'Family', 105, '1 queen bed, desk and window screens, housekeeping on request, no rollaway/extra beds available.', '/img/room/10.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Twin Room', 'Family', 105, '1 queen bed, blackout drapes/curtains and bed sheets, partially open bathroom, shower/tub combination, bathrobes, and slippers', '/img/room/11.jpg', 1);
INSERT INTO `web_btl`.`tblRoom` (`Name`, `Type`, `Price`, `Description`, `Image`, `HotelId`)
		VALUES('Standard Room', 'Family', 85, '1 King Bed And 1 Sofa Bed, Free WiFi, Flat-screen TV with premium channels and pay movies, refrigerator, electric kettle, and free bottled water', '/img/room/12.jpg', 1);

-- Booking
INSERT INTO `web_btl`.`tblBooking` (`BookingDate`, `tblClientId`)
		VALUES('2022-05-23', 4);
INSERT INTO `web_btl`.`tblBooking` (`BookingDate`, `tblClientId`)
		VALUES('2022-05-24', 5);
INSERT INTO `web_btl`.`tblBooking` (`BookingDate`, `tblClientId`)
		VALUES('2022-05-24', 5);
INSERT INTO `web_btl`.`tblBooking` (`BookingDate`, `tblClientId`)
		VALUES('2022-05-26', 6);

-- BookedRoom
INSERT INTO `web_btl`.`tblBookedRoom` (`ArrivalDate`, `DepartureDate`, `NumberOfGuest`, `Price`, `tblRoomId`, `tblBookingId`)
		VALUES('2022-05-24', '2022-06-01', 4, 2760, 1, 1);
INSERT INTO `web_btl`.`tblBookedRoom` (`ArrivalDate`, `DepartureDate`, `NumberOfGuest`, `Price`, `tblRoomId`, `tblBookingId`)
		VALUES('2022-05-25', '2022-05-28', 2, 1035, 3, 2);
INSERT INTO `web_btl`.`tblBookedRoom` (`ArrivalDate`, `DepartureDate`, `NumberOfGuest`, `Price`, `tblRoomId`, `tblBookingId`)
		VALUES('2022-05-25', '2022-05-28', 2, 339, 5, 3);
INSERT INTO `web_btl`.`tblBookedRoom` (`ArrivalDate`, `DepartureDate`, `NumberOfGuest`, `Price`, `tblRoomId`, `tblBookingId`)
		VALUES('2022-05-27', '2022-05-30', 3, 315, 10, 4);

-- Bill
INSERT INTO `web_btl`.`tblBill` (`PaymentDate`, `Amount`, `PaymentType`, `tblBookingId`)
		VALUES('2022-05-28', 1035, 'cash', 2);
INSERT INTO `web_btl`.`tblBill` (`PaymentDate`, `Amount`, `PaymentType`, `tblBookingId`)
		VALUES('2022-05-28', 339, 'cash', 3);
INSERT INTO `web_btl`.`tblBill` (`PaymentDate`, `Amount`, `PaymentType`, `tblBookingId`)
		VALUES('2022-05-30', 315, 'credit card', 4);
INSERT INTO `web_btl`.`tblBill` (`PaymentDate`, `Amount`, `PaymentType`, `tblBookingId`)
		VALUES('2022-06-01', 2760, 'credit card', 1);