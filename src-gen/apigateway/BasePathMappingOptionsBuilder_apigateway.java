/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Path Mapping Options Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getBasePath_java_lang_String_ <em>Base Path java lang String </em>}</li>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}</li>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway()
 * @model
 * @generated
 */
public interface BasePathMappingOptionsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path java lang String </em>' attribute.
	 * @see #setBasePath_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_BasePath_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getBasePath_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getBasePath_java_lang_String_ <em>Base Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path java lang String </em>' attribute.
	 * @see #getBasePath_java_lang_String_()
	 * @generated
	 */
	void setBasePath_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Stage With Stage software amazon awscdk services apigateway Stage As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>' attribute.
	 * @see #setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @model
	 * @generated
	 */
	String getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>' attribute.
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 */
	void setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.BasePathMappingOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.BasePathMappingOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getBasePathMappingOptionsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.BasePathMappingOptionsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BasePathMappingOptionsBuilder_apigateway
