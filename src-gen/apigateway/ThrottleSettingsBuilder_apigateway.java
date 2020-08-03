/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throttle Settings Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getBurstLimit_java_lang_Number_ <em>Burst Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getRateLimit_java_lang_Number_ <em>Rate Limit java lang Number </em>}</li>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.ThrottleSettingsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway()
 * @model
 * @generated
 */
public interface ThrottleSettingsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Burst Limit java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burst Limit java lang Number </em>' attribute.
	 * @see #setBurstLimit_java_lang_Number_(int)
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_BurstLimit_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getBurstLimit_java_lang_Number_();

	/**
	 * Sets the value of the '{@link apigateway.ThrottleSettingsBuilder_apigateway#getBurstLimit_java_lang_Number_ <em>Burst Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Limit java lang Number </em>' attribute.
	 * @see #getBurstLimit_java_lang_Number_()
	 * @generated
	 */
	void setBurstLimit_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Rate Limit java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Limit java lang Number </em>' attribute.
	 * @see #setRateLimit_java_lang_Number_(int)
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_RateLimit_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getRateLimit_java_lang_Number_();

	/**
	 * Sets the value of the '{@link apigateway.ThrottleSettingsBuilder_apigateway#getRateLimit_java_lang_Number_ <em>Rate Limit java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Limit java lang Number </em>' attribute.
	 * @see #getRateLimit_java_lang_Number_()
	 * @generated
	 */
	void setRateLimit_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.ThrottleSettings"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.ThrottleSettings" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.ThrottleSettingsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.ThrottleSettingsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getThrottleSettingsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.ThrottleSettingsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ThrottleSettingsBuilder_apigateway
