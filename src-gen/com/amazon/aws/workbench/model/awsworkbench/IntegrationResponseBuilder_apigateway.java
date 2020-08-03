/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Response Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getStatusCode_java_lang_String_ <em>Status Code java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getResponseParameters_java_lang_String__java_lang_String_AsMap <em>Response Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getResponseTemplates_java_lang_String__java_lang_String_AsMap <em>Response Templates java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getSelectionPattern_java_lang_String_ <em>Selection Pattern java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway()
 * @model
 * @generated
 */
public interface IntegrationResponseBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code java lang String </em>' attribute.
	 * @see #setStatusCode_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_StatusCode_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getStatusCode_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getStatusCode_java_lang_String_ <em>Status Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code java lang String </em>' attribute.
	 * @see #getStatusCode_java_lang_String_()
	 * @generated
	 */
	void setStatusCode_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Content Handling software amazon awscdk services apigateway Content Handling </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.ContentHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Handling software amazon awscdk services apigateway Content Handling </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ContentHandling
	 * @see #setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(ContentHandling)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.ContentHandling"
	 * @generated
	 */
	ContentHandling getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_ <em>Content Handling software amazon awscdk services apigateway Content Handling </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Handling software amazon awscdk services apigateway Content Handling </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ContentHandling
	 * @see #getContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_()
	 * @generated
	 */
	void setContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(ContentHandling value);

	/**
	 * Returns the value of the '<em><b>Response Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #setResponseParameters_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getResponseParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getResponseParameters_java_lang_String__java_lang_String_AsMap <em>Response Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #getResponseParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setResponseParameters_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Response Templates java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Templates java lang String java lang String As Map</em>' attribute.
	 * @see #setResponseTemplates_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_ResponseTemplates_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getResponseTemplates_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getResponseTemplates_java_lang_String__java_lang_String_AsMap <em>Response Templates java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Templates java lang String java lang String As Map</em>' attribute.
	 * @see #getResponseTemplates_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setResponseTemplates_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Selection Pattern java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Pattern java lang String </em>' attribute.
	 * @see #setSelectionPattern_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_SelectionPattern_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSelectionPattern_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getSelectionPattern_java_lang_String_ <em>Selection Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Pattern java lang String </em>' attribute.
	 * @see #getSelectionPattern_java_lang_String_()
	 * @generated
	 */
	void setSelectionPattern_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.IntegrationResponse"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.IntegrationResponse" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getIntegrationResponseBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // IntegrationResponseBuilder_apigateway
