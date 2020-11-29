package clientAPI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends HttpRequest{

    @Override
    public CustomResponse send(String url, String body) {
        Response response;
        response = this.client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get();

        CustomResponse customResponse= new CustomResponse();
        customResponse.setResponseBody(response.readEntity(String.class));
        customResponse.setResponseCode(response.getStatus()+"");

        response.close();
        return customResponse;

    }
}