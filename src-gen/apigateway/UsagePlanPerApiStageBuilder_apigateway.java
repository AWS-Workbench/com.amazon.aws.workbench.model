/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Plan Per Api Stage Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList <em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway()
 * @model
 * @generated
 */
public interface UsagePlanPerApiStageBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @model
	 * @generated
	 */
	String getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #getApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 */
	void setApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Stage With Stage software amazon awscdk services apigateway Stage As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>' attribute.
	 * @see #setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @model
	 * @generated
	 */
	String getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference <em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage With Stage software amazon awscdk services apigateway Stage As Reference</em>' attribute.
	 * @see #getStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference()
	 * @generated
	 */
	void setStageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Throttle software amazon awscdk services apigateway Throttling Per Method As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>' attribute.
	 * @see #setThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_Throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList()
	 * @model
	 * @generated
	 */
	String getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList <em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle software amazon awscdk services apigateway Throttling Per Method As List</em>' attribute.
	 * @see #getThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList()
	 * @generated
	 */
	void setThrottle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getUsagePlanPerApiStageBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UsagePlanPerApiStageBuilder_apigateway
