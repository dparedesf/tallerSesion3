package helper;

public class EndPointOwasp {
    public static final String OWASP_HOST="http://localhost:8888";
    public static final String START_VULNERABILITY="/JSON/ascan/action/scan/?url=https%3A%2F%2Ftodoist.com%2Fes&recurse=&inScopeOnly=&scanPolicyName=&method=&postData=&contextId=";
    public static final String GET_PROGRESS="/JSON/ascan/view/status/?scanId=";
    public static final String GENERATE_HTML_REPORT="/OTHER/core/other/htmlreport/?";
    public static final String TYPE_ATTAKS="/HTML/ascan/view/scanProgress/?scanId=";

}
