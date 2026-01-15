# BCCI Selenium Automation Project

## Overview
This project demonstrates web automation of the official BCCI (Board of Control for Cricket in India) website using Selenium WebDriver with Java.  
The automation focuses on navigating a dynamic, JavaScript-heavy website and validating player information from the Men → Players section.

This project was built as part of hands-on learning in Selenium automation and follows a simple, fresher-friendly structure.


## Project Objectives
- Automate navigation on a real-world dynamic website
- Handle JavaScript-rendered UI elements
- Practice XPath-based element identification
- Understand challenges in automating modern web applications
- Use Git and GitHub for version control


## What the Automation Does
- Launches the BCCI official website
- Navigates to the **Men → Players** section
- Opens selected player profiles for validation
- Extracts the first 11 players’:
  - Player Name
- Prints extracted details to the console
- Handles dynamic content loading and browser stability issues


## Technologies Used
- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Browser:** Google Chrome  
- **Build Tool:** Maven  
- **Version Control:** Git & GitHub  
- **IDE:** Eclipse  


## Key Automation Concepts Used
- XPath locators for dynamic elements
- WebElement handling
- Navigation between pages
- Handling JavaScript-heavy UI
- Implicit waits for synchronization
- Browser stability using ChromeOptions


## Challenges Faced & Learnings
- The BCCI website uses dynamic DOM rendering, making element identification challenging
- Player role information is not reliably available on the list page
- Learned when to change automation strategy instead of forcing unstable locators
- Gained experience in debugging real Selenium issues such as:
  - NoSuchElementException
  - Dynamic DOM changes
  - Browser crashes due to heavy pages


## Future Enhancements
- Extract player Date of Birth from profile pages
- Calculate and display player age dynamically
- Convert the project into TestNG framewor
- Add reporting support


## Repository Purpose
This repository is intended for:
- Learning Selenium automation
- Demonstrating practical automation skills
- Showcasing hands-on project experience on GitHub
- Supporting resume and interview discussions

---

## Note
This project focuses on learning and practical automation concepts.  
UI changes on the BCCI website may require locator updates in the future.
