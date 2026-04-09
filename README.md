# PalindromeCheckerApp

`PalindromeCheckerApp` is a Java console project that demonstrates multiple Data Structures and Algorithms approaches for checking whether a string is a palindrome.

The project is organized as a portfolio-style academic example:

- `main`: final stable version
- `develop`: integration branch
- `feature/UC1` to `feature/UC13`: each feature branch represents one use case / one implementation idea

In this workspace, all use cases are collected in one clean source tree so they can be compiled and reviewed together.

## Use Cases

- `UC1`: Basic welcome program
- `UC2`: Loop-based palindrome check
- `UC3`: `StringBuilder.reverse()`
- `UC4`: Two-pointer array technique
- `UC5`: Stack-based approach
- `UC6`: Stack and Queue comparison
- `UC7`: `Deque` using `ArrayDeque`
- `UC8`: `LinkedList` approach
- `UC9`: Recursive approach
- `UC10`: Case-insensitive and space-handling version
- `UC11`: OOP approach with a separate service class
- `UC12`: Strategy design pattern
- `UC13`: Execution time measurement

## Suggested Git Workflow

```text
main
develop
feature/UC1
feature/UC2
feature/UC3
feature/UC4
feature/UC5
feature/UC6
feature/UC7
feature/UC8
feature/UC9
feature/UC10
feature/UC11
feature/UC12
feature/UC13
```

Typical flow:

1. Create each use case on its own `feature/UC*` branch.
2. Merge feature branches into `develop`.
3. Test the integrated project on `develop`.
4. Merge the stable version into `main`.

## Compile

From the project root:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

## Run Examples

```powershell
java -cp out com.palindromecheckerapp.uc1.UC1WelcomeApp
java -cp out com.palindromecheckerapp.uc2.UC2LoopPalindromeApp
java -cp out com.palindromecheckerapp.uc13.UC13ExecutionTimeApp
```
