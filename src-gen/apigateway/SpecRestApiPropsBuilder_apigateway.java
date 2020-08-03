/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Rest Api Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference <em>Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getCloudWatchRole_java_lang_Boolean_ <em>Cloud Watch Role java lang Boolean </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDeploy_java_lang_Boolean_ <em>Deploy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getEndpointExportName_java_lang_String_ <em>Endpoint Export Name java lang String </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getFailOnWarnings_java_lang_Boolean_ <em>Fail On Warnings java lang Boolean </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getRestApiName_java_lang_String_ <em>Rest Api Name java lang String </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.SpecRestApiPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway()
 * @model
 * @generated
 */
public interface SpecRestApiPropsBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference</em>' attribute.
	 * @see #setApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_ApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference()
	 * @model
	 * @generated
	 */
	String getApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference <em>Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference</em>' attribute.
	 * @see #getApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference()
	 * @generated
	 */
	void setApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Cloud Watch Role java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Watch Role java lang Boolean </em>' attribute.
	 * @see #setCloudWatchRole_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCloudWatchRole_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getCloudWatchRole_java_lang_Boolean_ <em>Cloud Watch Role java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Watch Role java lang Boolean </em>' attribute.
	 * @see #getCloudWatchRole_java_lang_Boolean_()
	 * @generated
	 */
	void setCloudWatchRole_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Deploy java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy java lang Boolean </em>' attribute.
	 * @see #setDeploy_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeploy_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDeploy_java_lang_Boolean_ <em>Deploy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy java lang Boolean </em>' attribute.
	 * @see #getDeploy_java_lang_Boolean_()
	 * @generated
	 */
	void setDeploy_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>' attribute.
	 * @see #setDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>' attribute.
	 * @see #getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference()
	 * @generated
	 */
	void setDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>' attribute.
	 * @see #setDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>' attribute.
	 * @see #getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference()
	 * @generated
	 */
	void setDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Export Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Export Name java lang String </em>' attribute.
	 * @see #setEndpointExportName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getEndpointExportName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getEndpointExportName_java_lang_String_ <em>Endpoint Export Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Export Name java lang String </em>' attribute.
	 * @see #getEndpointExportName_java_lang_String_()
	 * @generated
	 */
	void setEndpointExportName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Fail On Warnings java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail On Warnings java lang Boolean </em>' attribute.
	 * @see #setFailOnWarnings_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getFailOnWarnings_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getFailOnWarnings_java_lang_Boolean_ <em>Fail On Warnings java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail On Warnings java lang Boolean </em>' attribute.
	 * @see #getFailOnWarnings_java_lang_Boolean_()
	 * @generated
	 */
	void setFailOnWarnings_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #setParameters_java_lang_String__java_lang_String_AsMap(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setParameters_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @model
	 * @generated
	 */
	String getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>' attribute.
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 */
	void setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Rest Api Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Api Name java lang String </em>' attribute.
	 * @see #setRestApiName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRestApiName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getRestApiName_java_lang_String_ <em>Rest Api Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Api Name java lang String </em>' attribute.
	 * @see #getRestApiName_java_lang_String_()
	 * @generated
	 */
	void setRestApiName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Retain Deployments java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain Deployments java lang Boolean </em>' attribute.
	 * @see #setRetainDeployments_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRetainDeployments_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain Deployments java lang Boolean </em>' attribute.
	 * @see #getRetainDeployments_java_lang_Boolean_()
	 * @generated
	 */
	void setRetainDeployments_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>' attribute.
	 * @see #setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>' attribute.
	 * @see #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @generated
	 */
	void setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>' attribute.
	 * @see #setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>' attribute.
	 * @see #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 */
	void setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>' attribute.
	 * @see #setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>' attribute.
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 */
	void setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.SpecRestApiProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.SpecRestApiProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getSpecRestApiPropsBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.SpecRestApiPropsBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SpecRestApiPropsBuilder_apigateway
