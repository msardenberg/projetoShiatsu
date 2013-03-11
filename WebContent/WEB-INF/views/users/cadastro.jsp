<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<sf:form modelAttribute="usuario" action="cadastro">
	<label for="email">Email:</label>
	<sf:input path="email" />
	<label for="password">Senha:</label>
	<sf:password path="password" />
	<input type="submit" value="Cadastrar" />
</sf:form>