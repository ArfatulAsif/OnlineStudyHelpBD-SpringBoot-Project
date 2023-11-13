

var loggedInUser = localStorage.getItem('LoggedInUser');

console.log(loggedInUser);

if (loggedInUser != null) {
        //make a GET request to get all the subjects

        let text = ' ';

        fetch("http://localhost:8080/api/v2/subjects")
                .then((res) => res.json())
                .then((data) => {

                        console.log(data);

                        for (let i = 0; i < data.length; i++) {

                                let temp = `<div class="button-89"><button class="button-74" role="button" > <a href="AllQuestions.html?subjects=${data[i].subjects}"> ${data[i].subjects} </a></button></div>`;

                                text += temp;



                        }


                        document.getElementById("All_Subjects").innerHTML = text;


                })
                .catch((error) => {
                        console.log("Error getting all the subjects");
                });




}


const submitButton = document.getElementById('submit-subject-btn');

submitButton.addEventListener('click', (event) => {

        event.preventDefault();

        if (loggedInUser == null) {
                document.getElementById("ChangeMessage").innerHTML = "Hey You Don't Have The Power To do That";

        }
        else {
                var User = JSON.parse(loggedInUser);

                console.log(User);


                if (User.type == "Student") {
                        document.getElementById("ChangeMessage").innerHTML = "Hey You Are a student . You can't do that";
                }
                else {
                        document.getElementById("ChangeMessage").innerHTML = "Ok Sir......";
                        window.location.href = 'AddSubject.html';
                }

        }


})
