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

Part E:

Change Log
File Name:BootStrapData.java
Line Number: 48 - 85
Change: added 5 part instances and added them to repo. 

Change Log
File Name: BootStrapData.java
Line Number: 112 - 125
Change: added 5 product instances and added them to product repo

Change Log
File Name: BootStrapData.java
Line Number: 110 + 46
Change: added guard clauses so that parts and products wouldn't be re-instantiated  every time everytime program was run

Part F:

Change Log
File Name: AddProductController.java
Line Number: 177-196
Change: added function to handle buy product request. checks inv of product returns failure or success and if success will decrement inv

Change Log
File Name: failure.html
Line Number: all
Change: created failure page 

Change Log
File Name: success.html
Line Number: all
Change: created success page 

Change Log
File Name: mainscreen.html
Line Number: 87
Change: added button to main html

Part G:

Change Log
File Name: BootStrapData.java
Line Number: 53-54, 62-63, 72-73, 82-83, 92-93
Change: used setters to set max and min inventory amounts for demo data

Change Log
File Name: InhousePartForm.html
Line Number: 22-26
Change: Added input fields for max and min inventory 

Change Log
File Name: InhousePartForm.html
Line Number: 31-34
Change:  Moved error handling to bottom of form where it made sense to handle type error from Inventory validator

Change Log
File Name: mainscreen.html
Line Number: 40-41, 50-51
Change: added heading and columns for min and max inventory data


Change Log
File Name: OutsourcedPartForm.html
Line Number: 24-26
Change: Added input fields for max and min inventory 

Change Log
File Name: OutsourcedPartForm.html
Line Number: 31-33
Change:  Moved error handling to bottom of form where it made sense to handle type error from Inventory validator

Change Log
File Name: Part.java
Line Number: 20, 34-37
Change: Added Validator tag. added fields on object for min and max inventory value. Added @min validators to ensure inputs were positive numbers

Change Log
File Name: Part.java
Line Number: 60-66
Change: created new overloaded constructor which accepts min and max

Change Log
File Name: Part.java
Line Number: 60-66
Change: created new overloaded constructor which accepts min and max

Change Log
File Name: Part.java
Line Number: 109-128
Change: created getters and setters for new attributes and created a validInventory method that will check inventory is between min and max


Change Log
File Name: PartInventoryValidator.java
Line Number: 1-24
Change:  Created entire Inventory validator 

Change Log
File Name: ValidPartInventory.java
Line Number: 1-19
Change: created validator interface

