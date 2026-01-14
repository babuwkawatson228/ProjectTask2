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

Here is a POST method which we have tested earlier (using Postman).

![Create1](https://github.com/user-attachments/assets/1901ddd7-96ed-4379-84a5-3805d9893cdd)


![Create2](https://github.com/user-attachments/assets/f24d52b3-8521-4018-91fa-1fb071b8e95d)

We have received the same respond as we had from the Postman test - 201, meaning that resource has been created.

We not only can create new resources, but update already created ones using a PUT method.

![put_update](https://github.com/user-attachments/assets/ecba6019-f1ac-40e5-bd18-acf77e770e5c)

As we requested to update the name and the price of the 2nd element

From
name: "Second" 
price: "1.50"

To
name: "Second_Updated"
price: "1.99"

we can see the result of that with status 200 (OK).

![put_update2 ](https://github.com/user-attachments/assets/da27c368-29dd-4301-85bc-0e632459766f)

To check if the PUT request has worked we need to check our element by id 2, I have used another method that we have - GET all of the products (not by Id).

![put_update3](https://github.com/user-attachments/assets/a342637e-19f9-4700-a156-78fcb8357f94)

The status of retrieving all of the resources is 200, meaning request went smoothly. 
Also, here we can see our updated element with id:2.

If we want to request a PUT method of a nonexistant element we will receive an error.

![put_update4](https://github.com/user-attachments/assets/7a2286a4-617b-46f1-8a88-28a4ba845b3b)

![put_update5](https://github.com/user-attachments/assets/290a6d15-9747-4364-8f6e-4eb55b4d5346)

As we can see we have received an error 404 (Not Found), meaning that we are missing an element that we are requsting update on, which is logical since we simpli do not have an element with id:3.

The last HTTP method is DELETE one. Here are the screenshots:

![delete1](https://github.com/user-attachments/assets/91d699fa-92d3-46aa-bd17-254dcb2e2bf5)

Here we were deleting the resourse with id number 1 and we have got status 204 (No Content) - that means that our request was successfully done, but the server has nothing to return back, since we have deleted this element.

![delete2](https://github.com/user-attachments/assets/4e58347a-22ff-4414-8f9b-84e44049cf85)

We can check if this element was really deleted, and from the screenshot above we can see that we do not have an element with id:1

And lastly, we have to check DELETE request of a nonexistant element, results are below:

![delete_3](https://github.com/user-attachments/assets/fe20abef-4604-4471-b123-5b003d50a3de)

As we can see, we have got a 404 response status, meaning we do not have an element with id:3, that we are trying to delete.
