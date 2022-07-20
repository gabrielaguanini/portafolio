<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- EDITAR PERSONA--%>     
   <h4>INGRESE EL ID DE LA PERSONA A EDITAR</h4>      
   <form action="SvEditar" method="POST">
	
    	<p><label>ID:</label><input type="text" name="id_editar"></p>
                
        <p>------------------------------------------------------</p>
    <h4>INGRESE LOS DATOS DE LA PERSONA A EDITAR</h4>  
        <p><label>Dni:</label><input type="text" name="dni2"></p>  
	<p><label>Nombre:  </label><input type="text" name="nombre2"></p>
	<p><label>Apellido: </label><input type="text" name="apellido2"></p>
	<p><label>Teléfono: </label><input type="text" name="telefono2"></p>
        
        
        
        <button type="submit">Editar</button>
</form>
    
    
</form>
    </body>
</html>
