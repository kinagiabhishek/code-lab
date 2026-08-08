import logging
import time
import os
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options

# Configure logging
logging.basicConfig(level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s")

# Initialize WebDriver
options = Options()
options.add_argument("--disable-http2")
options.add_argument("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.5481.77 Safari/537.36")
service = Service("/usr/bin/chromedriver")

logging.info("Starting WebDriver...")
driver = webdriver.Chrome(service=service, options=options)

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
    login_button = driver.find_element(By.CSS_SELECTOR, "button[type='submit']")
    driver.execute_script("arguments[0].click();", login_button)

    # Perform login (Assuming login steps are already in place)
    logging.info("Logging in...")

    # Allow time for login process
    time.sleep(5)

    # Move to Profile Page
    logging.info("Navigating to profile page...")
    driver.get("https://www.naukri.com/mnjuser/profile")
    time.sleep(5)

    # Locate upload button & upload resume
    logging.info("Uploading resume...")
    script_dir = os.path.dirname(os.path.abspath(__file__))
    resume_path = os.path.join(script_dir, "path/to/your/resume.pdf")
    upload_input = driver.find_element(By.ID, "attachCV")  # Locate the file input field and upload resume
    upload_input.send_keys(resume_path)

    # Allow some time for upload to complete
    time.sleep(5)
    logging.info("Resume upload successful!")

except Exception as e:
    logging.error(f"An error occurred: {e}")

finally:
    driver.quit()
    logging.info("WebDriver session closed.")

