/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Integration Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getHttpMethod_java_lang_String_ <em>Http Method java lang String </em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway()
 * @model
 * @generated
 */
public interface HttpIntegrationPropsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Http Method java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method java lang String </em>' attribute.
	 * @see #setHttpMethod_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_HttpMethod_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getHttpMethod_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getHttpMethod_java_lang_String_ <em>Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method java lang String </em>' attribute.
	 * @see #getHttpMethod_java_lang_String_()
	 * @generated
	 */
	void setHttpMethod_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>' attribute.
	 * @see #setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>' attribute.
	 * @see #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @generated
	 */
	void setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Proxy java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy java lang Boolean </em>' attribute.
	 * @see #setProxy_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_Proxy_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getProxy_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy java lang Boolean </em>' attribute.
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 */
	void setProxy_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.HttpIntegrationProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.HttpIntegrationProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getHttpIntegrationPropsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.HttpIntegrationPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // HttpIntegrationPropsBuilder_apigateway
