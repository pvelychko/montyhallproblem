## Monty Hall problem

The Monty Hall problem is named for its similarity to the Let's Make a Deal television game show hosted by Monty Hall. The problem is stated as follows. Assume that a room is equipped with three doors. Behind two are goats, and behind the third is a shiny new car. You are asked to pick a door, and will win whatever is behind it. Let's say you pick door 1. Before the door is opened, however, someone who knows what's behind the doors (Monty Hall) opens one of the other two doors, revealing a goat, and asks you if you wish to change your selection to the third door (i.e., the door which neither you picked nor he opened). The Monty Hall problem is deciding whether you do.

### Running
Use the following command to run the application:
```$xslt
./gradlew run --args='15000'
```

Sample output would be:
```$xslt
> Task :run

************************************************
Monty Hall (Let's make a deal!) game statistics:

Games played: 15000
Switch box win: 0.667
Stay box win: 0.333
************************************************

BUILD SUCCESSFUL in 2s
2 actionable tasks: 1 executed, 1 up-to-date
```

where _15000_ is the amount of games played to see the statistics.

### Testing
Use the following command to execute the tests:
```$xslt
./gradlew clean test
```

Sample output would be:
```$xslt
> Task :test

com.pvelychko.montyhall.GameTest > switchWinRateTwoThird() PASSED

BUILD SUCCESSFUL in 6s
4 actionable tasks: 4 executed
```

#### Assumptions:
* The default amount of doors might be changed in the **Game** class, however at the final stage of each game round the amount of remaining boxes will always be two, including one box with the prize.
* There is always exactly one box that contains prize, others are empty.
