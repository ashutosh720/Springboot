# Hospital Management Application

# Tech Stack
## Spring Boot
## Spring MVC
## MYsql database

# Requirements
## IntelliJIDEA
  Serverport: 8080 (use: localhost:8080)
  Database name: 
  Java version: 17
  Springboot 
 
 # Controller
 # Doctor Controller
 Endpoint: /doctor
 Description: REST controller for managing Doctors and enabling them to know their appointments.
 
 ## Methods:
 ### PostMapping(/)
    addDoctors(@RequestBody Doctor doc)
#### Description: adding new doctors to the database.
#### Parameters: Doctor doc(Request Body) - Doctor Info to be inserted
#### Returns: Response entity status

 ## GetMapping("{docId}/appointments")
    getDocMyAppointments(@PathVariable Long docId)
### Description: getting all the appointments of doctors based on their Id.
### Parameters: Doctor doc(Respose Body) - Doctor Info to be inserted
### Returns: Response entity status
 
# Patient Controller
Endpoint: /Patient
Description: REST controller for managing Patients and enabling their sign in ,sign ups..

## Methods
### PostMapping("/signup")
    SignUpOutput signup(@RequestBody SignUpInput signUpDto)
#### Description: Signing Up for new Patients.
#### Parameters: Signup info from Dto class and (Request Body) - Doctor Info to be inserted
#### Returns: sign up  info

### PostMapping("/signin")
    SignInOutput signIn(@RequestBody SignInInput signInDto)
#### Description: Signing in for existing Patients.
#### Parameters: Signin info from Dto class and (Request Body) - Doctor Info to be inserted
#### Returns: sign up  info
   
### GetMapping("/doctors")
    ResponseEntity<List<Doctor>> getAllDoctors(@RequestParam String userEmail, @RequestParam String token)
#### Description: Listing all the doctors.
#### Parameters: Request parameters- userEmail and token provided during signup
#### Returns: Lists all doctors

# Appointment Controller
Endpoint: /Appointments
Description: REST controller for setting up appointments.

## Methods
### PostMapping()
   bookAppointment(@RequestBody Appointment appointment)
#### Description: Enabling patients to schedule appointments with doctor of their choice.
#### Parameters:(Request Body) - Appointment Info to be inserted
#### Returns:Appointment Details


      
