# MyAirline Reservation Management System

MyAirline Reservation Management System is a web-based application for handling flight bookings and reservations. The project was built with Java Spring Boot and offers an interface for passengers and administrators alike.

## Features
- **User Registration and Login** – create accounts and manage your bookings.
- **Flight Search** – look up available flights by destination and date.
- **Seat Selection** – choose your preferred seat while booking.
- **Reservation Management** – modify or cancel reservations.
- **Admin Dashboard** – manage flights and monitor bookings.

## Technologies Used
- Java 17
- Spring Boot
- Thymeleaf templates
- MySQL
- HTML/CSS/JavaScript

## Getting Started
1. Clone this repository:
   ```bash
   git clone clone https://github.com/kartiksharma14/airline_management_simulator.git
   cd myairline-reservation
   ```
2. Create a MySQL database and update the credentials in `src/main/resources/application.properties`.
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Open your browser to [http://localhost:8080](http://localhost:8080) to access the system.

---
This project showcases my exploration of Spring Boot and web development.
### Searching for Flights

After logging in, users can search for available flights by providing a start and end location:

```http
GET /api/v1/flights/search?start=COLOMBO&end=DUBAI
```

The endpoint returns a JSON list of matching flights with seat availability and distance information.
