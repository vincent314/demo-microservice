Microservices Demo project
==========================

```
http://localhost:8111/greetings
     │
     │
┌────▼──────┐                            ┌────────────┐
│           │ http://localhost:8222/info │            │
│ Service 1 ├───────────────────────────►│ Service 2  │
│   (8111)  │                            │   (8222)   │
└─────▲─────┘                            └─────┬──────┘
      │      {name:Service2, port:8222}        │
      └────────────────────────────────────────┘
```














```
                            ┌────────────────────┐
                {{register}}│       Eureka       │ {{register}}
                 ┌──────────► (Service registry) ◄───────┐
                 │          └────────────────────┘       │
           ┌─────┴─────┐                            ┌────┴───────┐
           │           │ http://service2/info       │            │
http───────► Service 1 ├───────────────────────────►│ Service 2  │
           │   (8111)  │                            │   (8222)   │
           └─────▲─────┘                            └─────┬──────┘
                 │      {name:Service2, port:8222}        │
                 └────────────────────────────────────────┘
```





```
                     ┌─────────┐
                     │ Gateway │
       http ─────────►  (8080) │
                     └────┬────┘
                          │{{register}}
                          │
                 ┌────────▼───────────┐
     {{register}}│       Eureka       │ {{register}}
      ┌──────────► (Service registry) ◄───────┐
      │          └────────────────────┘       │
┌─────┴─────┐                            ┌────┴───────┐
│           │ http://service2/info       │            │
│ Service 1 ├───────────────────────────►│ Service 2  │
│   (8111)  │                            │   (8222)   │
└─────▲─────┘                            └─────┬──────┘
      │      {name:Service2, port:8222}        │
      └────────────────────────────────────────┘
```
