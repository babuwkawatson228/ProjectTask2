# ProjectTask2
Task2 for a Java using Spring Boot with a Swagger interface, Student Yaroslav Pilhui (SID: 77158, group 2)

For this task we had to create an application using Spring Initializr to send varius requests and then to analyze responces.

The request are different manipulations with "products" - we are looking at 4 core HTTP methods:

1. GET - to retrieve
2. POST - to create
3. PUT - to update
4. DELETE - to delete

Throughout the creation of this application we had to test whether Rest API is working correcrly. 

On early steps I was using the Postman application, on the following screenshot you can find a POST request in JSON format.

![Postman](https://github.com/user-attachments/assets/f4774510-485c-4214-8c0f-79e74c1af08f)


As we can see, the response status is 201 which means that the resourse has been created and saved correctly.

The next step was to create a visualization for our project, we used Swagger.io.
After the launch of new visualized application - we only have one of core HTTP methods, so we need to add the rest of them.

On the following screenshot you can see the fully visualized project with all HTTP methods.

![Main](https://github.com/user-attachments/assets/dc05b46f-d6f6-493b-bb24-215b6f248725)

By the time project has been developed - we also managed to handle exceptions for all methods, you will see the results afterwards.

Starting with a first method - GET{id}, which is retrieving resourse by its' id. Results are below.

![get{id}](https://github.com/user-attachments/assets/1b27e027-28fa-4700-9090-510026797ac0)

The status is 200 and we can see the information regarding this existant resourse alongside the status.


On the following screenshot, we have requested a GET method of a nonexistant element in order to check our exception handlings parts of code.

![get{id}_2](https://github.com/user-attachments/assets/a5ba22cc-7d13-496d-8000-2e6bae4a1f15)








