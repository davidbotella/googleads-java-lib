
package com.google.api.ads.dfp.jaxws.v201211;

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
@WebServiceClient(name = "PublisherQueryLanguageService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201211/PublisherQueryLanguageService?wsdl")
public class PublisherQueryLanguageService
    extends Service
{

    private final static URL PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION;
    private final static QName PUBLISHERQUERYLANGUAGESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201211", "PublisherQueryLanguageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201211/PublisherQueryLanguageService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION = url;
        PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION = e;
    }

    public PublisherQueryLanguageService() {
        super(__getWsdlLocation(), PUBLISHERQUERYLANGUAGESERVICE_QNAME);
    }

    public PublisherQueryLanguageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PublisherQueryLanguageServiceInterface
     */
    @WebEndpoint(name = "PublisherQueryLanguageServiceInterfacePort")
    public PublisherQueryLanguageServiceInterface getPublisherQueryLanguageServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201211", "PublisherQueryLanguageServiceInterfacePort"), PublisherQueryLanguageServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublisherQueryLanguageServiceInterface
     */
    @WebEndpoint(name = "PublisherQueryLanguageServiceInterfacePort")
    public PublisherQueryLanguageServiceInterface getPublisherQueryLanguageServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201211", "PublisherQueryLanguageServiceInterfacePort"), PublisherQueryLanguageServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION!= null) {
            throw PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION;
        }
        return PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION;
    }

}
