package com.fincore.cbpcarrierwebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-04T14:48:58.688Z
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "CarrierService", 
                  wsdlLocation = "file:/C:/workspaces/egar-microservices/egar-submission-api/src/main/resources/wdsl/UAT_eBorders_Carrier_web_service_WSDL.XML",
                  targetNamespace = "http://fincore.com/CBPCarrierWebService/") 
public class CarrierService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://fincore.com/CBPCarrierWebService/", "CarrierService");
    public final static QName CarrierWcfWebServiceHttp = new QName("http://fincore.com/CBPCarrierWebService/", "CarrierWcfWebService.Http");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/workspaces/egar-microservices/egar-submission-api/src/main/resources/wdsl/UAT_eBorders_Carrier_web_service_WSDL.XML");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CarrierService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/workspaces/egar-microservices/egar-submission-api/src/main/resources/wdsl/UAT_eBorders_Carrier_web_service_WSDL.XML");
        }
        WSDL_LOCATION = url;
    }

    public CarrierService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CarrierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CarrierService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CarrierService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CarrierService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CarrierService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ICarrierService
     */
    @WebEndpoint(name = "CarrierWcfWebService.Http")
    public ICarrierService getCarrierWcfWebServiceHttp() {
        return super.getPort(CarrierWcfWebServiceHttp, ICarrierService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICarrierService
     */
    @WebEndpoint(name = "CarrierWcfWebService.Http")
    public ICarrierService getCarrierWcfWebServiceHttp(WebServiceFeature... features) {
        return super.getPort(CarrierWcfWebServiceHttp, ICarrierService.class, features);
    }

}
