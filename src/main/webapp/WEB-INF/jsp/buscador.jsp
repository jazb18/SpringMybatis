<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>searcher</title>
  </head>

  <body>

    <!-- Begin page content -->
    <div class="container">
    	<form action="" id="formDatos" method="post">
    		<table>
    			<tr>
    				<td><label >Nombre</label></td>
    				<td><input type="text" name="nombre"></td>
    			</tr>
    			<tr>
    				<td><label>email</label></td>
    				<td><input type="text" name="email"></td>
    			</tr>
    			<tr>
    				<td><label>telefono</label></td>
    				<td><input type="text" name="phone"></td>
    			</tr>

    		</table>
    		<div class="btn-group" role="group" aria-label="Guardar">
    			<button type="input" name="btnEnviar" id="btnEnviar" class="btn btn-success">Guardar</button>
    		</div>		
    	</form>
    </div>
  </body>
  
</html>
