# SpringBootRepos
This project has been developed in the spring boot and Jersey. 
Instruction for Running the application.
1. Download and extract the project in "CityConnection" directory.
2. Navigated into the extracted directory of the project and run the CMD prompt.
3. Run the command "mvn spring-boot:run"

URL to get the response of this project.
Correct URL - 
http://localhost:8080/city/connected?origin=Boston&destination=Newark
Response - Yes
http://localhost:8080/city/connected?origin=Boston&destination=Philadelphia
Response - Yes
http://localhost:8080/city/connected?origin=Philadelphia&destination=Albany
Response - No
http://localhost:8080/city/connected?origin=NewYork&destination=Newark
Response - Yes

Correct URL with wrong city
http://localhost:8080/city/connected?origin=Test&destination=Test
Response - No
