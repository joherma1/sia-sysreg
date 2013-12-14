<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Users</title></head>
<body>
<table>
<tr>
  <th align="left">Codigo</th><th align="left">Nombre</th><th align="left">Comarca</th>
<tr>
<c:forEach items="${municipios}" var="municipio">
<tr>
  <td>${municipio.codigo}</td><td>${municipio.nombre}</td><td>${municipio.comarca.nombre}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
