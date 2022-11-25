\#\# LDTS_\<L07\>\<GR01\> - \<The Binding of Lêndea\>

We decided to create an original game, based on *The Binding of Isaac*, where the user would control the hero, “Pão de Forma”, and aim to kill enemies by shooting them.

To clear the levels, Pão de Forma must collect every coin on the map without losing all of his HP. When that happens, a door will open, allowing him to progress.

This project was developed by João Coelho ([up202004846@fe.up.pt](mailto:up202004846@fe.up.pt)), João Mota ([up202108677@fe.up.pt](mailto:up202108677@fe.up.pt)) and Pedro Landolt ([up202103337@fe.up.pt](mailto:up202103337@fe.up.pt)) for LDTS 2022/23.

\#\#\# Implemented Features

Win Screen – When the player clears a level, a special screen appears, congratulating them

Menu – We have created a menu that allows the player to start or exit the game

Shooting – Using the spacebar, you can fire shots that kill enemies, from right to left

Help Screen – Contains information on how to play the game and its elements

Game Over Screen – When the player loses, a special screen pops up with a Game Over Message

Some Screenshots:

Help Screen:

![](media/be2f24c7ca61d7bfd02c04fd0c682d38.png)

Shooting: ![Graphical user interface Description automatically generated](media/78ebd9fb09c41c6b8918cfc4d3c0fd15.png)

\#\#\# Planned features

BGM – We plan to add background music, that would be able to be turned off in the options screen

Original user character – We plan to create a special font for the Pão de Forma

Original Monsters - We plan to create a special font for the Monsters

More levels – We plan to add more levels

Timer – We plan to add a timer so the user may know how long it took to clear a level

Multidirectional shooting – We plan to allow the user to shoot in more than one direction

![Timeline Description automatically generated](media/2f701bd6d2efaeebf6ece13f6f4c81f2.png)

\#\#\# Design

We have used numerous design patterns, such as the State, Game Loop, Factory Method and MVC Architectural Patterns, to help solve problems in our code.

The State Pattern was useful because it allowed us to alter the health, score and kills of “Pão de Forma”, as well as the walls of the arena, during runtime.

Code examples:

State: [project-l07gr01/State.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/states/State.java)

GameState: [project-l07gr01/GameState.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/states/GameState.java)

The Game Loop pattern allowed us to process input to move the character, update the game state and render the game itself.

Code examples:

State: [project-l07gr01/State.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/states/State.java)

Controller: [project-l07gr01/Controller.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/controller/Controller.java)

GameOverController: [project-l07gr01/GameOverController.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/controller/menu/GameOverController.java)

The Factory Method pattern allowed us to instantiate different methods for our State classes, using only the methods in the State interface, making the design more customizable.

Code examples:

State: [project-l07gr01/State.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/states/State.java)

GameState: [project-l07gr01/GameState.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/states/GameState.java)

We used the MVC Architectural Pattern to have less dependency between components in our code and allows us to work with Model, View and Controller simultaneously, and for testing to be easier.

Code examples:

Win: [project-l07gr01/Win.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/model/win/Win.java)

WinController: [project-l07gr01/WinController.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/controller/menu/WinController.java)

Win Viewer: [project-l07gr01/WinViewer.java at main · FEUP-LDTS-2022/project-l07gr01 (github.com)](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/com/aor/lendea/viewer/win/WinViewer.java)

UML Diagram:

![Timeline Description automatically generated](media/3298dbb0e8d86032590d3faa758d9400.png)

\#\#\# Testing

Test Coverage Screenshot:

![Graphical user interface Description automatically generated with medium confidence](media/a2d55cbe303f7631b537cdfa30675bce.png)

Link to Mutation Testing report:

\#\#\# Self-evaluation

João Mota – 34%

João Coelho – 33%

Pedro Landolt – 33%