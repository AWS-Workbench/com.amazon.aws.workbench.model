/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Authorizer Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAuthorizerName_java_lang_String_ <em>Authorizer Name java lang String </em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway()
 * @model
 * @generated
 */
public interface LambdaAuthorizerPropsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @model
	 * @generated
	 */
	String getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 */
	void setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Assume Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Authorizer Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizer Name java lang String </em>' attribute.
	 * @see #setAuthorizerName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAuthorizerName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAuthorizerName_java_lang_String_ <em>Authorizer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorizer Name java lang String </em>' attribute.
	 * @see #getAuthorizerName_java_lang_String_()
	 * @generated
	 */
	void setAuthorizerName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaAuthorizerPropsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaAuthorizerPropsBuilder_apigateway
