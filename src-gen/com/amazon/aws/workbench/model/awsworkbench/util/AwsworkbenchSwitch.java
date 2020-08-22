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
				result = caseServiceResources(flowLogOptionsBuilder_ec2);
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
				result = caseServiceResources(subnetBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SUBNET_SELECTION_BUILDER_EC2: {
			SubnetSelectionBuilder_ec2 subnetSelectionBuilder_ec2 = (SubnetSelectionBuilder_ec2) theEObject;
			T result = caseSubnetSelectionBuilder_ec2(subnetSelectionBuilder_ec2);
			if (result == null)
				result = caseServiceResources(subnetSelectionBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.GATEWAY_VPC_ENDPOINT_BUILDER_EC2: {
			GatewayVpcEndpointBuilder_ec2 gatewayVpcEndpointBuilder_ec2 = (GatewayVpcEndpointBuilder_ec2) theEObject;
			T result = caseGatewayVpcEndpointBuilder_ec2(gatewayVpcEndpointBuilder_ec2);
			if (result == null)
				result = caseServiceResources(gatewayVpcEndpointBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY: {
			MethodDeploymentOptionsBuilder_apigateway methodDeploymentOptionsBuilder_apigateway = (MethodDeploymentOptionsBuilder_apigateway) theEObject;
			T result = caseMethodDeploymentOptionsBuilder_apigateway(methodDeploymentOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(methodDeploymentOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY: {
			EndpointConfigurationBuilder_apigateway endpointConfigurationBuilder_apigateway = (EndpointConfigurationBuilder_apigateway) theEObject;
			T result = caseEndpointConfigurationBuilder_apigateway(endpointConfigurationBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(endpointConfigurationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY: {
			StageOptionsBuilder_apigateway stageOptionsBuilder_apigateway = (StageOptionsBuilder_apigateway) theEObject;
			T result = caseStageOptionsBuilder_apigateway(stageOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(stageOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53: {
			HostedZoneBuilder_route53 hostedZoneBuilder_route53 = (HostedZoneBuilder_route53) theEObject;
			T result = caseHostedZoneBuilder_route53(hostedZoneBuilder_route53);
			if (result == null)
				result = caseServiceResources(hostedZoneBuilder_route53);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			DnsValidatedCertificateBuilder_certificatemanager dnsValidatedCertificateBuilder_certificatemanager = (DnsValidatedCertificateBuilder_certificatemanager) theEObject;
			T result = caseDnsValidatedCertificateBuilder_certificatemanager(
					dnsValidatedCertificateBuilder_certificatemanager);
			if (result == null)
				result = caseServiceResources(dnsValidatedCertificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY: {
			IntegrationResponseBuilder_apigateway integrationResponseBuilder_apigateway = (IntegrationResponseBuilder_apigateway) theEObject;
			T result = caseIntegrationResponseBuilder_apigateway(integrationResponseBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(integrationResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			CertificateBuilder_certificatemanager certificateBuilder_certificatemanager = (CertificateBuilder_certificatemanager) theEObject;
			T result = caseCertificateBuilder_certificatemanager(certificateBuilder_certificatemanager);
			if (result == null)
				result = caseServiceResources(certificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY: {
			DomainNameOptionsBuilder_apigateway domainNameOptionsBuilder_apigateway = (DomainNameOptionsBuilder_apigateway) theEObject;
			T result = caseDomainNameOptionsBuilder_apigateway(domainNameOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(domainNameOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2: {
			NetworkLoadBalancerBuilder_elasticloadbalancingv2 networkLoadBalancerBuilder_elasticloadbalancingv2 = (NetworkLoadBalancerBuilder_elasticloadbalancingv2) theEObject;
			T result = caseNetworkLoadBalancerBuilder_elasticloadbalancingv2(
					networkLoadBalancerBuilder_elasticloadbalancingv2);
			if (result == null)
				result = caseServiceResources(networkLoadBalancerBuilder_elasticloadbalancingv2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY: {
			VpcLinkBuilder_apigateway vpcLinkBuilder_apigateway = (VpcLinkBuilder_apigateway) theEObject;
			T result = caseVpcLinkBuilder_apigateway(vpcLinkBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(vpcLinkBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY: {
			IntegrationOptionsBuilder_apigateway integrationOptionsBuilder_apigateway = (IntegrationOptionsBuilder_apigateway) theEObject;
			T result = caseIntegrationOptionsBuilder_apigateway(integrationOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(integrationOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.INTEGRATION_BUILDER_APIGATEWAY: {
			IntegrationBuilder_apigateway integrationBuilder_apigateway = (IntegrationBuilder_apigateway) theEObject;
			T result = caseIntegrationBuilder_apigateway(integrationBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(integrationBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY: {
			CorsOptionsBuilder_apigateway corsOptionsBuilder_apigateway = (CorsOptionsBuilder_apigateway) theEObject;
			T result = caseCorsOptionsBuilder_apigateway(corsOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(corsOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KEY_BUILDER_KMS: {
			KeyBuilder_kms keyBuilder_kms = (KeyBuilder_kms) theEObject;
			T result = caseKeyBuilder_kms(keyBuilder_kms);
			if (result == null)
				result = caseServiceResources(keyBuilder_kms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS: {
			DeadLetterQueueBuilder_sqs deadLetterQueueBuilder_sqs = (DeadLetterQueueBuilder_sqs) theEObject;
			T result = caseDeadLetterQueueBuilder_sqs(deadLetterQueueBuilder_sqs);
			if (result == null)
				result = caseServiceResources(deadLetterQueueBuilder_sqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS: {
			QueueBuilder_sqs queueBuilder_sqs = (QueueBuilder_sqs) theEObject;
			T result = caseQueueBuilder_sqs(queueBuilder_sqs);
			if (result == null)
				result = caseServiceResources(queueBuilder_sqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VERSION_OPTIONS_BUILDER_LAMBDA: {
			VersionOptionsBuilder_lambda versionOptionsBuilder_lambda = (VersionOptionsBuilder_lambda) theEObject;
			T result = caseVersionOptionsBuilder_lambda(versionOptionsBuilder_lambda);
			if (result == null)
				result = caseServiceResources(versionOptionsBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA: {
			LayerVersionBuilder_lambda layerVersionBuilder_lambda = (LayerVersionBuilder_lambda) theEObject;
			T result = caseLayerVersionBuilder_lambda(layerVersionBuilder_lambda);
			if (result == null)
				result = caseServiceResources(layerVersionBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2: {
			SecurityGroupBuilder_ec2 securityGroupBuilder_ec2 = (SecurityGroupBuilder_ec2) theEObject;
			T result = caseSecurityGroupBuilder_ec2(securityGroupBuilder_ec2);
			if (result == null)
				result = caseServiceResources(securityGroupBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FUNCTION_PROPS_BUILDER_LAMBDA: {
			FunctionPropsBuilder_lambda functionPropsBuilder_lambda = (FunctionPropsBuilder_lambda) theEObject;
			T result = caseFunctionPropsBuilder_lambda(functionPropsBuilder_lambda);
			if (result == null)
				result = caseServiceResources(functionPropsBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA: {
			FunctionBuilder_lambda functionBuilder_lambda = (FunctionBuilder_lambda) theEObject;
			T result = caseFunctionBuilder_lambda(functionBuilder_lambda);
			if (result == null)
				result = caseServiceResources(functionBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY: {
			RequestAuthorizerBuilder_apigateway requestAuthorizerBuilder_apigateway = (RequestAuthorizerBuilder_apigateway) theEObject;
			T result = caseRequestAuthorizerBuilder_apigateway(requestAuthorizerBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(requestAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TOKEN_AUTHORIZER_BUILDER_APIGATEWAY: {
			TokenAuthorizerBuilder_apigateway tokenAuthorizerBuilder_apigateway = (TokenAuthorizerBuilder_apigateway) theEObject;
			T result = caseTokenAuthorizerBuilder_apigateway(tokenAuthorizerBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(tokenAuthorizerBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY: {
			JsonSchemaBuilder_apigateway jsonSchemaBuilder_apigateway = (JsonSchemaBuilder_apigateway) theEObject;
			T result = caseJsonSchemaBuilder_apigateway(jsonSchemaBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(jsonSchemaBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.MODEL_BUILDER_APIGATEWAY: {
			ModelBuilder_apigateway modelBuilder_apigateway = (ModelBuilder_apigateway) theEObject;
			T result = caseModelBuilder_apigateway(modelBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(modelBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY: {
			RequestValidatorOptionsBuilder_apigateway requestValidatorOptionsBuilder_apigateway = (RequestValidatorOptionsBuilder_apigateway) theEObject;
			T result = caseRequestValidatorOptionsBuilder_apigateway(requestValidatorOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(requestValidatorOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY: {
			RequestValidatorBuilder_apigateway requestValidatorBuilder_apigateway = (RequestValidatorBuilder_apigateway) theEObject;
			T result = caseRequestValidatorBuilder_apigateway(requestValidatorBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(requestValidatorBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_RESPONSE_BUILDER_APIGATEWAY: {
			MethodResponseBuilder_apigateway methodResponseBuilder_apigateway = (MethodResponseBuilder_apigateway) theEObject;
			T result = caseMethodResponseBuilder_apigateway(methodResponseBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(methodResponseBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY: {
			MethodOptionsBuilder_apigateway methodOptionsBuilder_apigateway = (MethodOptionsBuilder_apigateway) theEObject;
			T result = caseMethodOptionsBuilder_apigateway(methodOptionsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(methodOptionsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY: {
			RestApiPropsBuilder_apigateway restApiPropsBuilder_apigateway = (RestApiPropsBuilder_apigateway) theEObject;
			T result = caseRestApiPropsBuilder_apigateway(restApiPropsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(restApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB: {
			ApiGatewayToDynamoDBBuilder_apigatewaydynamodb apiGatewayToDynamoDBBuilder_apigatewaydynamodb = (ApiGatewayToDynamoDBBuilder_apigatewaydynamodb) theEObject;
			T result = caseApiGatewayToDynamoDBBuilder_apigatewaydynamodb(
					apiGatewayToDynamoDBBuilder_apigatewaydynamodb);
			if (result == null)
				result = caseServiceResources(apiGatewayToDynamoDBBuilder_apigatewaydynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY: {
			LambdaRestApiPropsBuilder_apigateway lambdaRestApiPropsBuilder_apigateway = (LambdaRestApiPropsBuilder_apigateway) theEObject;
			T result = caseLambdaRestApiPropsBuilder_apigateway(lambdaRestApiPropsBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(lambdaRestApiPropsBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_REST_API_BUILDER_APIGATEWAY: {
			LambdaRestApiBuilder_apigateway lambdaRestApiBuilder_apigateway = (LambdaRestApiBuilder_apigateway) theEObject;
			T result = caseLambdaRestApiBuilder_apigateway(lambdaRestApiBuilder_apigateway);
			if (result == null)
				result = caseServiceResources(lambdaRestApiBuilder_apigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA: {
			ApiGatewayToLambdaBuilder_apigatewaylambda apiGatewayToLambdaBuilder_apigatewaylambda = (ApiGatewayToLambdaBuilder_apigatewaylambda) theEObject;
			T result = caseApiGatewayToLambdaBuilder_apigatewaylambda(apiGatewayToLambdaBuilder_apigatewaylambda);
			if (result == null)
				result = caseServiceResources(apiGatewayToLambdaBuilder_apigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS: {
			QueuePropsBuilder_sqs queuePropsBuilder_sqs = (QueuePropsBuilder_sqs) theEObject;
			T result = caseQueuePropsBuilder_sqs(queuePropsBuilder_sqs);
			if (result == null)
				result = caseServiceResources(queuePropsBuilder_sqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS: {
			ApiGatewayToSqsBuilder_apigatewaysqs apiGatewayToSqsBuilder_apigatewaysqs = (ApiGatewayToSqsBuilder_apigatewaysqs) theEObject;
			T result = caseApiGatewayToSqsBuilder_apigatewaysqs(apiGatewayToSqsBuilder_apigatewaysqs);
			if (result == null)
				result = caseServiceResources(apiGatewayToSqsBuilder_apigatewaysqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA: {
			VersionBuilder_lambda versionBuilder_lambda = (VersionBuilder_lambda) theEObject;
			T result = caseVersionBuilder_lambda(versionBuilder_lambda);
			if (result == null)
				result = caseServiceResources(versionBuilder_lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT: {
			LambdaFunctionAssociationBuilder_cloudfront lambdaFunctionAssociationBuilder_cloudfront = (LambdaFunctionAssociationBuilder_cloudfront) theEObject;
			T result = caseLambdaFunctionAssociationBuilder_cloudfront(lambdaFunctionAssociationBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(lambdaFunctionAssociationBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT: {
			BehaviorBuilder_cloudfront behaviorBuilder_cloudfront = (BehaviorBuilder_cloudfront) theEObject;
			T result = caseBehaviorBuilder_cloudfront(behaviorBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(behaviorBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT: {
			CustomOriginConfigBuilder_cloudfront customOriginConfigBuilder_cloudfront = (CustomOriginConfigBuilder_cloudfront) theEObject;
			T result = caseCustomOriginConfigBuilder_cloudfront(customOriginConfigBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(customOriginConfigBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3: {
			BlockPublicAccessBuilder_s3 blockPublicAccessBuilder_s3 = (BlockPublicAccessBuilder_s3) theEObject;
			T result = caseBlockPublicAccessBuilder_s3(blockPublicAccessBuilder_s3);
			if (result == null)
				result = caseServiceResources(blockPublicAccessBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3: {
			CorsRuleBuilder_s3 corsRuleBuilder_s3 = (CorsRuleBuilder_s3) theEObject;
			T result = caseCorsRuleBuilder_s3(corsRuleBuilder_s3);
			if (result == null)
				result = caseServiceResources(corsRuleBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3: {
			NoncurrentVersionTransitionBuilder_s3 noncurrentVersionTransitionBuilder_s3 = (NoncurrentVersionTransitionBuilder_s3) theEObject;
			T result = caseNoncurrentVersionTransitionBuilder_s3(noncurrentVersionTransitionBuilder_s3);
			if (result == null)
				result = caseServiceResources(noncurrentVersionTransitionBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3: {
			TransitionBuilder_s3 transitionBuilder_s3 = (TransitionBuilder_s3) theEObject;
			T result = caseTransitionBuilder_s3(transitionBuilder_s3);
			if (result == null)
				result = caseServiceResources(transitionBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3: {
			LifecycleRuleBuilder_s3 lifecycleRuleBuilder_s3 = (LifecycleRuleBuilder_s3) theEObject;
			T result = caseLifecycleRuleBuilder_s3(lifecycleRuleBuilder_s3);
			if (result == null)
				result = caseServiceResources(lifecycleRuleBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3: {
			BucketMetricsBuilder_s3 bucketMetricsBuilder_s3 = (BucketMetricsBuilder_s3) theEObject;
			T result = caseBucketMetricsBuilder_s3(bucketMetricsBuilder_s3);
			if (result == null)
				result = caseServiceResources(bucketMetricsBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3: {
			RedirectTargetBuilder_s3 redirectTargetBuilder_s3 = (RedirectTargetBuilder_s3) theEObject;
			T result = caseRedirectTargetBuilder_s3(redirectTargetBuilder_s3);
			if (result == null)
				result = caseServiceResources(redirectTargetBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3: {
			RoutingRuleConditionBuilder_s3 routingRuleConditionBuilder_s3 = (RoutingRuleConditionBuilder_s3) theEObject;
			T result = caseRoutingRuleConditionBuilder_s3(routingRuleConditionBuilder_s3);
			if (result == null)
				result = caseServiceResources(routingRuleConditionBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3: {
			RoutingRuleBuilder_s3 routingRuleBuilder_s3 = (RoutingRuleBuilder_s3) theEObject;
			T result = caseRoutingRuleBuilder_s3(routingRuleBuilder_s3);
			if (result == null)
				result = caseServiceResources(routingRuleBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUCKET_BUILDER_S3: {
			BucketBuilder_s3 bucketBuilder_s3 = (BucketBuilder_s3) theEObject;
			T result = caseBucketBuilder_s3(bucketBuilder_s3);
			if (result == null)
				result = caseServiceResources(bucketBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3: {
			BucketPropsBuilder_s3 bucketPropsBuilder_s3 = (BucketPropsBuilder_s3) theEObject;
			T result = caseBucketPropsBuilder_s3(bucketPropsBuilder_s3);
			if (result == null)
				result = caseServiceResources(bucketPropsBuilder_s3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT: {
			OriginAccessIdentityBuilder_cloudfront originAccessIdentityBuilder_cloudfront = (OriginAccessIdentityBuilder_cloudfront) theEObject;
			T result = caseOriginAccessIdentityBuilder_cloudfront(originAccessIdentityBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(originAccessIdentityBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT: {
			S3OriginConfigBuilder_cloudfront s3OriginConfigBuilder_cloudfront = (S3OriginConfigBuilder_cloudfront) theEObject;
			T result = caseS3OriginConfigBuilder_cloudfront(s3OriginConfigBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(s3OriginConfigBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT: {
			SourceConfigurationBuilder_cloudfront sourceConfigurationBuilder_cloudfront = (SourceConfigurationBuilder_cloudfront) theEObject;
			T result = caseSourceConfigurationBuilder_cloudfront(sourceConfigurationBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(sourceConfigurationBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT: {
			AliasConfigurationBuilder_cloudfront aliasConfigurationBuilder_cloudfront = (AliasConfigurationBuilder_cloudfront) theEObject;
			T result = caseAliasConfigurationBuilder_cloudfront(aliasConfigurationBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(aliasConfigurationBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT: {
			LoggingConfigurationBuilder_cloudfront loggingConfigurationBuilder_cloudfront = (LoggingConfigurationBuilder_cloudfront) theEObject;
			T result = caseLoggingConfigurationBuilder_cloudfront(loggingConfigurationBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(loggingConfigurationBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT: {
			CloudFrontWebDistributionPropsBuilder_cloudfront cloudFrontWebDistributionPropsBuilder_cloudfront = (CloudFrontWebDistributionPropsBuilder_cloudfront) theEObject;
			T result = caseCloudFrontWebDistributionPropsBuilder_cloudfront(
					cloudFrontWebDistributionPropsBuilder_cloudfront);
			if (result == null)
				result = caseServiceResources(cloudFrontWebDistributionPropsBuilder_cloudfront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY: {
			CloudFrontToApiGatewayBuilder_cloudfrontapigateway cloudFrontToApiGatewayBuilder_cloudfrontapigateway = (CloudFrontToApiGatewayBuilder_cloudfrontapigateway) theEObject;
			T result = caseCloudFrontToApiGatewayBuilder_cloudfrontapigateway(
					cloudFrontToApiGatewayBuilder_cloudfrontapigateway);
			if (result == null)
				result = caseServiceResources(cloudFrontToApiGatewayBuilder_cloudfrontapigateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA: {
			CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda = (CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda) theEObject;
			T result = caseCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda(
					cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda);
			if (result == null)
				result = caseServiceResources(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3: {
			CloudFrontToS3Builder_cloudfronts3 cloudFrontToS3Builder_cloudfronts3 = (CloudFrontToS3Builder_cloudfronts3) theEObject;
			T result = caseCloudFrontToS3Builder_cloudfronts3(cloudFrontToS3Builder_cloudfronts3);
			if (result == null)
				result = caseServiceResources(cloudFrontToS3Builder_cloudfronts3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.AUTO_VERIFIED_ATTRS_BUILDER_COGNITO: {
			AutoVerifiedAttrsBuilder_cognito autoVerifiedAttrsBuilder_cognito = (AutoVerifiedAttrsBuilder_cognito) theEObject;
			T result = caseAutoVerifiedAttrsBuilder_cognito(autoVerifiedAttrsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(autoVerifiedAttrsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO: {
			UserPoolTriggersBuilder_cognito userPoolTriggersBuilder_cognito = (UserPoolTriggersBuilder_cognito) theEObject;
			T result = caseUserPoolTriggersBuilder_cognito(userPoolTriggersBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userPoolTriggersBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EMAIL_SETTINGS_BUILDER_COGNITO: {
			EmailSettingsBuilder_cognito emailSettingsBuilder_cognito = (EmailSettingsBuilder_cognito) theEObject;
			T result = caseEmailSettingsBuilder_cognito(emailSettingsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(emailSettingsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO: {
			PasswordPolicyBuilder_cognito passwordPolicyBuilder_cognito = (PasswordPolicyBuilder_cognito) theEObject;
			T result = casePasswordPolicyBuilder_cognito(passwordPolicyBuilder_cognito);
			if (result == null)
				result = caseServiceResources(passwordPolicyBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.MFA_SECOND_FACTOR_BUILDER_COGNITO: {
			MfaSecondFactorBuilder_cognito mfaSecondFactorBuilder_cognito = (MfaSecondFactorBuilder_cognito) theEObject;
			T result = caseMfaSecondFactorBuilder_cognito(mfaSecondFactorBuilder_cognito);
			if (result == null)
				result = caseServiceResources(mfaSecondFactorBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO: {
			RequiredAttributesBuilder_cognito requiredAttributesBuilder_cognito = (RequiredAttributesBuilder_cognito) theEObject;
			T result = caseRequiredAttributesBuilder_cognito(requiredAttributesBuilder_cognito);
			if (result == null)
				result = caseServiceResources(requiredAttributesBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SIGN_IN_ALIASES_BUILDER_COGNITO: {
			SignInAliasesBuilder_cognito signInAliasesBuilder_cognito = (SignInAliasesBuilder_cognito) theEObject;
			T result = caseSignInAliasesBuilder_cognito(signInAliasesBuilder_cognito);
			if (result == null)
				result = caseServiceResources(signInAliasesBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_INVITATION_CONFIG_BUILDER_COGNITO: {
			UserInvitationConfigBuilder_cognito userInvitationConfigBuilder_cognito = (UserInvitationConfigBuilder_cognito) theEObject;
			T result = caseUserInvitationConfigBuilder_cognito(userInvitationConfigBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userInvitationConfigBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_VERIFICATION_CONFIG_BUILDER_COGNITO: {
			UserVerificationConfigBuilder_cognito userVerificationConfigBuilder_cognito = (UserVerificationConfigBuilder_cognito) theEObject;
			T result = caseUserVerificationConfigBuilder_cognito(userVerificationConfigBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userVerificationConfigBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_POOL_PROPS_BUILDER_COGNITO: {
			UserPoolPropsBuilder_cognito userPoolPropsBuilder_cognito = (UserPoolPropsBuilder_cognito) theEObject;
			T result = caseUserPoolPropsBuilder_cognito(userPoolPropsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userPoolPropsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO: {
			UserPoolBuilder_cognito userPoolBuilder_cognito = (UserPoolBuilder_cognito) theEObject;
			T result = caseUserPoolBuilder_cognito(userPoolBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userPoolBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO: {
			AuthFlowBuilder_cognito authFlowBuilder_cognito = (AuthFlowBuilder_cognito) theEObject;
			T result = caseAuthFlowBuilder_cognito(authFlowBuilder_cognito);
			if (result == null)
				result = caseServiceResources(authFlowBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO: {
			OAuthFlowsBuilder_cognito oAuthFlowsBuilder_cognito = (OAuthFlowsBuilder_cognito) theEObject;
			T result = caseOAuthFlowsBuilder_cognito(oAuthFlowsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(oAuthFlowsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO: {
			OAuthSettingsBuilder_cognito oAuthSettingsBuilder_cognito = (OAuthSettingsBuilder_cognito) theEObject;
			T result = caseOAuthSettingsBuilder_cognito(oAuthSettingsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(oAuthSettingsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO: {
			UserPoolClientPropsBuilder_cognito userPoolClientPropsBuilder_cognito = (UserPoolClientPropsBuilder_cognito) theEObject;
			T result = caseUserPoolClientPropsBuilder_cognito(userPoolClientPropsBuilder_cognito);
			if (result == null)
				result = caseServiceResources(userPoolClientPropsBuilder_cognito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA: {
			CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda = (CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda) theEObject;
			T result = caseCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda(
					cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda);
			if (result == null)
				result = caseServiceResources(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE: {
			BuildDeadLetterQueuePropsBuilder_core buildDeadLetterQueuePropsBuilder_core = (BuildDeadLetterQueuePropsBuilder_core) theEObject;
			T result = caseBuildDeadLetterQueuePropsBuilder_core(buildDeadLetterQueuePropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildDeadLetterQueuePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE: {
			BuildQueuePropsBuilder_core buildQueuePropsBuilder_core = (BuildQueuePropsBuilder_core) theEObject;
			T result = caseBuildQueuePropsBuilder_core(buildQueuePropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildQueuePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_S3_BUCKET_PROPS_BUILDER_CORE: {
			BuildS3BucketPropsBuilder_core buildS3BucketPropsBuilder_core = (BuildS3BucketPropsBuilder_core) theEObject;
			T result = caseBuildS3BucketPropsBuilder_core(buildS3BucketPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildS3BucketPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE: {
			BuildEncryptionKeyPropsBuilder_core buildEncryptionKeyPropsBuilder_core = (BuildEncryptionKeyPropsBuilder_core) theEObject;
			T result = caseBuildEncryptionKeyPropsBuilder_core(buildEncryptionKeyPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildEncryptionKeyPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE: {
			CognitoOptionsBuilder_core cognitoOptionsBuilder_core = (CognitoOptionsBuilder_core) theEObject;
			T result = caseCognitoOptionsBuilder_core(cognitoOptionsBuilder_core);
			if (result == null)
				result = caseServiceResources(cognitoOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE: {
			BuildKinesisStreamPropsBuilder_core buildKinesisStreamPropsBuilder_core = (BuildKinesisStreamPropsBuilder_core) theEObject;
			T result = caseBuildKinesisStreamPropsBuilder_core(buildKinesisStreamPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildKinesisStreamPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE: {
			BuildKinesisAnalyticsAppPropsBuilder_core buildKinesisAnalyticsAppPropsBuilder_core = (BuildKinesisAnalyticsAppPropsBuilder_core) theEObject;
			T result = caseBuildKinesisAnalyticsAppPropsBuilder_core(buildKinesisAnalyticsAppPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildKinesisAnalyticsAppPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE: {
			BuildLambdaFunctionPropsBuilder_core buildLambdaFunctionPropsBuilder_core = (BuildLambdaFunctionPropsBuilder_core) theEObject;
			T result = caseBuildLambdaFunctionPropsBuilder_core(buildLambdaFunctionPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildLambdaFunctionPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE: {
			BuildDynamoDBTablePropsBuilder_core buildDynamoDBTablePropsBuilder_core = (BuildDynamoDBTablePropsBuilder_core) theEObject;
			T result = caseBuildDynamoDBTablePropsBuilder_core(buildDynamoDBTablePropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildDynamoDBTablePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE: {
			BuildTopicPropsBuilder_core buildTopicPropsBuilder_core = (BuildTopicPropsBuilder_core) theEObject;
			T result = caseBuildTopicPropsBuilder_core(buildTopicPropsBuilder_core);
			if (result == null)
				result = caseServiceResources(buildTopicPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA: {
			DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda = (DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda) theEObject;
			T result = caseDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda(
					dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda);
			if (result == null)
				result = caseServiceResources(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA: {
			DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana = (DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana) theEObject;
			T result = caseDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana(
					dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana);
			if (result == null)
				result = caseServiceResources(
						dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENT_BUS_BUILDER_EVENTS: {
			EventBusBuilder_events eventBusBuilder_events = (EventBusBuilder_events) theEObject;
			T result = caseEventBusBuilder_events(eventBusBuilder_events);
			if (result == null)
				result = caseServiceResources(eventBusBuilder_events);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS: {
			EventPatternBuilder_events eventPatternBuilder_events = (EventPatternBuilder_events) theEObject;
			T result = caseEventPatternBuilder_events(eventPatternBuilder_events);
			if (result == null)
				result = caseServiceResources(eventPatternBuilder_events);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS: {
			RulePropsBuilder_events rulePropsBuilder_events = (RulePropsBuilder_events) theEObject;
			T result = caseRulePropsBuilder_events(rulePropsBuilder_events);
			if (result == null)
				result = caseServiceResources(rulePropsBuilder_events);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS: {
			CronOptionsBuilder_events cronOptionsBuilder_events = (CronOptionsBuilder_events) theEObject;
			T result = caseCronOptionsBuilder_events(cronOptionsBuilder_events);
			if (result == null)
				result = caseServiceResources(cronOptionsBuilder_events);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA: {
			EventsRuleToLambdaBuilder_eventsrulelambda eventsRuleToLambdaBuilder_eventsrulelambda = (EventsRuleToLambdaBuilder_eventsrulelambda) theEObject;
			T result = caseEventsRuleToLambdaBuilder_eventsrulelambda(eventsRuleToLambdaBuilder_eventsrulelambda);
			if (result == null)
				result = caseServiceResources(eventsRuleToLambdaBuilder_eventsrulelambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS: {
			StateMachinePropsBuilder_stepfunctions stateMachinePropsBuilder_stepfunctions = (StateMachinePropsBuilder_stepfunctions) theEObject;
			T result = caseStateMachinePropsBuilder_stepfunctions(stateMachinePropsBuilder_stepfunctions);
			if (result == null)
				result = caseServiceResources(stateMachinePropsBuilder_stepfunctions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION: {
			EventsRuleToStepFunctionBuilder_eventsrulestepfunction eventsRuleToStepFunctionBuilder_eventsrulestepfunction = (EventsRuleToStepFunctionBuilder_eventsrulestepfunction) theEObject;
			T result = caseEventsRuleToStepFunctionBuilder_eventsrulestepfunction(
					eventsRuleToStepFunctionBuilder_eventsrulestepfunction);
			if (result == null)
				result = caseServiceResources(eventsRuleToStepFunctionBuilder_eventsrulestepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3: {
			IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3 = (IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3) theEObject;
			T result = caseIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3(
					iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3);
			if (result == null)
				result = caseServiceResources(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA: {
			IotToLambdaBuilder_iotlambda iotToLambdaBuilder_iotlambda = (IotToLambdaBuilder_iotlambda) theEObject;
			T result = caseIotToLambdaBuilder_iotlambda(iotToLambdaBuilder_iotlambda);
			if (result == null)
				result = caseServiceResources(iotToLambdaBuilder_iotlambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB: {
			IotToLambdaToDynamoDBBuilder_iotlambdadynamodb iotToLambdaToDynamoDBBuilder_iotlambdadynamodb = (IotToLambdaToDynamoDBBuilder_iotlambdadynamodb) theEObject;
			T result = caseIotToLambdaToDynamoDBBuilder_iotlambdadynamodb(
					iotToLambdaToDynamoDBBuilder_iotlambdadynamodb);
			if (result == null)
				result = caseServiceResources(iotToLambdaToDynamoDBBuilder_iotlambdadynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3: {
			KinesisFirehoseToS3Builder_kinesisfirehoses3 kinesisFirehoseToS3Builder_kinesisfirehoses3 = (KinesisFirehoseToS3Builder_kinesisfirehoses3) theEObject;
			T result = caseKinesisFirehoseToS3Builder_kinesisfirehoses3(kinesisFirehoseToS3Builder_kinesisfirehoses3);
			if (result == null)
				result = caseServiceResources(kinesisFirehoseToS3Builder_kinesisfirehoses3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS: {
			KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics = (KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics) theEObject;
			T result = caseKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics(
					kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics);
			if (result == null)
				result = caseServiceResources(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA: {
			KinesisStreamsToLambdaBuilder_kinesisstreamslambda kinesisStreamsToLambdaBuilder_kinesisstreamslambda = (KinesisStreamsToLambdaBuilder_kinesisstreamslambda) theEObject;
			T result = caseKinesisStreamsToLambdaBuilder_kinesisstreamslambda(
					kinesisStreamsToLambdaBuilder_kinesisstreamslambda);
			if (result == null)
				result = caseServiceResources(kinesisStreamsToLambdaBuilder_kinesisstreamslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB: {
			TableBuilder_dynamodb tableBuilder_dynamodb = (TableBuilder_dynamodb) theEObject;
			T result = caseTableBuilder_dynamodb(tableBuilder_dynamodb);
			if (result == null)
				result = caseServiceResources(tableBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB: {
			LambdaToDynamoDBBuilder_lambdadynamodb lambdaToDynamoDBBuilder_lambdadynamodb = (LambdaToDynamoDBBuilder_lambdadynamodb) theEObject;
			T result = caseLambdaToDynamoDBBuilder_lambdadynamodb(lambdaToDynamoDBBuilder_lambdadynamodb);
			if (result == null)
				result = caseServiceResources(lambdaToDynamoDBBuilder_lambdadynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA: {
			LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana = (LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana) theEObject;
			T result = caseLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana(
					lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana);
			if (result == null)
				result = caseServiceResources(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_S3_BUILDER_LAMBDAS3: {
			LambdaToS3Builder_lambdas3 lambdaToS3Builder_lambdas3 = (LambdaToS3Builder_lambdas3) theEObject;
			T result = caseLambdaToS3Builder_lambdas3(lambdaToS3Builder_lambdas3);
			if (result == null)
				result = caseServiceResources(lambdaToS3Builder_lambdas3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS: {
			TopicPropsBuilder_sns topicPropsBuilder_sns = (TopicPropsBuilder_sns) theEObject;
			T result = caseTopicPropsBuilder_sns(topicPropsBuilder_sns);
			if (result == null)
				result = caseServiceResources(topicPropsBuilder_sns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS: {
			LambdaToSnsBuilder_lambdasns lambdaToSnsBuilder_lambdasns = (LambdaToSnsBuilder_lambdasns) theEObject;
			T result = caseLambdaToSnsBuilder_lambdasns(lambdaToSnsBuilder_lambdasns);
			if (result == null)
				result = caseServiceResources(lambdaToSnsBuilder_lambdasns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS: {
			LambdaToSqsBuilder_lambdasqs lambdaToSqsBuilder_lambdasqs = (LambdaToSqsBuilder_lambdasqs) theEObject;
			T result = caseLambdaToSqsBuilder_lambdasqs(lambdaToSqsBuilder_lambdasqs);
			if (result == null)
				result = caseServiceResources(lambdaToSqsBuilder_lambdasqs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION: {
			LambdaToStepFunctionBuilder_lambdastepfunction lambdaToStepFunctionBuilder_lambdastepfunction = (LambdaToStepFunctionBuilder_lambdastepfunction) theEObject;
			T result = caseLambdaToStepFunctionBuilder_lambdastepfunction(
					lambdaToStepFunctionBuilder_lambdastepfunction);
			if (result == null)
				result = caseServiceResources(lambdaToStepFunctionBuilder_lambdastepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA: {
			S3ToLambdaBuilder_s3lambda s3ToLambdaBuilder_s3lambda = (S3ToLambdaBuilder_s3lambda) theEObject;
			T result = caseS3ToLambdaBuilder_s3lambda(s3ToLambdaBuilder_s3lambda);
			if (result == null)
				result = caseServiceResources(s3ToLambdaBuilder_s3lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION: {
			S3ToStepFunctionBuilder_s3stepfunction s3ToStepFunctionBuilder_s3stepfunction = (S3ToStepFunctionBuilder_s3stepfunction) theEObject;
			T result = caseS3ToStepFunctionBuilder_s3stepfunction(s3ToStepFunctionBuilder_s3stepfunction);
			if (result == null)
				result = caseServiceResources(s3ToStepFunctionBuilder_s3stepfunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SNS_TO_LAMBDA_BUILDER_SNSLAMBDA: {
			SnsToLambdaBuilder_snslambda snsToLambdaBuilder_snslambda = (SnsToLambdaBuilder_snslambda) theEObject;
			T result = caseSnsToLambdaBuilder_snslambda(snsToLambdaBuilder_snslambda);
			if (result == null)
				result = caseServiceResources(snsToLambdaBuilder_snslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM: {
			ManagedPolicyBuilder_iam managedPolicyBuilder_iam = (ManagedPolicyBuilder_iam) theEObject;
			T result = caseManagedPolicyBuilder_iam(managedPolicyBuilder_iam);
			if (result == null)
				result = caseServiceResources(managedPolicyBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.USER_BUILDER_IAM: {
			UserBuilder_iam userBuilder_iam = (UserBuilder_iam) theEObject;
			T result = caseUserBuilder_iam(userBuilder_iam);
			if (result == null)
				result = caseServiceResources(userBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.GROUP_BUILDER_IAM: {
			GroupBuilder_iam groupBuilder_iam = (GroupBuilder_iam) theEObject;
			T result = caseGroupBuilder_iam(groupBuilder_iam);
			if (result == null)
				result = caseServiceResources(groupBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ROLE_BUILDER_IAM: {
			RoleBuilder_iam roleBuilder_iam = (RoleBuilder_iam) theEObject;
			T result = caseRoleBuilder_iam(roleBuilder_iam);
			if (result == null)
				result = caseServiceResources(roleBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM: {
			PolicyStatementBuilder_iam policyStatementBuilder_iam = (PolicyStatementBuilder_iam) theEObject;
			T result = casePolicyStatementBuilder_iam(policyStatementBuilder_iam);
			if (result == null)
				result = caseServiceResources(policyStatementBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM: {
			PolicyDocumentBuilder_iam policyDocumentBuilder_iam = (PolicyDocumentBuilder_iam) theEObject;
			T result = casePolicyDocumentBuilder_iam(policyDocumentBuilder_iam);
			if (result == null)
				result = caseServiceResources(policyDocumentBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA: {
			SqsToLambdaBuilder_sqslambda sqsToLambdaBuilder_sqslambda = (SqsToLambdaBuilder_sqslambda) theEObject;
			T result = caseSqsToLambdaBuilder_sqslambda(sqsToLambdaBuilder_sqslambda);
			if (result == null)
				result = caseServiceResources(sqsToLambdaBuilder_sqslambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ATTRIBUTE_BUILDER_DYNAMODB: {
			AttributeBuilder_dynamodb attributeBuilder_dynamodb = (AttributeBuilder_dynamodb) theEObject;
			T result = caseAttributeBuilder_dynamodb(attributeBuilder_dynamodb);
			if (result == null)
				result = caseServiceResources(attributeBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.TABLE_PROPS_BUILDER_DYNAMODB: {
			TablePropsBuilder_dynamodb tablePropsBuilder_dynamodb = (TablePropsBuilder_dynamodb) theEObject;
			T result = caseTablePropsBuilder_dynamodb(tablePropsBuilder_dynamodb);
			if (result == null)
				result = caseServiceResources(tablePropsBuilder_dynamodb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY: {
			PrivateDnsNamespaceBuilder_servicediscovery privateDnsNamespaceBuilder_servicediscovery = (PrivateDnsNamespaceBuilder_servicediscovery) theEObject;
			T result = casePrivateDnsNamespaceBuilder_servicediscovery(privateDnsNamespaceBuilder_servicediscovery);
			if (result == null)
				result = caseServiceResources(privateDnsNamespaceBuilder_servicediscovery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.PUBLIC_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY: {
			PublicDnsNamespaceBuilder_servicediscovery publicDnsNamespaceBuilder_servicediscovery = (PublicDnsNamespaceBuilder_servicediscovery) theEObject;
			T result = casePublicDnsNamespaceBuilder_servicediscovery(publicDnsNamespaceBuilder_servicediscovery);
			if (result == null)
				result = caseServiceResources(publicDnsNamespaceBuilder_servicediscovery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY: {
			HttpNamespaceBuilder_servicediscovery httpNamespaceBuilder_servicediscovery = (HttpNamespaceBuilder_servicediscovery) theEObject;
			T result = caseHttpNamespaceBuilder_servicediscovery(httpNamespaceBuilder_servicediscovery);
			if (result == null)
				result = caseServiceResources(httpNamespaceBuilder_servicediscovery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS: {
			CloudMapOptionsBuilder_ecs cloudMapOptionsBuilder_ecs = (CloudMapOptionsBuilder_ecs) theEObject;
			T result = caseCloudMapOptionsBuilder_ecs(cloudMapOptionsBuilder_ecs);
			if (result == null)
				result = caseServiceResources(cloudMapOptionsBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING: {
			BlockDeviceBuilder_autoscaling blockDeviceBuilder_autoscaling = (BlockDeviceBuilder_autoscaling) theEObject;
			T result = caseBlockDeviceBuilder_autoscaling(blockDeviceBuilder_autoscaling);
			if (result == null)
				result = caseServiceResources(blockDeviceBuilder_autoscaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS: {
			HealthCheckBuilder_ecs healthCheckBuilder_ecs = (HealthCheckBuilder_ecs) theEObject;
			T result = caseHealthCheckBuilder_ecs(healthCheckBuilder_ecs);
			if (result == null)
				result = caseServiceResources(healthCheckBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2: {
			AmazonLinuxImageBuilder_ec2 amazonLinuxImageBuilder_ec2 = (AmazonLinuxImageBuilder_ec2) theEObject;
			T result = caseAmazonLinuxImageBuilder_ec2(amazonLinuxImageBuilder_ec2);
			if (result == null)
				result = caseServiceResources(amazonLinuxImageBuilder_ec2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING: {
			RollingUpdateConfigurationBuilder_autoscaling rollingUpdateConfigurationBuilder_autoscaling = (RollingUpdateConfigurationBuilder_autoscaling) theEObject;
			T result = caseRollingUpdateConfigurationBuilder_autoscaling(rollingUpdateConfigurationBuilder_autoscaling);
			if (result == null)
				result = caseServiceResources(rollingUpdateConfigurationBuilder_autoscaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS: {
			AddCapacityOptionsBuilder_ecs addCapacityOptionsBuilder_ecs = (AddCapacityOptionsBuilder_ecs) theEObject;
			T result = caseAddCapacityOptionsBuilder_ecs(addCapacityOptionsBuilder_ecs);
			if (result == null)
				result = caseServiceResources(addCapacityOptionsBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLOUD_MAP_NAMESPACE_OPTIONS_BUILDER_ECS: {
			CloudMapNamespaceOptionsBuilder_ecs cloudMapNamespaceOptionsBuilder_ecs = (CloudMapNamespaceOptionsBuilder_ecs) theEObject;
			T result = caseCloudMapNamespaceOptionsBuilder_ecs(cloudMapNamespaceOptionsBuilder_ecs);
			if (result == null)
				result = caseServiceResources(cloudMapNamespaceOptionsBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS: {
			ClusterBuilder_ecs clusterBuilder_ecs = (ClusterBuilder_ecs) theEObject;
			T result = caseClusterBuilder_ecs(clusterBuilder_ecs);
			if (result == null)
				result = caseServiceResources(clusterBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2: {
			ApplicationLoadBalancerBuilder_elasticloadbalancingv2 applicationLoadBalancerBuilder_elasticloadbalancingv2 = (ApplicationLoadBalancerBuilder_elasticloadbalancingv2) theEObject;
			T result = caseApplicationLoadBalancerBuilder_elasticloadbalancingv2(
					applicationLoadBalancerBuilder_elasticloadbalancingv2);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancerBuilder_elasticloadbalancingv2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS: {
			DockerImageAssetBuilder_assets dockerImageAssetBuilder_assets = (DockerImageAssetBuilder_assets) theEObject;
			T result = caseDockerImageAssetBuilder_assets(dockerImageAssetBuilder_assets);
			if (result == null)
				result = caseServiceResources(dockerImageAssetBuilder_assets);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS: {
			AssetImageBuilder_ecs assetImageBuilder_ecs = (AssetImageBuilder_ecs) theEObject;
			T result = caseAssetImageBuilder_ecs(assetImageBuilder_ecs);
			if (result == null)
				result = caseServiceResources(assetImageBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER: {
			SecretStringGeneratorBuilder_secretsmanager secretStringGeneratorBuilder_secretsmanager = (SecretStringGeneratorBuilder_secretsmanager) theEObject;
			T result = caseSecretStringGeneratorBuilder_secretsmanager(secretStringGeneratorBuilder_secretsmanager);
			if (result == null)
				result = caseServiceResources(secretStringGeneratorBuilder_secretsmanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER: {
			SecretBuilder_secretsmanager secretBuilder_secretsmanager = (SecretBuilder_secretsmanager) theEObject;
			T result = caseSecretBuilder_secretsmanager(secretBuilder_secretsmanager);
			if (result == null)
				result = caseServiceResources(secretBuilder_secretsmanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS: {
			AwsLogDriverBuilder_ecs awsLogDriverBuilder_ecs = (AwsLogDriverBuilder_ecs) theEObject;
			T result = caseAwsLogDriverBuilder_ecs(awsLogDriverBuilder_ecs);
			if (result == null)
				result = caseServiceResources(awsLogDriverBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS: {
			LogGroupBuilder_logs logGroupBuilder_logs = (LogGroupBuilder_logs) theEObject;
			T result = caseLogGroupBuilder_logs(logGroupBuilder_logs);
			if (result == null)
				result = caseServiceResources(logGroupBuilder_logs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.AWS_LOG_DRIVER_PROPS_BUILDER_ECS: {
			AwsLogDriverPropsBuilder_ecs awsLogDriverPropsBuilder_ecs = (AwsLogDriverPropsBuilder_ecs) theEObject;
			T result = caseAwsLogDriverPropsBuilder_ecs(awsLogDriverPropsBuilder_ecs);
			if (result == null)
				result = caseServiceResources(awsLogDriverPropsBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS: {
			ApplicationLoadBalancedTaskImageOptionsBuilder_patterns applicationLoadBalancedTaskImageOptionsBuilder_patterns = (ApplicationLoadBalancedTaskImageOptionsBuilder_patterns) theEObject;
			T result = caseApplicationLoadBalancedTaskImageOptionsBuilder_patterns(
					applicationLoadBalancedTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancedTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS: {
			AppMeshProxyConfigurationPropsBuilder_ecs appMeshProxyConfigurationPropsBuilder_ecs = (AppMeshProxyConfigurationPropsBuilder_ecs) theEObject;
			T result = caseAppMeshProxyConfigurationPropsBuilder_ecs(appMeshProxyConfigurationPropsBuilder_ecs);
			if (result == null)
				result = caseServiceResources(appMeshProxyConfigurationPropsBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS: {
			AppMeshProxyConfigurationBuilder_ecs appMeshProxyConfigurationBuilder_ecs = (AppMeshProxyConfigurationBuilder_ecs) theEObject;
			T result = caseAppMeshProxyConfigurationBuilder_ecs(appMeshProxyConfigurationBuilder_ecs);
			if (result == null)
				result = caseServiceResources(appMeshProxyConfigurationBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.HOST_BUILDER_ECS: {
			HostBuilder_ecs hostBuilder_ecs = (HostBuilder_ecs) theEObject;
			T result = caseHostBuilder_ecs(hostBuilder_ecs);
			if (result == null)
				result = caseServiceResources(hostBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS: {
			DockerVolumeConfigurationBuilder_ecs dockerVolumeConfigurationBuilder_ecs = (DockerVolumeConfigurationBuilder_ecs) theEObject;
			T result = caseDockerVolumeConfigurationBuilder_ecs(dockerVolumeConfigurationBuilder_ecs);
			if (result == null)
				result = caseServiceResources(dockerVolumeConfigurationBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS: {
			VolumeBuilder_ecs volumeBuilder_ecs = (VolumeBuilder_ecs) theEObject;
			T result = caseVolumeBuilder_ecs(volumeBuilder_ecs);
			if (result == null)
				result = caseServiceResources(volumeBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.EC2_TASK_DEFINITION_BUILDER_ECS: {
			Ec2TaskDefinitionBuilder_ecs ec2TaskDefinitionBuilder_ecs = (Ec2TaskDefinitionBuilder_ecs) theEObject;
			T result = caseEc2TaskDefinitionBuilder_ecs(ec2TaskDefinitionBuilder_ecs);
			if (result == null)
				result = caseServiceResources(ec2TaskDefinitionBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS: {
			ApplicationLoadBalancedEc2ServiceBuilder_patterns applicationLoadBalancedEc2ServiceBuilder_patterns = (ApplicationLoadBalancedEc2ServiceBuilder_patterns) theEObject;
			T result = caseApplicationLoadBalancedEc2ServiceBuilder_patterns(
					applicationLoadBalancedEc2ServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancedEc2ServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS: {
			FargateTaskDefinitionBuilder_ecs fargateTaskDefinitionBuilder_ecs = (FargateTaskDefinitionBuilder_ecs) theEObject;
			T result = caseFargateTaskDefinitionBuilder_ecs(fargateTaskDefinitionBuilder_ecs);
			if (result == null)
				result = caseServiceResources(fargateTaskDefinitionBuilder_ecs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_FARGATE_SERVICE_BUILDER_PATTERNS: {
			ApplicationLoadBalancedFargateServiceBuilder_patterns applicationLoadBalancedFargateServiceBuilder_patterns = (ApplicationLoadBalancedFargateServiceBuilder_patterns) theEObject;
			T result = caseApplicationLoadBalancedFargateServiceBuilder_patterns(
					applicationLoadBalancedFargateServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancedFargateServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS: {
			ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns applicationMultipleTargetGroupsFargateServiceBuilder_patterns = (ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns) theEObject;
			T result = caseApplicationMultipleTargetGroupsFargateServiceBuilder_patterns(
					applicationMultipleTargetGroupsFargateServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationMultipleTargetGroupsFargateServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LISTENER_PROPS_BUILDER_PATTERNS: {
			ApplicationListenerPropsBuilder_patterns applicationListenerPropsBuilder_patterns = (ApplicationListenerPropsBuilder_patterns) theEObject;
			T result = caseApplicationListenerPropsBuilder_patterns(applicationListenerPropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationListenerPropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS: {
			ApplicationLoadBalancerPropsBuilder_patterns applicationLoadBalancerPropsBuilder_patterns = (ApplicationLoadBalancerPropsBuilder_patterns) theEObject;
			T result = caseApplicationLoadBalancerPropsBuilder_patterns(applicationLoadBalancerPropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancerPropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS: {
			ApplicationTargetPropsBuilder_patterns applicationTargetPropsBuilder_patterns = (ApplicationTargetPropsBuilder_patterns) theEObject;
			T result = caseApplicationTargetPropsBuilder_patterns(applicationTargetPropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationTargetPropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS: {
			ApplicationLoadBalancedTaskImagePropsBuilder_patterns applicationLoadBalancedTaskImagePropsBuilder_patterns = (ApplicationLoadBalancedTaskImagePropsBuilder_patterns) theEObject;
			T result = caseApplicationLoadBalancedTaskImagePropsBuilder_patterns(
					applicationLoadBalancedTaskImagePropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationLoadBalancedTaskImagePropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.APPLICATION_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS: {
			ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns applicationMultipleTargetGroupsEc2ServiceBuilder_patterns = (ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns) theEObject;
			T result = caseApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns(
					applicationMultipleTargetGroupsEc2ServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(applicationMultipleTargetGroupsEc2ServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS: {
			NetworkLoadBalancedTaskImageOptionsBuilder_patterns networkLoadBalancedTaskImageOptionsBuilder_patterns = (NetworkLoadBalancedTaskImageOptionsBuilder_patterns) theEObject;
			T result = caseNetworkLoadBalancedTaskImageOptionsBuilder_patterns(
					networkLoadBalancedTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkLoadBalancedTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_FARGATE_SERVICE_BUILDER_PATTERNS: {
			NetworkLoadBalancedFargateServiceBuilder_patterns networkLoadBalancedFargateServiceBuilder_patterns = (NetworkLoadBalancedFargateServiceBuilder_patterns) theEObject;
			T result = caseNetworkLoadBalancedFargateServiceBuilder_patterns(
					networkLoadBalancedFargateServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkLoadBalancedFargateServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_EC2_SERVICE_BUILDER_PATTERNS: {
			NetworkLoadBalancedEc2ServiceBuilder_patterns networkLoadBalancedEc2ServiceBuilder_patterns = (NetworkLoadBalancedEc2ServiceBuilder_patterns) theEObject;
			T result = caseNetworkLoadBalancedEc2ServiceBuilder_patterns(networkLoadBalancedEc2ServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkLoadBalancedEc2ServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_EC2_SERVICE_BUILDER_PATTERNS: {
			NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns networkMultipleTargetGroupsEc2ServiceBuilder_patterns = (NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns) theEObject;
			T result = caseNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns(
					networkMultipleTargetGroupsEc2ServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkMultipleTargetGroupsEc2ServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_TARGET_PROPS_BUILDER_PATTERNS: {
			NetworkTargetPropsBuilder_patterns networkTargetPropsBuilder_patterns = (NetworkTargetPropsBuilder_patterns) theEObject;
			T result = caseNetworkTargetPropsBuilder_patterns(networkTargetPropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkTargetPropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS: {
			NetworkLoadBalancedTaskImagePropsBuilder_patterns networkLoadBalancedTaskImagePropsBuilder_patterns = (NetworkLoadBalancedTaskImagePropsBuilder_patterns) theEObject;
			T result = caseNetworkLoadBalancedTaskImagePropsBuilder_patterns(
					networkLoadBalancedTaskImagePropsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkLoadBalancedTaskImagePropsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS: {
			NetworkMultipleTargetGroupsFargateServiceBuilder_patterns networkMultipleTargetGroupsFargateServiceBuilder_patterns = (NetworkMultipleTargetGroupsFargateServiceBuilder_patterns) theEObject;
			T result = caseNetworkMultipleTargetGroupsFargateServiceBuilder_patterns(
					networkMultipleTargetGroupsFargateServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(networkMultipleTargetGroupsFargateServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING: {
			ScalingIntervalBuilder_applicationautoscaling scalingIntervalBuilder_applicationautoscaling = (ScalingIntervalBuilder_applicationautoscaling) theEObject;
			T result = caseScalingIntervalBuilder_applicationautoscaling(scalingIntervalBuilder_applicationautoscaling);
			if (result == null)
				result = caseServiceResources(scalingIntervalBuilder_applicationautoscaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS: {
			QueueProcessingFargateServiceBuilder_patterns queueProcessingFargateServiceBuilder_patterns = (QueueProcessingFargateServiceBuilder_patterns) theEObject;
			T result = caseQueueProcessingFargateServiceBuilder_patterns(queueProcessingFargateServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(queueProcessingFargateServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_APPLICATIONAUTOSCALING: {
			CronOptionsBuilder_applicationautoscaling cronOptionsBuilder_applicationautoscaling = (CronOptionsBuilder_applicationautoscaling) theEObject;
			T result = caseCronOptionsBuilder_applicationautoscaling(cronOptionsBuilder_applicationautoscaling);
			if (result == null)
				result = caseServiceResources(cronOptionsBuilder_applicationautoscaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS: {
			ScheduledEc2TaskDefinitionOptionsBuilder_patterns scheduledEc2TaskDefinitionOptionsBuilder_patterns = (ScheduledEc2TaskDefinitionOptionsBuilder_patterns) theEObject;
			T result = caseScheduledEc2TaskDefinitionOptionsBuilder_patterns(
					scheduledEc2TaskDefinitionOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledEc2TaskDefinitionOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS: {
			ScheduledEc2TaskImageOptionsBuilder_patterns scheduledEc2TaskImageOptionsBuilder_patterns = (ScheduledEc2TaskImageOptionsBuilder_patterns) theEObject;
			T result = caseScheduledEc2TaskImageOptionsBuilder_patterns(scheduledEc2TaskImageOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledEc2TaskImageOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_BUILDER_PATTERNS: {
			ScheduledEc2TaskBuilder_patterns scheduledEc2TaskBuilder_patterns = (ScheduledEc2TaskBuilder_patterns) theEObject;
			T result = caseScheduledEc2TaskBuilder_patterns(scheduledEc2TaskBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledEc2TaskBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.QUEUE_PROCESSING_EC2_SERVICE_BUILDER_PATTERNS: {
			QueueProcessingEc2ServiceBuilder_patterns queueProcessingEc2ServiceBuilder_patterns = (QueueProcessingEc2ServiceBuilder_patterns) theEObject;
			T result = caseQueueProcessingEc2ServiceBuilder_patterns(queueProcessingEc2ServiceBuilder_patterns);
			if (result == null)
				result = caseServiceResources(queueProcessingEc2ServiceBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS: {
			ScheduledFargateTaskDefinitionOptionsBuilder_patterns scheduledFargateTaskDefinitionOptionsBuilder_patterns = (ScheduledFargateTaskDefinitionOptionsBuilder_patterns) theEObject;
			T result = caseScheduledFargateTaskDefinitionOptionsBuilder_patterns(
					scheduledFargateTaskDefinitionOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledFargateTaskDefinitionOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_BUILDER_PATTERNS: {
			ScheduledFargateTaskImageOptionsBuilder_patterns scheduledFargateTaskImageOptionsBuilder_patterns = (ScheduledFargateTaskImageOptionsBuilder_patterns) theEObject;
			T result = caseScheduledFargateTaskImageOptionsBuilder_patterns(
					scheduledFargateTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledFargateTaskImageOptionsBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS: {
			ScheduledFargateTaskBuilder_patterns scheduledFargateTaskBuilder_patterns = (ScheduledFargateTaskBuilder_patterns) theEObject;
			T result = caseScheduledFargateTaskBuilder_patterns(scheduledFargateTaskBuilder_patterns);
			if (result == null)
				result = caseServiceResources(scheduledFargateTaskBuilder_patterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AwsworkbenchPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
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
	 * Returns the result of interpreting the object as an instance of '<em>Function Props Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Props Builder lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPropsBuilder_lambda(FunctionPropsBuilder_lambda object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Queue Props Builder sqs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Props Builder sqs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuePropsBuilder_sqs(QueuePropsBuilder_sqs object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Version Builder lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Builder lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionBuilder_lambda(VersionBuilder_lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Function Association Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Function Association Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaFunctionAssociationBuilder_cloudfront(LambdaFunctionAssociationBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorBuilder_cloudfront(BehaviorBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Origin Config Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Origin Config Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomOriginConfigBuilder_cloudfront(CustomOriginConfigBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Public Access Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Public Access Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockPublicAccessBuilder_s3(BlockPublicAccessBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cors Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cors Rule Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorsRuleBuilder_s3(CorsRuleBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noncurrent Version Transition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noncurrent Version Transition Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoncurrentVersionTransitionBuilder_s3(NoncurrentVersionTransitionBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionBuilder_s3(TransitionBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Rule Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleRuleBuilder_s3(LifecycleRuleBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket Metrics Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket Metrics Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucketMetricsBuilder_s3(BucketMetricsBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redirect Target Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redirect Target Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedirectTargetBuilder_s3(RedirectTargetBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Rule Condition Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Rule Condition Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingRuleConditionBuilder_s3(RoutingRuleConditionBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Rule Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Rule Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingRuleBuilder_s3(RoutingRuleBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucketBuilder_s3(BucketBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket Props Builder s3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket Props Builder s3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucketPropsBuilder_s3(BucketPropsBuilder_s3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin Access Identity Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin Access Identity Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginAccessIdentityBuilder_cloudfront(OriginAccessIdentityBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>S3 Origin Config Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>S3 Origin Config Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS3OriginConfigBuilder_cloudfront(S3OriginConfigBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Configuration Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceConfigurationBuilder_cloudfront(SourceConfigurationBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Configuration Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasConfigurationBuilder_cloudfront(AliasConfigurationBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logging Configuration Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logging Configuration Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoggingConfigurationBuilder_cloudfront(LoggingConfigurationBuilder_cloudfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Front Web Distribution Props Builder cloudfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Front Web Distribution Props Builder cloudfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudFrontWebDistributionPropsBuilder_cloudfront(
			CloudFrontWebDistributionPropsBuilder_cloudfront object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Auto Verified Attrs Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Verified Attrs Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoVerifiedAttrsBuilder_cognito(AutoVerifiedAttrsBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Pool Triggers Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Pool Triggers Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPoolTriggersBuilder_cognito(UserPoolTriggersBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Settings Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Settings Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailSettingsBuilder_cognito(EmailSettingsBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Policy Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Policy Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordPolicyBuilder_cognito(PasswordPolicyBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mfa Second Factor Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mfa Second Factor Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMfaSecondFactorBuilder_cognito(MfaSecondFactorBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Attributes Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Attributes Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredAttributesBuilder_cognito(RequiredAttributesBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sign In Aliases Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sign In Aliases Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignInAliasesBuilder_cognito(SignInAliasesBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Invitation Config Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Invitation Config Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInvitationConfigBuilder_cognito(UserInvitationConfigBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Verification Config Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Verification Config Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserVerificationConfigBuilder_cognito(UserVerificationConfigBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Pool Props Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Pool Props Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPoolPropsBuilder_cognito(UserPoolPropsBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Pool Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Pool Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPoolBuilder_cognito(UserPoolBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auth Flow Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auth Flow Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthFlowBuilder_cognito(AuthFlowBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth Flows Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth Flows Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuthFlowsBuilder_cognito(OAuthFlowsBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth Settings Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth Settings Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuthSettingsBuilder_cognito(OAuthSettingsBuilder_cognito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Pool Client Props Builder cognito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Pool Client Props Builder cognito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPoolClientPropsBuilder_cognito(UserPoolClientPropsBuilder_cognito object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Bus Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Bus Builder events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBusBuilder_events(EventBusBuilder_events object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern Builder events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPatternBuilder_events(EventPatternBuilder_events object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Props Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Props Builder events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulePropsBuilder_events(RulePropsBuilder_events object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cron Options Builder events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cron Options Builder events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCronOptionsBuilder_events(CronOptionsBuilder_events object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Props Builder stepfunctions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Props Builder stepfunctions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachinePropsBuilder_stepfunctions(StateMachinePropsBuilder_stepfunctions object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table Builder dynamodb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Builder dynamodb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBuilder_dynamodb(TableBuilder_dynamodb object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Topic Props Builder sns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Props Builder sns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicPropsBuilder_sns(TopicPropsBuilder_sns object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Private Dns Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Dns Namespace Builder servicediscovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateDnsNamespaceBuilder_servicediscovery(PrivateDnsNamespaceBuilder_servicediscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Dns Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Dns Namespace Builder servicediscovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicDnsNamespaceBuilder_servicediscovery(PublicDnsNamespaceBuilder_servicediscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Namespace Builder servicediscovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Namespace Builder servicediscovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpNamespaceBuilder_servicediscovery(HttpNamespaceBuilder_servicediscovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Map Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Map Options Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudMapOptionsBuilder_ecs(CloudMapOptionsBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Device Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Device Builder autoscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockDeviceBuilder_autoscaling(BlockDeviceBuilder_autoscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Check Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Check Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthCheckBuilder_ecs(HealthCheckBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Linux Image Builder ec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Linux Image Builder ec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonLinuxImageBuilder_ec2(AmazonLinuxImageBuilder_ec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rolling Update Configuration Builder autoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rolling Update Configuration Builder autoscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollingUpdateConfigurationBuilder_autoscaling(RollingUpdateConfigurationBuilder_autoscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Capacity Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Capacity Options Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCapacityOptionsBuilder_ecs(AddCapacityOptionsBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Map Namespace Options Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Map Namespace Options Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudMapNamespaceOptionsBuilder_ecs(CloudMapNamespaceOptionsBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterBuilder_ecs(ClusterBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balancer Builder elasticloadbalancingv2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balancer Builder elasticloadbalancingv2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancerBuilder_elasticloadbalancingv2(
			ApplicationLoadBalancerBuilder_elasticloadbalancingv2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Image Asset Builder assets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Image Asset Builder assets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerImageAssetBuilder_assets(DockerImageAssetBuilder_assets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Image Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Image Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetImageBuilder_ecs(AssetImageBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret String Generator Builder secretsmanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret String Generator Builder secretsmanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretStringGeneratorBuilder_secretsmanager(SecretStringGeneratorBuilder_secretsmanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret Builder secretsmanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret Builder secretsmanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretBuilder_secretsmanager(SecretBuilder_secretsmanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aws Log Driver Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aws Log Driver Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwsLogDriverBuilder_ecs(AwsLogDriverBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Group Builder logs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Group Builder logs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogGroupBuilder_logs(LogGroupBuilder_logs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aws Log Driver Props Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aws Log Driver Props Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwsLogDriverPropsBuilder_ecs(AwsLogDriverPropsBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balanced Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balanced Task Image Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancedTaskImageOptionsBuilder_patterns(
			ApplicationLoadBalancedTaskImageOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Mesh Proxy Configuration Props Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Mesh Proxy Configuration Props Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppMeshProxyConfigurationPropsBuilder_ecs(AppMeshProxyConfigurationPropsBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Mesh Proxy Configuration Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Mesh Proxy Configuration Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppMeshProxyConfigurationBuilder_ecs(AppMeshProxyConfigurationBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostBuilder_ecs(HostBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Volume Configuration Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Volume Configuration Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerVolumeConfigurationBuilder_ecs(DockerVolumeConfigurationBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeBuilder_ecs(VolumeBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ec2 Task Definition Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ec2 Task Definition Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEc2TaskDefinitionBuilder_ecs(Ec2TaskDefinitionBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balanced Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balanced Ec2 Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancedEc2ServiceBuilder_patterns(
			ApplicationLoadBalancedEc2ServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fargate Task Definition Builder ecs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fargate Task Definition Builder ecs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFargateTaskDefinitionBuilder_ecs(FargateTaskDefinitionBuilder_ecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balanced Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balanced Fargate Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancedFargateServiceBuilder_patterns(
			ApplicationLoadBalancedFargateServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationMultipleTargetGroupsFargateServiceBuilder_patterns(
			ApplicationMultipleTargetGroupsFargateServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Listener Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Listener Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationListenerPropsBuilder_patterns(ApplicationListenerPropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balancer Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balancer Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancerPropsBuilder_patterns(ApplicationLoadBalancerPropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Target Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Target Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTargetPropsBuilder_patterns(ApplicationTargetPropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Load Balanced Task Image Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Load Balanced Task Image Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLoadBalancedTaskImagePropsBuilder_patterns(
			ApplicationLoadBalancedTaskImagePropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns(
			ApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Load Balanced Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Load Balanced Task Image Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLoadBalancedTaskImageOptionsBuilder_patterns(
			NetworkLoadBalancedTaskImageOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Load Balanced Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Load Balanced Fargate Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLoadBalancedFargateServiceBuilder_patterns(
			NetworkLoadBalancedFargateServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Load Balanced Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Load Balanced Ec2 Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLoadBalancedEc2ServiceBuilder_patterns(NetworkLoadBalancedEc2ServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Multiple Target Groups Ec2 Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns(
			NetworkMultipleTargetGroupsEc2ServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Target Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Target Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkTargetPropsBuilder_patterns(NetworkTargetPropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Load Balanced Task Image Props Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Load Balanced Task Image Props Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLoadBalancedTaskImagePropsBuilder_patterns(
			NetworkLoadBalancedTaskImagePropsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Multiple Target Groups Fargate Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkMultipleTargetGroupsFargateServiceBuilder_patterns(
			NetworkMultipleTargetGroupsFargateServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Interval Builder applicationautoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Interval Builder applicationautoscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingIntervalBuilder_applicationautoscaling(ScalingIntervalBuilder_applicationautoscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Processing Fargate Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Processing Fargate Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueProcessingFargateServiceBuilder_patterns(QueueProcessingFargateServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cron Options Builder applicationautoscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cron Options Builder applicationautoscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCronOptionsBuilder_applicationautoscaling(CronOptionsBuilder_applicationautoscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Definition Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Definition Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledEc2TaskDefinitionOptionsBuilder_patterns(
			ScheduledEc2TaskDefinitionOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Image Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledEc2TaskImageOptionsBuilder_patterns(ScheduledEc2TaskImageOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Ec2 Task Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledEc2TaskBuilder_patterns(ScheduledEc2TaskBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Processing Ec2 Service Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Processing Ec2 Service Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueProcessingEc2ServiceBuilder_patterns(QueueProcessingEc2ServiceBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Definition Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Definition Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledFargateTaskDefinitionOptionsBuilder_patterns(
			ScheduledFargateTaskDefinitionOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Image Options Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Image Options Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledFargateTaskImageOptionsBuilder_patterns(
			ScheduledFargateTaskImageOptionsBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Builder patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Fargate Task Builder patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledFargateTaskBuilder_patterns(ScheduledFargateTaskBuilder_patterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
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
