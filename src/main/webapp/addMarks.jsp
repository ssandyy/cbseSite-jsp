<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.DAO.StudentDaoImp"%>
<%@ page import="com.entities.Student"%>

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>


<body>
	<%@ include file="all_component/navbar.jsp"%>
	
	<form>
		<div class="container py-5">
			<h1 class="text-center">Add Student Marks</h1>
			<br />
			<div id="success" class="alert alert-success close"
				style="display: none;"></div>
			<fieldset>
				<div class="row py-5">
					<div class="col">
						<label for="searchDropdown">Select Student</label> <select
							id="searchDropdown" required class="form-control" name="studentid">
							<option value=""></option>

							<%
							StudentDaoImp dimp = new StudentDaoImp();
							List<Student> list = dimp.getAllStudentsDetails();

							for (Student d : list) {
							%>
							<option value="<%=d.getStudentId()%>">
								<%=d.getFirstName() + "" + d.getLastName()%>
							</option>
							<%
							}
							%>

						</select>
					</div>

					<div class="col">
						<label>Select Student Class</label> 
						<select id="searchDropdown2" required class="form-control" name="classid">
							<option value=""></option>
							<%
							StudentDaoImp dimp2 = new StudentDaoImp();
							List<Student> list2 = dimp2.getAllStudentsDetails();

							for (Student d : list2) {
							%>
							<option value="<%=d.getStudentId()%>">
								<%=d.getClassId()%>
							</option>
							<%
							}
							%>
						</select>
					</div>
				</div>
			</fieldset>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col" colspan="6" class="text-center">Insert
							Student Marks</th>
					</tr>
					<tr name="subjectid">
						<th value="hi">Hindi</th>
						<th value="eng">English</th>
						<th value="maths">Maths</th>
						<th value="sc">Science</th>
						<th value="sst">Social Science</th>
				</thead>
				<tbody>
					<tr name="marks">
						<td><input type="number" id="hindi" class="form-control"
							placeholder="hindi" min="0" max="100" required></td>
						<td><input type="number" id="english" class="form-control"
							placeholder="english" min="0" max="100" required></td>
						<td><input type="number" id="maths" class="form-control"
							placeholder="maths" min="0" max="100" required></td>
						<td><input type="number" id="science" class="form-control"
							placeholder="science" min="0" max="100" required></td>
						<td><input type="number" id="socialscience"
							class="form-control" placeholder="Social Science" min="0"
							max="100" required></td>
					</tr>
					<tr>
						<td colspan="6">
							<div class="d-grid col-6 mx-auto gap-2">
								<input type="submit" id="save" class="btn btn-primary"
									name="save" value="Insert Data"> <input type="reset"
									id="reset" class="btn btn-danger" name="reset" value="Reset" />
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- <div class="py-5"></div>
			<table class="table table-bordered">
				<tr>
					<td><strong>Name:</strong></td>
					<td id="txtname"></td>
				</tr>
				<tr>
					<td><strong>Class:</strong></td>
					<td id="txtclass"></td>
				</tr>
			</table>
			<div class="text-success py-3">
				<hr>
			</div>
			<table class="table table-bordered">
				<th>Subject</th>
				<th>Marks</th>
				<tr>
					<td>English</td>
					<td id="txtEnglish"></td>
				</tr>
				<tr>
					<td>Tamil</td>
					<td id="txttamil"></td>
				</tr>
				<tr>
					<td>Hindi</td>
					<td id="txthindi"></td>
				</tr>
				<tr>
					<td>Computer</td>
					<td id="txtcomputer"></td>
				</tr>
				<tr>
					<td>History</td>
					<td id="txthistory"></td>
				</tr>
				<tr>
					<td>Science</td>
					<td id="txtscience"></td>
				</tr>
				<tr>
					<td class="text-center"><b>Total</b></td>
					<td id="txttotal"></td>
				</tr>
				<tr>
					<td class="text-center"><b>Results</b></td>
					<td id="txtresult"></td>
				</tr>
			</table>
		</div> -->
	</form>
	<%@ include file="all_component/footer.jsp"%>
</body>
</html>