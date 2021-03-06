## Building Full-Stack Web Apps

### Author: Hai Le

#### Running the App

* In command line run `./gradlew bootRun`

* Open your web browser and go to localhost:8080 to get to the home page, which now will redirect straight to albums page.

* localhost:8080/hello/{params} for the hello page, you can enter the params to get back a custom hello page to your name.

* localhost:8080/capitalize/{params} for the capitalize page.

* localhost:8080/albums for the albums page, which renders an database of albums to the page using thymeleaf.
    * albums route also have a form for users able to add their favorite album to the database.
    * user should be able to see information about all the songs on the site.
    * user should be able to add songs to an album.
    

#### Test
* Tested the constructor, getter and setter methods for happy paths.

* Would test for invalid inputs, and test database for correct data.

