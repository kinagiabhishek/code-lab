import logging
import time
from selenium import webdriver
from selenium.webdriver.common.by import By

# Configure logging
logging.basicConfig(level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s")

# Initialize WebDriver
options = webdriver.ChromeOptions()
options.add_argument("--start-maximized")

logging.info("Starting WebDriver...")
driver = webdriver.Chrome(options=options)

try:
    logging.info("Navigating to Naukri login page...")
    driver.get("https://www.naukri.com/nlogin/login")
    # Allow page to load
    time.sleep(5)

    # Enter email
    email_field = driver.find_element(By.ID, "usernameField")
    email_field.send_keys("username")

    # Enter password
    password_field = driver.find_element(By.ID, "passwordField")
    password_field.send_keys("password")

    # Click login button
    login_button = driver.find_element(By.XPATH, "//button[contains(text(), 'Login')]")
    login_button.click()

    # Perform login (Assuming login steps are already in place)
    logging.info("Logging in...")

    # Allow time for login process
    time.sleep(10)

    # Move to Profile Page
    logging.info("Navigating to profile page...")
    driver.get("https://www.naukri.com/mnjuser/profile")
    time.sleep(5)

    # Locate upload button & upload resume
    logging.info("Uploading resume...")
    upload_input = driver.find_element(By.ID, "attachCV") # Locate the file input field and upload resume
    upload_input.send_keys(r"path/to/your/resume.pdf")

    # Allow some time for upload to complete
    time.sleep(15)
    logging.info("Resume upload successful!")

except Exception as e:
    logging.error(f"An error occurred: {e}")

finally:
    driver.quit()
    logging.info("WebDriver session closed.")

