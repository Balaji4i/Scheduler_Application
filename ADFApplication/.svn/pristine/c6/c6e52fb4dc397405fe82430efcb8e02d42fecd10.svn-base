import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import java.util.Map;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import org.json.JSONObject;

import sun.misc.BASE64Decoder;


public class loginClass {
    public loginClass() {
    }

    public String checkLogin() {
        return "validUser";
        //        System.err.println(" +invalid - ");
        //        ADFContext.getCurrent().getSessionScope().put("navigation",
        //                                                      "InvalidUser");
        //        return "invalid";
    }


    //    public String checkLogin() {
    //
    //        String retValu = "invalid";
    //        String valToken = validateToken();
    //        if (valToken.equalsIgnoreCase("valid")) {
    //
    //            try {
    //                String inputEncodedText =
    //                    ADFContext.getCurrent().getPageFlowScope().get("tokens").toString();
    //                String[] xIn = inputEncodedText.split("\\.");
    ////                byte b[] = Base64.decode(xIn[1]);
    //                byte b[] = new BASE64Decoder().decodeBuffer(xIn[1]);
    //                String tempPass = new String(b);
    //                int chkOccurance = tempPass.lastIndexOf("}");
    //                if (chkOccurance < 1) {
    //                    tempPass += "}";
    //                }
    //                JSONObject jo = new JSONObject(tempPass);
    //                long millis = System.currentTimeMillis();
    //                long iatVal = Long.parseLong(jo.get("iat").toString()) * 1000;
    //                long expVal = Long.parseLong(jo.get("exp").toString()) * 1000;
    //                if (millis >= iatVal && millis <= expVal) {
    //                    retValu = "validUser";
    //                } else {
    //                    ADFContext.getCurrent().getSessionScope().put("navigation",
    //                                                                  "InvalidUser");
    //                    retValu = "invalid";
    //                }
    //
    //            } catch (Exception e) {
    //                e.printStackTrace();
    //            }
    //        } else {
    //            ADFContext.getCurrent().getSessionScope().put("navigation",
    //                                                          "InvalidUser");
    //            retValu = "invalid";
    //        }
    //        return "validUser";
    //    }

    public String validateToken() {

        URL url;
        URLConnection connection;
        HttpURLConnection httpConn;
        String outputString = "";
        String jwt =
            ADFContext.getCurrent().getPageFlowScope().get("tokens").toString();
        try {
            //            String wsURL =
            //                "https://egzy-test.fa.em2.oraclecloud.com:443/hcmPeopleRolesV2/UserDetailsService";//AL-MISK
            String wsURL =
                "https://ejds-test.fa.em2.oraclecloud.com:443/hcmPeopleRolesV2/UserDetailsService";
            url = new URL(wsURL);
            connection = url.openConnection();
            httpConn = (HttpURLConnection)connection;
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            String xmlInput =
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:typ=\"http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <typ:findSelfUserDetails/>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

            byte[] buffer = new byte[xmlInput.length()];
            buffer = xmlInput.getBytes();
            bout.write(buffer);
            byte[] b = bout.toByteArray();
            httpConn.setRequestProperty("Content-Type",
                                        "text/xml; charset=utf-8");
            httpConn.setRequestProperty("SOAPAction", "");
            httpConn.setRequestProperty("Authorization", "Bearer " + jwt);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setAllowUserInteraction(true);
            OutputStream out = httpConn.getOutputStream();
            out.write(b);
            out.close();
            httpConn.connect();
            if (httpConn.getResponseCode() == 200) {
                outputString = "Valid";
            } else {
                outputString = "Invalid";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputString;
    }

    Map<Object, Object> sessionMap = ADFContext.getCurrent().getSessionScope();

    public String SaaSUserLogin() {
        String applicationType =
            ADFContext.getCurrent().getPageFlowScope().get("appType") != "" ?
            ADFContext.getCurrent().getPageFlowScope().get("appType").toString() :
            "L";
        getApplicationType(applicationType);
        System.err.println("applicationType==>" + applicationType);
        return "SaaSLogin";
    }

    public void getApplicationType(String appType) {
        if (appType.equalsIgnoreCase("P")) {
//            sessionMap.put("httpPath", "http://omnijcsprod01.omniyat.com:9000");
            ADFContext.getCurrent().getPageFlowScope().put("httpPath", "http://omnijcsprod01.omniyat.com:9000");
        } else {
//            sessionMap.put("httpPath", "https://jcs.omniyat.com:9000");
            ADFContext.getCurrent().getPageFlowScope().put("httpPath", "https://jcs.omniyat.com:9000");
        }
        //        sessionMap.put("dateFormat", DateFormat);
        //    #{sessionScope.httpPath}
        //    #{pageFlowScope.httpPath}    
        System.out.println("==>httpPath<==" +
                           ADFContext.getCurrent().getSessionScope().get("httpPath"));
        
//        =#{sessionScope.httpPath}
//        ==>#{pageFlowScope.httpPath}
//       =#{sessionScope.httpPath}
    }

}



//https://jcs.omniyat.com:9000/lease_test/api/lease/scheduler/start
//https://jcs.omniyat.com:9000/lease_test/api/lease/scheduler/stop
//https://jcs.omniyat.com:9000/lease_test/api/lease/scheduler/status


//#{pageFlowScope.httpPath}/lease_test/api/lease/scheduler/start
//#{pageFlowScope.httpPath}/lease_test/api/lease/scheduler/stop
//#{pageFlowScope.httpPath}/lease_test/api/lease/scheduler/status
