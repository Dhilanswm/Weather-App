Dhilan Govender 


Purpose
*As mentioned earlier, the Weekly Weather App is meant to allow the user to enter and monitor minimum/maximum temperatures of the week. It also determines and gives out the means of minimum and maximum temperatures according to the given information. It also enables the users to view the temperature trend for the week in the detailed manner.

Design Considerations
*Simplicity: The UI is as minimal as possible, with each day of the week featuring a label and the minimum and maximum temperature are input boxes. 
*Table Layout: The input mechanism of the app entails the use of table layout that comprises of table format of input fields to allow users to input data systematically. 
*Accessibility: Silver colour for better visibility, sizable fonts for easy reading and sufficient space between the lines is applied. 
*Edge-to-Edge UI: This app also adopts most of the edge-to-edge design principles that enable the app to take up screen space fully and is aesthetically current.

Core Components
*EditText: To take inputs from the user for the minimum and maximum temperature of the day. 
*TextView: To show the numerical average temperatures and the average headings of the vectors for the points. 
*Buttons: For activities such as; viewing utilization detail and logout from the application. 
*Intent: To be used to switch from the main activity to the detail activity and pass temperature data.

Error Handling
*Thus, the functionality used in the presented app implies minimalistic error handling of input conversion declaring non-numeric values as zeros.

Utilization of GitHub and GitHub Actions
GitHub:
*Version Control: The project is maintained with the help of Git and located at GitHub so, it is possible to work on one project many persons simultaneously and to track changes of the project. 
*Branching Strategy: Feature branches are used for the creation of new abilities or possible bugs and glitches fixes. Specifically, after the coding is done within a branch, it is often integrated into the main branch after a code review. 
*Pull Requests: Changelog is merged through pull request to ensure other team members can review before the changes are merged into the master branch.

GitHub Actions:
*Continuous Integration (CI): CI pipeline is established with the help of the GitHub Actions. what this implies is that any time the pipeline is involved in a push and/or a pull, it compiles and runs the application in search of integration nightmates. 
*Automated Testing: Subtests are people CIs for rejecting wrong code as noticed during the unit tests. This in turns helps in identifying bugs in the early stage of development more to that it helps in ensuring that new changes do not compromise the functionality of the software. 
*Deployment: The use of the GitHub Actions is possible in order to describe how the app has to be deployed, which version has to be offered to the users.



