//clear previous local storage
const submitButton = document.getElementById('submit-btn');

submitButton.addEventListener('click', (event) => {

        event.preventDefault();

        const username = document.getElementById("Username").value;
        const password = document.getElementById("Password").value;
        const type = "Student";


        fetch("http://localhost:8080/api/v2/User" ,{
                headers: {
                  "content-type": "application/json",
                  },
                  method: "POST",
                  body: JSON.stringify({
                      username: username,
                      password: password,
                      type:type
                }),
        })
        .then((res) => res.json())
        .then((data)=>{

                console.log(data);

                if(data.validity)
                {
                        const user = JSON.stringify({username: username,password: password, type:type});
                       
                        localStorage.setItem('LoggedInUser', user);

                        window.location.href = `index.html`;
                }
                else 
                {
                        localStorage.removeItem('LoggedInUser');
                        console.log("Wrong Password");
                        
                        window.location.href = `studentlogin.html`;
                }


        })
        .catch((error) => {
                console.log("Error parsing JSON: student page");
        });


})