/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quota Settings Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getLimit_java_lang_Number_ <em>Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getOffset_java_lang_Number_ <em>Offset java lang Number </em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getPeriod_software_amazon_awscdk_services_apigateway_Period_ <em>Period software amazon awscdk services apigateway Period </em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.QuotaSettingsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway()
 * @model
 * @generated
 */
public interface QuotaSettingsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Limit java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit java lang Number </em>' attribute.
	 * @see #setLimit_java_lang_Number_(int)
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_Limit_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getLimit_java_lang_Number_();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getLimit_java_lang_Number_ <em>Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit java lang Number </em>' attribute.
	 * @see #getLimit_java_lang_Number_()
	 * @generated
	 */
	void setLimit_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Offset java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset java lang Number </em>' attribute.
	 * @see #setOffset_java_lang_Number_(int)
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_Offset_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getOffset_java_lang_Number_();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getOffset_java_lang_Number_ <em>Offset java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset java lang Number </em>' attribute.
	 * @see #getOffset_java_lang_Number_()
	 * @generated
	 */
	void setOffset_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Period software amazon awscdk services apigateway Period </b></em>' attribute.
	 * The literals are from the enumeration {@link apigateway.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period software amazon awscdk services apigateway Period </em>' attribute.
	 * @see apigateway.Period
	 * @see #setPeriod_software_amazon_awscdk_services_apigateway_Period_(Period)
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_Period_software_amazon_awscdk_services_apigateway_Period_()
	 * @model dataType="apigateway.Period"
	 * @generated
	 */
	Period getPeriod_software_amazon_awscdk_services_apigateway_Period_();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getPeriod_software_amazon_awscdk_services_apigateway_Period_ <em>Period software amazon awscdk services apigateway Period </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period software amazon awscdk services apigateway Period </em>' attribute.
	 * @see apigateway.Period
	 * @see #getPeriod_software_amazon_awscdk_services_apigateway_Period_()
	 * @generated
	 */
	void setPeriod_software_amazon_awscdk_services_apigateway_Period_(Period value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.QuotaSettings"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.QuotaSettings" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getQuotaSettingsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.QuotaSettingsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // QuotaSettingsBuilder_apigateway
