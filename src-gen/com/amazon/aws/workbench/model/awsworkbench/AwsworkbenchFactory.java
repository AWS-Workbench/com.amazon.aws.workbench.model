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
	 * Returns a new object of class '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * @generated
	 */
	ApiGatewayToLambdaBuilder_apigatewaylambda createApiGatewayToLambdaBuilder_apigatewaylambda();

	/**
	 * Returns a new object of class '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * @generated
	 */
	ApiGatewayToSqsBuilder_apigatewaysqs createApiGatewayToSqsBuilder_apigatewaysqs();

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
	 * Returns a new object of class '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * @generated
	 */
	EventsRuleToLambdaBuilder_eventsrulelambda createEventsRuleToLambdaBuilder_eventsrulelambda();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AwsworkbenchPackage getAwsworkbenchPackage();

} //AwsworkbenchFactory
