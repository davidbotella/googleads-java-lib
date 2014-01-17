
package com.google.api.ads.dfp.jaxws.v201211;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link Order} objects.
 *       <p>
 *       An order is a grouping of {@link LineItem} objects. Line items have a
 *       one-to-one relationship with orders. Each line item can belong to only one
 *       order. Orders, however, have a one-to-many relationship with line items,
 *       meaning each order can have multiple line items. An order can be used to
 *       manage the line items it contains.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "OrderServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderServiceInterface {


    /**
     * 
     *         Creates a new {@link Order}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Order#advertiserId}</li>
     *         <li>{@link Order#name}</li>
     *         <li>{@link Order#traffickerId}</li>
     *         </ul>
     *         
     *         @param order the order to create
     *         @return the order with its ID filled in
     *       
     * 
     * @param order
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.Order
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "createOrder", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacecreateOrder")
    @ResponseWrapper(localName = "createOrderResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacecreateOrderResponse")
    public Order createOrder(
        @WebParam(name = "order", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Order order)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link Order} objects.
     *         
     *         @param orders the orders to create
     *         @return the created orders with their IDs filled in
     *       
     * 
     * @param orders
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201211.Order>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "createOrders", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacecreateOrders")
    @ResponseWrapper(localName = "createOrdersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacecreateOrdersResponse")
    public List<Order> createOrders(
        @WebParam(name = "orders", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        List<Order> orders)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link Order} uniquely identified by the given ID.
     *         
     *         @param orderId the ID of the order, which must already exist
     *         @return the {@code Order} uniquely identified by the given ID
     *       
     * 
     * @param orderId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.Order
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "getOrder", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacegetOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacegetOrderResponse")
    public Order getOrder(
        @WebParam(name = "orderId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Long orderId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link OrderPage} of {@link Order} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Order#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link Order#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Order#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Order#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code salespersonId}</td>
     *         <td>{@link Order#salespersonId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link Order#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Order#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code traffickerId}</td>
     *         <td>{@link Order#traffickerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Order#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of orders
     *         @return the orders that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.OrderPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "getOrdersByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacegetOrdersByStatement")
    @ResponseWrapper(localName = "getOrdersByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfacegetOrdersByStatementResponse")
    public OrderPage getOrdersByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Order} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param orderAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of orders
     *         @return the result of the action performed
     *       
     * 
     * @param orderAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "performOrderAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceperformOrderAction")
    @ResponseWrapper(localName = "performOrderActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceperformOrderActionResponse")
    public UpdateResult performOrderAction(
        @WebParam(name = "orderAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        OrderAction orderAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Order}.
     *         
     *         @param order the order to update
     *         @return the updated order
     *       
     * 
     * @param order
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201211.Order
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "updateOrder", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceupdateOrder")
    @ResponseWrapper(localName = "updateOrderResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceupdateOrderResponse")
    public Order updateOrder(
        @WebParam(name = "order", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        Order order)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Order} objects.
     *         
     *         @param orders the orders to update
     *         @return the updated orders
     *       
     * 
     * @param orders
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201211.Order>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
    @RequestWrapper(localName = "updateOrders", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceupdateOrders")
    @ResponseWrapper(localName = "updateOrdersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211", className = "com.google.api.ads.dfp.jaxws.v201211.OrderServiceInterfaceupdateOrdersResponse")
    public List<Order> updateOrders(
        @WebParam(name = "orders", targetNamespace = "https://www.google.com/apis/ads/publisher/v201211")
        List<Order> orders)
        throws ApiException_Exception
    ;

}
