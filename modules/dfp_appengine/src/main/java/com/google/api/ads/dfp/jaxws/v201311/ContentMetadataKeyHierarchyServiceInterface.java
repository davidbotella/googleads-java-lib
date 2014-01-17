
package com.google.api.ads.dfp.jaxws.v201311;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for retrieving {@link ContentMetadataKeyHierarchy} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContentMetadataKeyHierarchyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContentMetadataKeyHierarchyServiceInterface {


    /**
     * 
     *         Gets a {@link ContentMetadataKeyHierarchyPage} of {@link ContentMetadataKeyHierarchy}
     *         objects that satisfy the given {@link Statement#query}. The following fields are supported
     *         for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#name}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         content metadata key hierarchies
     *         @return the content metadata key hierarchies that match the given filter
     *         @throws ApiException if the ID of the active network does not exist or there is a
     *         backend error
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.ContentMetadataKeyHierarchyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getContentMetadataKeyHierarchiesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ContentMetadataKeyHierarchyServiceInterfacegetContentMetadataKeyHierarchiesByStatement")
    @ResponseWrapper(localName = "getContentMetadataKeyHierarchiesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ContentMetadataKeyHierarchyServiceInterfacegetContentMetadataKeyHierarchiesByStatementResponse")
    public ContentMetadataKeyHierarchyPage getContentMetadataKeyHierarchiesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
