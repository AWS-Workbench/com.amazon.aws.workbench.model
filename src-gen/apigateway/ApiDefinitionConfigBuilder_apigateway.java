/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Definition Config Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getInlineDefinition_java_lang_Object_ <em>Inline Definition java lang Object </em>}</li>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference <em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>}</li>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway()
 * @model
 * @generated
 */
public interface ApiDefinitionConfigBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Inline Definition java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Definition java lang Object </em>' attribute.
	 * @see #setInlineDefinition_java_lang_Object_(Object)
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_InlineDefinition_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getInlineDefinition_java_lang_Object_();

	/**
	 * Sets the value of the '{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getInlineDefinition_java_lang_Object_ <em>Inline Definition java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Definition java lang Object </em>' attribute.
	 * @see #getInlineDefinition_java_lang_Object_()
	 * @generated
	 */
	void setInlineDefinition_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>' attribute.
	 * @see #setS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_S3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference()
	 * @model
	 * @generated
	 */
	String getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference <em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference</em>' attribute.
	 * @see #getS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference()
	 * @generated
	 */
	void setS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.ApiDefinitionConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.ApiDefinitionConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getApiDefinitionConfigBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.ApiDefinitionConfigBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ApiDefinitionConfigBuilder_apigateway
