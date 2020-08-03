/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.DeploymentPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway()
 * @model
 * @generated
 */
public interface DeploymentPropsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @model
	 * @generated
	 */
	String getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 */
	void setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Retain Deployments java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain Deployments java lang Boolean </em>' attribute.
	 * @see #setRetainDeployments_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRetainDeployments_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain Deployments java lang Boolean </em>' attribute.
	 * @see #getRetainDeployments_java_lang_Boolean_()
	 * @generated
	 */
	void setRetainDeployments_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.DeploymentProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.DeploymentProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getDeploymentPropsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.DeploymentPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DeploymentPropsBuilder_apigateway
