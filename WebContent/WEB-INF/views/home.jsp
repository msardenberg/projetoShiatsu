<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Shiastu Ideais</title>
		<style>
			body {background-color:#FAFFFF !important;}
			p {color:white;}
			h1 {color:white;}
		</style>

		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	</head>
	<body>
		<div class="navbar navbar-inverse fixed-top">
			<div class="navbar-inner">
				<div class="span2">
					<div class="pull-left">
						<h1>Shiatsu</h1>
					</div>
				</div>
			</div>
		</div>

		<div class="span2">
			<div class="span2 well">
				<img src="../img/28339236.jpg" class="img-rounded"></img>
				<div class="">
					<ul class="nav nav-pills nav-stacked">
						<li class="active">
							<p class="text-center"><strong>Nome</strong></p>
							<a href=<c:url value='/j_spring_security_logout'/>><p class="text-center"><i class="icon-eject icon-white"></i> <strong>  Sair</strong></p></a></li>
					</ul>
				</div>
			</div>
		</div>
	</body>
</html>