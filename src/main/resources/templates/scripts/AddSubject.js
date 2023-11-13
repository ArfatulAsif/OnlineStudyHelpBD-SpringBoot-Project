var loggedInUser = localStorage.getItem('LoggedInUser');

var User = JSON.parse(loggedInUser);

if(loggedInUser==null)
{
        window.location.href = 'index.html';
}

const submitButton = document.getElementById('submit-btn');

submitButton.addEventListener('click', (event) => {

        event.preventDefault();

        const subject = document.getElementById("SubjectName").value;

        fetch('http://localhost:8080/api/v2/addsubject',{
                headers: {
                        "content-type": "application/json",
                },
                method: "POST",
                body: JSON.stringify({
                        subjects:subject
                }),
        })
        .then((res)=>res.json())
        .then((data)=>{
                console.log(data);

                window.location.href = 'index.html';
        })
        .catch((error)=>{
                console.log("Error Adding a subject");
        })

        console.log(subject);

       


})
       