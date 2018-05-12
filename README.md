# Vaadin + Spring Boot + Heroku DEMO

[Demo app on Heroku](https://vaadin-spring-boot-demo.herokuapp.com/ "https://vaadin-spring-boot-demo.herokuapp.com/")

### Libraries:
| Library | Version |
| ------ | ------ |
| Spring Boot | 2.0.2 |
| Vaadin | 8.4.1 |

How to run application locally:
-----------------------
    mvn spring-boot:run
    
Open [http://localhost:8080/](http://localhost:8080/) in browser

How to deploy to Heroku:
-----------------------
You need to create [Heroku account](https://www.heroku.com/) and install [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli).

Clone repository and change directory:

    git clone https://github.com/bager/vaadin-spring-boot-demo.git
    cd vaadin-spring-boot-demo

Login to Heroku account:
    
    heroku login
    
Create an app on Heroku (with random name), which prepares Heroku to receive your source code:
    
    heroku create

Deploy your code:
    
    git push heroku master
    
Visit the app at the URL generated by its app name:

    heroku open
    
[Demo app on Heroku](https://vaadin-spring-boot-demo.herokuapp.com/ "https://vaadin-spring-boot-demo.herokuapp.com/")