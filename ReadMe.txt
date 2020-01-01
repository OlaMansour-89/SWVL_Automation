Tools Neede :
Instatll appium desktop
run the emulator 

Before you run the script:
Change the app location in the Driver Registry file 
Add valid mobile number and password to login in Login_PageObjects in the below lines :

WebElement phone_edit_text=driver.findElementById("phone_edit_text");
			phone_edit_text.sendKeys("");

WebElement password_edit_text=driver.findElementById("password_edit_text");
			password_edit_text.sendKeys("");
			
						
To run the script :
Go to Book_Trip.feature OR  Cancel_Trip.feature --> right click -->Run As --> Cucumber Feature 

Note :
You must run Book Trip feature first Cancel Trip