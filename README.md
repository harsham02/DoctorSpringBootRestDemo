The Doctor Spring Boot Demo Project is part of the Petzee internship project, facilitating doctor details management, appointment booking, and status tracking functionalities. This module is integrated with the Appointment and Status controllers to provide comprehensive features.

Overview
The Doctor module includes the following controllers and functionalities:

Doctor Controller
POST /addnew: Add a new doctor.
Request Body: Doctor details.
GET /get/byName: Get doctor details by name.
Parameters: name (Doctor name).
GET /all: Get all doctors.
Appointment Controller
POST /POST/addnew: Book a new appointment.
Request Body: Appointment details.
GET /GET/totalnumber: Get the total number of appointments.
GET /GET/countstatus/confirmed: Get the count of appointments with confirmed status.
GET /GET/countstatus/closed: Get the count of appointments with closed status.
GET /GET/countstatus/cancelled: Get the count of appointments with cancelled status.
GET /GET/all: Get all appointments.
Status Controller
GET /GET/total: Get the total number of appointments.
GET /GET/confirmed: Get the count of appointments with confirmed status.
GET /GET/closed: Get the count of appointments with closed status.
GET /GET/cancelled: Get the count of appointments with cancelled status.
