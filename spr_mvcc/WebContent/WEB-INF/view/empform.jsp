<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<body>
<h1>Add New Employee</h1>
<form:form method="post" action="save">
Id:<form:input path="id"/>
Name:<form:input  path="name"/>
Salary:<form:input  path="salary"/>
Designation:<form:input type="text" path="desig"/>
<input type="submit" value="click to save" />


</form:form>


</body>
</html>