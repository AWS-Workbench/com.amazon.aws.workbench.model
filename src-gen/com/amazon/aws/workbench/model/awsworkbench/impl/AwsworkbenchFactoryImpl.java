/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.*;

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
public class AwsworkbenchFactoryImpl extends EFactoryImpl implements AwsworkbenchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AwsworkbenchFactory init() {
		try {
			AwsworkbenchFactory theAwsworkbenchFactory = (AwsworkbenchFactory) EPackage.Registry.INSTANCE
					.getEFactory(AwsworkbenchPackage.eNS_URI);
			if (theAwsworkbenchFactory != null) {
				return theAwsworkbenchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AwsworkbenchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchFactoryImpl() {
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
		case AwsworkbenchPackage.APP_BUILDER_CORE:
			return createAppBuilder_core();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE:
			return createDefaultStackSynthesizerBuilder_core();
		case AwsworkbenchPackage.ENVIRONMENT_BUILDER_CORE:
			return createEnvironmentBuilder_core();
		case AwsworkbenchPackage.FLOW_LOG_OPTIONS_BUILDER_EC2:
			return createFlowLogOptionsBuilder_ec2();
		case AwsworkbenchPackage.STACK_BUILDER_CORE:
			return createStackBuilder_core();
		case AwsworkbenchPackage.VPC_BUILDER_EC2:
			return createVpcBuilder_ec2();
		case AwsworkbenchPackage.SUBNET_BUILDER_EC2:
			return createSubnetBuilder_ec2();
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2:
			return createSubnetSelectionBuilder_ec2();
		case AwsworkbenchPackage.GATEWAY_VPC_ENDPOINT_BUILDER_EC2:
			return createGatewayVpcEndpointBuilder_ec2();
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY:
			return createMethodDeploymentOptionsBuilder_apigateway();
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY:
			return createEndpointConfigurationBuilder_apigateway();
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY:
			return createStageOptionsBuilder_apigateway();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53:
			return createHostedZoneBuilder_route53();
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER:
			return createDnsValidatedCertificateBuilder_certificatemanager();
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY:
			return createIntegrationResponseBuilder_apigateway();
		case AwsworkbenchPackage.CERTIFICATE_BUILDER_CERTIFICATEMANAGER:
			return createCertificateBuilder_certificatemanager();
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY:
			return createDomainNameOptionsBuilder_apigateway();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2:
			return createNetworkLoadBalancerBuilder_elasticloadbalancingv2();
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY:
			return createVpcLinkBuilder_apigateway();
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY:
			return createIntegrationOptionsBuilder_apigateway();
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY:
			return createIntegrationBuilder_apigateway();
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY:
			return createCorsOptionsBuilder_apigateway();
		case AwsworkbenchPackage.KEY_BUILDER_KMS:
			return createKeyBuilder_kms();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS:
			return createDeadLetterQueueBuilder_sqs();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS:
			return createQueueBuilder_sqs();
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA:
			return createVersionOptionsBuilder_lambda();
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA:
			return createLayerVersionBuilder_lambda();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2:
			return createSecurityGroupBuilder_ec2();
		case AwsworkbenchPackage.FUNCTION_PROPS_BUILDER_LAMBDA:
			return createFunctionPropsBuilder_lambda();
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA:
			return createFunctionBuilder_lambda();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY:
			return createRequestAuthorizerBuilder_apigateway();
		case AwsworkbenchPackage.TOKEN_AUTHORIZER_BUILDER_APIGATEWAY:
			return createTokenAuthorizerBuilder_apigateway();
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY:
			return createJsonSchemaBuilder_apigateway();
		case AwsworkbenchPackage.MODEL_BUILDER_APIGATEWAY:
			return createModelBuilder_apigateway();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY:
			return createRequestValidatorOptionsBuilder_apigateway();
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY:
			return createRequestValidatorBuilder_apigateway();
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY:
			return createMethodResponseBuilder_apigateway();
		case AwsworkbenchPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY:
			return createMethodOptionsBuilder_apigateway();
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY:
			return createRestApiPropsBuilder_apigateway();
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB:
			return createApiGatewayToDynamoDBBuilder_apigatewaydynamodb();
		case AwsworkbenchPackage.LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY:
			return createLambdaRestApiPropsBuilder_apigateway();
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY:
			return createLambdaRestApiBuilder_apigateway();
		case AwsworkbenchPackage.API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA:
			return createApiGatewayToLambdaBuilder_apigatewaylambda();
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS:
			return createQueuePropsBuilder_sqs();
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS:
			return createApiGatewayToSqsBuilder_apigatewaysqs();
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA:
			return createVersionBuilder_lambda();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT:
			return createLambdaFunctionAssociationBuilder_cloudfront();
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT:
			return createBehaviorBuilder_cloudfront();
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT:
			return createCustomOriginConfigBuilder_cloudfront();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3:
			return createBlockPublicAccessBuilder_s3();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3:
			return createCorsRuleBuilder_s3();
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3:
			return createNoncurrentVersionTransitionBuilder_s3();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3:
			return createTransitionBuilder_s3();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3:
			return createLifecycleRuleBuilder_s3();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3:
			return createBucketMetricsBuilder_s3();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3:
			return createRedirectTargetBuilder_s3();
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3:
			return createRoutingRuleConditionBuilder_s3();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3:
			return createRoutingRuleBuilder_s3();
		case AwsworkbenchPackage.BUCKET_BUILDER_S3:
			return createBucketBuilder_s3();
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3:
			return createBucketPropsBuilder_s3();
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT:
			return createOriginAccessIdentityBuilder_cloudfront();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT:
			return createS3OriginConfigBuilder_cloudfront();
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT:
			return createSourceConfigurationBuilder_cloudfront();
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT:
			return createAliasConfigurationBuilder_cloudfront();
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT:
			return createLoggingConfigurationBuilder_cloudfront();
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT:
			return createCloudFrontWebDistributionPropsBuilder_cloudfront();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY:
			return createCloudFrontToApiGatewayBuilder_cloudfrontapigateway();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA:
			return createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3:
			return createCloudFrontToS3Builder_cloudfronts3();
		case AwsworkbenchPackage.AUTO_VERIFIED_ATTRS_BUILDER_COGNITO:
			return createAutoVerifiedAttrsBuilder_cognito();
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO:
			return createUserPoolTriggersBuilder_cognito();
		case AwsworkbenchPackage.EMAIL_SETTINGS_BUILDER_COGNITO:
			return createEmailSettingsBuilder_cognito();
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO:
			return createPasswordPolicyBuilder_cognito();
		case AwsworkbenchPackage.MFA_SECOND_FACTOR_BUILDER_COGNITO:
			return createMfaSecondFactorBuilder_cognito();
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO:
			return createRequiredAttributesBuilder_cognito();
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO:
			return createSignInAliasesBuilder_cognito();
		case AwsworkbenchPackage.USER_INVITATION_CONFIG_BUILDER_COGNITO:
			return createUserInvitationConfigBuilder_cognito();
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO:
			return createUserVerificationConfigBuilder_cognito();
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO:
			return createUserPoolPropsBuilder_cognito();
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO:
			return createUserPoolBuilder_cognito();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO:
			return createAuthFlowBuilder_cognito();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO:
			return createOAuthFlowsBuilder_cognito();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO:
			return createOAuthSettingsBuilder_cognito();
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO:
			return createUserPoolClientPropsBuilder_cognito();
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA:
			return createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE:
			return createBuildDeadLetterQueuePropsBuilder_core();
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE:
			return createBuildQueuePropsBuilder_core();
		case AwsworkbenchPackage.BUILD_S3_BUCKET_PROPS_BUILDER_CORE:
			return createBuildS3BucketPropsBuilder_core();
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE:
			return createBuildEncryptionKeyPropsBuilder_core();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE:
			return createCognitoOptionsBuilder_core();
		case AwsworkbenchPackage.BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE:
			return createBuildKinesisStreamPropsBuilder_core();
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE:
			return createBuildKinesisAnalyticsAppPropsBuilder_core();
		case AwsworkbenchPackage.BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE:
			return createBuildLambdaFunctionPropsBuilder_core();
		case AwsworkbenchPackage.BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE:
			return createBuildDynamoDBTablePropsBuilder_core();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE:
			return createBuildTopicPropsBuilder_core();
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA:
			return createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda();
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA:
			return createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana();
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS:
			return createEventBusBuilder_events();
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS:
			return createEventPatternBuilder_events();
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS:
			return createRulePropsBuilder_events();
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS:
			return createCronOptionsBuilder_events();
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA:
			return createEventsRuleToLambdaBuilder_eventsrulelambda();
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS:
			return createStateMachinePropsBuilder_stepfunctions();
		case AwsworkbenchPackage.EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION:
			return createEventsRuleToStepFunctionBuilder_eventsrulestepfunction();
		case AwsworkbenchPackage.IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3:
			return createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3();
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA:
			return createIotToLambdaBuilder_iotlambda();
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB:
			return createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb();
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3:
			return createKinesisFirehoseToS3Builder_kinesisfirehoses3();
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS:
			return createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics();
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA:
			return createKinesisStreamsToLambdaBuilder_kinesisstreamslambda();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB:
			return createTableBuilder_dynamodb();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB:
			return createLambdaToDynamoDBBuilder_lambdadynamodb();
		case AwsworkbenchPackage.LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA:
			return createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana();
		case AwsworkbenchPackage.LAMBDA_TO_S3_BUILDER_LAMBDAS3:
			return createLambdaToS3Builder_lambdas3();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS:
			return createTopicPropsBuilder_sns();
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS:
			return createLambdaToSnsBuilder_lambdasns();
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS:
			return createLambdaToSqsBuilder_lambdasqs();
		case AwsworkbenchPackage.LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION:
			return createLambdaToStepFunctionBuilder_lambdastepfunction();
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA:
			return createS3ToLambdaBuilder_s3lambda();
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION:
			return createS3ToStepFunctionBuilder_s3stepfunction();
		case AwsworkbenchPackage.SNS_TO_LAMBDA_BUILDER_SNSLAMBDA:
			return createSnsToLambdaBuilder_snslambda();
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM:
			return createManagedPolicyBuilder_iam();
		case AwsworkbenchPackage.USER_BUILDER_IAM:
			return createUserBuilder_iam();
		case AwsworkbenchPackage.GROUP_BUILDER_IAM:
			return createGroupBuilder_iam();
		case AwsworkbenchPackage.ROLE_BUILDER_IAM:
			return createRoleBuilder_iam();
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM:
			return createPolicyStatementBuilder_iam();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM:
			return createPolicyDocumentBuilder_iam();
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA:
			return createSqsToLambdaBuilder_sqslambda();
		case AwsworkbenchPackage.ATTRIBUTE_BUILDER_DYNAMODB:
			return createAttributeBuilder_dynamodb();
		case AwsworkbenchPackage.TABLE_PROPS_BUILDER_DYNAMODB:
			return createTablePropsBuilder_dynamodb();
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY:
			return createPrivateDnsNamespaceBuilder_servicediscovery();
		case AwsworkbenchPackage.PUBLIC_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY:
			return createPublicDnsNamespaceBuilder_servicediscovery();
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY:
			return createHttpNamespaceBuilder_servicediscovery();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS:
			return createCloudMapOptionsBuilder_ecs();
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING:
			return createBlockDeviceBuilder_autoscaling();
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS:
			return createHealthCheckBuilder_ecs();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2:
			return createAmazonLinuxImageBuilder_ec2();
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING:
			return createRollingUpdateConfigurationBuilder_autoscaling();
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS:
			return createAddCapacityOptionsBuilder_ecs();
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS:
			return createCloudMapNamespaceOptionsBuilder_ecs();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS:
			return createClusterBuilder_ecs();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2:
			return createApplicationLoadBalancerBuilder_elasticloadbalancingv2();
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS:
			return createDockerImageAssetBuilder_assets();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS:
			return createAssetImageBuilder_ecs();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER:
			return createSecretStringGeneratorBuilder_secretsmanager();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER:
			return createSecretBuilder_secretsmanager();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS:
			return createAwsLogDriverBuilder_ecs();
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS:
			return createLogGroupBuilder_logs();
		case AwsworkbenchPackage.AWS_LOG_DRIVER_PROPS_BUILDER_ECS:
			return createAwsLogDriverPropsBuilder_ecs();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS:
			return createApplicationLoadBalancedTaskImageOptionsBuilder_patterns();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS:
			return createAppMeshProxyConfigurationPropsBuilder_ecs();
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS:
			return createAppMeshProxyConfigurationBuilder_ecs();
		case AwsworkbenchPackage.HOST_BUILDER_ECS:
			return createHostBuilder_ecs();
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS:
			return createDockerVolumeConfigurationBuilder_ecs();
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS:
			return createVolumeBuilder_ecs();
		case AwsworkbenchPackage.EC2_TASK_DEFINITION_BUILDER_ECS:
			return createEc2TaskDefinitionBuilder_ecs();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS:
			return createApplicationLoadBalancedEc2ServiceBuilder_patterns();
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS:
			return createFargateTaskDefinitionBuilder_ecs();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_FARGATE_SERVICE_BUILDER_PATTERNS:
			return createApplicationLoadBalancedFargateServiceBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS:
			return createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS:
			return createApplicationListenerPropsBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS:
			return createApplicationLoadBalancerPropsBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS:
			return createApplicationTargetPropsBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS:
			return createApplicationLoadBalancedTaskImagePropsBuilder_patterns();
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS:
			return createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS:
			return createNetworkLoadBalancedTaskImageOptionsBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_FARGATE_SERVICE_BUILDER_PATTERNS:
			return createNetworkLoadBalancedFargateServiceBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS:
			return createNetworkLoadBalancedEc2ServiceBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS:
			return createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_TARGET_PROPS_BUILDER_PATTERNS:
			return createNetworkTargetPropsBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS:
			return createNetworkLoadBalancedTaskImagePropsBuilder_patterns();
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS:
			return createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns();
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING:
			return createScalingIntervalBuilder_applicationautoscaling();
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS:
			return createQueueProcessingFargateServiceBuilder_patterns();
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_APPLICATIONAUTOSCALING:
			return createCronOptionsBuilder_applicationautoscaling();
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS:
			return createScheduledEc2TaskDefinitionOptionsBuilder_patterns();
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS:
			return createScheduledEc2TaskImageOptionsBuilder_patterns();
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_BUILDER_PATTERNS:
			return createScheduledEc2TaskBuilder_patterns();
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS:
			return createQueueProcessingEc2ServiceBuilder_patterns();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS:
			return createScheduledFargateTaskDefinitionOptionsBuilder_patterns();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS:
			return createScheduledFargateTaskImageOptionsBuilder_patterns();
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS:
			return createTopicBuilder_sns();
		case AwsworkbenchPackage.EC2_HEALTH_CHECK_OPTIONS_BUILDER_AUTOSCALING:
			return createEc2HealthCheckOptionsBuilder_autoscaling();
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING:
			return createAutoScalingGroupBuilder_autoscaling();
		case AwsworkbenchPackage.OPTION_CONFIGURATION_BUILDER_RDS:
			return createOptionConfigurationBuilder_rds();
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS:
			return createOptionGroupBuilder_rds();
		case AwsworkbenchPackage.PORT_BUILDER_EC2:
			return createPortBuilder_ec2();
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS:
			return createProcessorFeaturesBuilder_rds();
		case AwsworkbenchPackage.ORACLE_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createOracleEeInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.ORACLE_SE1_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createOracleSe1InstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.ORACLE_SE2_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createOracleSe2InstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.ORACLE_SE_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createOracleSeInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createPostgresInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createSqlServerEeInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createSqlServerExInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.SQL_SERVER_SE_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createSqlServerSeInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.SQL_SERVER_WEB_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createSqlServerWebInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.MY_SQL_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createMySqlInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.MARIA_DB_INSTANCE_ENGINE_PROPS_BUILDER_RDS:
			return createMariaDbInstanceEnginePropsBuilder_rds();
		case AwsworkbenchPackage.PARAMETER_GROUP_BUILDER_RDS:
			return createParameterGroupBuilder_rds();
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS:
			return createDatabaseInstanceBuilder_rds();
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS:
			return createScheduledFargateTaskBuilder_patterns();
		case AwsworkbenchPackage.BLOCK:
			return createBlock();
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
		case AwsworkbenchPackage.FLOW_LOG_TRAFFIC_TYPE:
			return createFlowLogTrafficTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.DEFAULT_INSTANCE_TENANCY:
			return createDefaultInstanceTenancyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SUBNET_TYPE:
			return createSubnetTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.API_KEY_SOURCE_TYPE:
			return createApiKeySourceTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.ENDPOINT_TYPE:
			return createEndpointTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.METHOD_LOGGING_LEVEL:
			return createMethodLoggingLevelFromString(eDataType, initialValue);
		case AwsworkbenchPackage.VALIDATION_METHOD:
			return createValidationMethodFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SECURITY_POLICY:
			return createSecurityPolicyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.INTEGRATION_TYPE:
			return createIntegrationTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.CONTENT_HANDLING:
			return createContentHandlingFromString(eDataType, initialValue);
		case AwsworkbenchPackage.CONNECTION_TYPE:
			return createConnectionTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PASSTHROUGH_BEHAVIOR:
			return createPassthroughBehaviorFromString(eDataType, initialValue);
		case AwsworkbenchPackage.QUEUE_ENCRYPTION:
			return createQueueEncryptionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.RETENTION_DAYS:
			return createRetentionDaysFromString(eDataType, initialValue);
		case AwsworkbenchPackage.TRACING:
			return createTracingFromString(eDataType, initialValue);
		case AwsworkbenchPackage.AUTHORIZATION_TYPE:
			return createAuthorizationTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.JSON_SCHEMA_VERSION:
			return createJsonSchemaVersionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.JSON_SCHEMA_TYPE:
			return createJsonSchemaTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.CLOUD_FRONT_ALLOWED_CACHED_METHODS:
			return createCloudFrontAllowedCachedMethodsFromString(eDataType, initialValue);
		case AwsworkbenchPackage.CLOUD_FRONT_ALLOWED_METHODS:
			return createCloudFrontAllowedMethodsFromString(eDataType, initialValue);
		case AwsworkbenchPackage.LAMBDA_EDGE_EVENT_TYPE:
			return createLambdaEdgeEventTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.ORIGIN_SSL_POLICY:
			return createOriginSslPolicyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.ORIGIN_PROTOCOL_POLICY:
			return createOriginProtocolPolicyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.BUCKET_ACCESS_CONTROL:
			return createBucketAccessControlFromString(eDataType, initialValue);
		case AwsworkbenchPackage.HTTP_METHODS:
			return createHttpMethodsFromString(eDataType, initialValue);
		case AwsworkbenchPackage.BUCKET_ENCRYPTION:
			return createBucketEncryptionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.REDIRECT_PROTOCOL:
			return createRedirectProtocolFromString(eDataType, initialValue);
		case AwsworkbenchPackage.HTTP_VERSION:
			return createHttpVersionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PRICE_CLASS:
			return createPriceClassFromString(eDataType, initialValue);
		case AwsworkbenchPackage.VIEWER_PROTOCOL_POLICY:
			return createViewerProtocolPolicyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SECURITY_POLICY_PROTOCOL:
			return createSecurityPolicyProtocolFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SSL_METHOD:
			return createSSLMethodFromString(eDataType, initialValue);
		case AwsworkbenchPackage.MFA:
			return createMfaFromString(eDataType, initialValue);
		case AwsworkbenchPackage.VERIFICATION_EMAIL_STYLE:
			return createVerificationEmailStyleFromString(eDataType, initialValue);
		case AwsworkbenchPackage.STATE_MACHINE_TYPE:
			return createStateMachineTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.EFFECT:
			return createEffectFromString(eDataType, initialValue);
		case AwsworkbenchPackage.ATTRIBUTE_TYPE:
			return createAttributeTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.STREAM_VIEW_TYPE:
			return createStreamViewTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.REMOVAL_POLICY:
			return createRemovalPolicyFromString(eDataType, initialValue);
		case AwsworkbenchPackage.TABLE_ENCRYPTION:
			return createTableEncryptionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.BILLING_MODE:
			return createBillingModeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.DNS_RECORD_TYPE:
			return createDnsRecordTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.INSTANCE_CLASS:
			return createInstanceClassFromString(eDataType, initialValue);
		case AwsworkbenchPackage.INSTANCE_SIZE:
			return createInstanceSizeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.AMAZON_LINUX_EDITION:
			return createAmazonLinuxEditionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.AMAZON_LINUX_GENERATION:
			return createAmazonLinuxGenerationFromString(eDataType, initialValue);
		case AwsworkbenchPackage.AMAZON_LINUX_STORAGE:
			return createAmazonLinuxStorageFromString(eDataType, initialValue);
		case AwsworkbenchPackage.AMAZON_LINUX_VIRT:
			return createAmazonLinuxVirtFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SCALING_PROCESS:
			return createScalingProcessFromString(eDataType, initialValue);
		case AwsworkbenchPackage.UPDATE_TYPE:
			return createUpdateTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.NAMESPACE_TYPE:
			return createNamespaceTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.IP_ADDRESS_TYPE:
			return createIpAddressTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PROPAGATED_TAG_SOURCE:
			return createPropagatedTagSourceFromString(eDataType, initialValue);
		case AwsworkbenchPackage.APPLICATION_PROTOCOL:
			return createApplicationProtocolFromString(eDataType, initialValue);
		case AwsworkbenchPackage.FOLLOW_MODE:
			return createFollowModeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.SCOPE:
			return createScopeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.NETWORK_MODE:
			return createNetworkModeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.IPC_MODE:
			return createIpcModeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PID_MODE:
			return createPidModeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.FARGATE_PLATFORM_VERSION:
			return createFargatePlatformVersionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PROTOCOL:
			return createProtocolFromString(eDataType, initialValue);
		case AwsworkbenchPackage.PERFORMANCE_INSIGHT_RETENTION:
			return createPerformanceInsightRetentionFromString(eDataType, initialValue);
		case AwsworkbenchPackage.STORAGE_TYPE:
			return createStorageTypeFromString(eDataType, initialValue);
		case AwsworkbenchPackage.LICENSE_MODEL:
			return createLicenseModelFromString(eDataType, initialValue);
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
		case AwsworkbenchPackage.FLOW_LOG_TRAFFIC_TYPE:
			return convertFlowLogTrafficTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.DEFAULT_INSTANCE_TENANCY:
			return convertDefaultInstanceTenancyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SUBNET_TYPE:
			return convertSubnetTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.API_KEY_SOURCE_TYPE:
			return convertApiKeySourceTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.ENDPOINT_TYPE:
			return convertEndpointTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.METHOD_LOGGING_LEVEL:
			return convertMethodLoggingLevelToString(eDataType, instanceValue);
		case AwsworkbenchPackage.VALIDATION_METHOD:
			return convertValidationMethodToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SECURITY_POLICY:
			return convertSecurityPolicyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.INTEGRATION_TYPE:
			return convertIntegrationTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.CONTENT_HANDLING:
			return convertContentHandlingToString(eDataType, instanceValue);
		case AwsworkbenchPackage.CONNECTION_TYPE:
			return convertConnectionTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PASSTHROUGH_BEHAVIOR:
			return convertPassthroughBehaviorToString(eDataType, instanceValue);
		case AwsworkbenchPackage.QUEUE_ENCRYPTION:
			return convertQueueEncryptionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.RETENTION_DAYS:
			return convertRetentionDaysToString(eDataType, instanceValue);
		case AwsworkbenchPackage.TRACING:
			return convertTracingToString(eDataType, instanceValue);
		case AwsworkbenchPackage.AUTHORIZATION_TYPE:
			return convertAuthorizationTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.JSON_SCHEMA_VERSION:
			return convertJsonSchemaVersionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.JSON_SCHEMA_TYPE:
			return convertJsonSchemaTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.CLOUD_FRONT_ALLOWED_CACHED_METHODS:
			return convertCloudFrontAllowedCachedMethodsToString(eDataType, instanceValue);
		case AwsworkbenchPackage.CLOUD_FRONT_ALLOWED_METHODS:
			return convertCloudFrontAllowedMethodsToString(eDataType, instanceValue);
		case AwsworkbenchPackage.LAMBDA_EDGE_EVENT_TYPE:
			return convertLambdaEdgeEventTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.ORIGIN_SSL_POLICY:
			return convertOriginSslPolicyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.ORIGIN_PROTOCOL_POLICY:
			return convertOriginProtocolPolicyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.BUCKET_ACCESS_CONTROL:
			return convertBucketAccessControlToString(eDataType, instanceValue);
		case AwsworkbenchPackage.HTTP_METHODS:
			return convertHttpMethodsToString(eDataType, instanceValue);
		case AwsworkbenchPackage.BUCKET_ENCRYPTION:
			return convertBucketEncryptionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.REDIRECT_PROTOCOL:
			return convertRedirectProtocolToString(eDataType, instanceValue);
		case AwsworkbenchPackage.HTTP_VERSION:
			return convertHttpVersionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PRICE_CLASS:
			return convertPriceClassToString(eDataType, instanceValue);
		case AwsworkbenchPackage.VIEWER_PROTOCOL_POLICY:
			return convertViewerProtocolPolicyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SECURITY_POLICY_PROTOCOL:
			return convertSecurityPolicyProtocolToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SSL_METHOD:
			return convertSSLMethodToString(eDataType, instanceValue);
		case AwsworkbenchPackage.MFA:
			return convertMfaToString(eDataType, instanceValue);
		case AwsworkbenchPackage.VERIFICATION_EMAIL_STYLE:
			return convertVerificationEmailStyleToString(eDataType, instanceValue);
		case AwsworkbenchPackage.STATE_MACHINE_TYPE:
			return convertStateMachineTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.EFFECT:
			return convertEffectToString(eDataType, instanceValue);
		case AwsworkbenchPackage.ATTRIBUTE_TYPE:
			return convertAttributeTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.STREAM_VIEW_TYPE:
			return convertStreamViewTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.REMOVAL_POLICY:
			return convertRemovalPolicyToString(eDataType, instanceValue);
		case AwsworkbenchPackage.TABLE_ENCRYPTION:
			return convertTableEncryptionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.BILLING_MODE:
			return convertBillingModeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.DNS_RECORD_TYPE:
			return convertDnsRecordTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.INSTANCE_CLASS:
			return convertInstanceClassToString(eDataType, instanceValue);
		case AwsworkbenchPackage.INSTANCE_SIZE:
			return convertInstanceSizeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.AMAZON_LINUX_EDITION:
			return convertAmazonLinuxEditionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.AMAZON_LINUX_GENERATION:
			return convertAmazonLinuxGenerationToString(eDataType, instanceValue);
		case AwsworkbenchPackage.AMAZON_LINUX_STORAGE:
			return convertAmazonLinuxStorageToString(eDataType, instanceValue);
		case AwsworkbenchPackage.AMAZON_LINUX_VIRT:
			return convertAmazonLinuxVirtToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SCALING_PROCESS:
			return convertScalingProcessToString(eDataType, instanceValue);
		case AwsworkbenchPackage.UPDATE_TYPE:
			return convertUpdateTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.NAMESPACE_TYPE:
			return convertNamespaceTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.IP_ADDRESS_TYPE:
			return convertIpAddressTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PROPAGATED_TAG_SOURCE:
			return convertPropagatedTagSourceToString(eDataType, instanceValue);
		case AwsworkbenchPackage.APPLICATION_PROTOCOL:
			return convertApplicationProtocolToString(eDataType, instanceValue);
		case AwsworkbenchPackage.FOLLOW_MODE:
			return convertFollowModeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.SCOPE:
			return convertScopeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.NETWORK_MODE:
			return convertNetworkModeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.IPC_MODE:
			return convertIpcModeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PID_MODE:
			return convertPidModeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.FARGATE_PLATFORM_VERSION:
			return convertFargatePlatformVersionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PROTOCOL:
			return convertProtocolToString(eDataType, instanceValue);
		case AwsworkbenchPackage.PERFORMANCE_INSIGHT_RETENTION:
			return convertPerformanceInsightRetentionToString(eDataType, instanceValue);
		case AwsworkbenchPackage.STORAGE_TYPE:
			return convertStorageTypeToString(eDataType, instanceValue);
		case AwsworkbenchPackage.LICENSE_MODEL:
			return convertLicenseModelToString(eDataType, instanceValue);
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
	public AppBuilder_core createAppBuilder_core() {
		AppBuilder_coreImpl appBuilder_core = new AppBuilder_coreImpl();
		return appBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultStackSynthesizerBuilder_core createDefaultStackSynthesizerBuilder_core() {
		DefaultStackSynthesizerBuilder_coreImpl defaultStackSynthesizerBuilder_core = new DefaultStackSynthesizerBuilder_coreImpl();
		return defaultStackSynthesizerBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentBuilder_core createEnvironmentBuilder_core() {
		EnvironmentBuilder_coreImpl environmentBuilder_core = new EnvironmentBuilder_coreImpl();
		return environmentBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowLogOptionsBuilder_ec2 createFlowLogOptionsBuilder_ec2() {
		FlowLogOptionsBuilder_ec2Impl flowLogOptionsBuilder_ec2 = new FlowLogOptionsBuilder_ec2Impl();
		return flowLogOptionsBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StackBuilder_core createStackBuilder_core() {
		StackBuilder_coreImpl stackBuilder_core = new StackBuilder_coreImpl();
		return stackBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VpcBuilder_ec2 createVpcBuilder_ec2() {
		VpcBuilder_ec2Impl vpcBuilder_ec2 = new VpcBuilder_ec2Impl();
		return vpcBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetBuilder_ec2 createSubnetBuilder_ec2() {
		SubnetBuilder_ec2Impl subnetBuilder_ec2 = new SubnetBuilder_ec2Impl();
		return subnetBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubnetSelectionBuilder_ec2 createSubnetSelectionBuilder_ec2() {
		SubnetSelectionBuilder_ec2Impl subnetSelectionBuilder_ec2 = new SubnetSelectionBuilder_ec2Impl();
		return subnetSelectionBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayVpcEndpointBuilder_ec2 createGatewayVpcEndpointBuilder_ec2() {
		GatewayVpcEndpointBuilder_ec2Impl gatewayVpcEndpointBuilder_ec2 = new GatewayVpcEndpointBuilder_ec2Impl();
		return gatewayVpcEndpointBuilder_ec2;
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
	public HostedZoneBuilder_route53 createHostedZoneBuilder_route53() {
		HostedZoneBuilder_route53Impl hostedZoneBuilder_route53 = new HostedZoneBuilder_route53Impl();
		return hostedZoneBuilder_route53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsValidatedCertificateBuilder_certificatemanager createDnsValidatedCertificateBuilder_certificatemanager() {
		DnsValidatedCertificateBuilder_certificatemanagerImpl dnsValidatedCertificateBuilder_certificatemanager = new DnsValidatedCertificateBuilder_certificatemanagerImpl();
		return dnsValidatedCertificateBuilder_certificatemanager;
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
	public CertificateBuilder_certificatemanager createCertificateBuilder_certificatemanager() {
		CertificateBuilder_certificatemanagerImpl certificateBuilder_certificatemanager = new CertificateBuilder_certificatemanagerImpl();
		return certificateBuilder_certificatemanager;
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
	public NetworkLoadBalancerBuilder_elasticloadbalancingv2 createNetworkLoadBalancerBuilder_elasticloadbalancingv2() {
		NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl networkLoadBalancerBuilder_elasticloadbalancingv2 = new NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl();
		return networkLoadBalancerBuilder_elasticloadbalancingv2;
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
	public KeyBuilder_kms createKeyBuilder_kms() {
		KeyBuilder_kmsImpl keyBuilder_kms = new KeyBuilder_kmsImpl();
		return keyBuilder_kms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeadLetterQueueBuilder_sqs createDeadLetterQueueBuilder_sqs() {
		DeadLetterQueueBuilder_sqsImpl deadLetterQueueBuilder_sqs = new DeadLetterQueueBuilder_sqsImpl();
		return deadLetterQueueBuilder_sqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueBuilder_sqs createQueueBuilder_sqs() {
		QueueBuilder_sqsImpl queueBuilder_sqs = new QueueBuilder_sqsImpl();
		return queueBuilder_sqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionOptionsBuilder_lambda createVersionOptionsBuilder_lambda() {
		VersionOptionsBuilder_lambdaImpl versionOptionsBuilder_lambda = new VersionOptionsBuilder_lambdaImpl();
		return versionOptionsBuilder_lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerVersionBuilder_lambda createLayerVersionBuilder_lambda() {
		LayerVersionBuilder_lambdaImpl layerVersionBuilder_lambda = new LayerVersionBuilder_lambdaImpl();
		return layerVersionBuilder_lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroupBuilder_ec2 createSecurityGroupBuilder_ec2() {
		SecurityGroupBuilder_ec2Impl securityGroupBuilder_ec2 = new SecurityGroupBuilder_ec2Impl();
		return securityGroupBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionPropsBuilder_lambda createFunctionPropsBuilder_lambda() {
		FunctionPropsBuilder_lambdaImpl functionPropsBuilder_lambda = new FunctionPropsBuilder_lambdaImpl();
		return functionPropsBuilder_lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionBuilder_lambda createFunctionBuilder_lambda() {
		FunctionBuilder_lambdaImpl functionBuilder_lambda = new FunctionBuilder_lambdaImpl();
		return functionBuilder_lambda;
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
	public ApiGatewayToDynamoDBBuilder_apigatewaydynamodb createApiGatewayToDynamoDBBuilder_apigatewaydynamodb() {
		ApiGatewayToDynamoDBBuilder_apigatewaydynamodbImpl apiGatewayToDynamoDBBuilder_apigatewaydynamodb = new ApiGatewayToDynamoDBBuilder_apigatewaydynamodbImpl();
		return apiGatewayToDynamoDBBuilder_apigatewaydynamodb;
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
	public ApiGatewayToLambdaBuilder_apigatewaylambda createApiGatewayToLambdaBuilder_apigatewaylambda() {
		ApiGatewayToLambdaBuilder_apigatewaylambdaImpl apiGatewayToLambdaBuilder_apigatewaylambda = new ApiGatewayToLambdaBuilder_apigatewaylambdaImpl();
		return apiGatewayToLambdaBuilder_apigatewaylambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueuePropsBuilder_sqs createQueuePropsBuilder_sqs() {
		QueuePropsBuilder_sqsImpl queuePropsBuilder_sqs = new QueuePropsBuilder_sqsImpl();
		return queuePropsBuilder_sqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiGatewayToSqsBuilder_apigatewaysqs createApiGatewayToSqsBuilder_apigatewaysqs() {
		ApiGatewayToSqsBuilder_apigatewaysqsImpl apiGatewayToSqsBuilder_apigatewaysqs = new ApiGatewayToSqsBuilder_apigatewaysqsImpl();
		return apiGatewayToSqsBuilder_apigatewaysqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionBuilder_lambda createVersionBuilder_lambda() {
		VersionBuilder_lambdaImpl versionBuilder_lambda = new VersionBuilder_lambdaImpl();
		return versionBuilder_lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaFunctionAssociationBuilder_cloudfront createLambdaFunctionAssociationBuilder_cloudfront() {
		LambdaFunctionAssociationBuilder_cloudfrontImpl lambdaFunctionAssociationBuilder_cloudfront = new LambdaFunctionAssociationBuilder_cloudfrontImpl();
		return lambdaFunctionAssociationBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorBuilder_cloudfront createBehaviorBuilder_cloudfront() {
		BehaviorBuilder_cloudfrontImpl behaviorBuilder_cloudfront = new BehaviorBuilder_cloudfrontImpl();
		return behaviorBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomOriginConfigBuilder_cloudfront createCustomOriginConfigBuilder_cloudfront() {
		CustomOriginConfigBuilder_cloudfrontImpl customOriginConfigBuilder_cloudfront = new CustomOriginConfigBuilder_cloudfrontImpl();
		return customOriginConfigBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockPublicAccessBuilder_s3 createBlockPublicAccessBuilder_s3() {
		BlockPublicAccessBuilder_s3Impl blockPublicAccessBuilder_s3 = new BlockPublicAccessBuilder_s3Impl();
		return blockPublicAccessBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorsRuleBuilder_s3 createCorsRuleBuilder_s3() {
		CorsRuleBuilder_s3Impl corsRuleBuilder_s3 = new CorsRuleBuilder_s3Impl();
		return corsRuleBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoncurrentVersionTransitionBuilder_s3 createNoncurrentVersionTransitionBuilder_s3() {
		NoncurrentVersionTransitionBuilder_s3Impl noncurrentVersionTransitionBuilder_s3 = new NoncurrentVersionTransitionBuilder_s3Impl();
		return noncurrentVersionTransitionBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionBuilder_s3 createTransitionBuilder_s3() {
		TransitionBuilder_s3Impl transitionBuilder_s3 = new TransitionBuilder_s3Impl();
		return transitionBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleRuleBuilder_s3 createLifecycleRuleBuilder_s3() {
		LifecycleRuleBuilder_s3Impl lifecycleRuleBuilder_s3 = new LifecycleRuleBuilder_s3Impl();
		return lifecycleRuleBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketMetricsBuilder_s3 createBucketMetricsBuilder_s3() {
		BucketMetricsBuilder_s3Impl bucketMetricsBuilder_s3 = new BucketMetricsBuilder_s3Impl();
		return bucketMetricsBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedirectTargetBuilder_s3 createRedirectTargetBuilder_s3() {
		RedirectTargetBuilder_s3Impl redirectTargetBuilder_s3 = new RedirectTargetBuilder_s3Impl();
		return redirectTargetBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutingRuleConditionBuilder_s3 createRoutingRuleConditionBuilder_s3() {
		RoutingRuleConditionBuilder_s3Impl routingRuleConditionBuilder_s3 = new RoutingRuleConditionBuilder_s3Impl();
		return routingRuleConditionBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutingRuleBuilder_s3 createRoutingRuleBuilder_s3() {
		RoutingRuleBuilder_s3Impl routingRuleBuilder_s3 = new RoutingRuleBuilder_s3Impl();
		return routingRuleBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketBuilder_s3 createBucketBuilder_s3() {
		BucketBuilder_s3Impl bucketBuilder_s3 = new BucketBuilder_s3Impl();
		return bucketBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BucketPropsBuilder_s3 createBucketPropsBuilder_s3() {
		BucketPropsBuilder_s3Impl bucketPropsBuilder_s3 = new BucketPropsBuilder_s3Impl();
		return bucketPropsBuilder_s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginAccessIdentityBuilder_cloudfront createOriginAccessIdentityBuilder_cloudfront() {
		OriginAccessIdentityBuilder_cloudfrontImpl originAccessIdentityBuilder_cloudfront = new OriginAccessIdentityBuilder_cloudfrontImpl();
		return originAccessIdentityBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public S3OriginConfigBuilder_cloudfront createS3OriginConfigBuilder_cloudfront() {
		S3OriginConfigBuilder_cloudfrontImpl s3OriginConfigBuilder_cloudfront = new S3OriginConfigBuilder_cloudfrontImpl();
		return s3OriginConfigBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceConfigurationBuilder_cloudfront createSourceConfigurationBuilder_cloudfront() {
		SourceConfigurationBuilder_cloudfrontImpl sourceConfigurationBuilder_cloudfront = new SourceConfigurationBuilder_cloudfrontImpl();
		return sourceConfigurationBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AliasConfigurationBuilder_cloudfront createAliasConfigurationBuilder_cloudfront() {
		AliasConfigurationBuilder_cloudfrontImpl aliasConfigurationBuilder_cloudfront = new AliasConfigurationBuilder_cloudfrontImpl();
		return aliasConfigurationBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggingConfigurationBuilder_cloudfront createLoggingConfigurationBuilder_cloudfront() {
		LoggingConfigurationBuilder_cloudfrontImpl loggingConfigurationBuilder_cloudfront = new LoggingConfigurationBuilder_cloudfrontImpl();
		return loggingConfigurationBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontWebDistributionPropsBuilder_cloudfront createCloudFrontWebDistributionPropsBuilder_cloudfront() {
		CloudFrontWebDistributionPropsBuilder_cloudfrontImpl cloudFrontWebDistributionPropsBuilder_cloudfront = new CloudFrontWebDistributionPropsBuilder_cloudfrontImpl();
		return cloudFrontWebDistributionPropsBuilder_cloudfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontToApiGatewayBuilder_cloudfrontapigateway createCloudFrontToApiGatewayBuilder_cloudfrontapigateway() {
		CloudFrontToApiGatewayBuilder_cloudfrontapigatewayImpl cloudFrontToApiGatewayBuilder_cloudfrontapigateway = new CloudFrontToApiGatewayBuilder_cloudfrontapigatewayImpl();
		return cloudFrontToApiGatewayBuilder_cloudfrontapigateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda() {
		CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaImpl cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda = new CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaImpl();
		return cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudFrontToS3Builder_cloudfronts3 createCloudFrontToS3Builder_cloudfronts3() {
		CloudFrontToS3Builder_cloudfronts3Impl cloudFrontToS3Builder_cloudfronts3 = new CloudFrontToS3Builder_cloudfronts3Impl();
		return cloudFrontToS3Builder_cloudfronts3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoVerifiedAttrsBuilder_cognito createAutoVerifiedAttrsBuilder_cognito() {
		AutoVerifiedAttrsBuilder_cognitoImpl autoVerifiedAttrsBuilder_cognito = new AutoVerifiedAttrsBuilder_cognitoImpl();
		return autoVerifiedAttrsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPoolTriggersBuilder_cognito createUserPoolTriggersBuilder_cognito() {
		UserPoolTriggersBuilder_cognitoImpl userPoolTriggersBuilder_cognito = new UserPoolTriggersBuilder_cognitoImpl();
		return userPoolTriggersBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailSettingsBuilder_cognito createEmailSettingsBuilder_cognito() {
		EmailSettingsBuilder_cognitoImpl emailSettingsBuilder_cognito = new EmailSettingsBuilder_cognitoImpl();
		return emailSettingsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PasswordPolicyBuilder_cognito createPasswordPolicyBuilder_cognito() {
		PasswordPolicyBuilder_cognitoImpl passwordPolicyBuilder_cognito = new PasswordPolicyBuilder_cognitoImpl();
		return passwordPolicyBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MfaSecondFactorBuilder_cognito createMfaSecondFactorBuilder_cognito() {
		MfaSecondFactorBuilder_cognitoImpl mfaSecondFactorBuilder_cognito = new MfaSecondFactorBuilder_cognitoImpl();
		return mfaSecondFactorBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredAttributesBuilder_cognito createRequiredAttributesBuilder_cognito() {
		RequiredAttributesBuilder_cognitoImpl requiredAttributesBuilder_cognito = new RequiredAttributesBuilder_cognitoImpl();
		return requiredAttributesBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignInAliasesBuilder_cognito createSignInAliasesBuilder_cognito() {
		SignInAliasesBuilder_cognitoImpl signInAliasesBuilder_cognito = new SignInAliasesBuilder_cognitoImpl();
		return signInAliasesBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInvitationConfigBuilder_cognito createUserInvitationConfigBuilder_cognito() {
		UserInvitationConfigBuilder_cognitoImpl userInvitationConfigBuilder_cognito = new UserInvitationConfigBuilder_cognitoImpl();
		return userInvitationConfigBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserVerificationConfigBuilder_cognito createUserVerificationConfigBuilder_cognito() {
		UserVerificationConfigBuilder_cognitoImpl userVerificationConfigBuilder_cognito = new UserVerificationConfigBuilder_cognitoImpl();
		return userVerificationConfigBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPoolPropsBuilder_cognito createUserPoolPropsBuilder_cognito() {
		UserPoolPropsBuilder_cognitoImpl userPoolPropsBuilder_cognito = new UserPoolPropsBuilder_cognitoImpl();
		return userPoolPropsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPoolBuilder_cognito createUserPoolBuilder_cognito() {
		UserPoolBuilder_cognitoImpl userPoolBuilder_cognito = new UserPoolBuilder_cognitoImpl();
		return userPoolBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthFlowBuilder_cognito createAuthFlowBuilder_cognito() {
		AuthFlowBuilder_cognitoImpl authFlowBuilder_cognito = new AuthFlowBuilder_cognitoImpl();
		return authFlowBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuthFlowsBuilder_cognito createOAuthFlowsBuilder_cognito() {
		OAuthFlowsBuilder_cognitoImpl oAuthFlowsBuilder_cognito = new OAuthFlowsBuilder_cognitoImpl();
		return oAuthFlowsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuthSettingsBuilder_cognito createOAuthSettingsBuilder_cognito() {
		OAuthSettingsBuilder_cognitoImpl oAuthSettingsBuilder_cognito = new OAuthSettingsBuilder_cognitoImpl();
		return oAuthSettingsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPoolClientPropsBuilder_cognito createUserPoolClientPropsBuilder_cognito() {
		UserPoolClientPropsBuilder_cognitoImpl userPoolClientPropsBuilder_cognito = new UserPoolClientPropsBuilder_cognitoImpl();
		return userPoolClientPropsBuilder_cognito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda() {
		CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaImpl cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda = new CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaImpl();
		return cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildDeadLetterQueuePropsBuilder_core createBuildDeadLetterQueuePropsBuilder_core() {
		BuildDeadLetterQueuePropsBuilder_coreImpl buildDeadLetterQueuePropsBuilder_core = new BuildDeadLetterQueuePropsBuilder_coreImpl();
		return buildDeadLetterQueuePropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildQueuePropsBuilder_core createBuildQueuePropsBuilder_core() {
		BuildQueuePropsBuilder_coreImpl buildQueuePropsBuilder_core = new BuildQueuePropsBuilder_coreImpl();
		return buildQueuePropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildS3BucketPropsBuilder_core createBuildS3BucketPropsBuilder_core() {
		BuildS3BucketPropsBuilder_coreImpl buildS3BucketPropsBuilder_core = new BuildS3BucketPropsBuilder_coreImpl();
		return buildS3BucketPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildEncryptionKeyPropsBuilder_core createBuildEncryptionKeyPropsBuilder_core() {
		BuildEncryptionKeyPropsBuilder_coreImpl buildEncryptionKeyPropsBuilder_core = new BuildEncryptionKeyPropsBuilder_coreImpl();
		return buildEncryptionKeyPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitoOptionsBuilder_core createCognitoOptionsBuilder_core() {
		CognitoOptionsBuilder_coreImpl cognitoOptionsBuilder_core = new CognitoOptionsBuilder_coreImpl();
		return cognitoOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildKinesisStreamPropsBuilder_core createBuildKinesisStreamPropsBuilder_core() {
		BuildKinesisStreamPropsBuilder_coreImpl buildKinesisStreamPropsBuilder_core = new BuildKinesisStreamPropsBuilder_coreImpl();
		return buildKinesisStreamPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildKinesisAnalyticsAppPropsBuilder_core createBuildKinesisAnalyticsAppPropsBuilder_core() {
		BuildKinesisAnalyticsAppPropsBuilder_coreImpl buildKinesisAnalyticsAppPropsBuilder_core = new BuildKinesisAnalyticsAppPropsBuilder_coreImpl();
		return buildKinesisAnalyticsAppPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildLambdaFunctionPropsBuilder_core createBuildLambdaFunctionPropsBuilder_core() {
		BuildLambdaFunctionPropsBuilder_coreImpl buildLambdaFunctionPropsBuilder_core = new BuildLambdaFunctionPropsBuilder_coreImpl();
		return buildLambdaFunctionPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildDynamoDBTablePropsBuilder_core createBuildDynamoDBTablePropsBuilder_core() {
		BuildDynamoDBTablePropsBuilder_coreImpl buildDynamoDBTablePropsBuilder_core = new BuildDynamoDBTablePropsBuilder_coreImpl();
		return buildDynamoDBTablePropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildTopicPropsBuilder_core createBuildTopicPropsBuilder_core() {
		BuildTopicPropsBuilder_coreImpl buildTopicPropsBuilder_core = new BuildTopicPropsBuilder_coreImpl();
		return buildTopicPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda() {
		DynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaImpl dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda = new DynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaImpl();
		return dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana() {
		DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaImpl dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana = new DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaImpl();
		return dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventBusBuilder_events createEventBusBuilder_events() {
		EventBusBuilder_eventsImpl eventBusBuilder_events = new EventBusBuilder_eventsImpl();
		return eventBusBuilder_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventPatternBuilder_events createEventPatternBuilder_events() {
		EventPatternBuilder_eventsImpl eventPatternBuilder_events = new EventPatternBuilder_eventsImpl();
		return eventPatternBuilder_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulePropsBuilder_events createRulePropsBuilder_events() {
		RulePropsBuilder_eventsImpl rulePropsBuilder_events = new RulePropsBuilder_eventsImpl();
		return rulePropsBuilder_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CronOptionsBuilder_events createCronOptionsBuilder_events() {
		CronOptionsBuilder_eventsImpl cronOptionsBuilder_events = new CronOptionsBuilder_eventsImpl();
		return cronOptionsBuilder_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsRuleToLambdaBuilder_eventsrulelambda createEventsRuleToLambdaBuilder_eventsrulelambda() {
		EventsRuleToLambdaBuilder_eventsrulelambdaImpl eventsRuleToLambdaBuilder_eventsrulelambda = new EventsRuleToLambdaBuilder_eventsrulelambdaImpl();
		return eventsRuleToLambdaBuilder_eventsrulelambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachinePropsBuilder_stepfunctions createStateMachinePropsBuilder_stepfunctions() {
		StateMachinePropsBuilder_stepfunctionsImpl stateMachinePropsBuilder_stepfunctions = new StateMachinePropsBuilder_stepfunctionsImpl();
		return stateMachinePropsBuilder_stepfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsRuleToStepFunctionBuilder_eventsrulestepfunction createEventsRuleToStepFunctionBuilder_eventsrulestepfunction() {
		EventsRuleToStepFunctionBuilder_eventsrulestepfunctionImpl eventsRuleToStepFunctionBuilder_eventsrulestepfunction = new EventsRuleToStepFunctionBuilder_eventsrulestepfunctionImpl();
		return eventsRuleToStepFunctionBuilder_eventsrulestepfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3() {
		IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3Impl iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 = new IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3Impl();
		return iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotToLambdaBuilder_iotlambda createIotToLambdaBuilder_iotlambda() {
		IotToLambdaBuilder_iotlambdaImpl iotToLambdaBuilder_iotlambda = new IotToLambdaBuilder_iotlambdaImpl();
		return iotToLambdaBuilder_iotlambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IotToLambdaToDynamoDBBuilder_iotlambdadynamodb createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb() {
		IotToLambdaToDynamoDBBuilder_iotlambdadynamodbImpl iotToLambdaToDynamoDBBuilder_iotlambdadynamodb = new IotToLambdaToDynamoDBBuilder_iotlambdadynamodbImpl();
		return iotToLambdaToDynamoDBBuilder_iotlambdadynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinesisFirehoseToS3Builder_kinesisfirehoses3 createKinesisFirehoseToS3Builder_kinesisfirehoses3() {
		KinesisFirehoseToS3Builder_kinesisfirehoses3Impl kinesisFirehoseToS3Builder_kinesisfirehoses3 = new KinesisFirehoseToS3Builder_kinesisfirehoses3Impl();
		return kinesisFirehoseToS3Builder_kinesisfirehoses3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics() {
		KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsImpl kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics = new KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsImpl();
		return kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinesisStreamsToLambdaBuilder_kinesisstreamslambda createKinesisStreamsToLambdaBuilder_kinesisstreamslambda() {
		KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl kinesisStreamsToLambdaBuilder_kinesisstreamslambda = new KinesisStreamsToLambdaBuilder_kinesisstreamslambdaImpl();
		return kinesisStreamsToLambdaBuilder_kinesisstreamslambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBuilder_dynamodb createTableBuilder_dynamodb() {
		TableBuilder_dynamodbImpl tableBuilder_dynamodb = new TableBuilder_dynamodbImpl();
		return tableBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToDynamoDBBuilder_lambdadynamodb createLambdaToDynamoDBBuilder_lambdadynamodb() {
		LambdaToDynamoDBBuilder_lambdadynamodbImpl lambdaToDynamoDBBuilder_lambdadynamodb = new LambdaToDynamoDBBuilder_lambdadynamodbImpl();
		return lambdaToDynamoDBBuilder_lambdadynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana() {
		LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaImpl lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana = new LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaImpl();
		return lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToS3Builder_lambdas3 createLambdaToS3Builder_lambdas3() {
		LambdaToS3Builder_lambdas3Impl lambdaToS3Builder_lambdas3 = new LambdaToS3Builder_lambdas3Impl();
		return lambdaToS3Builder_lambdas3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicPropsBuilder_sns createTopicPropsBuilder_sns() {
		TopicPropsBuilder_snsImpl topicPropsBuilder_sns = new TopicPropsBuilder_snsImpl();
		return topicPropsBuilder_sns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToSnsBuilder_lambdasns createLambdaToSnsBuilder_lambdasns() {
		LambdaToSnsBuilder_lambdasnsImpl lambdaToSnsBuilder_lambdasns = new LambdaToSnsBuilder_lambdasnsImpl();
		return lambdaToSnsBuilder_lambdasns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToSqsBuilder_lambdasqs createLambdaToSqsBuilder_lambdasqs() {
		LambdaToSqsBuilder_lambdasqsImpl lambdaToSqsBuilder_lambdasqs = new LambdaToSqsBuilder_lambdasqsImpl();
		return lambdaToSqsBuilder_lambdasqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaToStepFunctionBuilder_lambdastepfunction createLambdaToStepFunctionBuilder_lambdastepfunction() {
		LambdaToStepFunctionBuilder_lambdastepfunctionImpl lambdaToStepFunctionBuilder_lambdastepfunction = new LambdaToStepFunctionBuilder_lambdastepfunctionImpl();
		return lambdaToStepFunctionBuilder_lambdastepfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public S3ToLambdaBuilder_s3lambda createS3ToLambdaBuilder_s3lambda() {
		S3ToLambdaBuilder_s3lambdaImpl s3ToLambdaBuilder_s3lambda = new S3ToLambdaBuilder_s3lambdaImpl();
		return s3ToLambdaBuilder_s3lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public S3ToStepFunctionBuilder_s3stepfunction createS3ToStepFunctionBuilder_s3stepfunction() {
		S3ToStepFunctionBuilder_s3stepfunctionImpl s3ToStepFunctionBuilder_s3stepfunction = new S3ToStepFunctionBuilder_s3stepfunctionImpl();
		return s3ToStepFunctionBuilder_s3stepfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnsToLambdaBuilder_snslambda createSnsToLambdaBuilder_snslambda() {
		SnsToLambdaBuilder_snslambdaImpl snsToLambdaBuilder_snslambda = new SnsToLambdaBuilder_snslambdaImpl();
		return snsToLambdaBuilder_snslambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManagedPolicyBuilder_iam createManagedPolicyBuilder_iam() {
		ManagedPolicyBuilder_iamImpl managedPolicyBuilder_iam = new ManagedPolicyBuilder_iamImpl();
		return managedPolicyBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserBuilder_iam createUserBuilder_iam() {
		UserBuilder_iamImpl userBuilder_iam = new UserBuilder_iamImpl();
		return userBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupBuilder_iam createGroupBuilder_iam() {
		GroupBuilder_iamImpl groupBuilder_iam = new GroupBuilder_iamImpl();
		return groupBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleBuilder_iam createRoleBuilder_iam() {
		RoleBuilder_iamImpl roleBuilder_iam = new RoleBuilder_iamImpl();
		return roleBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyStatementBuilder_iam createPolicyStatementBuilder_iam() {
		PolicyStatementBuilder_iamImpl policyStatementBuilder_iam = new PolicyStatementBuilder_iamImpl();
		return policyStatementBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDocumentBuilder_iam createPolicyDocumentBuilder_iam() {
		PolicyDocumentBuilder_iamImpl policyDocumentBuilder_iam = new PolicyDocumentBuilder_iamImpl();
		return policyDocumentBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqsToLambdaBuilder_sqslambda createSqsToLambdaBuilder_sqslambda() {
		SqsToLambdaBuilder_sqslambdaImpl sqsToLambdaBuilder_sqslambda = new SqsToLambdaBuilder_sqslambdaImpl();
		return sqsToLambdaBuilder_sqslambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeBuilder_dynamodb createAttributeBuilder_dynamodb() {
		AttributeBuilder_dynamodbImpl attributeBuilder_dynamodb = new AttributeBuilder_dynamodbImpl();
		return attributeBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TablePropsBuilder_dynamodb createTablePropsBuilder_dynamodb() {
		TablePropsBuilder_dynamodbImpl tablePropsBuilder_dynamodb = new TablePropsBuilder_dynamodbImpl();
		return tablePropsBuilder_dynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateDnsNamespaceBuilder_servicediscovery createPrivateDnsNamespaceBuilder_servicediscovery() {
		PrivateDnsNamespaceBuilder_servicediscoveryImpl privateDnsNamespaceBuilder_servicediscovery = new PrivateDnsNamespaceBuilder_servicediscoveryImpl();
		return privateDnsNamespaceBuilder_servicediscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicDnsNamespaceBuilder_servicediscovery createPublicDnsNamespaceBuilder_servicediscovery() {
		PublicDnsNamespaceBuilder_servicediscoveryImpl publicDnsNamespaceBuilder_servicediscovery = new PublicDnsNamespaceBuilder_servicediscoveryImpl();
		return publicDnsNamespaceBuilder_servicediscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpNamespaceBuilder_servicediscovery createHttpNamespaceBuilder_servicediscovery() {
		HttpNamespaceBuilder_servicediscoveryImpl httpNamespaceBuilder_servicediscovery = new HttpNamespaceBuilder_servicediscoveryImpl();
		return httpNamespaceBuilder_servicediscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudMapOptionsBuilder_ecs createCloudMapOptionsBuilder_ecs() {
		CloudMapOptionsBuilder_ecsImpl cloudMapOptionsBuilder_ecs = new CloudMapOptionsBuilder_ecsImpl();
		return cloudMapOptionsBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockDeviceBuilder_autoscaling createBlockDeviceBuilder_autoscaling() {
		BlockDeviceBuilder_autoscalingImpl blockDeviceBuilder_autoscaling = new BlockDeviceBuilder_autoscalingImpl();
		return blockDeviceBuilder_autoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthCheckBuilder_ecs createHealthCheckBuilder_ecs() {
		HealthCheckBuilder_ecsImpl healthCheckBuilder_ecs = new HealthCheckBuilder_ecsImpl();
		return healthCheckBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxImageBuilder_ec2 createAmazonLinuxImageBuilder_ec2() {
		AmazonLinuxImageBuilder_ec2Impl amazonLinuxImageBuilder_ec2 = new AmazonLinuxImageBuilder_ec2Impl();
		return amazonLinuxImageBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RollingUpdateConfigurationBuilder_autoscaling createRollingUpdateConfigurationBuilder_autoscaling() {
		RollingUpdateConfigurationBuilder_autoscalingImpl rollingUpdateConfigurationBuilder_autoscaling = new RollingUpdateConfigurationBuilder_autoscalingImpl();
		return rollingUpdateConfigurationBuilder_autoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddCapacityOptionsBuilder_ecs createAddCapacityOptionsBuilder_ecs() {
		AddCapacityOptionsBuilder_ecsImpl addCapacityOptionsBuilder_ecs = new AddCapacityOptionsBuilder_ecsImpl();
		return addCapacityOptionsBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudMapNamespaceOptionsBuilder_ecs createCloudMapNamespaceOptionsBuilder_ecs() {
		CloudMapNamespaceOptionsBuilder_ecsImpl cloudMapNamespaceOptionsBuilder_ecs = new CloudMapNamespaceOptionsBuilder_ecsImpl();
		return cloudMapNamespaceOptionsBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClusterBuilder_ecs createClusterBuilder_ecs() {
		ClusterBuilder_ecsImpl clusterBuilder_ecs = new ClusterBuilder_ecsImpl();
		return clusterBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancerBuilder_elasticloadbalancingv2 createApplicationLoadBalancerBuilder_elasticloadbalancingv2() {
		ApplicationLoadBalancerBuilder_elasticloadbalancingv2Impl applicationLoadBalancerBuilder_elasticloadbalancingv2 = new ApplicationLoadBalancerBuilder_elasticloadbalancingv2Impl();
		return applicationLoadBalancerBuilder_elasticloadbalancingv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerImageAssetBuilder_assets createDockerImageAssetBuilder_assets() {
		DockerImageAssetBuilder_assetsImpl dockerImageAssetBuilder_assets = new DockerImageAssetBuilder_assetsImpl();
		return dockerImageAssetBuilder_assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetImageBuilder_ecs createAssetImageBuilder_ecs() {
		AssetImageBuilder_ecsImpl assetImageBuilder_ecs = new AssetImageBuilder_ecsImpl();
		return assetImageBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretStringGeneratorBuilder_secretsmanager createSecretStringGeneratorBuilder_secretsmanager() {
		SecretStringGeneratorBuilder_secretsmanagerImpl secretStringGeneratorBuilder_secretsmanager = new SecretStringGeneratorBuilder_secretsmanagerImpl();
		return secretStringGeneratorBuilder_secretsmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretBuilder_secretsmanager createSecretBuilder_secretsmanager() {
		SecretBuilder_secretsmanagerImpl secretBuilder_secretsmanager = new SecretBuilder_secretsmanagerImpl();
		return secretBuilder_secretsmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsLogDriverBuilder_ecs createAwsLogDriverBuilder_ecs() {
		AwsLogDriverBuilder_ecsImpl awsLogDriverBuilder_ecs = new AwsLogDriverBuilder_ecsImpl();
		return awsLogDriverBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogGroupBuilder_logs createLogGroupBuilder_logs() {
		LogGroupBuilder_logsImpl logGroupBuilder_logs = new LogGroupBuilder_logsImpl();
		return logGroupBuilder_logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsLogDriverPropsBuilder_ecs createAwsLogDriverPropsBuilder_ecs() {
		AwsLogDriverPropsBuilder_ecsImpl awsLogDriverPropsBuilder_ecs = new AwsLogDriverPropsBuilder_ecsImpl();
		return awsLogDriverPropsBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancedTaskImageOptionsBuilder_patterns createApplicationLoadBalancedTaskImageOptionsBuilder_patterns() {
		ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl applicationLoadBalancedTaskImageOptionsBuilder_patterns = new ApplicationLoadBalancedTaskImageOptionsBuilder_patternsImpl();
		return applicationLoadBalancedTaskImageOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppMeshProxyConfigurationPropsBuilder_ecs createAppMeshProxyConfigurationPropsBuilder_ecs() {
		AppMeshProxyConfigurationPropsBuilder_ecsImpl appMeshProxyConfigurationPropsBuilder_ecs = new AppMeshProxyConfigurationPropsBuilder_ecsImpl();
		return appMeshProxyConfigurationPropsBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppMeshProxyConfigurationBuilder_ecs createAppMeshProxyConfigurationBuilder_ecs() {
		AppMeshProxyConfigurationBuilder_ecsImpl appMeshProxyConfigurationBuilder_ecs = new AppMeshProxyConfigurationBuilder_ecsImpl();
		return appMeshProxyConfigurationBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostBuilder_ecs createHostBuilder_ecs() {
		HostBuilder_ecsImpl hostBuilder_ecs = new HostBuilder_ecsImpl();
		return hostBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerVolumeConfigurationBuilder_ecs createDockerVolumeConfigurationBuilder_ecs() {
		DockerVolumeConfigurationBuilder_ecsImpl dockerVolumeConfigurationBuilder_ecs = new DockerVolumeConfigurationBuilder_ecsImpl();
		return dockerVolumeConfigurationBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeBuilder_ecs createVolumeBuilder_ecs() {
		VolumeBuilder_ecsImpl volumeBuilder_ecs = new VolumeBuilder_ecsImpl();
		return volumeBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ec2TaskDefinitionBuilder_ecs createEc2TaskDefinitionBuilder_ecs() {
		Ec2TaskDefinitionBuilder_ecsImpl ec2TaskDefinitionBuilder_ecs = new Ec2TaskDefinitionBuilder_ecsImpl();
		return ec2TaskDefinitionBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancedEc2ServiceBuilder_patterns createApplicationLoadBalancedEc2ServiceBuilder_patterns() {
		ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl applicationLoadBalancedEc2ServiceBuilder_patterns = new ApplicationLoadBalancedEc2ServiceBuilder_patternsImpl();
		return applicationLoadBalancedEc2ServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FargateTaskDefinitionBuilder_ecs createFargateTaskDefinitionBuilder_ecs() {
		FargateTaskDefinitionBuilder_ecsImpl fargateTaskDefinitionBuilder_ecs = new FargateTaskDefinitionBuilder_ecsImpl();
		return fargateTaskDefinitionBuilder_ecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancedFargateServiceBuilder_patterns createApplicationLoadBalancedFargateServiceBuilder_patterns() {
		ApplicationLoadBalancedFargateServiceBuilder_patternsImpl applicationLoadBalancedFargateServiceBuilder_patterns = new ApplicationLoadBalancedFargateServiceBuilder_patternsImpl();
		return applicationLoadBalancedFargateServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns() {
		ApplicationMultipleTargetGroupsFargateServiceBuilder_patternsImpl applicationMultipleTargetGroupsFargateServiceBuilder_patterns = new ApplicationMultipleTargetGroupsFargateServiceBuilder_patternsImpl();
		return applicationMultipleTargetGroupsFargateServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationListenerPropsBuilder_patterns createApplicationListenerPropsBuilder_patterns() {
		ApplicationListenerPropsBuilder_patternsImpl applicationListenerPropsBuilder_patterns = new ApplicationListenerPropsBuilder_patternsImpl();
		return applicationListenerPropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancerPropsBuilder_patterns createApplicationLoadBalancerPropsBuilder_patterns() {
		ApplicationLoadBalancerPropsBuilder_patternsImpl applicationLoadBalancerPropsBuilder_patterns = new ApplicationLoadBalancerPropsBuilder_patternsImpl();
		return applicationLoadBalancerPropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationTargetPropsBuilder_patterns createApplicationTargetPropsBuilder_patterns() {
		ApplicationTargetPropsBuilder_patternsImpl applicationTargetPropsBuilder_patterns = new ApplicationTargetPropsBuilder_patternsImpl();
		return applicationTargetPropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLoadBalancedTaskImagePropsBuilder_patterns createApplicationLoadBalancedTaskImagePropsBuilder_patterns() {
		ApplicationLoadBalancedTaskImagePropsBuilder_patternsImpl applicationLoadBalancedTaskImagePropsBuilder_patterns = new ApplicationLoadBalancedTaskImagePropsBuilder_patternsImpl();
		return applicationLoadBalancedTaskImagePropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns() {
		ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl applicationMultipleTargetGroupsEc2ServiceBuilder_patterns = new ApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsImpl();
		return applicationMultipleTargetGroupsEc2ServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLoadBalancedTaskImageOptionsBuilder_patterns createNetworkLoadBalancedTaskImageOptionsBuilder_patterns() {
		NetworkLoadBalancedTaskImageOptionsBuilder_patternsImpl networkLoadBalancedTaskImageOptionsBuilder_patterns = new NetworkLoadBalancedTaskImageOptionsBuilder_patternsImpl();
		return networkLoadBalancedTaskImageOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLoadBalancedFargateServiceBuilder_patterns createNetworkLoadBalancedFargateServiceBuilder_patterns() {
		NetworkLoadBalancedFargateServiceBuilder_patternsImpl networkLoadBalancedFargateServiceBuilder_patterns = new NetworkLoadBalancedFargateServiceBuilder_patternsImpl();
		return networkLoadBalancedFargateServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLoadBalancedEc2ServiceBuilder_patterns createNetworkLoadBalancedEc2ServiceBuilder_patterns() {
		NetworkLoadBalancedEc2ServiceBuilder_patternsImpl networkLoadBalancedEc2ServiceBuilder_patterns = new NetworkLoadBalancedEc2ServiceBuilder_patternsImpl();
		return networkLoadBalancedEc2ServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns() {
		NetworkMultipleTargetGroupsEc2ServiceBuilder_patternsImpl networkMultipleTargetGroupsEc2ServiceBuilder_patterns = new NetworkMultipleTargetGroupsEc2ServiceBuilder_patternsImpl();
		return networkMultipleTargetGroupsEc2ServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkTargetPropsBuilder_patterns createNetworkTargetPropsBuilder_patterns() {
		NetworkTargetPropsBuilder_patternsImpl networkTargetPropsBuilder_patterns = new NetworkTargetPropsBuilder_patternsImpl();
		return networkTargetPropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLoadBalancedTaskImagePropsBuilder_patterns createNetworkLoadBalancedTaskImagePropsBuilder_patterns() {
		NetworkLoadBalancedTaskImagePropsBuilder_patternsImpl networkLoadBalancedTaskImagePropsBuilder_patterns = new NetworkLoadBalancedTaskImagePropsBuilder_patternsImpl();
		return networkLoadBalancedTaskImagePropsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkMultipleTargetGroupsFargateServiceBuilder_patterns createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns() {
		NetworkMultipleTargetGroupsFargateServiceBuilder_patternsImpl networkMultipleTargetGroupsFargateServiceBuilder_patterns = new NetworkMultipleTargetGroupsFargateServiceBuilder_patternsImpl();
		return networkMultipleTargetGroupsFargateServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingIntervalBuilder_applicationautoscaling createScalingIntervalBuilder_applicationautoscaling() {
		ScalingIntervalBuilder_applicationautoscalingImpl scalingIntervalBuilder_applicationautoscaling = new ScalingIntervalBuilder_applicationautoscalingImpl();
		return scalingIntervalBuilder_applicationautoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueProcessingFargateServiceBuilder_patterns createQueueProcessingFargateServiceBuilder_patterns() {
		QueueProcessingFargateServiceBuilder_patternsImpl queueProcessingFargateServiceBuilder_patterns = new QueueProcessingFargateServiceBuilder_patternsImpl();
		return queueProcessingFargateServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CronOptionsBuilder_applicationautoscaling createCronOptionsBuilder_applicationautoscaling() {
		CronOptionsBuilder_applicationautoscalingImpl cronOptionsBuilder_applicationautoscaling = new CronOptionsBuilder_applicationautoscalingImpl();
		return cronOptionsBuilder_applicationautoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledEc2TaskDefinitionOptionsBuilder_patterns createScheduledEc2TaskDefinitionOptionsBuilder_patterns() {
		ScheduledEc2TaskDefinitionOptionsBuilder_patternsImpl scheduledEc2TaskDefinitionOptionsBuilder_patterns = new ScheduledEc2TaskDefinitionOptionsBuilder_patternsImpl();
		return scheduledEc2TaskDefinitionOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledEc2TaskImageOptionsBuilder_patterns createScheduledEc2TaskImageOptionsBuilder_patterns() {
		ScheduledEc2TaskImageOptionsBuilder_patternsImpl scheduledEc2TaskImageOptionsBuilder_patterns = new ScheduledEc2TaskImageOptionsBuilder_patternsImpl();
		return scheduledEc2TaskImageOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledEc2TaskBuilder_patterns createScheduledEc2TaskBuilder_patterns() {
		ScheduledEc2TaskBuilder_patternsImpl scheduledEc2TaskBuilder_patterns = new ScheduledEc2TaskBuilder_patternsImpl();
		return scheduledEc2TaskBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueProcessingEc2ServiceBuilder_patterns createQueueProcessingEc2ServiceBuilder_patterns() {
		QueueProcessingEc2ServiceBuilder_patternsImpl queueProcessingEc2ServiceBuilder_patterns = new QueueProcessingEc2ServiceBuilder_patternsImpl();
		return queueProcessingEc2ServiceBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledFargateTaskDefinitionOptionsBuilder_patterns createScheduledFargateTaskDefinitionOptionsBuilder_patterns() {
		ScheduledFargateTaskDefinitionOptionsBuilder_patternsImpl scheduledFargateTaskDefinitionOptionsBuilder_patterns = new ScheduledFargateTaskDefinitionOptionsBuilder_patternsImpl();
		return scheduledFargateTaskDefinitionOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledFargateTaskImageOptionsBuilder_patterns createScheduledFargateTaskImageOptionsBuilder_patterns() {
		ScheduledFargateTaskImageOptionsBuilder_patternsImpl scheduledFargateTaskImageOptionsBuilder_patterns = new ScheduledFargateTaskImageOptionsBuilder_patternsImpl();
		return scheduledFargateTaskImageOptionsBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicBuilder_sns createTopicBuilder_sns() {
		TopicBuilder_snsImpl topicBuilder_sns = new TopicBuilder_snsImpl();
		return topicBuilder_sns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ec2HealthCheckOptionsBuilder_autoscaling createEc2HealthCheckOptionsBuilder_autoscaling() {
		Ec2HealthCheckOptionsBuilder_autoscalingImpl ec2HealthCheckOptionsBuilder_autoscaling = new Ec2HealthCheckOptionsBuilder_autoscalingImpl();
		return ec2HealthCheckOptionsBuilder_autoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoScalingGroupBuilder_autoscaling createAutoScalingGroupBuilder_autoscaling() {
		AutoScalingGroupBuilder_autoscalingImpl autoScalingGroupBuilder_autoscaling = new AutoScalingGroupBuilder_autoscalingImpl();
		return autoScalingGroupBuilder_autoscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionConfigurationBuilder_rds createOptionConfigurationBuilder_rds() {
		OptionConfigurationBuilder_rdsImpl optionConfigurationBuilder_rds = new OptionConfigurationBuilder_rdsImpl();
		return optionConfigurationBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionGroupBuilder_rds createOptionGroupBuilder_rds() {
		OptionGroupBuilder_rdsImpl optionGroupBuilder_rds = new OptionGroupBuilder_rdsImpl();
		return optionGroupBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortBuilder_ec2 createPortBuilder_ec2() {
		PortBuilder_ec2Impl portBuilder_ec2 = new PortBuilder_ec2Impl();
		return portBuilder_ec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessorFeaturesBuilder_rds createProcessorFeaturesBuilder_rds() {
		ProcessorFeaturesBuilder_rdsImpl processorFeaturesBuilder_rds = new ProcessorFeaturesBuilder_rdsImpl();
		return processorFeaturesBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleEeInstanceEnginePropsBuilder_rds createOracleEeInstanceEnginePropsBuilder_rds() {
		OracleEeInstanceEnginePropsBuilder_rdsImpl oracleEeInstanceEnginePropsBuilder_rds = new OracleEeInstanceEnginePropsBuilder_rdsImpl();
		return oracleEeInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleSe1InstanceEnginePropsBuilder_rds createOracleSe1InstanceEnginePropsBuilder_rds() {
		OracleSe1InstanceEnginePropsBuilder_rdsImpl oracleSe1InstanceEnginePropsBuilder_rds = new OracleSe1InstanceEnginePropsBuilder_rdsImpl();
		return oracleSe1InstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleSe2InstanceEnginePropsBuilder_rds createOracleSe2InstanceEnginePropsBuilder_rds() {
		OracleSe2InstanceEnginePropsBuilder_rdsImpl oracleSe2InstanceEnginePropsBuilder_rds = new OracleSe2InstanceEnginePropsBuilder_rdsImpl();
		return oracleSe2InstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleSeInstanceEnginePropsBuilder_rds createOracleSeInstanceEnginePropsBuilder_rds() {
		OracleSeInstanceEnginePropsBuilder_rdsImpl oracleSeInstanceEnginePropsBuilder_rds = new OracleSeInstanceEnginePropsBuilder_rdsImpl();
		return oracleSeInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgresInstanceEnginePropsBuilder_rds createPostgresInstanceEnginePropsBuilder_rds() {
		PostgresInstanceEnginePropsBuilder_rdsImpl postgresInstanceEnginePropsBuilder_rds = new PostgresInstanceEnginePropsBuilder_rdsImpl();
		return postgresInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlServerEeInstanceEnginePropsBuilder_rds createSqlServerEeInstanceEnginePropsBuilder_rds() {
		SqlServerEeInstanceEnginePropsBuilder_rdsImpl sqlServerEeInstanceEnginePropsBuilder_rds = new SqlServerEeInstanceEnginePropsBuilder_rdsImpl();
		return sqlServerEeInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlServerExInstanceEnginePropsBuilder_rds createSqlServerExInstanceEnginePropsBuilder_rds() {
		SqlServerExInstanceEnginePropsBuilder_rdsImpl sqlServerExInstanceEnginePropsBuilder_rds = new SqlServerExInstanceEnginePropsBuilder_rdsImpl();
		return sqlServerExInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlServerSeInstanceEnginePropsBuilder_rds createSqlServerSeInstanceEnginePropsBuilder_rds() {
		SqlServerSeInstanceEnginePropsBuilder_rdsImpl sqlServerSeInstanceEnginePropsBuilder_rds = new SqlServerSeInstanceEnginePropsBuilder_rdsImpl();
		return sqlServerSeInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlServerWebInstanceEnginePropsBuilder_rds createSqlServerWebInstanceEnginePropsBuilder_rds() {
		SqlServerWebInstanceEnginePropsBuilder_rdsImpl sqlServerWebInstanceEnginePropsBuilder_rds = new SqlServerWebInstanceEnginePropsBuilder_rdsImpl();
		return sqlServerWebInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MySqlInstanceEnginePropsBuilder_rds createMySqlInstanceEnginePropsBuilder_rds() {
		MySqlInstanceEnginePropsBuilder_rdsImpl mySqlInstanceEnginePropsBuilder_rds = new MySqlInstanceEnginePropsBuilder_rdsImpl();
		return mySqlInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MariaDbInstanceEnginePropsBuilder_rds createMariaDbInstanceEnginePropsBuilder_rds() {
		MariaDbInstanceEnginePropsBuilder_rdsImpl mariaDbInstanceEnginePropsBuilder_rds = new MariaDbInstanceEnginePropsBuilder_rdsImpl();
		return mariaDbInstanceEnginePropsBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterGroupBuilder_rds createParameterGroupBuilder_rds() {
		ParameterGroupBuilder_rdsImpl parameterGroupBuilder_rds = new ParameterGroupBuilder_rdsImpl();
		return parameterGroupBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseInstanceBuilder_rds createDatabaseInstanceBuilder_rds() {
		DatabaseInstanceBuilder_rdsImpl databaseInstanceBuilder_rds = new DatabaseInstanceBuilder_rdsImpl();
		return databaseInstanceBuilder_rds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledFargateTaskBuilder_patterns createScheduledFargateTaskBuilder_patterns() {
		ScheduledFargateTaskBuilder_patternsImpl scheduledFargateTaskBuilder_patterns = new ScheduledFargateTaskBuilder_patternsImpl();
		return scheduledFargateTaskBuilder_patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLogTrafficType createFlowLogTrafficTypeFromString(EDataType eDataType, String initialValue) {
		FlowLogTrafficType result = FlowLogTrafficType.get(initialValue);
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
	public String convertFlowLogTrafficTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultInstanceTenancy createDefaultInstanceTenancyFromString(EDataType eDataType, String initialValue) {
		DefaultInstanceTenancy result = DefaultInstanceTenancy.get(initialValue);
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
	public String convertDefaultInstanceTenancyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnetType createSubnetTypeFromString(EDataType eDataType, String initialValue) {
		SubnetType result = SubnetType.get(initialValue);
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
	public String convertSubnetTypeToString(EDataType eDataType, Object instanceValue) {
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
	public ValidationMethod createValidationMethodFromString(EDataType eDataType, String initialValue) {
		ValidationMethod result = ValidationMethod.get(initialValue);
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
	public String convertValidationMethodToString(EDataType eDataType, Object instanceValue) {
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
	public QueueEncryption createQueueEncryptionFromString(EDataType eDataType, String initialValue) {
		QueueEncryption result = QueueEncryption.get(initialValue);
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
	public String convertQueueEncryptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetentionDays createRetentionDaysFromString(EDataType eDataType, String initialValue) {
		RetentionDays result = RetentionDays.get(initialValue);
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
	public String convertRetentionDaysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracing createTracingFromString(EDataType eDataType, String initialValue) {
		Tracing result = Tracing.get(initialValue);
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
	public String convertTracingToString(EDataType eDataType, Object instanceValue) {
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
	public CloudFrontAllowedCachedMethods createCloudFrontAllowedCachedMethodsFromString(EDataType eDataType,
			String initialValue) {
		CloudFrontAllowedCachedMethods result = CloudFrontAllowedCachedMethods.get(initialValue);
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
	public String convertCloudFrontAllowedCachedMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFrontAllowedMethods createCloudFrontAllowedMethodsFromString(EDataType eDataType, String initialValue) {
		CloudFrontAllowedMethods result = CloudFrontAllowedMethods.get(initialValue);
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
	public String convertCloudFrontAllowedMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaEdgeEventType createLambdaEdgeEventTypeFromString(EDataType eDataType, String initialValue) {
		LambdaEdgeEventType result = LambdaEdgeEventType.get(initialValue);
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
	public String convertLambdaEdgeEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginSslPolicy createOriginSslPolicyFromString(EDataType eDataType, String initialValue) {
		OriginSslPolicy result = OriginSslPolicy.get(initialValue);
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
	public String convertOriginSslPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginProtocolPolicy createOriginProtocolPolicyFromString(EDataType eDataType, String initialValue) {
		OriginProtocolPolicy result = OriginProtocolPolicy.get(initialValue);
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
	public String convertOriginProtocolPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketAccessControl createBucketAccessControlFromString(EDataType eDataType, String initialValue) {
		BucketAccessControl result = BucketAccessControl.get(initialValue);
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
	public String convertBucketAccessControlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethods createHttpMethodsFromString(EDataType eDataType, String initialValue) {
		HttpMethods result = HttpMethods.get(initialValue);
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
	public String convertHttpMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketEncryption createBucketEncryptionFromString(EDataType eDataType, String initialValue) {
		BucketEncryption result = BucketEncryption.get(initialValue);
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
	public String convertBucketEncryptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedirectProtocol createRedirectProtocolFromString(EDataType eDataType, String initialValue) {
		RedirectProtocol result = RedirectProtocol.get(initialValue);
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
	public String convertRedirectProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpVersion createHttpVersionFromString(EDataType eDataType, String initialValue) {
		HttpVersion result = HttpVersion.get(initialValue);
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
	public String convertHttpVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceClass createPriceClassFromString(EDataType eDataType, String initialValue) {
		PriceClass result = PriceClass.get(initialValue);
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
	public String convertPriceClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewerProtocolPolicy createViewerProtocolPolicyFromString(EDataType eDataType, String initialValue) {
		ViewerProtocolPolicy result = ViewerProtocolPolicy.get(initialValue);
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
	public String convertViewerProtocolPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicyProtocol createSecurityPolicyProtocolFromString(EDataType eDataType, String initialValue) {
		SecurityPolicyProtocol result = SecurityPolicyProtocol.get(initialValue);
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
	public String convertSecurityPolicyProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSLMethod createSSLMethodFromString(EDataType eDataType, String initialValue) {
		SSLMethod result = SSLMethod.get(initialValue);
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
	public String convertSSLMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mfa createMfaFromString(EDataType eDataType, String initialValue) {
		Mfa result = Mfa.get(initialValue);
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
	public String convertMfaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationEmailStyle createVerificationEmailStyleFromString(EDataType eDataType, String initialValue) {
		VerificationEmailStyle result = VerificationEmailStyle.get(initialValue);
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
	public String convertVerificationEmailStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineType createStateMachineTypeFromString(EDataType eDataType, String initialValue) {
		StateMachineType result = StateMachineType.get(initialValue);
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
	public String convertStateMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffectFromString(EDataType eDataType, String initialValue) {
		Effect result = Effect.get(initialValue);
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
	public String convertEffectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
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
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamViewType createStreamViewTypeFromString(EDataType eDataType, String initialValue) {
		StreamViewType result = StreamViewType.get(initialValue);
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
	public String convertStreamViewTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovalPolicy createRemovalPolicyFromString(EDataType eDataType, String initialValue) {
		RemovalPolicy result = RemovalPolicy.get(initialValue);
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
	public String convertRemovalPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableEncryption createTableEncryptionFromString(EDataType eDataType, String initialValue) {
		TableEncryption result = TableEncryption.get(initialValue);
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
	public String convertTableEncryptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingMode createBillingModeFromString(EDataType eDataType, String initialValue) {
		BillingMode result = BillingMode.get(initialValue);
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
	public String convertBillingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsRecordType createDnsRecordTypeFromString(EDataType eDataType, String initialValue) {
		DnsRecordType result = DnsRecordType.get(initialValue);
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
	public String convertDnsRecordTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceClass createInstanceClassFromString(EDataType eDataType, String initialValue) {
		InstanceClass result = InstanceClass.get(initialValue);
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
	public String convertInstanceClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSize createInstanceSizeFromString(EDataType eDataType, String initialValue) {
		InstanceSize result = InstanceSize.get(initialValue);
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
	public String convertInstanceSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxEdition createAmazonLinuxEditionFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxEdition result = AmazonLinuxEdition.get(initialValue);
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
	public String convertAmazonLinuxEditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxGeneration createAmazonLinuxGenerationFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxGeneration result = AmazonLinuxGeneration.get(initialValue);
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
	public String convertAmazonLinuxGenerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxStorage createAmazonLinuxStorageFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxStorage result = AmazonLinuxStorage.get(initialValue);
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
	public String convertAmazonLinuxStorageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxVirt createAmazonLinuxVirtFromString(EDataType eDataType, String initialValue) {
		AmazonLinuxVirt result = AmazonLinuxVirt.get(initialValue);
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
	public String convertAmazonLinuxVirtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingProcess createScalingProcessFromString(EDataType eDataType, String initialValue) {
		ScalingProcess result = ScalingProcess.get(initialValue);
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
	public String convertScalingProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateTypeFromString(EDataType eDataType, String initialValue) {
		UpdateType result = UpdateType.get(initialValue);
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
	public String convertUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType createNamespaceTypeFromString(EDataType eDataType, String initialValue) {
		NamespaceType result = NamespaceType.get(initialValue);
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
	public String convertNamespaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType createIpAddressTypeFromString(EDataType eDataType, String initialValue) {
		IpAddressType result = IpAddressType.get(initialValue);
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
	public String convertIpAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatedTagSource createPropagatedTagSourceFromString(EDataType eDataType, String initialValue) {
		PropagatedTagSource result = PropagatedTagSource.get(initialValue);
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
	public String convertPropagatedTagSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationProtocol createApplicationProtocolFromString(EDataType eDataType, String initialValue) {
		ApplicationProtocol result = ApplicationProtocol.get(initialValue);
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
	public String convertApplicationProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FollowMode createFollowModeFromString(EDataType eDataType, String initialValue) {
		FollowMode result = FollowMode.get(initialValue);
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
	public String convertFollowModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
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
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkMode createNetworkModeFromString(EDataType eDataType, String initialValue) {
		NetworkMode result = NetworkMode.get(initialValue);
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
	public String convertNetworkModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpcMode createIpcModeFromString(EDataType eDataType, String initialValue) {
		IpcMode result = IpcMode.get(initialValue);
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
	public String convertIpcModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PidMode createPidModeFromString(EDataType eDataType, String initialValue) {
		PidMode result = PidMode.get(initialValue);
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
	public String convertPidModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FargatePlatformVersion createFargatePlatformVersionFromString(EDataType eDataType, String initialValue) {
		FargatePlatformVersion result = FargatePlatformVersion.get(initialValue);
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
	public String convertFargatePlatformVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
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
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceInsightRetention createPerformanceInsightRetentionFromString(EDataType eDataType,
			String initialValue) {
		PerformanceInsightRetention result = PerformanceInsightRetention.get(initialValue);
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
	public String convertPerformanceInsightRetentionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageType createStorageTypeFromString(EDataType eDataType, String initialValue) {
		StorageType result = StorageType.get(initialValue);
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
	public String convertStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseModel createLicenseModelFromString(EDataType eDataType, String initialValue) {
		LicenseModel result = LicenseModel.get(initialValue);
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
	public String convertLicenseModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsworkbenchPackage getAwsworkbenchPackage() {
		return (AwsworkbenchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AwsworkbenchPackage getPackage() {
		return AwsworkbenchPackage.eINSTANCE;
	}

} //AwsworkbenchFactoryImpl
