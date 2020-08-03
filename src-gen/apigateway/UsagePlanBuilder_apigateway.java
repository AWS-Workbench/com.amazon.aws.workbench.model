/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Plan Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference <em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList <em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference <em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.UsagePlanBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway()
 * @model
 * @generated
 */
public interface UsagePlanBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>' attribute.
	 * @see #setApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_ApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference()
	 * @model
	 * @generated
	 */
	String getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference <em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key With IApi Key software amazon awscdk services apigateway IApi Key As Reference</em>' attribute.
	 * @see #getApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference()
	 * @generated
	 */
	void setApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>' attribute.
	 * @see #setApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList()
	 * @model
	 * @generated
	 */
	String getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList <em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List</em>' attribute.
	 * @see #getApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList()
	 * @generated
	 */
	void setApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>' attribute.
	 * @see #setQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference()
	 * @model
	 * @generated
	 */
	String getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference <em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference</em>' attribute.
	 * @see #getQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference()
	 * @generated
	 */
	void setQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>' attribute.
	 * @see #setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference()
	 * @model
	 * @generated
	 */
	String getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference <em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference</em>' attribute.
	 * @see #getThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference()
	 * @generated
	 */
	void setThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.UsagePlan"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.UsagePlan" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getUsagePlanBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UsagePlanBuilder_apigateway
