/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getType_software_amazon_awscdk_services_apigateway_IntegrationType_ <em>Type software amazon awscdk services apigateway Integration Type </em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getIntegrationHttpMethod_java_lang_String_ <em>Integration Http Method java lang String </em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getUri_java_lang_Object_ <em>Uri java lang Object </em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.IntegrationBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway()
 * @model
 * @generated
 */
public interface IntegrationBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Type software amazon awscdk services apigateway Integration Type </b></em>' attribute.
	 * The literals are from the enumeration {@link apigateway.IntegrationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type software amazon awscdk services apigateway Integration Type </em>' attribute.
	 * @see apigateway.IntegrationType
	 * @see #setType_software_amazon_awscdk_services_apigateway_IntegrationType_(IntegrationType)
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_IntegrationType_()
	 * @model dataType="apigateway.IntegrationType"
	 * @generated
	 */
	IntegrationType getType_software_amazon_awscdk_services_apigateway_IntegrationType_();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getType_software_amazon_awscdk_services_apigateway_IntegrationType_ <em>Type software amazon awscdk services apigateway Integration Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type software amazon awscdk services apigateway Integration Type </em>' attribute.
	 * @see apigateway.IntegrationType
	 * @see #getType_software_amazon_awscdk_services_apigateway_IntegrationType_()
	 * @generated
	 */
	void setType_software_amazon_awscdk_services_apigateway_IntegrationType_(IntegrationType value);

	/**
	 * Returns the value of the '<em><b>Integration Http Method java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Http Method java lang String </em>' attribute.
	 * @see #setIntegrationHttpMethod_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_IntegrationHttpMethod_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getIntegrationHttpMethod_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getIntegrationHttpMethod_java_lang_String_ <em>Integration Http Method java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration Http Method java lang String </em>' attribute.
	 * @see #getIntegrationHttpMethod_java_lang_String_()
	 * @generated
	 */
	void setIntegrationHttpMethod_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>' attribute.
	 * @see #setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference <em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options With Integration Options software amazon awscdk services apigateway Integration Options As Reference</em>' attribute.
	 * @see #getOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference()
	 * @generated
	 */
	void setOptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Uri java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri java lang Object </em>' attribute.
	 * @see #setUri_java_lang_Object_(Object)
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_Uri_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getUri_java_lang_Object_();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getUri_java_lang_Object_ <em>Uri java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri java lang Object </em>' attribute.
	 * @see #getUri_java_lang_Object_()
	 * @generated
	 */
	void setUri_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.Integration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.Integration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getIntegrationBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.IntegrationBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // IntegrationBuilder_apigateway
