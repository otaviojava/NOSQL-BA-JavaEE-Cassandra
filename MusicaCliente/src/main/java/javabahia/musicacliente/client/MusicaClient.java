package javabahia.musicacliente.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

/**
 * Jersey REST client generated for REST resource:MusicaResource [musica]<br>
 *  USAGE:
 * <pre>
 *        MusicaClient client = new MusicaClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author otavio
 */
@RequestScoped
public class MusicaClient implements Serializable{
    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/MusicaServico/resources";

    public MusicaClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("musica");
    }

    public String updateAlbum(String nome, String album, String lancamento, String cantor) throws UniformInterfaceException {
        WebResource resource = webResource;
        if (album != null) {
            resource = resource.queryParam("album", album);
        }
        if (lancamento != null) {
            resource = resource.queryParam("lancamento", lancamento);
        }
        if (cantor != null) {
            resource = resource.queryParam("cantor", cantor);
        }
        resource = resource.path(java.text.MessageFormat.format("update/{0}", new Object[]{nome}));
        return resource.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public <T> T getMusica(Class<T> responseType, String nome) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{nome}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public String addAlbum(Object requestEntity) throws UniformInterfaceException {
        return webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(String.class, requestEntity);
    }

    public String removeAlbum(String nome) throws UniformInterfaceException {
        return webResource.path(java.text.MessageFormat.format("{0}", new Object[]{nome})).delete(String.class);
    }

    public <T> T getMusicas(Class<T> responseType) throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.destroy();
    }
    
}
