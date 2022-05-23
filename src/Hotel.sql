CREATE TABLE tblBill (
  Id           int(10) NOT NULL, 
  PaymentDate  date NOT NULL, 
  Amount       float NOT NULL, 
  PaymentType  int(10) NOT NULL, 
  Note         varchar(255), 
  tblBookingId int(10) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE tblBookedRoom (
  ID            int(10) NOT NULL AUTO_INCREMENT, 
  ArrivalDate   date NOT NULL, 
  DepartureDate date NOT NULL, 
  NumberOfGuest int(10) NOT NULL, 
  Price         float NOT NULL, 
  tblRoomId     int(10) NOT NULL, 
  tblBookingId  int(10) NOT NULL, 
  PRIMARY KEY (ID));
CREATE TABLE tblBooking (
  Id          int(10) NOT NULL, 
  BookingDate date NOT NULL, 
  Note        varchar(255), 
  tblClientId int(10) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE tblClient (
  Id          int(10) NOT NULL, 
  Name        varchar(255) NOT NULL, 
  Email       varchar(255) NOT NULL, 
  PhoneNumber varchar(255) NOT NULL, 
  Username    varchar(255) NOT NULL, 
  Password    varchar(255) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE tblHotel (
  Id           int(11) NOT NULL, 
  Name         varchar(255) NOT NULL, 
  PhoneNumber  varchar(10) NOT NULL, 
  EmailAddress varchar(100) NOT NULL, 
  Description  varchar(255) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE tblRoom (
  Id          int(10) NOT NULL, 
  Name        varchar(255) NOT NULL, 
  Type        varchar(255) NOT NULL, 
  Price       float NOT NULL, 
  Description varchar(255) NOT NULL, 
  Image       varchar(255) NOT NULL, 
  HotelId     int(11) NOT NULL, 
  PRIMARY KEY (Id));
ALTER TABLE tblBill ADD CONSTRAINT FKtblBill233255 FOREIGN KEY (tblBookingId) REFERENCES tblBooking (Id);
ALTER TABLE tblBookedRoom ADD CONSTRAINT FKtblBookedR573932 FOREIGN KEY (tblBookingId) REFERENCES tblBooking (Id);
ALTER TABLE tblBookedRoom ADD CONSTRAINT FKtblBookedR750040 FOREIGN KEY (tblRoomId) REFERENCES tblRoom (Id);
ALTER TABLE tblBooking ADD CONSTRAINT FKtblBooking413621 FOREIGN KEY (tblClientId) REFERENCES tblClient (Id);
ALTER TABLE tblRoom ADD CONSTRAINT FKtblRoom480238 FOREIGN KEY (HotelId) REFERENCES tblHotel (Id);

