<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!doctype html>
<html lang="en">
<head>
<title>News &mdash; Insert</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="asset/https://fonts.googleapis.com/css?family=Josefin+Sans:300, 400,700"
	rel="stylesheet">

<link rel="stylesheet" href="asset/css/bootstrap.css">
<link rel="stylesheet" href="asset/css/animate.css">
<link rel="stylesheet" href="asset/css/owl.carousel.min.css">

<link rel="stylesheet" href="asset/fonts/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="asset/fonts/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet" href="asset/fonts/flaticon/font/flaticon.css">

<!-- Theme Style -->
<link rel="stylesheet" href="asset/css/style.css">
</head>
<body>



	<header role="banner">
		<div class="top-bar">
			<div class="container">
				<div class="row">
					<div class="col-9 social"></div>
					<div class="col-3 search-top">
						<!-- <a href="#"><span class="fa fa-search"></span></a> -->
						<form action="#" class="search-top-form">
							<span class="icon fa fa-search"></span> <input type="text" id="s"
								placeholder="Type keyword to search...">
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="container logo-wrap">
			<div class="row pt-5">
				<div class="col-12 text-center">
					<a class="absolute-toggle d-block d-md-none" data-toggle="collapse"
						href="#navbarMenu" role="button" aria-expanded="false"
						aria-controls="navbarMenu"><span class="burger-lines"></span></a>
					<h1 class="site-logo">
						<a href="/news/">News</a>
					</h1>
				</div>
			</div>
		</div>

		<nav class="navbar navbar-expand-md  navbar-light bg-light">
			<div class="container">


				<div class="collapse navbar-collapse" id="navbarMenu">
					<ul class="navbar-nav mx-auto">
						<li class="nav-item"><a class="nav-link active"
							href="/news/">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="asset/category.html"
							id="dropdown04" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Category</a>
							<div class="dropdown-menu" aria-labelledby="dropdown04">
								<a class="dropdown-item" href="/news/agenda">Agenda</a> <a
									class="dropdown-item" href="/news/sports">Sports</a> <a
									class="dropdown-item" href="/news/education">Education</a>
								<a class="dropdown-item" href="/news/economy">Economy</a>
							</div></li>
					</ul>

				</div>
			</div>
		</nav>
	</header>
	<!-- END header -->

	<div>


		<table style="with: 75%">
			<tr>
				<td>Date</td>
				<td><input type="text" name="date" id="date" /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><input type="text" name="type" id="type" /></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><textarea class="form form-control" id="content"
						style="height: 200px; width: 100%"></textarea></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><input type="text" name="title" id="title" /></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type="text" name="image" id="image" /></td>
			</tr>
		</table>
		<button class="btn btn-success" style="width: 10%" onclick="addNews()">Insert</button>

		<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

		<h2>News Table</h2>

		<div>
			<table>

				<tr>
					<th>Id</th>
					<th>Date</th>
					<th>Type</th>
					<th>Content</th>
					<th>Title</th>
					<th>Delete</th>					
					<th>Image</th>
					<th></th>
				</tr>

				<c:forEach items="${news}" var="news">

					<tr>
						<td>${news.kkk}</td>
						<td>${news.date}</td>
						<td>${news.type}</td>
						<td>${news.content}</td>
						<td>${news.title}</td>
						<td><a href="deleteNews/${news.kkk}" class="btn btn-default">Delete</a></td>

						<td>${news.image}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<!-- END footer -->
	<!doctype html>




	<!-- loader -->
	<div id="loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke-miterlimit="10" stroke="#f4b214" /></svg>
	</div>

	<script src="asset/js/jquery-3.2.1.min.js"></script>
	<script src="asset/js/jquery-migrate-3.0.0.js"></script>
	<script src="asset/js/popper.min.js"></script>
	<script src="asset/js/bootstrap.min.js"></script>
	<script src="asset/js/owl.carousel.min.js"></script>
	<script src="asset/js/jquery.waypoints.min.js"></script>
	<script src="asset/js/jquery.stellar.min.js"></script>


	<script src="asset/js/main.js"></script>
	<script src="asset/custom/addNews.js"></script>
	<script src="asset/custom/deleteNews.js"></script>
	

</body>
</html>