from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# Set up Firefox WebDriver
options = webdriver.FirefoxOptions()
options.add_argument("--start-maximized")  # Open in maximized mode
driver = webdriver.Firefox(options=options)

# Open Naukri login page
driver.get("https://www.naukri.com/nlogin/login")

# Allow page to load
time.sleep(3)

# Find the email & password input fields
email_field = driver.find_element(By.ID, "usernameField")
password_field = driver.find_element(By.ID, "passwordField")

# Enter login credentials
email_field.send_keys("username")  # Replace with your email
password_field.send_keys("password")  # Replace with your password
time.sleep(1)

# Click the login button
login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
login_button.click()

# Wait for login to process
time.sleep(5)

# Print the title after login
print("Page Title:", driver.title)

# Verify login by checking for a specific element after login
if "homepage" in driver.current_url:
    print("Login successful!")
else:
    print("Login failed!")

# Close the browser
driver.quit()



