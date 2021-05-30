# ProjectSoluton

This is the proposed project solution for Polar Cape graduate program.


----


## Installation instructions

1. Pull all files from project
2. Open the project with IDE (Netbeans, InteliJ)
3. Run Solution.java as project console application

## Project Structure

```
├── "src"                   
|   ├── project
|   ├──├── Solution.java     --- Main execution file
|   ├──├── Application.java  --- Application methods
|   ├──├── Author.java       --- Author class implementation
|   ├──├── Book.java         --- Book class implementation
|   ├──├── Ebook.java        --- Ebook class implementation
|   ├──├── PrintCoppy.java   --- PrintCoppy class implementation
 
```

## Conclusion

In some parts I didn't implemented the best posible performance for our prolem.
  * getAutorsWithSameDecade has slow query  ->  ```O(|Authors| * |Books|)```
  * All other methods have fast insert and fast query, but the update won't work 

Probably the best solution for this kind of prolbem is to connect the application with Database.
This is because **indexed table** datastructure is very suitable for CRUD(Create, read, update, delete) kind of requirements.
However, because I don't have the experience with Hibernate and other kind of libraries/frameworks, I decided to solve this problem with simple datastructures and algorithms.

