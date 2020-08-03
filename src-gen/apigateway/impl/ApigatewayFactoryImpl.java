/**
 */
package apigateway.impl;

import apigateway.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApigatewayFactoryImpl extends EFactoryImpl implements ApigatewayFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApigatewayFactory init() {
		try {
			ApigatewayFactory theApigatewayFactory = (ApigatewayFactory) EPackage.Registry.INSTANCE
					.getEFactory(ApigatewayPackage.eNS_URI);
			if (theApigatewayFactory != null) {
				return theApigatewayFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApigatewayFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApigatewayFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ApigatewayPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY:
			return createIntegrationResponseBuilder_apigateway();
		case ApigatewayPackage.REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY:
			return createRequestAuthorizerPropsBuilder_apigateway();
		case ApigatewayPackage.REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY:
			return createRequestValidatorOptionsBuilder_apigateway();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY:
			return createJsonSchemaBuilder_apigateway();
		case ApigatewayPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY:
			return createLambdaRestApiBuilder_apigateway();
		case ApigatewayPackage.HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY:
			return createHttpIntegrationPropsBuilder_apigateway();
		case ApigatewayPackage.GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY:
			return createGatewayResponseOptionsBuilder_apigateway();
		case ApigatewayPackage.CORS_OPTIONS_BUILDER_APIGATEWAY:
			return createCorsOptionsBuilder_apigateway();
		case ApigatewayPackage.LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY:
			return createLambdaRestApiPropsBuilder_apigateway();
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY:
			return createApiDefinitionConfigBuilder_apigateway();
		case ApigatewayPackage.REST_API_BUILDER_APIGATEWAY:
			return createRestApiBuilder_apigateway();
		case ApigatewayPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY:
			return createEndpointConfigurationBuilder_apigateway();
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY:
			return createMethodPropsBuilder_apigateway();
		case ApigatewayPackage.BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY:
			return createBasePathMappingPropsBuilder_apigateway();
		case ApigatewayPackage.USAGE_PLAN_BUILDER_APIGATEWAY:
			return createUsagePlanBuilder_apigateway();
		case ApigatewayPackage.QUOTA_SETTINGS_BUILDER_APIGATEWAY:
			return createQuotaSettingsBuilder_apigateway();
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY:
			return createTokenAuthorizerPropsBuilder_apigateway();
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY:
			return createMethodOptionsBuilder_apigateway();
		case ApigatewayPackage.HTTP_INTEGRATION_BUILDER_APIGATEWAY:
			return createHttpIntegrationBuilder_apigateway();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY:
			return createVpcLinkPropsBuilder_apigateway();
		case ApigatewayPackage.MODEL_PROPS_BUILDER_APIGATEWAY:
			return createModelPropsBuilder_apigateway();
		case ApigatewayPackage.RESOURCE_BUILDER_APIGATEWAY:
			return createResourceBuilder_apigateway();
		case ApigatewayPackage.THROTTLE_SETTINGS_BUILDER_APIGATEWAY:
			return createThrottleSettingsBuilder_apigateway();
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY:
			return createIntegrationOptionsBuilder_apigateway();
		case ApigatewayPackage.BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY:
			return createBasePathMappingOptionsBuilder_apigateway();
		case ApigatewayPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY:
			return createMethodDeploymentOptionsBuilder_apigateway();
		case ApigatewayPackage.MOCK_INTEGRATION_BUILDER_APIGATEWAY:
			return createMockIntegrationBuilder_apigateway();
		case ApigatewayPackage.STAGE_BUILDER_APIGATEWAY:
			return createStageBuilder_apigateway();
		case ApigatewayPackage.PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY:
			return createProxyResourceOptionsBuilder_apigateway();
		case ApigatewayPackage.API_KEY_BUILDER_APIGATEWAY:
			return createApiKeyBuilder_apigateway();
		case ApigatewayPackage.GATEWAY_RESPONSE_BUILDER_APIGATEWAY:
			return createGatewayResponseBuilder_apigateway();
		case ApigatewayPackage.REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY:
			return createRequestValidatorPropsBuilder_apigateway();
		case ApigatewayPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY:
			return createDomainNameOptionsBuilder_apigateway();
		case ApigatewayPackage.LAMBDA_INTEGRATION_BUILDER_APIGATEWAY:
			return createLambdaIntegrationBuilder_apigateway();
		case ApigatewayPackage.PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY:
			return createProxyResourcePropsBuilder_apigateway();
		case ApigatewayPackage.RESOURCE_OPTIONS_BUILDER_APIGATEWAY:
			return createResourceOptionsBuilder_apigateway();
		case ApigatewayPackage.INTEGRATION_PROPS_BUILDER_APIGATEWAY:
			return createIntegrationPropsBuilder_apigateway();
		case ApigatewayPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY:
			return createRequestValidatorBuilder_apigateway();
		case ApigatewayPackage.USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY:
			return createUsagePlanPerApiStageBuilder_apigateway();
		case ApigatewayPackage.SPEC_REST_API_BUILDER_APIGATEWAY:
			return createSpecRestApiBuilder_apigateway();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY:
			return createApiDefinitionS3LocationBuilder_apigateway();
		case ApigatewayPackage.VPC_LINK_BUILDER_APIGATEWAY:
			return createVpcLinkBuilder_apigateway();
		case ApigatewayPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY:
			return createStageOptionsBuilder_apigateway();
		case ApigatewayPackage.API_KEY_PROPS_BUILDER_APIGATEWAY:
			return createApiKeyPropsBuilder_apigateway();
		case ApigatewayPackage.RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY:
			return createRateLimitedApiKeyPropsBuilder_apigateway();
		case ApigatewayPackage.DEPLOYMENT_BUILDER_APIGATEWAY:
			return createDeploymentBuilder_apigateway();
		case ApigatewayPackage.REST_API_PROPS_BUILDER_APIGATEWAY:
			return createRestApiPropsBuilder_apigateway();
		case ApigatewayPackage.DEPLOYMENT_PROPS_BUILDER_APIGATEWAY:
			return createDeploymentPropsBuilder_apigateway();
		case ApigatewayPackage.AWS_INTEGRATION_BUILDER_APIGATEWAY:
			return createAwsIntegrationBuilder_apigateway();
		case ApigatewayPackage.TOKEN_AUTHORIZER_BUILDER_APIGATEWAY:
			return createTokenAuthorizerBuilder_apigateway();
		case ApigatewayPackage.STAGE_PROPS_BUILDER_APIGATEWAY:
			return createStagePropsBuilder_apigateway();
		case ApigatewayPackage.LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY:
			return createLambdaAuthorizerPropsBuilder_apigateway();
		case ApigatewayPackage.AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY:
			return createAwsIntegrationPropsBuilder_apigateway();
		case ApigatewayPackage.INTEGRATION_BUILDER_APIGATEWAY:
			return createIntegrationBuilder_apigateway();
		case ApigatewayPackage.DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY:
			return createDomainNamePropsBuilder_apigateway();
		case ApigatewayPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY:
			return createMethodResponseBuilder_apigateway();
		case ApigatewayPackage.REST_API_OPTIONS_BUILDER_APIGATEWAY:
			return createRestApiOptionsBuilder_apigateway();
		case ApigatewayPackage.LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY:
			return createLambdaIntegrationOptionsBuilder_apigateway();
		case ApigatewayPackage.MODEL_BUILDER_APIGATEWAY:
			return createModelBuilder_apigateway();
		case ApigatewayPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY:
			return createRequestAuthorizerBuilder_apigateway();
		case ApigatewayPackage.RESOURCE_PROPS_BUILDER_APIGATEWAY:
			return createResourcePropsBuilder_apigateway();
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY:
			return createRateLimitedApiKeyBuilder_apigateway();
		case ApigatewayPackage.API_KEY_OPTIONS_BUILDER_APIGATEWAY:
			return createApiKeyOptionsBuilder_apigateway();
		case ApigatewayPackage.MODEL_OPTIONS_BUILDER_APIGATEWAY:
			return createModelOptionsBuilder_apigateway();
		case ApigatewayPackage.BASE_PATH_MAPPING_BUILDER_APIGATEWAY:
			return createBasePathMappingBuilder_apigateway();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY:
			return createDomainNameAttributesBuilder_apigateway();
		case ApigatewayPackage.THROTTLING_PER_METHOD_BUILDER_APIGATEWAY:
			return createThrottlingPerMethodBuilder_apigateway();
		case ApigatewayPackage.USAGE_PLAN_PROPS_BUILDER_APIGATEWAY:
			return createUsagePlanPropsBuilder_apigateway();
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY:
			return createGatewayResponsePropsBuilder_apigateway();
		case ApigatewayPackage.DOMAIN_NAME_BUILDER_APIGATEWAY:
			return createDomainNameBuilder_apigateway();
		case ApigatewayPackage.PROXY_RESOURCE_BUILDER_APIGATEWAY:
			return createProxyResourceBuilder_apigateway();
		case ApigatewayPackage.ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY:
			return createAccessLogDestinationConfigBuilder_apigateway();
		case ApigatewayPackage.METHOD_BUILDER_APIGATEWAY:
			return createMethodBuilder_apigateway();
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY:
			return createJsonWithStandardFieldPropsBuilder_apigateway();
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY:
			return createSpecRestApiPropsBuilder_apigateway();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ApigatewayPackage.CONTENT_HANDLING:
			return createContentHandlingFromString(eDataType, initialValue);
		case ApigatewayPackage.CONNECTION_TYPE:
			return createConnectionTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.AUTHORIZATION_TYPE:
			return createAuthorizationTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.METHOD_LOGGING_LEVEL:
			return createMethodLoggingLevelFromString(eDataType, initialValue);
		case ApigatewayPackage.ENDPOINT_TYPE:
			return createEndpointTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.API_KEY_SOURCE_TYPE:
			return createApiKeySourceTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.PERIOD:
			return createPeriodFromString(eDataType, initialValue);
		case ApigatewayPackage.INTEGRATION_TYPE:
			return createIntegrationTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.SECURITY_POLICY:
			return createSecurityPolicyFromString(eDataType, initialValue);
		case ApigatewayPackage.PASSTHROUGH_BEHAVIOR:
			return createPassthroughBehaviorFromString(eDataType, initialValue);
		case ApigatewayPackage.JSON_SCHEMA_TYPE:
			return createJsonSchemaTypeFromString(eDataType, initialValue);
		case ApigatewayPackage.JSON_SCHEMA_VERSION:
			return createJsonSchemaVersionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ApigatewayPackage.CONTENT_HANDLING:
			return convertContentHandlingToString(eDataType, instanceValue);
		case ApigatewayPackage.CONNECTION_TYPE:
			return convertConnectionTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.AUTHORIZATION_TYPE:
			return convertAuthorizationTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.METHOD_LOGGING_LEVEL:
			return convertMethodLoggingLevelToString(eDataType, instanceValue);
		case ApigatewayPackage.ENDPOINT_TYPE:
			return convertEndpointTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.API_KEY_SOURCE_TYPE:
			return convertApiKeySourceTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.PERIOD:
			return convertPeriodToString(eDataType, instanceValue);
		case ApigatewayPackage.INTEGRATION_TYPE:
			return convertIntegrationTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.SECURITY_POLICY:
			return convertSecurityPolicyToString(eDataType, instanceValue);
		case ApigatewayPackage.PASSTHROUGH_BEHAVIOR:
			return convertPassthroughBehaviorToString(eDataType, instanceValue);
		case ApigatewayPackage.JSON_SCHEMA_TYPE:
			return convertJsonSchemaTypeToString(eDataType, instanceValue);
		case ApigatewayPackage.JSON_SCHEMA_VERSION:
			return convertJsonSchemaVersionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationResponseBuilder_apigateway createIntegrationResponseBuilder_apigateway() {
		IntegrationResponseBuilder_apigatewayImpl integrationResponseBuilder_apigateway = new IntegrationResponseBuilder_apigatewayImpl();
		return integrationResponseBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestAuthorizerPropsBuilder_apigateway createRequestAuthorizerPropsBuilder_apigateway() {
		RequestAuthorizerPropsBuilder_apigatewayImpl requestAuthorizerPropsBuilder_apigateway = new RequestAuthorizerPropsBuilder_apigatewayImpl();
		return requestAuthorizerPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestValidatorOptionsBuilder_apigateway createRequestValidatorOptionsBuilder_apigateway() {
		RequestValidatorOptionsBuilder_apigatewayImpl requestValidatorOptionsBuilder_apigateway = new RequestValidatorOptionsBuilder_apigatewayImpl();
		return requestValidatorOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonSchemaBuilder_apigateway createJsonSchemaBuilder_apigateway() {
		JsonSchemaBuilder_apigatewayImpl jsonSchemaBuilder_apigateway = new JsonSchemaBuilder_apigatewayImpl();
		return jsonSchemaBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaRestApiBuilder_apigateway createLambdaRestApiBuilder_apigateway() {
		LambdaRestApiBuilder_apigatewayImpl lambdaRestApiBuilder_apigateway = new LambdaRestApiBuilder_apigatewayImpl();
		return lambdaRestApiBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpIntegrationPropsBuilder_apigateway createHttpIntegrationPropsBuilder_apigateway() {
		HttpIntegrationPropsBuilder_apigatewayImpl httpIntegrationPropsBuilder_apigateway = new HttpIntegrationPropsBuilder_apigatewayImpl();
		return httpIntegrationPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayResponseOptionsBuilder_apigateway createGatewayResponseOptionsBuilder_apigateway() {
		GatewayResponseOptionsBuilder_apigatewayImpl gatewayResponseOptionsBuilder_apigateway = new GatewayResponseOptionsBuilder_apigatewayImpl();
		return gatewayResponseOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorsOptionsBuilder_apigateway createCorsOptionsBuilder_apigateway() {
		CorsOptionsBuilder_apigatewayImpl corsOptionsBuilder_apigateway = new CorsOptionsBuilder_apigatewayImpl();
		return corsOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaRestApiPropsBuilder_apigateway createLambdaRestApiPropsBuilder_apigateway() {
		LambdaRestApiPropsBuilder_apigatewayImpl lambdaRestApiPropsBuilder_apigateway = new LambdaRestApiPropsBuilder_apigatewayImpl();
		return lambdaRestApiPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiDefinitionConfigBuilder_apigateway createApiDefinitionConfigBuilder_apigateway() {
		ApiDefinitionConfigBuilder_apigatewayImpl apiDefinitionConfigBuilder_apigateway = new ApiDefinitionConfigBuilder_apigatewayImpl();
		return apiDefinitionConfigBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestApiBuilder_apigateway createRestApiBuilder_apigateway() {
		RestApiBuilder_apigatewayImpl restApiBuilder_apigateway = new RestApiBuilder_apigatewayImpl();
		return restApiBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointConfigurationBuilder_apigateway createEndpointConfigurationBuilder_apigateway() {
		EndpointConfigurationBuilder_apigatewayImpl endpointConfigurationBuilder_apigateway = new EndpointConfigurationBuilder_apigatewayImpl();
		return endpointConfigurationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodPropsBuilder_apigateway createMethodPropsBuilder_apigateway() {
		MethodPropsBuilder_apigatewayImpl methodPropsBuilder_apigateway = new MethodPropsBuilder_apigatewayImpl();
		return methodPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePathMappingPropsBuilder_apigateway createBasePathMappingPropsBuilder_apigateway() {
		BasePathMappingPropsBuilder_apigatewayImpl basePathMappingPropsBuilder_apigateway = new BasePathMappingPropsBuilder_apigatewayImpl();
		return basePathMappingPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsagePlanBuilder_apigateway createUsagePlanBuilder_apigateway() {
		UsagePlanBuilder_apigatewayImpl usagePlanBuilder_apigateway = new UsagePlanBuilder_apigatewayImpl();
		return usagePlanBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotaSettingsBuilder_apigateway createQuotaSettingsBuilder_apigateway() {
		QuotaSettingsBuilder_apigatewayImpl quotaSettingsBuilder_apigateway = new QuotaSettingsBuilder_apigatewayImpl();
		return quotaSettingsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenAuthorizerPropsBuilder_apigateway createTokenAuthorizerPropsBuilder_apigateway() {
		TokenAuthorizerPropsBuilder_apigatewayImpl tokenAuthorizerPropsBuilder_apigateway = new TokenAuthorizerPropsBuilder_apigatewayImpl();
		return tokenAuthorizerPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodOptionsBuilder_apigateway createMethodOptionsBuilder_apigateway() {
		MethodOptionsBuilder_apigatewayImpl methodOptionsBuilder_apigateway = new MethodOptionsBuilder_apigatewayImpl();
		return methodOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpIntegrationBuilder_apigateway createHttpIntegrationBuilder_apigateway() {
		HttpIntegrationBuilder_apigatewayImpl httpIntegrationBuilder_apigateway = new HttpIntegrationBuilder_apigatewayImpl();
		return httpIntegrationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcLinkPropsBuilder_apigateway createVpcLinkPropsBuilder_apigateway() {
		VpcLinkPropsBuilder_apigatewayImpl vpcLinkPropsBuilder_apigateway = new VpcLinkPropsBuilder_apigatewayImpl();
		return vpcLinkPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPropsBuilder_apigateway createModelPropsBuilder_apigateway() {
		ModelPropsBuilder_apigatewayImpl modelPropsBuilder_apigateway = new ModelPropsBuilder_apigatewayImpl();
		return modelPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceBuilder_apigateway createResourceBuilder_apigateway() {
		ResourceBuilder_apigatewayImpl resourceBuilder_apigateway = new ResourceBuilder_apigatewayImpl();
		return resourceBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottleSettingsBuilder_apigateway createThrottleSettingsBuilder_apigateway() {
		ThrottleSettingsBuilder_apigatewayImpl throttleSettingsBuilder_apigateway = new ThrottleSettingsBuilder_apigatewayImpl();
		return throttleSettingsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationOptionsBuilder_apigateway createIntegrationOptionsBuilder_apigateway() {
		IntegrationOptionsBuilder_apigatewayImpl integrationOptionsBuilder_apigateway = new IntegrationOptionsBuilder_apigatewayImpl();
		return integrationOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePathMappingOptionsBuilder_apigateway createBasePathMappingOptionsBuilder_apigateway() {
		BasePathMappingOptionsBuilder_apigatewayImpl basePathMappingOptionsBuilder_apigateway = new BasePathMappingOptionsBuilder_apigatewayImpl();
		return basePathMappingOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeploymentOptionsBuilder_apigateway createMethodDeploymentOptionsBuilder_apigateway() {
		MethodDeploymentOptionsBuilder_apigatewayImpl methodDeploymentOptionsBuilder_apigateway = new MethodDeploymentOptionsBuilder_apigatewayImpl();
		return methodDeploymentOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MockIntegrationBuilder_apigateway createMockIntegrationBuilder_apigateway() {
		MockIntegrationBuilder_apigatewayImpl mockIntegrationBuilder_apigateway = new MockIntegrationBuilder_apigatewayImpl();
		return mockIntegrationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageBuilder_apigateway createStageBuilder_apigateway() {
		StageBuilder_apigatewayImpl stageBuilder_apigateway = new StageBuilder_apigatewayImpl();
		return stageBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxyResourceOptionsBuilder_apigateway createProxyResourceOptionsBuilder_apigateway() {
		ProxyResourceOptionsBuilder_apigatewayImpl proxyResourceOptionsBuilder_apigateway = new ProxyResourceOptionsBuilder_apigatewayImpl();
		return proxyResourceOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeyBuilder_apigateway createApiKeyBuilder_apigateway() {
		ApiKeyBuilder_apigatewayImpl apiKeyBuilder_apigateway = new ApiKeyBuilder_apigatewayImpl();
		return apiKeyBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayResponseBuilder_apigateway createGatewayResponseBuilder_apigateway() {
		GatewayResponseBuilder_apigatewayImpl gatewayResponseBuilder_apigateway = new GatewayResponseBuilder_apigatewayImpl();
		return gatewayResponseBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestValidatorPropsBuilder_apigateway createRequestValidatorPropsBuilder_apigateway() {
		RequestValidatorPropsBuilder_apigatewayImpl requestValidatorPropsBuilder_apigateway = new RequestValidatorPropsBuilder_apigatewayImpl();
		return requestValidatorPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainNameOptionsBuilder_apigateway createDomainNameOptionsBuilder_apigateway() {
		DomainNameOptionsBuilder_apigatewayImpl domainNameOptionsBuilder_apigateway = new DomainNameOptionsBuilder_apigatewayImpl();
		return domainNameOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaIntegrationBuilder_apigateway createLambdaIntegrationBuilder_apigateway() {
		LambdaIntegrationBuilder_apigatewayImpl lambdaIntegrationBuilder_apigateway = new LambdaIntegrationBuilder_apigatewayImpl();
		return lambdaIntegrationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxyResourcePropsBuilder_apigateway createProxyResourcePropsBuilder_apigateway() {
		ProxyResourcePropsBuilder_apigatewayImpl proxyResourcePropsBuilder_apigateway = new ProxyResourcePropsBuilder_apigatewayImpl();
		return proxyResourcePropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceOptionsBuilder_apigateway createResourceOptionsBuilder_apigateway() {
		ResourceOptionsBuilder_apigatewayImpl resourceOptionsBuilder_apigateway = new ResourceOptionsBuilder_apigatewayImpl();
		return resourceOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationPropsBuilder_apigateway createIntegrationPropsBuilder_apigateway() {
		IntegrationPropsBuilder_apigatewayImpl integrationPropsBuilder_apigateway = new IntegrationPropsBuilder_apigatewayImpl();
		return integrationPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestValidatorBuilder_apigateway createRequestValidatorBuilder_apigateway() {
		RequestValidatorBuilder_apigatewayImpl requestValidatorBuilder_apigateway = new RequestValidatorBuilder_apigatewayImpl();
		return requestValidatorBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsagePlanPerApiStageBuilder_apigateway createUsagePlanPerApiStageBuilder_apigateway() {
		UsagePlanPerApiStageBuilder_apigatewayImpl usagePlanPerApiStageBuilder_apigateway = new UsagePlanPerApiStageBuilder_apigatewayImpl();
		return usagePlanPerApiStageBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecRestApiBuilder_apigateway createSpecRestApiBuilder_apigateway() {
		SpecRestApiBuilder_apigatewayImpl specRestApiBuilder_apigateway = new SpecRestApiBuilder_apigatewayImpl();
		return specRestApiBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiDefinitionS3LocationBuilder_apigateway createApiDefinitionS3LocationBuilder_apigateway() {
		ApiDefinitionS3LocationBuilder_apigatewayImpl apiDefinitionS3LocationBuilder_apigateway = new ApiDefinitionS3LocationBuilder_apigatewayImpl();
		return apiDefinitionS3LocationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcLinkBuilder_apigateway createVpcLinkBuilder_apigateway() {
		VpcLinkBuilder_apigatewayImpl vpcLinkBuilder_apigateway = new VpcLinkBuilder_apigatewayImpl();
		return vpcLinkBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageOptionsBuilder_apigateway createStageOptionsBuilder_apigateway() {
		StageOptionsBuilder_apigatewayImpl stageOptionsBuilder_apigateway = new StageOptionsBuilder_apigatewayImpl();
		return stageOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeyPropsBuilder_apigateway createApiKeyPropsBuilder_apigateway() {
		ApiKeyPropsBuilder_apigatewayImpl apiKeyPropsBuilder_apigateway = new ApiKeyPropsBuilder_apigatewayImpl();
		return apiKeyPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateLimitedApiKeyPropsBuilder_apigateway createRateLimitedApiKeyPropsBuilder_apigateway() {
		RateLimitedApiKeyPropsBuilder_apigatewayImpl rateLimitedApiKeyPropsBuilder_apigateway = new RateLimitedApiKeyPropsBuilder_apigatewayImpl();
		return rateLimitedApiKeyPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentBuilder_apigateway createDeploymentBuilder_apigateway() {
		DeploymentBuilder_apigatewayImpl deploymentBuilder_apigateway = new DeploymentBuilder_apigatewayImpl();
		return deploymentBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestApiPropsBuilder_apigateway createRestApiPropsBuilder_apigateway() {
		RestApiPropsBuilder_apigatewayImpl restApiPropsBuilder_apigateway = new RestApiPropsBuilder_apigatewayImpl();
		return restApiPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentPropsBuilder_apigateway createDeploymentPropsBuilder_apigateway() {
		DeploymentPropsBuilder_apigatewayImpl deploymentPropsBuilder_apigateway = new DeploymentPropsBuilder_apigatewayImpl();
		return deploymentPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsIntegrationBuilder_apigateway createAwsIntegrationBuilder_apigateway() {
		AwsIntegrationBuilder_apigatewayImpl awsIntegrationBuilder_apigateway = new AwsIntegrationBuilder_apigatewayImpl();
		return awsIntegrationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenAuthorizerBuilder_apigateway createTokenAuthorizerBuilder_apigateway() {
		TokenAuthorizerBuilder_apigatewayImpl tokenAuthorizerBuilder_apigateway = new TokenAuthorizerBuilder_apigatewayImpl();
		return tokenAuthorizerBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StagePropsBuilder_apigateway createStagePropsBuilder_apigateway() {
		StagePropsBuilder_apigatewayImpl stagePropsBuilder_apigateway = new StagePropsBuilder_apigatewayImpl();
		return stagePropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaAuthorizerPropsBuilder_apigateway createLambdaAuthorizerPropsBuilder_apigateway() {
		LambdaAuthorizerPropsBuilder_apigatewayImpl lambdaAuthorizerPropsBuilder_apigateway = new LambdaAuthorizerPropsBuilder_apigatewayImpl();
		return lambdaAuthorizerPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsIntegrationPropsBuilder_apigateway createAwsIntegrationPropsBuilder_apigateway() {
		AwsIntegrationPropsBuilder_apigatewayImpl awsIntegrationPropsBuilder_apigateway = new AwsIntegrationPropsBuilder_apigatewayImpl();
		return awsIntegrationPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationBuilder_apigateway createIntegrationBuilder_apigateway() {
		IntegrationBuilder_apigatewayImpl integrationBuilder_apigateway = new IntegrationBuilder_apigatewayImpl();
		return integrationBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainNamePropsBuilder_apigateway createDomainNamePropsBuilder_apigateway() {
		DomainNamePropsBuilder_apigatewayImpl domainNamePropsBuilder_apigateway = new DomainNamePropsBuilder_apigatewayImpl();
		return domainNamePropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodResponseBuilder_apigateway createMethodResponseBuilder_apigateway() {
		MethodResponseBuilder_apigatewayImpl methodResponseBuilder_apigateway = new MethodResponseBuilder_apigatewayImpl();
		return methodResponseBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestApiOptionsBuilder_apigateway createRestApiOptionsBuilder_apigateway() {
		RestApiOptionsBuilder_apigatewayImpl restApiOptionsBuilder_apigateway = new RestApiOptionsBuilder_apigatewayImpl();
		return restApiOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaIntegrationOptionsBuilder_apigateway createLambdaIntegrationOptionsBuilder_apigateway() {
		LambdaIntegrationOptionsBuilder_apigatewayImpl lambdaIntegrationOptionsBuilder_apigateway = new LambdaIntegrationOptionsBuilder_apigatewayImpl();
		return lambdaIntegrationOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelBuilder_apigateway createModelBuilder_apigateway() {
		ModelBuilder_apigatewayImpl modelBuilder_apigateway = new ModelBuilder_apigatewayImpl();
		return modelBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestAuthorizerBuilder_apigateway createRequestAuthorizerBuilder_apigateway() {
		RequestAuthorizerBuilder_apigatewayImpl requestAuthorizerBuilder_apigateway = new RequestAuthorizerBuilder_apigatewayImpl();
		return requestAuthorizerBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropsBuilder_apigateway createResourcePropsBuilder_apigateway() {
		ResourcePropsBuilder_apigatewayImpl resourcePropsBuilder_apigateway = new ResourcePropsBuilder_apigatewayImpl();
		return resourcePropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateLimitedApiKeyBuilder_apigateway createRateLimitedApiKeyBuilder_apigateway() {
		RateLimitedApiKeyBuilder_apigatewayImpl rateLimitedApiKeyBuilder_apigateway = new RateLimitedApiKeyBuilder_apigatewayImpl();
		return rateLimitedApiKeyBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeyOptionsBuilder_apigateway createApiKeyOptionsBuilder_apigateway() {
		ApiKeyOptionsBuilder_apigatewayImpl apiKeyOptionsBuilder_apigateway = new ApiKeyOptionsBuilder_apigatewayImpl();
		return apiKeyOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelOptionsBuilder_apigateway createModelOptionsBuilder_apigateway() {
		ModelOptionsBuilder_apigatewayImpl modelOptionsBuilder_apigateway = new ModelOptionsBuilder_apigatewayImpl();
		return modelOptionsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePathMappingBuilder_apigateway createBasePathMappingBuilder_apigateway() {
		BasePathMappingBuilder_apigatewayImpl basePathMappingBuilder_apigateway = new BasePathMappingBuilder_apigatewayImpl();
		return basePathMappingBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainNameAttributesBuilder_apigateway createDomainNameAttributesBuilder_apigateway() {
		DomainNameAttributesBuilder_apigatewayImpl domainNameAttributesBuilder_apigateway = new DomainNameAttributesBuilder_apigatewayImpl();
		return domainNameAttributesBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottlingPerMethodBuilder_apigateway createThrottlingPerMethodBuilder_apigateway() {
		ThrottlingPerMethodBuilder_apigatewayImpl throttlingPerMethodBuilder_apigateway = new ThrottlingPerMethodBuilder_apigatewayImpl();
		return throttlingPerMethodBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsagePlanPropsBuilder_apigateway createUsagePlanPropsBuilder_apigateway() {
		UsagePlanPropsBuilder_apigatewayImpl usagePlanPropsBuilder_apigateway = new UsagePlanPropsBuilder_apigatewayImpl();
		return usagePlanPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayResponsePropsBuilder_apigateway createGatewayResponsePropsBuilder_apigateway() {
		GatewayResponsePropsBuilder_apigatewayImpl gatewayResponsePropsBuilder_apigateway = new GatewayResponsePropsBuilder_apigatewayImpl();
		return gatewayResponsePropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainNameBuilder_apigateway createDomainNameBuilder_apigateway() {
		DomainNameBuilder_apigatewayImpl domainNameBuilder_apigateway = new DomainNameBuilder_apigatewayImpl();
		return domainNameBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxyResourceBuilder_apigateway createProxyResourceBuilder_apigateway() {
		ProxyResourceBuilder_apigatewayImpl proxyResourceBuilder_apigateway = new ProxyResourceBuilder_apigatewayImpl();
		return proxyResourceBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessLogDestinationConfigBuilder_apigateway createAccessLogDestinationConfigBuilder_apigateway() {
		AccessLogDestinationConfigBuilder_apigatewayImpl accessLogDestinationConfigBuilder_apigateway = new AccessLogDestinationConfigBuilder_apigatewayImpl();
		return accessLogDestinationConfigBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodBuilder_apigateway createMethodBuilder_apigateway() {
		MethodBuilder_apigatewayImpl methodBuilder_apigateway = new MethodBuilder_apigatewayImpl();
		return methodBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonWithStandardFieldPropsBuilder_apigateway createJsonWithStandardFieldPropsBuilder_apigateway() {
		JsonWithStandardFieldPropsBuilder_apigatewayImpl jsonWithStandardFieldPropsBuilder_apigateway = new JsonWithStandardFieldPropsBuilder_apigatewayImpl();
		return jsonWithStandardFieldPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecRestApiPropsBuilder_apigateway createSpecRestApiPropsBuilder_apigateway() {
		SpecRestApiPropsBuilder_apigatewayImpl specRestApiPropsBuilder_apigateway = new SpecRestApiPropsBuilder_apigatewayImpl();
		return specRestApiPropsBuilder_apigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHandling createContentHandlingFromString(EDataType eDataType, String initialValue) {
		ContentHandling result = ContentHandling.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentHandlingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationType createAuthorizationTypeFromString(EDataType eDataType, String initialValue) {
		AuthorizationType result = AuthorizationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLoggingLevel createMethodLoggingLevelFromString(EDataType eDataType, String initialValue) {
		MethodLoggingLevel result = MethodLoggingLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodLoggingLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointType createEndpointTypeFromString(EDataType eDataType, String initialValue) {
		EndpointType result = EndpointType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiKeySourceType createApiKeySourceTypeFromString(EDataType eDataType, String initialValue) {
		ApiKeySourceType result = ApiKeySourceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiKeySourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriodFromString(EDataType eDataType, String initialValue) {
		Period result = Period.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationType createIntegrationTypeFromString(EDataType eDataType, String initialValue) {
		IntegrationType result = IntegrationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicy createSecurityPolicyFromString(EDataType eDataType, String initialValue) {
		SecurityPolicy result = SecurityPolicy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassthroughBehavior createPassthroughBehaviorFromString(EDataType eDataType, String initialValue) {
		PassthroughBehavior result = PassthroughBehavior.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassthroughBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonSchemaType createJsonSchemaTypeFromString(EDataType eDataType, String initialValue) {
		JsonSchemaType result = JsonSchemaType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonSchemaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonSchemaVersion createJsonSchemaVersionFromString(EDataType eDataType, String initialValue) {
		JsonSchemaVersion result = JsonSchemaVersion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonSchemaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApigatewayPackage getApigatewayPackage() {
		return (ApigatewayPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApigatewayPackage getPackage() {
		return ApigatewayPackage.eINSTANCE;
	}

} //ApigatewayFactoryImpl
