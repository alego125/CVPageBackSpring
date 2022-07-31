# BackEnd Proyecto Argentina Programa
jwt security api REST 
basic CRUD with JWT authentication based on roles

Creacion de backend con springboot y spring security

# Manejo de END POINTS

### Crear nuevo usuario y Login

*/auth/nuevo

* Los roles de usuario los genera por defecto solo se debe indicar el role admin

{
    "nombre":"",
    "nombreUsuario":"",
    "email":"",
    "password":"",
    "roles":["admin"],
    "apellido":""
}

*/auth/login

{    
    "nombreUsuario":"",
    "password":""    
}

### EndPoints Usuario

* Obtenemos todos los usuarios de la base de datos

*/user/get

* Actualizamos el usuario con el id indicado

*/user/updateUser/{id}

* Buscamos el usuario con el id indicado

*/user/buscar/{id}

* Buscamos usuario por userName

*/user/buscarPorUserName/{userName}

### EndPoints Skills

* Obtener todos los skills

*/skill/get

* Crear nuevo skill

*/skill/create

{
    "nombreSkill":"",
    "porcentaje":
}

* Eliminar skill

*/skill/delete/{id}

* Buscar por id

*/skill/searchById/{id}

* Actualizar skill

*/skill/update

{
    "idSkill":
    "nombreSkill":"",
    "porcentaje":
}

### EndPoint Redes

* Obtener las redes

*/red/get

* Obtener red por el id de usuario

*/red/getByUser/{id}

* Actualizar Red

*/red/update

{
    "idRed":,
    "link":"",
    "nombreRed":"",
    "idUser":""
}

* Crear nueva red

*/red/create

{
    "link":"",
    "nombreRed":"",
    "idUser":""
}

### EndPoints Proyectos

* Obtener todos los proyectos

*/proyecto/get

* Crear proyecto

*/proyecto/create

{
    "tituloProyecto":"",
    "descripcion":"",
    "fechaInicio":"",
    "fechaFin":"",
    "idUser":
}

* Borrar proyecto

*/proyecto/delete/{id}

* Actualizar proyecto

*/proyecto/update

{
    "idProyecto":,
    "tituloProyecto":"",
    "descripcion":"",
    "fechaInicio":"",
    "fechaFin":"",
    "idUser":
}

### EndPoint Provincias

* Obtener todas las provincias

*/provincia/get

* Obtener las provincias por id

*/provincias/get/{id}

### EndPoint Pais

* Obtener todos los paises

*/pais/get

* Obtener pais por id

*/pais/get/{id}

### EndPoint Nombre Redes

* Obtener nombre redes

*/nombreRedes/get

* Obtener nombre red por id

*/nombreRedes/get/{id}

### EndPoint Institucion

* Obtener Institucion
  
*/institucion/get

* Obtener institucion por id

*/institucion/searchById/{id}

### EndPoint Experiencia

* Obtener experiencias

*/experiencias/get

* Crear nueva experiencia

*/experiencia/create

{
    "nombreEmpresa": "",
    "descripcionTareas": "",
    "fechaInicio": "año-mes-dia",
    "fechaFin": "año-mes-dia",
    "idUser": ,
    "urlImagen": ""
}

* Borrar experiencia

*/experiencia/delete/{id}

* Actualizar experiencia

*/experiencia/update

{
    "idExperiencia":,
    "nombreEmpresa": "",
    "descripcionTareas": "",
    "fechaInicio": "año-mes-dia",
    "fechaFin": "año-mes-dia",
    "idUser": ,
    "urlImagen": ""
}

### EndPoint Educacion

* Obtener todas las educaciones

*/educacion/get

* Crear educacion

*/educacion/create

{
        "nombreTitulo": "",
        "imagenInstitucion": "",
        "fechainicio": "año-mes-dia",
        "fechaFin": "año-mes-dia",
        "idUser": ,
        "institucion": {
            "idInstitucion": ,
            "nombreInstitucion": ""
        }
}

* Borrar educacion

*/educacion/delete/{id}

* Actualizar educacion

*/educacion/update

{
    "idEducacion":,
    "nombreTitulo": "",
    "imagenInstitucion": "",
    "fechainicio": "año-mes-dia",
    "fechaFin": "año-mes-dia",
    "idUser": ,
    "institucion": {
        "idInstitucion": ,
        "nombreInstitucion": ""
    }
}

### EndPoint Domicilio

* Obtener los domicilios

*/domicilio/get

* Obtener domicilio por id

*/domicilio/get/{id}

* Agregar domicilio

*/domicilio/agregarDomicilio

{
    "calle":"",
    "numero":"",
    "piso":"",
    "departamento":"",
    "ciudad":{
        "idCiudad":,
        "nombreCiudad":"",
        "provincia":{
            "idProvincia":,
            "nombreProvincia":"",
            "pais":{
                "idPais":,
                "nombrePais":""
            }
        }
    }
}

### EndPoint Ciudad

* Obtener todas las ciudades

*/ciudad/get

* Obtener ciudad por id

*/ciudad/get/{id}

* Obtener por provincia

*/ciudad/getByCiudad/{id}
