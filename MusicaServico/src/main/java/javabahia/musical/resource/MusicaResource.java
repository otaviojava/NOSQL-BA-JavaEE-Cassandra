
package javabahia.musical.resource;

import java.io.*;
import java.util.List;
import javabahia.musical.model.Musica;
import javabahia.musical.service.MusicaService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author otavio
 */
@Path(value="musica")
@RequestScoped
public class MusicaResource implements Serializable{
    
    @Inject
    private MusicaService musicaService;
       
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public List<Musica> getMusicas(){
    return musicaService.listar();
    }
    
 
   
  @Path("{nome}")
  @GET 
  @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
  public Musica getMusica(@PathParam("nome") String nome) {
    return musicaService.recuperar(nome);
}

@POST 
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public String addAlbum(Musica musica) {
    
    if(musicaService.criar(musica)){
    return musica.getNomeMusica() + " adicionado!";
    }else{
   return musica.getNomeMusica() + " não adicionando!";
    }
}



@Path("{nome}") 
@DELETE
@Produces(MediaType.TEXT_PLAIN)
public String removeAlbum(@PathParam("nome") String nome) {
    musicaService.removerChave(nome);
    return "Musica removida."; 
}

@Path("update/{nome}")
@GET 
@javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
public String updateAlbum(@PathParam("nome") String nome ,@QueryParam("cantor") String cantor,@QueryParam("album") String album,@QueryParam("lancamento") Integer lancamento) {
       Musica musica = new Musica();
       musica.setNomeMusica(nome);
       musica.setCantor(cantor);
       musica.setLancamento(lancamento);
       musica.setAlbum(album);
       if(musicaService.criar(musica)){
           return nome+"  Adicionado com sucesso!";
       }
    return  nome+"  não adicionado!";
}
   
    
}
