/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Rest Api Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getCloudWatchRole_java_lang_Boolean_ <em>Cloud Watch Role java lang Boolean </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDeploy_java_lang_Boolean_ <em>Deploy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointExportName_java_lang_String_ <em>Endpoint Export Name java lang String </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getFailOnWarnings_java_lang_Boolean_ <em>Fail On Warnings java lang Boolean </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getRestApiName_java_lang_String_ <em>Rest Api Name java lang String </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ <em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getBinaryMediaTypes_java_lang_String_AsList <em>Binary Media Types java lang String As List</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference <em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getMinimumCompressionSize_java_lang_Number_ <em>Minimum Compression Size java lang Number </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference <em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.LambdaRestApiBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway()
 * @model
 * @generated
 */
public interface LambdaRestApiBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>' attribute.
	 * @see #setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>' attribute.
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 */
	void setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Cloud Watch Role java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Watch Role java lang Boolean </em>' attribute.
	 * @see #setCloudWatchRole_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getCloudWatchRole_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getCloudWatchRole_java_lang_Boolean_ <em>Cloud Watch Role java lang Boolean </em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_Deploy_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeploy_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDeploy_java_lang_Boolean_ <em>Deploy java lang Boolean </em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_EndpointExportName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getEndpointExportName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointExportName_java_lang_String_ <em>Endpoint Export Name java lang String </em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getFailOnWarnings_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getFailOnWarnings_java_lang_Boolean_ <em>Fail On Warnings java lang Boolean </em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @model
	 * @generated
	 */
	String getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_RestApiName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRestApiName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getRestApiName_java_lang_String_ <em>Rest Api Name java lang String </em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getRetainDeployments_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain Deployments java lang Boolean </em>' attribute.
	 * @see #getRetainDeployments_java_lang_Boolean_()
	 * @generated
	 */
	void setRetainDeployments_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </b></em>' attribute.
	 * The literals are from the enumeration {@link apigateway.ApiKeySourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>' attribute.
	 * @see apigateway.ApiKeySourceType
	 * @see #setApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(ApiKeySourceType)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_()
	 * @model dataType="apigateway.ApiKeySourceType"
	 * @generated
	 */
	ApiKeySourceType getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ <em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>' attribute.
	 * @see apigateway.ApiKeySourceType
	 * @see #getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_()
	 * @generated
	 */
	void setApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(ApiKeySourceType value);

	/**
	 * Returns the value of the '<em><b>Binary Media Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Media Types java lang String As List</em>' attribute.
	 * @see #setBinaryMediaTypes_java_lang_String_AsList(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getBinaryMediaTypes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getBinaryMediaTypes_java_lang_String_AsList <em>Binary Media Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Media Types java lang String As List</em>' attribute.
	 * @see #getBinaryMediaTypes_java_lang_String_AsList()
	 * @generated
	 */
	void setBinaryMediaTypes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #setCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @model
	 * @generated
	 */
	String getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>' attribute.
	 * @see #getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 */
	void setCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>' attribute.
	 * @see #setEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference()
	 * @model
	 * @generated
	 */
	String getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference <em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>' attribute.
	 * @see #getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference()
	 * @generated
	 */
	void setEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>' attribute.
	 * @see #setEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @model
	 * @generated
	 */
	String getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>' attribute.
	 * @see #getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 */
	void setEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Compression Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Compression Size java lang Number </em>' attribute.
	 * @see #setMinimumCompressionSize_java_lang_Number_(int)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_MinimumCompressionSize_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinimumCompressionSize_java_lang_Number_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getMinimumCompressionSize_java_lang_Number_ <em>Minimum Compression Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Compression Size java lang Number </em>' attribute.
	 * @see #getMinimumCompressionSize_java_lang_Number_()
	 * @generated
	 */
	void setMinimumCompressionSize_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @model
	 * @generated
	 */
	String getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>' attribute.
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 */
	void setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>' attribute.
	 * @see #setOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_OptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference()
	 * @model
	 * @generated
	 */
	String getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference <em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>' attribute.
	 * @see #getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference()
	 * @generated
	 */
	void setOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Proxy java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy java lang Boolean </em>' attribute.
	 * @see #setProxy_java_lang_Boolean_(Boolean)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_Proxy_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getProxy_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy java lang Boolean </em>' attribute.
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 */
	void setProxy_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.LambdaRestApi"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.LambdaRestApi" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getLambdaRestApiBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.LambdaRestApiBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LambdaRestApiBuilder_apigateway
