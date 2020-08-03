/**
 */
package apigateway.util;

import apigateway.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see apigateway.ApigatewayPackage
 * @generated
 */
public class ApigatewaySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApigatewayPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApigatewaySwitch() {
		if (modelPackage == null) {
			modelPackage = ApigatewayPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ApigatewayPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY: {
			IntegrationResponseBuilder_apigateway integrationResponseBuilder_apigateway = (IntegrationResponseBuilder_apigateway) theEObject;
			T result = caseIntegrationResponseBuilder_apigateway(integrationResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY: {
			RequestAuthorizerPropsBuilder_apigateway requestAuthorizerPropsBuilder_apigateway = (RequestAuthorizerPropsBuilder_apigateway) theEObject;
			T result = caseRequestAuthorizerPropsBuilder_apigateway(requestAuthorizerPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY: {
			RequestValidatorOptionsBuilder_apigateway requestValidatorOptionsBuilder_apigateway = (RequestValidatorOptionsBuilder_apigateway) theEObject;
			T result = caseRequestValidatorOptionsBuilder_apigateway(requestValidatorOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY: {
			JsonSchemaBuilder_apigateway jsonSchemaBuilder_apigateway = (JsonSchemaBuilder_apigateway) theEObject;
			T result = caseJsonSchemaBuilder_apigateway(jsonSchemaBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY: {
			LambdaRestApiBuilder_apigateway lambdaRestApiBuilder_apigateway = (LambdaRestApiBuilder_apigateway) theEObject;
			T result = caseLambdaRestApiBuilder_apigateway(lambdaRestApiBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY: {
			HttpIntegrationPropsBuilder_apigateway httpIntegrationPropsBuilder_apigateway = (HttpIntegrationPropsBuilder_apigateway) theEObject;
			T result = caseHttpIntegrationPropsBuilder_apigateway(httpIntegrationPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY: {
			GatewayResponseOptionsBuilder_apigateway gatewayResponseOptionsBuilder_apigateway = (GatewayResponseOptionsBuilder_apigateway) theEObject;
			T result = caseGatewayResponseOptionsBuilder_apigateway(gatewayResponseOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY: {
			CorsOptionsBuilder_apigateway corsOptionsBuilder_apigateway = (CorsOptionsBuilder_apigateway) theEObject;
			T result = caseCorsOptionsBuilder_apigateway(corsOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY: {
			LambdaRestApiPropsBuilder_apigateway lambdaRestApiPropsBuilder_apigateway = (LambdaRestApiPropsBuilder_apigateway) theEObject;
			T result = caseLambdaRestApiPropsBuilder_apigateway(lambdaRestApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY: {
			ApiDefinitionConfigBuilder_apigateway apiDefinitionConfigBuilder_apigateway = (ApiDefinitionConfigBuilder_apigateway) theEObject;
			T result = caseApiDefinitionConfigBuilder_apigateway(apiDefinitionConfigBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REST_API_BUILDER_APIGATEWAY: {
			RestApiBuilder_apigateway restApiBuilder_apigateway = (RestApiBuilder_apigateway) theEObject;
			T result = caseRestApiBuilder_apigateway(restApiBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY: {
			EndpointConfigurationBuilder_apigateway endpointConfigurationBuilder_apigateway = (EndpointConfigurationBuilder_apigateway) theEObject;
			T result = caseEndpointConfigurationBuilder_apigateway(endpointConfigurationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY: {
			MethodPropsBuilder_apigateway methodPropsBuilder_apigateway = (MethodPropsBuilder_apigateway) theEObject;
			T result = caseMethodPropsBuilder_apigateway(methodPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY: {
			BasePathMappingPropsBuilder_apigateway basePathMappingPropsBuilder_apigateway = (BasePathMappingPropsBuilder_apigateway) theEObject;
			T result = caseBasePathMappingPropsBuilder_apigateway(basePathMappingPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY: {
			UsagePlanBuilder_apigateway usagePlanBuilder_apigateway = (UsagePlanBuilder_apigateway) theEObject;
			T result = caseUsagePlanBuilder_apigateway(usagePlanBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY: {
			QuotaSettingsBuilder_apigateway quotaSettingsBuilder_apigateway = (QuotaSettingsBuilder_apigateway) theEObject;
			T result = caseQuotaSettingsBuilder_apigateway(quotaSettingsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY: {
			TokenAuthorizerPropsBuilder_apigateway tokenAuthorizerPropsBuilder_apigateway = (TokenAuthorizerPropsBuilder_apigateway) theEObject;
			T result = caseTokenAuthorizerPropsBuilder_apigateway(tokenAuthorizerPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY: {
			MethodOptionsBuilder_apigateway methodOptionsBuilder_apigateway = (MethodOptionsBuilder_apigateway) theEObject;
			T result = caseMethodOptionsBuilder_apigateway(methodOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.HTTP_INTEGRATION_BUILDER_APIGATEWAY: {
			HttpIntegrationBuilder_apigateway httpIntegrationBuilder_apigateway = (HttpIntegrationBuilder_apigateway) theEObject;
			T result = caseHttpIntegrationBuilder_apigateway(httpIntegrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY: {
			VpcLinkPropsBuilder_apigateway vpcLinkPropsBuilder_apigateway = (VpcLinkPropsBuilder_apigateway) theEObject;
			T result = caseVpcLinkPropsBuilder_apigateway(vpcLinkPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.MODEL_PROPS_BUILDER_APIGATEWAY: {
			ModelPropsBuilder_apigateway modelPropsBuilder_apigateway = (ModelPropsBuilder_apigateway) theEObject;
			T result = caseModelPropsBuilder_apigateway(modelPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.RESOURCE_BUILDER_APIGATEWAY: {
			ResourceBuilder_apigateway resourceBuilder_apigateway = (ResourceBuilder_apigateway) theEObject;
			T result = caseResourceBuilder_apigateway(resourceBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY: {
			ThrottleSettingsBuilder_apigateway throttleSettingsBuilder_apigateway = (ThrottleSettingsBuilder_apigateway) theEObject;
			T result = caseThrottleSettingsBuilder_apigateway(throttleSettingsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY: {
			IntegrationOptionsBuilder_apigateway integrationOptionsBuilder_apigateway = (IntegrationOptionsBuilder_apigateway) theEObject;
			T result = caseIntegrationOptionsBuilder_apigateway(integrationOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY: {
			BasePathMappingOptionsBuilder_apigateway basePathMappingOptionsBuilder_apigateway = (BasePathMappingOptionsBuilder_apigateway) theEObject;
			T result = caseBasePathMappingOptionsBuilder_apigateway(basePathMappingOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY: {
			MethodDeploymentOptionsBuilder_apigateway methodDeploymentOptionsBuilder_apigateway = (MethodDeploymentOptionsBuilder_apigateway) theEObject;
			T result = caseMethodDeploymentOptionsBuilder_apigateway(methodDeploymentOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.MOCK_INTEGRATION_BUILDER_APIGATEWAY: {
			MockIntegrationBuilder_apigateway mockIntegrationBuilder_apigateway = (MockIntegrationBuilder_apigateway) theEObject;
			T result = caseMockIntegrationBuilder_apigateway(mockIntegrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY: {
			StageBuilder_apigateway stageBuilder_apigateway = (StageBuilder_apigateway) theEObject;
			T result = caseStageBuilder_apigateway(stageBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY: {
			ProxyResourceOptionsBuilder_apigateway proxyResourceOptionsBuilder_apigateway = (ProxyResourceOptionsBuilder_apigateway) theEObject;
			T result = caseProxyResourceOptionsBuilder_apigateway(proxyResourceOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.API_KEY_BUILDER_APIGATEWAY: {
			ApiKeyBuilder_apigateway apiKeyBuilder_apigateway = (ApiKeyBuilder_apigateway) theEObject;
			T result = caseApiKeyBuilder_apigateway(apiKeyBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.GATEWAY_RESPONSE_BUILDER_APIGATEWAY: {
			GatewayResponseBuilder_apigateway gatewayResponseBuilder_apigateway = (GatewayResponseBuilder_apigateway) theEObject;
			T result = caseGatewayResponseBuilder_apigateway(gatewayResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY: {
			RequestValidatorPropsBuilder_apigateway requestValidatorPropsBuilder_apigateway = (RequestValidatorPropsBuilder_apigateway) theEObject;
			T result = caseRequestValidatorPropsBuilder_apigateway(requestValidatorPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY: {
			DomainNameOptionsBuilder_apigateway domainNameOptionsBuilder_apigateway = (DomainNameOptionsBuilder_apigateway) theEObject;
			T result = caseDomainNameOptionsBuilder_apigateway(domainNameOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.LAMBDA_INTEGRATION_BUILDER_APIGATEWAY: {
			LambdaIntegrationBuilder_apigateway lambdaIntegrationBuilder_apigateway = (LambdaIntegrationBuilder_apigateway) theEObject;
			T result = caseLambdaIntegrationBuilder_apigateway(lambdaIntegrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY: {
			ProxyResourcePropsBuilder_apigateway proxyResourcePropsBuilder_apigateway = (ProxyResourcePropsBuilder_apigateway) theEObject;
			T result = caseProxyResourcePropsBuilder_apigateway(proxyResourcePropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.RESOURCE_OPTIONS_BUILDER_APIGATEWAY: {
			ResourceOptionsBuilder_apigateway resourceOptionsBuilder_apigateway = (ResourceOptionsBuilder_apigateway) theEObject;
			T result = caseResourceOptionsBuilder_apigateway(resourceOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.INTEGRATION_PROPS_BUILDER_APIGATEWAY: {
			IntegrationPropsBuilder_apigateway integrationPropsBuilder_apigateway = (IntegrationPropsBuilder_apigateway) theEObject;
			T result = caseIntegrationPropsBuilder_apigateway(integrationPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY: {
			RequestValidatorBuilder_apigateway requestValidatorBuilder_apigateway = (RequestValidatorBuilder_apigateway) theEObject;
			T result = caseRequestValidatorBuilder_apigateway(requestValidatorBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY: {
			UsagePlanPerApiStageBuilder_apigateway usagePlanPerApiStageBuilder_apigateway = (UsagePlanPerApiStageBuilder_apigateway) theEObject;
			T result = caseUsagePlanPerApiStageBuilder_apigateway(usagePlanPerApiStageBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.SPEC_REST_API_BUILDER_APIGATEWAY: {
			SpecRestApiBuilder_apigateway specRestApiBuilder_apigateway = (SpecRestApiBuilder_apigateway) theEObject;
			T result = caseSpecRestApiBuilder_apigateway(specRestApiBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY: {
			ApiDefinitionS3LocationBuilder_apigateway apiDefinitionS3LocationBuilder_apigateway = (ApiDefinitionS3LocationBuilder_apigateway) theEObject;
			T result = caseApiDefinitionS3LocationBuilder_apigateway(apiDefinitionS3LocationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.VPC_LINK_BUILDER_APIGATEWAY: {
			VpcLinkBuilder_apigateway vpcLinkBuilder_apigateway = (VpcLinkBuilder_apigateway) theEObject;
			T result = caseVpcLinkBuilder_apigateway(vpcLinkBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY: {
			StageOptionsBuilder_apigateway stageOptionsBuilder_apigateway = (StageOptionsBuilder_apigateway) theEObject;
			T result = caseStageOptionsBuilder_apigateway(stageOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY: {
			ApiKeyPropsBuilder_apigateway apiKeyPropsBuilder_apigateway = (ApiKeyPropsBuilder_apigateway) theEObject;
			T result = caseApiKeyPropsBuilder_apigateway(apiKeyPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY: {
			RateLimitedApiKeyPropsBuilder_apigateway rateLimitedApiKeyPropsBuilder_apigateway = (RateLimitedApiKeyPropsBuilder_apigateway) theEObject;
			T result = caseRateLimitedApiKeyPropsBuilder_apigateway(rateLimitedApiKeyPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DEPLOYMENT_BUILDER_APIGATEWAY: {
			DeploymentBuilder_apigateway deploymentBuilder_apigateway = (DeploymentBuilder_apigateway) theEObject;
			T result = caseDeploymentBuilder_apigateway(deploymentBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REST_API_PROPS_BUILDER_APIGATEWAY: {
			RestApiPropsBuilder_apigateway restApiPropsBuilder_apigateway = (RestApiPropsBuilder_apigateway) theEObject;
			T result = caseRestApiPropsBuilder_apigateway(restApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DEPLOYMENT_PROPS_BUILDER_APIGATEWAY: {
			DeploymentPropsBuilder_apigateway deploymentPropsBuilder_apigateway = (DeploymentPropsBuilder_apigateway) theEObject;
			T result = caseDeploymentPropsBuilder_apigateway(deploymentPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY: {
			AwsIntegrationBuilder_apigateway awsIntegrationBuilder_apigateway = (AwsIntegrationBuilder_apigateway) theEObject;
			T result = caseAwsIntegrationBuilder_apigateway(awsIntegrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.TOKEN_AUTHORIZER_BUILDER_APIGATEWAY: {
			TokenAuthorizerBuilder_apigateway tokenAuthorizerBuilder_apigateway = (TokenAuthorizerBuilder_apigateway) theEObject;
			T result = caseTokenAuthorizerBuilder_apigateway(tokenAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.STAGE_PROPS_BUILDER_APIGATEWAY: {
			StagePropsBuilder_apigateway stagePropsBuilder_apigateway = (StagePropsBuilder_apigateway) theEObject;
			T result = caseStagePropsBuilder_apigateway(stagePropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY: {
			LambdaAuthorizerPropsBuilder_apigateway lambdaAuthorizerPropsBuilder_apigateway = (LambdaAuthorizerPropsBuilder_apigateway) theEObject;
			T result = caseLambdaAuthorizerPropsBuilder_apigateway(lambdaAuthorizerPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY: {
			AwsIntegrationPropsBuilder_apigateway awsIntegrationPropsBuilder_apigateway = (AwsIntegrationPropsBuilder_apigateway) theEObject;
			T result = caseAwsIntegrationPropsBuilder_apigateway(awsIntegrationPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.INTEGRATION_BUILDER_APIGATEWAY: {
			IntegrationBuilder_apigateway integrationBuilder_apigateway = (IntegrationBuilder_apigateway) theEObject;
			T result = caseIntegrationBuilder_apigateway(integrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY: {
			DomainNamePropsBuilder_apigateway domainNamePropsBuilder_apigateway = (DomainNamePropsBuilder_apigateway) theEObject;
			T result = caseDomainNamePropsBuilder_apigateway(domainNamePropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY: {
			MethodResponseBuilder_apigateway methodResponseBuilder_apigateway = (MethodResponseBuilder_apigateway) theEObject;
			T result = caseMethodResponseBuilder_apigateway(methodResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REST_API_OPTIONS_BUILDER_APIGATEWAY: {
			RestApiOptionsBuilder_apigateway restApiOptionsBuilder_apigateway = (RestApiOptionsBuilder_apigateway) theEObject;
			T result = caseRestApiOptionsBuilder_apigateway(restApiOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY: {
			LambdaIntegrationOptionsBuilder_apigateway lambdaIntegrationOptionsBuilder_apigateway = (LambdaIntegrationOptionsBuilder_apigateway) theEObject;
			T result = caseLambdaIntegrationOptionsBuilder_apigateway(lambdaIntegrationOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.MODEL_BUILDER_APIGATEWAY: {
			ModelBuilder_apigateway modelBuilder_apigateway = (ModelBuilder_apigateway) theEObject;
			T result = caseModelBuilder_apigateway(modelBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY: {
			RequestAuthorizerBuilder_apigateway requestAuthorizerBuilder_apigateway = (RequestAuthorizerBuilder_apigateway) theEObject;
			T result = caseRequestAuthorizerBuilder_apigateway(requestAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.RESOURCE_PROPS_BUILDER_APIGATEWAY: {
			ResourcePropsBuilder_apigateway resourcePropsBuilder_apigateway = (ResourcePropsBuilder_apigateway) theEObject;
			T result = caseResourcePropsBuilder_apigateway(resourcePropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY: {
			RateLimitedApiKeyBuilder_apigateway rateLimitedApiKeyBuilder_apigateway = (RateLimitedApiKeyBuilder_apigateway) theEObject;
			T result = caseRateLimitedApiKeyBuilder_apigateway(rateLimitedApiKeyBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY: {
			ApiKeyOptionsBuilder_apigateway apiKeyOptionsBuilder_apigateway = (ApiKeyOptionsBuilder_apigateway) theEObject;
			T result = caseApiKeyOptionsBuilder_apigateway(apiKeyOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.MODEL_OPTIONS_BUILDER_APIGATEWAY: {
			ModelOptionsBuilder_apigateway modelOptionsBuilder_apigateway = (ModelOptionsBuilder_apigateway) theEObject;
			T result = caseModelOptionsBuilder_apigateway(modelOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.BASE_PATH_MAPPING_BUILDER_APIGATEWAY: {
			BasePathMappingBuilder_apigateway basePathMappingBuilder_apigateway = (BasePathMappingBuilder_apigateway) theEObject;
			T result = caseBasePathMappingBuilder_apigateway(basePathMappingBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY: {
			DomainNameAttributesBuilder_apigateway domainNameAttributesBuilder_apigateway = (DomainNameAttributesBuilder_apigateway) theEObject;
			T result = caseDomainNameAttributesBuilder_apigateway(domainNameAttributesBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY: {
			ThrottlingPerMethodBuilder_apigateway throttlingPerMethodBuilder_apigateway = (ThrottlingPerMethodBuilder_apigateway) theEObject;
			T result = caseThrottlingPerMethodBuilder_apigateway(throttlingPerMethodBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.USAGE_PLAN_PROPS_BUILDER_APIGATEWAY: {
			UsagePlanPropsBuilder_apigateway usagePlanPropsBuilder_apigateway = (UsagePlanPropsBuilder_apigateway) theEObject;
			T result = caseUsagePlanPropsBuilder_apigateway(usagePlanPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY: {
			GatewayResponsePropsBuilder_apigateway gatewayResponsePropsBuilder_apigateway = (GatewayResponsePropsBuilder_apigateway) theEObject;
			T result = caseGatewayResponsePropsBuilder_apigateway(gatewayResponsePropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.DOMAIN_NAME_BUILDER_APIGATEWAY: {
			DomainNameBuilder_apigateway domainNameBuilder_apigateway = (DomainNameBuilder_apigateway) theEObject;
			T result = caseDomainNameBuilder_apigateway(domainNameBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.PROXY_RESOURCE_BUILDER_APIGATEWAY: {
			ProxyResourceBuilder_apigateway proxyResourceBuilder_apigateway = (ProxyResourceBuilder_apigateway) theEObject;
			T result = caseProxyResourceBuilder_apigateway(proxyResourceBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY: {
			AccessLogDestinationConfigBuilder_apigateway accessLogDestinationConfigBuilder_apigateway = (AccessLogDestinationConfigBuilder_apigateway) theEObject;
			T result = caseAccessLogDestinationConfigBuilder_apigateway(accessLogDestinationConfigBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.METHOD_BUILDER_APIGATEWAY: {
			MethodBuilder_apigateway methodBuilder_apigateway = (MethodBuilder_apigateway) theEObject;
			T result = caseMethodBuilder_apigateway(methodBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY: {
			JsonWithStandardFieldPropsBuilder_apigateway jsonWithStandardFieldPropsBuilder_apigateway = (JsonWithStandardFieldPropsBuilder_apigateway) theEObject;
			T result = caseJsonWithStandardFieldPropsBuilder_apigateway(jsonWithStandardFieldPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY: {
			SpecRestApiPropsBuilder_apigateway specRestApiPropsBuilder_apigateway = (SpecRestApiPropsBuilder_apigateway) theEObject;
			T result = caseSpecRestApiPropsBuilder_apigateway(specRestApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Response Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Response Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationResponseBuilder_apigateway(IntegrationResponseBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Authorizer Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Authorizer Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAuthorizerPropsBuilder_apigateway(RequestAuthorizerPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Validator Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Validator Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestValidatorOptionsBuilder_apigateway(RequestValidatorOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Schema Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Schema Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonSchemaBuilder_apigateway(JsonSchemaBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Rest Api Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Rest Api Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaRestApiBuilder_apigateway(LambdaRestApiBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Integration Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Integration Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpIntegrationPropsBuilder_apigateway(HttpIntegrationPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Response Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Response Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayResponseOptionsBuilder_apigateway(GatewayResponseOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cors Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cors Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorsOptionsBuilder_apigateway(CorsOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Rest Api Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Rest Api Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaRestApiPropsBuilder_apigateway(LambdaRestApiPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Definition Config Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Definition Config Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiDefinitionConfigBuilder_apigateway(ApiDefinitionConfigBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Api Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Api Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestApiBuilder_apigateway(RestApiBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Configuration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Configuration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointConfigurationBuilder_apigateway(EndpointConfigurationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodPropsBuilder_apigateway(MethodPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Path Mapping Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Path Mapping Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePathMappingPropsBuilder_apigateway(BasePathMappingPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Plan Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Plan Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsagePlanBuilder_apigateway(UsagePlanBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quota Settings Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quota Settings Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuotaSettingsBuilder_apigateway(QuotaSettingsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Authorizer Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Authorizer Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenAuthorizerPropsBuilder_apigateway(TokenAuthorizerPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodOptionsBuilder_apigateway(MethodOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Integration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpIntegrationBuilder_apigateway(HttpIntegrationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Link Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Link Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcLinkPropsBuilder_apigateway(VpcLinkPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelPropsBuilder_apigateway(ModelPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBuilder_apigateway(ResourceBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throttle Settings Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throttle Settings Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrottleSettingsBuilder_apigateway(ThrottleSettingsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationOptionsBuilder_apigateway(IntegrationOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Path Mapping Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Path Mapping Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePathMappingOptionsBuilder_apigateway(BasePathMappingOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Deployment Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Deployment Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeploymentOptionsBuilder_apigateway(MethodDeploymentOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mock Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mock Integration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMockIntegrationBuilder_apigateway(MockIntegrationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageBuilder_apigateway(StageBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Resource Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Resource Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyResourceOptionsBuilder_apigateway(ProxyResourceOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Key Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Key Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiKeyBuilder_apigateway(ApiKeyBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Response Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Response Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayResponseBuilder_apigateway(GatewayResponseBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Validator Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Validator Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestValidatorPropsBuilder_apigateway(RequestValidatorPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Name Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Name Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainNameOptionsBuilder_apigateway(DomainNameOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Integration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaIntegrationBuilder_apigateway(LambdaIntegrationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Resource Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Resource Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyResourcePropsBuilder_apigateway(ProxyResourcePropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceOptionsBuilder_apigateway(ResourceOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationPropsBuilder_apigateway(IntegrationPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Validator Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Validator Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestValidatorBuilder_apigateway(RequestValidatorBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Plan Per Api Stage Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Plan Per Api Stage Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsagePlanPerApiStageBuilder_apigateway(UsagePlanPerApiStageBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Rest Api Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Rest Api Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecRestApiBuilder_apigateway(SpecRestApiBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Definition S3 Location Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Definition S3 Location Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiDefinitionS3LocationBuilder_apigateway(ApiDefinitionS3LocationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Link Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Link Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcLinkBuilder_apigateway(VpcLinkBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageOptionsBuilder_apigateway(StageOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Key Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Key Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiKeyPropsBuilder_apigateway(ApiKeyPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Limited Api Key Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Limited Api Key Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateLimitedApiKeyPropsBuilder_apigateway(RateLimitedApiKeyPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentBuilder_apigateway(DeploymentBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Api Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Api Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestApiPropsBuilder_apigateway(RestApiPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentPropsBuilder_apigateway(DeploymentPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aws Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aws Integration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwsIntegrationBuilder_apigateway(AwsIntegrationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Authorizer Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Authorizer Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenAuthorizerBuilder_apigateway(TokenAuthorizerBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStagePropsBuilder_apigateway(StagePropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Authorizer Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Authorizer Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaAuthorizerPropsBuilder_apigateway(LambdaAuthorizerPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aws Integration Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aws Integration Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwsIntegrationPropsBuilder_apigateway(AwsIntegrationPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationBuilder_apigateway(IntegrationBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Name Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Name Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainNamePropsBuilder_apigateway(DomainNamePropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Response Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Response Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodResponseBuilder_apigateway(MethodResponseBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Api Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Api Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestApiOptionsBuilder_apigateway(RestApiOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Integration Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Integration Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaIntegrationOptionsBuilder_apigateway(LambdaIntegrationOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelBuilder_apigateway(ModelBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Authorizer Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Authorizer Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAuthorizerBuilder_apigateway(RequestAuthorizerBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePropsBuilder_apigateway(ResourcePropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Limited Api Key Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Limited Api Key Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateLimitedApiKeyBuilder_apigateway(RateLimitedApiKeyBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Key Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Key Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiKeyOptionsBuilder_apigateway(ApiKeyOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Options Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelOptionsBuilder_apigateway(ModelOptionsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Path Mapping Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Path Mapping Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePathMappingBuilder_apigateway(BasePathMappingBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Name Attributes Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Name Attributes Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainNameAttributesBuilder_apigateway(DomainNameAttributesBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throttling Per Method Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throttling Per Method Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrottlingPerMethodBuilder_apigateway(ThrottlingPerMethodBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Plan Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Plan Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsagePlanPropsBuilder_apigateway(UsagePlanPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Response Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Response Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayResponsePropsBuilder_apigateway(GatewayResponsePropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Name Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Name Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainNameBuilder_apigateway(DomainNameBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Resource Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Resource Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyResourceBuilder_apigateway(ProxyResourceBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Log Destination Config Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Log Destination Config Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLogDestinationConfigBuilder_apigateway(AccessLogDestinationConfigBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodBuilder_apigateway(MethodBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json With Standard Field Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json With Standard Field Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonWithStandardFieldPropsBuilder_apigateway(JsonWithStandardFieldPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Rest Api Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Rest Api Props Builder apigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecRestApiPropsBuilder_apigateway(SpecRestApiPropsBuilder_apigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApigatewaySwitch
