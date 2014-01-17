
package com.google.api.ads.dfp.jaxws.v201306;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "LineItemCreativeAssociationService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201306/LineItemCreativeAssociationService?wsdl")
public class LineItemCreativeAssociationService
    extends Service
{

    private final static URL LINEITEMCREATIVEASSOCIATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException LINEITEMCREATIVEASSOCIATIONSERVICE_EXCEPTION;
    private final static QName LINEITEMCREATIVEASSOCIATIONSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemCreativeAssociationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201306/LineItemCreativeAssociationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LINEITEMCREATIVEASSOCIATIONSERVICE_WSDL_LOCATION = url;
        LINEITEMCREATIVEASSOCIATIONSERVICE_EXCEPTION = e;
    }

    public LineItemCreativeAssociationService() {
        super(__getWsdlLocation(), LINEITEMCREATIVEASSOCIATIONSERVICE_QNAME);
    }

    public LineItemCreativeAssociationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns LineItemCreativeAssociationServiceInterface
     */
    @WebEndpoint(name = "LineItemCreativeAssociationServiceInterfacePort")
    public LineItemCreativeAssociationServiceInterface getLineItemCreativeAssociationServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemCreativeAssociationServiceInterfacePort"), LineItemCreativeAssociationServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LineItemCreativeAssociationServiceInterface
     */
    @WebEndpoint(name = "LineItemCreativeAssociationServiceInterfacePort")
    public LineItemCreativeAssociationServiceInterface getLineItemCreativeAssociationServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemCreativeAssociationServiceInterfacePort"), LineItemCreativeAssociationServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LINEITEMCREATIVEASSOCIATIONSERVICE_EXCEPTION!= null) {
            throw LINEITEMCREATIVEASSOCIATIONSERVICE_EXCEPTION;
        }
        return LINEITEMCREATIVEASSOCIATIONSERVICE_WSDL_LOCATION;
    }

}
