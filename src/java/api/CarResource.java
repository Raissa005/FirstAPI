package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("car")
public class CarResource {
    //HTTP://LOCALHOST:8084/FirstAPI/V1/CAR/INSERIR
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
            
    public Response registerCar(){
        return Response.status(Response.Status.CREATED).entity(new String("CREATE CAR")).build();
    }
    
    @GET //RETORNA INFORMAÇÕES
    @Produces(MediaType.APPLICATION_JSON) //PRODUZ INFORMAÇÕESS E RETOTNA
    
    public String searchCar(){
        return "Search car";
    }
}
