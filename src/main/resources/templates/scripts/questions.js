

const urlParams = new URLSearchParams(window.location.search);

const subjects = urlParams.get('subjects');




var loggedInUser = localStorage.getItem('LoggedInUser');


if(loggedInUser!=null)
{

        document.getElementById('TableHeader').innerHTML = "Best Questions For The Subject "+subjects+" Is Available Here";

        fetch('http://localhost:8080/api/v2/question/'+subjects+'')
        .then((res)=>res.json())
        .then((data)=>{

                //console.log(data);

                let text = ``;

                for(let i = 0;i<data.length;i++)
                {
                       
                        let temp = `<tr class="animate__animated animate__bounceInLeft"> <td>${data[i].question}</td></tr>`;

                        text += temp;    

                        
                }
                document.getElementById("allQuestions").innerHTML = text;



        })
        .catch((error)=>{
                console.log("Error getting all the subjects");
        });
        
        


}






const submitButton = document.getElementById('submit-question-btn');

submitButton.addEventListener('click', (event) => {

        event.preventDefault();


        document.getElementById("ChangeMessage").innerHTML =  'Ok sir . Adding a Questions.....';


        window.location.href = `AddQuestion.html?subjects=${subjects}`;



})







