# Live Long and Prosper 🏙️🌆🌅🌇
Help a town reach a prosperity level of 100 by managing resources and constructing buildings. Simulated in JAVA (OBJECT ORIENTED).
There is a town that requires some resources (food, materials, energy) for the citizens inside or for the establishment of new buildings. The town has a prosperity level indicating how well its people are doing. Buildings need to be established to make the town more prosperous and these buildings require some resources.

This project attempts to find a plan that will make the prosperity level reach 100 using a search agent. The agent can perform Breadth-first Search, Depth-first search, Iterative deepening search, Uniform cost search, Greedy search with at least two heuristics, or A∗ search with at least two admissible heuristics. A trivial heuristic (e.g., h(n) = 1) is not acceptable.

## Classes
1. `GenericSearch.java`: Contains the main class implementing the generic search algorithm.
2. `LLAPSearch.java`: Provides helper methods for generating child nodes and updating the search queue based on the selected strategy.
3. `Node.java`: Defines the data structure for representing search nodes.
4. `Operator.java`: Enumerates possible operators for actions in the problem domain.
   
## Features
- Supports various search strategies: DF, ID, UC, BF, GR1, GR2, AS1, AS2.
- Provides visualization options for understanding the search process.
- Allows customization of problem parameters such as initial state, goal state, costs, and heuristic functions.
- Implements operators for actions like waiting, requesting food, materials, energy, and building.

## Usage
1. Set up the initial state and problem parameters.
2. Choose a search strategy and specify whether to visualize the search process.
3. Call the `solve` method in `LLAPSearch.java` with the initial state, strategy, and visualization flag.
4. The method returns the solution path or "NOSOLUTION" if no solution is found.

### VISUALIZATION
`visualize` is a Boolean parameter which, when set to true, results in the program’s side-effecting displaying the state information as it undergoes the different steps of the discovered solution (if one was discovered). 

## Example
```java
String initialState = "50, 50, 50, 50, 10, 10, 10, 5, 2, 5, 2, 5, 10, 1000, 20, 30, 40, 5, 10, 15, 20, 5, 10";
String strategy = "AS1";
boolean visualize = true;

String solution = LLAPSearch.solve(initialState, strategy, visualize);
System.out.println("Solution: " + solution);
```

Developed by a lovely team of three 🥰🥰🥰

Tarteel Elattar (Me)

[Dina Ayman](https://github.com/DinaAymann)

[Nora Osama](https://github.com/NoraOsama)
