Project Description:

  This project is intended to be used for insurance employees. When the program is loaded, the employee is brought to the start screen where they must login
  before any action can happen. Once the employee signs in, buttons gain functionality. When the "show data" button is pressed, the table is populated with each 
  request via HTTP get requests. The data is pulled directly from the GCP database for the signed in employee to see. The employee can add a new entrry to the
  table by filling out the form below the table, with the corrrect information inn each slot.
  
Tech Used:

  -JDBC
  -Bootstrap
  -GCP Cloud Storage 
  -JWT
  
Features:

  -check on current status of data entries 
  -add new entry 
  -delete entry

Future Features:

  -Refactor front end to Angular frame work 
  -improve styling
  
Getting Started: 

  1. Clone this repo to the desired locaton
  2. Open the backend files with your prefered IDE
  3. Run the application to creater the server 
  4. Open VS Code 
  5. In VS Code, open the front end files
  6. Run the front end files

Usage:

  1. Sign in with an employee ID and password
  2. Click "show data" to display all entries
  3. Add or remove desired entries with their respective buttons 
  4. Enjoy the new management system!
