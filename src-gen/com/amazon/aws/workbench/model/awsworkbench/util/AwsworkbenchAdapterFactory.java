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
		public Adapter caseApiGatewayToLambdaBuilder_apigatewaylambda(
				ApiGatewayToLambdaBuilder_apigatewaylambda object) {
			return createApiGatewayToLambdaBuilder_apigatewaylambdaAdapter();
		}

		@Override
		public Adapter caseApiGatewayToSqsBuilder_apigatewaysqs(ApiGatewayToSqsBuilder_apigatewaysqs object) {
			return createApiGatewayToSqsBuilder_apigatewaysqsAdapter();
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
		public Adapter caseEventsRuleToLambdaBuilder_eventsrulelambda(
				EventsRuleToLambdaBuilder_eventsrulelambda object) {
			return createEventsRuleToLambdaBuilder_eventsrulelambdaAdapter();
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
