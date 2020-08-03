/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb;
import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToLambdaBuilder_apigatewaylambda;
import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs;
import com.amazon.aws.workbench.model.awsworkbench.ApiKeySourceType;
import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AttributeBuilder_dynamodb;
import com.amazon.aws.workbench.model.awsworkbench.AttributeType;
import com.amazon.aws.workbench.model.awsworkbench.AuthorizationType;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BillingMode;
import com.amazon.aws.workbench.model.awsworkbench.BuildDeadLetterQueuePropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildDynamoDBTablePropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildEncryptionKeyPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildKinesisStreamPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildLambdaFunctionPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildQueuePropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildS3BucketPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.BuildTopicPropsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.CertificateBuilder_certificatemanager;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayBuilder_cloudfrontapigateway;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3;
import com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda;
import com.amazon.aws.workbench.model.awsworkbench.ConnectionType;
import com.amazon.aws.workbench.model.awsworkbench.ContentHandling;
import com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs;
import com.amazon.aws.workbench.model.awsworkbench.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.DnsValidatedCertificateBuilder_certificatemanager;
import com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda;
import com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana;
import com.amazon.aws.workbench.model.awsworkbench.Effect;
import com.amazon.aws.workbench.model.awsworkbench.EndpointConfigurationBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.EndpointType;
import com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda;
import com.amazon.aws.workbench.model.awsworkbench.EventsRuleToStepFunctionBuilder_eventsrulestepfunction;
import com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.FlowLogTrafficType;
import com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda;
import com.amazon.aws.workbench.model.awsworkbench.GatewayVpcEndpointBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.GroupBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationType;
import com.amazon.aws.workbench.model.awsworkbench.IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3;
import com.amazon.aws.workbench.model.awsworkbench.IotToLambdaBuilder_iotlambda;
import com.amazon.aws.workbench.model.awsworkbench.IotToLambdaToDynamoDBBuilder_iotlambdadynamodb;
import com.amazon.aws.workbench.model.awsworkbench.JsonSchemaBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.JsonSchemaType;
import com.amazon.aws.workbench.model.awsworkbench.JsonSchemaVersion;
import com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms;
import com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics;
import com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToS3Builder_kinesisfirehoses3;
import com.amazon.aws.workbench.model.awsworkbench.KinesisStreamsToLambdaBuilder_kinesisstreamslambda;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToS3Builder_lambdas3;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToStepFunctionBuilder_lambdastepfunction;
import com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda;
import com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.MethodLoggingLevel;
import com.amazon.aws.workbench.model.awsworkbench.MethodOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.MethodResponseBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.ModelBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2;
import com.amazon.aws.workbench.model.awsworkbench.PassthroughBehavior;
import com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.QueueBuilder_sqs;
import com.amazon.aws.workbench.model.awsworkbench.QueueEncryption;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;
import com.amazon.aws.workbench.model.awsworkbench.RequestAuthorizerBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.RequestValidatorOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.RestApiPropsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.RetentionDays;
import com.amazon.aws.workbench.model.awsworkbench.RoleBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.S3ToLambdaBuilder_s3lambda;
import com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction;
import com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SecurityPolicy;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.SnsToLambdaBuilder_snslambda;
import com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.StageOptionsBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.StreamViewType;
import com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.SubnetType;
import com.amazon.aws.workbench.model.awsworkbench.TableEncryption;
import com.amazon.aws.workbench.model.awsworkbench.TablePropsBuilder_dynamodb;
import com.amazon.aws.workbench.model.awsworkbench.TokenAuthorizerBuilder_apigateway;
import com.amazon.aws.workbench.model.awsworkbench.Tracing;
import com.amazon.aws.workbench.model.awsworkbench.UserBuilder_iam;
import com.amazon.aws.workbench.model.awsworkbench.ValidationMethod;
import com.amazon.aws.workbench.model.awsworkbench.VersionOptionsBuilder_lambda;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.VpcLinkBuilder_apigateway;

import core.CorePackage;

import core.impl.CorePackageImpl;

import dynamodb.DynamodbPackage;

import dynamodb.impl.DynamodbPackageImpl;

import ec2.Ec2Package;

import ec2.impl.Ec2PackageImpl;

import iam.IamPackage;

import iam.impl.IamPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsworkbenchPackageImpl extends EPackageImpl implements AwsworkbenchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultStackSynthesizerBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLogOptionsBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetSelectionBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayVpcEndpointBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeploymentOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointConfigurationBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostedZoneBuilder_route53EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsValidatedCertificateBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationResponseBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateBuilder_certificatemanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainNameOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLoadBalancerBuilder_elasticloadbalancingv2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcLinkBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corsOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyBuilder_kmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadLetterQueueBuilder_sqsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueBuilder_sqsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionOptionsBuilder_lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerVersionBuilder_lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupBuilder_ec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBuilder_lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAuthorizerBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAuthorizerBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonSchemaBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestValidatorOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestValidatorBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodResponseBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restApiPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiGatewayToLambdaBuilder_apigatewaylambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiGatewayToSqsBuilder_apigatewaysqsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudFrontToS3Builder_cloudfronts3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildDeadLetterQueuePropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildQueuePropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildS3BucketPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildEncryptionKeyPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitoOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildKinesisStreamPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildKinesisAnalyticsAppPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildLambdaFunctionPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildDynamoDBTablePropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildTopicPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventsRuleToLambdaBuilder_eventsrulelambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iotToLambdaBuilder_iotlambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinesisFirehoseToS3Builder_kinesisfirehoses3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToDynamoDBBuilder_lambdadynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToS3Builder_lambdas3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToSnsBuilder_lambdasnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToSqsBuilder_lambdasqsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaToStepFunctionBuilder_lambdastepfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s3ToLambdaBuilder_s3lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s3ToStepFunctionBuilder_s3stepfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snsToLambdaBuilder_snslambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedPolicyBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyStatementBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDocumentBuilder_iamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqsToLambdaBuilder_sqslambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablePropsBuilder_dynamodbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowLogTrafficTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultInstanceTenancyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subnetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiKeySourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodLoggingLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentHandlingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passthroughBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queueEncryptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retentionDaysEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonSchemaVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonSchemaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum streamViewTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum removalPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableEncryptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billingModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AwsworkbenchPackageImpl() {
		super(eNS_URI, AwsworkbenchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AwsworkbenchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AwsworkbenchPackage init() {
		if (isInited)
			return (AwsworkbenchPackage) EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAwsworkbenchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = registeredAwsworkbenchPackage instanceof AwsworkbenchPackageImpl
				? (AwsworkbenchPackageImpl) registeredAwsworkbenchPackage
				: new AwsworkbenchPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl) (registeredPackage instanceof Ec2PackageImpl ? registeredPackage
				: Ec2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApigatewayPackage.eNS_URI);
		ApigatewayPackageImpl theApigatewayPackage = (ApigatewayPackageImpl) (registeredPackage instanceof ApigatewayPackageImpl
				? registeredPackage
				: ApigatewayPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CertificatemanagerPackage.eNS_URI);
		CertificatemanagerPackageImpl theCertificatemanagerPackage = (CertificatemanagerPackageImpl) (registeredPackage instanceof CertificatemanagerPackageImpl
				? registeredPackage
				: CertificatemanagerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);
		IamPackageImpl theIamPackage = (IamPackageImpl) (registeredPackage instanceof IamPackageImpl ? registeredPackage
				: IamPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = (DynamodbPackageImpl) (registeredPackage instanceof DynamodbPackageImpl
				? registeredPackage
				: DynamodbPackage.eINSTANCE);

		// Create package meta-data objects
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAwsworkbenchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AwsworkbenchPackage.eNS_URI, theAwsworkbenchPackage);
		return theAwsworkbenchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceResources() {
		return serviceResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppBuilder_core() {
		return appBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_AutoSynth_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Outdir_java_lang_String_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_RuntimeInfo_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_StackTraces_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_TreeMetadata_java_lang_Boolean_() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_GeneratedClassName() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_VarName() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_Identifier() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppBuilder_core_AdditionalCode() {
		return (EAttribute) appBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Environmentbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Defaultstacksynthesizerbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppBuilder_core_Stackbuilder_core() {
		return (EReference) appBuilder_coreEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultStackSynthesizerBuilder_core() {
		return defaultStackSynthesizerBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_GeneratedClassName() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_VarName() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_Identifier() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerBuilder_core_AdditionalCode() {
		return (EAttribute) defaultStackSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentBuilder_core() {
		return environmentBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Account_java_lang_String_() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Region_java_lang_String_() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_GeneratedClassName() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_VarName() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_Identifier() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentBuilder_core_AdditionalCode() {
		return (EAttribute) environmentBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowLogOptionsBuilder_ec2() {
		return flowLogOptionsBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_GeneratedClassName() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_VarName() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_Identifier() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowLogOptionsBuilder_ec2_AdditionalCode() {
		return (EAttribute) flowLogOptionsBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStackBuilder_core() {
		return stackBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Description_java_lang_String_() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_StackName_java_lang_String_() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_TerminationProtection_java_lang_Boolean_() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_GeneratedClassName() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_VarName() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_Identifier() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackBuilder_core_AdditionalCode() {
		return (EAttribute) stackBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStackBuilder_core_Serviceresources() {
		return (EReference) stackBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcBuilder_ec2() {
		return vpcBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_Cidr_java_lang_String_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_MaxAzs_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGateways_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_GeneratedClassName() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_VarName() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_Identifier() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcBuilder_ec2_AdditionalCode() {
		return (EAttribute) vpcBuilder_ec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetBuilder_ec2() {
		return subnetBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_CidrBlock_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_VpcId_java_lang_String_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_VarName() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_Identifier() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetSelectionBuilder_ec2() {
		return subnetSelectionBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_GeneratedClassName() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_VarName() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_Identifier() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnetSelectionBuilder_ec2_AdditionalCode() {
		return (EAttribute) subnetSelectionBuilder_ec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayVpcEndpointBuilder_ec2() {
		return gatewayVpcEndpointBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_GeneratedClassName() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_VarName() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_Identifier() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayVpcEndpointBuilder_ec2_AdditionalCode() {
		return (EAttribute) gatewayVpcEndpointBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeploymentOptionsBuilder_apigateway() {
		return methodDeploymentOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_CachingEnabled_java_lang_Boolean_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_VarName() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeploymentOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) methodDeploymentOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndpointConfigurationBuilder_apigateway() {
		return endpointConfigurationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_Types_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_VpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_VarName() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_Identifier() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointConfigurationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) endpointConfigurationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStageOptionsBuilder_apigateway() {
		return stageOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_CacheClusterSize_java_lang_String_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_ClientCertificateId_java_lang_String_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_DocumentationVersion_java_lang_String_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_StageName_java_lang_String_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_TracingEnabled_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_CachingEnabled_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_VarName() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) stageOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHostedZoneBuilder_route53() {
		return hostedZoneBuilder_route53EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_ZoneName_java_lang_String_() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_Comment_java_lang_String_() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_QueryLogsLogGroupArn_java_lang_String_() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_Vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_GeneratedClassName() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_VarName() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_Identifier() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostedZoneBuilder_route53_AdditionalCode() {
		return (EAttribute) hostedZoneBuilder_route53EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDnsValidatedCertificateBuilder_certificatemanager() {
		return dnsValidatedCertificateBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_VarName() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_Identifier() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) dnsValidatedCertificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationResponseBuilder_apigateway() {
		return integrationResponseBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_StatusCode_java_lang_String_() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_ResponseTemplates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_SelectionPattern_java_lang_String_() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_VarName() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_Identifier() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationResponseBuilder_apigateway_AdditionalCode() {
		return (EAttribute) integrationResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificateBuilder_certificatemanager() {
		return certificateBuilder_certificatemanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_DomainName_java_lang_String_() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_GeneratedClassName() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_VarName() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_Identifier() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificateBuilder_certificatemanager_AdditionalCode() {
		return (EAttribute) certificateBuilder_certificatemanagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainNameOptionsBuilder_apigateway() {
		return domainNameOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_DomainName_java_lang_String_() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_VarName() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) domainNameOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkLoadBalancerBuilder_elasticloadbalancingv2() {
		return networkLoadBalancerBuilder_elasticloadbalancingv2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_DeletionProtection_java_lang_Boolean_() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_InternetFacing_java_lang_Boolean_() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_LoadBalancerName_java_lang_String_() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_CrossZoneEnabled_java_lang_Boolean_() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_GeneratedClassName() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VarName() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_Identifier() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLoadBalancerBuilder_elasticloadbalancingv2_AdditionalCode() {
		return (EAttribute) networkLoadBalancerBuilder_elasticloadbalancingv2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcLinkBuilder_apigateway() {
		return vpcLinkBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_Targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_VpcLinkName_java_lang_String_() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_VarName() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_Identifier() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkBuilder_apigateway_AdditionalCode() {
		return (EAttribute) vpcLinkBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationOptionsBuilder_apigateway() {
		return integrationOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_CacheNamespace_java_lang_String_() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_VarName() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) integrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationBuilder_apigateway() {
		return integrationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_IntegrationType_() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_IntegrationHttpMethod_java_lang_String_() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_Uri_java_lang_Object_() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_VarName() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_Identifier() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) integrationBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorsOptionsBuilder_apigateway() {
		return corsOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_AllowOrigins_java_lang_String_AsList() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_AllowCredentials_java_lang_Boolean_() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_AllowHeaders_java_lang_String_AsList() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_AllowMethods_java_lang_String_AsList() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_DisableCache_java_lang_Boolean_() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_ExposeHeaders_java_lang_String_AsList() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_MaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_StatusCode_java_lang_Number_() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_VarName() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorsOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) corsOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyBuilder_kms() {
		return keyBuilder_kmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_Alias_java_lang_String_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_Description_java_lang_String_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_Enabled_java_lang_Boolean_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_EnableKeyRotation_java_lang_Boolean_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_TrustAccountIdentities_java_lang_Boolean_() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_GeneratedClassName() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_VarName() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_Identifier() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyBuilder_kms_AdditionalCode() {
		return (EAttribute) keyBuilder_kmsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeadLetterQueueBuilder_sqs() {
		return deadLetterQueueBuilder_sqsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_MaxReceiveCount_java_lang_Number_() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_QueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_GeneratedClassName() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_VarName() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_Identifier() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadLetterQueueBuilder_sqs_AdditionalCode() {
		return (EAttribute) deadLetterQueueBuilder_sqsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueueBuilder_sqs() {
		return queueBuilder_sqsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_ContentBasedDeduplication_java_lang_Boolean_() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_DataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_DeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_DeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_Encryption_software_amazon_awscdk_services_sqs_QueueEncryption_() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_EncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_Fifo_java_lang_Boolean_() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_MaxMessageSizeBytes_java_lang_Number_() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_QueueName_java_lang_String_() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_ReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_RetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_VisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_GeneratedClassName() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_VarName() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_Identifier() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueBuilder_sqs_AdditionalCode() {
		return (EAttribute) queueBuilder_sqsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionOptionsBuilder_lambda() {
		return versionOptionsBuilder_lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_CodeSha256_java_lang_String_() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_Description_java_lang_String_() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_ProvisionedConcurrentExecutions_java_lang_Number_() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_RetryAttempts_java_lang_Number_() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_GeneratedClassName() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_VarName() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_Identifier() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionOptionsBuilder_lambda_AdditionalCode() {
		return (EAttribute) versionOptionsBuilder_lambdaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerVersionBuilder_lambda() {
		return layerVersionBuilder_lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_CodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_CompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_Description_java_lang_String_() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_LayerVersionName_java_lang_String_() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_License_java_lang_String_() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_GeneratedClassName() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_VarName() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_Identifier() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerVersionBuilder_lambda_AdditionalCode() {
		return (EAttribute) layerVersionBuilder_lambdaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroupBuilder_ec2() {
		return securityGroupBuilder_ec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_Description_java_lang_String_() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_GeneratedClassName() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_VarName() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_Identifier() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroupBuilder_ec2_AdditionalCode() {
		return (EAttribute) securityGroupBuilder_ec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionBuilder_lambda() {
		return functionBuilder_lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_RetryAttempts_java_lang_Number_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_AllowAllOutbound_java_lang_Boolean_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_CurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_DeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_DeadLetterQueueEnabled_java_lang_Boolean_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Description_java_lang_String_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Environment_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Events_software_amazon_awscdk_services_lambda_IEventSource_AsList() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_FunctionName_java_lang_String_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_InitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_LogRetention_software_amazon_awscdk_services_logs_RetentionDays_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_LogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_MemorySize_java_lang_Number_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_ReservedConcurrentExecutions_java_lang_Number_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Tracing_software_amazon_awscdk_services_lambda_Tracing_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_CodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Handler_java_lang_String_() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_RuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_GeneratedClassName() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_VarName() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_Identifier() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionBuilder_lambda_AdditionalCode() {
		return (EAttribute) functionBuilder_lambdaEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestAuthorizerBuilder_apigateway() {
		return requestAuthorizerBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_AuthorizerName_java_lang_String_() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_IdentitySources_java_lang_String_AsList() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_VarName() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_Identifier() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerBuilder_apigateway_AdditionalCode() {
		return (EAttribute) requestAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTokenAuthorizerBuilder_apigateway() {
		return tokenAuthorizerBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_AuthorizerName_java_lang_String_() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_IdentitySource_java_lang_String_() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_ValidationRegex_java_lang_String_() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_VarName() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_Identifier() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerBuilder_apigateway_AdditionalCode() {
		return (EAttribute) tokenAuthorizerBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonSchemaBuilder_apigateway() {
		return jsonSchemaBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_AdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_AdditionalProperties_java_lang_Boolean_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_AllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_AnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_ContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Dependencies_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_EnumValue_java_lang_Object_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_ExclusiveMaximum_java_lang_Boolean_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_ExclusiveMinimum_java_lang_Boolean_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Format_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Id_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_ItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Maximum_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MaxItems_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MaxLength_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MaxProperties_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Minimum_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MinItems_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MinLength_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MinProperties_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_MultipleOf_java_lang_Number_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_NotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_OneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Pattern_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_PatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_PropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Ref_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Required_java_lang_String_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Title_java_lang_String_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_JsonSchemaType_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_UniqueItems_java_lang_Boolean_() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_VarName() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_Identifier() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonSchemaBuilder_apigateway_AdditionalCode() {
		return (EAttribute) jsonSchemaBuilder_apigatewayEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelBuilder_apigateway() {
		return modelBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_ContentType_java_lang_String_() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_ModelName_java_lang_String_() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_VarName() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_Identifier() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelBuilder_apigateway_AdditionalCode() {
		return (EAttribute) modelBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestValidatorOptionsBuilder_apigateway() {
		return requestValidatorOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_RequestValidatorName_java_lang_String_() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_VarName() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) requestValidatorOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestValidatorBuilder_apigateway() {
		return requestValidatorBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_RequestValidatorName_java_lang_String_() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_VarName() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_Identifier() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorBuilder_apigateway_AdditionalCode() {
		return (EAttribute) requestValidatorBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodResponseBuilder_apigateway() {
		return methodResponseBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_StatusCode_java_lang_String_() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_ResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_Boolean_AsMap() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_VarName() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_Identifier() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodResponseBuilder_apigateway_AdditionalCode() {
		return (EAttribute) methodResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodOptionsBuilder_apigateway() {
		return methodOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_ApiKeyRequired_java_lang_Boolean_() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_AuthorizationScopes_java_lang_String_AsList() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_AuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_AuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_MethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_OperationName_java_lang_String_() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_RequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_Boolean_AsMap() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_RequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_RequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_VarName() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) methodOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestApiPropsBuilder_apigateway() {
		return restApiPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_MinimumCompressionSize_java_lang_Number_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_VarName() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_Identifier() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) restApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiGatewayToDynamoDBBuilder_apigatewaydynamodb() {
		return apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowCreateOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowDeleteOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowReadOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowUpdateOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_ApiGatewayProps_java_lang_Object_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_CreateRequestTemplate_java_lang_String_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_UpdateRequestTemplate_java_lang_String_() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_GeneratedClassName() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_VarName() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_Identifier() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AdditionalCode() {
		return (EAttribute) apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiGatewayToLambdaBuilder_apigatewaylambda() {
		return apiGatewayToLambdaBuilder_apigatewaylambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_ApiGatewayProps_java_lang_Object_() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_LambdaFunctionProps_java_lang_Object_() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_GeneratedClassName() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_VarName() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_Identifier() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToLambdaBuilder_apigatewaylambda_AdditionalCode() {
		return (EAttribute) apiGatewayToLambdaBuilder_apigatewaylambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiGatewayToSqsBuilder_apigatewaysqs() {
		return apiGatewayToSqsBuilder_apigatewaysqsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_AllowCreateOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_AllowDeleteOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_AllowReadOperation_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_ApiGatewayProps_java_lang_Object_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_CreateRequestTemplate_java_lang_String_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_DeployDeadLetterQueue_java_lang_Boolean_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_MaxReceiveCount_java_lang_Number_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_QueueProps_java_lang_Object_() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_GeneratedClassName() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_VarName() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_Identifier() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiGatewayToSqsBuilder_apigatewaysqs_AdditionalCode() {
		return (EAttribute) apiGatewayToSqsBuilder_apigatewaysqsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudFrontToApiGatewayBuilder_cloudfrontapigateway() {
		return cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_ExistingApiGatewayObjWithRestApi_software_amazon_awscdk_services_apigateway_RestApi_AsReference() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_CloudFrontDistributionProps_java_lang_Object_() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_InsertHttpSecurityHeaders_java_lang_Boolean_() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_GeneratedClassName() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_VarName() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_Identifier() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_AdditionalCode() {
		return (EAttribute) cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda() {
		return cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_ApiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReference() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_CloudFrontDistributionProps_java_lang_Object_() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_InsertHttpSecurityHeaders_java_lang_Boolean_() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_GeneratedClassName() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_VarName() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_Identifier() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_AdditionalCode() {
		return (EAttribute) cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudFrontToS3Builder_cloudfronts3() {
		return cloudFrontToS3Builder_cloudfronts3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_CloudFrontDistributionProps_java_lang_Object_() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_InsertHttpSecurityHeaders_java_lang_Boolean_() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_GeneratedClassName() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_VarName() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_Identifier() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudFrontToS3Builder_cloudfronts3_AdditionalCode() {
		return (EAttribute) cloudFrontToS3Builder_cloudfronts3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda() {
		return cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_ApiGatewayProps_java_lang_Object_() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_CognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReference() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_CognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReference() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_GeneratedClassName() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_VarName() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_Identifier() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_AdditionalCode() {
		return (EAttribute) cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildDeadLetterQueuePropsBuilder_core() {
		return buildDeadLetterQueuePropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_DeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_MaxReceiveCount_java_lang_Number_() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_VarName() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_Identifier() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDeadLetterQueuePropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildDeadLetterQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildQueuePropsBuilder_core() {
		return buildQueuePropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_DeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_VarName() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_Identifier() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildQueuePropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildQueuePropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildS3BucketPropsBuilder_core() {
		return buildS3BucketPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_VarName() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_Identifier() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildS3BucketPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildS3BucketPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildEncryptionKeyPropsBuilder_core() {
		return buildEncryptionKeyPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildEncryptionKeyPropsBuilder_core_EncryptionKeyProps_java_lang_Object_() {
		return (EAttribute) buildEncryptionKeyPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildEncryptionKeyPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildEncryptionKeyPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildEncryptionKeyPropsBuilder_core_VarName() {
		return (EAttribute) buildEncryptionKeyPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildEncryptionKeyPropsBuilder_core_Identifier() {
		return (EAttribute) buildEncryptionKeyPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildEncryptionKeyPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildEncryptionKeyPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitoOptionsBuilder_core() {
		return cognitoOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_IdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_UserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_UserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_VarName() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_Identifier() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitoOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) cognitoOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildKinesisStreamPropsBuilder_core() {
		return buildKinesisStreamPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisStreamPropsBuilder_core_KinesisStreamProps_java_lang_Object_() {
		return (EAttribute) buildKinesisStreamPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisStreamPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildKinesisStreamPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisStreamPropsBuilder_core_VarName() {
		return (EAttribute) buildKinesisStreamPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisStreamPropsBuilder_core_Identifier() {
		return (EAttribute) buildKinesisStreamPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisStreamPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildKinesisStreamPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildKinesisAnalyticsAppPropsBuilder_core() {
		return buildKinesisAnalyticsAppPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisAnalyticsProps_java_lang_Object_() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_VarName() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_Identifier() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildKinesisAnalyticsAppPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildKinesisAnalyticsAppPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildLambdaFunctionPropsBuilder_core() {
		return buildLambdaFunctionPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_VarName() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_Identifier() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildLambdaFunctionPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildLambdaFunctionPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildDynamoDBTablePropsBuilder_core() {
		return buildDynamoDBTablePropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_VarName() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_Identifier() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDynamoDBTablePropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildDynamoDBTablePropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildTopicPropsBuilder_core() {
		return buildTopicPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_EnableEncryption_java_lang_Boolean_() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_TopicProps_java_lang_Object_() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_VarName() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_Identifier() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildTopicPropsBuilder_core_AdditionalCode() {
		return (EAttribute) buildTopicPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda() {
		return dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_GeneratedClassName() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_VarName() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_Identifier() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_AdditionalCode() {
		return (EAttribute) dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana() {
		return dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_DomainName_java_lang_String_() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_EsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_GeneratedClassName() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_VarName() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_Identifier() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_AdditionalCode() {
		return (EAttribute) dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventsRuleToLambdaBuilder_eventsrulelambda() {
		return eventsRuleToLambdaBuilder_eventsrulelambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_GeneratedClassName() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_VarName() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_Identifier() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToLambdaBuilder_eventsrulelambda_AdditionalCode() {
		return (EAttribute) eventsRuleToLambdaBuilder_eventsrulelambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventsRuleToStepFunctionBuilder_eventsrulestepfunction() {
		return eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_GeneratedClassName() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_VarName() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_Identifier() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_AdditionalCode() {
		return (EAttribute) eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3() {
		return iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_KinesisFirehoseProps_java_lang_Object_() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_GeneratedClassName() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_VarName() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_Identifier() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_AdditionalCode() {
		return (EAttribute) iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIotToLambdaBuilder_iotlambda() {
		return iotToLambdaBuilder_iotlambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_GeneratedClassName() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_VarName() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_Identifier() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaBuilder_iotlambda_AdditionalCode() {
		return (EAttribute) iotToLambdaBuilder_iotlambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb() {
		return iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_TablePermissions_java_lang_String_() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_GeneratedClassName() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_VarName() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_Identifier() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_AdditionalCode() {
		return (EAttribute) iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinesisFirehoseToS3Builder_kinesisfirehoses3() {
		return kinesisFirehoseToS3Builder_kinesisfirehoses3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_KinesisFirehoseProps_java_lang_Object_() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_GeneratedClassName() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_VarName() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_Identifier() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToS3Builder_kinesisfirehoses3_AdditionalCode() {
		return (EAttribute) kinesisFirehoseToS3Builder_kinesisfirehoses3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics() {
		return kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_KinesisAnalyticsProps_java_lang_Object_() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_KinesisFirehoseProps_java_lang_Object_() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_GeneratedClassName() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_VarName() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_Identifier() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_AdditionalCode() {
		return (EAttribute) kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinesisStreamsToLambdaBuilder_kinesisstreamslambda() {
		return kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_EventSourceProps_java_lang_Object_() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_KinesisStreamProps_java_lang_Object_() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_LambdaFunctionProps_java_lang_Object_() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_GeneratedClassName() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_VarName() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_Identifier() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_AdditionalCode() {
		return (EAttribute) kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToDynamoDBBuilder_lambdadynamodb() {
		return lambdaToDynamoDBBuilder_lambdadynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_TablePermissions_java_lang_String_() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_GeneratedClassName() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_VarName() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_Identifier() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToDynamoDBBuilder_lambdadynamodb_AdditionalCode() {
		return (EAttribute) lambdaToDynamoDBBuilder_lambdadynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana() {
		return lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_DomainName_java_lang_String_() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_EsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_GeneratedClassName() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_VarName() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_Identifier() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_AdditionalCode() {
		return (EAttribute) lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToS3Builder_lambdas3() {
		return lambdaToS3Builder_lambdas3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_BucketPermissions_java_lang_String_AsList() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_GeneratedClassName() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_VarName() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_Identifier() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToS3Builder_lambdas3_AdditionalCode() {
		return (EAttribute) lambdaToS3Builder_lambdas3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToSnsBuilder_lambdasns() {
		return lambdaToSnsBuilder_lambdasnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_EnableEncryption_java_lang_Boolean_() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_LambdaFunctionProps_java_lang_Object_() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_TopicProps_java_lang_Object_() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_GeneratedClassName() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_VarName() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_Identifier() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSnsBuilder_lambdasns_AdditionalCode() {
		return (EAttribute) lambdaToSnsBuilder_lambdasnsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToSqsBuilder_lambdasqs() {
		return lambdaToSqsBuilder_lambdasqsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_DeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_DeployDeadLetterQueue_java_lang_Boolean_() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_EnableQueuePurging_java_lang_Boolean_() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_MaxReceiveCount_java_lang_Number_() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_GeneratedClassName() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_VarName() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_Identifier() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToSqsBuilder_lambdasqs_AdditionalCode() {
		return (EAttribute) lambdaToSqsBuilder_lambdasqsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaToStepFunctionBuilder_lambdastepfunction() {
		return lambdaToStepFunctionBuilder_lambdastepfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_GeneratedClassName() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_VarName() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_Identifier() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaToStepFunctionBuilder_lambdastepfunction_AdditionalCode() {
		return (EAttribute) lambdaToStepFunctionBuilder_lambdastepfunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getS3ToLambdaBuilder_s3lambda() {
		return s3ToLambdaBuilder_s3lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_GeneratedClassName() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_VarName() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_Identifier() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToLambdaBuilder_s3lambda_AdditionalCode() {
		return (EAttribute) s3ToLambdaBuilder_s3lambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getS3ToStepFunctionBuilder_s3stepfunction() {
		return s3ToStepFunctionBuilder_s3stepfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_DeployCloudTrail_java_lang_Boolean_() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_GeneratedClassName() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_VarName() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_Identifier() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getS3ToStepFunctionBuilder_s3stepfunction_AdditionalCode() {
		return (EAttribute) s3ToStepFunctionBuilder_s3stepfunctionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSnsToLambdaBuilder_snslambda() {
		return snsToLambdaBuilder_snslambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_EnableEncryption_java_lang_Boolean_() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_LambdaFunctionProps_java_lang_Object_() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_TopicProps_java_lang_Object_() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_GeneratedClassName() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_VarName() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_Identifier() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnsToLambdaBuilder_snslambda_AdditionalCode() {
		return (EAttribute) snsToLambdaBuilder_snslambdaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagedPolicyBuilder_iam() {
		return managedPolicyBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_GeneratedClassName() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_VarName() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_Identifier() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManagedPolicyBuilder_iam_AdditionalCode() {
		return (EAttribute) managedPolicyBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserBuilder_iam() {
		return userBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_UserName_java_lang_String_() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_GeneratedClassName() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_VarName() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_Identifier() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBuilder_iam_AdditionalCode() {
		return (EAttribute) userBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupBuilder_iam() {
		return groupBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_GroupName_java_lang_String_() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_GeneratedClassName() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_VarName() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_Identifier() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupBuilder_iam_AdditionalCode() {
		return (EAttribute) groupBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleBuilder_iam() {
		return roleBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Description_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ExternalId_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ExternalIds_java_lang_String_AsList() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Path_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_RoleName_java_lang_String_() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_GeneratedClassName() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_VarName() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_Identifier() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleBuilder_iam_AdditionalCode() {
		return (EAttribute) roleBuilder_iamEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyStatementBuilder_iam() {
		return policyStatementBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Sid_java_lang_String_() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_VarName() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_Identifier() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyStatementBuilder_iam_AdditionalCode() {
		return (EAttribute) policyStatementBuilder_iamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyDocumentBuilder_iam() {
		return policyDocumentBuilder_iamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_GeneratedClassName() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_VarName() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_Identifier() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyDocumentBuilder_iam_AdditionalCode() {
		return (EAttribute) policyDocumentBuilder_iamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqsToLambdaBuilder_sqslambda() {
		return sqsToLambdaBuilder_sqslambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_DeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_DeployDeadLetterQueue_java_lang_Boolean_() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_MaxReceiveCount_java_lang_Number_() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_GeneratedClassName() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_VarName() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_Identifier() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqsToLambdaBuilder_sqslambda_AdditionalCode() {
		return (EAttribute) sqsToLambdaBuilder_sqslambdaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeBuilder_dynamodb() {
		return attributeBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Name_java_lang_String_() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_VarName() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_Identifier() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) attributeBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTablePropsBuilder_dynamodb() {
		return tablePropsBuilder_dynamodbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_TableName_java_lang_String_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_GeneratedClassName() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_VarName() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_Identifier() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTablePropsBuilder_dynamodb_AdditionalCode() {
		return (EAttribute) tablePropsBuilder_dynamodbEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowLogTrafficType() {
		return flowLogTrafficTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefaultInstanceTenancy() {
		return defaultInstanceTenancyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubnetType() {
		return subnetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getApiKeySourceType() {
		return apiKeySourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEndpointType() {
		return endpointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMethodLoggingLevel() {
		return methodLoggingLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationMethod() {
		return validationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecurityPolicy() {
		return securityPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIntegrationType() {
		return integrationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContentHandling() {
		return contentHandlingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPassthroughBehavior() {
		return passthroughBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQueueEncryption() {
		return queueEncryptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRetentionDays() {
		return retentionDaysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTracing() {
		return tracingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthorizationType() {
		return authorizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJsonSchemaVersion() {
		return jsonSchemaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJsonSchemaType() {
		return jsonSchemaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEffect() {
		return effectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStreamViewType() {
		return streamViewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRemovalPolicy() {
		return removalPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTableEncryption() {
		return tableEncryptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBillingMode() {
		return billingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsworkbenchFactory getAwsworkbenchFactory() {
		return (AwsworkbenchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		serviceResourcesEClass = createEClass(SERVICE_RESOURCES);

		appBuilder_coreEClass = createEClass(APP_BUILDER_CORE);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__VAR_NAME);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__IDENTIFIER);
		createEAttribute(appBuilder_coreEClass, APP_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE);
		createEReference(appBuilder_coreEClass, APP_BUILDER_CORE__STACKBUILDER_CORE);

		defaultStackSynthesizerBuilder_coreEClass = createEClass(DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass, DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass, DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER);
		createEAttribute(defaultStackSynthesizerBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE);

		environmentBuilder_coreEClass = createEClass(ENVIRONMENT_BUILDER_CORE);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__VAR_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__IDENTIFIER);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE);

		flowLogOptionsBuilder_ec2EClass = createEClass(FLOW_LOG_OPTIONS_BUILDER_EC2);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(flowLogOptionsBuilder_ec2EClass,
				FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER);
		createEAttribute(flowLogOptionsBuilder_ec2EClass, FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE);

		stackBuilder_coreEClass = createEClass(STACK_BUILDER_CORE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stackBuilder_coreEClass,
				STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_);
		createEAttribute(stackBuilder_coreEClass,
				STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__VAR_NAME);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__IDENTIFIER);
		createEAttribute(stackBuilder_coreEClass, STACK_BUILDER_CORE__ADDITIONAL_CODE);
		createEReference(stackBuilder_coreEClass, STACK_BUILDER_CORE__SERVICERESOURCES);

		vpcBuilder_ec2EClass = createEClass(VPC_BUILDER_EC2);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_);
		createEAttribute(vpcBuilder_ec2EClass,
				VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__VAR_NAME);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__IDENTIFIER);
		createEAttribute(vpcBuilder_ec2EClass, VPC_BUILDER_EC2__ADDITIONAL_CODE);

		subnetBuilder_ec2EClass = createEClass(SUBNET_BUILDER_EC2);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetBuilder_ec2EClass, SUBNET_BUILDER_EC2__ADDITIONAL_CODE);

		subnetSelectionBuilder_ec2EClass = createEClass(SUBNET_SELECTION_BUILDER_EC2);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST);
		createEAttribute(subnetSelectionBuilder_ec2EClass,
				SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__VAR_NAME);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER);
		createEAttribute(subnetSelectionBuilder_ec2EClass, SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE);

		gatewayVpcEndpointBuilder_ec2EClass = createEClass(GATEWAY_VPC_ENDPOINT_BUILDER_EC2);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass,
				GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER);
		createEAttribute(gatewayVpcEndpointBuilder_ec2EClass, GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE);

		methodDeploymentOptionsBuilder_apigatewayEClass = createEClass(METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(methodDeploymentOptionsBuilder_apigatewayEClass,
				METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		endpointConfigurationBuilder_apigatewayEClass = createEClass(ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VPC_ENDPOINTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_AS_LIST);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(endpointConfigurationBuilder_apigatewayEClass,
				ENDPOINT_CONFIGURATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		stageOptionsBuilder_apigatewayEClass = createEClass(STAGE_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass,
				STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stageOptionsBuilder_apigatewayEClass, STAGE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(stageOptionsBuilder_apigatewayEClass, STAGE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(stageOptionsBuilder_apigatewayEClass, STAGE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(stageOptionsBuilder_apigatewayEClass, STAGE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		hostedZoneBuilder_route53EClass = createEClass(HOSTED_ZONE_BUILDER_ROUTE53);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_);
		createEAttribute(hostedZoneBuilder_route53EClass,
				HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_);
		createEAttribute(hostedZoneBuilder_route53EClass,
				HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__GENERATED_CLASS_NAME);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER);
		createEAttribute(hostedZoneBuilder_route53EClass, HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE);

		dnsValidatedCertificateBuilder_certificatemanagerEClass = createEClass(
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		integrationResponseBuilder_apigatewayEClass = createEClass(INTEGRATION_RESPONSE_BUILDER_APIGATEWAY);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__SELECTION_PATTERN_JAVA_LANG_STRING_);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(integrationResponseBuilder_apigatewayEClass,
				INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		certificateBuilder_certificatemanagerEClass = createEClass(CERTIFICATE_BUILDER_CERTIFICATEMANAGER);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME);
		createEAttribute(certificateBuilder_certificatemanagerEClass, CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER);
		createEAttribute(certificateBuilder_certificatemanagerEClass,
				CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE);

		domainNameOptionsBuilder_apigatewayEClass = createEClass(DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass, DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass, DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(domainNameOptionsBuilder_apigatewayEClass,
				DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		networkLoadBalancerBuilder_elasticloadbalancingv2EClass = createEClass(
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER);
		createEAttribute(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE);

		vpcLinkBuilder_apigatewayEClass = createEClass(VPC_LINK_BUILDER_APIGATEWAY);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkBuilder_apigatewayEClass,
				VPC_LINK_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		integrationOptionsBuilder_apigatewayEClass = createEClass(INTEGRATION_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass, INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(integrationOptionsBuilder_apigatewayEClass,
				INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		integrationBuilder_apigatewayEClass = createEClass(INTEGRATION_BUILDER_APIGATEWAY);
		createEAttribute(integrationBuilder_apigatewayEClass,
				INTEGRATION_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_);
		createEAttribute(integrationBuilder_apigatewayEClass,
				INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(integrationBuilder_apigatewayEClass,
				INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(integrationBuilder_apigatewayEClass, INTEGRATION_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_);
		createEAttribute(integrationBuilder_apigatewayEClass, INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(integrationBuilder_apigatewayEClass, INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(integrationBuilder_apigatewayEClass, INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(integrationBuilder_apigatewayEClass, INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		corsOptionsBuilder_apigatewayEClass = createEClass(CORS_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(corsOptionsBuilder_apigatewayEClass,
				CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_);
		createEAttribute(corsOptionsBuilder_apigatewayEClass, CORS_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(corsOptionsBuilder_apigatewayEClass, CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(corsOptionsBuilder_apigatewayEClass, CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(corsOptionsBuilder_apigatewayEClass, CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		keyBuilder_kmsEClass = createEClass(KEY_BUILDER_KMS);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(keyBuilder_kmsEClass,
				KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(keyBuilder_kmsEClass,
				KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__GENERATED_CLASS_NAME);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__VAR_NAME);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__IDENTIFIER);
		createEAttribute(keyBuilder_kmsEClass, KEY_BUILDER_KMS__ADDITIONAL_CODE);

		deadLetterQueueBuilder_sqsEClass = createEClass(DEAD_LETTER_QUEUE_BUILDER_SQS);
		createEAttribute(deadLetterQueueBuilder_sqsEClass,
				DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_);
		createEAttribute(deadLetterQueueBuilder_sqsEClass,
				DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE);
		createEAttribute(deadLetterQueueBuilder_sqsEClass, DEAD_LETTER_QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME);
		createEAttribute(deadLetterQueueBuilder_sqsEClass, DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME);
		createEAttribute(deadLetterQueueBuilder_sqsEClass, DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER);
		createEAttribute(deadLetterQueueBuilder_sqsEClass, DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE);

		queueBuilder_sqsEClass = createEClass(QUEUE_BUILDER_SQS);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass,
				QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__VAR_NAME);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__IDENTIFIER);
		createEAttribute(queueBuilder_sqsEClass, QUEUE_BUILDER_SQS__ADDITIONAL_CODE);

		versionOptionsBuilder_lambdaEClass = createEClass(VERSION_OPTIONS_BUILDER_LAMBDA);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE);
		createEAttribute(versionOptionsBuilder_lambdaEClass,
				VERSION_OPTIONS_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_);
		createEAttribute(versionOptionsBuilder_lambdaEClass, VERSION_OPTIONS_BUILDER_LAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(versionOptionsBuilder_lambdaEClass, VERSION_OPTIONS_BUILDER_LAMBDA__VAR_NAME);
		createEAttribute(versionOptionsBuilder_lambdaEClass, VERSION_OPTIONS_BUILDER_LAMBDA__IDENTIFIER);
		createEAttribute(versionOptionsBuilder_lambdaEClass, VERSION_OPTIONS_BUILDER_LAMBDA__ADDITIONAL_CODE);

		layerVersionBuilder_lambdaEClass = createEClass(LAYER_VERSION_BUILDER_LAMBDA);
		createEAttribute(layerVersionBuilder_lambdaEClass,
				LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE);
		createEAttribute(layerVersionBuilder_lambdaEClass,
				LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(layerVersionBuilder_lambdaEClass,
				LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER);
		createEAttribute(layerVersionBuilder_lambdaEClass, LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE);

		securityGroupBuilder_ec2EClass = createEClass(SECURITY_GROUP_BUILDER_EC2);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(securityGroupBuilder_ec2EClass,
				SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__VAR_NAME);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__IDENTIFIER);
		createEAttribute(securityGroupBuilder_ec2EClass, SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE);

		functionBuilder_lambdaEClass = createEClass(FUNCTION_BUILDER_LAMBDA);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_);
		createEAttribute(functionBuilder_lambdaEClass,
				FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__VAR_NAME);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__IDENTIFIER);
		createEAttribute(functionBuilder_lambdaEClass, FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE);

		requestAuthorizerBuilder_apigatewayEClass = createEClass(REQUEST_AUTHORIZER_BUILDER_APIGATEWAY);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass, REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass, REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(requestAuthorizerBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		tokenAuthorizerBuilder_apigatewayEClass = createEClass(TOKEN_AUTHORIZER_BUILDER_APIGATEWAY);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCE_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__VALIDATION_REGEX_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass, TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass, TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(tokenAuthorizerBuilder_apigatewayEClass, TOKEN_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		jsonSchemaBuilder_apigatewayEClass = createEClass(JSON_SCHEMA_BUILDER_APIGATEWAY);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass,
				JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(jsonSchemaBuilder_apigatewayEClass, JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		modelBuilder_apigatewayEClass = createEClass(MODEL_BUILDER_APIGATEWAY);
		createEAttribute(modelBuilder_apigatewayEClass,
				MODEL_BUILDER_APIGATEWAY__SCHEMA_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__CONTENT_TYPE_JAVA_LANG_STRING_);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__MODEL_NAME_JAVA_LANG_STRING_);
		createEAttribute(modelBuilder_apigatewayEClass,
				MODEL_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(modelBuilder_apigatewayEClass, MODEL_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		requestValidatorOptionsBuilder_apigatewayEClass = createEClass(REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(requestValidatorOptionsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		requestValidatorBuilder_apigatewayEClass = createEClass(REQUEST_VALIDATOR_BUILDER_APIGATEWAY);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(requestValidatorBuilder_apigatewayEClass, REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(requestValidatorBuilder_apigatewayEClass, REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(requestValidatorBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		methodResponseBuilder_apigatewayEClass = createEClass(METHOD_RESPONSE_BUILDER_APIGATEWAY);
		createEAttribute(methodResponseBuilder_apigatewayEClass,
				METHOD_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_);
		createEAttribute(methodResponseBuilder_apigatewayEClass,
				METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP);
		createEAttribute(methodResponseBuilder_apigatewayEClass,
				METHOD_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP);
		createEAttribute(methodResponseBuilder_apigatewayEClass,
				METHOD_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(methodResponseBuilder_apigatewayEClass, METHOD_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(methodResponseBuilder_apigatewayEClass, METHOD_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(methodResponseBuilder_apigatewayEClass, METHOD_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		methodOptionsBuilder_apigatewayEClass = createEClass(METHOD_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE);
		createEAttribute(methodOptionsBuilder_apigatewayEClass,
				METHOD_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(methodOptionsBuilder_apigatewayEClass, METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(methodOptionsBuilder_apigatewayEClass, METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(methodOptionsBuilder_apigatewayEClass, METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		restApiPropsBuilder_apigatewayEClass = createEClass(REST_API_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass,
				REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiPropsBuilder_apigatewayEClass, REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(restApiPropsBuilder_apigatewayEClass, REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(restApiPropsBuilder_apigatewayEClass, REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(restApiPropsBuilder_apigatewayEClass, REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass = createEClass(
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_UPDATE_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__UPDATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__VAR_NAME);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__IDENTIFIER);
		createEAttribute(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ADDITIONAL_CODE);

		apiGatewayToLambdaBuilder_apigatewaylambdaEClass = createEClass(API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__VAR_NAME);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__IDENTIFIER);
		createEAttribute(apiGatewayToLambdaBuilder_apigatewaylambdaEClass,
				API_GATEWAY_TO_LAMBDA_BUILDER_APIGATEWAYLAMBDA__ADDITIONAL_CODE);

		apiGatewayToSqsBuilder_apigatewaysqsEClass = createEClass(API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__GENERATED_CLASS_NAME);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER);
		createEAttribute(apiGatewayToSqsBuilder_apigatewaysqsEClass,
				API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE);

		cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass = createEClass(
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__EXISTING_API_GATEWAY_OBJ_WITH_REST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_REFERENCE);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__VAR_NAME);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__IDENTIFIER);
		createEAttribute(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CLOUD_FRONT_TO_API_GATEWAY_BUILDER_CLOUDFRONTAPIGATEWAY__ADDITIONAL_CODE);

		cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass = createEClass(
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_WITH_LAMBDA_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_LAMBDA_REST_API_PROPS_AS_REFERENCE);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__VAR_NAME);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__IDENTIFIER);
		createEAttribute(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__ADDITIONAL_CODE);

		cloudFrontToS3Builder_cloudfronts3EClass = createEClass(CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__GENERATED_CLASS_NAME);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass, CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass, CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER);
		createEAttribute(cloudFrontToS3Builder_cloudfronts3EClass,
				CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE);

		cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass = createEClass(
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_CLIENT_PROPS_WITH_USER_POOL_CLIENT_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_PROPS_AS_REFERENCE);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_PROPS_WITH_USER_POOL_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_PROPS_AS_REFERENCE);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__VAR_NAME);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__IDENTIFIER);
		createEAttribute(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__ADDITIONAL_CODE);

		buildDeadLetterQueuePropsBuilder_coreEClass = createEClass(BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildDeadLetterQueuePropsBuilder_coreEClass,
				BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildQueuePropsBuilder_coreEClass = createEClass(BUILD_QUEUE_PROPS_BUILDER_CORE);
		createEAttribute(buildQueuePropsBuilder_coreEClass,
				BUILD_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE);
		createEAttribute(buildQueuePropsBuilder_coreEClass,
				BUILD_QUEUE_PROPS_BUILDER_CORE__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE);
		createEAttribute(buildQueuePropsBuilder_coreEClass,
				BUILD_QUEUE_PROPS_BUILDER_CORE__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE);
		createEAttribute(buildQueuePropsBuilder_coreEClass, BUILD_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildQueuePropsBuilder_coreEClass, BUILD_QUEUE_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildQueuePropsBuilder_coreEClass, BUILD_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildQueuePropsBuilder_coreEClass, BUILD_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildS3BucketPropsBuilder_coreEClass = createEClass(BUILD_S3_BUCKET_PROPS_BUILDER_CORE);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass,
				BUILD_S3_BUCKET_PROPS_BUILDER_CORE__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass,
				BUILD_S3_BUCKET_PROPS_BUILDER_CORE__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass,
				BUILD_S3_BUCKET_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass, BUILD_S3_BUCKET_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass, BUILD_S3_BUCKET_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildS3BucketPropsBuilder_coreEClass, BUILD_S3_BUCKET_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildEncryptionKeyPropsBuilder_coreEClass = createEClass(BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE);
		createEAttribute(buildEncryptionKeyPropsBuilder_coreEClass,
				BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ENCRYPTION_KEY_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(buildEncryptionKeyPropsBuilder_coreEClass,
				BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildEncryptionKeyPropsBuilder_coreEClass, BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildEncryptionKeyPropsBuilder_coreEClass,
				BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildEncryptionKeyPropsBuilder_coreEClass,
				BUILD_ENCRYPTION_KEY_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		cognitoOptionsBuilder_coreEClass = createEClass(COGNITO_OPTIONS_BUILDER_CORE);
		createEAttribute(cognitoOptionsBuilder_coreEClass,
				COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE);
		createEAttribute(cognitoOptionsBuilder_coreEClass,
				COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE);
		createEAttribute(cognitoOptionsBuilder_coreEClass,
				COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE);
		createEAttribute(cognitoOptionsBuilder_coreEClass, COGNITO_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(cognitoOptionsBuilder_coreEClass, COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(cognitoOptionsBuilder_coreEClass, COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(cognitoOptionsBuilder_coreEClass, COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		buildKinesisStreamPropsBuilder_coreEClass = createEClass(BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE);
		createEAttribute(buildKinesisStreamPropsBuilder_coreEClass,
				BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(buildKinesisStreamPropsBuilder_coreEClass,
				BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildKinesisStreamPropsBuilder_coreEClass, BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildKinesisStreamPropsBuilder_coreEClass,
				BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildKinesisStreamPropsBuilder_coreEClass,
				BUILD_KINESIS_STREAM_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildKinesisAnalyticsAppPropsBuilder_coreEClass = createEClass(BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_FIREHOSE_WITH_CFN_DELIVERY_STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_KINESISFIREHOSE_CFN_DELIVERY_STREAM_AS_REFERENCE);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_ANALYTICS_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildKinesisAnalyticsAppPropsBuilder_coreEClass,
				BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildLambdaFunctionPropsBuilder_coreEClass = createEClass(BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildLambdaFunctionPropsBuilder_coreEClass,
				BUILD_LAMBDA_FUNCTION_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildDynamoDBTablePropsBuilder_coreEClass = createEClass(BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass,
				BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass,
				BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass,
				BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass, BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass,
				BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildDynamoDBTablePropsBuilder_coreEClass,
				BUILD_DYNAMO_DB_TABLE_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		buildTopicPropsBuilder_coreEClass = createEClass(BUILD_TOPIC_PROPS_BUILDER_CORE);
		createEAttribute(buildTopicPropsBuilder_coreEClass,
				BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(buildTopicPropsBuilder_coreEClass,
				BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE);
		createEAttribute(buildTopicPropsBuilder_coreEClass,
				BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(buildTopicPropsBuilder_coreEClass, BUILD_TOPIC_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(buildTopicPropsBuilder_coreEClass, BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(buildTopicPropsBuilder_coreEClass, BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(buildTopicPropsBuilder_coreEClass, BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass = createEClass(
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__VAR_NAME);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__IDENTIFIER);
		createEAttribute(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__ADDITIONAL_CODE);

		dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass = createEClass(
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ES_DOMAIN_PROPS_WITH_CFN_DOMAIN_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICSEARCH_CFN_DOMAIN_PROPS_AS_REFERENCE);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__GENERATED_CLASS_NAME);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__VAR_NAME);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__IDENTIFIER);
		createEAttribute(
				dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ADDITIONAL_CODE);

		eventsRuleToLambdaBuilder_eventsrulelambdaEClass = createEClass(EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER);
		createEAttribute(eventsRuleToLambdaBuilder_eventsrulelambdaEClass,
				EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE);

		eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass = createEClass(
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__GENERATED_CLASS_NAME);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__VAR_NAME);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__IDENTIFIER);
		createEAttribute(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EVENTS_RULE_TO_STEP_FUNCTION_BUILDER_EVENTSRULESTEPFUNCTION__ADDITIONAL_CODE);

		iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass = createEClass(
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__KINESIS_FIREHOSE_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__GENERATED_CLASS_NAME);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__VAR_NAME);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__IDENTIFIER);
		createEAttribute(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IOT_TO_KINESIS_FIREHOSE_TO_S3_BUILDER_IOTKINESISFIREHOSES3__ADDITIONAL_CODE);

		iotToLambdaBuilder_iotlambdaEClass = createEClass(IOT_TO_LAMBDA_BUILDER_IOTLAMBDA);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass,
				IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass,
				IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass,
				IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass, IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass, IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__VAR_NAME);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass, IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IDENTIFIER);
		createEAttribute(iotToLambdaBuilder_iotlambdaEClass, IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__ADDITIONAL_CODE);

		iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass = createEClass(
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__VAR_NAME);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IDENTIFIER);
		createEAttribute(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__ADDITIONAL_CODE);

		kinesisFirehoseToS3Builder_kinesisfirehoses3EClass = createEClass(
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__KINESIS_FIREHOSE_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__GENERATED_CLASS_NAME);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__VAR_NAME);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__IDENTIFIER);
		createEAttribute(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__ADDITIONAL_CODE);

		kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass = createEClass(
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__KINESIS_ANALYTICS_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__KINESIS_FIREHOSE_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__GENERATED_CLASS_NAME);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__VAR_NAME);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__IDENTIFIER);
		createEAttribute(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KINESIS_FIREHOSE_TO_ANALYTICS_AND_S3_BUILDER_KINESISFIREHOSES3KINESISANALYTICS__ADDITIONAL_CODE);

		kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass = createEClass(
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EVENT_SOURCE_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__KINESIS_STREAM_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__VAR_NAME);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__IDENTIFIER);
		createEAttribute(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KINESIS_STREAMS_TO_LAMBDA_BUILDER_KINESISSTREAMSLAMBDA__ADDITIONAL_CODE);

		lambdaToDynamoDBBuilder_lambdadynamodbEClass = createEClass(LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER);
		createEAttribute(lambdaToDynamoDBBuilder_lambdadynamodbEClass,
				LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE);

		lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass = createEClass(
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__ES_DOMAIN_PROPS_WITH_CFN_DOMAIN_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICSEARCH_CFN_DOMAIN_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__VAR_NAME);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__IDENTIFIER);
		createEAttribute(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_LAMBDAELASTICSEARCHKIBANA__ADDITIONAL_CODE);

		lambdaToS3Builder_lambdas3EClass = createEClass(LAMBDA_TO_S3_BUILDER_LAMBDAS3);
		createEAttribute(lambdaToS3Builder_lambdas3EClass,
				LAMBDA_TO_S3_BUILDER_LAMBDAS3__BUCKET_PERMISSIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lambdaToS3Builder_lambdas3EClass,
				LAMBDA_TO_S3_BUILDER_LAMBDAS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToS3Builder_lambdas3EClass,
				LAMBDA_TO_S3_BUILDER_LAMBDAS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(lambdaToS3Builder_lambdas3EClass,
				LAMBDA_TO_S3_BUILDER_LAMBDAS3__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToS3Builder_lambdas3EClass,
				LAMBDA_TO_S3_BUILDER_LAMBDAS3__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToS3Builder_lambdas3EClass, LAMBDA_TO_S3_BUILDER_LAMBDAS3__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToS3Builder_lambdas3EClass, LAMBDA_TO_S3_BUILDER_LAMBDAS3__VAR_NAME);
		createEAttribute(lambdaToS3Builder_lambdas3EClass, LAMBDA_TO_S3_BUILDER_LAMBDAS3__IDENTIFIER);
		createEAttribute(lambdaToS3Builder_lambdas3EClass, LAMBDA_TO_S3_BUILDER_LAMBDAS3__ADDITIONAL_CODE);

		lambdaToSnsBuilder_lambdasnsEClass = createEClass(LAMBDA_TO_SNS_BUILDER_LAMBDASNS);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass,
				LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass,
				LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass,
				LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass,
				LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass,
				LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass, LAMBDA_TO_SNS_BUILDER_LAMBDASNS__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass, LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass, LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER);
		createEAttribute(lambdaToSnsBuilder_lambdasnsEClass, LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE);

		lambdaToSqsBuilder_lambdasqsEClass = createEClass(LAMBDA_TO_SQS_BUILDER_LAMBDASQS);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass,
				LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass, LAMBDA_TO_SQS_BUILDER_LAMBDASQS__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass, LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass, LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER);
		createEAttribute(lambdaToSqsBuilder_lambdasqsEClass, LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE);

		lambdaToStepFunctionBuilder_lambdastepfunctionEClass = createEClass(
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__GENERATED_CLASS_NAME);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__VAR_NAME);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__IDENTIFIER);
		createEAttribute(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LAMBDA_TO_STEP_FUNCTION_BUILDER_LAMBDASTEPFUNCTION__ADDITIONAL_CODE);

		s3ToLambdaBuilder_s3lambdaEClass = createEClass(S3_TO_LAMBDA_BUILDER_S3LAMBDA);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass,
				S3_TO_LAMBDA_BUILDER_S3LAMBDA__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass,
				S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass,
				S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass,
				S3_TO_LAMBDA_BUILDER_S3LAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass, S3_TO_LAMBDA_BUILDER_S3LAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass, S3_TO_LAMBDA_BUILDER_S3LAMBDA__VAR_NAME);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass, S3_TO_LAMBDA_BUILDER_S3LAMBDA__IDENTIFIER);
		createEAttribute(s3ToLambdaBuilder_s3lambdaEClass, S3_TO_LAMBDA_BUILDER_S3LAMBDA__ADDITIONAL_CODE);

		s3ToStepFunctionBuilder_s3stepfunctionEClass = createEClass(S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__GENERATED_CLASS_NAME);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER);
		createEAttribute(s3ToStepFunctionBuilder_s3stepfunctionEClass,
				S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE);

		snsToLambdaBuilder_snslambdaEClass = createEClass(SNS_TO_LAMBDA_BUILDER_SNSLAMBDA);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass,
				SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass,
				SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass,
				SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass,
				SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass,
				SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__TOPIC_PROPS_JAVA_LANG_OBJECT_);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass, SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass, SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__VAR_NAME);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass, SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__IDENTIFIER);
		createEAttribute(snsToLambdaBuilder_snslambdaEClass, SNS_TO_LAMBDA_BUILDER_SNSLAMBDA__ADDITIONAL_CODE);

		managedPolicyBuilder_iamEClass = createEClass(MANAGED_POLICY_BUILDER_IAM);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass,
				MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__VAR_NAME);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__IDENTIFIER);
		createEAttribute(managedPolicyBuilder_iamEClass, MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE);

		userBuilder_iamEClass = createEClass(USER_BUILDER_IAM);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__PASSWORD_RESET_REQUIRED_JAVA_LANG_BOOLEAN_);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(userBuilder_iamEClass,
				USER_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__USER_NAME_JAVA_LANG_STRING_);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__VAR_NAME);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__IDENTIFIER);
		createEAttribute(userBuilder_iamEClass, USER_BUILDER_IAM__ADDITIONAL_CODE);

		groupBuilder_iamEClass = createEClass(GROUP_BUILDER_IAM);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__GROUP_NAME_JAVA_LANG_STRING_);
		createEAttribute(groupBuilder_iamEClass,
				GROUP_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__VAR_NAME);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__IDENTIFIER);
		createEAttribute(groupBuilder_iamEClass, GROUP_BUILDER_IAM__ADDITIONAL_CODE);

		roleBuilder_iamEClass = createEClass(ROLE_BUILDER_IAM);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass,
				ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__VAR_NAME);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__IDENTIFIER);
		createEAttribute(roleBuilder_iamEClass, ROLE_BUILDER_IAM__ADDITIONAL_CODE);

		policyStatementBuilder_iamEClass = createEClass(POLICY_STATEMENT_BUILDER_IAM);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass,
				POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyStatementBuilder_iamEClass, POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE);

		policyDocumentBuilder_iamEClass = createEClass(POLICY_DOCUMENT_BUILDER_IAM);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_);
		createEAttribute(policyDocumentBuilder_iamEClass,
				POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER);
		createEAttribute(policyDocumentBuilder_iamEClass, POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE);

		sqsToLambdaBuilder_sqslambdaEClass = createEClass(SQS_TO_LAMBDA_BUILDER_SQSLAMBDA);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass,
				SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass, SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__GENERATED_CLASS_NAME);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass, SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__VAR_NAME);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass, SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__IDENTIFIER);
		createEAttribute(sqsToLambdaBuilder_sqslambdaEClass, SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__ADDITIONAL_CODE);

		attributeBuilder_dynamodbEClass = createEClass(ATTRIBUTE_BUILDER_DYNAMODB);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__NAME_JAVA_LANG_STRING_);
		createEAttribute(attributeBuilder_dynamodbEClass,
				ATTRIBUTE_BUILDER_DYNAMODB__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_TYPE_);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(attributeBuilder_dynamodbEClass, ATTRIBUTE_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		tablePropsBuilder_dynamodbEClass = createEClass(TABLE_PROPS_BUILDER_DYNAMODB);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_);
		createEAttribute(tablePropsBuilder_dynamodbEClass,
				TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER);
		createEAttribute(tablePropsBuilder_dynamodbEClass, TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE);

		// Create enums
		flowLogTrafficTypeEEnum = createEEnum(FLOW_LOG_TRAFFIC_TYPE);
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
		subnetTypeEEnum = createEEnum(SUBNET_TYPE);
		apiKeySourceTypeEEnum = createEEnum(API_KEY_SOURCE_TYPE);
		endpointTypeEEnum = createEEnum(ENDPOINT_TYPE);
		methodLoggingLevelEEnum = createEEnum(METHOD_LOGGING_LEVEL);
		validationMethodEEnum = createEEnum(VALIDATION_METHOD);
		securityPolicyEEnum = createEEnum(SECURITY_POLICY);
		integrationTypeEEnum = createEEnum(INTEGRATION_TYPE);
		contentHandlingEEnum = createEEnum(CONTENT_HANDLING);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		passthroughBehaviorEEnum = createEEnum(PASSTHROUGH_BEHAVIOR);
		queueEncryptionEEnum = createEEnum(QUEUE_ENCRYPTION);
		retentionDaysEEnum = createEEnum(RETENTION_DAYS);
		tracingEEnum = createEEnum(TRACING);
		authorizationTypeEEnum = createEEnum(AUTHORIZATION_TYPE);
		jsonSchemaVersionEEnum = createEEnum(JSON_SCHEMA_VERSION);
		jsonSchemaTypeEEnum = createEEnum(JSON_SCHEMA_TYPE);
		effectEEnum = createEEnum(EFFECT);
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		streamViewTypeEEnum = createEEnum(STREAM_VIEW_TYPE);
		removalPolicyEEnum = createEEnum(REMOVAL_POLICY);
		tableEncryptionEEnum = createEEnum(TABLE_ENCRYPTION);
		billingModeEEnum = createEEnum(BILLING_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vpcBuilder_ec2EClass.getESuperTypes().add(this.getServiceResources());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceResourcesEClass, ServiceResources.class, "ServiceResources", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(appBuilder_coreEClass, AppBuilder_core.class, "AppBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppBuilder_core_AutoSynth_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"autoSynth_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap(), ecorePackage.getEString(),
				"context_java_lang_String__java_lang_String_AsMap", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Outdir_java_lang_String_(), ecorePackage.getEString(),
				"outdir_java_lang_String_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_RuntimeInfo_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"runtimeInfo_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_StackTraces_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"stackTraces_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_TreeMetadata_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"treeMetadata_java_lang_Boolean_", null, 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.App", 0, 1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Environmentbuilder_core(), this.getEnvironmentBuilder_core(), null,
				"environmentbuilder_core", null, 0, -1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Defaultstacksynthesizerbuilder_core(),
				this.getDefaultStackSynthesizerBuilder_core(), null, "defaultstacksynthesizerbuilder_core", null, 0, -1,
				AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppBuilder_core_Stackbuilder_core(), this.getStackBuilder_core(), null, "stackbuilder_core",
				null, 0, -1, AppBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultStackSynthesizerBuilder_coreEClass, DefaultStackSynthesizerBuilder_core.class,
				"DefaultStackSynthesizerBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingExternalId_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_(),
				ecorePackage.getEString(), "cloudFormationExecutionRole_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "deployRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_(),
				ecorePackage.getEString(), "fileAssetsBucketName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_(),
				ecorePackage.getEString(), "imageAssetsRepositoryName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_(), ecorePackage.getEString(),
				"qualifier_java_lang_String_", null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.DefaultStackSynthesizer", 0, 1,
				DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DefaultStackSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentBuilder_coreEClass, EnvironmentBuilder_core.class, "EnvironmentBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentBuilder_core_Account_java_lang_String_(), ecorePackage.getEString(),
				"account_java_lang_String_", null, 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_Region_java_lang_String_(), ecorePackage.getEString(),
				"region_java_lang_String_", null, 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Environment", 0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, EnvironmentBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLogOptionsBuilder_ec2EClass, FlowLogOptionsBuilder_ec2.class, "FlowLogOptionsBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(),
				ecorePackage.getEString(),
				"destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference",
				null, 0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(),
				this.getFlowLogTrafficType(), "trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_",
				null, 0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.FlowLogOptions", 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLogOptionsBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, FlowLogOptionsBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackBuilder_coreEClass, StackBuilder_core.class, "StackBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackBuilder_core_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(),
				ecorePackage.getEString(), "envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference",
				null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_StackName_java_lang_String_(), ecorePackage.getEString(),
				"stackName_java_lang_String_", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(),
				ecorePackage.getEString(),
				"synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference", null, 0,
				1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap(), ecorePackage.getEString(),
				"tags_java_lang_String__java_lang_String_AsMap", null, 0, 1, StackBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_TerminationProtection_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "terminationProtection_java_lang_Boolean_", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Stack", 0, 1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStackBuilder_core_Serviceresources(), this.getServiceResources(), null, "serviceresources",
				null, 0, -1, StackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcBuilder_ec2EClass, VpcBuilder_ec2.class, "VpcBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcBuilder_ec2_Cidr_java_lang_String_(), ecorePackage.getEString(), "cidr_java_lang_String_",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_(),
				this.getDefaultInstanceTenancy(),
				"defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsHostnames_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableDnsSupport_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap(),
				ecorePackage.getEString(),
				"flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap(),
				ecorePackage.getEString(),
				"gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_MaxAzs_java_lang_Number_(), ecorePackage.getEInt(), "maxAzs_java_lang_Number_",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference(),
				ecorePackage.getEString(),
				"natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_NatGateways_java_lang_Number_(), ecorePackage.getEInt(),
				"natGateways_java_lang_Number_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference",
				null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList(),
				ecorePackage.getEString(),
				"subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap(),
				ecorePackage.getEString(),
				"vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap", null,
				0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"vpnGateway_java_lang_Boolean_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_(), ecorePackage.getEInt(),
				"vpnGatewayAsn_java_lang_Number_", null, 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(),
				"vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Vpc", 0, 1, VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				VpcBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(subnetBuilder_ec2EClass, SubnetBuilder_ec2.class, "SubnetBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_(), ecorePackage.getEString(),
				"availabilityZone_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_CidrBlock_java_lang_String_(), ecorePackage.getEString(),
				"cidrBlock_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_VpcId_java_lang_String_(), ecorePackage.getEString(),
				"vpcId_java_lang_String_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"mapPublicIpOnLaunch_java_lang_Boolean_", null, 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.ec2.Subnet", 0, 1, SubnetBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				SubnetBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(subnetSelectionBuilder_ec2EClass, SubnetSelectionBuilder_ec2.class, "SubnetSelectionBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList(),
				ecorePackage.getEString(), "availabilityZones_java_lang_String_AsList", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"onePerAz_java_lang_Boolean_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_(), ecorePackage.getEString(),
				"subnetGroupName_java_lang_String_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_(), ecorePackage.getEString(),
				"subnetName_java_lang_String_", null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_(),
				this.getSubnetType(), "subnetType_software_amazon_awscdk_services_ec2_SubnetType_", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SubnetSelection", 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnetSelectionBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SubnetSelectionBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayVpcEndpointBuilder_ec2EClass, GatewayVpcEndpointBuilder_ec2.class,
				"GatewayVpcEndpointBuilder_ec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference(),
				ecorePackage.getEString(),
				"serviceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference",
				null, 0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList(),
				ecorePackage.getEString(), "subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList", null,
				0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.GatewayVpcEndpoint", 0, 1,
				GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayVpcEndpointBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, GatewayVpcEndpointBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodDeploymentOptionsBuilder_apigatewayEClass, MethodDeploymentOptionsBuilder_apigateway.class,
				"MethodDeploymentOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheDataEncrypted_java_lang_Boolean_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodDeploymentOptionsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_CachingEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cachingEnabled_java_lang_Boolean_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "dataTraceEnabled_java_lang_Boolean_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodDeploymentOptionsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(),
				this.getMethodLoggingLevel(),
				"loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "metricsEnabled_java_lang_Boolean_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_(),
				ecorePackage.getEInt(), "throttlingBurstLimit_java_lang_Number_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_(),
				ecorePackage.getEInt(), "throttlingRateLimit_java_lang_Number_", null, 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.MethodDeploymentOptions", 0, 1,
				MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeploymentOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, MethodDeploymentOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointConfigurationBuilder_apigatewayEClass, EndpointConfigurationBuilder_apigateway.class,
				"EndpointConfigurationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getEndpointConfigurationBuilder_apigateway_Types_software_amazon_awscdk_services_apigateway_EndpointType_AsList(),
				ecorePackage.getEString(), "types_software_amazon_awscdk_services_apigateway_EndpointType_AsList", null,
				0, 1, EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEndpointConfigurationBuilder_apigateway_VpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList(),
				ecorePackage.getEString(), "vpcEndpoints_software_amazon_awscdk_services_ec2_IVpcEndpoint_AsList", null,
				0, 1, EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointConfigurationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.EndpointConfiguration", 0, 1,
				EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointConfigurationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointConfigurationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointConfigurationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, EndpointConfigurationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageOptionsBuilder_apigatewayEClass, StageOptionsBuilder_apigateway.class,
				"StageOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getStageOptionsBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(),
				ecorePackage.getEString(),
				"accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference",
				null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageOptionsBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(),
				ecorePackage.getEString(),
				"accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference",
				null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheClusterEnabled_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_CacheClusterSize_java_lang_String_(),
				ecorePackage.getEString(), "cacheClusterSize_java_lang_String_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_ClientCertificateId_java_lang_String_(),
				ecorePackage.getEString(), "clientCertificateId_java_lang_String_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_DocumentationVersion_java_lang_String_(),
				ecorePackage.getEString(), "documentationVersion_java_lang_String_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageOptionsBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(),
				ecorePackage.getEString(),
				"methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap",
				null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_StageName_java_lang_String_(), ecorePackage.getEString(),
				"stageName_java_lang_String_", null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_TracingEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "tracingEnabled_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "variables_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheDataEncrypted_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageOptionsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_CachingEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cachingEnabled_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "dataTraceEnabled_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageOptionsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(),
				this.getMethodLoggingLevel(),
				"loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "metricsEnabled_java_lang_Boolean_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_(),
				ecorePackage.getEInt(), "throttlingBurstLimit_java_lang_Number_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_(),
				ecorePackage.getEInt(), "throttlingRateLimit_java_lang_Number_", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.StageOptions", 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, StageOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostedZoneBuilder_route53EClass, HostedZoneBuilder_route53.class, "HostedZoneBuilder_route53",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostedZoneBuilder_route53_ZoneName_java_lang_String_(), ecorePackage.getEString(),
				"zoneName_java_lang_String_", null, 0, 1, HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_Comment_java_lang_String_(), ecorePackage.getEString(),
				"comment_java_lang_String_", null, 0, 1, HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_QueryLogsLogGroupArn_java_lang_String_(), ecorePackage.getEString(),
				"queryLogsLogGroupArn_java_lang_String_", null, 0, 1, HostedZoneBuilder_route53.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_Vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList(),
				ecorePackage.getEString(), "vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList", null, 0, 1,
				HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.route53.HostedZone", 0, 1,
				HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostedZoneBuilder_route53_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, HostedZoneBuilder_route53.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsValidatedCertificateBuilder_certificatemanagerEClass,
				DnsValidatedCertificateBuilder_certificatemanager.class,
				"DnsValidatedCertificateBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_HostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference(),
				ecorePackage.getEString(),
				"hostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDnsValidatedCertificateBuilder_certificatemanager_CustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"customResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Region_java_lang_String_(),
				ecorePackage.getEString(), "region_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Route53Endpoint_java_lang_String_(),
				ecorePackage.getEString(), "route53Endpoint_java_lang_String_", null, 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate", 0, 1,
				DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsValidatedCertificateBuilder_certificatemanager_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DnsValidatedCertificateBuilder_certificatemanager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationResponseBuilder_apigatewayEClass, IntegrationResponseBuilder_apigateway.class,
				"IntegrationResponseBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrationResponseBuilder_apigateway_StatusCode_java_lang_String_(),
				ecorePackage.getEString(), "statusCode_java_lang_String_", null, 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationResponseBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(),
				this.getContentHandling(),
				"contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_", null, 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "responseParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationResponseBuilder_apigateway_ResponseTemplates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "responseTemplates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationResponseBuilder_apigateway_SelectionPattern_java_lang_String_(),
				ecorePackage.getEString(), "selectionPattern_java_lang_String_", null, 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationResponseBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.IntegrationResponse", 0, 1,
				IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationResponseBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationResponseBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationResponseBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, IntegrationResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateBuilder_certificatemanagerEClass, CertificateBuilder_certificatemanager.class,
				"CertificateBuilder_certificatemanager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificateBuilder_certificatemanager_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_SubjectAlternativeNames_java_lang_String_AsList(),
				ecorePackage.getEString(), "subjectAlternativeNames_java_lang_String_AsList", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificateBuilder_certificatemanager_ValidationDomains_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "validationDomains_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCertificateBuilder_certificatemanager_ValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_(),
				this.getValidationMethod(),
				"validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_", null, 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.certificatemanager.Certificate", 0, 1,
				CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateBuilder_certificatemanager_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CertificateBuilder_certificatemanager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainNameOptionsBuilder_apigatewayEClass, DomainNameOptionsBuilder_apigateway.class,
				"DomainNameOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDomainNameOptionsBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(),
				ecorePackage.getEString(),
				"certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference",
				null, 0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameOptionsBuilder_apigateway_DomainName_java_lang_String_(), ecorePackage.getEString(),
				"domainName_java_lang_String_", null, 0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNameOptionsBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(),
				this.getEndpointType(), "endpointType_software_amazon_awscdk_services_apigateway_EndpointType_", null,
				0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNameOptionsBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(),
				this.getSecurityPolicy(), "securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_",
				null, 0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.DomainNameOptions", 0, 1,
				DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DomainNameOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLoadBalancerBuilder_elasticloadbalancingv2EClass,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class,
				"NetworkLoadBalancerBuilder_elasticloadbalancingv2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_DeletionProtection_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deletionProtection_java_lang_Boolean_", null, 0, 1,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_InternetFacing_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "internetFacing_java_lang_Boolean_", null, 0, 1,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_LoadBalancerName_java_lang_String_(),
				ecorePackage.getEString(), "loadBalancerName_java_lang_String_", null, 0, 1,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null,
				0, 1, NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_CrossZoneEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "crossZoneEnabled_java_lang_Boolean_", null, 0, 1,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer", 0, 1,
				NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLoadBalancerBuilder_elasticloadbalancingv2_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, NetworkLoadBalancerBuilder_elasticloadbalancingv2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcLinkBuilder_apigatewayEClass, VpcLinkBuilder_apigateway.class, "VpcLinkBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcLinkBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, VpcLinkBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcLinkBuilder_apigateway_Targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(),
				ecorePackage.getEString(),
				"targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList", null, 0,
				1, VpcLinkBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkBuilder_apigateway_VpcLinkName_java_lang_String_(), ecorePackage.getEString(),
				"vpcLinkName_java_lang_String_", null, 0, 1, VpcLinkBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.VpcLink", 0, 1,
				VpcLinkBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcLinkBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				VpcLinkBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, VpcLinkBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationOptionsBuilder_apigatewayEClass, IntegrationOptionsBuilder_apigateway.class,
				"IntegrationOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList(),
				ecorePackage.getEString(), "cacheKeyParameters_java_lang_String_AsList", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_CacheNamespace_java_lang_String_(),
				ecorePackage.getEString(), "cacheNamespace_java_lang_String_", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(),
				this.getConnectionType(), "connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_",
				null, 0, 1, IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(),
				this.getContentHandling(),
				"contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "credentialsPassthrough_java_lang_Boolean_", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(),
				ecorePackage.getEString(),
				"integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList", null, 0,
				1, IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(),
				this.getPassthroughBehavior(),
				"passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestTemplates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationOptionsBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(),
				ecorePackage.getEString(),
				"vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference", null, 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.IntegrationOptions", 0, 1,
				IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, IntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationBuilder_apigatewayEClass, IntegrationBuilder_apigateway.class,
				"IntegrationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getIntegrationBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_IntegrationType_(),
				this.getIntegrationType(), "type_software_amazon_awscdk_services_apigateway_IntegrationType_", null, 0,
				1, IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_IntegrationHttpMethod_java_lang_String_(),
				ecorePackage.getEString(), "integrationHttpMethod_java_lang_String_", null, 0, 1,
				IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_Uri_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"uri_java_lang_Object_", null, 0, 1, IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.Integration", 0, 1,
				IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, IntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corsOptionsBuilder_apigatewayEClass, CorsOptionsBuilder_apigateway.class,
				"CorsOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorsOptionsBuilder_apigateway_AllowOrigins_java_lang_String_AsList(),
				ecorePackage.getEString(), "allowOrigins_java_lang_String_AsList", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_AllowCredentials_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowCredentials_java_lang_Boolean_", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_AllowHeaders_java_lang_String_AsList(),
				ecorePackage.getEString(), "allowHeaders_java_lang_String_AsList", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_AllowMethods_java_lang_String_AsList(),
				ecorePackage.getEString(), "allowMethods_java_lang_String_AsList", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_DisableCache_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "disableCache_java_lang_Boolean_", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_ExposeHeaders_java_lang_String_AsList(),
				ecorePackage.getEString(), "exposeHeaders_java_lang_String_AsList", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCorsOptionsBuilder_apigateway_MaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference", null,
				0, 1, CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_StatusCode_java_lang_Number_(), ecorePackage.getEInt(),
				"statusCode_java_lang_Number_", null, 0, 1, CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.CorsOptions", 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorsOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, CorsOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyBuilder_kmsEClass, KeyBuilder_kms.class, "KeyBuilder_kms", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyBuilder_kms_Alias_java_lang_String_(), ecorePackage.getEString(),
				"alias_java_lang_String_", null, 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_Enabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enabled_java_lang_Boolean_", null, 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_EnableKeyRotation_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enableKeyRotation_java_lang_Boolean_", null, 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKeyBuilder_kms_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_TrustAccountIdentities_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"trustAccountIdentities_java_lang_Boolean_", null, 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.kms.Key", 0, 1, KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyBuilder_kms_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				KeyBuilder_kms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deadLetterQueueBuilder_sqsEClass, DeadLetterQueueBuilder_sqs.class, "DeadLetterQueueBuilder_sqs",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadLetterQueueBuilder_sqs_MaxReceiveCount_java_lang_Number_(), ecorePackage.getEInt(),
				"maxReceiveCount_java_lang_Number_", null, 0, 1, DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDeadLetterQueueBuilder_sqs_QueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(),
				ecorePackage.getEString(), "queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference",
				null, 0, 1, DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeadLetterQueueBuilder_sqs_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.sqs.DeadLetterQueue", 0, 1,
				DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeadLetterQueueBuilder_sqs_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeadLetterQueueBuilder_sqs_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeadLetterQueueBuilder_sqs_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, DeadLetterQueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueBuilder_sqsEClass, QueueBuilder_sqs.class, "QueueBuilder_sqs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueBuilder_sqs_ContentBasedDeduplication_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "contentBasedDeduplication_java_lang_Boolean_", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_DataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getQueueBuilder_sqs_DeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference",
				null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_DeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_Encryption_software_amazon_awscdk_services_sqs_QueueEncryption_(),
				this.getQueueEncryption(), "encryption_software_amazon_awscdk_services_sqs_QueueEncryption_", null, 0,
				1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getQueueBuilder_sqs_EncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(),
				"encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_Fifo_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"fifo_java_lang_Boolean_", null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_MaxMessageSizeBytes_java_lang_Number_(), ecorePackage.getEInt(),
				"maxMessageSizeBytes_java_lang_Number_", null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_QueueName_java_lang_String_(), ecorePackage.getEString(),
				"queueName_java_lang_String_", null, 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getQueueBuilder_sqs_ReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getQueueBuilder_sqs_RetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getQueueBuilder_sqs_VisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.sqs.Queue", 0, 1, QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueBuilder_sqs_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				QueueBuilder_sqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(versionOptionsBuilder_lambdaEClass, VersionOptionsBuilder_lambda.class,
				"VersionOptionsBuilder_lambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionOptionsBuilder_lambda_CodeSha256_java_lang_String_(), ecorePackage.getEString(),
				"codeSha256_java_lang_String_", null, 0, 1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_ProvisionedConcurrentExecutions_java_lang_Number_(),
				ecorePackage.getEInt(), "provisionedConcurrentExecutions_java_lang_Number_", null, 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVersionOptionsBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVersionOptionsBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(),
				ecorePackage.getEString(),
				"onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference", null, 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVersionOptionsBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(),
				ecorePackage.getEString(),
				"onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference", null, 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_RetryAttempts_java_lang_Number_(), ecorePackage.getEInt(),
				"retryAttempts_java_lang_Number_", null, 0, 1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.lambda.VersionOptions", 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionOptionsBuilder_lambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VersionOptionsBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerVersionBuilder_lambdaEClass, LayerVersionBuilder_lambda.class, "LayerVersionBuilder_lambda",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLayerVersionBuilder_lambda_CodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(),
				ecorePackage.getEString(), "codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference", null,
				0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLayerVersionBuilder_lambda_CompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList(),
				ecorePackage.getEString(), "compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList",
				null, 0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_LayerVersionName_java_lang_String_(), ecorePackage.getEString(),
				"layerVersionName_java_lang_String_", null, 0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_License_java_lang_String_(), ecorePackage.getEString(),
				"license_java_lang_String_", null, 0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.lambda.LayerVersion", 0, 1,
				LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerVersionBuilder_lambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LayerVersionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupBuilder_ec2EClass, SecurityGroupBuilder_ec2.class, "SecurityGroupBuilder_ec2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_(), ecorePackage.getEString(),
				"securityGroupName_java_lang_String_", null, 0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.ec2.SecurityGroup", 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroupBuilder_ec2_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, SecurityGroupBuilder_ec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBuilder_lambdaEClass, FunctionBuilder_lambda.class, "FunctionBuilder_lambda", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFunctionBuilder_lambda_MaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_OnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(),
				ecorePackage.getEString(),
				"onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_OnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference(),
				ecorePackage.getEString(),
				"onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_RetryAttempts_java_lang_Number_(), ecorePackage.getEInt(),
				"retryAttempts_java_lang_Number_", null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_AllowAllOutbound_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowAllOutbound_java_lang_Boolean_", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_CurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference(),
				ecorePackage.getEString(),
				"currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference",
				null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_DeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_DeadLetterQueueEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deadLetterQueueEnabled_java_lang_Boolean_", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Environment_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "environment_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Events_software_amazon_awscdk_services_lambda_IEventSource_AsList(),
				ecorePackage.getEString(), "events_software_amazon_awscdk_services_lambda_IEventSource_AsList", null, 0,
				1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_FunctionName_java_lang_String_(), ecorePackage.getEString(),
				"functionName_java_lang_String_", null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_InitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList(),
				ecorePackage.getEString(), "layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_LogRetention_software_amazon_awscdk_services_logs_RetentionDays_(),
				this.getRetentionDays(), "logRetention_software_amazon_awscdk_services_logs_RetentionDays_", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_LogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_MemorySize_java_lang_Number_(), ecorePackage.getEInt(),
				"memorySize_java_lang_Number_", null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_ReservedConcurrentExecutions_java_lang_Number_(),
				ecorePackage.getEInt(), "reservedConcurrentExecutions_java_lang_Number_", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference(),
				ecorePackage.getEString(),
				"securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(),
				ecorePackage.getEString(), "securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList",
				null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Tracing_software_amazon_awscdk_services_lambda_Tracing_(),
				this.getTracing(), "tracing_software_amazon_awscdk_services_lambda_Tracing_", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(),
				ecorePackage.getEString(), "vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference", null, 0,
				1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(),
				ecorePackage.getEString(),
				"vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_CodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference(),
				ecorePackage.getEString(), "codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference", null,
				0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Handler_java_lang_String_(), ecorePackage.getEString(),
				"handler_java_lang_String_", null, 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getFunctionBuilder_lambda_RuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference(),
				ecorePackage.getEString(),
				"runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.lambda.Function", 0, 1, FunctionBuilder_lambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionBuilder_lambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, FunctionBuilder_lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestAuthorizerBuilder_apigatewayEClass, RequestAuthorizerBuilder_apigateway.class,
				"RequestAuthorizerBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRequestAuthorizerBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestAuthorizerBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_AuthorizerName_java_lang_String_(),
				ecorePackage.getEString(), "authorizerName_java_lang_String_", null, 0, 1,
				RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestAuthorizerBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_IdentitySources_java_lang_String_AsList(),
				ecorePackage.getEString(), "identitySources_java_lang_String_AsList", null, 0, 1,
				RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RequestAuthorizer", 0, 1,
				RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RequestAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenAuthorizerBuilder_apigatewayEClass, TokenAuthorizerBuilder_apigateway.class,
				"TokenAuthorizerBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getTokenAuthorizerBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTokenAuthorizerBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_AuthorizerName_java_lang_String_(),
				ecorePackage.getEString(), "authorizerName_java_lang_String_", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTokenAuthorizerBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_IdentitySource_java_lang_String_(),
				ecorePackage.getEString(), "identitySource_java_lang_String_", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_ValidationRegex_java_lang_String_(),
				ecorePackage.getEString(), "validationRegex_java_lang_String_", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.TokenAuthorizer", 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, TokenAuthorizerBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonSchemaBuilder_apigatewayEClass, JsonSchemaBuilder_apigateway.class,
				"JsonSchemaBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_AdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(),
				"additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_AdditionalProperties_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "additionalProperties_java_lang_Boolean_", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_AllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(), "allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_AnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(), "anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_ContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(), "contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList",
				null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(),
				ecorePackage.getEString(),
				"definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Dependencies_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "dependencies_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_EnumValue_java_lang_Object_AsList(), ecorePackage.getEString(),
				"enumValue_java_lang_Object_AsList", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_ExclusiveMaximum_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "exclusiveMaximum_java_lang_Boolean_", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_ExclusiveMinimum_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "exclusiveMinimum_java_lang_Boolean_", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Format_java_lang_String_(), ecorePackage.getEString(),
				"format_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Id_java_lang_String_(), ecorePackage.getEString(),
				"id_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_ItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(), "items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Maximum_java_lang_Number_(), ecorePackage.getEInt(),
				"maximum_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MaxItems_java_lang_Number_(), ecorePackage.getEInt(),
				"maxItems_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MaxLength_java_lang_Number_(), ecorePackage.getEInt(),
				"maxLength_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MaxProperties_java_lang_Number_(), ecorePackage.getEInt(),
				"maxProperties_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Minimum_java_lang_Number_(), ecorePackage.getEInt(),
				"minimum_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MinItems_java_lang_Number_(), ecorePackage.getEInt(),
				"minItems_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MinLength_java_lang_Number_(), ecorePackage.getEInt(),
				"minLength_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MinProperties_java_lang_Number_(), ecorePackage.getEInt(),
				"minProperties_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_MultipleOf_java_lang_Number_(), ecorePackage.getEInt(),
				"multipleOf_java_lang_Number_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_NotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_OneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(),
				ecorePackage.getEString(), "oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Pattern_java_lang_String_(), ecorePackage.getEString(),
				"pattern_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_PatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(),
				ecorePackage.getEString(),
				"patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(),
				ecorePackage.getEString(),
				"properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_PropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null,
				0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Ref_java_lang_String_(), ecorePackage.getEString(),
				"ref_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Required_java_lang_String_AsList(), ecorePackage.getEString(),
				"required_java_lang_String_AsList", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_(),
				this.getJsonSchemaVersion(), "schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_",
				null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Title_java_lang_String_(), ecorePackage.getEString(),
				"title_java_lang_String_", null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_JsonSchemaType_(),
				this.getJsonSchemaType(), "type_software_amazon_awscdk_services_apigateway_JsonSchemaType_", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getJsonSchemaBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList(),
				ecorePackage.getEString(), "type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList",
				null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_UniqueItems_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "uniqueItems_java_lang_Boolean_", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.JsonSchema", 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonSchemaBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, JsonSchemaBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelBuilder_apigatewayEClass, ModelBuilder_apigateway.class, "ModelBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getModelBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"schemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_ContentType_java_lang_String_(), ecorePackage.getEString(),
				"contentType_java_lang_String_", null, 0, 1, ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_ModelName_java_lang_String_(), ecorePackage.getEString(),
				"modelName_java_lang_String_", null, 0, 1, ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getModelBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.apigateway.Model", 0, 1, ModelBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ModelBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestValidatorOptionsBuilder_apigatewayEClass, RequestValidatorOptionsBuilder_apigateway.class,
				"RequestValidatorOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_RequestValidatorName_java_lang_String_(),
				ecorePackage.getEString(), "requestValidatorName_java_lang_String_", null, 0, 1,
				RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestBody_java_lang_Boolean_", null, 0, 1,
				RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestParameters_java_lang_Boolean_", null, 0, 1,
				RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RequestValidatorOptions", 0, 1,
				RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RequestValidatorOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestValidatorBuilder_apigatewayEClass, RequestValidatorBuilder_apigateway.class,
				"RequestValidatorBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestValidatorBuilder_apigateway_RequestValidatorName_java_lang_String_(),
				ecorePackage.getEString(), "requestValidatorName_java_lang_String_", null, 0, 1,
				RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestBody_java_lang_Boolean_", null, 0, 1,
				RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestParameters_java_lang_Boolean_", null, 0, 1,
				RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestValidatorBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RequestValidator", 0, 1,
				RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RequestValidatorBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodResponseBuilder_apigatewayEClass, MethodResponseBuilder_apigateway.class,
				"MethodResponseBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodResponseBuilder_apigateway_StatusCode_java_lang_String_(), ecorePackage.getEString(),
				"statusCode_java_lang_String_", null, 0, 1, MethodResponseBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodResponseBuilder_apigateway_ResponseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(),
				ecorePackage.getEString(),
				"responseModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap", null, 0, 1,
				MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodResponseBuilder_apigateway_ResponseParameters_java_lang_String__java_lang_Boolean_AsMap(),
				ecorePackage.getEString(), "responseParameters_java_lang_String__java_lang_Boolean_AsMap", null, 0, 1,
				MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodResponseBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.MethodResponse", 0, 1,
				MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodResponseBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodResponseBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodResponseBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, MethodResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodOptionsBuilder_apigatewayEClass, MethodOptionsBuilder_apigateway.class,
				"MethodOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodOptionsBuilder_apigateway_ApiKeyRequired_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "apiKeyRequired_java_lang_Boolean_", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_AuthorizationScopes_java_lang_String_AsList(),
				ecorePackage.getEString(), "authorizationScopes_java_lang_String_AsList", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_AuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_(),
				this.getAuthorizationType(),
				"authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_AuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference(),
				ecorePackage.getEString(),
				"authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference", null, 0,
				1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_MethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList(),
				ecorePackage.getEString(),
				"methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_OperationName_java_lang_String_(), ecorePackage.getEString(),
				"operationName_java_lang_String_", null, 0, 1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_RequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap(),
				ecorePackage.getEString(),
				"requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_Boolean_AsMap(),
				ecorePackage.getEString(), "requestParameters_java_lang_String__java_lang_Boolean_AsMap", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_RequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference(),
				ecorePackage.getEString(),
				"requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference",
				null, 0, 1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodOptionsBuilder_apigateway_RequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference(),
				ecorePackage.getEString(),
				"requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference",
				null, 0, 1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.MethodOptions", 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, MethodOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restApiPropsBuilder_apigatewayEClass, RestApiPropsBuilder_apigateway.class,
				"RestApiPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(),
				this.getApiKeySourceType(),
				"apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "binaryMediaTypes_java_lang_String_AsList", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(),
				ecorePackage.getEString(),
				"endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(),
				ecorePackage.getEString(),
				"endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_MinimumCompressionSize_java_lang_Number_(),
				ecorePackage.getEInt(), "minimumCompressionSize_java_lang_Number_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"deploy_java_lang_Boolean_", null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RestApiProps", 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, RestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiGatewayToDynamoDBBuilder_apigatewaydynamodbEClass,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, "ApiGatewayToDynamoDBBuilder_apigatewaydynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowCreateOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowCreateOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowDeleteOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowDeleteOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowReadOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowReadOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AllowUpdateOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowUpdateOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_ApiGatewayProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "apiGatewayProps_java_lang_Object_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_CreateRequestTemplate_java_lang_String_(),
				ecorePackage.getEString(), "createRequestTemplate_java_lang_String_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1, ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_UpdateRequestTemplate_java_lang_String_(),
				ecorePackage.getEString(), "updateRequestTemplate_java_lang_String_", null, 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.apigatewaydynamodb.ApiGatewayToDynamoDB", 0, 1,
				ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToDynamoDBBuilder_apigatewaydynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiGatewayToLambdaBuilder_apigatewaylambdaEClass, ApiGatewayToLambdaBuilder_apigatewaylambda.class,
				"ApiGatewayToLambdaBuilder_apigatewaylambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_ApiGatewayProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "apiGatewayProps_java_lang_Object_", null, 0, 1,
				ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiGatewayToLambdaBuilder_apigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_LambdaFunctionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "lambdaFunctionProps_java_lang_Object_", null, 0, 1,
				ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.apigatewaylambda.ApiGatewayToLambda", 0, 1,
				ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToLambdaBuilder_apigatewaylambda_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ApiGatewayToLambdaBuilder_apigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiGatewayToSqsBuilder_apigatewaysqsEClass, ApiGatewayToSqsBuilder_apigatewaysqs.class,
				"ApiGatewayToSqsBuilder_apigatewaysqs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_AllowCreateOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowCreateOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_AllowDeleteOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowDeleteOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_AllowReadOperation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowReadOperation_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_ApiGatewayProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "apiGatewayProps_java_lang_Object_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_CreateRequestTemplate_java_lang_String_(),
				ecorePackage.getEString(), "createRequestTemplate_java_lang_String_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_DeployDeadLetterQueue_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deployDeadLetterQueue_java_lang_Boolean_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_MaxReceiveCount_java_lang_Number_(),
				ecorePackage.getEInt(), "maxReceiveCount_java_lang_Number_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_QueueProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "queueProps_java_lang_Object_", null, 0, 1,
				ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.apigatewaysqs.ApiGatewayToSqs", 0,
				1, ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiGatewayToSqsBuilder_apigatewaysqs_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ApiGatewayToSqsBuilder_apigatewaysqs.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudFrontToApiGatewayBuilder_cloudfrontapigatewayEClass,
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class,
				"CloudFrontToApiGatewayBuilder_cloudfrontapigateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_ExistingApiGatewayObjWithRestApi_software_amazon_awscdk_services_apigateway_RestApi_AsReference(),
				ecorePackage.getEString(),
				"existingApiGatewayObjWithRestApi_software_amazon_awscdk_services_apigateway_RestApi_AsReference", null,
				0, 1, CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_CloudFrontDistributionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "cloudFrontDistributionProps_java_lang_Object_", null, 0, 1,
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_InsertHttpSecurityHeaders_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "insertHttpSecurityHeaders_java_lang_Boolean_", null, 0, 1,
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.cloudfrontapigateway.CloudFrontToApiGateway", 0, 1,
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayBuilder_cloudfrontapigateway_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				CloudFrontToApiGatewayBuilder_cloudfrontapigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaEClass,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class,
				"CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_ApiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReference(),
				ecorePackage.getEString(),
				"apiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReference",
				null, 0, 1, CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_CloudFrontDistributionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "cloudFrontDistributionProps_java_lang_Object_", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_InsertHttpSecurityHeaders_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "insertHttpSecurityHeaders_java_lang_Boolean_", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.cloudfrontapigatewaylambda.CloudFrontToApiGatewayToLambda",
				0, 1, CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_VarName(),
				ecorePackage.getEString(), "varName", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudFrontToS3Builder_cloudfronts3EClass, CloudFrontToS3Builder_cloudfronts3.class,
				"CloudFrontToS3Builder_cloudfronts3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCloudFrontToS3Builder_cloudfronts3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_CloudFrontDistributionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "cloudFrontDistributionProps_java_lang_Object_", null, 0, 1,
				CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCloudFrontToS3Builder_cloudfronts3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_InsertHttpSecurityHeaders_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "insertHttpSecurityHeaders_java_lang_Boolean_", null, 0, 1,
				CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.cloudfronts3.CloudFrontToS3", 0, 1,
				CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudFrontToS3Builder_cloudfronts3_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CloudFrontToS3Builder_cloudfronts3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaEClass,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class,
				"CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_ApiGatewayProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "apiGatewayProps_java_lang_Object_", null, 0, 1,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_CognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReference(),
				ecorePackage.getEString(),
				"cognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReference",
				null, 0, 1, CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_CognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReference(),
				ecorePackage.getEString(),
				"cognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReference",
				null, 0, 1, CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.cognitoapigatewaylambda.CognitoToApiGatewayToLambda", 0,
				1, CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_VarName(),
				ecorePackage.getEString(), "varName", null, 0, 1,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildDeadLetterQueuePropsBuilder_coreEClass, BuildDeadLetterQueuePropsBuilder_core.class,
				"BuildDeadLetterQueuePropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildDeadLetterQueuePropsBuilder_core_DeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference", null, 0, 1,
				BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDeadLetterQueuePropsBuilder_core_MaxReceiveCount_java_lang_Number_(),
				ecorePackage.getEInt(), "maxReceiveCount_java_lang_Number_", null, 0, 1,
				BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDeadLetterQueuePropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildDeadLetterQueueProps", 0,
				1, BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDeadLetterQueuePropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDeadLetterQueuePropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDeadLetterQueuePropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildDeadLetterQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildQueuePropsBuilder_coreEClass, BuildQueuePropsBuilder_core.class, "BuildQueuePropsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildQueuePropsBuilder_core_DeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference",
				null, 0, 1, BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildQueuePropsBuilder_core_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(),
				ecorePackage.getEString(),
				"existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference", null, 0, 1,
				BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildQueuePropsBuilder_core_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(),
				ecorePackage.getEString(),
				"queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference", null, 0, 1,
				BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildQueuePropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildQueueProps", 0, 1,
				BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildQueuePropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildQueuePropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildQueuePropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, BuildQueuePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildS3BucketPropsBuilder_coreEClass, BuildS3BucketPropsBuilder_core.class,
				"BuildS3BucketPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildS3BucketPropsBuilder_core_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildS3BucketPropsBuilder_core_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildS3BucketPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildS3BucketProps", 0, 1,
				BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildS3BucketPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildS3BucketPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildS3BucketPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, BuildS3BucketPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildEncryptionKeyPropsBuilder_coreEClass, BuildEncryptionKeyPropsBuilder_core.class,
				"BuildEncryptionKeyPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildEncryptionKeyPropsBuilder_core_EncryptionKeyProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "encryptionKeyProps_java_lang_Object_", null, 0, 1,
				BuildEncryptionKeyPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildEncryptionKeyPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildEncryptionKeyProps", 0,
				1, BuildEncryptionKeyPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildEncryptionKeyPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, BuildEncryptionKeyPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildEncryptionKeyPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BuildEncryptionKeyPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildEncryptionKeyPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildEncryptionKeyPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cognitoOptionsBuilder_coreEClass, CognitoOptionsBuilder_core.class, "CognitoOptionsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getCognitoOptionsBuilder_core_IdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference(),
				ecorePackage.getEString(),
				"identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference",
				null, 0, 1, CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoOptionsBuilder_core_UserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference(),
				ecorePackage.getEString(),
				"userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference", null, 0, 1,
				CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCognitoOptionsBuilder_core_UserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference(),
				ecorePackage.getEString(),
				"userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference",
				null, 0, 1, CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.CognitoOptions", 0, 1,
				CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCognitoOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, CognitoOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildKinesisStreamPropsBuilder_coreEClass, BuildKinesisStreamPropsBuilder_core.class,
				"BuildKinesisStreamPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildKinesisStreamPropsBuilder_core_KinesisStreamProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisStreamProps_java_lang_Object_", null, 0, 1,
				BuildKinesisStreamPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisStreamPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildKinesisStreamProps", 0,
				1, BuildKinesisStreamPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisStreamPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, BuildKinesisStreamPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisStreamPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BuildKinesisStreamPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisStreamPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildKinesisStreamPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildKinesisAnalyticsAppPropsBuilder_coreEClass, BuildKinesisAnalyticsAppPropsBuilder_core.class,
				"BuildKinesisAnalyticsAppPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference(),
				ecorePackage.getEString(),
				"kinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference",
				null, 0, 1, BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisAnalyticsProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisAnalyticsProps_java_lang_Object_", null, 0, 1,
				BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisAnalyticsAppPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.core.BuildKinesisAnalyticsAppProps", 0, 1,
				BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisAnalyticsAppPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisAnalyticsAppPropsBuilder_core_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildKinesisAnalyticsAppPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildKinesisAnalyticsAppPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildLambdaFunctionPropsBuilder_coreEClass, BuildLambdaFunctionPropsBuilder_core.class,
				"BuildLambdaFunctionPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildLambdaFunctionPropsBuilder_core_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildLambdaFunctionPropsBuilder_core_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildLambdaFunctionPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildLambdaFunctionProps", 0,
				1, BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildLambdaFunctionPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildLambdaFunctionPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildLambdaFunctionPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildLambdaFunctionPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildDynamoDBTablePropsBuilder_coreEClass, BuildDynamoDBTablePropsBuilder_core.class,
				"BuildDynamoDBTablePropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBuildDynamoDBTablePropsBuilder_core_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1, BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildDynamoDBTablePropsBuilder_core_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(),
				ecorePackage.getEString(),
				"existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference", null, 0, 1,
				BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDynamoDBTablePropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildDynamoDBTableProps", 0,
				1, BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDynamoDBTablePropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDynamoDBTablePropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildDynamoDBTablePropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BuildDynamoDBTablePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildTopicPropsBuilder_coreEClass, BuildTopicPropsBuilder_core.class, "BuildTopicPropsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildTopicPropsBuilder_core_EnableEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enableEncryption_java_lang_Boolean_", null, 0, 1,
				BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBuildTopicPropsBuilder_core_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference",
				null, 0, 1, BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildTopicPropsBuilder_core_TopicProps_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"topicProps_java_lang_Object_", null, 0, 1, BuildTopicPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildTopicPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.core.BuildTopicProps", 0, 1,
				BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildTopicPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildTopicPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildTopicPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, BuildTopicPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaEClass,
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class,
				"DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1, DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(),
				ecorePackage.getEString(),
				"existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference", null, 0, 1,
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.dynamodbstreamlambda.DynamoDBStreamToLambda", 0, 1,
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaEClass,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				"DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_EsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference(),
				ecorePackage.getEString(),
				"esDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference",
				null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(),
				ecorePackage.getEString(),
				"existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.dynamodbstreamlambdaelasticsearchkibana.DynamoDBStreamToLambdaToElasticSearchAndKibana",
				0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_VarName(),
				ecorePackage.getEString(), "varName", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventsRuleToLambdaBuilder_eventsrulelambdaEClass, EventsRuleToLambdaBuilder_eventsrulelambda.class,
				"EventsRuleToLambdaBuilder_eventsrulelambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getEventsRuleToLambdaBuilder_eventsrulelambda_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(),
				ecorePackage.getEString(),
				"eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference", null, 0, 1,
				EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEventsRuleToLambdaBuilder_eventsrulelambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEventsRuleToLambdaBuilder_eventsrulelambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToLambdaBuilder_eventsrulelambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.eventsrulelambda.EventsRuleToLambda", 0, 1,
				EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToLambdaBuilder_eventsrulelambda_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToLambdaBuilder_eventsrulelambda_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToLambdaBuilder_eventsrulelambda_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, EventsRuleToLambdaBuilder_eventsrulelambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventsRuleToStepFunctionBuilder_eventsrulestepfunctionEClass,
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class,
				"EventsRuleToStepFunctionBuilder_eventsrulestepfunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(),
				ecorePackage.getEString(),
				"eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference", null, 0, 1,
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(),
				ecorePackage.getEString(),
				"stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference",
				null, 0, 1, EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.eventsrulestepfunction.EventsRuleToStepFunction", 0, 1,
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventsRuleToStepFunctionBuilder_eventsrulestepfunction_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				EventsRuleToStepFunctionBuilder_eventsrulestepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3EClass,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class,
				"IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference(),
				ecorePackage.getEString(),
				"iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference",
				null, 0, 1, IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_KinesisFirehoseProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisFirehoseProps_java_lang_Object_", null, 0, 1,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.iotkinesisfirehoses3.IotToKinesisFirehoseToS3", 0, 1,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				IotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotToLambdaBuilder_iotlambdaEClass, IotToLambdaBuilder_iotlambda.class,
				"IotToLambdaBuilder_iotlambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getIotToLambdaBuilder_iotlambda_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference(),
				ecorePackage.getEString(),
				"iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference",
				null, 0, 1, IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToLambdaBuilder_iotlambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToLambdaBuilder_iotlambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaBuilder_iotlambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.iotlambda.IotToLambda", 0, 1,
				IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaBuilder_iotlambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaBuilder_iotlambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaBuilder_iotlambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, IotToLambdaBuilder_iotlambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotToLambdaToDynamoDBBuilder_iotlambdadynamodbEClass,
				IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, "IotToLambdaToDynamoDBBuilder_iotlambdadynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_IotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference(),
				ecorePackage.getEString(),
				"iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference",
				null, 0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_TablePermissions_java_lang_String_(),
				ecorePackage.getEString(), "tablePermissions_java_lang_String_", null, 0, 1,
				IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.iotlambdadynamodb.IotToLambdaToDynamoDB", 0, 1,
				IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIotToLambdaToDynamoDBBuilder_iotlambdadynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinesisFirehoseToS3Builder_kinesisfirehoses3EClass,
				KinesisFirehoseToS3Builder_kinesisfirehoses3.class, "KinesisFirehoseToS3Builder_kinesisfirehoses3",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getKinesisFirehoseToS3Builder_kinesisfirehoses3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKinesisFirehoseToS3Builder_kinesisfirehoses3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToS3Builder_kinesisfirehoses3_KinesisFirehoseProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisFirehoseProps_java_lang_Object_", null, 0, 1,
				KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToS3Builder_kinesisfirehoses3_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.kinesisfirehoses3.KinesisFirehoseToS3", 0, 1,
				KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToS3Builder_kinesisfirehoses3_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToS3Builder_kinesisfirehoses3_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToS3Builder_kinesisfirehoses3_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, KinesisFirehoseToS3Builder_kinesisfirehoses3.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalyticsEClass,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class,
				"KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_KinesisAnalyticsProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisAnalyticsProps_java_lang_Object_", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_KinesisFirehoseProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisFirehoseProps_java_lang_Object_", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.kinesisfirehoses3kinesisanalytics.KinesisFirehoseToAnalyticsAndS3",
				0, 1, KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_VarName(),
				ecorePackage.getEString(), "varName", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				KinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinesisStreamsToLambdaBuilder_kinesisstreamslambdaEClass,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class,
				"KinesisStreamsToLambdaBuilder_kinesisstreamslambda", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_EventSourceProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "eventSourceProps_java_lang_Object_", null, 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_KinesisStreamProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "kinesisStreamProps_java_lang_Object_", null, 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_LambdaFunctionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "lambdaFunctionProps_java_lang_Object_", null, 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.kinesisstreamslambda.KinesisStreamsToLambda", 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinesisStreamsToLambdaBuilder_kinesisstreamslambda_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				KinesisStreamsToLambdaBuilder_kinesisstreamslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToDynamoDBBuilder_lambdadynamodbEClass, LambdaToDynamoDBBuilder_lambdadynamodb.class,
				"LambdaToDynamoDBBuilder_lambdadynamodb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaToDynamoDBBuilder_lambdadynamodb_DynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(),
				ecorePackage.getEString(),
				"dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference", null,
				0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToDynamoDBBuilder_lambdadynamodb_ExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(),
				ecorePackage.getEString(),
				"existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference", null, 0, 1,
				LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToDynamoDBBuilder_lambdadynamodb_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToDynamoDBBuilder_lambdadynamodb_TablePermissions_java_lang_String_(),
				ecorePackage.getEString(), "tablePermissions_java_lang_String_", null, 0, 1,
				LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToDynamoDBBuilder_lambdadynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.lambdadynamodb.LambdaToDynamoDB",
				0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToDynamoDBBuilder_lambdadynamodb_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToDynamoDBBuilder_lambdadynamodb_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToDynamoDBBuilder_lambdadynamodb_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaToDynamoDBBuilder_lambdadynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibanaEClass,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class,
				"LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_EsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference(),
				ecorePackage.getEString(),
				"esDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference",
				null, 0, 1, LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.lambdaelasticsearchkibana.LambdaToElasticSearchAndKibana",
				0, 1, LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_VarName(),
				ecorePackage.getEString(), "varName", null, 0, 1,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_Identifier(),
				ecorePackage.getEString(), "identifier", null, 0, 1,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana_AdditionalCode(),
				ecorePackage.getEString(), "additionalCode", null, 0, 1,
				LambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToS3Builder_lambdas3EClass, LambdaToS3Builder_lambdas3.class, "LambdaToS3Builder_lambdas3",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaToS3Builder_lambdas3_BucketPermissions_java_lang_String_AsList(),
				ecorePackage.getEString(), "bucketPermissions_java_lang_String_AsList", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToS3Builder_lambdas3_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToS3Builder_lambdas3_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToS3Builder_lambdas3_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToS3Builder_lambdas3_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToS3Builder_lambdas3_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.lambdas3.LambdaToS3", 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToS3Builder_lambdas3_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToS3Builder_lambdas3_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToS3Builder_lambdas3_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LambdaToS3Builder_lambdas3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToSnsBuilder_lambdasnsEClass, LambdaToSnsBuilder_lambdasns.class,
				"LambdaToSnsBuilder_lambdasns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_EnableEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enableEncryption_java_lang_Boolean_", null, 0, 1,
				LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSnsBuilder_lambdasns_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference",
				null, 0, 1, LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSnsBuilder_lambdasns_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_LambdaFunctionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "lambdaFunctionProps_java_lang_Object_", null, 0, 1,
				LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_TopicProps_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"topicProps_java_lang_Object_", null, 0, 1, LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.lambdasns.LambdaToSns", 0, 1,
				LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSnsBuilder_lambdasns_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LambdaToSnsBuilder_lambdasns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToSqsBuilder_lambdasqsEClass, LambdaToSqsBuilder_lambdasqs.class,
				"LambdaToSqsBuilder_lambdasqs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaToSqsBuilder_lambdasqs_DeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference", null,
				0, 1, LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_DeployDeadLetterQueue_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deployDeadLetterQueue_java_lang_Boolean_", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_EnableQueuePurging_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enableQueuePurging_java_lang_Boolean_", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSqsBuilder_lambdasqs_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSqsBuilder_lambdasqs_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(),
				ecorePackage.getEString(),
				"existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSqsBuilder_lambdasqs_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_MaxReceiveCount_java_lang_Number_(), ecorePackage.getEInt(),
				"maxReceiveCount_java_lang_Number_", null, 0, 1, LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToSqsBuilder_lambdasqs_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(),
				ecorePackage.getEString(),
				"queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.lambdasqs.LambdaToSqs", 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToSqsBuilder_lambdasqs_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LambdaToSqsBuilder_lambdasqs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaToStepFunctionBuilder_lambdastepfunctionEClass,
				LambdaToStepFunctionBuilder_lambdastepfunction.class, "LambdaToStepFunctionBuilder_lambdastepfunction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaToStepFunctionBuilder_lambdastepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(),
				ecorePackage.getEString(),
				"stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference",
				null, 0, 1, LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToStepFunctionBuilder_lambdastepfunction_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaToStepFunctionBuilder_lambdastepfunction_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToStepFunctionBuilder_lambdastepfunction_GeneratedClassName(),
				ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.awsconstructs.services.lambdastepfunction.LambdaToStepFunction", 0, 1,
				LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToStepFunctionBuilder_lambdastepfunction_VarName(), ecorePackage.getEString(),
				"varName", null, 0, 1, LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToStepFunctionBuilder_lambdastepfunction_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaToStepFunctionBuilder_lambdastepfunction_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaToStepFunctionBuilder_lambdastepfunction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(s3ToLambdaBuilder_s3lambdaEClass, S3ToLambdaBuilder_s3lambda.class, "S3ToLambdaBuilder_s3lambda",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getS3ToLambdaBuilder_s3lambda_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToLambdaBuilder_s3lambda_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToLambdaBuilder_s3lambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToLambdaBuilder_s3lambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToLambdaBuilder_s3lambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.s3lambda.S3ToLambda", 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToLambdaBuilder_s3lambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToLambdaBuilder_s3lambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToLambdaBuilder_s3lambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, S3ToLambdaBuilder_s3lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(s3ToStepFunctionBuilder_s3stepfunctionEClass, S3ToStepFunctionBuilder_s3stepfunction.class,
				"S3ToStepFunctionBuilder_s3stepfunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getS3ToStepFunctionBuilder_s3stepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(),
				ecorePackage.getEString(),
				"stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference",
				null, 0, 1, S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToStepFunctionBuilder_s3stepfunction_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(),
				ecorePackage.getEString(),
				"bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference", null, 0, 1,
				S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToStepFunctionBuilder_s3stepfunction_DeployCloudTrail_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deployCloudTrail_java_lang_Boolean_", null, 0, 1,
				S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToStepFunctionBuilder_s3stepfunction_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(),
				ecorePackage.getEString(),
				"eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference", null, 0, 1,
				S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getS3ToStepFunctionBuilder_s3stepfunction_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(),
				ecorePackage.getEString(),
				"existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference", null, 0, 1,
				S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToStepFunctionBuilder_s3stepfunction_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.s3stepfunction.S3ToStepFunction",
				0, 1, S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToStepFunctionBuilder_s3stepfunction_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToStepFunctionBuilder_s3stepfunction_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS3ToStepFunctionBuilder_s3stepfunction_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, S3ToStepFunctionBuilder_s3stepfunction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snsToLambdaBuilder_snslambdaEClass, SnsToLambdaBuilder_snslambda.class,
				"SnsToLambdaBuilder_snslambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnsToLambdaBuilder_snslambda_EnableEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enableEncryption_java_lang_Boolean_", null, 0, 1,
				SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSnsToLambdaBuilder_snslambda_EncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference",
				null, 0, 1, SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSnsToLambdaBuilder_snslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_LambdaFunctionProps_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "lambdaFunctionProps_java_lang_Object_", null, 0, 1,
				SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_TopicProps_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"topicProps_java_lang_Object_", null, 0, 1, SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.snslambda.SnsToLambda", 0, 1,
				SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnsToLambdaBuilder_snslambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SnsToLambdaBuilder_snslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedPolicyBuilder_iamEClass, ManagedPolicyBuilder_iam.class, "ManagedPolicyBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedPolicyBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyBuilder_iam_DocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_ManagedPolicyName_java_lang_String_(), ecorePackage.getEString(),
				"managedPolicyName_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Roles_software_amazon_awscdk_services_iam_IRole_AsList(),
				ecorePackage.getEString(), "roles_software_amazon_awscdk_services_iam_IRole_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getManagedPolicyBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Users_software_amazon_awscdk_services_iam_IUser_AsList(),
				ecorePackage.getEString(), "users_software_amazon_awscdk_services_iam_IUser_AsList", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.ManagedPolicy", 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedPolicyBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ManagedPolicyBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userBuilder_iamEClass, UserBuilder_iam.class, "UserBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserBuilder_iam_Groups_software_amazon_awscdk_services_iam_IGroup_AsList(),
				ecorePackage.getEString(), "groups_software_amazon_awscdk_services_iam_IGroup_AsList", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_PasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference(),
				ecorePackage.getEString(),
				"passwordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_PasswordResetRequired_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"passwordResetRequired_java_lang_Boolean_", null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(), "path_java_lang_String_",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUserBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_UserName_java_lang_String_(), ecorePackage.getEString(),
				"userName_java_lang_String_", null, 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.User", 0, 1, UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				UserBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(groupBuilder_iamEClass, GroupBuilder_iam.class, "GroupBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupBuilder_iam_GroupName_java_lang_String_(), ecorePackage.getEString(),
				"groupName_java_lang_String_", null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.Group", 0, 1, GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				GroupBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roleBuilder_iamEClass, RoleBuilder_iam.class, "RoleBuilder_iam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRoleBuilder_iam_AssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference(),
				ecorePackage.getEString(),
				"assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ExternalId_java_lang_String_(), ecorePackage.getEString(),
				"externalId_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ExternalIds_java_lang_String_AsList(), ecorePackage.getEString(),
				"externalIds_java_lang_String_AsList", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_InlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap(),
				ecorePackage.getEString(),
				"inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_ManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList(),
				ecorePackage.getEString(), "managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_MaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Path_java_lang_String_(), ecorePackage.getEString(), "path_java_lang_String_",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRoleBuilder_iam_PermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference(),
				ecorePackage.getEString(),
				"permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference",
				null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_RoleName_java_lang_String_(), ecorePackage.getEString(),
				"roleName_java_lang_String_", null, 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.iam.Role", 0, 1, RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				RoleBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(policyStatementBuilder_iamEClass, PolicyStatementBuilder_iam.class, "PolicyStatementBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyStatementBuilder_iam_Actions_java_lang_String_AsList(), ecorePackage.getEString(),
				"actions_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Conditions_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "conditions_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Effect_software_amazon_awscdk_services_iam_Effect_(),
				this.getEffect(), "effect_software_amazon_awscdk_services_iam_Effect_", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_NotActions_java_lang_String_AsList(), ecorePackage.getEString(),
				"notActions_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyStatementBuilder_iam_NotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null,
				0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_NotResources_java_lang_String_AsList(), ecorePackage.getEString(),
				"notResources_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Principals_software_amazon_awscdk_services_iam_IPrincipal_AsList(),
				ecorePackage.getEString(), "principals_software_amazon_awscdk_services_iam_IPrincipal_AsList", null, 0,
				1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Resources_java_lang_String_AsList(), ecorePackage.getEString(),
				"resources_java_lang_String_AsList", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Sid_java_lang_String_(), ecorePackage.getEString(),
				"sid_java_lang_String_", null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyStatement", 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatementBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, PolicyStatementBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDocumentBuilder_iamEClass, PolicyDocumentBuilder_iam.class, "PolicyDocumentBuilder_iam",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"assignSids_java_lang_Boolean_", null, 0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(),
				ecorePackage.getEString(), "statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList",
				null, 0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.iam.PolicyDocument", 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDocumentBuilder_iam_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, PolicyDocumentBuilder_iam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqsToLambdaBuilder_sqslambdaEClass, SqsToLambdaBuilder_sqslambda.class,
				"SqsToLambdaBuilder_sqslambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSqsToLambdaBuilder_sqslambda_DeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(),
				ecorePackage.getEString(),
				"deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference", null,
				0, 1, SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_DeployDeadLetterQueue_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deployDeadLetterQueue_java_lang_Boolean_", null, 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSqsToLambdaBuilder_sqslambda_ExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(),
				ecorePackage.getEString(),
				"existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference", null, 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSqsToLambdaBuilder_sqslambda_ExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(),
				ecorePackage.getEString(),
				"existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference", null, 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSqsToLambdaBuilder_sqslambda_LambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(),
				ecorePackage.getEString(),
				"lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference",
				null, 0, 1, SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_MaxReceiveCount_java_lang_Number_(), ecorePackage.getEInt(),
				"maxReceiveCount_java_lang_Number_", null, 0, 1, SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSqsToLambdaBuilder_sqslambda_QueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference(),
				ecorePackage.getEString(),
				"queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference", null, 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.awsconstructs.services.sqslambda.SqsToLambda", 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqsToLambdaBuilder_sqslambda_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SqsToLambdaBuilder_sqslambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeBuilder_dynamodbEClass, AttributeBuilder_dynamodb.class, "AttributeBuilder_dynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeBuilder_dynamodb_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_(),
				this.getAttributeType(), "type_software_amazon_awscdk_services_dynamodb_AttributeType_", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.Attribute", 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, AttributeBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablePropsBuilder_dynamodbEClass, TablePropsBuilder_dynamodb.class, "TablePropsBuilder_dynamodb",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTablePropsBuilder_dynamodb_TableName_java_lang_String_(), ecorePackage.getEString(),
				"tableName_java_lang_String_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(),
				this.getBillingMode(), "billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(),
				this.getTableEncryption(), "encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_", null,
				0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(),
				ecorePackage.getEString(), "encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference",
				null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pointInTimeRecovery_java_lang_Boolean_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"readCapacity_java_lang_Number_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList(),
				ecorePackage.getEString(), "replicationRegions_java_lang_String_AsList", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "serverSideEncryption_java_lang_Boolean_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(),
				ecorePackage.getEString(),
				"sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_(),
				this.getStreamViewType(), "stream_software_amazon_awscdk_services_dynamodb_StreamViewType_", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_(), ecorePackage.getEString(),
				"timeToLiveAttribute_java_lang_String_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_(), ecorePackage.getEInt(),
				"writeCapacity_java_lang_Number_", null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.dynamodb.TableProps", 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablePropsBuilder_dynamodb_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, TablePropsBuilder_dynamodb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flowLogTrafficTypeEEnum, FlowLogTrafficType.class, "FlowLogTrafficType");
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.ACCEPT);
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.ALL);
		addEEnumLiteral(flowLogTrafficTypeEEnum, FlowLogTrafficType.REJECT);

		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		initEEnum(subnetTypeEEnum, SubnetType.class, "SubnetType");
		addEEnumLiteral(subnetTypeEEnum, SubnetType.ISOLATED);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PRIVATE);
		addEEnumLiteral(subnetTypeEEnum, SubnetType.PUBLIC);

		initEEnum(apiKeySourceTypeEEnum, ApiKeySourceType.class, "ApiKeySourceType");
		addEEnumLiteral(apiKeySourceTypeEEnum, ApiKeySourceType.HEADER);
		addEEnumLiteral(apiKeySourceTypeEEnum, ApiKeySourceType.AUTHORIZER);

		initEEnum(endpointTypeEEnum, EndpointType.class, "EndpointType");
		addEEnumLiteral(endpointTypeEEnum, EndpointType.EDGE);
		addEEnumLiteral(endpointTypeEEnum, EndpointType.REGIONAL);
		addEEnumLiteral(endpointTypeEEnum, EndpointType.PRIVATE);

		initEEnum(methodLoggingLevelEEnum, MethodLoggingLevel.class, "MethodLoggingLevel");
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.OFF);
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.ERROR);
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.INFO);

		initEEnum(validationMethodEEnum, ValidationMethod.class, "ValidationMethod");
		addEEnumLiteral(validationMethodEEnum, ValidationMethod.EMAIL);
		addEEnumLiteral(validationMethodEEnum, ValidationMethod.DNS);

		initEEnum(securityPolicyEEnum, SecurityPolicy.class, "SecurityPolicy");
		addEEnumLiteral(securityPolicyEEnum, SecurityPolicy.TLS_10);
		addEEnumLiteral(securityPolicyEEnum, SecurityPolicy.TLS_12);

		initEEnum(integrationTypeEEnum, IntegrationType.class, "IntegrationType");
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.AWS);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.AWS_PROXY);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.HTTP);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.HTTP_PROXY);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.MOCK);

		initEEnum(contentHandlingEEnum, ContentHandling.class, "ContentHandling");
		addEEnumLiteral(contentHandlingEEnum, ContentHandling.CONVERT_TO_BINARY);
		addEEnumLiteral(contentHandlingEEnum, ContentHandling.CONVERT_TO_TEXT);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.INTERNET);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.VPC_LINK);

		initEEnum(passthroughBehaviorEEnum, PassthroughBehavior.class, "PassthroughBehavior");
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.WHEN_NO_MATCH);
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.NEVER);
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.WHEN_NO_TEMPLATES);

		initEEnum(queueEncryptionEEnum, QueueEncryption.class, "QueueEncryption");
		addEEnumLiteral(queueEncryptionEEnum, QueueEncryption.UNENCRYPTED);
		addEEnumLiteral(queueEncryptionEEnum, QueueEncryption.KMS_MANAGED);
		addEEnumLiteral(queueEncryptionEEnum, QueueEncryption.KMS);

		initEEnum(retentionDaysEEnum, RetentionDays.class, "RetentionDays");
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.ONE_DAY);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.THREE_DAYS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.FIVE_DAYS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.ONE_WEEK);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.TWO_WEEKS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.ONE_MONTH);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.TWO_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.THREE_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.FOUR_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.FIVE_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.SIX_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.ONE_YEAR);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.THIRTEEN_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.EIGHTEEN_MONTHS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.TWO_YEARS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.FIVE_YEARS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.TEN_YEARS);
		addEEnumLiteral(retentionDaysEEnum, RetentionDays.INFINITE);

		initEEnum(tracingEEnum, Tracing.class, "Tracing");
		addEEnumLiteral(tracingEEnum, Tracing.ACTIVE);
		addEEnumLiteral(tracingEEnum, Tracing.PASS_THROUGH);
		addEEnumLiteral(tracingEEnum, Tracing.DISABLED);

		initEEnum(authorizationTypeEEnum, AuthorizationType.class, "AuthorizationType");
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.NONE);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.IAM);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.CUSTOM);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.COGNITO);

		initEEnum(jsonSchemaVersionEEnum, JsonSchemaVersion.class, "JsonSchemaVersion");
		addEEnumLiteral(jsonSchemaVersionEEnum, JsonSchemaVersion.DRAFT4);
		addEEnumLiteral(jsonSchemaVersionEEnum, JsonSchemaVersion.DRAFT7);

		initEEnum(jsonSchemaTypeEEnum, JsonSchemaType.class, "JsonSchemaType");
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.NULL);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.BOOLEAN);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.OBJECT);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.ARRAY);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.NUMBER);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.INTEGER);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.STRING);

		initEEnum(effectEEnum, Effect.class, "Effect");
		addEEnumLiteral(effectEEnum, Effect.ALLOW);
		addEEnumLiteral(effectEEnum, Effect.DENY);

		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BINARY);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NUMBER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);

		initEEnum(streamViewTypeEEnum, StreamViewType.class, "StreamViewType");
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.NEW_IMAGE);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.OLD_IMAGE);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.NEW_AND_OLD_IMAGES);
		addEEnumLiteral(streamViewTypeEEnum, StreamViewType.KEYS_ONLY);

		initEEnum(removalPolicyEEnum, RemovalPolicy.class, "RemovalPolicy");
		addEEnumLiteral(removalPolicyEEnum, RemovalPolicy.DESTROY);
		addEEnumLiteral(removalPolicyEEnum, RemovalPolicy.RETAIN);

		initEEnum(tableEncryptionEEnum, TableEncryption.class, "TableEncryption");
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.DEFAULT);
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.CUSTOMER_MANAGED);
		addEEnumLiteral(tableEncryptionEEnum, TableEncryption.AWS_MANAGED);

		initEEnum(billingModeEEnum, BillingMode.class, "BillingMode");
		addEEnumLiteral(billingModeEEnum, BillingMode.PAY_PER_REQUEST);
		addEEnumLiteral(billingModeEEnum, BillingMode.PROVISIONED);

		// Create resource
		createResource(eNS_URI);
	}

} //AwsworkbenchPackageImpl
