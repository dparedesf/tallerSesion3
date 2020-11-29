package clientAPI;

public class FactoryRequest {

    public static final String GET="get";
    public static final String PUT="put";
    public static final String POST="post";
    public static final String DELETE="delete";


    public static HttpRequest make(String typeRequest){
        HttpRequest request;

        switch (typeRequest.toLowerCase()){
            case GET:
                request = new RequestGET();
                break;
            case PUT:
                request = new RequestPUT();
                break;
            case POST:
                request= new RequestPOST();
                break;
            case DELETE:
                request= new RequestDELETE();
                break;
            default:
                request= new RequestDELETE();
                break;

        }
        return request;
    }
}