# NameSorter
 
Build a name sorter. Given a set of names, order that set first by last name, then by any given names the person may have. A name must have at least 1 given name and may have up to 3 given names.

**Example Usage**

Given a file called unsorted-names-list.txt containing the following list of names;

- Janet Parsons
- Vaughn Lewis
- Adonis Julius Archer
- Shelby Nathan Yoder
- Marin Alvarez
- London Lindsey
- Beau Tristan Bentley
- Leo Gardner
- Hunter Uriah Mathew Clarke
- Mikayla Lopez
- Frankie Conner Ritter

Should result the sorted names to screen;
- Marin Alvarez
- Adonis Julius Archer
- Beau Tristan Bentley
- Hunter Uriah Mathew Clarke
- Leo Gardner
- Vaughn Lewis
- London Lindsey
- Mikayla Lopez
- Janet Parsons
- Frankie Conner Ritter
- Shelby Nathan Yoder

and a file in the working directory called sorted-names-list.txt containing the sorted names.

# Technologies Used
Java, Spring Boot, Maven

# Pre-requisites
- Make sure you have Java version 11 installed in your system
- Maven 3.9.1 version installed

# Command to run the application
- mvn package
- java -jar target/NameSorter-1.0.0-SNAPSHOT.jar unsorted-names-list.txt
