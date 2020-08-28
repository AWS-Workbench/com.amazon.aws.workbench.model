/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public interface AwsworkbenchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AwsworkbenchFactory eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Builder core</em>'.
	 * @generated
	 */
	AppBuilder_core createAppBuilder_core();

	/**
	 * Returns a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * @generated
	 */
	DefaultStackSynthesizerBuilder_core createDefaultStackSynthesizerBuilder_core();

	/**
	 * Returns a new object of class '<em>Environment Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Builder core</em>'.
	 * @generated
	 */
	EnvironmentBuilder_core createEnvironmentBuilder_core();

	/**
	 * Returns a new object of class '<em>Flow Log Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Log Options Builder ec2</em>'.
	 * @generated
	 */
	FlowLogOptionsBuilder_ec2 createFlowLogOptionsBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Builder core</em>'.
	 * @generated
	 */
	StackBuilder_core createStackBuilder_core();

	/**
	 * Returns a new object of class '<em>Vpc Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpc Builder ec2</em>'.
	 * @generated
	 */
	VpcBuilder_ec2 createVpcBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet Builder ec2</em>'.
	 * @generated
	 */
	SubnetBuilder_ec2 createSubnetBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Subnet Selection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet Selection Builder ec2</em>'.
	 * @generated
	 */
	SubnetSelectionBuilder_ec2 createSubnetSelectionBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * @generated
	 */
	GatewayVpcEndpointBuilder_ec2 createGatewayVpcEndpointBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Method Deployment Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Deployment Options Builder apigateway</em>'.
	 * @generated
	 */
	MethodDeploymentOptionsBuilder_apigateway createMethodDeploymentOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Endpoint Configuration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Configuration Builder apigateway</em>'.
	 * @generated
	 */
	EndpointConfigurationBuilder_apigateway createEndpointConfigurationBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Stage Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage Options Builder apigateway</em>'.
	 * @generated
	 */
	StageOptionsBuilder_apigateway createStageOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Hosted Zone Builder route53</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hosted Zone Builder route53</em>'.
	 * @generated
	 */
	HostedZoneBuilder_route53 createHostedZoneBuilder_route53();

	/**
	 * Returns a new object of class '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * @generated
	 */
	DnsValidatedCertificateBuilder_certificatemanager createDnsValidatedCertificateBuilder_certificatemanager();

	/**
	 * Returns a new object of class '<em>Integration Response Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Response Builder apigateway</em>'.
	 * @generated
	 */
	IntegrationResponseBuilder_apigateway createIntegrationResponseBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate Builder certificatemanager</em>'.
	 * @generated
	 */
	CertificateBuilder_certificatemanager createCertificateBuilder_certificatemanager();

	/**
	 * Returns a new object of class '<em>Domain Name Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Name Options Builder apigateway</em>'.
	 * @generated
	 */
	DomainNameOptionsBuilder_apigateway createDomainNameOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Network Load Balancer Builder elasticloadbalancingv2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Load Balancer Builder elasticloadbalancingv2</em>'.
	 * @generated
	 */
	NetworkLoadBalancerBuilder_elasticloadbalancingv2 createNetworkLoadBalancerBuilder_elasticloadbalancingv2();

	/**
	 * Returns a new object of class '<em>Vpc Link Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpc Link Builder apigateway</em>'.
	 * @generated
	 */
	VpcLinkBuilder_apigateway createVpcLinkBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Integration Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Options Builder apigateway</em>'.
	 * @generated
	 */
	IntegrationOptionsBuilder_apigateway createIntegrationOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Integration Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Builder apigateway</em>'.
	 * @generated
	 */
	IntegrationBuilder_apigateway createIntegrationBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Cors Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cors Options Builder apigateway</em>'.
	 * @generated
	 */
	CorsOptionsBuilder_apigateway createCorsOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Key Builder kms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Builder kms</em>'.
	 * @generated
	 */
	KeyBuilder_kms createKeyBuilder_kms();

	/**
	 * Returns a new object of class '<em>Dead Letter Queue Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dead Letter Queue Builder sqs</em>'.
	 * @generated
	 */
	DeadLetterQueueBuilder_sqs createDeadLetterQueueBuilder_sqs();

	/**
	 * Returns a new object of class '<em>Queue Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Builder sqs</em>'.
	 * @generated
	 */
	QueueBuilder_sqs createQueueBuilder_sqs();

	/**
	 * Returns a new object of class '<em>Version Options Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Options Builder lambda</em>'.
	 * @generated
	 */
	VersionOptionsBuilder_lambda createVersionOptionsBuilder_lambda();

	/**
	 * Returns a new object of class '<em>Layer Version Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Version Builder lambda</em>'.
	 * @generated
	 */
	LayerVersionBuilder_lambda createLayerVersionBuilder_lambda();

	/**
	 * Returns a new object of class '<em>Security Group Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group Builder ec2</em>'.
	 * @generated
	 */
	SecurityGroupBuilder_ec2 createSecurityGroupBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Function Props Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Props Builder lambda</em>'.
	 * @generated
	 */
	FunctionPropsBuilder_lambda createFunctionPropsBuilder_lambda();

	/**
	 * Returns a new object of class '<em>Function Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Builder lambda</em>'.
	 * @generated
	 */
	FunctionBuilder_lambda createFunctionBuilder_lambda();

	/**
	 * Returns a new object of class '<em>Request Authorizer Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Authorizer Builder apigateway</em>'.
	 * @generated
	 */
	RequestAuthorizerBuilder_apigateway createRequestAuthorizerBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Token Authorizer Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Authorizer Builder apigateway</em>'.
	 * @generated
	 */
	TokenAuthorizerBuilder_apigateway createTokenAuthorizerBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Json Schema Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Schema Builder apigateway</em>'.
	 * @generated
	 */
	JsonSchemaBuilder_apigateway createJsonSchemaBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Model Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Builder apigateway</em>'.
	 * @generated
	 */
	ModelBuilder_apigateway createModelBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Request Validator Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Validator Options Builder apigateway</em>'.
	 * @generated
	 */
	RequestValidatorOptionsBuilder_apigateway createRequestValidatorOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Request Validator Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Validator Builder apigateway</em>'.
	 * @generated
	 */
	RequestValidatorBuilder_apigateway createRequestValidatorBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Method Response Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Response Builder apigateway</em>'.
	 * @generated
	 */
	MethodResponseBuilder_apigateway createMethodResponseBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Method Options Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Options Builder apigateway</em>'.
	 * @generated
	 */
	MethodOptionsBuilder_apigateway createMethodOptionsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Rest Api Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Api Props Builder apigateway</em>'.
	 * @generated
	 */
	RestApiPropsBuilder_apigateway createRestApiPropsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Api Gateway To Dynamo DB Builder apigatewaydynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Gateway To Dynamo DB Builder apigatewaydynamodb</em>'.
	 * @generated
	 */
	ApiGatewayToDynamoDBBuilder_apigatewaydynamodb createApiGatewayToDynamoDBBuilder_apigatewaydynamodb();

	/**
	 * Returns a new object of class '<em>Lambda Rest Api Props Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Rest Api Props Builder apigateway</em>'.
	 * @generated
	 */
	LambdaRestApiPropsBuilder_apigateway createLambdaRestApiPropsBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Lambda Rest Api Builder apigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Rest Api Builder apigateway</em>'.
	 * @generated
	 */
	LambdaRestApiBuilder_apigateway createLambdaRestApiBuilder_apigateway();

	/**
	 * Returns a new object of class '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * @generated
	 */
	ApiGatewayToLambdaBuilder_apigatewaylambda createApiGatewayToLambdaBuilder_apigatewaylambda();

	/**
	 * Returns a new object of class '<em>Queue Props Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Props Builder sqs</em>'.
	 * @generated
	 */
	QueuePropsBuilder_sqs createQueuePropsBuilder_sqs();

	/**
	 * Returns a new object of class '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * @generated
	 */
	ApiGatewayToSqsBuilder_apigatewaysqs createApiGatewayToSqsBuilder_apigatewaysqs();

	/**
	 * Returns a new object of class '<em>Version Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Builder lambda</em>'.
	 * @generated
	 */
	VersionBuilder_lambda createVersionBuilder_lambda();

	/**
	 * Returns a new object of class '<em>Lambda Function Association Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Function Association Builder cloudfront</em>'.
	 * @generated
	 */
	LambdaFunctionAssociationBuilder_cloudfront createLambdaFunctionAssociationBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Behavior Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Builder cloudfront</em>'.
	 * @generated
	 */
	BehaviorBuilder_cloudfront createBehaviorBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Custom Origin Config Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Origin Config Builder cloudfront</em>'.
	 * @generated
	 */
	CustomOriginConfigBuilder_cloudfront createCustomOriginConfigBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Block Public Access Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Public Access Builder s3</em>'.
	 * @generated
	 */
	BlockPublicAccessBuilder_s3 createBlockPublicAccessBuilder_s3();

	/**
	 * Returns a new object of class '<em>Cors Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cors Rule Builder s3</em>'.
	 * @generated
	 */
	CorsRuleBuilder_s3 createCorsRuleBuilder_s3();

	/**
	 * Returns a new object of class '<em>Noncurrent Version Transition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noncurrent Version Transition Builder s3</em>'.
	 * @generated
	 */
	NoncurrentVersionTransitionBuilder_s3 createNoncurrentVersionTransitionBuilder_s3();

	/**
	 * Returns a new object of class '<em>Transition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Builder s3</em>'.
	 * @generated
	 */
	TransitionBuilder_s3 createTransitionBuilder_s3();

	/**
	 * Returns a new object of class '<em>Lifecycle Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifecycle Rule Builder s3</em>'.
	 * @generated
	 */
	LifecycleRuleBuilder_s3 createLifecycleRuleBuilder_s3();

	/**
	 * Returns a new object of class '<em>Bucket Metrics Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket Metrics Builder s3</em>'.
	 * @generated
	 */
	BucketMetricsBuilder_s3 createBucketMetricsBuilder_s3();

	/**
	 * Returns a new object of class '<em>Redirect Target Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redirect Target Builder s3</em>'.
	 * @generated
	 */
	RedirectTargetBuilder_s3 createRedirectTargetBuilder_s3();

	/**
	 * Returns a new object of class '<em>Routing Rule Condition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Rule Condition Builder s3</em>'.
	 * @generated
	 */
	RoutingRuleConditionBuilder_s3 createRoutingRuleConditionBuilder_s3();

	/**
	 * Returns a new object of class '<em>Routing Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Rule Builder s3</em>'.
	 * @generated
	 */
	RoutingRuleBuilder_s3 createRoutingRuleBuilder_s3();

	/**
	 * Returns a new object of class '<em>Bucket Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket Builder s3</em>'.
	 * @generated
	 */
	BucketBuilder_s3 createBucketBuilder_s3();

	/**
	 * Returns a new object of class '<em>Bucket Props Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket Props Builder s3</em>'.
	 * @generated
	 */
	BucketPropsBuilder_s3 createBucketPropsBuilder_s3();

	/**
	 * Returns a new object of class '<em>Origin Access Identity Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Origin Access Identity Builder cloudfront</em>'.
	 * @generated
	 */
	OriginAccessIdentityBuilder_cloudfront createOriginAccessIdentityBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>S3 Origin Config Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S3 Origin Config Builder cloudfront</em>'.
	 * @generated
	 */
	S3OriginConfigBuilder_cloudfront createS3OriginConfigBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Source Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Configuration Builder cloudfront</em>'.
	 * @generated
	 */
	SourceConfigurationBuilder_cloudfront createSourceConfigurationBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Alias Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Configuration Builder cloudfront</em>'.
	 * @generated
	 */
	AliasConfigurationBuilder_cloudfront createAliasConfigurationBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Logging Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logging Configuration Builder cloudfront</em>'.
	 * @generated
	 */
	LoggingConfigurationBuilder_cloudfront createLoggingConfigurationBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Cloud Front Web Distribution Props Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Front Web Distribution Props Builder cloudfront</em>'.
	 * @generated
	 */
	CloudFrontWebDistributionPropsBuilder_cloudfront createCloudFrontWebDistributionPropsBuilder_cloudfront();

	/**
	 * Returns a new object of class '<em>Cloud Front To Api Gateway Builder cloudfrontapigateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Front To Api Gateway Builder cloudfrontapigateway</em>'.
	 * @generated
	 */
	CloudFrontToApiGatewayBuilder_cloudfrontapigateway createCloudFrontToApiGatewayBuilder_cloudfrontapigateway();

	/**
	 * Returns a new object of class '<em>Cloud Front To Api Gateway To Lambda Builder cloudfrontapigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Front To Api Gateway To Lambda Builder cloudfrontapigatewaylambda</em>'.
	 * @generated
	 */
	CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda();

	/**
	 * Returns a new object of class '<em>Cloud Front To S3 Builder cloudfronts3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Front To S3 Builder cloudfronts3</em>'.
	 * @generated
	 */
	CloudFrontToS3Builder_cloudfronts3 createCloudFrontToS3Builder_cloudfronts3();

	/**
	 * Returns a new object of class '<em>Auto Verified Attrs Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Verified Attrs Builder cognito</em>'.
	 * @generated
	 */
	AutoVerifiedAttrsBuilder_cognito createAutoVerifiedAttrsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Pool Triggers Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Pool Triggers Builder cognito</em>'.
	 * @generated
	 */
	UserPoolTriggersBuilder_cognito createUserPoolTriggersBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Email Settings Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Settings Builder cognito</em>'.
	 * @generated
	 */
	EmailSettingsBuilder_cognito createEmailSettingsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Password Policy Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password Policy Builder cognito</em>'.
	 * @generated
	 */
	PasswordPolicyBuilder_cognito createPasswordPolicyBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Mfa Second Factor Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mfa Second Factor Builder cognito</em>'.
	 * @generated
	 */
	MfaSecondFactorBuilder_cognito createMfaSecondFactorBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Required Attributes Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Attributes Builder cognito</em>'.
	 * @generated
	 */
	RequiredAttributesBuilder_cognito createRequiredAttributesBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Sign In Aliases Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sign In Aliases Builder cognito</em>'.
	 * @generated
	 */
	SignInAliasesBuilder_cognito createSignInAliasesBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Invitation Config Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Invitation Config Builder cognito</em>'.
	 * @generated
	 */
	UserInvitationConfigBuilder_cognito createUserInvitationConfigBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Verification Config Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Verification Config Builder cognito</em>'.
	 * @generated
	 */
	UserVerificationConfigBuilder_cognito createUserVerificationConfigBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Pool Props Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Pool Props Builder cognito</em>'.
	 * @generated
	 */
	UserPoolPropsBuilder_cognito createUserPoolPropsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Pool Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Pool Builder cognito</em>'.
	 * @generated
	 */
	UserPoolBuilder_cognito createUserPoolBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Auth Flow Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Flow Builder cognito</em>'.
	 * @generated
	 */
	AuthFlowBuilder_cognito createAuthFlowBuilder_cognito();

	/**
	 * Returns a new object of class '<em>OAuth Flows Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth Flows Builder cognito</em>'.
	 * @generated
	 */
	OAuthFlowsBuilder_cognito createOAuthFlowsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>OAuth Settings Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth Settings Builder cognito</em>'.
	 * @generated
	 */
	OAuthSettingsBuilder_cognito createOAuthSettingsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>User Pool Client Props Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Pool Client Props Builder cognito</em>'.
	 * @generated
	 */
	UserPoolClientPropsBuilder_cognito createUserPoolClientPropsBuilder_cognito();

	/**
	 * Returns a new object of class '<em>Cognito To Api Gateway To Lambda Builder cognitoapigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognito To Api Gateway To Lambda Builder cognitoapigatewaylambda</em>'.
	 * @generated
	 */
	CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda();

	/**
	 * Returns a new object of class '<em>Build Dead Letter Queue Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Dead Letter Queue Props Builder core</em>'.
	 * @generated
	 */
	BuildDeadLetterQueuePropsBuilder_core createBuildDeadLetterQueuePropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Queue Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Queue Props Builder core</em>'.
	 * @generated
	 */
	BuildQueuePropsBuilder_core createBuildQueuePropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build S3 Bucket Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build S3 Bucket Props Builder core</em>'.
	 * @generated
	 */
	BuildS3BucketPropsBuilder_core createBuildS3BucketPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Encryption Key Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Encryption Key Props Builder core</em>'.
	 * @generated
	 */
	BuildEncryptionKeyPropsBuilder_core createBuildEncryptionKeyPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Cognito Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognito Options Builder core</em>'.
	 * @generated
	 */
	CognitoOptionsBuilder_core createCognitoOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Kinesis Stream Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Kinesis Stream Props Builder core</em>'.
	 * @generated
	 */
	BuildKinesisStreamPropsBuilder_core createBuildKinesisStreamPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Kinesis Analytics App Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Kinesis Analytics App Props Builder core</em>'.
	 * @generated
	 */
	BuildKinesisAnalyticsAppPropsBuilder_core createBuildKinesisAnalyticsAppPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Lambda Function Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Lambda Function Props Builder core</em>'.
	 * @generated
	 */
	BuildLambdaFunctionPropsBuilder_core createBuildLambdaFunctionPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Dynamo DB Table Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Dynamo DB Table Props Builder core</em>'.
	 * @generated
	 */
	BuildDynamoDBTablePropsBuilder_core createBuildDynamoDBTablePropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Build Topic Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Topic Props Builder core</em>'.
	 * @generated
	 */
	BuildTopicPropsBuilder_core createBuildTopicPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Dynamo DB Stream To Lambda Builder dynamodbstreamlambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamo DB Stream To Lambda Builder dynamodbstreamlambda</em>'.
	 * @generated
	 */
	DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda();

	/**
	 * Returns a new object of class '<em>Dynamo DB Stream To Lambda To Elastic Search And Kibana Builder dynamodbstreamlambdaelasticsearchkibana</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamo DB Stream To Lambda To Elastic Search And Kibana Builder dynamodbstreamlambdaelasticsearchkibana</em>'.
	 * @generated
	 */
	DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana();

	/**
	 * Returns a new object of class '<em>Event Bus Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Bus Builder events</em>'.
	 * @generated
	 */
	EventBusBuilder_events createEventBusBuilder_events();

	/**
	 * Returns a new object of class '<em>Event Pattern Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Pattern Builder events</em>'.
	 * @generated
	 */
	EventPatternBuilder_events createEventPatternBuilder_events();

	/**
	 * Returns a new object of class '<em>Rule Props Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Props Builder events</em>'.
	 * @generated
	 */
	RulePropsBuilder_events createRulePropsBuilder_events();

	/**
	 * Returns a new object of class '<em>Cron Options Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Options Builder events</em>'.
	 * @generated
	 */
	CronOptionsBuilder_events createCronOptionsBuilder_events();

	/**
	 * Returns a new object of class '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * @generated
	 */
	EventsRuleToLambdaBuilder_eventsrulelambda createEventsRuleToLambdaBuilder_eventsrulelambda();

	/**
	 * Returns a new object of class '<em>State Machine Props Builder stepfunctions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine Props Builder stepfunctions</em>'.
	 * @generated
	 */
	StateMachinePropsBuilder_stepfunctions createStateMachinePropsBuilder_stepfunctions();

	/**
	 * Returns a new object of class '<em>Events Rule To Step Function Builder eventsrulestepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Events Rule To Step Function Builder eventsrulestepfunction</em>'.
	 * @generated
	 */
	EventsRuleToStepFunctionBuilder_eventsrulestepfunction createEventsRuleToStepFunctionBuilder_eventsrulestepfunction();

	/**
	 * Returns a new object of class '<em>Iot To Kinesis Firehose To S3 Builder iotkinesisfirehoses3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot To Kinesis Firehose To S3 Builder iotkinesisfirehoses3</em>'.
	 * @generated
	 */
	IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3();

	/**
	 * Returns a new object of class '<em>Iot To Lambda Builder iotlambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot To Lambda Builder iotlambda</em>'.
	 * @generated
	 */
	IotToLambdaBuilder_iotlambda createIotToLambdaBuilder_iotlambda();

	/**
	 * Returns a new object of class '<em>Iot To Lambda To Dynamo DB Builder iotlambdadynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot To Lambda To Dynamo DB Builder iotlambdadynamodb</em>'.
	 * @generated
	 */
	IotToLambdaToDynamoDBBuilder_iotlambdadynamodb createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb();

	/**
	 * Returns a new object of class '<em>Kinesis Firehose To S3 Builder kinesisfirehoses3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinesis Firehose To S3 Builder kinesisfirehoses3</em>'.
	 * @generated
	 */
	KinesisFirehoseToS3Builder_kinesisfirehoses3 createKinesisFirehoseToS3Builder_kinesisfirehoses3();

	/**
	 * Returns a new object of class '<em>Kinesis Firehose To Analytics And S3 Builder kinesisfirehoses3kinesisanalytics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinesis Firehose To Analytics And S3 Builder kinesisfirehoses3kinesisanalytics</em>'.
	 * @generated
	 */
	KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics();

	/**
	 * Returns a new object of class '<em>Kinesis Streams To Lambda Builder kinesisstreamslambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinesis Streams To Lambda Builder kinesisstreamslambda</em>'.
	 * @generated
	 */
	KinesisStreamsToLambdaBuilder_kinesisstreamslambda createKinesisStreamsToLambdaBuilder_kinesisstreamslambda();

	/**
	 * Returns a new object of class '<em>Table Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Builder dynamodb</em>'.
	 * @generated
	 */
	TableBuilder_dynamodb createTableBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Lambda To Dynamo DB Builder lambdadynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To Dynamo DB Builder lambdadynamodb</em>'.
	 * @generated
	 */
	LambdaToDynamoDBBuilder_lambdadynamodb createLambdaToDynamoDBBuilder_lambdadynamodb();

	/**
	 * Returns a new object of class '<em>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</em>'.
	 * @generated
	 */
	LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana();

	/**
	 * Returns a new object of class '<em>Lambda To S3 Builder lambdas3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To S3 Builder lambdas3</em>'.
	 * @generated
	 */
	LambdaToS3Builder_lambdas3 createLambdaToS3Builder_lambdas3();

	/**
	 * Returns a new object of class '<em>Topic Props Builder sns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Props Builder sns</em>'.
	 * @generated
	 */
	TopicPropsBuilder_sns createTopicPropsBuilder_sns();

	/**
	 * Returns a new object of class '<em>Lambda To Sns Builder lambdasns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To Sns Builder lambdasns</em>'.
	 * @generated
	 */
	LambdaToSnsBuilder_lambdasns createLambdaToSnsBuilder_lambdasns();

	/**
	 * Returns a new object of class '<em>Lambda To Sqs Builder lambdasqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To Sqs Builder lambdasqs</em>'.
	 * @generated
	 */
	LambdaToSqsBuilder_lambdasqs createLambdaToSqsBuilder_lambdasqs();

	/**
	 * Returns a new object of class '<em>Lambda To Step Function Builder lambdastepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda To Step Function Builder lambdastepfunction</em>'.
	 * @generated
	 */
	LambdaToStepFunctionBuilder_lambdastepfunction createLambdaToStepFunctionBuilder_lambdastepfunction();

	/**
	 * Returns a new object of class '<em>S3 To Lambda Builder s3lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S3 To Lambda Builder s3lambda</em>'.
	 * @generated
	 */
	S3ToLambdaBuilder_s3lambda createS3ToLambdaBuilder_s3lambda();

	/**
	 * Returns a new object of class '<em>S3 To Step Function Builder s3stepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S3 To Step Function Builder s3stepfunction</em>'.
	 * @generated
	 */
	S3ToStepFunctionBuilder_s3stepfunction createS3ToStepFunctionBuilder_s3stepfunction();

	/**
	 * Returns a new object of class '<em>Sns To Lambda Builder snslambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sns To Lambda Builder snslambda</em>'.
	 * @generated
	 */
	SnsToLambdaBuilder_snslambda createSnsToLambdaBuilder_snslambda();

	/**
	 * Returns a new object of class '<em>Managed Policy Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Managed Policy Builder iam</em>'.
	 * @generated
	 */
	ManagedPolicyBuilder_iam createManagedPolicyBuilder_iam();

	/**
	 * Returns a new object of class '<em>User Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Builder iam</em>'.
	 * @generated
	 */
	UserBuilder_iam createUserBuilder_iam();

	/**
	 * Returns a new object of class '<em>Group Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Builder iam</em>'.
	 * @generated
	 */
	GroupBuilder_iam createGroupBuilder_iam();

	/**
	 * Returns a new object of class '<em>Role Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Builder iam</em>'.
	 * @generated
	 */
	RoleBuilder_iam createRoleBuilder_iam();

	/**
	 * Returns a new object of class '<em>Policy Statement Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Statement Builder iam</em>'.
	 * @generated
	 */
	PolicyStatementBuilder_iam createPolicyStatementBuilder_iam();

	/**
	 * Returns a new object of class '<em>Policy Document Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Document Builder iam</em>'.
	 * @generated
	 */
	PolicyDocumentBuilder_iam createPolicyDocumentBuilder_iam();

	/**
	 * Returns a new object of class '<em>Sqs To Lambda Builder sqslambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqs To Lambda Builder sqslambda</em>'.
	 * @generated
	 */
	SqsToLambdaBuilder_sqslambda createSqsToLambdaBuilder_sqslambda();

	/**
	 * Returns a new object of class '<em>Attribute Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Builder dynamodb</em>'.
	 * @generated
	 */
	AttributeBuilder_dynamodb createAttributeBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Table Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Props Builder dynamodb</em>'.
	 * @generated
	 */
	TablePropsBuilder_dynamodb createTablePropsBuilder_dynamodb();

	/**
	 * Returns a new object of class '<em>Private Dns Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Dns Namespace Builder servicediscovery</em>'.
	 * @generated
	 */
	PrivateDnsNamespaceBuilder_servicediscovery createPrivateDnsNamespaceBuilder_servicediscovery();

	/**
	 * Returns a new object of class '<em>Public Dns Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Dns Namespace Builder servicediscovery</em>'.
	 * @generated
	 */
	PublicDnsNamespaceBuilder_servicediscovery createPublicDnsNamespaceBuilder_servicediscovery();

	/**
	 * Returns a new object of class '<em>Http Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Namespace Builder servicediscovery</em>'.
	 * @generated
	 */
	HttpNamespaceBuilder_servicediscovery createHttpNamespaceBuilder_servicediscovery();

	/**
	 * Returns a new object of class '<em>Cloud Map Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Map Options Builder ecs</em>'.
	 * @generated
	 */
	CloudMapOptionsBuilder_ecs createCloudMapOptionsBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Block Device Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Device Builder autoscaling</em>'.
	 * @generated
	 */
	BlockDeviceBuilder_autoscaling createBlockDeviceBuilder_autoscaling();

	/**
	 * Returns a new object of class '<em>Health Check Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Check Builder ecs</em>'.
	 * @generated
	 */
	HealthCheckBuilder_ecs createHealthCheckBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Amazon Linux Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amazon Linux Image Builder ec2</em>'.
	 * @generated
	 */
	AmazonLinuxImageBuilder_ec2 createAmazonLinuxImageBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Rolling Update Configuration Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rolling Update Configuration Builder autoscaling</em>'.
	 * @generated
	 */
	RollingUpdateConfigurationBuilder_autoscaling createRollingUpdateConfigurationBuilder_autoscaling();

	/**
	 * Returns a new object of class '<em>Add Capacity Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Capacity Options Builder ecs</em>'.
	 * @generated
	 */
	AddCapacityOptionsBuilder_ecs createAddCapacityOptionsBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Cloud Map Namespace Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Map Namespace Options Builder ecs</em>'.
	 * @generated
	 */
	CloudMapNamespaceOptionsBuilder_ecs createCloudMapNamespaceOptionsBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Cluster Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Builder ecs</em>'.
	 * @generated
	 */
	ClusterBuilder_ecs createClusterBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Application Load Balancer Builder elasticloadbalancingv2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balancer Builder elasticloadbalancingv2</em>'.
	 * @generated
	 */
	ApplicationLoadBalancerBuilder_elasticloadbalancingv2 createApplicationLoadBalancerBuilder_elasticloadbalancingv2();

	/**
	 * Returns a new object of class '<em>Docker Image Asset Builder assets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Image Asset Builder assets</em>'.
	 * @generated
	 */
	DockerImageAssetBuilder_assets createDockerImageAssetBuilder_assets();

	/**
	 * Returns a new object of class '<em>Asset Image Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Image Builder ecs</em>'.
	 * @generated
	 */
	AssetImageBuilder_ecs createAssetImageBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Secret String Generator Builder secretsmanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret String Generator Builder secretsmanager</em>'.
	 * @generated
	 */
	SecretStringGeneratorBuilder_secretsmanager createSecretStringGeneratorBuilder_secretsmanager();

	/**
	 * Returns a new object of class '<em>Secret Builder secretsmanager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret Builder secretsmanager</em>'.
	 * @generated
	 */
	SecretBuilder_secretsmanager createSecretBuilder_secretsmanager();

	/**
	 * Returns a new object of class '<em>Aws Log Driver Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aws Log Driver Builder ecs</em>'.
	 * @generated
	 */
	AwsLogDriverBuilder_ecs createAwsLogDriverBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Log Group Builder logs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Group Builder logs</em>'.
	 * @generated
	 */
	LogGroupBuilder_logs createLogGroupBuilder_logs();

	/**
	 * Returns a new object of class '<em>Aws Log Driver Props Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aws Log Driver Props Builder ecs</em>'.
	 * @generated
	 */
	AwsLogDriverPropsBuilder_ecs createAwsLogDriverPropsBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Application Load Balanced Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balanced Task Image Options Builder patterns</em>'.
	 * @generated
	 */
	ApplicationLoadBalancedTaskImageOptionsBuilder_patterns createApplicationLoadBalancedTaskImageOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>App Mesh Proxy Configuration Props Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Mesh Proxy Configuration Props Builder ecs</em>'.
	 * @generated
	 */
	AppMeshProxyConfigurationPropsBuilder_ecs createAppMeshProxyConfigurationPropsBuilder_ecs();

	/**
	 * Returns a new object of class '<em>App Mesh Proxy Configuration Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Mesh Proxy Configuration Builder ecs</em>'.
	 * @generated
	 */
	AppMeshProxyConfigurationBuilder_ecs createAppMeshProxyConfigurationBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Host Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Builder ecs</em>'.
	 * @generated
	 */
	HostBuilder_ecs createHostBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Docker Volume Configuration Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Volume Configuration Builder ecs</em>'.
	 * @generated
	 */
	DockerVolumeConfigurationBuilder_ecs createDockerVolumeConfigurationBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Volume Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Builder ecs</em>'.
	 * @generated
	 */
	VolumeBuilder_ecs createVolumeBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Ec2 Task Definition Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ec2 Task Definition Builder ecs</em>'.
	 * @generated
	 */
	Ec2TaskDefinitionBuilder_ecs createEc2TaskDefinitionBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Application Load Balanced Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balanced Ec2 Service Builder patterns</em>'.
	 * @generated
	 */
	ApplicationLoadBalancedEc2ServiceBuilder_patterns createApplicationLoadBalancedEc2ServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Fargate Task Definition Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fargate Task Definition Builder ecs</em>'.
	 * @generated
	 */
	FargateTaskDefinitionBuilder_ecs createFargateTaskDefinitionBuilder_ecs();

	/**
	 * Returns a new object of class '<em>Application Load Balanced Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balanced Fargate Service Builder patterns</em>'.
	 * @generated
	 */
	ApplicationLoadBalancedFargateServiceBuilder_patterns createApplicationLoadBalancedFargateServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * @generated
	 */
	ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Listener Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Listener Props Builder patterns</em>'.
	 * @generated
	 */
	ApplicationListenerPropsBuilder_patterns createApplicationListenerPropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Load Balancer Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balancer Props Builder patterns</em>'.
	 * @generated
	 */
	ApplicationLoadBalancerPropsBuilder_patterns createApplicationLoadBalancerPropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Target Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Target Props Builder patterns</em>'.
	 * @generated
	 */
	ApplicationTargetPropsBuilder_patterns createApplicationTargetPropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Load Balanced Task Image Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Load Balanced Task Image Props Builder patterns</em>'.
	 * @generated
	 */
	ApplicationLoadBalancedTaskImagePropsBuilder_patterns createApplicationLoadBalancedTaskImagePropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Application Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * @generated
	 */
	ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Load Balanced Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Load Balanced Task Image Options Builder patterns</em>'.
	 * @generated
	 */
	NetworkLoadBalancedTaskImageOptionsBuilder_patterns createNetworkLoadBalancedTaskImageOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Load Balanced Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Load Balanced Fargate Service Builder patterns</em>'.
	 * @generated
	 */
	NetworkLoadBalancedFargateServiceBuilder_patterns createNetworkLoadBalancedFargateServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Load Balanced Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Load Balanced Ec2 Service Builder patterns</em>'.
	 * @generated
	 */
	NetworkLoadBalancedEc2ServiceBuilder_patterns createNetworkLoadBalancedEc2ServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * @generated
	 */
	NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Target Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Target Props Builder patterns</em>'.
	 * @generated
	 */
	NetworkTargetPropsBuilder_patterns createNetworkTargetPropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Load Balanced Task Image Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Load Balanced Task Image Props Builder patterns</em>'.
	 * @generated
	 */
	NetworkLoadBalancedTaskImagePropsBuilder_patterns createNetworkLoadBalancedTaskImagePropsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Network Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * @generated
	 */
	NetworkMultipleTargetGroupsFargateServiceBuilder_patterns createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Scaling Interval Builder applicationautoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Interval Builder applicationautoscaling</em>'.
	 * @generated
	 */
	ScalingIntervalBuilder_applicationautoscaling createScalingIntervalBuilder_applicationautoscaling();

	/**
	 * Returns a new object of class '<em>Queue Processing Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Processing Fargate Service Builder patterns</em>'.
	 * @generated
	 */
	QueueProcessingFargateServiceBuilder_patterns createQueueProcessingFargateServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Cron Options Builder applicationautoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Options Builder applicationautoscaling</em>'.
	 * @generated
	 */
	CronOptionsBuilder_applicationautoscaling createCronOptionsBuilder_applicationautoscaling();

	/**
	 * Returns a new object of class '<em>Scheduled Ec2 Task Definition Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Ec2 Task Definition Options Builder patterns</em>'.
	 * @generated
	 */
	ScheduledEc2TaskDefinitionOptionsBuilder_patterns createScheduledEc2TaskDefinitionOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Scheduled Ec2 Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Ec2 Task Image Options Builder patterns</em>'.
	 * @generated
	 */
	ScheduledEc2TaskImageOptionsBuilder_patterns createScheduledEc2TaskImageOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Scheduled Ec2 Task Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Ec2 Task Builder patterns</em>'.
	 * @generated
	 */
	ScheduledEc2TaskBuilder_patterns createScheduledEc2TaskBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Queue Processing Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Processing Ec2 Service Builder patterns</em>'.
	 * @generated
	 */
	QueueProcessingEc2ServiceBuilder_patterns createQueueProcessingEc2ServiceBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Scheduled Fargate Task Definition Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Fargate Task Definition Options Builder patterns</em>'.
	 * @generated
	 */
	ScheduledFargateTaskDefinitionOptionsBuilder_patterns createScheduledFargateTaskDefinitionOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Scheduled Fargate Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Fargate Task Image Options Builder patterns</em>'.
	 * @generated
	 */
	ScheduledFargateTaskImageOptionsBuilder_patterns createScheduledFargateTaskImageOptionsBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Topic Builder sns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Builder sns</em>'.
	 * @generated
	 */
	TopicBuilder_sns createTopicBuilder_sns();

	/**
	 * Returns a new object of class '<em>Ec2 Health Check Options Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ec2 Health Check Options Builder autoscaling</em>'.
	 * @generated
	 */
	Ec2HealthCheckOptionsBuilder_autoscaling createEc2HealthCheckOptionsBuilder_autoscaling();

	/**
	 * Returns a new object of class '<em>Auto Scaling Group Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Scaling Group Builder autoscaling</em>'.
	 * @generated
	 */
	AutoScalingGroupBuilder_autoscaling createAutoScalingGroupBuilder_autoscaling();

	/**
	 * Returns a new object of class '<em>Option Configuration Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Configuration Builder rds</em>'.
	 * @generated
	 */
	OptionConfigurationBuilder_rds createOptionConfigurationBuilder_rds();

	/**
	 * Returns a new object of class '<em>Option Group Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Group Builder rds</em>'.
	 * @generated
	 */
	OptionGroupBuilder_rds createOptionGroupBuilder_rds();

	/**
	 * Returns a new object of class '<em>Port Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Builder ec2</em>'.
	 * @generated
	 */
	PortBuilder_ec2 createPortBuilder_ec2();

	/**
	 * Returns a new object of class '<em>Processor Features Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Features Builder rds</em>'.
	 * @generated
	 */
	ProcessorFeaturesBuilder_rds createProcessorFeaturesBuilder_rds();

	/**
	 * Returns a new object of class '<em>Oracle Ee Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Ee Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	OracleEeInstanceEnginePropsBuilder_rds createOracleEeInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Oracle Se1 Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Se1 Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	OracleSe1InstanceEnginePropsBuilder_rds createOracleSe1InstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Oracle Se2 Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Se2 Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	OracleSe2InstanceEnginePropsBuilder_rds createOracleSe2InstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Oracle Se Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oracle Se Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	OracleSeInstanceEnginePropsBuilder_rds createOracleSeInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Postgres Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postgres Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	PostgresInstanceEnginePropsBuilder_rds createPostgresInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Sql Server Ee Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Server Ee Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	SqlServerEeInstanceEnginePropsBuilder_rds createSqlServerEeInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Sql Server Ex Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Server Ex Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	SqlServerExInstanceEnginePropsBuilder_rds createSqlServerExInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Sql Server Se Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Server Se Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	SqlServerSeInstanceEnginePropsBuilder_rds createSqlServerSeInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Sql Server Web Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Server Web Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	SqlServerWebInstanceEnginePropsBuilder_rds createSqlServerWebInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>My Sql Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Sql Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	MySqlInstanceEnginePropsBuilder_rds createMySqlInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Maria Db Instance Engine Props Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maria Db Instance Engine Props Builder rds</em>'.
	 * @generated
	 */
	MariaDbInstanceEnginePropsBuilder_rds createMariaDbInstanceEnginePropsBuilder_rds();

	/**
	 * Returns a new object of class '<em>Parameter Group Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Group Builder rds</em>'.
	 * @generated
	 */
	ParameterGroupBuilder_rds createParameterGroupBuilder_rds();

	/**
	 * Returns a new object of class '<em>Database Instance Builder rds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Instance Builder rds</em>'.
	 * @generated
	 */
	DatabaseInstanceBuilder_rds createDatabaseInstanceBuilder_rds();

	/**
	 * Returns a new object of class '<em>Scheduled Fargate Task Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Fargate Task Builder patterns</em>'.
	 * @generated
	 */
	ScheduledFargateTaskBuilder_patterns createScheduledFargateTaskBuilder_patterns();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AwsworkbenchPackage getAwsworkbenchPackage();

} //AwsworkbenchFactory
