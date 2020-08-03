/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Response Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getStatusCode_java_lang_String_ <em>Status Code java lang String </em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getResponseParameters_java_lang_String__java_lang_Boolean_AsMap <em>Response Parameters java lang String java lang Boolean As Map</em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.MethodResponseBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway()
 * @model
 * @generated
 */
public interface MethodResponseBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code java lang String </em>' attribute.
	 * @see #setStatusCode_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_StatusCode_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getStatusCode_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getStatusCode_java_lang_String_ <em>Status Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code java lang String </em>' attribute.
	 * @see #getStatusCode_java_lang_String_()
	 * @generated
	 */
	void setStatusCode_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Response Models java lang String software amazon awscdk services apigateway IModel As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>' attribute.
	 * @see #setResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(String)
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_ResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @model
	 * @generated
	 */
	String getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap <em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Models java lang String software amazon awscdk services apigateway IModel As Map</em>' attribute.
	 * @see #getResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap()
	 * @generated
	 */
	void setResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Response Parameters java lang String java lang Boolean As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Parameters java lang String java lang Boolean As Map</em>' attribute.
	 * @see #setResponseParameters_java_lang_String__java_lang_Boolean_AsMap(String)
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @model
	 * @generated
	 */
	String getResponseParameters_java_lang_String__java_lang_Boolean_AsMap();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getResponseParameters_java_lang_String__java_lang_Boolean_AsMap <em>Response Parameters java lang String java lang Boolean As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Parameters java lang String java lang Boolean As Map</em>' attribute.
	 * @see #getResponseParameters_java_lang_String__java_lang_Boolean_AsMap()
	 * @generated
	 */
	void setResponseParameters_java_lang_String__java_lang_Boolean_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.MethodResponse"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.MethodResponse" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getMethodResponseBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.MethodResponseBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // MethodResponseBuilder_apigateway
