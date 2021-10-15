const url = "http://localhost:8080/p1/"

document.getElementById("allClientButton").addEventListener("click", getInfoFunc);
document.getElementById("loginButton").addEventListener("click", LoginFunc);
document.getElementById("addClientButton").addEventListener("click", addNewClient);
document.getElementById("clientByIDButton").addEventListener("click", findClientById)
async function getInfoFunc(){       //fill table function
    let response = await fetch(url + "clients", {credentials:"include"}) //add url in the parenthesis

    if (response.status === 200){
        let data = await response.json();
        for (let clients of data){
            let row = document.createElement("tr");

            let cell = document.createElement("td");
            cell.innerHTML = clients.policy_id;   //policy id
            row.appendChild(cell);

            let cell2 = document.createElement("td");
            cell2.innerHTML = clients.first_name;  //first name
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = clients.last_name;   //last name
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = clients.deductable;  //deductiable
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = clients.home_location;  //home location
            row.appendChild(cell5);  

            let cell6 = document.createElement("td");
            cell5.innerHTML = clients.home_location;  //home location
            row.appendChild(cell6);  

            let cell7 = document.createElement("td");
            cell5.innerHTML = clients.home_location;  //home location
            row.appendChild(cell7);  

            let cell8 = document.createElement("td")
            cell5.innerHTML = clients.home_location;  //home location
            row.appendChild(cell8);  
            document.getElementById("clientsBody").appendChild(row);
            }  
        }


        
}

async function LoginFunc(){    //login with credentials
    let usern = document.getElementById("username").value;
    let userp = document.getElementById("password").value;
    let user = {
        username:usern,
        password:userp
    }
    let response = await fetch(url + "login",{method: "POST", body: JSON.stringify(user), credentials:"include"})
    if (response.status == 401){
        alert("Please Leave >:(")
    }

}
async function addNewClient(){
    let newClient = {
        first_name: document.getElementById("newFirstName").value,
        last_name: document.getElementById("newLastName").value,
        deductable: document.getElementById("newDeductable").value,
        home_location: document.getElementById("newStreetName/Number").value
    }
    let response = await fetch(url + "clients", {method: "POST",body: JSON.stringify(newClient), credentials: "include"})
    
}
async function findClientById(){

}