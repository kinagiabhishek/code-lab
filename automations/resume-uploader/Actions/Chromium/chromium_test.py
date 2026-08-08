from selenium import webdriver

options = webdriver.ChromeOptions()
options.add_argument("--headless")  # Headless mode
options.add_argument("--no-sandbox")  # Required for some environments
options.add_argument("--disable-dev-shm-usage")  # Avoid crashes in some cases

driver = webdriver.Chrome(options=options)

driver.get("https://www.google.com")
print(driver.title)

driver.quit()
