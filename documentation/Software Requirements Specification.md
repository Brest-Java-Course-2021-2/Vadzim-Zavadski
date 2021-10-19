# Football tournament

## Vision
Web-application for creating football league members.<br />
The application must implement the following functions:
* viewing and editing the list of football teams;
* viewing and editing the list of players;

# 1. Football teams
## 1.1 Viewing the list of football teams
This program mode is designed to view the list of teams and the number of players in a team.

Main scenario:
* The user selects the "Teams" menu item;
* The list of all teams is displayed<br />


![Picture 1.1](https://github.com/Brest-Java-Course-2021-2/Vadzim-Zavadski/blob/main/documentation/pictures/1.png)
Picture 1.1 Viewing the list of teams

The list displays the following columns:
* Name - the name of the team; 
* Number of players.

## 1.2 Adding teams
This program mode is designed to add a new team in list.

  Main scenario:
  * the user is in the teams list view mode and clicks the "Add" button;
  * the form for adding a new team is displayed;
  * the user enters data and clicks the "Save" button;
  * if the data was entered incorrectly, then the warning about incorrect data is displayed;
  * if the data was correct, then the team will be added to the database;
  * if an error occurred while saving data, an error message is displayed: "Error saving data";
  * if the team was added successfully, the form for viewing the list of teams with updated data would be open. 

Cancellation scenario:
  * the user is in teams list view mode and clicks the "Add" button;
  * the form for adding a new team is displayed;
  * the user enters data and clicks the "Cancel" button;
  * data is not saved to the database and form for viewing the list of teams is opening with updated data.<br />
 
![Picture 1.2](https://github.com/Brest-Java-Course-2021-2/Vadzim-Zavadski/blob/main/documentation/pictures/2.png)
Picture 1.2 Team adding





