D287 Java Frameworks PA
Ryan Webber
Student ID: 011889933

GIT REPOSITORY URL: https://gitlab.com/wgu-gitlab-environment/student-repos/rweb217/d287-java-frameworks/-/tree/guitar-shop


Change Log
File Name: 
Line Number: 
Change: 

Part C: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Change Log
File Name: mainscreen.html
Line Number: 14
Change: Changed title in header to Ryan's Guitar Shop

Change Log
File Name: mainscreen.html
Line Number: 19
Change: Changed h1 in body to Ryan's Guitar Shop

Change Log
File Name: mainscreen.html
Line Number: 21
Change: changed h2 to Guitar Parts

Change Log
File Name: mainscreen.html
Line Number: 53
Change: changed h2 to Guitars

Part D: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.


Change Log
File Name: aboutUs.html
Line Number: 5
Change: Changed title in header to "About us"

Change Log
File Name: aboutUs.html
Line Number: 8
Change: added h1 with "About Ryan's Guitar Shop"

Change Log
File Name:aboutUs.html
Line Number:10-20
Change: Created body of about us using h3 for headers and p tags for paragraphs

Change Log
File Name:aboutUs.html
Line Number:27
Change: created a tag styled as a button to return back to main page

Change Log
File Name:AboutUsController.java
Line Number: 1-15
Change: created controller for about us page


Change Log
File Name:AboutUsController.java
Line Number:7-15
Change:  created about us class and added the @Controller to tell spring that it will be used as a controller. Then added a getAboutUs method
that accepts the Model as a parameter and will return the html page "aboutUs". used @RequestMapping to map the method to /aboutUs

Change Log
File Name:mainscreen.html
Line Number:22
Change: created a tag styled as a button to go to about us page

Change Log
File Name:aboutUs.html
Line Number:6
Change: imported stylesheet from bootstrap to utilize container class 


