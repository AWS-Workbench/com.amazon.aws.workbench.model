/**
 */
package apigateway.impl;

import apigateway.AccessLogDestinationConfigBuilder_apigateway;
import apigateway.ApiDefinitionConfigBuilder_apigateway;
import apigateway.ApiDefinitionS3LocationBuilder_apigateway;
import apigateway.ApiKeyBuilder_apigateway;
import apigateway.ApiKeyOptionsBuilder_apigateway;
import apigateway.ApiKeyPropsBuilder_apigateway;
import apigateway.ApiKeySourceType;
import apigateway.ApigatewayFactory;
import apigateway.ApigatewayPackage;
import apigateway.AuthorizationType;
import apigateway.AwsIntegrationBuilder_apigateway;
import apigateway.AwsIntegrationPropsBuilder_apigateway;
import apigateway.BasePathMappingBuilder_apigateway;
import apigateway.BasePathMappingOptionsBuilder_apigateway;
import apigateway.BasePathMappingPropsBuilder_apigateway;
import apigateway.ConnectionType;
import apigateway.ContentHandling;
import apigateway.CorsOptionsBuilder_apigateway;
import apigateway.DeploymentBuilder_apigateway;
import apigateway.DeploymentPropsBuilder_apigateway;
import apigateway.DomainNameAttributesBuilder_apigateway;
import apigateway.DomainNameBuilder_apigateway;
import apigateway.DomainNameOptionsBuilder_apigateway;
import apigateway.DomainNamePropsBuilder_apigateway;
import apigateway.EndpointConfigurationBuilder_apigateway;
import apigateway.EndpointType;
import apigateway.GatewayResponseBuilder_apigateway;
import apigateway.GatewayResponseOptionsBuilder_apigateway;
import apigateway.GatewayResponsePropsBuilder_apigateway;
import apigateway.HttpIntegrationBuilder_apigateway;
import apigateway.HttpIntegrationPropsBuilder_apigateway;
import apigateway.IntegrationBuilder_apigateway;
import apigateway.IntegrationOptionsBuilder_apigateway;
import apigateway.IntegrationPropsBuilder_apigateway;
import apigateway.IntegrationResponseBuilder_apigateway;
import apigateway.IntegrationType;
import apigateway.JsonSchemaBuilder_apigateway;
import apigateway.JsonSchemaType;
import apigateway.JsonSchemaVersion;
import apigateway.JsonWithStandardFieldPropsBuilder_apigateway;
import apigateway.LambdaAuthorizerPropsBuilder_apigateway;
import apigateway.LambdaIntegrationBuilder_apigateway;
import apigateway.LambdaIntegrationOptionsBuilder_apigateway;
import apigateway.LambdaRestApiBuilder_apigateway;
import apigateway.LambdaRestApiPropsBuilder_apigateway;
import apigateway.MethodBuilder_apigateway;
import apigateway.MethodDeploymentOptionsBuilder_apigateway;
import apigateway.MethodLoggingLevel;
import apigateway.MethodOptionsBuilder_apigateway;
import apigateway.MethodPropsBuilder_apigateway;
import apigateway.MethodResponseBuilder_apigateway;
import apigateway.MockIntegrationBuilder_apigateway;
import apigateway.ModelBuilder_apigateway;
import apigateway.ModelOptionsBuilder_apigateway;
import apigateway.ModelPropsBuilder_apigateway;
import apigateway.PassthroughBehavior;
import apigateway.Period;
import apigateway.ProxyResourceBuilder_apigateway;
import apigateway.ProxyResourceOptionsBuilder_apigateway;
import apigateway.ProxyResourcePropsBuilder_apigateway;
import apigateway.QuotaSettingsBuilder_apigateway;
import apigateway.RateLimitedApiKeyBuilder_apigateway;
import apigateway.RateLimitedApiKeyPropsBuilder_apigateway;
import apigateway.RequestAuthorizerBuilder_apigateway;
import apigateway.RequestAuthorizerPropsBuilder_apigateway;
import apigateway.RequestValidatorBuilder_apigateway;
import apigateway.RequestValidatorOptionsBuilder_apigateway;
import apigateway.RequestValidatorPropsBuilder_apigateway;
import apigateway.ResourceBuilder_apigateway;
import apigateway.ResourceOptionsBuilder_apigateway;
import apigateway.ResourcePropsBuilder_apigateway;
import apigateway.RestApiBuilder_apigateway;
import apigateway.RestApiOptionsBuilder_apigateway;
import apigateway.RestApiPropsBuilder_apigateway;
import apigateway.SecurityPolicy;
import apigateway.SpecRestApiBuilder_apigateway;
import apigateway.SpecRestApiPropsBuilder_apigateway;
import apigateway.StageBuilder_apigateway;
import apigateway.StageOptionsBuilder_apigateway;
import apigateway.StagePropsBuilder_apigateway;
import apigateway.ThrottleSettingsBuilder_apigateway;
import apigateway.ThrottlingPerMethodBuilder_apigateway;
import apigateway.TokenAuthorizerBuilder_apigateway;
import apigateway.TokenAuthorizerPropsBuilder_apigateway;
import apigateway.UsagePlanBuilder_apigateway;
import apigateway.UsagePlanPerApiStageBuilder_apigateway;
import apigateway.UsagePlanPropsBuilder_apigateway;
import apigateway.VpcLinkBuilder_apigateway;
import apigateway.VpcLinkPropsBuilder_apigateway;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

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

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApigatewayPackageImpl extends EPackageImpl implements ApigatewayPackage {
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
	private EClass requestAuthorizerPropsBuilder_apigatewayEClass = null;

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
	private EClass jsonSchemaBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaRestApiBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpIntegrationPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayResponseOptionsBuilder_apigatewayEClass = null;

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
	private EClass lambdaRestApiPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiDefinitionConfigBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restApiBuilder_apigatewayEClass = null;

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
	private EClass methodPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePathMappingPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usagePlanBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quotaSettingsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAuthorizerPropsBuilder_apigatewayEClass = null;

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
	private EClass httpIntegrationBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcLinkPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throttleSettingsBuilder_apigatewayEClass = null;

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
	private EClass basePathMappingOptionsBuilder_apigatewayEClass = null;

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
	private EClass mockIntegrationBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyResourceOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeyBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayResponseBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestValidatorPropsBuilder_apigatewayEClass = null;

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
	private EClass lambdaIntegrationBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyResourcePropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationPropsBuilder_apigatewayEClass = null;

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
	private EClass usagePlanPerApiStageBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specRestApiBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiDefinitionS3LocationBuilder_apigatewayEClass = null;

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
	private EClass stageOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeyPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateLimitedApiKeyPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentBuilder_apigatewayEClass = null;

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
	private EClass deploymentPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsIntegrationBuilder_apigatewayEClass = null;

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
	private EClass stagePropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaAuthorizerPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsIntegrationPropsBuilder_apigatewayEClass = null;

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
	private EClass domainNamePropsBuilder_apigatewayEClass = null;

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
	private EClass restApiOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaIntegrationOptionsBuilder_apigatewayEClass = null;

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
	private EClass requestAuthorizerBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateLimitedApiKeyBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeyOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOptionsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePathMappingBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainNameAttributesBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throttlingPerMethodBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usagePlanPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayResponsePropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainNameBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyResourceBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLogDestinationConfigBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonWithStandardFieldPropsBuilder_apigatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specRestApiPropsBuilder_apigatewayEClass = null;

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
	private EEnum authorizationTypeEEnum = null;

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
	private EEnum endpointTypeEEnum = null;

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
	private EEnum periodEEnum = null;

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
	private EEnum securityPolicyEEnum = null;

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
	private EEnum jsonSchemaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonSchemaVersionEEnum = null;

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
	 * @see apigateway.ApigatewayPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApigatewayPackageImpl() {
		super(eNS_URI, ApigatewayFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApigatewayPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApigatewayPackage init() {
		if (isInited)
			return (ApigatewayPackage) EPackage.Registry.INSTANCE.getEPackage(ApigatewayPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApigatewayPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApigatewayPackageImpl theApigatewayPackage = registeredApigatewayPackage instanceof ApigatewayPackageImpl
				? (ApigatewayPackageImpl) registeredApigatewayPackage
				: new ApigatewayPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = (AwsworkbenchPackageImpl) (registeredPackage instanceof AwsworkbenchPackageImpl
				? registeredPackage
				: AwsworkbenchPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl) (registeredPackage instanceof Ec2PackageImpl ? registeredPackage
				: Ec2Package.eINSTANCE);
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
		theApigatewayPackage.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theApigatewayPackage.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApigatewayPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApigatewayPackage.eNS_URI, theApigatewayPackage);
		return theApigatewayPackage;
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
	public EClass getRequestAuthorizerPropsBuilder_apigateway() {
		return requestAuthorizerPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_IdentitySources_java_lang_String_AsList() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_VarName() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_Identifier() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestAuthorizerPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) requestAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
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
	public EClass getLambdaRestApiBuilder_apigateway() {
		return lambdaRestApiBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_MinimumCompressionSize_java_lang_Number_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_OptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_VarName() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_Identifier() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiBuilder_apigateway_AdditionalCode() {
		return (EAttribute) lambdaRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHttpIntegrationPropsBuilder_apigateway() {
		return httpIntegrationPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_HttpMethod_java_lang_String_() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_VarName() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_Identifier() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) httpIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayResponseOptionsBuilder_apigateway() {
		return gatewayResponseOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_StatusCode_java_lang_String_() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_VarName() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) gatewayResponseOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
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
	public EClass getLambdaRestApiPropsBuilder_apigateway() {
		return lambdaRestApiPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_OptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_MinimumCompressionSize_java_lang_Number_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_VarName() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_Identifier() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaRestApiPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) lambdaRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiDefinitionConfigBuilder_apigateway() {
		return apiDefinitionConfigBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_InlineDefinition_java_lang_Object_() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_S3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_VarName() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_Identifier() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionConfigBuilder_apigateway_AdditionalCode() {
		return (EAttribute) apiDefinitionConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestApiBuilder_apigateway() {
		return restApiBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_MinimumCompressionSize_java_lang_Number_() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_VarName() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_Identifier() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiBuilder_apigateway_AdditionalCode() {
		return (EAttribute) restApiBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
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
	public EClass getMethodPropsBuilder_apigateway() {
		return methodPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_HttpMethod_java_lang_String_() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_ResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_IntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_OptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_VarName() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_Identifier() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) methodPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasePathMappingPropsBuilder_apigateway() {
		return basePathMappingPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_DomainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_BasePath_java_lang_String_() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_VarName() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_Identifier() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) basePathMappingPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsagePlanBuilder_apigateway() {
		return usagePlanBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_ApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_Name_java_lang_String_() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_VarName() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_Identifier() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanBuilder_apigateway_AdditionalCode() {
		return (EAttribute) usagePlanBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuotaSettingsBuilder_apigateway() {
		return quotaSettingsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_Limit_java_lang_Number_() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_Offset_java_lang_Number_() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_Period_software_amazon_awscdk_services_apigateway_Period_() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_VarName() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_Identifier() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuotaSettingsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) quotaSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTokenAuthorizerPropsBuilder_apigateway() {
		return tokenAuthorizerPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_IdentitySource_java_lang_String_() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_ValidationRegex_java_lang_String_() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_VarName() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_Identifier() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenAuthorizerPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) tokenAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
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
	public EClass getHttpIntegrationBuilder_apigateway() {
		return httpIntegrationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_HttpMethod_java_lang_String_() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_VarName() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_Identifier() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHttpIntegrationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) httpIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVpcLinkPropsBuilder_apigateway() {
		return vpcLinkPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_Targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_VpcLinkName_java_lang_String_() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_VarName() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_Identifier() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVpcLinkPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) vpcLinkPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelPropsBuilder_apigateway() {
		return modelPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_ContentType_java_lang_String_() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_ModelName_java_lang_String_() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_VarName() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_Identifier() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) modelPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceBuilder_apigateway() {
		return resourceBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_PathPart_java_lang_String_() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_VarName() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_Identifier() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceBuilder_apigateway_AdditionalCode() {
		return (EAttribute) resourceBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrottleSettingsBuilder_apigateway() {
		return throttleSettingsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_BurstLimit_java_lang_Number_() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_RateLimit_java_lang_Number_() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_VarName() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_Identifier() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottleSettingsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) throttleSettingsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
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
	public EClass getBasePathMappingOptionsBuilder_apigateway() {
		return basePathMappingOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_BasePath_java_lang_String_() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_VarName() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) basePathMappingOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
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
	public EClass getMockIntegrationBuilder_apigateway() {
		return mockIntegrationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_CacheNamespace_java_lang_String_() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_VarName() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_Identifier() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMockIntegrationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) mockIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStageBuilder_apigateway() {
		return stageBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_CachingEnabled_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_MetricsEnabled_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_CacheClusterSize_java_lang_String_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_ClientCertificateId_java_lang_String_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_DocumentationVersion_java_lang_String_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_StageName_java_lang_String_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_TracingEnabled_java_lang_Boolean_() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_DeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_VarName() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_Identifier() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageBuilder_apigateway_AdditionalCode() {
		return (EAttribute) stageBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxyResourceOptionsBuilder_apigateway() {
		return proxyResourceOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_AnyMethod_java_lang_Boolean_() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_VarName() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) proxyResourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiKeyBuilder_apigateway() {
		return apiKeyBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_ApiKeyName_java_lang_String_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_Value_java_lang_String_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_CustomerId_java_lang_String_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_Enabled_java_lang_Boolean_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_VarName() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_Identifier() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyBuilder_apigateway_AdditionalCode() {
		return (EAttribute) apiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayResponseBuilder_apigateway() {
		return gatewayResponseBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_StatusCode_java_lang_String_() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_VarName() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_Identifier() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponseBuilder_apigateway_AdditionalCode() {
		return (EAttribute) gatewayResponseBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestValidatorPropsBuilder_apigateway() {
		return requestValidatorPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_RequestValidatorName_java_lang_String_() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_VarName() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_Identifier() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestValidatorPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) requestValidatorPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
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
	public EClass getLambdaIntegrationBuilder_apigateway() {
		return lambdaIntegrationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_CacheNamespace_java_lang_String_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_AllowTestInvoke_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_VarName() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_Identifier() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) lambdaIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxyResourcePropsBuilder_apigateway() {
		return proxyResourcePropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_AnyMethod_java_lang_Boolean_() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_VarName() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_Identifier() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourcePropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) proxyResourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceOptionsBuilder_apigateway() {
		return resourceOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_VarName() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) resourceOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationPropsBuilder_apigateway() {
		return integrationPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_IntegrationType_() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_IntegrationHttpMethod_java_lang_String_() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_Uri_java_lang_Object_() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_VarName() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_Identifier() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegrationPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) integrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
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
	public EClass getUsagePlanPerApiStageBuilder_apigateway() {
		return usagePlanPerApiStageBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_Throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_VarName() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_Identifier() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPerApiStageBuilder_apigateway_AdditionalCode() {
		return (EAttribute) usagePlanPerApiStageBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecRestApiBuilder_apigateway() {
		return specRestApiBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_ApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_VarName() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_Identifier() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiBuilder_apigateway_AdditionalCode() {
		return (EAttribute) specRestApiBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiDefinitionS3LocationBuilder_apigateway() {
		return apiDefinitionS3LocationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_Bucket_java_lang_String_() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_Key_java_lang_String_() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_Version_java_lang_String_() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_VarName() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_Identifier() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiDefinitionS3LocationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) apiDefinitionS3LocationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
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
	public EClass getApiKeyPropsBuilder_apigateway() {
		return apiKeyPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_CustomerId_java_lang_String_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_Enabled_java_lang_Boolean_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_ApiKeyName_java_lang_String_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_Value_java_lang_String_() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_VarName() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_Identifier() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) apiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRateLimitedApiKeyPropsBuilder_apigateway() {
		return rateLimitedApiKeyPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_CustomerId_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_Enabled_java_lang_Boolean_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_ApiKeyName_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_Value_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_VarName() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_Identifier() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) rateLimitedApiKeyPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentBuilder_apigateway() {
		return deploymentBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_VarName() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_Identifier() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentBuilder_apigateway_AdditionalCode() {
		return (EAttribute) deploymentBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
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
	public EClass getDeploymentPropsBuilder_apigateway() {
		return deploymentPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_VarName() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_Identifier() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) deploymentPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwsIntegrationBuilder_apigateway() {
		return awsIntegrationBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Service_java_lang_String_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Action_java_lang_String_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_ActionParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_IntegrationHttpMethod_java_lang_String_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Path_java_lang_String_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Subdomain_java_lang_String_() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_VarName() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_Identifier() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationBuilder_apigateway_AdditionalCode() {
		return (EAttribute) awsIntegrationBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
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
	public EClass getStagePropsBuilder_apigateway() {
		return stagePropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_DeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_CacheClusterSize_java_lang_String_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_ClientCertificateId_java_lang_String_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_DocumentationVersion_java_lang_String_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_StageName_java_lang_String_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_TracingEnabled_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_CachingEnabled_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_VarName() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_Identifier() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStagePropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) stagePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaAuthorizerPropsBuilder_apigateway() {
		return lambdaAuthorizerPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_VarName() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_Identifier() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaAuthorizerPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) lambdaAuthorizerPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwsIntegrationPropsBuilder_apigateway() {
		return awsIntegrationPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Service_java_lang_String_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Action_java_lang_String_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_ActionParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_IntegrationHttpMethod_java_lang_String_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Path_java_lang_String_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Subdomain_java_lang_String_() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_VarName() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_Identifier() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwsIntegrationPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) awsIntegrationPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
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
	public EClass getDomainNamePropsBuilder_apigateway() {
		return domainNamePropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_MappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_DomainName_java_lang_String_() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_VarName() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_Identifier() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNamePropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) domainNamePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
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
	public EClass getRestApiOptionsBuilder_apigateway() {
		return restApiOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_VarName() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestApiOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) restApiOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLambdaIntegrationOptionsBuilder_apigateway() {
		return lambdaIntegrationOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_AllowTestInvoke_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_Proxy_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_CacheNamespace_java_lang_String_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_VarName() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLambdaIntegrationOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) lambdaIntegrationOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
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
	public EClass getResourcePropsBuilder_apigateway() {
		return resourcePropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_PathPart_java_lang_String_() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_VarName() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_Identifier() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) resourcePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRateLimitedApiKeyBuilder_apigateway() {
		return rateLimitedApiKeyBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_ApiKeyName_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_Value_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_CustomerId_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_Enabled_java_lang_Boolean_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_VarName() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_Identifier() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateLimitedApiKeyBuilder_apigateway_AdditionalCode() {
		return (EAttribute) rateLimitedApiKeyBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApiKeyOptionsBuilder_apigateway() {
		return apiKeyOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_ApiKeyName_java_lang_String_() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_Value_java_lang_String_() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_VarName() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApiKeyOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) apiKeyOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelOptionsBuilder_apigateway() {
		return modelOptionsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_ContentType_java_lang_String_() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_ModelName_java_lang_String_() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_VarName() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_Identifier() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelOptionsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) modelOptionsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasePathMappingBuilder_apigateway() {
		return basePathMappingBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_BasePath_java_lang_String_() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_DomainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_VarName() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_Identifier() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasePathMappingBuilder_apigateway_AdditionalCode() {
		return (EAttribute) basePathMappingBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainNameAttributesBuilder_apigateway() {
		return domainNameAttributesBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_DomainName_java_lang_String_() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_DomainNameAliasHostedZoneId_java_lang_String_() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_DomainNameAliasTarget_java_lang_String_() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_VarName() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_Identifier() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameAttributesBuilder_apigateway_AdditionalCode() {
		return (EAttribute) domainNameAttributesBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrottlingPerMethodBuilder_apigateway() {
		return throttlingPerMethodBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_MethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_VarName() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_Identifier() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThrottlingPerMethodBuilder_apigateway_AdditionalCode() {
		return (EAttribute) throttlingPerMethodBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsagePlanPropsBuilder_apigateway() {
		return usagePlanPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_ApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_Description_java_lang_String_() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_Name_java_lang_String_() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_VarName() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_Identifier() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsagePlanPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) usagePlanPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayResponsePropsBuilder_apigateway() {
		return gatewayResponsePropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_StatusCode_java_lang_String_() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_VarName() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_Identifier() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayResponsePropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) gatewayResponsePropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainNameBuilder_apigateway() {
		return domainNameBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_DomainName_java_lang_String_() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_MappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_VarName() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_Identifier() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainNameBuilder_apigateway_AdditionalCode() {
		return (EAttribute) domainNameBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxyResourceBuilder_apigateway() {
		return proxyResourceBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_AnyMethod_java_lang_Boolean_() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_VarName() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_Identifier() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProxyResourceBuilder_apigateway_AdditionalCode() {
		return (EAttribute) proxyResourceBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessLogDestinationConfigBuilder_apigateway() {
		return accessLogDestinationConfigBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessLogDestinationConfigBuilder_apigateway_DestinationArn_java_lang_String_() {
		return (EAttribute) accessLogDestinationConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessLogDestinationConfigBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) accessLogDestinationConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessLogDestinationConfigBuilder_apigateway_VarName() {
		return (EAttribute) accessLogDestinationConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessLogDestinationConfigBuilder_apigateway_Identifier() {
		return (EAttribute) accessLogDestinationConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessLogDestinationConfigBuilder_apigateway_AdditionalCode() {
		return (EAttribute) accessLogDestinationConfigBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodBuilder_apigateway() {
		return methodBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_HttpMethod_java_lang_String_() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_ResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_IntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_OptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_VarName() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_Identifier() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBuilder_apigateway_AdditionalCode() {
		return (EAttribute) methodBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonWithStandardFieldPropsBuilder_apigateway() {
		return jsonWithStandardFieldPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_Caller_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_HttpMethod_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_Ip_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_Protocol_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_RequestTime_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_ResourcePath_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_ResponseLength_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_Status_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_User_java_lang_Boolean_() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_VarName() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_Identifier() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonWithStandardFieldPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) jsonWithStandardFieldPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecRestApiPropsBuilder_apigateway() {
		return specRestApiPropsBuilder_apigatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_ApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_GeneratedClassName() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_VarName() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_Identifier() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecRestApiPropsBuilder_apigateway_AdditionalCode() {
		return (EAttribute) specRestApiPropsBuilder_apigatewayEClass.getEStructuralFeatures().get(17);
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
	public EEnum getAuthorizationType() {
		return authorizationTypeEEnum;
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
	public EEnum getEndpointType() {
		return endpointTypeEEnum;
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
	public EEnum getPeriod() {
		return periodEEnum;
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
	public EEnum getSecurityPolicy() {
		return securityPolicyEEnum;
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
	public EEnum getJsonSchemaType() {
		return jsonSchemaTypeEEnum;
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
	public ApigatewayFactory getApigatewayFactory() {
		return (ApigatewayFactory) getEFactoryInstance();
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

		requestAuthorizerPropsBuilder_apigatewayEClass = createEClass(REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(requestAuthorizerPropsBuilder_apigatewayEClass,
				REQUEST_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		lambdaRestApiBuilder_apigatewayEClass = createEClass(LAMBDA_REST_API_BUILDER_APIGATEWAY);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass,
				LAMBDA_REST_API_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass, LAMBDA_REST_API_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass, LAMBDA_REST_API_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(lambdaRestApiBuilder_apigatewayEClass, LAMBDA_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		httpIntegrationPropsBuilder_apigatewayEClass = createEClass(HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(httpIntegrationPropsBuilder_apigatewayEClass,
				HTTP_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		gatewayResponseOptionsBuilder_apigatewayEClass = createEClass(GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__TYPE_WITH_RESPONSE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_RESPONSE_TYPE_AS_REFERENCE);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__RESPONSE_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(gatewayResponseOptionsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		lambdaRestApiPropsBuilder_apigatewayEClass = createEClass(LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_PROPS_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(lambdaRestApiPropsBuilder_apigatewayEClass,
				LAMBDA_REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		apiDefinitionConfigBuilder_apigatewayEClass = createEClass(API_DEFINITION_CONFIG_BUILDER_APIGATEWAY);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(apiDefinitionConfigBuilder_apigatewayEClass,
				API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		restApiBuilder_apigatewayEClass = createEClass(REST_API_BUILDER_APIGATEWAY);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST);
		createEAttribute(restApiBuilder_apigatewayEClass,
				REST_API_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(restApiBuilder_apigatewayEClass, REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		methodPropsBuilder_apigatewayEClass = createEClass(METHOD_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(methodPropsBuilder_apigatewayEClass,
				METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(methodPropsBuilder_apigatewayEClass,
				METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(methodPropsBuilder_apigatewayEClass,
				METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(methodPropsBuilder_apigatewayEClass,
				METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(methodPropsBuilder_apigatewayEClass, METHOD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(methodPropsBuilder_apigatewayEClass, METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(methodPropsBuilder_apigatewayEClass, METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(methodPropsBuilder_apigatewayEClass, METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		basePathMappingPropsBuilder_apigatewayEClass = createEClass(BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_IDOMAIN_NAME_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IDOMAIN_NAME_AS_REFERENCE);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(basePathMappingPropsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		usagePlanBuilder_apigatewayEClass = createEClass(USAGE_PLAN_BUILDER_APIGATEWAY);
		createEAttribute(usagePlanBuilder_apigatewayEClass,
				USAGE_PLAN_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE);
		createEAttribute(usagePlanBuilder_apigatewayEClass,
				USAGE_PLAN_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST);
		createEAttribute(usagePlanBuilder_apigatewayEClass,
				USAGE_PLAN_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(usagePlanBuilder_apigatewayEClass, USAGE_PLAN_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_);
		createEAttribute(usagePlanBuilder_apigatewayEClass,
				USAGE_PLAN_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE);
		createEAttribute(usagePlanBuilder_apigatewayEClass,
				USAGE_PLAN_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE);
		createEAttribute(usagePlanBuilder_apigatewayEClass, USAGE_PLAN_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(usagePlanBuilder_apigatewayEClass, USAGE_PLAN_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(usagePlanBuilder_apigatewayEClass, USAGE_PLAN_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(usagePlanBuilder_apigatewayEClass, USAGE_PLAN_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		quotaSettingsBuilder_apigatewayEClass = createEClass(QUOTA_SETTINGS_BUILDER_APIGATEWAY);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass,
				QUOTA_SETTINGS_BUILDER_APIGATEWAY__LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass,
				QUOTA_SETTINGS_BUILDER_APIGATEWAY__OFFSET_JAVA_LANG_NUMBER_);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass,
				QUOTA_SETTINGS_BUILDER_APIGATEWAY__PERIOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PERIOD_);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass,
				QUOTA_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass, QUOTA_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass, QUOTA_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(quotaSettingsBuilder_apigatewayEClass, QUOTA_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		tokenAuthorizerPropsBuilder_apigatewayEClass = createEClass(TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTITY_SOURCE_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VALIDATION_REGEX_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(tokenAuthorizerPropsBuilder_apigatewayEClass,
				TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		httpIntegrationBuilder_apigatewayEClass = createEClass(HTTP_INTEGRATION_BUILDER_APIGATEWAY);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass,
				HTTP_INTEGRATION_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass,
				HTTP_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass,
				HTTP_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass,
				HTTP_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass, HTTP_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass, HTTP_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(httpIntegrationBuilder_apigatewayEClass, HTTP_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		vpcLinkPropsBuilder_apigatewayEClass = createEClass(VPC_LINK_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass,
				VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass,
				VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass,
				VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass, VPC_LINK_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass, VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass, VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(vpcLinkPropsBuilder_apigatewayEClass, VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		modelPropsBuilder_apigatewayEClass = createEClass(MODEL_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(modelPropsBuilder_apigatewayEClass,
				MODEL_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(modelPropsBuilder_apigatewayEClass,
				MODEL_PROPS_BUILDER_APIGATEWAY__SCHEMA_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(modelPropsBuilder_apigatewayEClass,
				MODEL_PROPS_BUILDER_APIGATEWAY__CONTENT_TYPE_JAVA_LANG_STRING_);
		createEAttribute(modelPropsBuilder_apigatewayEClass,
				MODEL_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(modelPropsBuilder_apigatewayEClass,
				MODEL_PROPS_BUILDER_APIGATEWAY__MODEL_NAME_JAVA_LANG_STRING_);
		createEAttribute(modelPropsBuilder_apigatewayEClass, MODEL_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(modelPropsBuilder_apigatewayEClass, MODEL_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(modelPropsBuilder_apigatewayEClass, MODEL_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(modelPropsBuilder_apigatewayEClass, MODEL_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		resourceBuilder_apigatewayEClass = createEClass(RESOURCE_BUILDER_APIGATEWAY);
		createEAttribute(resourceBuilder_apigatewayEClass,
				RESOURCE_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(resourceBuilder_apigatewayEClass,
				RESOURCE_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(resourceBuilder_apigatewayEClass,
				RESOURCE_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(resourceBuilder_apigatewayEClass,
				RESOURCE_BUILDER_APIGATEWAY__PARENT_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(resourceBuilder_apigatewayEClass, RESOURCE_BUILDER_APIGATEWAY__PATH_PART_JAVA_LANG_STRING_);
		createEAttribute(resourceBuilder_apigatewayEClass, RESOURCE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(resourceBuilder_apigatewayEClass, RESOURCE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(resourceBuilder_apigatewayEClass, RESOURCE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(resourceBuilder_apigatewayEClass, RESOURCE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		throttleSettingsBuilder_apigatewayEClass = createEClass(THROTTLE_SETTINGS_BUILDER_APIGATEWAY);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass,
				THROTTLE_SETTINGS_BUILDER_APIGATEWAY__BURST_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass,
				THROTTLE_SETTINGS_BUILDER_APIGATEWAY__RATE_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass,
				THROTTLE_SETTINGS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass, THROTTLE_SETTINGS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass, THROTTLE_SETTINGS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(throttleSettingsBuilder_apigatewayEClass,
				THROTTLE_SETTINGS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		basePathMappingOptionsBuilder_apigatewayEClass = createEClass(BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(basePathMappingOptionsBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		mockIntegrationBuilder_apigatewayEClass = createEClass(MOCK_INTEGRATION_BUILDER_APIGATEWAY);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass,
				MOCK_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass, MOCK_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass, MOCK_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(mockIntegrationBuilder_apigatewayEClass, MOCK_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		stageBuilder_apigatewayEClass = createEClass(STAGE_BUILDER_APIGATEWAY);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stageBuilder_apigatewayEClass,
				STAGE_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(stageBuilder_apigatewayEClass, STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		proxyResourceOptionsBuilder_apigatewayEClass = createEClass(PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__ANY_METHOD_JAVA_LANG_BOOLEAN_);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(proxyResourceOptionsBuilder_apigatewayEClass,
				PROXY_RESOURCE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		apiKeyBuilder_apigatewayEClass = createEClass(API_KEY_BUILDER_APIGATEWAY);
		createEAttribute(apiKeyBuilder_apigatewayEClass,
				API_KEY_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyBuilder_apigatewayEClass,
				API_KEY_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(apiKeyBuilder_apigatewayEClass,
				API_KEY_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiKeyBuilder_apigatewayEClass,
				API_KEY_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiKeyBuilder_apigatewayEClass,
				API_KEY_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(apiKeyBuilder_apigatewayEClass, API_KEY_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		gatewayResponseBuilder_apigatewayEClass = createEClass(GATEWAY_RESPONSE_BUILDER_APIGATEWAY);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__TYPE_WITH_RESPONSE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_RESPONSE_TYPE_AS_REFERENCE);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass, GATEWAY_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass, GATEWAY_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(gatewayResponseBuilder_apigatewayEClass, GATEWAY_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		requestValidatorPropsBuilder_apigatewayEClass = createEClass(REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(requestValidatorPropsBuilder_apigatewayEClass,
				REQUEST_VALIDATOR_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		lambdaIntegrationBuilder_apigatewayEClass = createEClass(LAMBDA_INTEGRATION_BUILDER_APIGATEWAY);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__ALLOW_TEST_INVOKE_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass, LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass, LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(lambdaIntegrationBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		proxyResourcePropsBuilder_apigatewayEClass = createEClass(PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__PARENT_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__ANY_METHOD_JAVA_LANG_BOOLEAN_);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass, PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(proxyResourcePropsBuilder_apigatewayEClass,
				PROXY_RESOURCE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		resourceOptionsBuilder_apigatewayEClass = createEClass(RESOURCE_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass,
				RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass,
				RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass,
				RESOURCE_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass,
				RESOURCE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass, RESOURCE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass, RESOURCE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(resourceOptionsBuilder_apigatewayEClass, RESOURCE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		integrationPropsBuilder_apigatewayEClass = createEClass(INTEGRATION_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_TYPE_);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__URI_JAVA_LANG_OBJECT_);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(integrationPropsBuilder_apigatewayEClass, INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(integrationPropsBuilder_apigatewayEClass, INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(integrationPropsBuilder_apigatewayEClass,
				INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		usagePlanPerApiStageBuilder_apigatewayEClass = createEClass(USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__THROTTLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLING_PER_METHOD_AS_LIST);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(usagePlanPerApiStageBuilder_apigatewayEClass,
				USAGE_PLAN_PER_API_STAGE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		specRestApiBuilder_apigatewayEClass = createEClass(SPEC_REST_API_BUILDER_APIGATEWAY);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiBuilder_apigatewayEClass,
				SPEC_REST_API_BUILDER_APIGATEWAY__API_DEFINITION_WITH_API_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_AS_REFERENCE);
		createEAttribute(specRestApiBuilder_apigatewayEClass, SPEC_REST_API_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(specRestApiBuilder_apigatewayEClass, SPEC_REST_API_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(specRestApiBuilder_apigatewayEClass, SPEC_REST_API_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(specRestApiBuilder_apigatewayEClass, SPEC_REST_API_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		apiDefinitionS3LocationBuilder_apigatewayEClass = createEClass(API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(apiDefinitionS3LocationBuilder_apigatewayEClass,
				API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		vpcLinkBuilder_apigatewayEClass = createEClass(VPC_LINK_BUILDER_APIGATEWAY);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkBuilder_apigatewayEClass,
				VPC_LINK_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(vpcLinkBuilder_apigatewayEClass, VPC_LINK_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		apiKeyPropsBuilder_apigatewayEClass = createEClass(API_KEY_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass,
				API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass, API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass, API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass, API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(apiKeyPropsBuilder_apigatewayEClass, API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		rateLimitedApiKeyPropsBuilder_apigatewayEClass = createEClass(RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(rateLimitedApiKeyPropsBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		deploymentBuilder_apigatewayEClass = createEClass(DEPLOYMENT_BUILDER_APIGATEWAY);
		createEAttribute(deploymentBuilder_apigatewayEClass,
				DEPLOYMENT_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(deploymentBuilder_apigatewayEClass,
				DEPLOYMENT_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(deploymentBuilder_apigatewayEClass,
				DEPLOYMENT_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(deploymentBuilder_apigatewayEClass, DEPLOYMENT_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(deploymentBuilder_apigatewayEClass, DEPLOYMENT_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(deploymentBuilder_apigatewayEClass, DEPLOYMENT_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(deploymentBuilder_apigatewayEClass, DEPLOYMENT_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		deploymentPropsBuilder_apigatewayEClass = createEClass(DEPLOYMENT_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass,
				DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass,
				DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass,
				DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass,
				DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass, DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass, DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(deploymentPropsBuilder_apigatewayEClass, DEPLOYMENT_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		awsIntegrationBuilder_apigatewayEClass = createEClass(AWS_INTEGRATION_BUILDER_APIGATEWAY);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass,
				AWS_INTEGRATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass, AWS_INTEGRATION_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass, AWS_INTEGRATION_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(awsIntegrationBuilder_apigatewayEClass, AWS_INTEGRATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		stagePropsBuilder_apigatewayEClass = createEClass(STAGE_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__DEPLOYMENT_WITH_DEPLOYMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DEPLOYMENT_AS_REFERENCE);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stagePropsBuilder_apigatewayEClass,
				STAGE_PROPS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_);
		createEAttribute(stagePropsBuilder_apigatewayEClass, STAGE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(stagePropsBuilder_apigatewayEClass, STAGE_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(stagePropsBuilder_apigatewayEClass, STAGE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(stagePropsBuilder_apigatewayEClass, STAGE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		lambdaAuthorizerPropsBuilder_apigatewayEClass = createEClass(LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(lambdaAuthorizerPropsBuilder_apigatewayEClass,
				LAMBDA_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		awsIntegrationPropsBuilder_apigatewayEClass = createEClass(AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__SERVICE_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ACTION_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ACTION_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__INTEGRATION_HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_INTEGRATION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_OPTIONS_AS_REFERENCE);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PATH_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__SUBDOMAIN_JAVA_LANG_STRING_);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(awsIntegrationPropsBuilder_apigatewayEClass,
				AWS_INTEGRATION_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		domainNamePropsBuilder_apigatewayEClass = createEClass(DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__MAPPING_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass, DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass, DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(domainNamePropsBuilder_apigatewayEClass,
				DOMAIN_NAME_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		restApiOptionsBuilder_apigatewayEClass = createEClass(REST_API_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass,
				REST_API_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass, REST_API_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass, REST_API_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(restApiOptionsBuilder_apigatewayEClass, REST_API_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		lambdaIntegrationOptionsBuilder_apigatewayEClass = createEClass(LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ALLOW_TEST_INVOKE_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PROXY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(lambdaIntegrationOptionsBuilder_apigatewayEClass,
				LAMBDA_INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

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

		resourcePropsBuilder_apigatewayEClass = createEClass(RESOURCE_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__PARENT_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__PATH_PART_JAVA_LANG_STRING_);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(resourcePropsBuilder_apigatewayEClass,
				RESOURCE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(resourcePropsBuilder_apigatewayEClass, RESOURCE_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(resourcePropsBuilder_apigatewayEClass, RESOURCE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(resourcePropsBuilder_apigatewayEClass, RESOURCE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		rateLimitedApiKeyBuilder_apigatewayEClass = createEClass(RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass, RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(rateLimitedApiKeyBuilder_apigatewayEClass,
				RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		apiKeyOptionsBuilder_apigatewayEClass = createEClass(API_KEY_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass,
				API_KEY_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass, API_KEY_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass, API_KEY_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(apiKeyOptionsBuilder_apigatewayEClass, API_KEY_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		modelOptionsBuilder_apigatewayEClass = createEClass(MODEL_OPTIONS_BUILDER_APIGATEWAY);
		createEAttribute(modelOptionsBuilder_apigatewayEClass,
				MODEL_OPTIONS_BUILDER_APIGATEWAY__SCHEMA_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE);
		createEAttribute(modelOptionsBuilder_apigatewayEClass,
				MODEL_OPTIONS_BUILDER_APIGATEWAY__CONTENT_TYPE_JAVA_LANG_STRING_);
		createEAttribute(modelOptionsBuilder_apigatewayEClass,
				MODEL_OPTIONS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(modelOptionsBuilder_apigatewayEClass,
				MODEL_OPTIONS_BUILDER_APIGATEWAY__MODEL_NAME_JAVA_LANG_STRING_);
		createEAttribute(modelOptionsBuilder_apigatewayEClass, MODEL_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(modelOptionsBuilder_apigatewayEClass, MODEL_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(modelOptionsBuilder_apigatewayEClass, MODEL_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(modelOptionsBuilder_apigatewayEClass, MODEL_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		basePathMappingBuilder_apigatewayEClass = createEClass(BASE_PATH_MAPPING_BUILDER_APIGATEWAY);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__BASE_PATH_JAVA_LANG_STRING_);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__STAGE_WITH_STAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_AS_REFERENCE);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_IDOMAIN_NAME_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IDOMAIN_NAME_AS_REFERENCE);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(basePathMappingBuilder_apigatewayEClass, BASE_PATH_MAPPING_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(basePathMappingBuilder_apigatewayEClass, BASE_PATH_MAPPING_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(basePathMappingBuilder_apigatewayEClass,
				BASE_PATH_MAPPING_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		domainNameAttributesBuilder_apigatewayEClass = createEClass(DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(domainNameAttributesBuilder_apigatewayEClass,
				DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		throttlingPerMethodBuilder_apigatewayEClass = createEClass(THROTTLING_PER_METHOD_BUILDER_APIGATEWAY);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__METHOD_WITH_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_AS_REFERENCE);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(throttlingPerMethodBuilder_apigatewayEClass,
				THROTTLING_PER_METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		usagePlanPropsBuilder_apigatewayEClass = createEClass(USAGE_PLAN_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__API_KEY_WITH_IAPI_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAPI_KEY_AS_REFERENCE);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__NAME_JAVA_LANG_STRING_);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass,
				USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass, USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass, USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(usagePlanPropsBuilder_apigatewayEClass, USAGE_PLAN_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		gatewayResponsePropsBuilder_apigatewayEClass = createEClass(GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TYPE_WITH_RESPONSE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_RESPONSE_TYPE_AS_REFERENCE);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__RESPONSE_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(gatewayResponsePropsBuilder_apigatewayEClass,
				GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		domainNameBuilder_apigatewayEClass = createEClass(DOMAIN_NAME_BUILDER_APIGATEWAY);
		createEAttribute(domainNameBuilder_apigatewayEClass,
				DOMAIN_NAME_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE);
		createEAttribute(domainNameBuilder_apigatewayEClass,
				DOMAIN_NAME_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_);
		createEAttribute(domainNameBuilder_apigatewayEClass,
				DOMAIN_NAME_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_);
		createEAttribute(domainNameBuilder_apigatewayEClass,
				DOMAIN_NAME_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_);
		createEAttribute(domainNameBuilder_apigatewayEClass,
				DOMAIN_NAME_BUILDER_APIGATEWAY__MAPPING_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE);
		createEAttribute(domainNameBuilder_apigatewayEClass, DOMAIN_NAME_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(domainNameBuilder_apigatewayEClass, DOMAIN_NAME_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(domainNameBuilder_apigatewayEClass, DOMAIN_NAME_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(domainNameBuilder_apigatewayEClass, DOMAIN_NAME_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		proxyResourceBuilder_apigatewayEClass = createEClass(PROXY_RESOURCE_BUILDER_APIGATEWAY);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__ANY_METHOD_JAVA_LANG_BOOLEAN_);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__PARENT_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(proxyResourceBuilder_apigatewayEClass,
				PROXY_RESOURCE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(proxyResourceBuilder_apigatewayEClass, PROXY_RESOURCE_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(proxyResourceBuilder_apigatewayEClass, PROXY_RESOURCE_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(proxyResourceBuilder_apigatewayEClass, PROXY_RESOURCE_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		accessLogDestinationConfigBuilder_apigatewayEClass = createEClass(
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY);
		createEAttribute(accessLogDestinationConfigBuilder_apigatewayEClass,
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY__DESTINATION_ARN_JAVA_LANG_STRING_);
		createEAttribute(accessLogDestinationConfigBuilder_apigatewayEClass,
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(accessLogDestinationConfigBuilder_apigatewayEClass,
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(accessLogDestinationConfigBuilder_apigatewayEClass,
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(accessLogDestinationConfigBuilder_apigatewayEClass,
				ACCESS_LOG_DESTINATION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		methodBuilder_apigatewayEClass = createEClass(METHOD_BUILDER_APIGATEWAY);
		createEAttribute(methodBuilder_apigatewayEClass, METHOD_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_);
		createEAttribute(methodBuilder_apigatewayEClass,
				METHOD_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE);
		createEAttribute(methodBuilder_apigatewayEClass,
				METHOD_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(methodBuilder_apigatewayEClass,
				METHOD_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(methodBuilder_apigatewayEClass, METHOD_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(methodBuilder_apigatewayEClass, METHOD_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(methodBuilder_apigatewayEClass, METHOD_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(methodBuilder_apigatewayEClass, METHOD_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		jsonWithStandardFieldPropsBuilder_apigatewayEClass = createEClass(
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__CALLER_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IP_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__PROTOCOL_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__REQUEST_TIME_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESOURCE_PATH_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESPONSE_LENGTH_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__STATUS_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__USER_JAVA_LANG_BOOLEAN_);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		specRestApiPropsBuilder_apigatewayEClass = createEClass(SPEC_REST_API_PROPS_BUILDER_APIGATEWAY);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__API_DEFINITION_WITH_API_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass, SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass, SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER);
		createEAttribute(specRestApiPropsBuilder_apigatewayEClass,
				SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE);

		// Create enums
		contentHandlingEEnum = createEEnum(CONTENT_HANDLING);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		authorizationTypeEEnum = createEEnum(AUTHORIZATION_TYPE);
		methodLoggingLevelEEnum = createEEnum(METHOD_LOGGING_LEVEL);
		endpointTypeEEnum = createEEnum(ENDPOINT_TYPE);
		apiKeySourceTypeEEnum = createEEnum(API_KEY_SOURCE_TYPE);
		periodEEnum = createEEnum(PERIOD);
		integrationTypeEEnum = createEEnum(INTEGRATION_TYPE);
		securityPolicyEEnum = createEEnum(SECURITY_POLICY);
		passthroughBehaviorEEnum = createEEnum(PASSTHROUGH_BEHAVIOR);
		jsonSchemaTypeEEnum = createEEnum(JSON_SCHEMA_TYPE);
		jsonSchemaVersionEEnum = createEEnum(JSON_SCHEMA_VERSION);
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

		// Initialize classes, features, and operations; add parameters
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

		initEClass(requestAuthorizerPropsBuilder_apigatewayEClass, RequestAuthorizerPropsBuilder_apigateway.class,
				"RequestAuthorizerPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_IdentitySources_java_lang_String_AsList(),
				ecorePackage.getEString(), "identitySources_java_lang_String_AsList", null, 0, 1,
				RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_(),
				ecorePackage.getEString(), "authorizerName_java_lang_String_", null, 0, 1,
				RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRequestAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RequestAuthorizerProps", 0, 1,
				RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestAuthorizerPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RequestAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(lambdaRestApiBuilder_apigatewayEClass, LambdaRestApiBuilder_apigateway.class,
				"LambdaRestApiBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_Deploy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"deploy_java_lang_Boolean_", null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(),
				this.getApiKeySourceType(),
				"apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "binaryMediaTypes_java_lang_String_AsList", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(),
				ecorePackage.getEString(),
				"endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(),
				ecorePackage.getEString(),
				"endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_MinimumCompressionSize_java_lang_Number_(),
				ecorePackage.getEInt(), "minimumCompressionSize_java_lang_Number_", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiBuilder_apigateway_OptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(),
				ecorePackage.getEString(),
				"optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference", null, 0,
				1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_Proxy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"proxy_java_lang_Boolean_", null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.LambdaRestApi", 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LambdaRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpIntegrationPropsBuilder_apigatewayEClass, HttpIntegrationPropsBuilder_apigateway.class,
				"HttpIntegrationPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_HttpMethod_java_lang_String_(),
				ecorePackage.getEString(), "httpMethod_java_lang_String_", null, 0, 1,
				HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getHttpIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.HttpIntegrationProps", 0, 1,
				HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, HttpIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayResponseOptionsBuilder_apigatewayEClass, GatewayResponseOptionsBuilder_apigateway.class,
				"GatewayResponseOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayResponseOptionsBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference(),
				ecorePackage.getEString(),
				"typeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference", null, 0, 1,
				GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayResponseOptionsBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "responseHeaders_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_StatusCode_java_lang_String_(),
				ecorePackage.getEString(), "statusCode_java_lang_String_", null, 0, 1,
				GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "templates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.GatewayResponseOptions", 0, 1,
				GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GatewayResponseOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(lambdaRestApiPropsBuilder_apigatewayEClass, LambdaRestApiPropsBuilder_apigateway.class,
				"LambdaRestApiPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_OptionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference(),
				ecorePackage.getEString(),
				"optionsWithRestApiProps_software_amazon_awscdk_services_apigateway_RestApiProps_AsReference", null, 0,
				1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(),
				this.getApiKeySourceType(),
				"apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "binaryMediaTypes_java_lang_String_AsList", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_Description_java_lang_String_(),
				ecorePackage.getEString(), "description_java_lang_String_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(),
				ecorePackage.getEString(),
				"endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(),
				ecorePackage.getEString(),
				"endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_MinimumCompressionSize_java_lang_Number_(),
				ecorePackage.getEInt(), "minimumCompressionSize_java_lang_Number_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deploy_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_(),
				ecorePackage.getEString(), "restApiName_java_lang_String_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.LambdaRestApiProps", 0, 1,
				LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaRestApiPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiDefinitionConfigBuilder_apigatewayEClass, ApiDefinitionConfigBuilder_apigateway.class,
				"ApiDefinitionConfigBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiDefinitionConfigBuilder_apigateway_InlineDefinition_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "inlineDefinition_java_lang_Object_", null, 0, 1,
				ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiDefinitionConfigBuilder_apigateway_S3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference(),
				ecorePackage.getEString(),
				"s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference",
				null, 0, 1, ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionConfigBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ApiDefinitionConfig", 0, 1,
				ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionConfigBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionConfigBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionConfigBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ApiDefinitionConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restApiBuilder_apigatewayEClass, RestApiBuilder_apigateway.class, "RestApiBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_Deploy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"deploy_java_lang_Boolean_", null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_EndpointExportName_java_lang_String_(), ecorePackage.getEString(),
				"endpointExportName_java_lang_String_", null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_ApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_(),
				this.getApiKeySourceType(),
				"apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_BinaryMediaTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "binaryMediaTypes_java_lang_String_AsList", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_CloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_EndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference(),
				ecorePackage.getEString(),
				"endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference",
				null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiBuilder_apigateway_EndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList(),
				ecorePackage.getEString(),
				"endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_MinimumCompressionSize_java_lang_Number_(), ecorePackage.getEInt(),
				"minimumCompressionSize_java_lang_Number_", null, 0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RestApi", 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, RestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(methodPropsBuilder_apigatewayEClass, MethodPropsBuilder_apigateway.class,
				"MethodPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodPropsBuilder_apigateway_HttpMethod_java_lang_String_(), ecorePackage.getEString(),
				"httpMethod_java_lang_String_", null, 0, 1, MethodPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodPropsBuilder_apigateway_ResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodPropsBuilder_apigateway_IntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference", null,
				0, 1, MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodPropsBuilder_apigateway_OptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference", null,
				0, 1, MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.MethodProps", 0, 1,
				MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, MethodPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basePathMappingPropsBuilder_apigatewayEClass, BasePathMappingPropsBuilder_apigateway.class,
				"BasePathMappingPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getBasePathMappingPropsBuilder_apigateway_DomainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference", null, 0,
				1, BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingPropsBuilder_apigateway_BasePath_java_lang_String_(),
				ecorePackage.getEString(), "basePath_java_lang_String_", null, 0, 1,
				BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingPropsBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(),
				ecorePackage.getEString(),
				"stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference", null, 0, 1,
				BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.BasePathMappingProps", 0, 1,
				BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BasePathMappingPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usagePlanBuilder_apigatewayEClass, UsagePlanBuilder_apigateway.class, "UsagePlanBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getUsagePlanBuilder_apigateway_ApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(),
				ecorePackage.getEString(),
				"apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference", null, 0, 1,
				UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(),
				ecorePackage.getEString(),
				"apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList", null, 0, 1,
				UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, UsagePlanBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(),
				ecorePackage.getEString(),
				"quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference", null, 0,
				1, UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(),
				ecorePackage.getEString(),
				"throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference",
				null, 0, 1, UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.UsagePlan", 0, 1,
				UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, UsagePlanBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quotaSettingsBuilder_apigatewayEClass, QuotaSettingsBuilder_apigateway.class,
				"QuotaSettingsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuotaSettingsBuilder_apigateway_Limit_java_lang_Number_(), ecorePackage.getEInt(),
				"limit_java_lang_Number_", null, 0, 1, QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_Offset_java_lang_Number_(), ecorePackage.getEInt(),
				"offset_java_lang_Number_", null, 0, 1, QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_Period_software_amazon_awscdk_services_apigateway_Period_(),
				this.getPeriod(), "period_software_amazon_awscdk_services_apigateway_Period_", null, 0, 1,
				QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.QuotaSettings", 0, 1,
				QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuotaSettingsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, QuotaSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenAuthorizerPropsBuilder_apigatewayEClass, TokenAuthorizerPropsBuilder_apigateway.class,
				"TokenAuthorizerPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_IdentitySource_java_lang_String_(),
				ecorePackage.getEString(), "identitySource_java_lang_String_", null, 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_ValidationRegex_java_lang_String_(),
				ecorePackage.getEString(), "validationRegex_java_lang_String_", null, 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTokenAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTokenAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_(),
				ecorePackage.getEString(), "authorizerName_java_lang_String_", null, 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getTokenAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.TokenAuthorizerProps", 0, 1,
				TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAuthorizerPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, TokenAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
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

		initEClass(httpIntegrationBuilder_apigatewayEClass, HttpIntegrationBuilder_apigateway.class,
				"HttpIntegrationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpIntegrationBuilder_apigateway_HttpMethod_java_lang_String_(), ecorePackage.getEString(),
				"httpMethod_java_lang_String_", null, 0, 1, HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getHttpIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.HttpIntegration", 0, 1,
				HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpIntegrationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, HttpIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcLinkPropsBuilder_apigatewayEClass, VpcLinkPropsBuilder_apigateway.class,
				"VpcLinkPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getVpcLinkPropsBuilder_apigateway_Targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(),
				ecorePackage.getEString(),
				"targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList", null, 0,
				1, VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_VpcLinkName_java_lang_String_(), ecorePackage.getEString(),
				"vpcLinkName_java_lang_String_", null, 0, 1, VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.VpcLinkProps", 0, 1,
				VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpcLinkPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, VpcLinkPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelPropsBuilder_apigatewayEClass, ModelPropsBuilder_apigateway.class,
				"ModelPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getModelPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getModelPropsBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"schemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_ContentType_java_lang_String_(), ecorePackage.getEString(),
				"contentType_java_lang_String_", null, 0, 1, ModelPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ModelPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_ModelName_java_lang_String_(), ecorePackage.getEString(),
				"modelName_java_lang_String_", null, 0, 1, ModelPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ModelProps", 0, 1,
				ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ModelPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceBuilder_apigatewayEClass, ResourceBuilder_apigateway.class, "ResourceBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getResourceBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourceBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourceBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourceBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"parentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBuilder_apigateway_PathPart_java_lang_String_(), ecorePackage.getEString(),
				"pathPart_java_lang_String_", null, 0, 1, ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.Resource", 0, 1,
				ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throttleSettingsBuilder_apigatewayEClass, ThrottleSettingsBuilder_apigateway.class,
				"ThrottleSettingsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrottleSettingsBuilder_apigateway_BurstLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"burstLimit_java_lang_Number_", null, 0, 1, ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottleSettingsBuilder_apigateway_RateLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"rateLimit_java_lang_Number_", null, 0, 1, ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottleSettingsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ThrottleSettings", 0, 1,
				ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottleSettingsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottleSettingsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottleSettingsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ThrottleSettingsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(basePathMappingOptionsBuilder_apigatewayEClass, BasePathMappingOptionsBuilder_apigateway.class,
				"BasePathMappingOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasePathMappingOptionsBuilder_apigateway_BasePath_java_lang_String_(),
				ecorePackage.getEString(), "basePath_java_lang_String_", null, 0, 1,
				BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingOptionsBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(),
				ecorePackage.getEString(),
				"stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference", null, 0, 1,
				BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.BasePathMappingOptions", 0, 1,
				BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BasePathMappingOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(mockIntegrationBuilder_apigatewayEClass, MockIntegrationBuilder_apigateway.class,
				"MockIntegrationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMockIntegrationBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList(),
				ecorePackage.getEString(), "cacheKeyParameters_java_lang_String_AsList", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_CacheNamespace_java_lang_String_(),
				ecorePackage.getEString(), "cacheNamespace_java_lang_String_", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(),
				this.getConnectionType(), "connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_",
				null, 0, 1, MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(),
				this.getContentHandling(),
				"contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "credentialsPassthrough_java_lang_Boolean_", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(),
				ecorePackage.getEString(),
				"integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList", null, 0,
				1, MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(),
				this.getPassthroughBehavior(),
				"passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestTemplates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMockIntegrationBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(),
				ecorePackage.getEString(),
				"vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.MockIntegration", 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMockIntegrationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, MockIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageBuilder_apigatewayEClass, StageBuilder_apigateway.class, "StageBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStageBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheDataEncrypted_java_lang_Boolean_", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_CachingEnabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"cachingEnabled_java_lang_Boolean_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "dataTraceEnabled_java_lang_Boolean_", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(),
				this.getMethodLoggingLevel(),
				"loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_MetricsEnabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"metricsEnabled_java_lang_Boolean_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"throttlingBurstLimit_java_lang_Number_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"throttlingRateLimit_java_lang_Number_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(),
				ecorePackage.getEString(),
				"accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference",
				null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(),
				ecorePackage.getEString(),
				"accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference",
				null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheClusterEnabled_java_lang_Boolean_", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_CacheClusterSize_java_lang_String_(), ecorePackage.getEString(),
				"cacheClusterSize_java_lang_String_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_ClientCertificateId_java_lang_String_(), ecorePackage.getEString(),
				"clientCertificateId_java_lang_String_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_DocumentationVersion_java_lang_String_(), ecorePackage.getEString(),
				"documentationVersion_java_lang_String_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(),
				ecorePackage.getEString(),
				"methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap",
				null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_StageName_java_lang_String_(), ecorePackage.getEString(),
				"stageName_java_lang_String_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_TracingEnabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"tracingEnabled_java_lang_Boolean_", null, 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "variables_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStageBuilder_apigateway_DeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference(),
				ecorePackage.getEString(),
				"deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference", null, 0,
				1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.services.apigateway.Stage", 0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, StageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyResourceOptionsBuilder_apigatewayEClass, ProxyResourceOptionsBuilder_apigateway.class,
				"ProxyResourceOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxyResourceOptionsBuilder_apigateway_AnyMethod_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "anyMethod_java_lang_Boolean_", null, 0, 1,
				ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ProxyResourceOptions", 0, 1,
				ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ProxyResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeyBuilder_apigatewayEClass, ApiKeyBuilder_apigateway.class, "ApiKeyBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getApiKeyBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_ApiKeyName_java_lang_String_(), ecorePackage.getEString(),
				"apiKeyName_java_lang_String_", null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_Value_java_lang_String_(), ecorePackage.getEString(),
				"value_java_lang_String_", null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_CustomerId_java_lang_String_(), ecorePackage.getEString(),
				"customerId_java_lang_String_", null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_Enabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enabled_java_lang_Boolean_", null, 0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "generateDistinctId_java_lang_Boolean_", null, 0, 1,
				ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList(),
				ecorePackage.getEString(), "resources_software_amazon_awscdk_services_apigateway_RestApi_AsList", null,
				0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ApiKey", 0, 1,
				ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayResponseBuilder_apigatewayEClass, GatewayResponseBuilder_apigateway.class,
				"GatewayResponseBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayResponseBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference(),
				ecorePackage.getEString(),
				"typeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference", null, 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "responseHeaders_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_StatusCode_java_lang_String_(), ecorePackage.getEString(),
				"statusCode_java_lang_String_", null, 0, 1, GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "templates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayResponseBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.GatewayResponse", 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponseBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GatewayResponseBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestValidatorPropsBuilder_apigatewayEClass, RequestValidatorPropsBuilder_apigateway.class,
				"RequestValidatorPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRequestValidatorPropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_RequestValidatorName_java_lang_String_(),
				ecorePackage.getEString(), "requestValidatorName_java_lang_String_", null, 0, 1,
				RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_ValidateRequestBody_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestBody_java_lang_Boolean_", null, 0, 1,
				RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_ValidateRequestParameters_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "validateRequestParameters_java_lang_Boolean_", null, 0, 1,
				RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RequestValidatorProps", 0, 1,
				RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestValidatorPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RequestValidatorPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(lambdaIntegrationBuilder_apigatewayEClass, LambdaIntegrationBuilder_apigateway.class,
				"LambdaIntegrationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList(),
				ecorePackage.getEString(), "cacheKeyParameters_java_lang_String_AsList", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_CacheNamespace_java_lang_String_(),
				ecorePackage.getEString(), "cacheNamespace_java_lang_String_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(),
				this.getConnectionType(), "connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_",
				null, 0, 1, LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(),
				this.getContentHandling(),
				"contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "credentialsPassthrough_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(),
				ecorePackage.getEString(),
				"integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList", null, 0,
				1, LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(),
				this.getPassthroughBehavior(),
				"passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestTemplates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(),
				ecorePackage.getEString(),
				"vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_AllowTestInvoke_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowTestInvoke_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.LambdaIntegration", 0, 1,
				LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyResourcePropsBuilder_apigatewayEClass, ProxyResourcePropsBuilder_apigateway.class,
				"ProxyResourcePropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getProxyResourcePropsBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"parentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourcePropsBuilder_apigateway_AnyMethod_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "anyMethod_java_lang_Boolean_", null, 0, 1,
				ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourcePropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourcePropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourcePropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourcePropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ProxyResourceProps", 0, 1,
				ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourcePropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourcePropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourcePropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ProxyResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceOptionsBuilder_apigatewayEClass, ResourceOptionsBuilder_apigateway.class,
				"ResourceOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getResourceOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourceOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourceOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ResourceOptions", 0, 1,
				ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ResourceOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationPropsBuilder_apigatewayEClass, IntegrationPropsBuilder_apigateway.class,
				"IntegrationPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getIntegrationPropsBuilder_apigateway_Type_software_amazon_awscdk_services_apigateway_IntegrationType_(),
				this.getIntegrationType(), "type_software_amazon_awscdk_services_apigateway_IntegrationType_", null, 0,
				1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_IntegrationHttpMethod_java_lang_String_(),
				ecorePackage.getEString(), "integrationHttpMethod_java_lang_String_", null, 0, 1,
				IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_Uri_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"uri_java_lang_Object_", null, 0, 1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.IntegrationProps", 0, 1,
				IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, IntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(usagePlanPerApiStageBuilder_apigatewayEClass, UsagePlanPerApiStageBuilder_apigateway.class,
				"UsagePlanPerApiStageBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getUsagePlanPerApiStageBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanPerApiStageBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(),
				ecorePackage.getEString(),
				"stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference", null, 0, 1,
				UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanPerApiStageBuilder_apigateway_Throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList(),
				ecorePackage.getEString(),
				"throttle_software_amazon_awscdk_services_apigateway_ThrottlingPerMethod_AsList", null, 0, 1,
				UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPerApiStageBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage", 0, 1,
				UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPerApiStageBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPerApiStageBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPerApiStageBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, UsagePlanPerApiStageBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specRestApiBuilder_apigatewayEClass, SpecRestApiBuilder_apigateway.class,
				"SpecRestApiBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_Deploy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"deploy_java_lang_Boolean_", null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiBuilder_apigateway_ApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference(),
				ecorePackage.getEString(),
				"apiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.SpecRestApi", 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SpecRestApiBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiDefinitionS3LocationBuilder_apigatewayEClass, ApiDefinitionS3LocationBuilder_apigateway.class,
				"ApiDefinitionS3LocationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_Bucket_java_lang_String_(),
				ecorePackage.getEString(), "bucket_java_lang_String_", null, 0, 1,
				ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_Key_java_lang_String_(), ecorePackage.getEString(),
				"key_java_lang_String_", null, 0, 1, ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_Version_java_lang_String_(),
				ecorePackage.getEString(), "version_java_lang_String_", null, 0, 1,
				ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location", 0, 1,
				ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiDefinitionS3LocationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ApiDefinitionS3LocationBuilder_apigateway.class, !IS_TRANSIENT,
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

		initEClass(apiKeyPropsBuilder_apigatewayEClass, ApiKeyPropsBuilder_apigateway.class,
				"ApiKeyPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiKeyPropsBuilder_apigateway_CustomerId_java_lang_String_(), ecorePackage.getEString(),
				"customerId_java_lang_String_", null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_Enabled_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"enabled_java_lang_Boolean_", null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "generateDistinctId_java_lang_Boolean_", null, 0, 1,
				ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyPropsBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList(),
				ecorePackage.getEString(), "resources_software_amazon_awscdk_services_apigateway_RestApi_AsList", null,
				0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_ApiKeyName_java_lang_String_(), ecorePackage.getEString(),
				"apiKeyName_java_lang_String_", null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_Value_java_lang_String_(), ecorePackage.getEString(),
				"value_java_lang_String_", null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ApiKeyProps", 0, 1,
				ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateLimitedApiKeyPropsBuilder_apigatewayEClass, RateLimitedApiKeyPropsBuilder_apigateway.class,
				"RateLimitedApiKeyPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(),
				ecorePackage.getEString(),
				"apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(),
				ecorePackage.getEString(),
				"quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference", null, 0,
				1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(),
				ecorePackage.getEString(),
				"throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference",
				null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_CustomerId_java_lang_String_(),
				ecorePackage.getEString(), "customerId_java_lang_String_", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_Description_java_lang_String_(),
				ecorePackage.getEString(), "description_java_lang_String_", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_Enabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enabled_java_lang_Boolean_", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "generateDistinctId_java_lang_Boolean_", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList(),
				ecorePackage.getEString(), "resources_software_amazon_awscdk_services_apigateway_RestApi_AsList", null,
				0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_ApiKeyName_java_lang_String_(),
				ecorePackage.getEString(), "apiKeyName_java_lang_String_", null, 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_Value_java_lang_String_(), ecorePackage.getEString(),
				"value_java_lang_String_", null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps", 0, 1,
				RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RateLimitedApiKeyPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentBuilder_apigatewayEClass, DeploymentBuilder_apigateway.class,
				"DeploymentBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDeploymentBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, DeploymentBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.Deployment", 0, 1,
				DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, DeploymentBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
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

		initEClass(deploymentPropsBuilder_apigatewayEClass, DeploymentPropsBuilder_apigateway.class,
				"DeploymentPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDeploymentPropsBuilder_apigateway_ApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"apiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.DeploymentProps", 0, 1,
				DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DeploymentPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsIntegrationBuilder_apigatewayEClass, AwsIntegrationBuilder_apigateway.class,
				"AwsIntegrationBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Service_java_lang_String_(), ecorePackage.getEString(),
				"service_java_lang_String_", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Action_java_lang_String_(), ecorePackage.getEString(),
				"action_java_lang_String_", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_ActionParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "actionParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_IntegrationHttpMethod_java_lang_String_(),
				ecorePackage.getEString(), "integrationHttpMethod_java_lang_String_", null, 0, 1,
				AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAwsIntegrationBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Proxy_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"proxy_java_lang_Boolean_", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Subdomain_java_lang_String_(), ecorePackage.getEString(),
				"subdomain_java_lang_String_", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.AwsIntegration", 0, 1,
				AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AwsIntegrationBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
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

		initEClass(stagePropsBuilder_apigatewayEClass, StagePropsBuilder_apigateway.class,
				"StagePropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getStagePropsBuilder_apigateway_DeploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference(),
				ecorePackage.getEString(),
				"deploymentWithDeployment_software_amazon_awscdk_services_apigateway_Deployment_AsReference", null, 0,
				1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStagePropsBuilder_apigateway_AccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference(),
				ecorePackage.getEString(),
				"accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference",
				null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStagePropsBuilder_apigateway_AccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference(),
				ecorePackage.getEString(),
				"accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference",
				null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_CacheClusterEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheClusterEnabled_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_CacheClusterSize_java_lang_String_(), ecorePackage.getEString(),
				"cacheClusterSize_java_lang_String_", null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_ClientCertificateId_java_lang_String_(),
				ecorePackage.getEString(), "clientCertificateId_java_lang_String_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_DocumentationVersion_java_lang_String_(),
				ecorePackage.getEString(), "documentationVersion_java_lang_String_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStagePropsBuilder_apigateway_MethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap(),
				ecorePackage.getEString(),
				"methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap",
				null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_StageName_java_lang_String_(), ecorePackage.getEString(),
				"stageName_java_lang_String_", null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_TracingEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "tracingEnabled_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_Variables_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "variables_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_CacheDataEncrypted_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cacheDataEncrypted_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStagePropsBuilder_apigateway_CacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference",
				null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_CachingEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cachingEnabled_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_DataTraceEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "dataTraceEnabled_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStagePropsBuilder_apigateway_LoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_(),
				this.getMethodLoggingLevel(),
				"loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_MetricsEnabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "metricsEnabled_java_lang_Boolean_", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_ThrottlingBurstLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"throttlingBurstLimit_java_lang_Number_", null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_ThrottlingRateLimit_java_lang_Number_(), ecorePackage.getEInt(),
				"throttlingRateLimit_java_lang_Number_", null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.StageProps", 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStagePropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, StagePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaAuthorizerPropsBuilder_apigatewayEClass, LambdaAuthorizerPropsBuilder_apigateway.class,
				"LambdaAuthorizerPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getLambdaAuthorizerPropsBuilder_apigateway_HandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(),
				ecorePackage.getEString(),
				"handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference", null, 0, 1,
				LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaAuthorizerPropsBuilder_apigateway_AssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(), "assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference",
				null, 0, 1, LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaAuthorizerPropsBuilder_apigateway_AuthorizerName_java_lang_String_(),
				ecorePackage.getEString(), "authorizerName_java_lang_String_", null, 0, 1,
				LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaAuthorizerPropsBuilder_apigateway_ResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(),
				"resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference", null, 0, 1,
				LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaAuthorizerPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps", 0, 1,
				LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaAuthorizerPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaAuthorizerPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaAuthorizerPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaAuthorizerPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsIntegrationPropsBuilder_apigatewayEClass, AwsIntegrationPropsBuilder_apigateway.class,
				"AwsIntegrationPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Service_java_lang_String_(), ecorePackage.getEString(),
				"service_java_lang_String_", null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Action_java_lang_String_(), ecorePackage.getEString(),
				"action_java_lang_String_", null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAwsIntegrationPropsBuilder_apigateway_ActionParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "actionParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_IntegrationHttpMethod_java_lang_String_(),
				ecorePackage.getEString(), "integrationHttpMethod_java_lang_String_", null, 0, 1,
				AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getAwsIntegrationPropsBuilder_apigateway_OptionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithIntegrationOptions_software_amazon_awscdk_services_apigateway_IntegrationOptions_AsReference",
				null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Path_java_lang_String_(), ecorePackage.getEString(),
				"path_java_lang_String_", null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Subdomain_java_lang_String_(),
				ecorePackage.getEString(), "subdomain_java_lang_String_", null, 0, 1,
				AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.AwsIntegrationProps", 0, 1,
				AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwsIntegrationPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AwsIntegrationPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
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

		initEClass(domainNamePropsBuilder_apigatewayEClass, DomainNamePropsBuilder_apigateway.class,
				"DomainNamePropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDomainNamePropsBuilder_apigateway_MappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"mappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNamePropsBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(),
				ecorePackage.getEString(),
				"certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference",
				null, 0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNamePropsBuilder_apigateway_DomainName_java_lang_String_(), ecorePackage.getEString(),
				"domainName_java_lang_String_", null, 0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNamePropsBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(),
				this.getEndpointType(), "endpointType_software_amazon_awscdk_services_apigateway_EndpointType_", null,
				0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNamePropsBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(),
				this.getSecurityPolicy(), "securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_",
				null, 0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNamePropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.DomainNameProps", 0, 1,
				DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNamePropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNamePropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNamePropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DomainNamePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
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

		initEClass(restApiOptionsBuilder_apigatewayEClass, RestApiOptionsBuilder_apigateway.class,
				"RestApiOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestApiOptionsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_Deploy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deploy_java_lang_Boolean_", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRestApiOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RestApiOptions", 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestApiOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RestApiOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaIntegrationOptionsBuilder_apigatewayEClass, LambdaIntegrationOptionsBuilder_apigateway.class,
				"LambdaIntegrationOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_AllowTestInvoke_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "allowTestInvoke_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_Proxy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "proxy_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_CacheKeyParameters_java_lang_String_AsList(),
				ecorePackage.getEString(), "cacheKeyParameters_java_lang_String_AsList", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_CacheNamespace_java_lang_String_(),
				ecorePackage.getEString(), "cacheNamespace_java_lang_String_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_ConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_(),
				this.getConnectionType(), "connectionType_software_amazon_awscdk_services_apigateway_ConnectionType_",
				null, 0, 1, LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_ContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_(),
				this.getContentHandling(),
				"contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_CredentialsPassthrough_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "credentialsPassthrough_java_lang_Boolean_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_CredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(),
				ecorePackage.getEString(),
				"credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_IntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList(),
				ecorePackage.getEString(),
				"integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList", null, 0,
				1, LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_PassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_(),
				this.getPassthroughBehavior(),
				"passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_RequestParameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestParameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_RequestTemplates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "requestTemplates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getLambdaIntegrationOptionsBuilder_apigateway_VpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference(),
				ecorePackage.getEString(),
				"vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference", null, 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions", 0, 1,
				LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLambdaIntegrationOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LambdaIntegrationOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(resourcePropsBuilder_apigatewayEClass, ResourcePropsBuilder_apigateway.class,
				"ResourcePropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getResourcePropsBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"parentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_apigateway_PathPart_java_lang_String_(), ecorePackage.getEString(),
				"pathPart_java_lang_String_", null, 0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourcePropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourcePropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResourcePropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ResourceProps", 0, 1,
				ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ResourcePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateLimitedApiKeyBuilder_apigatewayEClass, RateLimitedApiKeyBuilder_apigateway.class,
				"RateLimitedApiKeyBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_ApiKeyName_java_lang_String_(), ecorePackage.getEString(),
				"apiKeyName_java_lang_String_", null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_Value_java_lang_String_(), ecorePackage.getEString(),
				"value_java_lang_String_", null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_CustomerId_java_lang_String_(), ecorePackage.getEString(),
				"customerId_java_lang_String_", null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_Description_java_lang_String_(),
				ecorePackage.getEString(), "description_java_lang_String_", null, 0, 1,
				RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_Enabled_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "enabled_java_lang_Boolean_", null, 0, 1,
				RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_GenerateDistinctId_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "generateDistinctId_java_lang_Boolean_", null, 0, 1,
				RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_Resources_software_amazon_awscdk_services_apigateway_RestApi_AsList(),
				ecorePackage.getEString(), "resources_software_amazon_awscdk_services_apigateway_RestApi_AsList", null,
				0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(),
				ecorePackage.getEString(),
				"apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList", null, 0, 1,
				RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(),
				ecorePackage.getEString(),
				"quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference", null, 0,
				1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getRateLimitedApiKeyBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(),
				ecorePackage.getEString(),
				"throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference",
				null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.RateLimitedApiKey", 0, 1,
				RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateLimitedApiKeyBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RateLimitedApiKeyBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeyOptionsBuilder_apigatewayEClass, ApiKeyOptionsBuilder_apigateway.class,
				"ApiKeyOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_ApiKeyName_java_lang_String_(), ecorePackage.getEString(),
				"apiKeyName_java_lang_String_", null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_Value_java_lang_String_(), ecorePackage.getEString(),
				"value_java_lang_String_", null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyOptionsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyOptionsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getApiKeyOptionsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ApiKeyOptions", 0, 1,
				ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiKeyOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ApiKeyOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelOptionsBuilder_apigatewayEClass, ModelOptionsBuilder_apigateway.class,
				"ModelOptionsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getModelOptionsBuilder_apigateway_SchemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(),
				ecorePackage.getEString(),
				"schemaWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference", null, 0, 1,
				ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_ContentType_java_lang_String_(), ecorePackage.getEString(),
				"contentType_java_lang_String_", null, 0, 1, ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_ModelName_java_lang_String_(), ecorePackage.getEString(),
				"modelName_java_lang_String_", null, 0, 1, ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ModelOptions", 0, 1,
				ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelOptionsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ModelOptionsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basePathMappingBuilder_apigatewayEClass, BasePathMappingBuilder_apigateway.class,
				"BasePathMappingBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasePathMappingBuilder_apigateway_BasePath_java_lang_String_(), ecorePackage.getEString(),
				"basePath_java_lang_String_", null, 0, 1, BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingBuilder_apigateway_StageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference(),
				ecorePackage.getEString(),
				"stageWithStage_software_amazon_awscdk_services_apigateway_Stage_AsReference", null, 0, 1,
				BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingBuilder_apigateway_DomainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithIDomainName_software_amazon_awscdk_services_apigateway_IDomainName_AsReference", null, 0,
				1, BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getBasePathMappingBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.BasePathMapping", 0, 1,
				BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasePathMappingBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BasePathMappingBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainNameAttributesBuilder_apigatewayEClass, DomainNameAttributesBuilder_apigateway.class,
				"DomainNameAttributesBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_DomainName_java_lang_String_(),
				ecorePackage.getEString(), "domainName_java_lang_String_", null, 0, 1,
				DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_DomainNameAliasHostedZoneId_java_lang_String_(),
				ecorePackage.getEString(), "domainNameAliasHostedZoneId_java_lang_String_", null, 0, 1,
				DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_DomainNameAliasTarget_java_lang_String_(),
				ecorePackage.getEString(), "domainNameAliasTarget_java_lang_String_", null, 0, 1,
				DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.DomainNameAttributes", 0, 1,
				DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameAttributesBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DomainNameAttributesBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throttlingPerMethodBuilder_apigatewayEClass, ThrottlingPerMethodBuilder_apigateway.class,
				"ThrottlingPerMethodBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getThrottlingPerMethodBuilder_apigateway_MethodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference(),
				ecorePackage.getEString(),
				"methodWithMethod_software_amazon_awscdk_services_apigateway_Method_AsReference", null, 0, 1,
				ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getThrottlingPerMethodBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(),
				ecorePackage.getEString(),
				"throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference",
				null, 0, 1, ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottlingPerMethodBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ThrottlingPerMethod", 0, 1,
				ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottlingPerMethodBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottlingPerMethodBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrottlingPerMethodBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, ThrottlingPerMethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usagePlanPropsBuilder_apigatewayEClass, UsagePlanPropsBuilder_apigateway.class,
				"UsagePlanPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getUsagePlanPropsBuilder_apigateway_ApiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference(),
				ecorePackage.getEString(),
				"apiKeyWithIApiKey_software_amazon_awscdk_services_apigateway_IApiKey_AsReference", null, 0, 1,
				UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanPropsBuilder_apigateway_ApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList(),
				ecorePackage.getEString(),
				"apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList", null, 0, 1,
				UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_Name_java_lang_String_(), ecorePackage.getEString(),
				"name_java_lang_String_", null, 0, 1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanPropsBuilder_apigateway_QuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference(),
				ecorePackage.getEString(),
				"quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference", null, 0,
				1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getUsagePlanPropsBuilder_apigateway_ThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference(),
				ecorePackage.getEString(),
				"throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference",
				null, 0, 1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.UsagePlanProps", 0, 1,
				UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsagePlanPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, UsagePlanPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayResponsePropsBuilder_apigatewayEClass, GatewayResponsePropsBuilder_apigateway.class,
				"GatewayResponsePropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getGatewayResponsePropsBuilder_apigateway_RestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayResponsePropsBuilder_apigateway_TypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference(),
				ecorePackage.getEString(),
				"typeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference", null, 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getGatewayResponsePropsBuilder_apigateway_ResponseHeaders_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "responseHeaders_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_StatusCode_java_lang_String_(),
				ecorePackage.getEString(), "statusCode_java_lang_String_", null, 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_Templates_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "templates_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.GatewayResponseProps", 0, 1,
				GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayResponsePropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GatewayResponsePropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainNameBuilder_apigatewayEClass, DomainNameBuilder_apigateway.class,
				"DomainNameBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDomainNameBuilder_apigateway_CertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference(),
				ecorePackage.getEString(),
				"certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference",
				null, 0, 1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameBuilder_apigateway_DomainName_java_lang_String_(), ecorePackage.getEString(),
				"domainName_java_lang_String_", null, 0, 1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNameBuilder_apigateway_EndpointType_software_amazon_awscdk_services_apigateway_EndpointType_(),
				this.getEndpointType(), "endpointType_software_amazon_awscdk_services_apigateway_EndpointType_", null,
				0, 1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNameBuilder_apigateway_SecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_(),
				this.getSecurityPolicy(), "securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_",
				null, 0, 1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDomainNameBuilder_apigateway_MappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference(),
				ecorePackage.getEString(),
				"mappingWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference", null, 0, 1,
				DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.DomainName", 0, 1,
				DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainNameBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, DomainNameBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyResourceBuilder_apigatewayEClass, ProxyResourceBuilder_apigateway.class,
				"ProxyResourceBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getProxyResourceBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceBuilder_apigateway_AnyMethod_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "anyMethod_java_lang_Boolean_", null, 0, 1,
				ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getProxyResourceBuilder_apigateway_ParentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"parentWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.ProxyResource", 0, 1,
				ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyResourceBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ProxyResourceBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessLogDestinationConfigBuilder_apigatewayEClass,
				AccessLogDestinationConfigBuilder_apigateway.class, "AccessLogDestinationConfigBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessLogDestinationConfigBuilder_apigateway_DestinationArn_java_lang_String_(),
				ecorePackage.getEString(), "destinationArn_java_lang_String_", null, 0, 1,
				AccessLogDestinationConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogDestinationConfigBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig", 0, 1,
				AccessLogDestinationConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogDestinationConfigBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, AccessLogDestinationConfigBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogDestinationConfigBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, AccessLogDestinationConfigBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogDestinationConfigBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, AccessLogDestinationConfigBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodBuilder_apigatewayEClass, MethodBuilder_apigateway.class, "MethodBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodBuilder_apigateway_HttpMethod_java_lang_String_(), ecorePackage.getEString(),
				"httpMethod_java_lang_String_", null, 0, 1, MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodBuilder_apigateway_ResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference(),
				ecorePackage.getEString(),
				"resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference", null, 0, 1,
				MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodBuilder_apigateway_IntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference", null,
				0, 1, MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getMethodBuilder_apigateway_OptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference", null,
				0, 1, MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.Method", 0, 1,
				MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, MethodBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonWithStandardFieldPropsBuilder_apigatewayEClass,
				JsonWithStandardFieldPropsBuilder_apigateway.class, "JsonWithStandardFieldPropsBuilder_apigateway",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_Caller_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "caller_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_HttpMethod_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "httpMethod_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_Ip_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "ip_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_Protocol_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "protocol_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_RequestTime_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "requestTime_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_ResourcePath_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "resourcePath_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_ResponseLength_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "responseLength_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_Status_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "status_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_User_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "user_java_lang_Boolean_", null, 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps", 0, 1,
				JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonWithStandardFieldPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, JsonWithStandardFieldPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specRestApiPropsBuilder_apigatewayEClass, SpecRestApiPropsBuilder_apigateway.class,
				"SpecRestApiPropsBuilder_apigateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_ApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference(),
				ecorePackage.getEString(),
				"apiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_CloudWatchRole_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "cloudWatchRole_java_lang_Boolean_", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_Deploy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "deploy_java_lang_Boolean_", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_DeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference(),
				ecorePackage.getEString(),
				"deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_DomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference(),
				ecorePackage.getEString(),
				"domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_EndpointExportName_java_lang_String_(),
				ecorePackage.getEString(), "endpointExportName_java_lang_String_", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_FailOnWarnings_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "failOnWarnings_java_lang_Boolean_", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_PolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(),
				ecorePackage.getEString(),
				"policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_RestApiName_java_lang_String_(), ecorePackage.getEString(),
				"restApiName_java_lang_String_", null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_RetainDeployments_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "retainDeployments_java_lang_Boolean_", null, 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_DefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_DefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference(),
				ecorePackage.getEString(),
				"defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSpecRestApiPropsBuilder_apigateway_DefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference(),
				ecorePackage.getEString(),
				"defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.services.apigateway.SpecRestApiProps", 0, 1,
				SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecRestApiPropsBuilder_apigateway_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SpecRestApiPropsBuilder_apigateway.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contentHandlingEEnum, ContentHandling.class, "ContentHandling");
		addEEnumLiteral(contentHandlingEEnum, ContentHandling.CONVERT_TO_BINARY);
		addEEnumLiteral(contentHandlingEEnum, ContentHandling.CONVERT_TO_TEXT);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.INTERNET);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.VPC_LINK);

		initEEnum(authorizationTypeEEnum, AuthorizationType.class, "AuthorizationType");
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.NONE);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.IAM);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.CUSTOM);
		addEEnumLiteral(authorizationTypeEEnum, AuthorizationType.COGNITO);

		initEEnum(methodLoggingLevelEEnum, MethodLoggingLevel.class, "MethodLoggingLevel");
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.OFF);
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.ERROR);
		addEEnumLiteral(methodLoggingLevelEEnum, MethodLoggingLevel.INFO);

		initEEnum(endpointTypeEEnum, EndpointType.class, "EndpointType");
		addEEnumLiteral(endpointTypeEEnum, EndpointType.EDGE);
		addEEnumLiteral(endpointTypeEEnum, EndpointType.REGIONAL);
		addEEnumLiteral(endpointTypeEEnum, EndpointType.PRIVATE);

		initEEnum(apiKeySourceTypeEEnum, ApiKeySourceType.class, "ApiKeySourceType");
		addEEnumLiteral(apiKeySourceTypeEEnum, ApiKeySourceType.HEADER);
		addEEnumLiteral(apiKeySourceTypeEEnum, ApiKeySourceType.AUTHORIZER);

		initEEnum(periodEEnum, Period.class, "Period");
		addEEnumLiteral(periodEEnum, Period.DAY);
		addEEnumLiteral(periodEEnum, Period.WEEK);
		addEEnumLiteral(periodEEnum, Period.MONTH);

		initEEnum(integrationTypeEEnum, IntegrationType.class, "IntegrationType");
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.AWS);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.AWS_PROXY);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.HTTP);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.HTTP_PROXY);
		addEEnumLiteral(integrationTypeEEnum, IntegrationType.MOCK);

		initEEnum(securityPolicyEEnum, SecurityPolicy.class, "SecurityPolicy");
		addEEnumLiteral(securityPolicyEEnum, SecurityPolicy.TLS_10);
		addEEnumLiteral(securityPolicyEEnum, SecurityPolicy.TLS_12);

		initEEnum(passthroughBehaviorEEnum, PassthroughBehavior.class, "PassthroughBehavior");
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.WHEN_NO_MATCH);
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.NEVER);
		addEEnumLiteral(passthroughBehaviorEEnum, PassthroughBehavior.WHEN_NO_TEMPLATES);

		initEEnum(jsonSchemaTypeEEnum, JsonSchemaType.class, "JsonSchemaType");
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.NULL);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.BOOLEAN);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.OBJECT);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.ARRAY);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.NUMBER);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.INTEGER);
		addEEnumLiteral(jsonSchemaTypeEEnum, JsonSchemaType.STRING);

		initEEnum(jsonSchemaVersionEEnum, JsonSchemaVersion.class, "JsonSchemaVersion");
		addEEnumLiteral(jsonSchemaVersionEEnum, JsonSchemaVersion.DRAFT4);
		addEEnumLiteral(jsonSchemaVersionEEnum, JsonSchemaVersion.DRAFT7);

		// Create resource
		createResource(eNS_URI);
	}

} //ApigatewayPackageImpl
