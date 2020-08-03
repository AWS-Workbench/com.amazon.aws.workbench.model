/**
 */
package apigateway.util;

import apigateway.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see apigateway.ApigatewayPackage
 * @generated
 */
public class ApigatewayAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApigatewayPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApigatewayAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApigatewayPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApigatewaySwitch<Adapter> modelSwitch = new ApigatewaySwitch<Adapter>() {
		@Override
		public Adapter caseIntegrationResponseBuilder_apigateway(IntegrationResponseBuilder_apigateway object) {
			return createIntegrationResponseBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestAuthorizerPropsBuilder_apigateway(RequestAuthorizerPropsBuilder_apigateway object) {
			return createRequestAuthorizerPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestValidatorOptionsBuilder_apigateway(RequestValidatorOptionsBuilder_apigateway object) {
			return createRequestValidatorOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseJsonSchemaBuilder_apigateway(JsonSchemaBuilder_apigateway object) {
			return createJsonSchemaBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaRestApiBuilder_apigateway(LambdaRestApiBuilder_apigateway object) {
			return createLambdaRestApiBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseHttpIntegrationPropsBuilder_apigateway(HttpIntegrationPropsBuilder_apigateway object) {
			return createHttpIntegrationPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseGatewayResponseOptionsBuilder_apigateway(GatewayResponseOptionsBuilder_apigateway object) {
			return createGatewayResponseOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseCorsOptionsBuilder_apigateway(CorsOptionsBuilder_apigateway object) {
			return createCorsOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaRestApiPropsBuilder_apigateway(LambdaRestApiPropsBuilder_apigateway object) {
			return createLambdaRestApiPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiDefinitionConfigBuilder_apigateway(ApiDefinitionConfigBuilder_apigateway object) {
			return createApiDefinitionConfigBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRestApiBuilder_apigateway(RestApiBuilder_apigateway object) {
			return createRestApiBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseEndpointConfigurationBuilder_apigateway(EndpointConfigurationBuilder_apigateway object) {
			return createEndpointConfigurationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodPropsBuilder_apigateway(MethodPropsBuilder_apigateway object) {
			return createMethodPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseBasePathMappingPropsBuilder_apigateway(BasePathMappingPropsBuilder_apigateway object) {
			return createBasePathMappingPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseUsagePlanBuilder_apigateway(UsagePlanBuilder_apigateway object) {
			return createUsagePlanBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseQuotaSettingsBuilder_apigateway(QuotaSettingsBuilder_apigateway object) {
			return createQuotaSettingsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseTokenAuthorizerPropsBuilder_apigateway(TokenAuthorizerPropsBuilder_apigateway object) {
			return createTokenAuthorizerPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodOptionsBuilder_apigateway(MethodOptionsBuilder_apigateway object) {
			return createMethodOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseHttpIntegrationBuilder_apigateway(HttpIntegrationBuilder_apigateway object) {
			return createHttpIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseVpcLinkPropsBuilder_apigateway(VpcLinkPropsBuilder_apigateway object) {
			return createVpcLinkPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseModelPropsBuilder_apigateway(ModelPropsBuilder_apigateway object) {
			return createModelPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseResourceBuilder_apigateway(ResourceBuilder_apigateway object) {
			return createResourceBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseThrottleSettingsBuilder_apigateway(ThrottleSettingsBuilder_apigateway object) {
			return createThrottleSettingsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseIntegrationOptionsBuilder_apigateway(IntegrationOptionsBuilder_apigateway object) {
			return createIntegrationOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseBasePathMappingOptionsBuilder_apigateway(BasePathMappingOptionsBuilder_apigateway object) {
			return createBasePathMappingOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodDeploymentOptionsBuilder_apigateway(MethodDeploymentOptionsBuilder_apigateway object) {
			return createMethodDeploymentOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMockIntegrationBuilder_apigateway(MockIntegrationBuilder_apigateway object) {
			return createMockIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseStageBuilder_apigateway(StageBuilder_apigateway object) {
			return createStageBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseProxyResourceOptionsBuilder_apigateway(ProxyResourceOptionsBuilder_apigateway object) {
			return createProxyResourceOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiKeyBuilder_apigateway(ApiKeyBuilder_apigateway object) {
			return createApiKeyBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseGatewayResponseBuilder_apigateway(GatewayResponseBuilder_apigateway object) {
			return createGatewayResponseBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestValidatorPropsBuilder_apigateway(RequestValidatorPropsBuilder_apigateway object) {
			return createRequestValidatorPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDomainNameOptionsBuilder_apigateway(DomainNameOptionsBuilder_apigateway object) {
			return createDomainNameOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaIntegrationBuilder_apigateway(LambdaIntegrationBuilder_apigateway object) {
			return createLambdaIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseProxyResourcePropsBuilder_apigateway(ProxyResourcePropsBuilder_apigateway object) {
			return createProxyResourcePropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseResourceOptionsBuilder_apigateway(ResourceOptionsBuilder_apigateway object) {
			return createResourceOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseIntegrationPropsBuilder_apigateway(IntegrationPropsBuilder_apigateway object) {
			return createIntegrationPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestValidatorBuilder_apigateway(RequestValidatorBuilder_apigateway object) {
			return createRequestValidatorBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseUsagePlanPerApiStageBuilder_apigateway(UsagePlanPerApiStageBuilder_apigateway object) {
			return createUsagePlanPerApiStageBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseSpecRestApiBuilder_apigateway(SpecRestApiBuilder_apigateway object) {
			return createSpecRestApiBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiDefinitionS3LocationBuilder_apigateway(ApiDefinitionS3LocationBuilder_apigateway object) {
			return createApiDefinitionS3LocationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseVpcLinkBuilder_apigateway(VpcLinkBuilder_apigateway object) {
			return createVpcLinkBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseStageOptionsBuilder_apigateway(StageOptionsBuilder_apigateway object) {
			return createStageOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiKeyPropsBuilder_apigateway(ApiKeyPropsBuilder_apigateway object) {
			return createApiKeyPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRateLimitedApiKeyPropsBuilder_apigateway(RateLimitedApiKeyPropsBuilder_apigateway object) {
			return createRateLimitedApiKeyPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDeploymentBuilder_apigateway(DeploymentBuilder_apigateway object) {
			return createDeploymentBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRestApiPropsBuilder_apigateway(RestApiPropsBuilder_apigateway object) {
			return createRestApiPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDeploymentPropsBuilder_apigateway(DeploymentPropsBuilder_apigateway object) {
			return createDeploymentPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseAwsIntegrationBuilder_apigateway(AwsIntegrationBuilder_apigateway object) {
			return createAwsIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseTokenAuthorizerBuilder_apigateway(TokenAuthorizerBuilder_apigateway object) {
			return createTokenAuthorizerBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseStagePropsBuilder_apigateway(StagePropsBuilder_apigateway object) {
			return createStagePropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaAuthorizerPropsBuilder_apigateway(LambdaAuthorizerPropsBuilder_apigateway object) {
			return createLambdaAuthorizerPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseAwsIntegrationPropsBuilder_apigateway(AwsIntegrationPropsBuilder_apigateway object) {
			return createAwsIntegrationPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseIntegrationBuilder_apigateway(IntegrationBuilder_apigateway object) {
			return createIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDomainNamePropsBuilder_apigateway(DomainNamePropsBuilder_apigateway object) {
			return createDomainNamePropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodResponseBuilder_apigateway(MethodResponseBuilder_apigateway object) {
			return createMethodResponseBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRestApiOptionsBuilder_apigateway(RestApiOptionsBuilder_apigateway object) {
			return createRestApiOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaIntegrationOptionsBuilder_apigateway(
				LambdaIntegrationOptionsBuilder_apigateway object) {
			return createLambdaIntegrationOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseModelBuilder_apigateway(ModelBuilder_apigateway object) {
			return createModelBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestAuthorizerBuilder_apigateway(RequestAuthorizerBuilder_apigateway object) {
			return createRequestAuthorizerBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseResourcePropsBuilder_apigateway(ResourcePropsBuilder_apigateway object) {
			return createResourcePropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRateLimitedApiKeyBuilder_apigateway(RateLimitedApiKeyBuilder_apigateway object) {
			return createRateLimitedApiKeyBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiKeyOptionsBuilder_apigateway(ApiKeyOptionsBuilder_apigateway object) {
			return createApiKeyOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseModelOptionsBuilder_apigateway(ModelOptionsBuilder_apigateway object) {
			return createModelOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseBasePathMappingBuilder_apigateway(BasePathMappingBuilder_apigateway object) {
			return createBasePathMappingBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDomainNameAttributesBuilder_apigateway(DomainNameAttributesBuilder_apigateway object) {
			return createDomainNameAttributesBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseThrottlingPerMethodBuilder_apigateway(ThrottlingPerMethodBuilder_apigateway object) {
			return createThrottlingPerMethodBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseUsagePlanPropsBuilder_apigateway(UsagePlanPropsBuilder_apigateway object) {
			return createUsagePlanPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseGatewayResponsePropsBuilder_apigateway(GatewayResponsePropsBuilder_apigateway object) {
			return createGatewayResponsePropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseDomainNameBuilder_apigateway(DomainNameBuilder_apigateway object) {
			return createDomainNameBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseProxyResourceBuilder_apigateway(ProxyResourceBuilder_apigateway object) {
			return createProxyResourceBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseAccessLogDestinationConfigBuilder_apigateway(
				AccessLogDestinationConfigBuilder_apigateway object) {
			return createAccessLogDestinationConfigBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodBuilder_apigateway(MethodBuilder_apigateway object) {
			return createMethodBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseJsonWithStandardFieldPropsBuilder_apigateway(
				JsonWithStandardFieldPropsBuilder_apigateway object) {
			return createJsonWithStandardFieldPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseSpecRestApiPropsBuilder_apigateway(SpecRestApiPropsBuilder_apigateway object) {
			return createSpecRestApiPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.IntegrationResponseBuilder_apigateway <em>Integration Response Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.IntegrationResponseBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationResponseBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RequestAuthorizerPropsBuilder_apigateway <em>Request Authorizer Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RequestAuthorizerPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestAuthorizerPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RequestValidatorOptionsBuilder_apigateway <em>Request Validator Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RequestValidatorOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestValidatorOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.JsonSchemaBuilder_apigateway <em>Json Schema Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.JsonSchemaBuilder_apigateway
	 * @generated
	 */
	public Adapter createJsonSchemaBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.LambdaRestApiBuilder_apigateway <em>Lambda Rest Api Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.LambdaRestApiBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaRestApiBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.HttpIntegrationPropsBuilder_apigateway <em>Http Integration Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.HttpIntegrationPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createHttpIntegrationPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.GatewayResponseOptionsBuilder_apigateway <em>Gateway Response Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.GatewayResponseOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createGatewayResponseOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.CorsOptionsBuilder_apigateway <em>Cors Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.CorsOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createCorsOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.LambdaRestApiPropsBuilder_apigateway <em>Lambda Rest Api Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.LambdaRestApiPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaRestApiPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ApiDefinitionConfigBuilder_apigateway <em>Api Definition Config Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ApiDefinitionConfigBuilder_apigateway
	 * @generated
	 */
	public Adapter createApiDefinitionConfigBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RestApiBuilder_apigateway <em>Rest Api Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RestApiBuilder_apigateway
	 * @generated
	 */
	public Adapter createRestApiBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.EndpointConfigurationBuilder_apigateway <em>Endpoint Configuration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.EndpointConfigurationBuilder_apigateway
	 * @generated
	 */
	public Adapter createEndpointConfigurationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MethodPropsBuilder_apigateway <em>Method Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MethodPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.BasePathMappingPropsBuilder_apigateway <em>Base Path Mapping Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.BasePathMappingPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createBasePathMappingPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.UsagePlanBuilder_apigateway <em>Usage Plan Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.UsagePlanBuilder_apigateway
	 * @generated
	 */
	public Adapter createUsagePlanBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.QuotaSettingsBuilder_apigateway <em>Quota Settings Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.QuotaSettingsBuilder_apigateway
	 * @generated
	 */
	public Adapter createQuotaSettingsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.TokenAuthorizerPropsBuilder_apigateway <em>Token Authorizer Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.TokenAuthorizerPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createTokenAuthorizerPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MethodOptionsBuilder_apigateway <em>Method Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MethodOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.HttpIntegrationBuilder_apigateway <em>Http Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.HttpIntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createHttpIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.VpcLinkPropsBuilder_apigateway <em>Vpc Link Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.VpcLinkPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createVpcLinkPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ModelPropsBuilder_apigateway <em>Model Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ModelPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createModelPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ResourceBuilder_apigateway <em>Resource Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ResourceBuilder_apigateway
	 * @generated
	 */
	public Adapter createResourceBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ThrottleSettingsBuilder_apigateway <em>Throttle Settings Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ThrottleSettingsBuilder_apigateway
	 * @generated
	 */
	public Adapter createThrottleSettingsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.IntegrationOptionsBuilder_apigateway <em>Integration Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.IntegrationOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.BasePathMappingOptionsBuilder_apigateway <em>Base Path Mapping Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.BasePathMappingOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createBasePathMappingOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MethodDeploymentOptionsBuilder_apigateway <em>Method Deployment Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MethodDeploymentOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodDeploymentOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MockIntegrationBuilder_apigateway <em>Mock Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MockIntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createMockIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.StageBuilder_apigateway <em>Stage Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.StageBuilder_apigateway
	 * @generated
	 */
	public Adapter createStageBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ProxyResourceOptionsBuilder_apigateway <em>Proxy Resource Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ProxyResourceOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createProxyResourceOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ApiKeyBuilder_apigateway <em>Api Key Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ApiKeyBuilder_apigateway
	 * @generated
	 */
	public Adapter createApiKeyBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.GatewayResponseBuilder_apigateway <em>Gateway Response Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.GatewayResponseBuilder_apigateway
	 * @generated
	 */
	public Adapter createGatewayResponseBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RequestValidatorPropsBuilder_apigateway <em>Request Validator Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RequestValidatorPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestValidatorPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DomainNameOptionsBuilder_apigateway <em>Domain Name Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DomainNameOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createDomainNameOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.LambdaIntegrationBuilder_apigateway <em>Lambda Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.LambdaIntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ProxyResourcePropsBuilder_apigateway <em>Proxy Resource Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ProxyResourcePropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createProxyResourcePropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ResourceOptionsBuilder_apigateway <em>Resource Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ResourceOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createResourceOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.IntegrationPropsBuilder_apigateway <em>Integration Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.IntegrationPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RequestValidatorBuilder_apigateway <em>Request Validator Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RequestValidatorBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestValidatorBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.UsagePlanPerApiStageBuilder_apigateway <em>Usage Plan Per Api Stage Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.UsagePlanPerApiStageBuilder_apigateway
	 * @generated
	 */
	public Adapter createUsagePlanPerApiStageBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.SpecRestApiBuilder_apigateway <em>Spec Rest Api Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.SpecRestApiBuilder_apigateway
	 * @generated
	 */
	public Adapter createSpecRestApiBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ApiDefinitionS3LocationBuilder_apigateway <em>Api Definition S3 Location Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ApiDefinitionS3LocationBuilder_apigateway
	 * @generated
	 */
	public Adapter createApiDefinitionS3LocationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.VpcLinkBuilder_apigateway <em>Vpc Link Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.VpcLinkBuilder_apigateway
	 * @generated
	 */
	public Adapter createVpcLinkBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.StageOptionsBuilder_apigateway <em>Stage Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.StageOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createStageOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ApiKeyPropsBuilder_apigateway <em>Api Key Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ApiKeyPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createApiKeyPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RateLimitedApiKeyPropsBuilder_apigateway <em>Rate Limited Api Key Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RateLimitedApiKeyPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRateLimitedApiKeyPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DeploymentBuilder_apigateway <em>Deployment Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DeploymentBuilder_apigateway
	 * @generated
	 */
	public Adapter createDeploymentBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RestApiPropsBuilder_apigateway <em>Rest Api Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RestApiPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRestApiPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DeploymentPropsBuilder_apigateway <em>Deployment Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DeploymentPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createDeploymentPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.AwsIntegrationBuilder_apigateway <em>Aws Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.AwsIntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createAwsIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.TokenAuthorizerBuilder_apigateway <em>Token Authorizer Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.TokenAuthorizerBuilder_apigateway
	 * @generated
	 */
	public Adapter createTokenAuthorizerBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.StagePropsBuilder_apigateway <em>Stage Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.StagePropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createStagePropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.LambdaAuthorizerPropsBuilder_apigateway <em>Lambda Authorizer Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.LambdaAuthorizerPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaAuthorizerPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.AwsIntegrationPropsBuilder_apigateway <em>Aws Integration Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.AwsIntegrationPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createAwsIntegrationPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.IntegrationBuilder_apigateway <em>Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.IntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DomainNamePropsBuilder_apigateway <em>Domain Name Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DomainNamePropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createDomainNamePropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MethodResponseBuilder_apigateway <em>Method Response Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MethodResponseBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodResponseBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RestApiOptionsBuilder_apigateway <em>Rest Api Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RestApiOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRestApiOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.LambdaIntegrationOptionsBuilder_apigateway <em>Lambda Integration Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.LambdaIntegrationOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaIntegrationOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ModelBuilder_apigateway <em>Model Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ModelBuilder_apigateway
	 * @generated
	 */
	public Adapter createModelBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RequestAuthorizerBuilder_apigateway <em>Request Authorizer Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RequestAuthorizerBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestAuthorizerBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ResourcePropsBuilder_apigateway <em>Resource Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ResourcePropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createResourcePropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.RateLimitedApiKeyBuilder_apigateway <em>Rate Limited Api Key Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.RateLimitedApiKeyBuilder_apigateway
	 * @generated
	 */
	public Adapter createRateLimitedApiKeyBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ApiKeyOptionsBuilder_apigateway <em>Api Key Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ApiKeyOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createApiKeyOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ModelOptionsBuilder_apigateway <em>Model Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ModelOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createModelOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.BasePathMappingBuilder_apigateway <em>Base Path Mapping Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.BasePathMappingBuilder_apigateway
	 * @generated
	 */
	public Adapter createBasePathMappingBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DomainNameAttributesBuilder_apigateway <em>Domain Name Attributes Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DomainNameAttributesBuilder_apigateway
	 * @generated
	 */
	public Adapter createDomainNameAttributesBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ThrottlingPerMethodBuilder_apigateway <em>Throttling Per Method Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ThrottlingPerMethodBuilder_apigateway
	 * @generated
	 */
	public Adapter createThrottlingPerMethodBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.UsagePlanPropsBuilder_apigateway <em>Usage Plan Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.UsagePlanPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createUsagePlanPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.GatewayResponsePropsBuilder_apigateway <em>Gateway Response Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.GatewayResponsePropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createGatewayResponsePropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.DomainNameBuilder_apigateway <em>Domain Name Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.DomainNameBuilder_apigateway
	 * @generated
	 */
	public Adapter createDomainNameBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.ProxyResourceBuilder_apigateway <em>Proxy Resource Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.ProxyResourceBuilder_apigateway
	 * @generated
	 */
	public Adapter createProxyResourceBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.AccessLogDestinationConfigBuilder_apigateway <em>Access Log Destination Config Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.AccessLogDestinationConfigBuilder_apigateway
	 * @generated
	 */
	public Adapter createAccessLogDestinationConfigBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.MethodBuilder_apigateway <em>Method Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.MethodBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.JsonWithStandardFieldPropsBuilder_apigateway <em>Json With Standard Field Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.JsonWithStandardFieldPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createJsonWithStandardFieldPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apigateway.SpecRestApiPropsBuilder_apigateway <em>Spec Rest Api Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apigateway.SpecRestApiPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createSpecRestApiPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApigatewayAdapterFactory
