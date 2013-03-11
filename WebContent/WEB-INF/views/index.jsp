<!DOCTYPE html>
<html>
	<head>
		<title>Veiculos</title>
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
				<label>
					<form  class="form-inline" action="j_spring_security_check" method="post">
						<div class="pull-right">
							<input type="text" class="input-email" placeholder="Email" name='j_username'>
							<input type="password" class="input-medium" placeholder="Password" name='j_password'>
							<label>
								<button type="submit" class="btn btn-small">Sign in</button>
							</label>
						</div> 	
					</form>
				</label>
			</div>
		</div>

		 <div class="container well">
			    <div class="hero-unit">
    				<h1>Cadastro</h1>
    				<div class="span5">
    				    <form class="form-horizontal" action="cadastro" method="post">
    						<p>Email</p>
    						<input type="text" class="input-email" placeholder="Email" name=email id=email>
     						<p>Password</p>
    						<input type="password" class="input-Password" placeholder="Password" name=password id=password>
    							<div class="pull-right"> <input type="submit" class="btn btn-primary btn-large" value="Enviar"></div>
    						</div>	
    				</div>
    			</div>
		</div>

	</body>
</html>