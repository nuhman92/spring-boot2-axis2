/**
 * TroubleshootWebServiceFSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.sillycat.springbootaxis.service.axis2.generated;

import java.util.UUID;

import com.intuit.developer.ArrayOfString;
import com.intuit.developer.AuthenticateResponse;
import com.intuit.developer.ServerVersionResponse;

/**
 * TroubleshootWebServiceFSSkeleton java skeleton for the axisService
 */
public class TroubleshootWebServiceFSSkeleton implements TroubleshootWebServiceFSSkeletonInterface {
	/**
	 * Auto generated method signature This web method facilitates web service to
	 * handle connection error between QBWC and QB
	 * 
	 * @param connectionError0
	 * @return connectionErrorResponse1
	 */
	public com.intuit.developer.ConnectionErrorResponse connectionError(
			com.intuit.developer.ConnectionError connectionError0) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#connectionError");
	}

	/**
	 * Auto generated method signature This web method facilitates web service to
	 * send request XML to QuickBooks via QBWebConnector
	 * 
	 * @param sendRequestXML2
	 * @return sendRequestXMLResponse3
	 */
	public com.intuit.developer.SendRequestXMLResponse sendRequestXML(
			com.intuit.developer.SendRequestXML sendRequestXML2) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#sendRequestXML");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param serverVersion4
	 * @return serverVersionResponse5
	 */
	public com.intuit.developer.ServerVersionResponse serverVersion(com.intuit.developer.ServerVersion serverVersion4) {
		// TODO : fill this with the necessary business logic
//        throw new java.lang.UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#serverVersion");
		System.out.println("enter the request-----------serverVersion");
		ServerVersionResponse response = new ServerVersionResponse();
		response.setServerVersionResult("1.0");
		return response;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getLastError6
	 * @return getLastErrorResponse7
	 */
	public com.intuit.developer.GetLastErrorResponse getLastError(com.intuit.developer.GetLastError getLastError6) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getLastError");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param authenticate8
	 * @return authenticateResponse9
	 */
	public com.intuit.developer.AuthenticateResponse authenticate(com.intuit.developer.Authenticate authenticate8) {
		// TODO : fill this with the necessary business logic
//        throw new java.lang.UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#authenticate");
		System.out.println("enter the request-----------authenticate");
		System.out.println("authenticate8:" + authenticate8);
		System.out.println("getStrUserName:" + authenticate8.getStrUserName());
		System.out.println("getStrPassword:" + authenticate8.getStrPassword());
		AuthenticateResponse response = new AuthenticateResponse();
		System.out.println("step1");
		ArrayOfString arr = new ArrayOfString();
		System.out.println("step2");
		arr.getString().add(UUID.randomUUID().toString());
		System.out.println("step3");
		arr.getString().add("NONE");
		System.out.println("step4");
		response.setAuthenticateResult(arr);
		System.out.println("step5");
		System.out.println(response.toString());
		System.out.println("enter the request-----------end");
		return response;
	}

	/**
	 * Auto generated method signature This web method facilitates web service to
	 * receive response XML from QuickBooks via QBWebConnector
	 * 
	 * @param receiveResponseXML10
	 * @return receiveResponseXMLResponse11
	 */
	public com.intuit.developer.ReceiveResponseXMLResponse receiveResponseXML(
			com.intuit.developer.ReceiveResponseXML receiveResponseXML10) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#receiveResponseXML");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param clientVersion12
	 * @return clientVersionResponse13
	 */
	public com.intuit.developer.ClientVersionResponse clientVersion(
			com.intuit.developer.ClientVersion clientVersion12) {
		// TODO : fill this with the necessary business logic
//        throw new java.lang.UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#clientVersion");
		System.out.println("enter the request-----------clientVersion");
		return null;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param closeConnection14
	 * @return closeConnectionResponse15
	 */
	public com.intuit.developer.CloseConnectionResponse closeConnection(
			com.intuit.developer.CloseConnection closeConnection14) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#closeConnection");
	}
}
