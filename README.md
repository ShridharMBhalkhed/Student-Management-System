# Student Management System (Java Console App)

This is a basic console-based Student Management System developed in Java. It allows users to:
- Add student details (ID, Name, Course)
- View all student records
- Save and read data from a file (`students.txt`)

---

## Features

- Add student details via user input  
- View all saved student records  
- Persistent storage using text file  
- Simple file handling using `FileWriter` and `Scanner`  
- User-friendly console menu interface  

---

## Project Structure

StudentManagementSystem.java // Main Java file
students.txt // Auto-generated text file storing student data

yaml
Copy
Edit

---

## How to Run

1. Compile the program  
   ```bash
   javac StudentManagementSystem.java
Run the program

bash
Copy
Edit
java StudentManagementSystem


Sample Output
pgsql
Copy
Edit
----- Student Management System -----
1. Add Student
2. View All Students
3. Exit
Choose an option: 1
Enter Student ID: 101
Enter Name: Alice
Enter Course: Java

Student details saved.
