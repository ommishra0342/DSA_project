# Simple Phone Directory

A menu-driven, console-based **Phone Directory** written in Java. It is a beginner-level **Data Structures and Algorithms (DSA)** project that uses an `ArrayList` and a `HashMap` together to store contacts and to search them quickly by name.

> Data Structures and Algorithms (DSA) project, School of Computer Science and Engineering, Rungta International Skills University, Bhilai.

---

## Features

- Add a contact (name and phone number)
- Update the number of an existing contact by adding the same name again (no duplicate names)
- Display all contacts in the order in which they were added
- Search a contact by name
- Delete a contact by name
- Menu repeats until the user chooses Exit
- Uses only the standard Java library (`java.util`): no database, file or external framework

## Data Structures Used

| Data structure | Purpose |
|---|---|
| `ArrayList<String> names` | Keeps the contact names in insertion order, used for displaying the directory |
| `HashMap<String, String> phone` | Maps a name (key) to its phone number (value), used for searching, updating and deleting |

A `HashMap` gives fast access by name but does not guarantee any order, while an `ArrayList` keeps the order. Using both gives fast lookup and a predictable display order.

## Time Complexity

Let `n` be the number of contacts.

| Operation | Time complexity |
|---|---|
| Add contact | O(1) average |
| Display contacts | O(n) |
| Search contact | O(1) average |
| Delete contact | O(n) (`names.remove()` scans the ArrayList) |
| Space | O(n) |

## Requirements

- Java Development Kit (JDK 8 or above)
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or a terminal

## How to Run

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>

# 2. Compile
javac SimplePhoneDirectory.java

# 3. Run
java SimplePhoneDirectory
```

With JDK 11 or above you can also run it directly:

```bash
java SimplePhoneDirectory.java
```

## Menu

```
1. Add Contact
2. Display Contacts
3. Search Contact
4. Delete Contact
5. Exit
```

## Sample Output

```
Enter choice: 1
Enter name: Rahul
Enter phone number: 9876543210
Contact added successfully!

Enter choice: 1
Enter name: Priya
Enter phone number: 9123456780
Contact added successfully!

Enter choice: 2
Phone Directory:
Rahul : 9876543210
Priya : 9123456780

Enter choice: 3
Enter name to search: Priya
Contact Found!
Priya : 9123456780

Enter choice: 4
Enter name to delete: Rahul
Contact deleted!

Enter choice: 5
Exiting Phone Directory...
```

## Known Limitations

- Contacts are stored only in memory; they are lost when the program closes.
- The menu choice is read with `nextInt()`, so typing text (for example `abc`) throws `InputMismatchException` and stops the program.
- Names are case-sensitive (`rahul` and `Rahul` are different contacts).
- Names and phone numbers are not validated (an empty name or letters in the number are accepted).

## Future Scope

- Save contacts to a file so they are not lost when the program closes
- Add exception handling and input validation
- Use `LinkedHashMap` (insertion order and O(1) delete) or `TreeMap` (alphabetical order)
- Add an edit option and a case-insensitive or partial-name search
- Add a GUI or a database such as MySQL

## Project Structure

```
.
├── SimplePhoneDirectory.java
└── README.md
```

## Author

**Om Mishra**
B.Tech in Computer Science & Engineering with Artificial Intelligence and Machine Learning (in association with IBM)
Rungta International Skills University, Bhilai, Chhattisgarh

Guided by **Ms. Naina Singh**
