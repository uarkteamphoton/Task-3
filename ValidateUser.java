/* Task 3 - Joshua Shackleton

Task: Building a method to validate user input on form submission
	Additionally:
		Validate EmployeeID is numeric, not blank
		Validate password is not blank

*/

//====== onSubmit event function call =========//
<form onsubmit="myFunction()">
  Enter name: <input type="text">
  <input type="submit">
</form> 

//====== onSubmit method =======\\

function validateProperties() {
	//Store employeeID and password in variables to easily use them later
	var employeeID = document.getElemenyByID("employeeID").value;
	var password - document.getElementByID("password").value;	
	//is EmployeeID blank
	if (StringUtils.isBlank(this.apiEmployee.getEmployeeID())) {
		throw new UnprocessableEntityException("employee id");
	}
	//is Password blank
	if (StringUtils.isBlank(this.apiEmployee.getPassword())) {
		throw new UnprocessableEntityException("password");
	}
	//is EmployeeID numeric
	if (StringUtils.isBlank(this.apiEmployee.getPassword())) {
		throw new UnprocessableEntityException("password");
	}
}

