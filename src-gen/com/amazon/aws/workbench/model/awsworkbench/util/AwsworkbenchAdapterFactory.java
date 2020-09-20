/**
 */
package com.amazon.aws.workbench.model.awsworkbench.util;

import com.amazon.aws.workbench.model.awsworkbench.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public class AwsworkbenchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsworkbenchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AwsworkbenchPackage.eINSTANCE;
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
	protected AwsworkbenchSwitch<Adapter> modelSwitch = new AwsworkbenchSwitch<Adapter>() {
		@Override
		public Adapter caseServiceResources(ServiceResources object) {
			return createServiceResourcesAdapter();
		}

		@Override
		public Adapter caseAppBuilder_core(AppBuilder_core object) {
			return createAppBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDefaultStackSynthesizerBuilder_core(DefaultStackSynthesizerBuilder_core object) {
			return createDefaultStackSynthesizerBuilder_coreAdapter();
		}

		@Override
		public Adapter caseEnvironmentBuilder_core(EnvironmentBuilder_core object) {
			return createEnvironmentBuilder_coreAdapter();
		}

		@Override
		public Adapter caseFlowLogOptionsBuilder_ec2(FlowLogOptionsBuilder_ec2 object) {
			return createFlowLogOptionsBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseStackBuilder_core(StackBuilder_core object) {
			return createStackBuilder_coreAdapter();
		}

		@Override
		public Adapter caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
			return createVpcBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
			return createSubnetBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseSubnetSelectionBuilder_ec2(SubnetSelectionBuilder_ec2 object) {
			return createSubnetSelectionBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseGatewayVpcEndpointBuilder_ec2(GatewayVpcEndpointBuilder_ec2 object) {
			return createGatewayVpcEndpointBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseMethodDeploymentOptionsBuilder_apigateway(MethodDeploymentOptionsBuilder_apigateway object) {
			return createMethodDeploymentOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseEndpointConfigurationBuilder_apigateway(EndpointConfigurationBuilder_apigateway object) {
			return createEndpointConfigurationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseStageOptionsBuilder_apigateway(StageOptionsBuilder_apigateway object) {
			return createStageOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseHostedZoneBuilder_route53(HostedZoneBuilder_route53 object) {
			return createHostedZoneBuilder_route53Adapter();
		}

		@Override
		public Adapter caseDnsValidatedCertificateBuilder_certificatemanager(
				DnsValidatedCertificateBuilder_certificatemanager object) {
			return createDnsValidatedCertificateBuilder_certificatemanagerAdapter();
		}

		@Override
		public Adapter caseIntegrationResponseBuilder_apigateway(IntegrationResponseBuilder_apigateway object) {
			return createIntegrationResponseBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseCertificateBuilder_certificatemanager(CertificateBuilder_certificatemanager object) {
			return createCertificateBuilder_certificatemanagerAdapter();
		}

		@Override
		public Adapter caseDomainNameOptionsBuilder_apigateway(DomainNameOptionsBuilder_apigateway object) {
			return createDomainNameOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseNetworkLoadBalancerBuilder_elasticloadbalancingv2(
				NetworkLoadBalancerBuilder_elasticloadbalancingv2 object) {
			return createNetworkLoadBalancerBuilder_elasticloadbalancingv2Adapter();
		}

		@Override
		public Adapter caseVpcLinkBuilder_apigateway(VpcLinkBuilder_apigateway object) {
			return createVpcLinkBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseIntegrationOptionsBuilder_apigateway(IntegrationOptionsBuilder_apigateway object) {
			return createIntegrationOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseIntegrationBuilder_apigateway(IntegrationBuilder_apigateway object) {
			return createIntegrationBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseCorsOptionsBuilder_apigateway(CorsOptionsBuilder_apigateway object) {
			return createCorsOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseKeyBuilder_kms(KeyBuilder_kms object) {
			return createKeyBuilder_kmsAdapter();
		}

		@Override
		public Adapter caseDeadLetterQueueBuilder_sqs(DeadLetterQueueBuilder_sqs object) {
			return createDeadLetterQueueBuilder_sqsAdapter();
		}

		@Override
		public Adapter caseQueueBuilder_sqs(QueueBuilder_sqs object) {
			return createQueueBuilder_sqsAdapter();
		}

		@Override
		public Adapter caseVersionOptionsBuilder_lambda(VersionOptionsBuilder_lambda object) {
			return createVersionOptionsBuilder_lambdaAdapter();
		}

		@Override
		public Adapter caseLayerVersionBuilder_lambda(LayerVersionBuilder_lambda object) {
			return createLayerVersionBuilder_lambdaAdapter();
		}

		@Override
		public Adapter caseSecurityGroupBuilder_ec2(SecurityGroupBuilder_ec2 object) {
			return createSecurityGroupBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseFunctionPropsBuilder_lambda(FunctionPropsBuilder_lambda object) {
			return createFunctionPropsBuilder_lambdaAdapter();
		}

		@Override
		public Adapter caseFunctionBuilder_lambda(FunctionBuilder_lambda object) {
			return createFunctionBuilder_lambdaAdapter();
		}

		@Override
		public Adapter caseRequestAuthorizerBuilder_apigateway(RequestAuthorizerBuilder_apigateway object) {
			return createRequestAuthorizerBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseTokenAuthorizerBuilder_apigateway(TokenAuthorizerBuilder_apigateway object) {
			return createTokenAuthorizerBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseJsonSchemaBuilder_apigateway(JsonSchemaBuilder_apigateway object) {
			return createJsonSchemaBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseModelBuilder_apigateway(ModelBuilder_apigateway object) {
			return createModelBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestValidatorOptionsBuilder_apigateway(RequestValidatorOptionsBuilder_apigateway object) {
			return createRequestValidatorOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRequestValidatorBuilder_apigateway(RequestValidatorBuilder_apigateway object) {
			return createRequestValidatorBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodResponseBuilder_apigateway(MethodResponseBuilder_apigateway object) {
			return createMethodResponseBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodOptionsBuilder_apigateway(MethodOptionsBuilder_apigateway object) {
			return createMethodOptionsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseRestApiPropsBuilder_apigateway(RestApiPropsBuilder_apigateway object) {
			return createRestApiPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiGatewayToDynamoDBBuilder_apigatewaydynamodb(
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb object) {
			return createApiGatewayToDynamoDBBuilder_apigatewaydynamodbAdapter();
		}

		@Override
		public Adapter caseLambdaRestApiPropsBuilder_apigateway(LambdaRestApiPropsBuilder_apigateway object) {
			return createLambdaRestApiPropsBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseLambdaRestApiBuilder_apigateway(LambdaRestApiBuilder_apigateway object) {
			return createLambdaRestApiBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseApiGatewayToLambdaBuilder_apigatewaylambda(
				ApiGatewayToLambdaBuilder_apigatewaylambda object) {
			return createApiGatewayToLambdaBuilder_apigatewaylambdaAdapter();
		}

		@Override
		public Adapter caseQueuePropsBuilder_sqs(QueuePropsBuilder_sqs object) {
			return createQueuePropsBuilder_sqsAdapter();
		}

		@Override
		public Adapter caseApiGatewayToSqsBuilder_apigatewaysqs(ApiGatewayToSqsBuilder_apigatewaysqs object) {
			return createApiGatewayToSqsBuilder_apigatewaysqsAdapter();
		}

		@Override
		public Adapter caseVersionBuilder_lambda(VersionBuilder_lambda object) {
			return createVersionBuilder_lambdaAdapter();
		}

		@Override
		public Adapter caseLambdaFunctionAssociationBuilder_cloudfront(
				LambdaFunctionAssociationBuilder_cloudfront object) {
			return createLambdaFunctionAssociationBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseBehaviorBuilder_cloudfront(BehaviorBuilder_cloudfront object) {
			return createBehaviorBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseCustomOriginConfigBuilder_cloudfront(CustomOriginConfigBuilder_cloudfront object) {
			return createCustomOriginConfigBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseBlockPublicAccessBuilder_s3(BlockPublicAccessBuilder_s3 object) {
			return createBlockPublicAccessBuilder_s3Adapter();
		}

		@Override
		public Adapter caseCorsRuleBuilder_s3(CorsRuleBuilder_s3 object) {
			return createCorsRuleBuilder_s3Adapter();
		}

		@Override
		public Adapter caseNoncurrentVersionTransitionBuilder_s3(NoncurrentVersionTransitionBuilder_s3 object) {
			return createNoncurrentVersionTransitionBuilder_s3Adapter();
		}

		@Override
		public Adapter caseTransitionBuilder_s3(TransitionBuilder_s3 object) {
			return createTransitionBuilder_s3Adapter();
		}

		@Override
		public Adapter caseLifecycleRuleBuilder_s3(LifecycleRuleBuilder_s3 object) {
			return createLifecycleRuleBuilder_s3Adapter();
		}

		@Override
		public Adapter caseBucketMetricsBuilder_s3(BucketMetricsBuilder_s3 object) {
			return createBucketMetricsBuilder_s3Adapter();
		}

		@Override
		public Adapter caseRedirectTargetBuilder_s3(RedirectTargetBuilder_s3 object) {
			return createRedirectTargetBuilder_s3Adapter();
		}

		@Override
		public Adapter caseRoutingRuleConditionBuilder_s3(RoutingRuleConditionBuilder_s3 object) {
			return createRoutingRuleConditionBuilder_s3Adapter();
		}

		@Override
		public Adapter caseRoutingRuleBuilder_s3(RoutingRuleBuilder_s3 object) {
			return createRoutingRuleBuilder_s3Adapter();
		}

		@Override
		public Adapter caseBucketBuilder_s3(BucketBuilder_s3 object) {
			return createBucketBuilder_s3Adapter();
		}

		@Override
		public Adapter caseBucketPropsBuilder_s3(BucketPropsBuilder_s3 object) {
			return createBucketPropsBuilder_s3Adapter();
		}

		@Override
		public Adapter caseOriginAccessIdentityBuilder_cloudfront(OriginAccessIdentityBuilder_cloudfront object) {
			return createOriginAccessIdentityBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseS3OriginConfigBuilder_cloudfront(S3OriginConfigBuilder_cloudfront object) {
			return createS3OriginConfigBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseSourceConfigurationBuilder_cloudfront(SourceConfigurationBuilder_cloudfront object) {
			return createSourceConfigurationBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseAliasConfigurationBuilder_cloudfront(AliasConfigurationBuilder_cloudfront object) {
			return createAliasConfigurationBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseLoggingConfigurationBuilder_cloudfront(LoggingConfigurationBuilder_cloudfront object) {
			return createLoggingConfigurationBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseCloudFrontWebDistributionPropsBuilder_cloudfront(
				CloudFrontWebDistributionPropsBuilder_cloudfront object) {
			return createCloudFrontWebDistributionPropsBuilder_cloudfrontAdapter();
		}

		@Override
		public Adapter caseCloudFrontToApiGatewayBuilder_cloudfrontapigateway(
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway object) {
			return createCloudFrontToApiGatewayBuilder_cloudfrontapigatewayAdapter();
		}

		@Override
		public Adapter caseCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda(
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda object) {
			return createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaAdapter();
		}

		@Override
		public Adapter caseCloudFrontToS3Builder_cloudfronts3(CloudFrontToS3Builder_cloudfronts3 object) {
			return createCloudFrontToS3Builder_cloudfronts3Adapter();
		}

		@Override
		public Adapter caseAutoVerifiedAttrsBuilder_cognito(AutoVerifiedAttrsBuilder_cognito object) {
			return createAutoVerifiedAttrsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserPoolTriggersBuilder_cognito(UserPoolTriggersBuilder_cognito object) {
			return createUserPoolTriggersBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseEmailSettingsBuilder_cognito(EmailSettingsBuilder_cognito object) {
			return createEmailSettingsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter casePasswordPolicyBuilder_cognito(PasswordPolicyBuilder_cognito object) {
			return createPasswordPolicyBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseMfaSecondFactorBuilder_cognito(MfaSecondFactorBuilder_cognito object) {
			return createMfaSecondFactorBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseRequiredAttributesBuilder_cognito(RequiredAttributesBuilder_cognito object) {
			return createRequiredAttributesBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseSignInAliasesBuilder_cognito(SignInAliasesBuilder_cognito object) {
			return createSignInAliasesBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserInvitationConfigBuilder_cognito(UserInvitationConfigBuilder_cognito object) {
			return createUserInvitationConfigBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserVerificationConfigBuilder_cognito(UserVerificationConfigBuilder_cognito object) {
			return createUserVerificationConfigBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserPoolPropsBuilder_cognito(UserPoolPropsBuilder_cognito object) {
			return createUserPoolPropsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserPoolBuilder_cognito(UserPoolBuilder_cognito object) {
			return createUserPoolBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseAuthFlowBuilder_cognito(AuthFlowBuilder_cognito object) {
			return createAuthFlowBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseOAuthFlowsBuilder_cognito(OAuthFlowsBuilder_cognito object) {
			return createOAuthFlowsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseOAuthSettingsBuilder_cognito(OAuthSettingsBuilder_cognito object) {
			return createOAuthSettingsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseUserPoolClientPropsBuilder_cognito(UserPoolClientPropsBuilder_cognito object) {
			return createUserPoolClientPropsBuilder_cognitoAdapter();
		}

		@Override
		public Adapter caseCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda(
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda object) {
			return createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaAdapter();
		}

		@Override
		public Adapter caseBuildDeadLetterQueuePropsBuilder_core(BuildDeadLetterQueuePropsBuilder_core object) {
			return createBuildDeadLetterQueuePropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildQueuePropsBuilder_core(BuildQueuePropsBuilder_core object) {
			return createBuildQueuePropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildS3BucketPropsBuilder_core(BuildS3BucketPropsBuilder_core object) {
			return createBuildS3BucketPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildEncryptionKeyPropsBuilder_core(BuildEncryptionKeyPropsBuilder_core object) {
			return createBuildEncryptionKeyPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseCognitoOptionsBuilder_core(CognitoOptionsBuilder_core object) {
			return createCognitoOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildKinesisStreamPropsBuilder_core(BuildKinesisStreamPropsBuilder_core object) {
			return createBuildKinesisStreamPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildKinesisAnalyticsAppPropsBuilder_core(BuildKinesisAnalyticsAppPropsBuilder_core object) {
			return createBuildKinesisAnalyticsAppPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildLambdaFunctionPropsBuilder_core(BuildLambdaFunctionPropsBuilder_core object) {
			return createBuildLambdaFunctionPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildDynamoDBTablePropsBuilder_core(BuildDynamoDBTablePropsBuilder_core object) {
			return createBuildDynamoDBTablePropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBuildTopicPropsBuilder_core(BuildTopicPropsBuilder_core object) {
			return createBuildTopicPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda(
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda object) {
			return createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaAdapter();
		}

		@Override
		public Adapter caseDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana(
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana object) {
			return createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaAdapter();
		}

		@Override
		public Adapter caseEventBusBuilder_events(EventBusBuilder_events object) {
			return createEventBusBuilder_eventsAdapter();
		}

		@Override
		public Adapter caseEventPatternBuilder_events(EventPatternBuilder_events object) {
			return createEventPatternBuilder_eventsAdapter();
		}

		@Override
		public Adapter caseRulePropsBuilder_events(RulePropsBuilder_events object) {
			return createRulePropsBuilder_eventsAdapter();
		}

		@Override
		public Adapter caseCronOptionsBuilder_events(CronOptionsBuilder_events object) {
			return createCronOptionsBuilder_eventsAdapter();
		}

		@Override
		public Adapter caseEventsRuleToLambdaBuilder_eventsrulelambda(
				EventsRuleToLambdaBuilder_eventsrulelambda object) {
			return createEventsRuleToLambdaBuilder_eventsrulelambdaAdapter();
		}

		@Override
		public Adapter caseStateMachinePropsBuilder_stepfunctions(StateMachinePropsBuilder_stepfunctions object) {
			return createStateMachinePropsBuilder_stepfunctionsAdapter();
		}

		@Override
		public Adapter caseEventsRuleToStepFunctionBuilder_eventsrulestepfunction(
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction object) {
			return createEventsRuleToStepFunctionBuilder_eventsrulestepfunctionAdapter();
		}

		@Override
		public Adapter caseIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3(
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 object) {
			return createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3Adapter();
		}

		@Override
		public Adapter caseIotToLambdaBuilder_iotlambda(IotToLambdaBuilder_iotlambda object) {
			return createIotToLambdaBuilder_iotlambdaAdapter();
		}

		@Override
		public Adapter caseIotToLambdaToDynamoDBBuilder_iotlambdadynamodb(
				IotToLambdaToDynamoDBBuilder_iotlambdadynamodb object) {
			return createIotToLambdaToDynamoDBBuilder_iotlambdadynamodbAdapter();
		}

		@Override
		public Adapter caseKinesisFirehoseToS3Builder_kinesisfirehoses3(
				KinesisFirehoseToS3Builder_kinesisfirehoses3 object) {
			return createKinesisFirehoseToS3Builder_kinesisfirehoses3Adapter();
		}

		@Override
		public Adapter caseKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics(
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics object) {
			return createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsAdapter();
		}

		@Override
		public Adapter caseKinesisStreamsToLambdaBuilder_kinesisstreamslambda(
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda object) {
			return createKinesisStreamsToLambdaBuilder_kinesisstreamslambdaAdapter();
		}

		@Override
		public Adapter caseTableBuilder_dynamodb(TableBuilder_dynamodb object) {
			return createTableBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseLambdaToDynamoDBBuilder_lambdadynamodb(LambdaToDynamoDBBuilder_lambdadynamodb object) {
			return createLambdaToDynamoDBBuilder_lambdadynamodbAdapter();
		}

		@Override
		public Adapter caseLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana(
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana object) {
			return createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaAdapter();
		}

		@Override
		public Adapter caseLambdaToS3Builder_lambdas3(LambdaToS3Builder_lambdas3 object) {
			return createLambdaToS3Builder_lambdas3Adapter();
		}

		@Override
		public Adapter caseTopicPropsBuilder_sns(TopicPropsBuilder_sns object) {
			return createTopicPropsBuilder_snsAdapter();
		}

		@Override
		public Adapter caseLambdaToSnsBuilder_lambdasns(LambdaToSnsBuilder_lambdasns object) {
			return createLambdaToSnsBuilder_lambdasnsAdapter();
		}

		@Override
		public Adapter caseLambdaToSqsBuilder_lambdasqs(LambdaToSqsBuilder_lambdasqs object) {
			return createLambdaToSqsBuilder_lambdasqsAdapter();
		}

		@Override
		public Adapter caseLambdaToStepFunctionBuilder_lambdastepfunction(
				LambdaToStepFunctionBuilder_lambdastepfunction object) {
			return createLambdaToStepFunctionBuilder_lambdastepfunctionAdapter();
		}

		@Override
		public Adapter caseS3ToLambdaBuilder_s3lambda(S3ToLambdaBuilder_s3lambda object) {
			return createS3ToLambdaBuilder_s3lambdaAdapter();
		}

		@Override
		public Adapter caseS3ToStepFunctionBuilder_s3stepfunction(S3ToStepFunctionBuilder_s3stepfunction object) {
			return createS3ToStepFunctionBuilder_s3stepfunctionAdapter();
		}

		@Override
		public Adapter caseSnsToLambdaBuilder_snslambda(SnsToLambdaBuilder_snslambda object) {
			return createSnsToLambdaBuilder_snslambdaAdapter();
		}

		@Override
		public Adapter caseManagedPolicyBuilder_iam(ManagedPolicyBuilder_iam object) {
			return createManagedPolicyBuilder_iamAdapter();
		}

		@Override
		public Adapter caseUserBuilder_iam(UserBuilder_iam object) {
			return createUserBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGroupBuilder_iam(GroupBuilder_iam object) {
			return createGroupBuilder_iamAdapter();
		}

		@Override
		public Adapter caseRoleBuilder_iam(RoleBuilder_iam object) {
			return createRoleBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyStatementBuilder_iam(PolicyStatementBuilder_iam object) {
			return createPolicyStatementBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyDocumentBuilder_iam(PolicyDocumentBuilder_iam object) {
			return createPolicyDocumentBuilder_iamAdapter();
		}

		@Override
		public Adapter caseSqsToLambdaBuilder_sqslambda(SqsToLambdaBuilder_sqslambda object) {
			return createSqsToLambdaBuilder_sqslambdaAdapter();
		}

		@Override
		public Adapter caseAttributeBuilder_dynamodb(AttributeBuilder_dynamodb object) {
			return createAttributeBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter caseTablePropsBuilder_dynamodb(TablePropsBuilder_dynamodb object) {
			return createTablePropsBuilder_dynamodbAdapter();
		}

		@Override
		public Adapter casePrivateDnsNamespaceBuilder_servicediscovery(
				PrivateDnsNamespaceBuilder_servicediscovery object) {
			return createPrivateDnsNamespaceBuilder_servicediscoveryAdapter();
		}

		@Override
		public Adapter casePublicDnsNamespaceBuilder_servicediscovery(
				PublicDnsNamespaceBuilder_servicediscovery object) {
			return createPublicDnsNamespaceBuilder_servicediscoveryAdapter();
		}

		@Override
		public Adapter caseHttpNamespaceBuilder_servicediscovery(HttpNamespaceBuilder_servicediscovery object) {
			return createHttpNamespaceBuilder_servicediscoveryAdapter();
		}

		@Override
		public Adapter caseCloudMapOptionsBuilder_ecs(CloudMapOptionsBuilder_ecs object) {
			return createCloudMapOptionsBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseBlockDeviceBuilder_autoscaling(BlockDeviceBuilder_autoscaling object) {
			return createBlockDeviceBuilder_autoscalingAdapter();
		}

		@Override
		public Adapter caseHealthCheckBuilder_ecs(HealthCheckBuilder_ecs object) {
			return createHealthCheckBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseAmazonLinuxImageBuilder_ec2(AmazonLinuxImageBuilder_ec2 object) {
			return createAmazonLinuxImageBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseRollingUpdateConfigurationBuilder_autoscaling(
				RollingUpdateConfigurationBuilder_autoscaling object) {
			return createRollingUpdateConfigurationBuilder_autoscalingAdapter();
		}

		@Override
		public Adapter caseAddCapacityOptionsBuilder_ecs(AddCapacityOptionsBuilder_ecs object) {
			return createAddCapacityOptionsBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseCloudMapNamespaceOptionsBuilder_ecs(CloudMapNamespaceOptionsBuilder_ecs object) {
			return createCloudMapNamespaceOptionsBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseClusterBuilder_ecs(ClusterBuilder_ecs object) {
			return createClusterBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancerBuilder_elasticloadbalancingv2(
				ApplicationLoadBalancerBuilder_elasticloadbalancingv2 object) {
			return createApplicationLoadBalancerBuilder_elasticloadbalancingv2Adapter();
		}

		@Override
		public Adapter caseDockerImageAssetBuilder_assets(DockerImageAssetBuilder_assets object) {
			return createDockerImageAssetBuilder_assetsAdapter();
		}

		@Override
		public Adapter caseAssetImageBuilder_ecs(AssetImageBuilder_ecs object) {
			return createAssetImageBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseSecretStringGeneratorBuilder_secretsmanager(
				SecretStringGeneratorBuilder_secretsmanager object) {
			return createSecretStringGeneratorBuilder_secretsmanagerAdapter();
		}

		@Override
		public Adapter caseSecretBuilder_secretsmanager(SecretBuilder_secretsmanager object) {
			return createSecretBuilder_secretsmanagerAdapter();
		}

		@Override
		public Adapter caseAwsLogDriverBuilder_ecs(AwsLogDriverBuilder_ecs object) {
			return createAwsLogDriverBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseLogGroupBuilder_logs(LogGroupBuilder_logs object) {
			return createLogGroupBuilder_logsAdapter();
		}

		@Override
		public Adapter caseAwsLogDriverPropsBuilder_ecs(AwsLogDriverPropsBuilder_ecs object) {
			return createAwsLogDriverPropsBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancedTaskImageOptionsBuilder_patterns(
				ApplicationLoadBalancedTaskImageOptionsBuilder_patterns object) {
			return createApplicationLoadBalancedTaskImageOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseAppMeshProxyConfigurationPropsBuilder_ecs(AppMeshProxyConfigurationPropsBuilder_ecs object) {
			return createAppMeshProxyConfigurationPropsBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseAppMeshProxyConfigurationBuilder_ecs(AppMeshProxyConfigurationBuilder_ecs object) {
			return createAppMeshProxyConfigurationBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseHostBuilder_ecs(HostBuilder_ecs object) {
			return createHostBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseDockerVolumeConfigurationBuilder_ecs(DockerVolumeConfigurationBuilder_ecs object) {
			return createDockerVolumeConfigurationBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseVolumeBuilder_ecs(VolumeBuilder_ecs object) {
			return createVolumeBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseEc2TaskDefinitionBuilder_ecs(Ec2TaskDefinitionBuilder_ecs object) {
			return createEc2TaskDefinitionBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancedEc2ServiceBuilder_patterns(
				ApplicationLoadBalancedEc2ServiceBuilder_patterns object) {
			return createApplicationLoadBalancedEc2ServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseFargateTaskDefinitionBuilder_ecs(FargateTaskDefinitionBuilder_ecs object) {
			return createFargateTaskDefinitionBuilder_ecsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancedFargateServiceBuilder_patterns(
				ApplicationLoadBalancedFargateServiceBuilder_patterns object) {
			return createApplicationLoadBalancedFargateServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationMultipleTargetGroupsFargateServiceBuilder_patterns(
				ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns object) {
			return createApplicationMultipleTargetGroupsFargateServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationListenerPropsBuilder_patterns(ApplicationListenerPropsBuilder_patterns object) {
			return createApplicationListenerPropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancerPropsBuilder_patterns(
				ApplicationLoadBalancerPropsBuilder_patterns object) {
			return createApplicationLoadBalancerPropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationTargetPropsBuilder_patterns(ApplicationTargetPropsBuilder_patterns object) {
			return createApplicationTargetPropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationLoadBalancedTaskImagePropsBuilder_patterns(
				ApplicationLoadBalancedTaskImagePropsBuilder_patterns object) {
			return createApplicationLoadBalancedTaskImagePropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns(
				ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns object) {
			return createApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkLoadBalancedTaskImageOptionsBuilder_patterns(
				NetworkLoadBalancedTaskImageOptionsBuilder_patterns object) {
			return createNetworkLoadBalancedTaskImageOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkLoadBalancedFargateServiceBuilder_patterns(
				NetworkLoadBalancedFargateServiceBuilder_patterns object) {
			return createNetworkLoadBalancedFargateServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkLoadBalancedEc2ServiceBuilder_patterns(
				NetworkLoadBalancedEc2ServiceBuilder_patterns object) {
			return createNetworkLoadBalancedEc2ServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns(
				NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns object) {
			return createNetworkMultipleTargetGroupsEc2ServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkTargetPropsBuilder_patterns(NetworkTargetPropsBuilder_patterns object) {
			return createNetworkTargetPropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkLoadBalancedTaskImagePropsBuilder_patterns(
				NetworkLoadBalancedTaskImagePropsBuilder_patterns object) {
			return createNetworkLoadBalancedTaskImagePropsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseNetworkMultipleTargetGroupsFargateServiceBuilder_patterns(
				NetworkMultipleTargetGroupsFargateServiceBuilder_patterns object) {
			return createNetworkMultipleTargetGroupsFargateServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseScalingIntervalBuilder_applicationautoscaling(
				ScalingIntervalBuilder_applicationautoscaling object) {
			return createScalingIntervalBuilder_applicationautoscalingAdapter();
		}

		@Override
		public Adapter caseQueueProcessingFargateServiceBuilder_patterns(
				QueueProcessingFargateServiceBuilder_patterns object) {
			return createQueueProcessingFargateServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseCronOptionsBuilder_applicationautoscaling(CronOptionsBuilder_applicationautoscaling object) {
			return createCronOptionsBuilder_applicationautoscalingAdapter();
		}

		@Override
		public Adapter caseScheduledEc2TaskDefinitionOptionsBuilder_patterns(
				ScheduledEc2TaskDefinitionOptionsBuilder_patterns object) {
			return createScheduledEc2TaskDefinitionOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseScheduledEc2TaskImageOptionsBuilder_patterns(
				ScheduledEc2TaskImageOptionsBuilder_patterns object) {
			return createScheduledEc2TaskImageOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseScheduledEc2TaskBuilder_patterns(ScheduledEc2TaskBuilder_patterns object) {
			return createScheduledEc2TaskBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseQueueProcessingEc2ServiceBuilder_patterns(QueueProcessingEc2ServiceBuilder_patterns object) {
			return createQueueProcessingEc2ServiceBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseScheduledFargateTaskDefinitionOptionsBuilder_patterns(
				ScheduledFargateTaskDefinitionOptionsBuilder_patterns object) {
			return createScheduledFargateTaskDefinitionOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseScheduledFargateTaskImageOptionsBuilder_patterns(
				ScheduledFargateTaskImageOptionsBuilder_patterns object) {
			return createScheduledFargateTaskImageOptionsBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseTopicBuilder_sns(TopicBuilder_sns object) {
			return createTopicBuilder_snsAdapter();
		}

		@Override
		public Adapter caseEc2HealthCheckOptionsBuilder_autoscaling(Ec2HealthCheckOptionsBuilder_autoscaling object) {
			return createEc2HealthCheckOptionsBuilder_autoscalingAdapter();
		}

		@Override
		public Adapter caseAutoScalingGroupBuilder_autoscaling(AutoScalingGroupBuilder_autoscaling object) {
			return createAutoScalingGroupBuilder_autoscalingAdapter();
		}

		@Override
		public Adapter caseOptionConfigurationBuilder_rds(OptionConfigurationBuilder_rds object) {
			return createOptionConfigurationBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseOptionGroupBuilder_rds(OptionGroupBuilder_rds object) {
			return createOptionGroupBuilder_rdsAdapter();
		}

		@Override
		public Adapter casePortBuilder_ec2(PortBuilder_ec2 object) {
			return createPortBuilder_ec2Adapter();
		}

		@Override
		public Adapter caseProcessorFeaturesBuilder_rds(ProcessorFeaturesBuilder_rds object) {
			return createProcessorFeaturesBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseOracleEeInstanceEnginePropsBuilder_rds(OracleEeInstanceEnginePropsBuilder_rds object) {
			return createOracleEeInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseOracleSe1InstanceEnginePropsBuilder_rds(OracleSe1InstanceEnginePropsBuilder_rds object) {
			return createOracleSe1InstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseOracleSe2InstanceEnginePropsBuilder_rds(OracleSe2InstanceEnginePropsBuilder_rds object) {
			return createOracleSe2InstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseOracleSeInstanceEnginePropsBuilder_rds(OracleSeInstanceEnginePropsBuilder_rds object) {
			return createOracleSeInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter casePostgresInstanceEnginePropsBuilder_rds(PostgresInstanceEnginePropsBuilder_rds object) {
			return createPostgresInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseSqlServerEeInstanceEnginePropsBuilder_rds(SqlServerEeInstanceEnginePropsBuilder_rds object) {
			return createSqlServerEeInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseSqlServerExInstanceEnginePropsBuilder_rds(SqlServerExInstanceEnginePropsBuilder_rds object) {
			return createSqlServerExInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseSqlServerSeInstanceEnginePropsBuilder_rds(SqlServerSeInstanceEnginePropsBuilder_rds object) {
			return createSqlServerSeInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseSqlServerWebInstanceEnginePropsBuilder_rds(
				SqlServerWebInstanceEnginePropsBuilder_rds object) {
			return createSqlServerWebInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseMySqlInstanceEnginePropsBuilder_rds(MySqlInstanceEnginePropsBuilder_rds object) {
			return createMySqlInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseMariaDbInstanceEnginePropsBuilder_rds(MariaDbInstanceEnginePropsBuilder_rds object) {
			return createMariaDbInstanceEnginePropsBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseParameterGroupBuilder_rds(ParameterGroupBuilder_rds object) {
			return createParameterGroupBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseDatabaseInstanceBuilder_rds(DatabaseInstanceBuilder_rds object) {
			return createDatabaseInstanceBuilder_rdsAdapter();
		}

		@Override
		public Adapter caseScheduledFargateTaskBuilder_patterns(ScheduledFargateTaskBuilder_patterns object) {
			return createScheduledFargateTaskBuilder_patternsAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseRestApiBuilder_apigateway(RestApiBuilder_apigateway object) {
			return createRestApiBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseMethodBuilder_apigateway(MethodBuilder_apigateway object) {
			return createMethodBuilder_apigatewayAdapter();
		}

		@Override
		public Adapter caseAddRulePropsBuilder_elasticloadbalancingv2(
				AddRulePropsBuilder_elasticloadbalancingv2 object) {
			return createAddRulePropsBuilder_elasticloadbalancingv2Adapter();
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
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources <em>Service Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ServiceResources
	 * @generated
	 */
	public Adapter createServiceResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core
	 * @generated
	 */
	public Adapter createAppBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core <em>Default Stack Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core
	 * @generated
	 */
	public Adapter createDefaultStackSynthesizerBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core <em>Environment Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core
	 * @generated
	 */
	public Adapter createEnvironmentBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2 <em>Flow Log Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2
	 * @generated
	 */
	public Adapter createFlowLogOptionsBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core <em>Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core
	 * @generated
	 */
	public Adapter createStackBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2 <em>Vpc Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2
	 * @generated
	 */
	public Adapter createVpcBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2 <em>Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2 <em>Subnet Selection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2
	 * @generated
	 */
	public Adapter createSubnetSelectionBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.GatewayVpcEndpointBuilder_ec2 <em>Gateway Vpc Endpoint Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.GatewayVpcEndpointBuilder_ec2
	 * @generated
	 */
	public Adapter createGatewayVpcEndpointBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway <em>Method Deployment Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodDeploymentOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway <em>Endpoint Configuration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway
	 * @generated
	 */
	public Adapter createEndpointConfigurationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.StageOptionsBuilder_apigateway <em>Stage Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StageOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createStageOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53 <em>Hosted Zone Builder route53</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53
	 * @generated
	 */
	public Adapter createHostedZoneBuilder_route53Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DnsValidatedCertificateBuilder_certificatemanager <em>Dns Validated Certificate Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DnsValidatedCertificateBuilder_certificatemanager
	 * @generated
	 */
	public Adapter createDnsValidatedCertificateBuilder_certificatemanagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway <em>Integration Response Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationResponseBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager <em>Certificate Builder certificatemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager
	 * @generated
	 */
	public Adapter createCertificateBuilder_certificatemanagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway <em>Domain Name Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createDomainNameOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2 <em>Network Load Balancer Builder elasticloadbalancingv2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2
	 * @generated
	 */
	public Adapter createNetworkLoadBalancerBuilder_elasticloadbalancingv2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VpcLinkBuilder_apigateway <em>Vpc Link Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VpcLinkBuilder_apigateway
	 * @generated
	 */
	public Adapter createVpcLinkBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway <em>Integration Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IntegrationBuilder_apigateway <em>Integration Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IntegrationBuilder_apigateway
	 * @generated
	 */
	public Adapter createIntegrationBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway <em>Cors Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createCorsOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms <em>Key Builder kms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms
	 * @generated
	 */
	public Adapter createKeyBuilder_kmsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs <em>Dead Letter Queue Builder sqs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs
	 * @generated
	 */
	public Adapter createDeadLetterQueueBuilder_sqsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.QueueBuilder_sqs <em>Queue Builder sqs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueueBuilder_sqs
	 * @generated
	 */
	public Adapter createQueueBuilder_sqsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VersionOptionsBuilder_lambda <em>Version Options Builder lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VersionOptionsBuilder_lambda
	 * @generated
	 */
	public Adapter createVersionOptionsBuilder_lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda <em>Layer Version Builder lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda
	 * @generated
	 */
	public Adapter createLayerVersionBuilder_lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2 <em>Security Group Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2
	 * @generated
	 */
	public Adapter createSecurityGroupBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionPropsBuilder_lambda <em>Function Props Builder lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FunctionPropsBuilder_lambda
	 * @generated
	 */
	public Adapter createFunctionPropsBuilder_lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda <em>Function Builder lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda
	 * @generated
	 */
	public Adapter createFunctionBuilder_lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RequestAuthorizerBuilder_apigateway <em>Request Authorizer Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RequestAuthorizerBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestAuthorizerBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TokenAuthorizerBuilder_apigateway <em>Token Authorizer Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TokenAuthorizerBuilder_apigateway
	 * @generated
	 */
	public Adapter createTokenAuthorizerBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.JsonSchemaBuilder_apigateway <em>Json Schema Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.JsonSchemaBuilder_apigateway
	 * @generated
	 */
	public Adapter createJsonSchemaBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ModelBuilder_apigateway <em>Model Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ModelBuilder_apigateway
	 * @generated
	 */
	public Adapter createModelBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway <em>Request Validator Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestValidatorOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway <em>Request Validator Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway
	 * @generated
	 */
	public Adapter createRequestValidatorBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MethodResponseBuilder_apigateway <em>Method Response Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodResponseBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodResponseBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway <em>Method Options Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodOptionsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RestApiPropsBuilder_apigateway <em>Rest Api Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RestApiPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createRestApiPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb <em>Api Gateway To Dynamo DB Builder apigatewaydynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb
	 * @generated
	 */
	public Adapter createApiGatewayToDynamoDBBuilder_apigatewaydynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaRestApiPropsBuilder_apigateway <em>Lambda Rest Api Props Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaRestApiPropsBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaRestApiPropsBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaRestApiBuilder_apigateway <em>Lambda Rest Api Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaRestApiBuilder_apigateway
	 * @generated
	 */
	public Adapter createLambdaRestApiBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda <em>Api Gateway To Lambda Builder apigatewaylambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda
	 * @generated
	 */
	public Adapter createApiGatewayToLambdaBuilder_apigatewaylambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs <em>Queue Props Builder sqs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs
	 * @generated
	 */
	public Adapter createQueuePropsBuilder_sqsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs <em>Api Gateway To Sqs Builder apigatewaysqs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs
	 * @generated
	 */
	public Adapter createApiGatewayToSqsBuilder_apigatewaysqsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda <em>Version Builder lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda
	 * @generated
	 */
	public Adapter createVersionBuilder_lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront <em>Lambda Function Association Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront
	 * @generated
	 */
	public Adapter createLambdaFunctionAssociationBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront <em>Behavior Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront
	 * @generated
	 */
	public Adapter createBehaviorBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront <em>Custom Origin Config Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront
	 * @generated
	 */
	public Adapter createCustomOriginConfigBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BlockPublicAccessBuilder_s3 <em>Block Public Access Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BlockPublicAccessBuilder_s3
	 * @generated
	 */
	public Adapter createBlockPublicAccessBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3 <em>Cors Rule Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3
	 * @generated
	 */
	public Adapter createCorsRuleBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NoncurrentVersionTransitionBuilder_s3 <em>Noncurrent Version Transition Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NoncurrentVersionTransitionBuilder_s3
	 * @generated
	 */
	public Adapter createNoncurrentVersionTransitionBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TransitionBuilder_s3 <em>Transition Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TransitionBuilder_s3
	 * @generated
	 */
	public Adapter createTransitionBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3 <em>Lifecycle Rule Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3
	 * @generated
	 */
	public Adapter createLifecycleRuleBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3 <em>Bucket Metrics Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3
	 * @generated
	 */
	public Adapter createBucketMetricsBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3 <em>Redirect Target Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3
	 * @generated
	 */
	public Adapter createRedirectTargetBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3 <em>Routing Rule Condition Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3
	 * @generated
	 */
	public Adapter createRoutingRuleConditionBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleBuilder_s3 <em>Routing Rule Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RoutingRuleBuilder_s3
	 * @generated
	 */
	public Adapter createRoutingRuleBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3 <em>Bucket Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3
	 * @generated
	 */
	public Adapter createBucketBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BucketPropsBuilder_s3 <em>Bucket Props Builder s3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketPropsBuilder_s3
	 * @generated
	 */
	public Adapter createBucketPropsBuilder_s3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OriginAccessIdentityBuilder_cloudfront <em>Origin Access Identity Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OriginAccessIdentityBuilder_cloudfront
	 * @generated
	 */
	public Adapter createOriginAccessIdentityBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront <em>S3 Origin Config Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront
	 * @generated
	 */
	public Adapter createS3OriginConfigBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SourceConfigurationBuilder_cloudfront <em>Source Configuration Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SourceConfigurationBuilder_cloudfront
	 * @generated
	 */
	public Adapter createSourceConfigurationBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront <em>Alias Configuration Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront
	 * @generated
	 */
	public Adapter createAliasConfigurationBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront <em>Logging Configuration Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront
	 * @generated
	 */
	public Adapter createLoggingConfigurationBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront <em>Cloud Front Web Distribution Props Builder cloudfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront
	 * @generated
	 */
	public Adapter createCloudFrontWebDistributionPropsBuilder_cloudfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayBuilder_cloudfrontapigateway <em>Cloud Front To Api Gateway Builder cloudfrontapigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayBuilder_cloudfrontapigateway
	 * @generated
	 */
	public Adapter createCloudFrontToApiGatewayBuilder_cloudfrontapigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda <em>Cloud Front To Api Gateway To Lambda Builder cloudfrontapigatewaylambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda
	 * @generated
	 */
	public Adapter createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3 <em>Cloud Front To S3 Builder cloudfronts3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3
	 * @generated
	 */
	public Adapter createCloudFrontToS3Builder_cloudfronts3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AutoVerifiedAttrsBuilder_cognito <em>Auto Verified Attrs Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AutoVerifiedAttrsBuilder_cognito
	 * @generated
	 */
	public Adapter createAutoVerifiedAttrsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolTriggersBuilder_cognito <em>User Pool Triggers Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserPoolTriggersBuilder_cognito
	 * @generated
	 */
	public Adapter createUserPoolTriggersBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EmailSettingsBuilder_cognito <em>Email Settings Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EmailSettingsBuilder_cognito
	 * @generated
	 */
	public Adapter createEmailSettingsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito <em>Password Policy Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito
	 * @generated
	 */
	public Adapter createPasswordPolicyBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MfaSecondFactorBuilder_cognito <em>Mfa Second Factor Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MfaSecondFactorBuilder_cognito
	 * @generated
	 */
	public Adapter createMfaSecondFactorBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RequiredAttributesBuilder_cognito <em>Required Attributes Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RequiredAttributesBuilder_cognito
	 * @generated
	 */
	public Adapter createRequiredAttributesBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito <em>Sign In Aliases Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SignInAliasesBuilder_cognito
	 * @generated
	 */
	public Adapter createSignInAliasesBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserInvitationConfigBuilder_cognito <em>User Invitation Config Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserInvitationConfigBuilder_cognito
	 * @generated
	 */
	public Adapter createUserInvitationConfigBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito <em>User Verification Config Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserVerificationConfigBuilder_cognito
	 * @generated
	 */
	public Adapter createUserVerificationConfigBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolPropsBuilder_cognito <em>User Pool Props Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserPoolPropsBuilder_cognito
	 * @generated
	 */
	public Adapter createUserPoolPropsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito <em>User Pool Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito
	 * @generated
	 */
	public Adapter createUserPoolBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AuthFlowBuilder_cognito <em>Auth Flow Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AuthFlowBuilder_cognito
	 * @generated
	 */
	public Adapter createAuthFlowBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito <em>OAuth Flows Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito
	 * @generated
	 */
	public Adapter createOAuthFlowsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito <em>OAuth Settings Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito
	 * @generated
	 */
	public Adapter createOAuthSettingsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserPoolClientPropsBuilder_cognito <em>User Pool Client Props Builder cognito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserPoolClientPropsBuilder_cognito
	 * @generated
	 */
	public Adapter createUserPoolClientPropsBuilder_cognitoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda <em>Cognito To Api Gateway To Lambda Builder cognitoapigatewaylambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda
	 * @generated
	 */
	public Adapter createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildDeadLetterQueuePropsBuilder_core <em>Build Dead Letter Queue Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildDeadLetterQueuePropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildDeadLetterQueuePropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildQueuePropsBuilder_core <em>Build Queue Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildQueuePropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildQueuePropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildS3BucketPropsBuilder_core <em>Build S3 Bucket Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildS3BucketPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildS3BucketPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildEncryptionKeyPropsBuilder_core <em>Build Encryption Key Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildEncryptionKeyPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildEncryptionKeyPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core <em>Cognito Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core
	 * @generated
	 */
	public Adapter createCognitoOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisStreamPropsBuilder_core <em>Build Kinesis Stream Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildKinesisStreamPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildKinesisStreamPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core <em>Build Kinesis Analytics App Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildKinesisAnalyticsAppPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildLambdaFunctionPropsBuilder_core <em>Build Lambda Function Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildLambdaFunctionPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildLambdaFunctionPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildDynamoDBTablePropsBuilder_core <em>Build Dynamo DB Table Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildDynamoDBTablePropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildDynamoDBTablePropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BuildTopicPropsBuilder_core <em>Build Topic Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BuildTopicPropsBuilder_core
	 * @generated
	 */
	public Adapter createBuildTopicPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda <em>Dynamo DB Stream To Lambda Builder dynamodbstreamlambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda
	 * @generated
	 */
	public Adapter createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana <em>Dynamo DB Stream To Lambda To Elastic Search And Kibana Builder dynamodbstreamlambdaelasticsearchkibana</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana
	 * @generated
	 */
	public Adapter createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EventBusBuilder_events <em>Event Bus Builder events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EventBusBuilder_events
	 * @generated
	 */
	public Adapter createEventBusBuilder_eventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EventPatternBuilder_events <em>Event Pattern Builder events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EventPatternBuilder_events
	 * @generated
	 */
	public Adapter createEventPatternBuilder_eventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RulePropsBuilder_events <em>Rule Props Builder events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RulePropsBuilder_events
	 * @generated
	 */
	public Adapter createRulePropsBuilder_eventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_events <em>Cron Options Builder events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_events
	 * @generated
	 */
	public Adapter createCronOptionsBuilder_eventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda <em>Events Rule To Lambda Builder eventsrulelambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda
	 * @generated
	 */
	public Adapter createEventsRuleToLambdaBuilder_eventsrulelambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.StateMachinePropsBuilder_stepfunctions <em>State Machine Props Builder stepfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StateMachinePropsBuilder_stepfunctions
	 * @generated
	 */
	public Adapter createStateMachinePropsBuilder_stepfunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.EventsRuleToStepFunctionBuilder_eventsrulestepfunction <em>Events Rule To Step Function Builder eventsrulestepfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.EventsRuleToStepFunctionBuilder_eventsrulestepfunction
	 * @generated
	 */
	public Adapter createEventsRuleToStepFunctionBuilder_eventsrulestepfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 <em>Iot To Kinesis Firehose To S3 Builder iotkinesisfirehoses3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3
	 * @generated
	 */
	public Adapter createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IotToLambdaBuilder_iotlambda <em>Iot To Lambda Builder iotlambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IotToLambdaBuilder_iotlambda
	 * @generated
	 */
	public Adapter createIotToLambdaBuilder_iotlambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.IotToLambdaToDynamoDBBuilder_iotlambdadynamodb <em>Iot To Lambda To Dynamo DB Builder iotlambdadynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.IotToLambdaToDynamoDBBuilder_iotlambdadynamodb
	 * @generated
	 */
	public Adapter createIotToLambdaToDynamoDBBuilder_iotlambdadynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToS3Builder_kinesisfirehoses3 <em>Kinesis Firehose To S3 Builder kinesisfirehoses3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToS3Builder_kinesisfirehoses3
	 * @generated
	 */
	public Adapter createKinesisFirehoseToS3Builder_kinesisfirehoses3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics <em>Kinesis Firehose To Analytics And S3 Builder kinesisfirehoses3kinesisanalytics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics
	 * @generated
	 */
	public Adapter createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.KinesisStreamsToLambdaBuilder_kinesisstreamslambda <em>Kinesis Streams To Lambda Builder kinesisstreamslambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.KinesisStreamsToLambdaBuilder_kinesisstreamslambda
	 * @generated
	 */
	public Adapter createKinesisStreamsToLambdaBuilder_kinesisstreamslambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb <em>Table Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTableBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb <em>Lambda To Dynamo DB Builder lambdadynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb
	 * @generated
	 */
	public Adapter createLambdaToDynamoDBBuilder_lambdadynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana <em>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana
	 * @generated
	 */
	public Adapter createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToS3Builder_lambdas3 <em>Lambda To S3 Builder lambdas3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToS3Builder_lambdas3
	 * @generated
	 */
	public Adapter createLambdaToS3Builder_lambdas3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns <em>Topic Props Builder sns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns
	 * @generated
	 */
	public Adapter createTopicPropsBuilder_snsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns <em>Lambda To Sns Builder lambdasns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns
	 * @generated
	 */
	public Adapter createLambdaToSnsBuilder_lambdasnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs <em>Lambda To Sqs Builder lambdasqs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs
	 * @generated
	 */
	public Adapter createLambdaToSqsBuilder_lambdasqsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LambdaToStepFunctionBuilder_lambdastepfunction <em>Lambda To Step Function Builder lambdastepfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LambdaToStepFunctionBuilder_lambdastepfunction
	 * @generated
	 */
	public Adapter createLambdaToStepFunctionBuilder_lambdastepfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToLambdaBuilder_s3lambda <em>S3 To Lambda Builder s3lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.S3ToLambdaBuilder_s3lambda
	 * @generated
	 */
	public Adapter createS3ToLambdaBuilder_s3lambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction <em>S3 To Step Function Builder s3stepfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction
	 * @generated
	 */
	public Adapter createS3ToStepFunctionBuilder_s3stepfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SnsToLambdaBuilder_snslambda <em>Sns To Lambda Builder snslambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SnsToLambdaBuilder_snslambda
	 * @generated
	 */
	public Adapter createSnsToLambdaBuilder_snslambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam <em>Managed Policy Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam
	 * @generated
	 */
	public Adapter createManagedPolicyBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.UserBuilder_iam <em>User Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.UserBuilder_iam
	 * @generated
	 */
	public Adapter createUserBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.GroupBuilder_iam <em>Group Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.GroupBuilder_iam
	 * @generated
	 */
	public Adapter createGroupBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RoleBuilder_iam <em>Role Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RoleBuilder_iam
	 * @generated
	 */
	public Adapter createRoleBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam <em>Policy Statement Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyStatementBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam <em>Policy Document Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyDocumentBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda <em>Sqs To Lambda Builder sqslambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda
	 * @generated
	 */
	public Adapter createSqsToLambdaBuilder_sqslambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AttributeBuilder_dynamodb <em>Attribute Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AttributeBuilder_dynamodb
	 * @generated
	 */
	public Adapter createAttributeBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TablePropsBuilder_dynamodb <em>Table Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TablePropsBuilder_dynamodb
	 * @generated
	 */
	public Adapter createTablePropsBuilder_dynamodbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PrivateDnsNamespaceBuilder_servicediscovery <em>Private Dns Namespace Builder servicediscovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PrivateDnsNamespaceBuilder_servicediscovery
	 * @generated
	 */
	public Adapter createPrivateDnsNamespaceBuilder_servicediscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PublicDnsNamespaceBuilder_servicediscovery <em>Public Dns Namespace Builder servicediscovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PublicDnsNamespaceBuilder_servicediscovery
	 * @generated
	 */
	public Adapter createPublicDnsNamespaceBuilder_servicediscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.HttpNamespaceBuilder_servicediscovery <em>Http Namespace Builder servicediscovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HttpNamespaceBuilder_servicediscovery
	 * @generated
	 */
	public Adapter createHttpNamespaceBuilder_servicediscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs <em>Cloud Map Options Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs
	 * @generated
	 */
	public Adapter createCloudMapOptionsBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling <em>Block Device Builder autoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling
	 * @generated
	 */
	public Adapter createBlockDeviceBuilder_autoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs <em>Health Check Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs
	 * @generated
	 */
	public Adapter createHealthCheckBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2 <em>Amazon Linux Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2
	 * @generated
	 */
	public Adapter createAmazonLinuxImageBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling <em>Rolling Update Configuration Builder autoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling
	 * @generated
	 */
	public Adapter createRollingUpdateConfigurationBuilder_autoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AddCapacityOptionsBuilder_ecs <em>Add Capacity Options Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AddCapacityOptionsBuilder_ecs
	 * @generated
	 */
	public Adapter createAddCapacityOptionsBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapNamespaceOptionsBuilder_ecs <em>Cloud Map Namespace Options Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CloudMapNamespaceOptionsBuilder_ecs
	 * @generated
	 */
	public Adapter createCloudMapNamespaceOptionsBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ClusterBuilder_ecs <em>Cluster Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ClusterBuilder_ecs
	 * @generated
	 */
	public Adapter createClusterBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2 <em>Application Load Balancer Builder elasticloadbalancingv2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerBuilder_elasticloadbalancingv2
	 * @generated
	 */
	public Adapter createApplicationLoadBalancerBuilder_elasticloadbalancingv2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets <em>Docker Image Asset Builder assets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets
	 * @generated
	 */
	public Adapter createDockerImageAssetBuilder_assetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AssetImageBuilder_ecs <em>Asset Image Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AssetImageBuilder_ecs
	 * @generated
	 */
	public Adapter createAssetImageBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SecretStringGeneratorBuilder_secretsmanager <em>Secret String Generator Builder secretsmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecretStringGeneratorBuilder_secretsmanager
	 * @generated
	 */
	public Adapter createSecretStringGeneratorBuilder_secretsmanagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager <em>Secret Builder secretsmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager
	 * @generated
	 */
	public Adapter createSecretBuilder_secretsmanagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverBuilder_ecs <em>Aws Log Driver Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverBuilder_ecs
	 * @generated
	 */
	public Adapter createAwsLogDriverBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs <em>Log Group Builder logs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs
	 * @generated
	 */
	public Adapter createLogGroupBuilder_logsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs <em>Aws Log Driver Props Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverPropsBuilder_ecs
	 * @generated
	 */
	public Adapter createAwsLogDriverPropsBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImageOptionsBuilder_patterns <em>Application Load Balanced Task Image Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImageOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationLoadBalancedTaskImageOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs <em>App Mesh Proxy Configuration Props Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs
	 * @generated
	 */
	public Adapter createAppMeshProxyConfigurationPropsBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationBuilder_ecs <em>App Mesh Proxy Configuration Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationBuilder_ecs
	 * @generated
	 */
	public Adapter createAppMeshProxyConfigurationBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.HostBuilder_ecs <em>Host Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.HostBuilder_ecs
	 * @generated
	 */
	public Adapter createHostBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs <em>Docker Volume Configuration Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs
	 * @generated
	 */
	public Adapter createDockerVolumeConfigurationBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs <em>Volume Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs
	 * @generated
	 */
	public Adapter createVolumeBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs <em>Ec2 Task Definition Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Ec2TaskDefinitionBuilder_ecs
	 * @generated
	 */
	public Adapter createEc2TaskDefinitionBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedEc2ServiceBuilder_patterns <em>Application Load Balanced Ec2 Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedEc2ServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationLoadBalancedEc2ServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs <em>Fargate Task Definition Builder ecs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs
	 * @generated
	 */
	public Adapter createFargateTaskDefinitionBuilder_ecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedFargateServiceBuilder_patterns <em>Application Load Balanced Fargate Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedFargateServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationLoadBalancedFargateServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns <em>Application Multiple Target Groups Fargate Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationMultipleTargetGroupsFargateServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns <em>Application Listener Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationListenerPropsBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationListenerPropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerPropsBuilder_patterns <em>Application Load Balancer Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerPropsBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationLoadBalancerPropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationTargetPropsBuilder_patterns <em>Application Target Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationTargetPropsBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationTargetPropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImagePropsBuilder_patterns <em>Application Load Balanced Task Image Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImagePropsBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationLoadBalancedTaskImagePropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns <em>Application Multiple Target Groups Ec2 Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createApplicationMultipleTargetGroupsEc2ServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImageOptionsBuilder_patterns <em>Network Load Balanced Task Image Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImageOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkLoadBalancedTaskImageOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedFargateServiceBuilder_patterns <em>Network Load Balanced Fargate Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedFargateServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkLoadBalancedFargateServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedEc2ServiceBuilder_patterns <em>Network Load Balanced Ec2 Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedEc2ServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkLoadBalancedEc2ServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns <em>Network Multiple Target Groups Ec2 Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkMultipleTargetGroupsEc2ServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkTargetPropsBuilder_patterns <em>Network Target Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkTargetPropsBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkTargetPropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns <em>Network Load Balanced Task Image Props Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancedTaskImagePropsBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkLoadBalancedTaskImagePropsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsFargateServiceBuilder_patterns <em>Network Multiple Target Groups Fargate Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsFargateServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createNetworkMultipleTargetGroupsFargateServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling <em>Scaling Interval Builder applicationautoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling
	 * @generated
	 */
	public Adapter createScalingIntervalBuilder_applicationautoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingFargateServiceBuilder_patterns <em>Queue Processing Fargate Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueueProcessingFargateServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createQueueProcessingFargateServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_applicationautoscaling <em>Cron Options Builder applicationautoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_applicationautoscaling
	 * @generated
	 */
	public Adapter createCronOptionsBuilder_applicationautoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskDefinitionOptionsBuilder_patterns <em>Scheduled Ec2 Task Definition Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskDefinitionOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledEc2TaskDefinitionOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns <em>Scheduled Ec2 Task Image Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskImageOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledEc2TaskImageOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskBuilder_patterns <em>Scheduled Ec2 Task Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledEc2TaskBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns <em>Queue Processing Ec2 Service Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns
	 * @generated
	 */
	public Adapter createQueueProcessingEc2ServiceBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskDefinitionOptionsBuilder_patterns <em>Scheduled Fargate Task Definition Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskDefinitionOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledFargateTaskDefinitionOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskImageOptionsBuilder_patterns <em>Scheduled Fargate Task Image Options Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskImageOptionsBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledFargateTaskImageOptionsBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.TopicBuilder_sns <em>Topic Builder sns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TopicBuilder_sns
	 * @generated
	 */
	public Adapter createTopicBuilder_snsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.Ec2HealthCheckOptionsBuilder_autoscaling <em>Ec2 Health Check Options Builder autoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Ec2HealthCheckOptionsBuilder_autoscaling
	 * @generated
	 */
	public Adapter createEc2HealthCheckOptionsBuilder_autoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling <em>Auto Scaling Group Builder autoscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling
	 * @generated
	 */
	public Adapter createAutoScalingGroupBuilder_autoscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds <em>Option Configuration Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OptionConfigurationBuilder_rds
	 * @generated
	 */
	public Adapter createOptionConfigurationBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds <em>Option Group Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds
	 * @generated
	 */
	public Adapter createOptionGroupBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2 <em>Port Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2
	 * @generated
	 */
	public Adapter createPortBuilder_ec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ProcessorFeaturesBuilder_rds <em>Processor Features Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ProcessorFeaturesBuilder_rds
	 * @generated
	 */
	public Adapter createProcessorFeaturesBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OracleEeInstanceEnginePropsBuilder_rds <em>Oracle Ee Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OracleEeInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createOracleEeInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe1InstanceEnginePropsBuilder_rds <em>Oracle Se1 Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OracleSe1InstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createOracleSe1InstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds <em>Oracle Se2 Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OracleSe2InstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createOracleSe2InstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.OracleSeInstanceEnginePropsBuilder_rds <em>Oracle Se Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.OracleSeInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createOracleSeInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.PostgresInstanceEnginePropsBuilder_rds <em>Postgres Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PostgresInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createPostgresInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerEeInstanceEnginePropsBuilder_rds <em>Sql Server Ee Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SqlServerEeInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createSqlServerEeInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds <em>Sql Server Ex Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createSqlServerExInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerSeInstanceEnginePropsBuilder_rds <em>Sql Server Se Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SqlServerSeInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createSqlServerSeInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.SqlServerWebInstanceEnginePropsBuilder_rds <em>Sql Server Web Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.SqlServerWebInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createSqlServerWebInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MySqlInstanceEnginePropsBuilder_rds <em>My Sql Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MySqlInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createMySqlInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MariaDbInstanceEnginePropsBuilder_rds <em>Maria Db Instance Engine Props Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MariaDbInstanceEnginePropsBuilder_rds
	 * @generated
	 */
	public Adapter createMariaDbInstanceEnginePropsBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds <em>Parameter Group Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ParameterGroupBuilder_rds
	 * @generated
	 */
	public Adapter createParameterGroupBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds <em>Database Instance Builder rds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds
	 * @generated
	 */
	public Adapter createDatabaseInstanceBuilder_rdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns <em>Scheduled Fargate Task Builder patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns
	 * @generated
	 */
	public Adapter createScheduledFargateTaskBuilder_patternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.RestApiBuilder_apigateway <em>Rest Api Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RestApiBuilder_apigateway
	 * @generated
	 */
	public Adapter createRestApiBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.MethodBuilder_apigateway <em>Method Builder apigateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.MethodBuilder_apigateway
	 * @generated
	 */
	public Adapter createMethodBuilder_apigatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.amazon.aws.workbench.model.awsworkbench.AddRulePropsBuilder_elasticloadbalancingv2 <em>Add Rule Props Builder elasticloadbalancingv2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AddRulePropsBuilder_elasticloadbalancingv2
	 * @generated
	 */
	public Adapter createAddRulePropsBuilder_elasticloadbalancingv2Adapter() {
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

} //AwsworkbenchAdapterFactory
