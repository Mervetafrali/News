<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!doctype html>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<html lang="en">
<head>
<title>News &mdash;</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="${pageContext.request.contextPath}/asset/https://fonts.googleapis.com/css?family=Josefin+Sans:300, 400,700"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/animate.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/owl.carousel.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/fonts/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/fonts/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/fonts/flaticon/font/flaticon.css">

<!-- Theme Style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/asset/css/style.css">
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
						<li class="nav-item"><a class="nav-link active" href="/news/">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="asset/category.html"
							id="dropdown04" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">Category</a>
							<div class="dropdown-menu" aria-labelledby="dropdown04">
								<a class="dropdown-item"
									href="${pageContext.request.contextPath}/asset/category.html">Agenda</a>
								<a class="dropdown-item"
									href="${pageContext.request.contextPath}/asset/category.html">Sports</a>
								<a class="dropdown-item"
									href="${pageContext.request.contextPath}/asset/category.html">Education</a>
								<a class="dropdown-item"
									href="${pageContext.request.contextPath}/asset/category.html">Economy</a>
							</div></li>
					</ul>

				</div>
			</div>
		</nav>
	</header>
	<!-- END header -->

	<section class="site-section py-lg">
		<div class="container">

			<div class="row blog-entries">
				<div class="col-md-12 col-lg-8 main-content">
					<h1 class="mb-4">${news.title}</h1>
					<div class="post-meta">
						<span class="category">${news.type}</span> <span class="mr-2"><i
							class="material-icons">today</i>${news.date}</span> &bullet;
					</div>
					<div class="post-content-body">
						<p></p>

						<div class="row mb-5">
							<div class="col-md-12 mb-4 element-animate">
								<img src="${news.image}" alt="Image placeholder"
									class="img-fluid">

							</div>
							<div id="demo">
								<a href="/news/likes/${news.kkk}"><span class="likes"><i
									class="glyphicon glyphicon-thumbs-up"></i>${news.likes}</span>

								<a href="/news/dislikes/${news.kkk}"><span class="dislikes"><i
									class="glyphicon glyphicon-thumbs-down" ></i>${news.dislikes}</span>

								<a></a><span class="views"><i class="material-icons">visibility</i>${news.views}</span>


							</div>
							<textarea class="form form-control" id="content"
								style="height: 400px; width: 100%; cursor: default;"
								placeholder="${news.content}" disabled="disabled"></textarea>

						</div>
					</div>


					<div class="pt-5"></div>


				</div>

				<!-- END main-content -->


				<!-- loader -->
				<div id="loader" class="show fullscreen">
					<svg class="circular" width="48px" height="48px">
						<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
							stroke-width="4" stroke="#eeeeee" />
						<circle class="path" cx="24" cy="24" r="22" fill="none"
							stroke-width="4" stroke-miterlimit="10" stroke="#f4b214" /></svg>
				</div>

				<script
					src="${pageContext.request.contextPath}/asset/js/jquery-3.2.1.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/jquery-migrate-3.0.0.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/popper.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/bootstrap.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/owl.carousel.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/jquery.waypoints.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/js/jquery.stellar.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/asset/custom/blog.js"></script>
				<script src="${pageContext.request.contextPath}/asset/js/main.js"></script>
			
</body>
</html>