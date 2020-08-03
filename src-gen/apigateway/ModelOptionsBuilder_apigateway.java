/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Schema With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getContentType_java_lang_String_ <em>Content Type java lang String </em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getModelName_java_lang_String_ <em>Model Name java lang String </em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.ModelOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface ModelOptionsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema With Json Schema software amazon awscdk services apigateway Json Schema As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>' attribute.
	 * @see #setSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @model
	 * @generated
	 */
	String getSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Schema With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>' attribute.
	 * @see #getSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 */
	void setSchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Content Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type java lang String </em>' attribute.
	 * @see #setContentType_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_ContentType_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getContentType_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getContentType_java_lang_String_ <em>Content Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type java lang String </em>' attribute.
	 * @see #getContentType_java_lang_String_()
	 * @generated
	 */
	void setContentType_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Model Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name java lang String </em>' attribute.
	 * @see #setModelName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_ModelName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getModelName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getModelName_java_lang_String_ <em>Model Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name java lang String </em>' attribute.
	 * @see #getModelName_java_lang_String_()
	 * @generated
	 */
	void setModelName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.ModelOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.ModelOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getModelOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.ModelOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ModelOptionsBuilder_apigateway
