<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Municipios</title></head>
<body>
<table>
<tr>
  <th align="left">Codigo</th><th align="left">Nombre</th><th align="left">Comarca</th>
<tr>
<c:forEach items="${towns}" var="town">
<tr>
  <td>${town.codigo}</td><td>${town.nombre}</td><td>${town.region.nombre}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
