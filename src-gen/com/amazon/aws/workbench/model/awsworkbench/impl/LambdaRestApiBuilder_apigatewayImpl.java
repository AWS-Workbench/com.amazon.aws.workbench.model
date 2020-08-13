/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.ApiKeySourceType;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaRestApiBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Rest Api Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getCloudWatchRole_java_lang_Boolean_ <em>Cloud Watch Role java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDeploy_java_lang_Boolean_ <em>Deploy java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getEndpointExportName_java_lang_String_ <em>Endpoint Export Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getFailOnWarnings_java_lang_Boolean_ <em>Fail On Warnings java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getRestApiName_java_lang_String_ <em>Rest Api Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getRetainDeployments_java_lang_Boolean_ <em>Retain Deployments java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ <em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getBinaryMediaTypes_java_lang_String_AsList <em>Binary Media Types java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference <em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference <em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList <em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getMinimumCompressionSize_java_lang_Number_ <em>Minimum Compression Size java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference <em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getProxy_java_lang_Boolean_ <em>Proxy java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaRestApiBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaRestApiBuilder_apigatewayImpl extends ServiceResourcesImpl
		implements LambdaRestApiBuilder_apigateway {
	/**
	 * The default value of the '{@link #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() <em>Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() <em>Default Integration With Integration software amazon awscdk services apigateway Integration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() <em>Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudWatchRole_java_lang_Boolean_() <em>Cloud Watch Role java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudWatchRole_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudWatchRole_java_lang_Boolean_() <em>Cloud Watch Role java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudWatchRole_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean cloudWatchRole_java_lang_Boolean_ = CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploy_java_lang_Boolean_() <em>Deploy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPLOY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploy_java_lang_Boolean_() <em>Deploy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deploy_java_lang_Boolean_ = DEPLOY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() <em>Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference = DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() <em>Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference = DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointExportName_java_lang_String_() <em>Endpoint Export Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointExportName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointExportName_java_lang_String_() <em>Endpoint Export Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointExportName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String endpointExportName_java_lang_String_ = ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getFailOnWarnings_java_lang_Boolean_() <em>Fail On Warnings java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailOnWarnings_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailOnWarnings_java_lang_Boolean_() <em>Fail On Warnings java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailOnWarnings_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean failOnWarnings_java_lang_Boolean_ = FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getParameters_java_lang_String__java_lang_String_AsMap() <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters_java_lang_String__java_lang_String_AsMap() <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String parameters_java_lang_String__java_lang_String_AsMap = PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestApiName_java_lang_String_() <em>Rest Api Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_API_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestApiName_java_lang_String_() <em>Rest Api Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestApiName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String restApiName_java_lang_String_ = REST_API_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRetainDeployments_java_lang_Boolean_() <em>Retain Deployments java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetainDeployments_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetainDeployments_java_lang_Boolean_() <em>Retain Deployments java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetainDeployments_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean retainDeployments_java_lang_Boolean_ = RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() <em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_()
	 * @generated
	 * @ordered
	 */
	protected static final ApiKeySourceType API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE__EDEFAULT = ApiKeySourceType.HEADER;

	/**
	 * The cached value of the '{@link #getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() <em>Api Key Source Type software amazon awscdk services apigateway Api Key Source Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_()
	 * @generated
	 * @ordered
	 */
	protected ApiKeySourceType apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ = API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getBinaryMediaTypes_java_lang_String_AsList() <em>Binary Media Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryMediaTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryMediaTypes_java_lang_String_AsList() <em>Binary Media Types java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryMediaTypes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String binaryMediaTypes_java_lang_String_AsList = BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() <em>Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() <em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() <em>Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference = ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() <em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() <em>Endpoint Types software amazon awscdk services apigateway Endpoint Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList()
	 * @generated
	 * @ordered
	 */
	protected String endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList = ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCompressionSize_java_lang_Number_() <em>Minimum Compression Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCompressionSize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumCompressionSize_java_lang_Number_() <em>Minimum Compression Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCompressionSize_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minimumCompressionSize_java_lang_Number_ = MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference() <em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference() <em>Options With Rest Api Props software amazon awscdk services apigateway Rest Api Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference = OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxy_java_lang_Boolean_() <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROXY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxy_java_lang_Boolean_() <em>Proxy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean proxy_java_lang_Boolean_ = PROXY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.LambdaRestApi";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaRestApiBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAMBDA_REST_API_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
			String newDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference) {
		String oldDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
		defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference = newDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
					oldDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference,
					defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
			String newDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference) {
		String oldDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference = newDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
					oldDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference,
					defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
			String newDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference) {
		String oldDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference = newDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
					oldDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference,
					defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCloudWatchRole_java_lang_Boolean_() {
		return cloudWatchRole_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudWatchRole_java_lang_Boolean_(Boolean newCloudWatchRole_java_lang_Boolean_) {
		Boolean oldCloudWatchRole_java_lang_Boolean_ = cloudWatchRole_java_lang_Boolean_;
		cloudWatchRole_java_lang_Boolean_ = newCloudWatchRole_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_,
					oldCloudWatchRole_java_lang_Boolean_, cloudWatchRole_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeploy_java_lang_Boolean_() {
		return deploy_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploy_java_lang_Boolean_(Boolean newDeploy_java_lang_Boolean_) {
		Boolean oldDeploy_java_lang_Boolean_ = deploy_java_lang_Boolean_;
		deploy_java_lang_Boolean_ = newDeploy_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_,
					oldDeploy_java_lang_Boolean_, deploy_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(
			String newDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference) {
		String oldDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference = deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference;
		deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference = newDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE,
					oldDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference,
					deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(
			String newDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference) {
		String oldDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference = domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference;
		domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference = newDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE,
					oldDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference,
					domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointExportName_java_lang_String_() {
		return endpointExportName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointExportName_java_lang_String_(String newEndpointExportName_java_lang_String_) {
		String oldEndpointExportName_java_lang_String_ = endpointExportName_java_lang_String_;
		endpointExportName_java_lang_String_ = newEndpointExportName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_,
					oldEndpointExportName_java_lang_String_, endpointExportName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFailOnWarnings_java_lang_Boolean_() {
		return failOnWarnings_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailOnWarnings_java_lang_Boolean_(Boolean newFailOnWarnings_java_lang_Boolean_) {
		Boolean oldFailOnWarnings_java_lang_Boolean_ = failOnWarnings_java_lang_Boolean_;
		failOnWarnings_java_lang_Boolean_ = newFailOnWarnings_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_,
					oldFailOnWarnings_java_lang_Boolean_, failOnWarnings_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameters_java_lang_String__java_lang_String_AsMap() {
		return parameters_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters_java_lang_String__java_lang_String_AsMap(
			String newParameters_java_lang_String__java_lang_String_AsMap) {
		String oldParameters_java_lang_String__java_lang_String_AsMap = parameters_java_lang_String__java_lang_String_AsMap;
		parameters_java_lang_String__java_lang_String_AsMap = newParameters_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldParameters_java_lang_String__java_lang_String_AsMap,
					parameters_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
			String newPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference) {
		String oldPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = newPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
					oldPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference,
					policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestApiName_java_lang_String_() {
		return restApiName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestApiName_java_lang_String_(String newRestApiName_java_lang_String_) {
		String oldRestApiName_java_lang_String_ = restApiName_java_lang_String_;
		restApiName_java_lang_String_ = newRestApiName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_,
					oldRestApiName_java_lang_String_, restApiName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRetainDeployments_java_lang_Boolean_() {
		return retainDeployments_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetainDeployments_java_lang_Boolean_(Boolean newRetainDeployments_java_lang_Boolean_) {
		Boolean oldRetainDeployments_java_lang_Boolean_ = retainDeployments_java_lang_Boolean_;
		retainDeployments_java_lang_Boolean_ = newRetainDeployments_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_,
					oldRetainDeployments_java_lang_Boolean_, retainDeployments_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeySourceType getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() {
		return apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(
			ApiKeySourceType newApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_) {
		ApiKeySourceType oldApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ = apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_;
		apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ = newApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ == null
				? API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE__EDEFAULT
				: newApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_,
					oldApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_,
					apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinaryMediaTypes_java_lang_String_AsList() {
		return binaryMediaTypes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinaryMediaTypes_java_lang_String_AsList(String newBinaryMediaTypes_java_lang_String_AsList) {
		String oldBinaryMediaTypes_java_lang_String_AsList = binaryMediaTypes_java_lang_String_AsList;
		binaryMediaTypes_java_lang_String_AsList = newBinaryMediaTypes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST,
					oldBinaryMediaTypes_java_lang_String_AsList, binaryMediaTypes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
			String newCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference) {
		String oldCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference = newCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
					oldCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference,
					cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() {
		return endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(
			String newEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference) {
		String oldEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference = endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference;
		endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference = newEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE,
					oldEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference,
					endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(
			String newEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList) {
		String oldEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList = endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
		endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList = newEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST,
					oldEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList,
					endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimumCompressionSize_java_lang_Number_() {
		return minimumCompressionSize_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumCompressionSize_java_lang_Number_(int newMinimumCompressionSize_java_lang_Number_) {
		int oldMinimumCompressionSize_java_lang_Number_ = minimumCompressionSize_java_lang_Number_;
		minimumCompressionSize_java_lang_Number_ = newMinimumCompressionSize_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_,
					oldMinimumCompressionSize_java_lang_Number_, minimumCompressionSize_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(
			String newHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference) {
		String oldHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
		handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = newHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
					oldHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference,
					handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference() {
		return optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(
			String newOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference) {
		String oldOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference = optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference;
		optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference = newOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE,
					oldOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference,
					optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getProxy_java_lang_Boolean_() {
		return proxy_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxy_java_lang_Boolean_(Boolean newProxy_java_lang_Boolean_) {
		Boolean oldProxy_java_lang_Boolean_ = proxy_java_lang_Boolean_;
		proxy_java_lang_Boolean_ = newProxy_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_,
					oldProxy_java_lang_Boolean_, proxy_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return getDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return getDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return getDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
			return getCloudWatchRole_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
			return getDeploy_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
			return getDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
			return getDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
			return getEndpointExportName_java_lang_String_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
			return getFailOnWarnings_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getParameters_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
			return getRestApiName_java_lang_String_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
			return getRetainDeployments_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_:
			return getApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST:
			return getBinaryMediaTypes_java_lang_String_AsList();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return getCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE:
			return getEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			return getEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_:
			return getMinimumCompressionSize_java_lang_Number_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			return getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE:
			return getOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return getProxy_java_lang_Boolean_();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
			setCloudWatchRole_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
			setDeploy_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
			setDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
			setDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
			setEndpointExportName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
			setFailOnWarnings_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setParameters_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
			setRestApiName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
			setRetainDeployments_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_:
			setApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(
					(ApiKeySourceType) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST:
			setBinaryMediaTypes_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE:
			setEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			setEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_:
			setMinimumCompressionSize_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE:
			setOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			setDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(
					DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			setDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(
					DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			setDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(
					DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
			setCloudWatchRole_java_lang_Boolean_(CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
			setDeploy_java_lang_Boolean_(DEPLOY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
			setDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(
					DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
			setDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(
					DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
			setEndpointExportName_java_lang_String_(ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
			setFailOnWarnings_java_lang_Boolean_(FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setParameters_java_lang_String__java_lang_String_AsMap(
					PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
			setRestApiName_java_lang_String_(REST_API_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
			setRetainDeployments_java_lang_Boolean_(RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_:
			setApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(
					API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST:
			setBinaryMediaTypes_java_lang_String_AsList(BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			setCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(
					CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE:
			setEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(
					ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			setEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(
					ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_:
			setMinimumCompressionSize_java_lang_Number_(MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(
					HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE:
			setOptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(
					OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			setProxy_java_lang_Boolean_(PROXY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
			return DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference != null
					: !DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
			return DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT == null
					? defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference != null
					: !DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE_EDEFAULT
							.equals(defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
			return DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference != null
					: !DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
			return CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? cloudWatchRole_java_lang_Boolean_ != null
					: !CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(cloudWatchRole_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
			return DEPLOY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? deploy_java_lang_Boolean_ != null
					: !DEPLOY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(deploy_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
			return DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference != null
					: !DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
			return DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference != null
					: !DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
			return ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? endpointExportName_java_lang_String_ != null
					: !ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING__EDEFAULT.equals(endpointExportName_java_lang_String_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
			return FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? failOnWarnings_java_lang_Boolean_ != null
					: !FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(failOnWarnings_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? parameters_java_lang_String__java_lang_String_AsMap != null
					: !PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(parameters_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT == null
					? policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference != null
					: !POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT
							.equals(policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
			return REST_API_NAME_JAVA_LANG_STRING__EDEFAULT == null ? restApiName_java_lang_String_ != null
					: !REST_API_NAME_JAVA_LANG_STRING__EDEFAULT.equals(restApiName_java_lang_String_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
			return RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? retainDeployments_java_lang_Boolean_ != null
					: !RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(retainDeployments_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_:
			return apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_ != API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE__EDEFAULT;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST:
			return BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? binaryMediaTypes_java_lang_String_AsList != null
					: !BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(binaryMediaTypes_java_lang_String_AsList);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
			return CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT == null
					? cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference != null
					: !CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE_EDEFAULT
							.equals(cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE:
			return ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE_EDEFAULT == null
					? endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference != null
					: !ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE_EDEFAULT
							.equals(endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
			return ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT == null
					? endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList != null
					: !ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST_EDEFAULT
							.equals(endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_:
			return minimumCompressionSize_java_lang_Number_ != MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			return HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT == null
					? handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference != null
					: !HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT
							.equals(handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE:
			return OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE_EDEFAULT == null
					? optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference != null
					: !OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE_EDEFAULT
							.equals(optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_:
			return PROXY_JAVA_LANG_BOOLEAN__EDEFAULT == null ? proxy_java_lang_Boolean_ != null
					: !PROXY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(proxy_java_lang_Boolean_);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(
				" (defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference: ");
		result.append(
				defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference);
		result.append(
				", defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference: ");
		result.append(
				defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference);
		result.append(
				", defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference: ");
		result.append(
				defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference);
		result.append(", cloudWatchRole_java_lang_Boolean_: ");
		result.append(cloudWatchRole_java_lang_Boolean_);
		result.append(", deploy_java_lang_Boolean_: ");
		result.append(deploy_java_lang_Boolean_);
		result.append(
				", deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference: ");
		result.append(
				deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference);
		result.append(
				", domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference: ");
		result.append(
				domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference);
		result.append(", endpointExportName_java_lang_String_: ");
		result.append(endpointExportName_java_lang_String_);
		result.append(", failOnWarnings_java_lang_Boolean_: ");
		result.append(failOnWarnings_java_lang_Boolean_);
		result.append(", parameters_java_lang_String__java_lang_String_AsMap: ");
		result.append(parameters_java_lang_String__java_lang_String_AsMap);
		result.append(", policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference: ");
		result.append(policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		result.append(", restApiName_java_lang_String_: ");
		result.append(restApiName_java_lang_String_);
		result.append(", retainDeployments_java_lang_Boolean_: ");
		result.append(retainDeployments_java_lang_Boolean_);
		result.append(", apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_: ");
		result.append(apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_);
		result.append(", binaryMediaTypes_java_lang_String_AsList: ");
		result.append(binaryMediaTypes_java_lang_String_AsList);
		result.append(", cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference: ");
		result.append(cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(
				", endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference: ");
		result.append(
				endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference);
		result.append(", endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList: ");
		result.append(endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList);
		result.append(", minimumCompressionSize_java_lang_Number_: ");
		result.append(minimumCompressionSize_java_lang_Number_);
		result.append(", handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference: ");
		result.append(handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference);
		result.append(
				", optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference: ");
		result.append(optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference);
		result.append(", proxy_java_lang_Boolean_: ");
		result.append(proxy_java_lang_Boolean_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //LambdaRestApiBuilder_apigatewayImpl
