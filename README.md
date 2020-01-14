# Project Spring and microservices

## Monolithic Application

We created an application that focuses on ticket booking for flights.

On the server side we used Spring Boot and created a CRUD application for the classes like below:

* Planes named **Avion**
* Tickets named **Ticket**
* Flights named **Vol**
* Clients name **Client**

We created also the necessary APIs in order to make a communication between the front and back End.

The front application runs on the **port 3000** and it is written using Reactjs. In order to **run it** just: Open the terminal in the folder and type

```
npm install
npm start
```

## Microservices

The DDD is presented as follows : 
* The Avion microservice, exposes REST api on **port 9000**
* The Vol microservice, exposes REST api on **port 9001**
* The Client and Ticket microservice, exposes REST api on **port 9002**

The microservices use RestTemplate to communicate.
