

const urlParams = new URLSearchParams(window.location.search);

const subjects = urlParams.get('subjects');




var loggedInUser = localStorage.getItem('LoggedInUser');

var User = JSON.parse(loggedInUser);

if(loggedInUser==null)
{
        window.location.href = 'index.html';
}

const submitButton = document.getElementById('submit-btn');

submitButton.addEventListener('click', (event) => {

        event.preventDefault();

        const question = document.getElementById("QuestionName").value;

        

        fetch('http://localhost:8080/api/v2/addQuestion',{
                headers: {
                        "content-type": "application/json",
                },
                method: "POST",
                body: JSON.stringify({
                        question:question,
                        subjects:subjects
                }),
        })
        .then((res)=>res.json())
        .then((data)=>{
                console.log(data);
                
                window.location.href = `AllQuestions.html?subjects=${subjects}`;
        })
        .catch((error)=>{
                console.log("Error Adding a subject");
        })

        console.log(subjects);

       


})
       