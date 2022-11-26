## LDTS_<L07><GR01> - <The Binding of Lêndea>

We decided to create an original game, based on *The Binding of Isaac*, where the user would control the hero, “Pão de Forma”, and aim to kill enemies by shooting them.

To clear the levels, Pão de Forma must collect every coin on the map without losing all of his HP. When that happens, a door will open, allowing him to progress.

This project was developed by João Coelho ([up202004846@fe.up.pt]), João Mota ([up202108677@fe.up.pt]) and Pedro Landolt ([up202103337@fe.up.pt]) for LDTS 2022/23.



### Implemented Features


Win Screen – When the player clears a level, a special screen appears, congratulating them


Menu – We have created a menu that allows the player to start or exit the game


Shooting – Using the spacebar, you can fire shots that kill enemies, from right to left


Help Screen – Contains information on how to play the game and its elements


Game Over Screen – When the player loses, a special screen pops up with a Game Over Message


Some Screenshots:


Help Screen:

![image](https://user-images.githubusercontent.com/92723402/204062661-a4dabda3-e055-47aa-9f09-c643713722dd.png)


Shooting: 

![image](https://user-images.githubusercontent.com/92723402/204062683-63f1e2cd-c2ed-42fc-aae5-a08973a8b5ff.png)



### Planned features

BGM – We plan to add background music, that would be able to be turned off in the options screen


Original user character – We plan to create a special font for the Pão de Forma


Original Monsters - We plan to create a special font for the Monsters


More levels – We plan to add more levels


Timer – We plan to add a timer so the user may know how long it took to clear a level


Multidirectional shooting – We plan to allow the user to shoot in more than one direction


![image](https://user-images.githubusercontent.com/92723402/204062778-a1c9d05e-f68c-4332-a7c9-6dae67a9e6ce.png)



### Design


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

![image](https://user-images.githubusercontent.com/92723402/204062831-d3e8d77c-abc2-4da4-ad7f-462c13ef4fe3.png)



### Testing

Test Coverage Screenshot:

![image](https://user-images.githubusercontent.com/92723402/204062863-59f64adc-2a86-436d-b2d2-1f50a2d9f158.png)


Link to Mutation Testing report: http://localhost:63342/The_Binding_of_Lendea/build/reports/pitest/202211260026/index.html?_ijt=atfgs29q7sf5o7e9c0602u7g3i&_ij_reload=RELOAD_ON_SAVE

### Self-evaluation

João Mota – 34%

João Coelho – 33%

Pedro Landolt – 33%
