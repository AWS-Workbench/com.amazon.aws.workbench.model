/**
 */
package com.amazon.aws.workbench.model.awsworkbench.util;

import com.amazon.aws.workbench.model.awsworkbench.*;

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
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage
 * @generated
 */
public class AwsworkbenchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsworkbenchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchSwitch() {
		if (modelPackage == null) {
			modelPackage = AwsworkbenchPackage.eINSTANCE;
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
		case AwsworkbenchPackage.SERVICE_RESOURCES: {
			ServiceResources serviceResources = (ServiceResources) theEObject;
			T result = caseServiceResources(serviceResources);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APP_BUILDER_CORE: {
			AppBuilder_core appBuilder_core = (AppBuilder_core) theEObject;
			T result = caseAppBuilder_core(appBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE: {
			DefaultStackSynthesizerBuilder_core defaultStackSynthesizerBuilder_core = (DefaultStackSynthesizerBuilder_core) theEObject;
			T result = caseDefaultStackSynthesizerBuilder_core(defaultStackSynthesizerBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ENVIRONMENT_BUILDER_CORE: {
			EnvironmentBuilder_core environmentBuilder_core = (EnvironmentBuilder_core) theEObject;
			T result = caseEnvironmentBuilder_core(environmentBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FLOW_LOG_OPTIONS_BUILDER_EC2: {
			FlowLogOptionsBuilder_ec2 flowLogOptionsBuilder_ec2 = (FlowLogOptionsBuilder_ec2) theEObject;
			T result = caseFlowLogOptionsBuilder_ec2(flowLogOptionsBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.STACK_BUILDER_CORE: {
			StackBuilder_core stackBuilder_core = (StackBuilder_core) theEObject;
			T result = caseStackBuilder_core(stackBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPC_BUILDER_EC2: {
			VpcBuilder_ec2 vpcBuilder_ec2 = (VpcBuilder_ec2) theEObject;
			T result = caseVpcBuilder_ec2(vpcBuilder_ec2);
			if (result == null)
				result = caseServiceResources(vpcBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_BUILDER_EC2: {
			SubnetBuilder_ec2 subnetBuilder_ec2 = (SubnetBuilder_ec2) theEObject;
			T result = caseSubnetBuilder_ec2(subnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2: {
			SubnetSelectionBuilder_ec2 subnetSelectionBuilder_ec2 = (SubnetSelectionBuilder_ec2) theEObject;
			T result = caseSubnetSelectionBuilder_ec2(subnetSelectionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.GATEWAY_VPC_ENDPOINT_BUILDER_EC2: {
			GatewayVpcEndpointBuilder_ec2 gatewayVpcEndpointBuilder_ec2 = (GatewayVpcEndpointBuilder_ec2) theEObject;
			T result = caseGatewayVpcEndpointBuilder_ec2(gatewayVpcEndpointBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY: {
			MethodDeploymentOptionsBuilder_apigateway methodDeploymentOptionsBuilder_apigateway = (MethodDeploymentOptionsBuilder_apigateway) theEObject;
			T result = caseMethodDeploymentOptionsBuilder_apigateway(methodDeploymentOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY: {
			EndpointConfigurationBuilder_apigateway endpointConfigurationBuilder_apigateway = (EndpointConfigurationBuilder_apigateway) theEObject;
			T result = caseEndpointConfigurationBuilder_apigateway(endpointConfigurationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY: {
			StageOptionsBuilder_apigateway stageOptionsBuilder_apigateway = (StageOptionsBuilder_apigateway) theEObject;
			T result = caseStageOptionsBuilder_apigateway(stageOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53: {
			HostedZoneBuilder_route53 hostedZoneBuilder_route53 = (HostedZoneBuilder_route53) theEObject;
			T result = caseHostedZoneBuilder_route53(hostedZoneBuilder_route53);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			DnsValidatedCertificateBuilder_certificatemanager dnsValidatedCertificateBuilder_certificatemanager = (DnsValidatedCertificateBuilder_certificatemanager) theEObject;
			T result = caseDnsValidatedCertificateBuilder_certificatemanager(
					dnsValidatedCertificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY: {
			IntegrationResponseBuilder_apigateway integrationResponseBuilder_apigateway = (IntegrationResponseBuilder_apigateway) theEObject;
			T result = caseIntegrationResponseBuilder_apigateway(integrationResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			CertificateBuilder_certificatemanager certificateBuilder_certificatemanager = (CertificateBuilder_certificatemanager) theEObject;
			T result = caseCertificateBuilder_certificatemanager(certificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY: {
			DomainNameOptionsBuilder_apigateway domainNameOptionsBuilder_apigateway = (DomainNameOptionsBuilder_apigateway) theEObject;
			T result = caseDomainNameOptionsBuilder_apigateway(domainNameOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2: {
			NetworkLoadBalancerBuilder_elasticloadbalancingv2 networkLoadBalancerBuilder_elasticloadbalancingv2 = (NetworkLoadBalancerBuilder_elasticloadbalancingv2) theEObject;
			T result = caseNetworkLoadBalancerBuilder_elasticloadbalancingv2(
					networkLoadBalancerBuilder_elasticloadbalancingv2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY: {
			VpcLinkBuilder_apigateway vpcLinkBuilder_apigateway = (VpcLinkBuilder_apigateway) theEObject;
			T result = caseVpcLinkBuilder_apigateway(vpcLinkBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY: {
			IntegrationOptionsBuilder_apigateway integrationOptionsBuilder_apigateway = (IntegrationOptionsBuilder_apigateway) theEObject;
			T result = caseIntegrationOptionsBuilder_apigateway(integrationOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY: {
			IntegrationBuilder_apigateway integrationBuilder_apigateway = (IntegrationBuilder_apigateway) theEObject;
			T result = caseIntegrationBuilder_apigateway(integrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY: {
			CorsOptionsBuilder_apigateway corsOptionsBuilder_apigateway = (CorsOptionsBuilder_apigateway) theEObject;
			T result = caseCorsOptionsBuilder_apigateway(corsOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KEY_BUILDER_KMS: {
			KeyBuilder_kms keyBuilder_kms = (KeyBuilder_kms) theEObject;
			T result = caseKeyBuilder_kms(keyBuilder_kms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS: {
			DeadLetterQueueBuilder_sqs deadLetterQueueBuilder_sqs = (DeadLetterQueueBuilder_sqs) theEObject;
			T result = caseDeadLetterQueueBuilder_sqs(deadLetterQueueBuilder_sqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS: {
			QueueBuilder_sqs queueBuilder_sqs = (QueueBuilder_sqs) theEObject;
			T result = caseQueueBuilder_sqs(queueBuilder_sqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA: {
			VersionOptionsBuilder_lambda versionOptionsBuilder_lambda = (VersionOptionsBuilder_lambda) theEObject;
			T result = caseVersionOptionsBuilder_lambda(versionOptionsBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA: {
			LayerVersionBuilder_lambda layerVersionBuilder_lambda = (LayerVersionBuilder_lambda) theEObject;
			T result = caseLayerVersionBuilder_lambda(layerVersionBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2: {
			SecurityGroupBuilder_ec2 securityGroupBuilder_ec2 = (SecurityGroupBuilder_ec2) theEObject;
			T result = caseSecurityGroupBuilder_ec2(securityGroupBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA: {
			FunctionBuilder_lambda functionBuilder_lambda = (FunctionBuilder_lambda) theEObject;
			T result = caseFunctionBuilder_lambda(functionBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY: {
			RequestAuthorizerBuilder_apigateway requestAuthorizerBuilder_apigateway = (RequestAuthorizerBuilder_apigateway) theEObject;
			T result = caseRequestAuthorizerBuilder_apigateway(requestAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TOKEN_AUTHORIZER_BUILDER_APIGATEWAY: {
			TokenAuthorizerBuilder_apigateway tokenAuthorizerBuilder_apigateway = (TokenAuthorizerBuilder_apigateway) theEObject;
			T result = caseTokenAuthorizerBuilder_apigateway(tokenAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY: {
			JsonSchemaBuilder_apigateway jsonSchemaBuilder_apigateway = (JsonSchemaBuilder_apigateway) theEObject;
			T result = caseJsonSchemaBuilder_apigateway(jsonSchemaBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.MODEL_BUILDER_APIGATEWAY: {
			ModelBuilder_apigateway modelBuilder_apigateway = (ModelBuilder_apigateway) theEObject;
			T result = caseModelBuilder_apigateway(modelBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY: {
			RequestValidatorOptionsBuilder_apigateway requestValidatorOptionsBuilder_apigateway = (RequestValidatorOptionsBuilder_apigateway) theEObject;
			T result = caseRequestValidatorOptionsBuilder_apigateway(requestValidatorOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY: {
			RequestValidatorBuilder_apigateway requestValidatorBuilder_apigateway = (RequestValidatorBuilder_apigateway) theEObject;
			T result = caseRequestValidatorBuilder_apigateway(requestValidatorBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY: {
			MethodResponseBuilder_apigateway methodResponseBuilder_apigateway = (MethodResponseBuilder_apigateway) theEObject;
			T result = caseMethodResponseBuilder_apigateway(methodResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY: {
			MethodOptionsBuilder_apigateway methodOptionsBuilder_apigateway = (MethodOptionsBuilder_apigateway) theEObject;
			T result = caseMethodOptionsBuilder_apigateway(methodOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY: {
			RestApiPropsBuilder_apigateway restApiPropsBuilder_apigateway = (RestApiPropsBuilder_apigateway) theEObject;
			T result = caseRestApiPropsBuilder_apigateway(restApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB: {
			ApiGatewayToDynamoDBBuilder_apigatewaydynamodb apiGatewayToDynamoDBBuilder_apigatewaydynamodb = (ApiGatewayToDynamoDBBuilder_apigatewaydynamodb) theEObject;
			T result = caseApiGatewayToDynamoDBBuilder_apigatewaydynamodb(
					apiGatewayToDynamoDBBuilder_apigatewaydynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA: {
			ApiGatewayToLambdaBuilder_apigatewaylambda apiGatewayToLambdaBuilder_apigatewaylambda = (ApiGatewayToLambdaBuilder_apigatewaylambda) theEObject;
			T result = caseApiGatewayToLambdaBuilder_apigatewaylambda(apiGatewayToLambdaBuilder_apigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS: {
			ApiGatewayToSqsBuilder_apigatewaysqs apiGatewayToSqsBuilder_apigatewaysqs = (ApiGatewayToSqsBuilder_apigatewaysqs) theEObject;
			T result = caseApiGatewayToSqsBuilder_apigatewaysqs(apiGatewayToSqsBuilder_apigatewaysqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY: {
			CloudFrontToApiGatewayBuilder_cloudfrontapigateway cloudFrontToApiGatewayBuilder_cloudfrontapigateway = (CloudFrontToApiGatewayBuilder_cloudfrontapigateway) theEObject;
			T result = caseCloudFrontToApiGatewayBuilder_cloudfrontapigateway(
					cloudFrontToApiGatewayBuilder_cloudfrontapigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA: {
			CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda = (CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda) theEObject;
			T result = caseCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda(
					cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3: {
			CloudFrontToS3Builder_cloudfronts3 cloudFrontToS3Builder_cloudfronts3 = (CloudFrontToS3Builder_cloudfronts3) theEObject;
			T result = caseCloudFrontToS3Builder_cloudfronts3(cloudFrontToS3Builder_cloudfronts3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA: {
			CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda = (CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda) theEObject;
			T result = caseCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda(
					cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE: {
			BuildDeadLetterQueuePropsBuilder_core buildDeadLetterQueuePropsBuilder_core = (BuildDeadLetterQueuePropsBuilder_core) theEObject;
			T result = caseBuildDeadLetterQueuePropsBuilder_core(buildDeadLetterQueuePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE: {
			BuildQueuePropsBuilder_core buildQueuePropsBuilder_core = (BuildQueuePropsBuilder_core) theEObject;
			T result = caseBuildQueuePropsBuilder_core(buildQueuePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_S3_BUCKET_PROPS_BUILDER_CORE: {
			BuildS3BucketPropsBuilder_core buildS3BucketPropsBuilder_core = (BuildS3BucketPropsBuilder_core) theEObject;
			T result = caseBuildS3BucketPropsBuilder_core(buildS3BucketPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE: {
			BuildEncryptionKeyPropsBuilder_core buildEncryptionKeyPropsBuilder_core = (BuildEncryptionKeyPropsBuilder_core) theEObject;
			T result = caseBuildEncryptionKeyPropsBuilder_core(buildEncryptionKeyPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE: {
			CognitoOptionsBuilder_core cognitoOptionsBuilder_core = (CognitoOptionsBuilder_core) theEObject;
			T result = caseCognitoOptionsBuilder_core(cognitoOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE: {
			BuildKinesisStreamPropsBuilder_core buildKinesisStreamPropsBuilder_core = (BuildKinesisStreamPropsBuilder_core) theEObject;
			T result = caseBuildKinesisStreamPropsBuilder_core(buildKinesisStreamPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE: {
			BuildKinesisAnalyticsAppPropsBuilder_core buildKinesisAnalyticsAppPropsBuilder_core = (BuildKinesisAnalyticsAppPropsBuilder_core) theEObject;
			T result = caseBuildKinesisAnalyticsAppPropsBuilder_core(buildKinesisAnalyticsAppPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE: {
			BuildLambdaFunctionPropsBuilder_core buildLambdaFunctionPropsBuilder_core = (BuildLambdaFunctionPropsBuilder_core) theEObject;
			T result = caseBuildLambdaFunctionPropsBuilder_core(buildLambdaFunctionPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE: {
			BuildDynamoDBTablePropsBuilder_core buildDynamoDBTablePropsBuilder_core = (BuildDynamoDBTablePropsBuilder_core) theEObject;
			T result = caseBuildDynamoDBTablePropsBuilder_core(buildDynamoDBTablePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE: {
			BuildTopicPropsBuilder_core buildTopicPropsBuilder_core = (BuildTopicPropsBuilder_core) theEObject;
			T result = caseBuildTopicPropsBuilder_core(buildTopicPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA: {
			DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda = (DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda) theEObject;
			T result = caseDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda(
					dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA: {
			DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana = (DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana) theEObject;
			T result = caseDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana(
					dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA: {
			EventsRuleToLambdaBuilder_eventsrulelambda eventsRuleToLambdaBuilder_eventsrulelambda = (EventsRuleToLambdaBuilder_eventsrulelambda) theEObject;
			T result = caseEventsRuleToLambdaBuilder_eventsrulelambda(eventsRuleToLambdaBuilder_eventsrulelambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION: {
			EventsRuleToStepFunctionBuilder_eventsrulestepfunction eventsRuleToStepFunctionBuilder_eventsrulestepfunction = (EventsRuleToStepFunctionBuilder_eventsrulestepfunction) theEObject;
			T result = caseEventsRuleToStepFunctionBuilder_eventsrulestepfunction(
					eventsRuleToStepFunctionBuilder_eventsrulestepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3: {
			IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 = (IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3) theEObject;
			T result = caseIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3(
					iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA: {
			IotToLambdaBuilder_iotlambda iotToLambdaBuilder_iotlambda = (IotToLambdaBuilder_iotlambda) theEObject;
			T result = caseIotToLambdaBuilder_iotlambda(iotToLambdaBuilder_iotlambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB: {
			IotToLambdaToDynamoDBBuilder_iotlambdadynamodb iotToLambdaToDynamoDBBuilder_iotlambdadynamodb = (IotToLambdaToDynamoDBBuilder_iotlambdadynamodb) theEObject;
			T result = caseIotToLambdaToDynamoDBBuilder_iotlambdadynamodb(
					iotToLambdaToDynamoDBBuilder_iotlambdadynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3: {
			KinesisFirehoseToS3Builder_kinesisfirehoses3 kinesisFirehoseToS3Builder_kinesisfirehoses3 = (KinesisFirehoseToS3Builder_kinesisfirehoses3) theEObject;
			T result = caseKinesisFirehoseToS3Builder_kinesisfirehoses3(kinesisFirehoseToS3Builder_kinesisfirehoses3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS: {
			KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics = (KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics) theEObject;
			T result = caseKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics(
					kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA: {
			KinesisStreamsToLambdaBuilder_kinesisstreamslambda kinesisStreamsToLambdaBuilder_kinesisstreamslambda = (KinesisStreamsToLambdaBuilder_kinesisstreamslambda) theEObject;
			T result = caseKinesisStreamsToLambdaBuilder_kinesisstreamslambda(
					kinesisStreamsToLambdaBuilder_kinesisstreamslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB: {
			LambdaToDynamoDBBuilder_lambdadynamodb lambdaToDynamoDBBuilder_lambdadynamodb = (LambdaToDynamoDBBuilder_lambdadynamodb) theEObject;
			T result = caseLambdaToDynamoDBBuilder_lambdadynamodb(lambdaToDynamoDBBuilder_lambdadynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA: {
			LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana = (LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana) theEObject;
			T result = caseLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana(
					lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_S3_BUILDER_LAMBDAS3: {
			LambdaToS3Builder_lambdas3 lambdaToS3Builder_lambdas3 = (LambdaToS3Builder_lambdas3) theEObject;
			T result = caseLambdaToS3Builder_lambdas3(lambdaToS3Builder_lambdas3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS: {
			LambdaToSnsBuilder_lambdasns lambdaToSnsBuilder_lambdasns = (LambdaToSnsBuilder_lambdasns) theEObject;
			T result = caseLambdaToSnsBuilder_lambdasns(lambdaToSnsBuilder_lambdasns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS: {
			LambdaToSqsBuilder_lambdasqs lambdaToSqsBuilder_lambdasqs = (LambdaToSqsBuilder_lambdasqs) theEObject;
			T result = caseLambdaToSqsBuilder_lambdasqs(lambdaToSqsBuilder_lambdasqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION: {
			LambdaToStepFunctionBuilder_lambdastepfunction lambdaToStepFunctionBuilder_lambdastepfunction = (LambdaToStepFunctionBuilder_lambdastepfunction) theEObject;
			T result = caseLambdaToStepFunctionBuilder_lambdastepfunction(
					lambdaToStepFunctionBuilder_lambdastepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA: {
			S3ToLambdaBuilder_s3lambda s3ToLambdaBuilder_s3lambda = (S3ToLambdaBuilder_s3lambda) theEObject;
			T result = caseS3ToLambdaBuilder_s3lambda(s3ToLambdaBuilder_s3lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION: {
			S3ToStepFunctionBuilder_s3stepfunction s3ToStepFunctionBuilder_s3stepfunction = (S3ToStepFunctionBuilder_s3stepfunction) theEObject;
			T result = caseS3ToStepFunctionBuilder_s3stepfunction(s3ToStepFunctionBuilder_s3stepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SNS_TO_LAMBDA_BUILDER_SNSLAMBDA: {
			SnsToLambdaBuilder_snslambda snsToLambdaBuilder_snslambda = (SnsToLambdaBuilder_snslambda) theEObject;
			T result = caseSnsToLambdaBuilder_snslambda(snsToLambdaBuilder_snslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM: {
			ManagedPolicyBuilder_iam managedPolicyBuilder_iam = (ManagedPolicyBuilder_iam) theEObject;
			T result = caseManagedPolicyBuilder_iam(managedPolicyBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_BUILDER_IAM: {
			UserBuilder_iam userBuilder_iam = (UserBuilder_iam) theEObject;
			T result = caseUserBuilder_iam(userBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.GROUP_BUILDER_IAM: {
			GroupBuilder_iam groupBuilder_iam = (GroupBuilder_iam) theEObject;
			T result = caseGroupBuilder_iam(groupBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ROLE_BUILDER_IAM: {
			RoleBuilder_iam roleBuilder_iam = (RoleBuilder_iam) theEObject;
			T result = caseRoleBuilder_iam(roleBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM: {
			PolicyStatementBuilder_iam policyStatementBuilder_iam = (PolicyStatementBuilder_iam) theEObject;
			T result = casePolicyStatementBuilder_iam(policyStatementBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM: {
			PolicyDocumentBuilder_iam policyDocumentBuilder_iam = (PolicyDocumentBuilder_iam) theEObject;
			T result = casePolicyDocumentBuilder_iam(policyDocumentBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA: {
			SqsToLambdaBuilder_sqslambda sqsToLambdaBuilder_sqslambda = (SqsToLambdaBuilder_sqslambda) theEObject;
			T result = caseSqsToLambdaBuilder_sqslambda(sqsToLambdaBuilder_sqslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ATTRIBUTE_BUILDER_DYNAMODB: {
			AttributeBuilder_dynamodb attributeBuilder_dynamodb = (AttributeBuilder_dynamodb) theEObject;
			T result = caseAttributeBuilder_dynamodb(attributeBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TABLE_PROPS_BUILDER_DYNAMODB: {
			TablePropsBuilder_dynamodb tablePropsBuilder_dynamodb = (TablePropsBuilder_dynamodb) theEObject;
			T result = caseTablePropsBuilder_dynamodb(tablePropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceResources(ServiceResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppBuilder_core(AppBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultStackSynthesizerBuilder_core(DefaultStackSynthesizerBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentBuilder_core(EnvironmentBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Log Options Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLogOptionsBuilder_ec2(FlowLogOptionsBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackBuilder_core(StackBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vpc Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVpcBuilder_ec2(VpcBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetBuilder_ec2(SubnetBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Selection Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetSelectionBuilder_ec2(SubnetSelectionBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayVpcEndpointBuilder_ec2(GatewayVpcEndpointBuilder_ec2 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hosted Zone Builder route53</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosted Zone Builder route53</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostedZoneBuilder_route53(HostedZoneBuilder_route53 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsValidatedCertificateBuilder_certificatemanager(
			DnsValidatedCertificateBuilder_certificatemanager object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateBuilder_certificatemanager(CertificateBuilder_certificatemanager object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Network Load Balancer Builder elasticloadbalancingv2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Load Balancer Builder elasticloadbalancingv2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLoadBalancerBuilder_elasticloadbalancingv2(
			NetworkLoadBalancerBuilder_elasticloadbalancingv2 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Key Builder kms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Builder kms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyBuilder_kms(KeyBuilder_kms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dead Letter Queue Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dead Letter Queue Builder sqs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadLetterQueueBuilder_sqs(DeadLetterQueueBuilder_sqs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Builder sqs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueBuilder_sqs(QueueBuilder_sqs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Options Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Options Builder lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionOptionsBuilder_lambda(VersionOptionsBuilder_lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Version Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Version Builder lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerVersionBuilder_lambda(LayerVersionBuilder_lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroupBuilder_ec2(SecurityGroupBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Builder lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBuilder_lambda(FunctionBuilder_lambda object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Api Gateway To Dynamo DB Builder apigatewaydynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Gateway To Dynamo DB Builder apigatewaydynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiGatewayToDynamoDBBuilder_apigatewaydynamodb(ApiGatewayToDynamoDBBuilder_apigatewaydynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Gateway To Lambda Builder apigatewaylambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiGatewayToLambdaBuilder_apigatewaylambda(ApiGatewayToLambdaBuilder_apigatewaylambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Gateway To Sqs Builder apigatewaysqs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiGatewayToSqsBuilder_apigatewaysqs(ApiGatewayToSqsBuilder_apigatewaysqs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Front To Api Gateway Builder cloudfrontapigateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Front To Api Gateway Builder cloudfrontapigateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudFrontToApiGatewayBuilder_cloudfrontapigateway(
			CloudFrontToApiGatewayBuilder_cloudfrontapigateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Front To Api Gateway To Lambda Builder cloudfrontapigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Front To Api Gateway To Lambda Builder cloudfrontapigatewaylambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda(
			CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Front To S3 Builder cloudfronts3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Front To S3 Builder cloudfronts3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudFrontToS3Builder_cloudfronts3(CloudFrontToS3Builder_cloudfronts3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognito To Api Gateway To Lambda Builder cognitoapigatewaylambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognito To Api Gateway To Lambda Builder cognitoapigatewaylambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda(
			CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Dead Letter Queue Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Dead Letter Queue Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildDeadLetterQueuePropsBuilder_core(BuildDeadLetterQueuePropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Queue Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Queue Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildQueuePropsBuilder_core(BuildQueuePropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build S3 Bucket Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build S3 Bucket Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildS3BucketPropsBuilder_core(BuildS3BucketPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Encryption Key Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Encryption Key Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildEncryptionKeyPropsBuilder_core(BuildEncryptionKeyPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognito Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognito Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitoOptionsBuilder_core(CognitoOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Kinesis Stream Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Kinesis Stream Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildKinesisStreamPropsBuilder_core(BuildKinesisStreamPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Kinesis Analytics App Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Kinesis Analytics App Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildKinesisAnalyticsAppPropsBuilder_core(BuildKinesisAnalyticsAppPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Lambda Function Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Lambda Function Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildLambdaFunctionPropsBuilder_core(BuildLambdaFunctionPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Dynamo DB Table Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Dynamo DB Table Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildDynamoDBTablePropsBuilder_core(BuildDynamoDBTablePropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Topic Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Topic Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildTopicPropsBuilder_core(BuildTopicPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamo DB Stream To Lambda Builder dynamodbstreamlambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamo DB Stream To Lambda Builder dynamodbstreamlambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda(
			DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamo DB Stream To Lambda To Elastic Search And Kibana Builder dynamodbstreamlambdaelasticsearchkibana</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamo DB Stream To Lambda To Elastic Search And Kibana Builder dynamodbstreamlambdaelasticsearchkibana</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana(
			DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Rule To Lambda Builder eventsrulelambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventsRuleToLambdaBuilder_eventsrulelambda(EventsRuleToLambdaBuilder_eventsrulelambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Rule To Step Function Builder eventsrulestepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Rule To Step Function Builder eventsrulestepfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventsRuleToStepFunctionBuilder_eventsrulestepfunction(
			EventsRuleToStepFunctionBuilder_eventsrulestepfunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iot To Kinesis Firehose To S3 Builder iotkinesisfirehoses3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iot To Kinesis Firehose To S3 Builder iotkinesisfirehoses3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3(
			IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iot To Lambda Builder iotlambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iot To Lambda Builder iotlambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotToLambdaBuilder_iotlambda(IotToLambdaBuilder_iotlambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iot To Lambda To Dynamo DB Builder iotlambdadynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iot To Lambda To Dynamo DB Builder iotlambdadynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotToLambdaToDynamoDBBuilder_iotlambdadynamodb(IotToLambdaToDynamoDBBuilder_iotlambdadynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinesis Firehose To S3 Builder kinesisfirehoses3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinesis Firehose To S3 Builder kinesisfirehoses3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinesisFirehoseToS3Builder_kinesisfirehoses3(KinesisFirehoseToS3Builder_kinesisfirehoses3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinesis Firehose To Analytics And S3 Builder kinesisfirehoses3kinesisanalytics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinesis Firehose To Analytics And S3 Builder kinesisfirehoses3kinesisanalytics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics(
			KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinesis Streams To Lambda Builder kinesisstreamslambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinesis Streams To Lambda Builder kinesisstreamslambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinesisStreamsToLambdaBuilder_kinesisstreamslambda(
			KinesisStreamsToLambdaBuilder_kinesisstreamslambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To Dynamo DB Builder lambdadynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To Dynamo DB Builder lambdadynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToDynamoDBBuilder_lambdadynamodb(LambdaToDynamoDBBuilder_lambdadynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To Elastic Search And Kibana Builder lambdaelasticsearchkibana</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana(
			LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To S3 Builder lambdas3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To S3 Builder lambdas3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToS3Builder_lambdas3(LambdaToS3Builder_lambdas3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To Sns Builder lambdasns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To Sns Builder lambdasns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToSnsBuilder_lambdasns(LambdaToSnsBuilder_lambdasns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To Sqs Builder lambdasqs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To Sqs Builder lambdasqs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToSqsBuilder_lambdasqs(LambdaToSqsBuilder_lambdasqs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda To Step Function Builder lambdastepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda To Step Function Builder lambdastepfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaToStepFunctionBuilder_lambdastepfunction(LambdaToStepFunctionBuilder_lambdastepfunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>S3 To Lambda Builder s3lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>S3 To Lambda Builder s3lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS3ToLambdaBuilder_s3lambda(S3ToLambdaBuilder_s3lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>S3 To Step Function Builder s3stepfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>S3 To Step Function Builder s3stepfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS3ToStepFunctionBuilder_s3stepfunction(S3ToStepFunctionBuilder_s3stepfunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sns To Lambda Builder snslambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sns To Lambda Builder snslambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnsToLambdaBuilder_snslambda(SnsToLambdaBuilder_snslambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed Policy Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed Policy Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedPolicyBuilder_iam(ManagedPolicyBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserBuilder_iam(UserBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBuilder_iam(GroupBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBuilder_iam(RoleBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Statement Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Statement Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyStatementBuilder_iam(PolicyStatementBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Document Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Document Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDocumentBuilder_iam(PolicyDocumentBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqs To Lambda Builder sqslambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqs To Lambda Builder sqslambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqsToLambdaBuilder_sqslambda(SqsToLambdaBuilder_sqslambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBuilder_dynamodb(AttributeBuilder_dynamodb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Props Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Props Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTablePropsBuilder_dynamodb(TablePropsBuilder_dynamodb object) {
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

} //AwsworkbenchSwitch
