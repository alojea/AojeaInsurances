# AojeaInsurances
MongoDB Crud practice using Spring Boot, Thymeleaf and Bootstrap


MongoDB setting instructions for Mac Users:

1. Install MongoDB using Homebrew: brew install mongodb-community
2. Start mongo service: services start mongodb-community
3. Check if the new mongodb process was created: sudo lsof -i tcp:27017
or ps aux | grep -v grep | grep mongod
4. Install robomongo https://robomongo.org/ 
5. Create a new database with the name insurance and new collection members

Starting the app

1. Import the project as maven project in eclipse
2. Start the mongoDB services. If you don't that first you will get errors trying to inject dependencies during the compilation time. 
3. Resolve the dependencies using maven command: mvn -X clean install
4. Check if the database configuration is ok in application.properties
5. run the command ./mvnw spring-boot:run for starting the application. 

Heroku Deploy - Cloud 

1. Enter in Heroku dashboar: https://dashboard.heroku.com/
2. Associate this github project
3. Enter in Resources and search by mLab MongoDB

To connect using the mongo shell:
mongo ds031329.mlab.com:31329/heroku_6kq54m6n -u <dbuser> -p <dbpassword>
To connect using a driver via the standard MongoDB URI (what's this?):
mongodb://<dbuser>:<dbpassword>@ds031329.mlab.com:31329/heroku_6kq54m6n

4. Create a new DB user and password

5. Modify the file application.properties in this github project adding the user and password
