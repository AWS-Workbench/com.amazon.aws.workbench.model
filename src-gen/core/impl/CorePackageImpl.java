/**
 */
package core.impl;

import apigateway.ApigatewayPackage;

import apigateway.impl.ApigatewayPackageImpl;

import certificatemanager.CertificatemanagerPackage;

import certificatemanager.impl.CertificatemanagerPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import com.amazon.aws.workbench.model.awsworkbench.impl.AwsworkbenchPackageImpl;

import core.AppBuilder_core;
import core.AppPropsBuilder_core;
import core.ArnComponentsBuilder_core;
import core.AssetStagingBuilder_core;
import core.AssetStagingPropsBuilder_core;
import core.BootstraplessSynthesizerBuilder_core;
import core.BootstraplessSynthesizerPropsBuilder_core;
import core.CfnCapabilities;
import core.CfnDeletionPolicy;
import core.CfnDynamicReferenceService;
import core.ConstructOrder;
import core.CopyOptionsBuilder_core;
import core.CoreFactory;
import core.CorePackage;
import core.CustomResourceBuilder_core;
import core.CustomResourcePropsBuilder_core;
import core.CustomResourceProviderPropsBuilder_core;
import core.CustomResourceProviderRuntime;
import core.DefaultStackSynthesizerBuilder_core;
import core.DefaultStackSynthesizerPropsBuilder_core;
import core.DependencyBuilder_core;
import core.DockerImageAssetLocationBuilder_core;
import core.DockerImageAssetSourceBuilder_core;
import core.EncodingOptionsBuilder_core;
import core.EnvironmentBuilder_core;
import core.FileAssetLocationBuilder_core;
import core.FileAssetPackaging;
import core.FileAssetSourceBuilder_core;
import core.FingerprintOptionsBuilder_core;
import core.FromCloudFormationOptionsBuilder_core;
import core.GetContextKeyOptionsBuilder_core;
import core.GetContextKeyResultBuilder_core;
import core.GetContextValueOptionsBuilder_core;
import core.GetContextValueResultBuilder_core;
import core.LazyAnyValueOptionsBuilder_core;
import core.LazyListValueOptionsBuilder_core;
import core.LazyStringValueOptionsBuilder_core;
import core.NestedStackBuilder_core;
import core.NestedStackPropsBuilder_core;
import core.RemovalPolicy;
import core.RemovalPolicyOptionsBuilder_core;
import core.RemoveTagBuilder_core;
import core.ResolveOptionsBuilder_core;
import core.ResourcePropsBuilder_core;
import core.SecretsManagerSecretOptionsBuilder_core;
import core.SizeConversionOptionsBuilder_core;
import core.SizeRoundingBehavior;
import core.StackBuilder_core;
import core.StackPropsBuilder_core;
import core.SymlinkFollowMode;
import core.SynthesisOptionsBuilder_core;
import core.TagBuilder_core;
import core.TagManagerBuilder_core;
import core.TagManagerOptionsBuilder_core;
import core.TagPropsBuilder_core;
import core.TagType;
import core.TimeConversionOptionsBuilder_core;
import core.ValidationErrorBuilder_core;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
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
	private EClass resolveOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetStagingBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedStackBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConversionOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeTagBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removalPolicyOptionsBuilder_coreEClass = null;

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
	private EClass fileAssetLocationBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fingerprintOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyListValueOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customResourceBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContextKeyOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationErrorBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synthesisOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerImageAssetLocationBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileAssetSourceBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContextValueOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstraplessSynthesizerBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arnComponentsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeConversionOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromCloudFormationOptionsBuilder_coreEClass = null;

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
	private EClass customResourceProviderPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyStringValueOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultStackSynthesizerPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagManagerOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretsManagerSecretOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstraplessSynthesizerPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContextValueResultBuilder_coreEClass = null;

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
	private EClass tagManagerBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyAnyValueOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerImageAssetSourceBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedStackPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContextKeyResultBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetStagingPropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyOptionsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customResourcePropsBuilder_coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileAssetPackagingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cfnDynamicReferenceServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagTypeEEnum = null;

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
	private EEnum sizeRoundingBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cfnCapabilitiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constructOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customResourceProviderRuntimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cfnDeletionPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symlinkFollowModeEEnum = null;

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
	 * @see core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited)
			return (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl
				? (CorePackageImpl) registeredCorePackage
				: new CorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AwsworkbenchPackage.eNS_URI);
		AwsworkbenchPackageImpl theAwsworkbenchPackage = (AwsworkbenchPackageImpl) (registeredPackage instanceof AwsworkbenchPackageImpl
				? registeredPackage
				: AwsworkbenchPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamodbPackage.eNS_URI);
		DynamodbPackageImpl theDynamodbPackage = (DynamodbPackageImpl) (registeredPackage instanceof DynamodbPackageImpl
				? registeredPackage
				: DynamodbPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theAwsworkbenchPackage.createPackageContents();
		theEc2Package.createPackageContents();
		theApigatewayPackage.createPackageContents();
		theCertificatemanagerPackage.createPackageContents();
		theIamPackage.createPackageContents();
		theDynamodbPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theAwsworkbenchPackage.initializePackageContents();
		theEc2Package.initializePackageContents();
		theApigatewayPackage.initializePackageContents();
		theCertificatemanagerPackage.initializePackageContents();
		theIamPackage.initializePackageContents();
		theDynamodbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
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
	public EClass getResolveOptionsBuilder_core() {
		return resolveOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_ResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_Preparing_java_lang_Boolean_() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_VarName() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_Identifier() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolveOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) resolveOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetStagingBuilder_core() {
		return assetStagingBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_Exclude_java_lang_String_AsList() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_ExtraHash_java_lang_String_() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_SourcePath_java_lang_String_() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_GeneratedClassName() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_VarName() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_Identifier() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingBuilder_core_AdditionalCode() {
		return (EAttribute) assetStagingBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedStackBuilder_core() {
		return nestedStackBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_NotificationArns_java_lang_String_AsList() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_GeneratedClassName() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_VarName() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_Identifier() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackBuilder_core_AdditionalCode() {
		return (EAttribute) nestedStackBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStackPropsBuilder_core() {
		return stackPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_Description_java_lang_String_() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_StackName_java_lang_String_() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_Tags_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_TerminationProtection_java_lang_Boolean_() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_VarName() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_Identifier() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackPropsBuilder_core_AdditionalCode() {
		return (EAttribute) stackPropsBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeConversionOptionsBuilder_core() {
		return timeConversionOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeConversionOptionsBuilder_core_Integral_java_lang_Boolean_() {
		return (EAttribute) timeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeConversionOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) timeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeConversionOptionsBuilder_core_VarName() {
		return (EAttribute) timeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeConversionOptionsBuilder_core_Identifier() {
		return (EAttribute) timeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeConversionOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) timeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveTagBuilder_core() {
		return removeTagBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_Priority_java_lang_Number_() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_GeneratedClassName() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_VarName() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_Identifier() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoveTagBuilder_core_AdditionalCode() {
		return (EAttribute) removeTagBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagPropsBuilder_core() {
		return tagPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_ExcludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_IncludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_Priority_java_lang_Number_() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_VarName() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_Identifier() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropsBuilder_core_AdditionalCode() {
		return (EAttribute) tagPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemovalPolicyOptionsBuilder_core() {
		return removalPolicyOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_ApplyToUpdateReplacePolicy_java_lang_Boolean_() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_DefaultValue_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_VarName() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_Identifier() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemovalPolicyOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) removalPolicyOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
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
	public EClass getFileAssetLocationBuilder_core() {
		return fileAssetLocationBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_BucketName_java_lang_String_() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_HttpUrl_java_lang_String_() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_ObjectKey_java_lang_String_() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_S3ObjectUrl_java_lang_String_() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_S3Url_java_lang_String_() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_GeneratedClassName() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_VarName() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_Identifier() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetLocationBuilder_core_AdditionalCode() {
		return (EAttribute) fileAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFingerprintOptionsBuilder_core() {
		return fingerprintOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_ExtraHash_java_lang_String_() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_Exclude_java_lang_String_AsList() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_VarName() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_Identifier() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFingerprintOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) fingerprintOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLazyListValueOptionsBuilder_core() {
		return lazyListValueOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_DisplayHint_java_lang_String_() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_OmitEmpty_java_lang_Boolean_() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_VarName() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_Identifier() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyListValueOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) lazyListValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomResourceBuilder_core() {
		return customResourceBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_ServiceToken_java_lang_String_() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_PascalCaseProperties_java_lang_Boolean_() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_ResourceType_java_lang_String_() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_GeneratedClassName() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_VarName() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_Identifier() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceBuilder_core_AdditionalCode() {
		return (EAttribute) customResourceBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetContextKeyOptionsBuilder_core() {
		return getContextKeyOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_Provider_java_lang_String_() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_VarName() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_Identifier() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) getContextKeyOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationErrorBuilder_core() {
		return validationErrorBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_Message_java_lang_String_() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_SourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_GeneratedClassName() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_VarName() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_Identifier() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationErrorBuilder_core_AdditionalCode() {
		return (EAttribute) validationErrorBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynthesisOptionsBuilder_core() {
		return synthesisOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_Outdir_java_lang_String_() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_SkipValidation_java_lang_Boolean_() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_RuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_VarName() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_Identifier() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynthesisOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) synthesisOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerImageAssetLocationBuilder_core() {
		return dockerImageAssetLocationBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_ImageUri_java_lang_String_() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_RepositoryName_java_lang_String_() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_GeneratedClassName() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_VarName() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_Identifier() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetLocationBuilder_core_AdditionalCode() {
		return (EAttribute) dockerImageAssetLocationBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileAssetSourceBuilder_core() {
		return fileAssetSourceBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_FileName_java_lang_String_() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_Packaging_software_amazon_awscdk_core_FileAssetPackaging_() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_SourceHash_java_lang_String_() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_GeneratedClassName() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_VarName() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_Identifier() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileAssetSourceBuilder_core_AdditionalCode() {
		return (EAttribute) fileAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetContextValueOptionsBuilder_core() {
		return getContextValueOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_DummyValue_java_lang_Object_() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_Provider_java_lang_String_() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_VarName() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_Identifier() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) getContextValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstraplessSynthesizerBuilder_core() {
		return bootstraplessSynthesizerBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_DeployRoleArn_java_lang_String_() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_GeneratedClassName() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_VarName() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_Identifier() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerBuilder_core_AdditionalCode() {
		return (EAttribute) bootstraplessSynthesizerBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArnComponentsBuilder_core() {
		return arnComponentsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Resource_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Service_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Account_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Partition_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Region_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_ResourceName_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Sep_java_lang_String_() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_GeneratedClassName() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_VarName() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_Identifier() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArnComponentsBuilder_core_AdditionalCode() {
		return (EAttribute) arnComponentsBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagBuilder_core() {
		return tagBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_Priority_java_lang_Number_() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_GeneratedClassName() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_VarName() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_Identifier() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBuilder_core_AdditionalCode() {
		return (EAttribute) tagBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourcePropsBuilder_core() {
		return resourcePropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_core_PhysicalName_java_lang_String_() {
		return (EAttribute) resourcePropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_core_GeneratedClassName() {
		return (EAttribute) resourcePropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_core_VarName() {
		return (EAttribute) resourcePropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_core_Identifier() {
		return (EAttribute) resourcePropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourcePropsBuilder_core_AdditionalCode() {
		return (EAttribute) resourcePropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSizeConversionOptionsBuilder_core() {
		return sizeConversionOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSizeConversionOptionsBuilder_core_Rounding_software_amazon_awscdk_core_SizeRoundingBehavior_() {
		return (EAttribute) sizeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSizeConversionOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) sizeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSizeConversionOptionsBuilder_core_VarName() {
		return (EAttribute) sizeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSizeConversionOptionsBuilder_core_Identifier() {
		return (EAttribute) sizeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSizeConversionOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) sizeConversionOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncodingOptionsBuilder_core() {
		return encodingOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingOptionsBuilder_core_DisplayHint_java_lang_String_() {
		return (EAttribute) encodingOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) encodingOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingOptionsBuilder_core_VarName() {
		return (EAttribute) encodingOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingOptionsBuilder_core_Identifier() {
		return (EAttribute) encodingOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) encodingOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromCloudFormationOptionsBuilder_core() {
		return fromCloudFormationOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromCloudFormationOptionsBuilder_core_FinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference() {
		return (EAttribute) fromCloudFormationOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromCloudFormationOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) fromCloudFormationOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromCloudFormationOptionsBuilder_core_VarName() {
		return (EAttribute) fromCloudFormationOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromCloudFormationOptionsBuilder_core_Identifier() {
		return (EAttribute) fromCloudFormationOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromCloudFormationOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) fromCloudFormationOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
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
	public EClass getCustomResourceProviderPropsBuilder_core() {
		return customResourceProviderPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_CodeDirectory_java_lang_String_() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_Runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_MemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_PolicyStatements_java_lang_Object_AsList() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_VarName() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_Identifier() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourceProviderPropsBuilder_core_AdditionalCode() {
		return (EAttribute) customResourceProviderPropsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLazyStringValueOptionsBuilder_core() {
		return lazyStringValueOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyStringValueOptionsBuilder_core_DisplayHint_java_lang_String_() {
		return (EAttribute) lazyStringValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyStringValueOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) lazyStringValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyStringValueOptionsBuilder_core_VarName() {
		return (EAttribute) lazyStringValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyStringValueOptionsBuilder_core_Identifier() {
		return (EAttribute) lazyStringValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyStringValueOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) lazyStringValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppPropsBuilder_core() {
		return appPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_AutoSynth_java_lang_Boolean_() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_Context_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_Outdir_java_lang_String_() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_RuntimeInfo_java_lang_Boolean_() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_StackTraces_java_lang_Boolean_() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_TreeMetadata_java_lang_Boolean_() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_VarName() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_Identifier() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppPropsBuilder_core_AdditionalCode() {
		return (EAttribute) appPropsBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultStackSynthesizerPropsBuilder_core() {
		return defaultStackSynthesizerPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingExternalId_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_CloudFormationExecutionRole_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_FileAssetsBucketName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_ImageAssetsRepositoryName_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_Qualifier_java_lang_String_() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_VarName() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_Identifier() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultStackSynthesizerPropsBuilder_core_AdditionalCode() {
		return (EAttribute) defaultStackSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagManagerOptionsBuilder_core() {
		return tagManagerOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerOptionsBuilder_core_TagPropertyName_java_lang_String_() {
		return (EAttribute) tagManagerOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) tagManagerOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerOptionsBuilder_core_VarName() {
		return (EAttribute) tagManagerOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerOptionsBuilder_core_Identifier() {
		return (EAttribute) tagManagerOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) tagManagerOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecretsManagerSecretOptionsBuilder_core() {
		return secretsManagerSecretOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_JsonField_java_lang_String_() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_VersionId_java_lang_String_() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_VersionStage_java_lang_String_() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_VarName() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_Identifier() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecretsManagerSecretOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) secretsManagerSecretOptionsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstraplessSynthesizerPropsBuilder_core() {
		return bootstraplessSynthesizerPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_VarName() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_Identifier() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstraplessSynthesizerPropsBuilder_core_AdditionalCode() {
		return (EAttribute) bootstraplessSynthesizerPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetContextValueResultBuilder_core() {
		return getContextValueResultBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueResultBuilder_core_Value_java_lang_Object_() {
		return (EAttribute) getContextValueResultBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueResultBuilder_core_GeneratedClassName() {
		return (EAttribute) getContextValueResultBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueResultBuilder_core_VarName() {
		return (EAttribute) getContextValueResultBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueResultBuilder_core_Identifier() {
		return (EAttribute) getContextValueResultBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextValueResultBuilder_core_AdditionalCode() {
		return (EAttribute) getContextValueResultBuilder_coreEClass.getEStructuralFeatures().get(4);
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
	public EClass getTagManagerBuilder_core() {
		return tagManagerBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerBuilder_core_TagPropertyName_java_lang_String_() {
		return (EAttribute) tagManagerBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerBuilder_core_GeneratedClassName() {
		return (EAttribute) tagManagerBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerBuilder_core_VarName() {
		return (EAttribute) tagManagerBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerBuilder_core_Identifier() {
		return (EAttribute) tagManagerBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagManagerBuilder_core_AdditionalCode() {
		return (EAttribute) tagManagerBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLazyAnyValueOptionsBuilder_core() {
		return lazyAnyValueOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_DisplayHint_java_lang_String_() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_OmitEmptyArray_java_lang_Boolean_() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_VarName() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_Identifier() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLazyAnyValueOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) lazyAnyValueOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerImageAssetSourceBuilder_core() {
		return dockerImageAssetSourceBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_DirectoryName_java_lang_String_() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_SourceHash_java_lang_String_() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_DockerBuildArgs_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_DockerBuildTarget_java_lang_String_() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_DockerFile_java_lang_String_() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_RepositoryName_java_lang_String_() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_GeneratedClassName() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_VarName() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_Identifier() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerImageAssetSourceBuilder_core_AdditionalCode() {
		return (EAttribute) dockerImageAssetSourceBuilder_coreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedStackPropsBuilder_core() {
		return nestedStackPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_NotificationArns_java_lang_String_AsList() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_VarName() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_Identifier() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNestedStackPropsBuilder_core_AdditionalCode() {
		return (EAttribute) nestedStackPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetContextKeyResultBuilder_core() {
		return getContextKeyResultBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_Key_java_lang_String_() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_Props_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_GeneratedClassName() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_VarName() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_Identifier() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetContextKeyResultBuilder_core_AdditionalCode() {
		return (EAttribute) getContextKeyResultBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetStagingPropsBuilder_core() {
		return assetStagingPropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_SourcePath_java_lang_String_() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_ExtraHash_java_lang_String_() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_Exclude_java_lang_String_AsList() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_GeneratedClassName() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_VarName() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_Identifier() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetStagingPropsBuilder_core_AdditionalCode() {
		return (EAttribute) assetStagingPropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyBuilder_core() {
		return dependencyBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_SourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_TargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_GeneratedClassName() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_VarName() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_Identifier() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyBuilder_core_AdditionalCode() {
		return (EAttribute) dependencyBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCopyOptionsBuilder_core() {
		return copyOptionsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_Exclude_java_lang_String_AsList() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_GeneratedClassName() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_VarName() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_Identifier() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyOptionsBuilder_core_AdditionalCode() {
		return (EAttribute) copyOptionsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomResourcePropsBuilder_core() {
		return customResourcePropsBuilder_coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_ServiceToken_java_lang_String_() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_PascalCaseProperties_java_lang_Boolean_() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_ResourceType_java_lang_String_() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_GeneratedClassName() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_VarName() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_Identifier() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomResourcePropsBuilder_core_AdditionalCode() {
		return (EAttribute) customResourcePropsBuilder_coreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFileAssetPackaging() {
		return fileAssetPackagingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCfnDynamicReferenceService() {
		return cfnDynamicReferenceServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTagType() {
		return tagTypeEEnum;
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
	public EEnum getSizeRoundingBehavior() {
		return sizeRoundingBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCfnCapabilities() {
		return cfnCapabilitiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConstructOrder() {
		return constructOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCustomResourceProviderRuntime() {
		return customResourceProviderRuntimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCfnDeletionPolicy() {
		return cfnDeletionPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSymlinkFollowMode() {
		return symlinkFollowModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory) getEFactoryInstance();
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
		environmentBuilder_coreEClass = createEClass(ENVIRONMENT_BUILDER_CORE);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__VAR_NAME);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__IDENTIFIER);
		createEAttribute(environmentBuilder_coreEClass, ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE);

		resolveOptionsBuilder_coreEClass = createEClass(RESOLVE_OPTIONS_BUILDER_CORE);
		createEAttribute(resolveOptionsBuilder_coreEClass,
				RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE);
		createEAttribute(resolveOptionsBuilder_coreEClass,
				RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(resolveOptionsBuilder_coreEClass, RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_);
		createEAttribute(resolveOptionsBuilder_coreEClass, RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(resolveOptionsBuilder_coreEClass, RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(resolveOptionsBuilder_coreEClass, RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(resolveOptionsBuilder_coreEClass, RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		assetStagingBuilder_coreEClass = createEClass(ASSET_STAGING_BUILDER_CORE);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(assetStagingBuilder_coreEClass,
				ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__VAR_NAME);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__IDENTIFIER);
		createEAttribute(assetStagingBuilder_coreEClass, ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE);

		nestedStackBuilder_coreEClass = createEClass(NESTED_STACK_BUILDER_CORE);
		createEAttribute(nestedStackBuilder_coreEClass,
				NESTED_STACK_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(nestedStackBuilder_coreEClass,
				NESTED_STACK_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(nestedStackBuilder_coreEClass,
				NESTED_STACK_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(nestedStackBuilder_coreEClass, NESTED_STACK_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(nestedStackBuilder_coreEClass, NESTED_STACK_BUILDER_CORE__VAR_NAME);
		createEAttribute(nestedStackBuilder_coreEClass, NESTED_STACK_BUILDER_CORE__IDENTIFIER);
		createEAttribute(nestedStackBuilder_coreEClass, NESTED_STACK_BUILDER_CORE__ADDITIONAL_CODE);

		stackPropsBuilder_coreEClass = createEClass(STACK_PROPS_BUILDER_CORE);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_);
		createEAttribute(stackPropsBuilder_coreEClass,
				STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_);
		createEAttribute(stackPropsBuilder_coreEClass,
				STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE);
		createEAttribute(stackPropsBuilder_coreEClass,
				STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(stackPropsBuilder_coreEClass,
				STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(stackPropsBuilder_coreEClass, STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		timeConversionOptionsBuilder_coreEClass = createEClass(TIME_CONVERSION_OPTIONS_BUILDER_CORE);
		createEAttribute(timeConversionOptionsBuilder_coreEClass,
				TIME_CONVERSION_OPTIONS_BUILDER_CORE__INTEGRAL_JAVA_LANG_BOOLEAN_);
		createEAttribute(timeConversionOptionsBuilder_coreEClass,
				TIME_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(timeConversionOptionsBuilder_coreEClass, TIME_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(timeConversionOptionsBuilder_coreEClass, TIME_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(timeConversionOptionsBuilder_coreEClass,
				TIME_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		removeTagBuilder_coreEClass = createEClass(REMOVE_TAG_BUILDER_CORE);
		createEAttribute(removeTagBuilder_coreEClass,
				REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_);
		createEAttribute(removeTagBuilder_coreEClass,
				REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(removeTagBuilder_coreEClass,
				REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(removeTagBuilder_coreEClass, REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_);
		createEAttribute(removeTagBuilder_coreEClass, REMOVE_TAG_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(removeTagBuilder_coreEClass, REMOVE_TAG_BUILDER_CORE__VAR_NAME);
		createEAttribute(removeTagBuilder_coreEClass, REMOVE_TAG_BUILDER_CORE__IDENTIFIER);
		createEAttribute(removeTagBuilder_coreEClass, REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE);

		tagPropsBuilder_coreEClass = createEClass(TAG_PROPS_BUILDER_CORE);
		createEAttribute(tagPropsBuilder_coreEClass,
				TAG_PROPS_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_);
		createEAttribute(tagPropsBuilder_coreEClass,
				TAG_PROPS_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tagPropsBuilder_coreEClass,
				TAG_PROPS_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tagPropsBuilder_coreEClass, TAG_PROPS_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_);
		createEAttribute(tagPropsBuilder_coreEClass, TAG_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(tagPropsBuilder_coreEClass, TAG_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(tagPropsBuilder_coreEClass, TAG_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(tagPropsBuilder_coreEClass, TAG_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		removalPolicyOptionsBuilder_coreEClass = createEClass(REMOVAL_POLICY_OPTIONS_BUILDER_CORE);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass,
				REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass,
				REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass,
				REMOVAL_POLICY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass, REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass, REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(removalPolicyOptionsBuilder_coreEClass, REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

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

		fileAssetLocationBuilder_coreEClass = createEClass(FILE_ASSET_LOCATION_BUILDER_CORE);
		createEAttribute(fileAssetLocationBuilder_coreEClass,
				FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_);
		createEAttribute(fileAssetLocationBuilder_coreEClass,
				FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_);
		createEAttribute(fileAssetLocationBuilder_coreEClass,
				FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_);
		createEAttribute(fileAssetLocationBuilder_coreEClass,
				FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_);
		createEAttribute(fileAssetLocationBuilder_coreEClass,
				FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_);
		createEAttribute(fileAssetLocationBuilder_coreEClass, FILE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(fileAssetLocationBuilder_coreEClass, FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME);
		createEAttribute(fileAssetLocationBuilder_coreEClass, FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER);
		createEAttribute(fileAssetLocationBuilder_coreEClass, FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE);

		fingerprintOptionsBuilder_coreEClass = createEClass(FINGERPRINT_OPTIONS_BUILDER_CORE);
		createEAttribute(fingerprintOptionsBuilder_coreEClass,
				FINGERPRINT_OPTIONS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_);
		createEAttribute(fingerprintOptionsBuilder_coreEClass,
				FINGERPRINT_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(fingerprintOptionsBuilder_coreEClass,
				FINGERPRINT_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_);
		createEAttribute(fingerprintOptionsBuilder_coreEClass, FINGERPRINT_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(fingerprintOptionsBuilder_coreEClass, FINGERPRINT_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(fingerprintOptionsBuilder_coreEClass, FINGERPRINT_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(fingerprintOptionsBuilder_coreEClass, FINGERPRINT_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		lazyListValueOptionsBuilder_coreEClass = createEClass(LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass,
				LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass,
				LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass,
				LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass, LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass, LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(lazyListValueOptionsBuilder_coreEClass, LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		customResourceBuilder_coreEClass = createEClass(CUSTOM_RESOURCE_BUILDER_CORE);
		createEAttribute(customResourceBuilder_coreEClass,
				CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_);
		createEAttribute(customResourceBuilder_coreEClass,
				CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_);
		createEAttribute(customResourceBuilder_coreEClass,
				CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(customResourceBuilder_coreEClass,
				CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(customResourceBuilder_coreEClass,
				CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_);
		createEAttribute(customResourceBuilder_coreEClass, CUSTOM_RESOURCE_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(customResourceBuilder_coreEClass, CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME);
		createEAttribute(customResourceBuilder_coreEClass, CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER);
		createEAttribute(customResourceBuilder_coreEClass, CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE);

		getContextKeyOptionsBuilder_coreEClass = createEClass(GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass,
				GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass,
				GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass,
				GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass, GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass, GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(getContextKeyOptionsBuilder_coreEClass, GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		validationErrorBuilder_coreEClass = createEClass(VALIDATION_ERROR_BUILDER_CORE);
		createEAttribute(validationErrorBuilder_coreEClass, VALIDATION_ERROR_BUILDER_CORE__MESSAGE_JAVA_LANG_STRING_);
		createEAttribute(validationErrorBuilder_coreEClass,
				VALIDATION_ERROR_BUILDER_CORE__SOURCE_WITH_CONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_CONSTRUCT_AS_REFERENCE);
		createEAttribute(validationErrorBuilder_coreEClass, VALIDATION_ERROR_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(validationErrorBuilder_coreEClass, VALIDATION_ERROR_BUILDER_CORE__VAR_NAME);
		createEAttribute(validationErrorBuilder_coreEClass, VALIDATION_ERROR_BUILDER_CORE__IDENTIFIER);
		createEAttribute(validationErrorBuilder_coreEClass, VALIDATION_ERROR_BUILDER_CORE__ADDITIONAL_CODE);

		synthesisOptionsBuilder_coreEClass = createEClass(SYNTHESIS_OPTIONS_BUILDER_CORE);
		createEAttribute(synthesisOptionsBuilder_coreEClass, SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_);
		createEAttribute(synthesisOptionsBuilder_coreEClass,
				SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_);
		createEAttribute(synthesisOptionsBuilder_coreEClass,
				SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE);
		createEAttribute(synthesisOptionsBuilder_coreEClass, SYNTHESIS_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(synthesisOptionsBuilder_coreEClass, SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(synthesisOptionsBuilder_coreEClass, SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(synthesisOptionsBuilder_coreEClass, SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		dockerImageAssetLocationBuilder_coreEClass = createEClass(DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER);
		createEAttribute(dockerImageAssetLocationBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE);

		fileAssetSourceBuilder_coreEClass = createEClass(FILE_ASSET_SOURCE_BUILDER_CORE);
		createEAttribute(fileAssetSourceBuilder_coreEClass,
				FILE_ASSET_SOURCE_BUILDER_CORE__FILE_NAME_JAVA_LANG_STRING_);
		createEAttribute(fileAssetSourceBuilder_coreEClass,
				FILE_ASSET_SOURCE_BUILDER_CORE__PACKAGING_SOFTWARE_AMAZON_AWSCDK_CORE_FILE_ASSET_PACKAGING_);
		createEAttribute(fileAssetSourceBuilder_coreEClass,
				FILE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_);
		createEAttribute(fileAssetSourceBuilder_coreEClass, FILE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(fileAssetSourceBuilder_coreEClass, FILE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME);
		createEAttribute(fileAssetSourceBuilder_coreEClass, FILE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER);
		createEAttribute(fileAssetSourceBuilder_coreEClass, FILE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE);

		getContextValueOptionsBuilder_coreEClass = createEClass(GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE);
		createEAttribute(getContextValueOptionsBuilder_coreEClass,
				GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_);
		createEAttribute(getContextValueOptionsBuilder_coreEClass,
				GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_);
		createEAttribute(getContextValueOptionsBuilder_coreEClass,
				GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(getContextValueOptionsBuilder_coreEClass,
				GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(getContextValueOptionsBuilder_coreEClass, GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(getContextValueOptionsBuilder_coreEClass, GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(getContextValueOptionsBuilder_coreEClass,
				GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		bootstraplessSynthesizerBuilder_coreEClass = createEClass(BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass, BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__VAR_NAME);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__IDENTIFIER);
		createEAttribute(bootstraplessSynthesizerBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE);

		arnComponentsBuilder_coreEClass = createEClass(ARN_COMPONENTS_BUILDER_CORE);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__VAR_NAME);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(arnComponentsBuilder_coreEClass, ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE);

		tagBuilder_coreEClass = createEClass(TAG_BUILDER_CORE);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__VAR_NAME);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__IDENTIFIER);
		createEAttribute(tagBuilder_coreEClass, TAG_BUILDER_CORE__ADDITIONAL_CODE);

		resourcePropsBuilder_coreEClass = createEClass(RESOURCE_PROPS_BUILDER_CORE);
		createEAttribute(resourcePropsBuilder_coreEClass, RESOURCE_PROPS_BUILDER_CORE__PHYSICAL_NAME_JAVA_LANG_STRING_);
		createEAttribute(resourcePropsBuilder_coreEClass, RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(resourcePropsBuilder_coreEClass, RESOURCE_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(resourcePropsBuilder_coreEClass, RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(resourcePropsBuilder_coreEClass, RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		sizeConversionOptionsBuilder_coreEClass = createEClass(SIZE_CONVERSION_OPTIONS_BUILDER_CORE);
		createEAttribute(sizeConversionOptionsBuilder_coreEClass,
				SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_);
		createEAttribute(sizeConversionOptionsBuilder_coreEClass,
				SIZE_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(sizeConversionOptionsBuilder_coreEClass, SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(sizeConversionOptionsBuilder_coreEClass, SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(sizeConversionOptionsBuilder_coreEClass,
				SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		encodingOptionsBuilder_coreEClass = createEClass(ENCODING_OPTIONS_BUILDER_CORE);
		createEAttribute(encodingOptionsBuilder_coreEClass,
				ENCODING_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_);
		createEAttribute(encodingOptionsBuilder_coreEClass, ENCODING_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(encodingOptionsBuilder_coreEClass, ENCODING_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(encodingOptionsBuilder_coreEClass, ENCODING_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(encodingOptionsBuilder_coreEClass, ENCODING_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		fromCloudFormationOptionsBuilder_coreEClass = createEClass(FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE);
		createEAttribute(fromCloudFormationOptionsBuilder_coreEClass,
				FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__FINDER_WITH_ICFN_FINDER_SOFTWARE_AMAZON_AWSCDK_CORE_ICFN_FINDER_AS_REFERENCE);
		createEAttribute(fromCloudFormationOptionsBuilder_coreEClass,
				FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(fromCloudFormationOptionsBuilder_coreEClass,
				FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(fromCloudFormationOptionsBuilder_coreEClass,
				FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(fromCloudFormationOptionsBuilder_coreEClass,
				FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

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

		customResourceProviderPropsBuilder_coreEClass = createEClass(CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(customResourceProviderPropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		lazyStringValueOptionsBuilder_coreEClass = createEClass(LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE);
		createEAttribute(lazyStringValueOptionsBuilder_coreEClass,
				LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_);
		createEAttribute(lazyStringValueOptionsBuilder_coreEClass,
				LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(lazyStringValueOptionsBuilder_coreEClass, LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(lazyStringValueOptionsBuilder_coreEClass, LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(lazyStringValueOptionsBuilder_coreEClass,
				LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		appPropsBuilder_coreEClass = createEClass(APP_PROPS_BUILDER_CORE);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_);
		createEAttribute(appPropsBuilder_coreEClass,
				APP_PROPS_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(appPropsBuilder_coreEClass, APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		defaultStackSynthesizerPropsBuilder_coreEClass = createEClass(DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(defaultStackSynthesizerPropsBuilder_coreEClass,
				DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		tagManagerOptionsBuilder_coreEClass = createEClass(TAG_MANAGER_OPTIONS_BUILDER_CORE);
		createEAttribute(tagManagerOptionsBuilder_coreEClass,
				TAG_MANAGER_OPTIONS_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_);
		createEAttribute(tagManagerOptionsBuilder_coreEClass, TAG_MANAGER_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(tagManagerOptionsBuilder_coreEClass, TAG_MANAGER_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(tagManagerOptionsBuilder_coreEClass, TAG_MANAGER_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(tagManagerOptionsBuilder_coreEClass, TAG_MANAGER_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		secretsManagerSecretOptionsBuilder_coreEClass = createEClass(SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(secretsManagerSecretOptionsBuilder_coreEClass,
				SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		bootstraplessSynthesizerPropsBuilder_coreEClass = createEClass(BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(bootstraplessSynthesizerPropsBuilder_coreEClass,
				BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		getContextValueResultBuilder_coreEClass = createEClass(GET_CONTEXT_VALUE_RESULT_BUILDER_CORE);
		createEAttribute(getContextValueResultBuilder_coreEClass,
				GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VALUE_JAVA_LANG_OBJECT_);
		createEAttribute(getContextValueResultBuilder_coreEClass,
				GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(getContextValueResultBuilder_coreEClass, GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VAR_NAME);
		createEAttribute(getContextValueResultBuilder_coreEClass, GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__IDENTIFIER);
		createEAttribute(getContextValueResultBuilder_coreEClass,
				GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__ADDITIONAL_CODE);

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

		tagManagerBuilder_coreEClass = createEClass(TAG_MANAGER_BUILDER_CORE);
		createEAttribute(tagManagerBuilder_coreEClass, TAG_MANAGER_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_);
		createEAttribute(tagManagerBuilder_coreEClass, TAG_MANAGER_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(tagManagerBuilder_coreEClass, TAG_MANAGER_BUILDER_CORE__VAR_NAME);
		createEAttribute(tagManagerBuilder_coreEClass, TAG_MANAGER_BUILDER_CORE__IDENTIFIER);
		createEAttribute(tagManagerBuilder_coreEClass, TAG_MANAGER_BUILDER_CORE__ADDITIONAL_CODE);

		lazyAnyValueOptionsBuilder_coreEClass = createEClass(LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass,
				LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass,
				LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_ARRAY_JAVA_LANG_BOOLEAN_);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass,
				LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass, LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass, LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(lazyAnyValueOptionsBuilder_coreEClass, LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		dockerImageAssetSourceBuilder_coreEClass = createEClass(DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass, DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass, DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER);
		createEAttribute(dockerImageAssetSourceBuilder_coreEClass,
				DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE);

		nestedStackPropsBuilder_coreEClass = createEClass(NESTED_STACK_PROPS_BUILDER_CORE);
		createEAttribute(nestedStackPropsBuilder_coreEClass,
				NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(nestedStackPropsBuilder_coreEClass,
				NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP);
		createEAttribute(nestedStackPropsBuilder_coreEClass,
				NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE);
		createEAttribute(nestedStackPropsBuilder_coreEClass, NESTED_STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(nestedStackPropsBuilder_coreEClass, NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(nestedStackPropsBuilder_coreEClass, NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(nestedStackPropsBuilder_coreEClass, NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		getContextKeyResultBuilder_coreEClass = createEClass(GET_CONTEXT_KEY_RESULT_BUILDER_CORE);
		createEAttribute(getContextKeyResultBuilder_coreEClass,
				GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_);
		createEAttribute(getContextKeyResultBuilder_coreEClass,
				GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(getContextKeyResultBuilder_coreEClass,
				GET_CONTEXT_KEY_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(getContextKeyResultBuilder_coreEClass, GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME);
		createEAttribute(getContextKeyResultBuilder_coreEClass, GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER);
		createEAttribute(getContextKeyResultBuilder_coreEClass, GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE);

		assetStagingPropsBuilder_coreEClass = createEClass(ASSET_STAGING_PROPS_BUILDER_CORE);
		createEAttribute(assetStagingPropsBuilder_coreEClass,
				ASSET_STAGING_PROPS_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_);
		createEAttribute(assetStagingPropsBuilder_coreEClass,
				ASSET_STAGING_PROPS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_);
		createEAttribute(assetStagingPropsBuilder_coreEClass,
				ASSET_STAGING_PROPS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(assetStagingPropsBuilder_coreEClass,
				ASSET_STAGING_PROPS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_);
		createEAttribute(assetStagingPropsBuilder_coreEClass, ASSET_STAGING_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(assetStagingPropsBuilder_coreEClass, ASSET_STAGING_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(assetStagingPropsBuilder_coreEClass, ASSET_STAGING_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(assetStagingPropsBuilder_coreEClass, ASSET_STAGING_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		dependencyBuilder_coreEClass = createEClass(DEPENDENCY_BUILDER_CORE);
		createEAttribute(dependencyBuilder_coreEClass,
				DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(dependencyBuilder_coreEClass,
				DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE);
		createEAttribute(dependencyBuilder_coreEClass, DEPENDENCY_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(dependencyBuilder_coreEClass, DEPENDENCY_BUILDER_CORE__VAR_NAME);
		createEAttribute(dependencyBuilder_coreEClass, DEPENDENCY_BUILDER_CORE__IDENTIFIER);
		createEAttribute(dependencyBuilder_coreEClass, DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE);

		copyOptionsBuilder_coreEClass = createEClass(COPY_OPTIONS_BUILDER_CORE);
		createEAttribute(copyOptionsBuilder_coreEClass, COPY_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST);
		createEAttribute(copyOptionsBuilder_coreEClass,
				COPY_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_);
		createEAttribute(copyOptionsBuilder_coreEClass, COPY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(copyOptionsBuilder_coreEClass, COPY_OPTIONS_BUILDER_CORE__VAR_NAME);
		createEAttribute(copyOptionsBuilder_coreEClass, COPY_OPTIONS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(copyOptionsBuilder_coreEClass, COPY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE);

		customResourcePropsBuilder_coreEClass = createEClass(CUSTOM_RESOURCE_PROPS_BUILDER_CORE);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_);
		createEAttribute(customResourcePropsBuilder_coreEClass,
				CUSTOM_RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME);
		createEAttribute(customResourcePropsBuilder_coreEClass, CUSTOM_RESOURCE_PROPS_BUILDER_CORE__VAR_NAME);
		createEAttribute(customResourcePropsBuilder_coreEClass, CUSTOM_RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER);
		createEAttribute(customResourcePropsBuilder_coreEClass, CUSTOM_RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE);

		// Create enums
		fileAssetPackagingEEnum = createEEnum(FILE_ASSET_PACKAGING);
		cfnDynamicReferenceServiceEEnum = createEEnum(CFN_DYNAMIC_REFERENCE_SERVICE);
		tagTypeEEnum = createEEnum(TAG_TYPE);
		removalPolicyEEnum = createEEnum(REMOVAL_POLICY);
		sizeRoundingBehaviorEEnum = createEEnum(SIZE_ROUNDING_BEHAVIOR);
		cfnCapabilitiesEEnum = createEEnum(CFN_CAPABILITIES);
		constructOrderEEnum = createEEnum(CONSTRUCT_ORDER);
		customResourceProviderRuntimeEEnum = createEEnum(CUSTOM_RESOURCE_PROVIDER_RUNTIME);
		cfnDeletionPolicyEEnum = createEEnum(CFN_DELETION_POLICY);
		symlinkFollowModeEEnum = createEEnum(SYMLINK_FOLLOW_MODE);
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

		initEClass(resolveOptionsBuilder_coreEClass, ResolveOptionsBuilder_core.class, "ResolveOptionsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getResolveOptionsBuilder_core_ResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference(),
				ecorePackage.getEString(),
				"resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference", null, 0, 1,
				ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getResolveOptionsBuilder_core_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveOptionsBuilder_core_Preparing_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"preparing_java_lang_Boolean_", null, 0, 1, ResolveOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.ResolveOptions", 0, 1,
				ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ResolveOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetStagingBuilder_coreEClass, AssetStagingBuilder_core.class, "AssetStagingBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetStagingBuilder_core_Exclude_java_lang_String_AsList(), ecorePackage.getEString(),
				"exclude_java_lang_String_AsList", null, 0, 1, AssetStagingBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_(),
				this.getSymlinkFollowMode(), "follow_software_amazon_awscdk_core_SymlinkFollowMode_", null, 0, 1,
				AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_ExtraHash_java_lang_String_(), ecorePackage.getEString(),
				"extraHash_java_lang_String_", null, 0, 1, AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_SourcePath_java_lang_String_(), ecorePackage.getEString(),
				"sourcePath_java_lang_String_", null, 0, 1, AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.AssetStaging", 0, 1, AssetStagingBuilder_core.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, AssetStagingBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedStackBuilder_coreEClass, NestedStackBuilder_core.class, "NestedStackBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedStackBuilder_core_NotificationArns_java_lang_String_AsList(), ecorePackage.getEString(),
				"notificationArns_java_lang_String_AsList", null, 0, 1, NestedStackBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				NestedStackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNestedStackBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null,
				0, 1, NestedStackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.NestedStack", 0, 1, NestedStackBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NestedStackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				NestedStackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, NestedStackBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackPropsBuilder_coreEClass, StackPropsBuilder_core.class, "StackPropsBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackPropsBuilder_core_Description_java_lang_String_(), ecorePackage.getEString(),
				"description_java_lang_String_", null, 0, 1, StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStackPropsBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(),
				ecorePackage.getEString(), "envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference",
				null, 0, 1, StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_StackName_java_lang_String_(), ecorePackage.getEString(),
				"stackName_java_lang_String_", null, 0, 1, StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getStackPropsBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(),
				ecorePackage.getEString(),
				"synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference", null, 0,
				1, StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_Tags_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "tags_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_TerminationProtection_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "terminationProtection_java_lang_Boolean_", null, 0, 1,
				StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.StackProps", 0, 1, StackPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, StackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeConversionOptionsBuilder_coreEClass, TimeConversionOptionsBuilder_core.class,
				"TimeConversionOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConversionOptionsBuilder_core_Integral_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "integral_java_lang_Boolean_", null, 0, 1,
				TimeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConversionOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.TimeConversionOptions", 0, 1,
				TimeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConversionOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TimeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConversionOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, TimeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeConversionOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, TimeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeTagBuilder_coreEClass, RemoveTagBuilder_core.class, "RemoveTagBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "applyToLaunchedInstances_java_lang_Boolean_", null, 0, 1,
				RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "excludeResourceTypes_java_lang_String_AsList", null, 0, 1,
				RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "includeResourceTypes_java_lang_String_AsList", null, 0, 1,
				RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_Priority_java_lang_Number_(), ecorePackage.getEInt(),
				"priority_java_lang_Number_", null, 0, 1, RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.RemoveTag", 0, 1, RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTagBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, RemoveTagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagPropsBuilder_coreEClass, TagPropsBuilder_core.class, "TagPropsBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagPropsBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "applyToLaunchedInstances_java_lang_Boolean_", null, 0, 1,
				TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_ExcludeResourceTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "excludeResourceTypes_java_lang_String_AsList", null, 0, 1,
				TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_IncludeResourceTypes_java_lang_String_AsList(),
				ecorePackage.getEString(), "includeResourceTypes_java_lang_String_AsList", null, 0, 1,
				TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_Priority_java_lang_Number_(), ecorePackage.getEInt(),
				"priority_java_lang_Number_", null, 0, 1, TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.TagProps", 0, 1, TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, TagPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removalPolicyOptionsBuilder_coreEClass, RemovalPolicyOptionsBuilder_core.class,
				"RemovalPolicyOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_ApplyToUpdateReplacePolicy_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "applyToUpdateReplacePolicy_java_lang_Boolean_", null, 0, 1,
				RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_DefaultValue_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "defaultValue_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.RemovalPolicyOptions", 0, 1,
				RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalPolicyOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, RemovalPolicyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(fileAssetLocationBuilder_coreEClass, FileAssetLocationBuilder_core.class,
				"FileAssetLocationBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileAssetLocationBuilder_core_BucketName_java_lang_String_(), ecorePackage.getEString(),
				"bucketName_java_lang_String_", null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_HttpUrl_java_lang_String_(), ecorePackage.getEString(),
				"httpUrl_java_lang_String_", null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_ObjectKey_java_lang_String_(), ecorePackage.getEString(),
				"objectKey_java_lang_String_", null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_S3ObjectUrl_java_lang_String_(), ecorePackage.getEString(),
				"s3ObjectUrl_java_lang_String_", null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_S3Url_java_lang_String_(), ecorePackage.getEString(),
				"s3Url_java_lang_String_", null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.FileAssetLocation", 0, 1,
				FileAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FileAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetLocationBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, FileAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fingerprintOptionsBuilder_coreEClass, FingerprintOptionsBuilder_core.class,
				"FingerprintOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFingerprintOptionsBuilder_core_ExtraHash_java_lang_String_(), ecorePackage.getEString(),
				"extraHash_java_lang_String_", null, 0, 1, FingerprintOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_Exclude_java_lang_String_AsList(), ecorePackage.getEString(),
				"exclude_java_lang_String_AsList", null, 0, 1, FingerprintOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_(),
				this.getSymlinkFollowMode(), "follow_software_amazon_awscdk_core_SymlinkFollowMode_", null, 0, 1,
				FingerprintOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.FingerprintOptions", 0, 1,
				FingerprintOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FingerprintOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, FingerprintOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFingerprintOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, FingerprintOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyListValueOptionsBuilder_coreEClass, LazyListValueOptionsBuilder_core.class,
				"LazyListValueOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLazyListValueOptionsBuilder_core_DisplayHint_java_lang_String_(), ecorePackage.getEString(),
				"displayHint_java_lang_String_", null, 0, 1, LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyListValueOptionsBuilder_core_OmitEmpty_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "omitEmpty_java_lang_Boolean_", null, 0, 1,
				LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyListValueOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.LazyListValueOptions", 0, 1,
				LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyListValueOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyListValueOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyListValueOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LazyListValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customResourceBuilder_coreEClass, CustomResourceBuilder_core.class, "CustomResourceBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomResourceBuilder_core_ServiceToken_java_lang_String_(), ecorePackage.getEString(),
				"serviceToken_java_lang_String_", null, 0, 1, CustomResourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_PascalCaseProperties_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pascalCaseProperties_java_lang_Boolean_", null, 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "properties_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_ResourceType_java_lang_String_(), ecorePackage.getEString(),
				"resourceType_java_lang_String_", null, 0, 1, CustomResourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.CustomResource", 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, CustomResourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContextKeyOptionsBuilder_coreEClass, GetContextKeyOptionsBuilder_core.class,
				"GetContextKeyOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetContextKeyOptionsBuilder_core_Provider_java_lang_String_(), ecorePackage.getEString(),
				"provider_java_lang_String_", null, 0, 1, GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "props_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.GetContextKeyOptions", 0, 1,
				GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GetContextKeyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationErrorBuilder_coreEClass, ValidationErrorBuilder_core.class, "ValidationErrorBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationErrorBuilder_core_Message_java_lang_String_(), ecorePackage.getEString(),
				"message_java_lang_String_", null, 0, 1, ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getValidationErrorBuilder_core_SourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference(),
				ecorePackage.getEString(), "sourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference",
				null, 0, 1, ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationErrorBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.ValidationError", 0, 1,
				ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationErrorBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationErrorBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationErrorBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, ValidationErrorBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synthesisOptionsBuilder_coreEClass, SynthesisOptionsBuilder_core.class,
				"SynthesisOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynthesisOptionsBuilder_core_Outdir_java_lang_String_(), ecorePackage.getEString(),
				"outdir_java_lang_String_", null, 0, 1, SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesisOptionsBuilder_core_SkipValidation_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "skipValidation_java_lang_Boolean_", null, 0, 1,
				SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getSynthesisOptionsBuilder_core_RuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference(),
				ecorePackage.getEString(),
				"runtimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference", null, 0, 1,
				SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesisOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.SynthesisOptions", 0, 1,
				SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesisOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesisOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesisOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, SynthesisOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerImageAssetLocationBuilder_coreEClass, DockerImageAssetLocationBuilder_core.class,
				"DockerImageAssetLocationBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerImageAssetLocationBuilder_core_ImageUri_java_lang_String_(), ecorePackage.getEString(),
				"imageUri_java_lang_String_", null, 0, 1, DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetLocationBuilder_core_RepositoryName_java_lang_String_(),
				ecorePackage.getEString(), "repositoryName_java_lang_String_", null, 0, 1,
				DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetLocationBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.DockerImageAssetLocation", 0, 1,
				DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetLocationBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetLocationBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetLocationBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DockerImageAssetLocationBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileAssetSourceBuilder_coreEClass, FileAssetSourceBuilder_core.class, "FileAssetSourceBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileAssetSourceBuilder_core_FileName_java_lang_String_(), ecorePackage.getEString(),
				"fileName_java_lang_String_", null, 0, 1, FileAssetSourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_Packaging_software_amazon_awscdk_core_FileAssetPackaging_(),
				this.getFileAssetPackaging(), "packaging_software_amazon_awscdk_core_FileAssetPackaging_", null, 0, 1,
				FileAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_SourceHash_java_lang_String_(), ecorePackage.getEString(),
				"sourceHash_java_lang_String_", null, 0, 1, FileAssetSourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.FileAssetSource", 0, 1,
				FileAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				FileAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				FileAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAssetSourceBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, FileAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContextValueOptionsBuilder_coreEClass, GetContextValueOptionsBuilder_core.class,
				"GetContextValueOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetContextValueOptionsBuilder_core_DummyValue_java_lang_Object_(),
				ecorePackage.getEJavaObject(), "dummyValue_java_lang_Object_", null, 0, 1,
				GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_Provider_java_lang_String_(), ecorePackage.getEString(),
				"provider_java_lang_String_", null, 0, 1, GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "props_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.GetContextValueOptions", 0, 1,
				GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GetContextValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstraplessSynthesizerBuilder_coreEClass, BootstraplessSynthesizerBuilder_core.class,
				"BootstraplessSynthesizerBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "cloudFormationExecutionRoleArn_java_lang_String_", null, 0, 1,
				BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_DeployRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "deployRoleArn_java_lang_String_", null, 0, 1,
				BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.BootstraplessSynthesizer", 0, 1,
				BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BootstraplessSynthesizerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arnComponentsBuilder_coreEClass, ArnComponentsBuilder_core.class, "ArnComponentsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArnComponentsBuilder_core_Resource_java_lang_String_(), ecorePackage.getEString(),
				"resource_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Service_java_lang_String_(), ecorePackage.getEString(),
				"service_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Account_java_lang_String_(), ecorePackage.getEString(),
				"account_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Partition_java_lang_String_(), ecorePackage.getEString(),
				"partition_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Region_java_lang_String_(), ecorePackage.getEString(),
				"region_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_ResourceName_java_lang_String_(), ecorePackage.getEString(),
				"resourceName_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Sep_java_lang_String_(), ecorePackage.getEString(),
				"sep_java_lang_String_", null, 0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.ArnComponents", 0, 1,
				ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArnComponentsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ArnComponentsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagBuilder_coreEClass, TagBuilder_core.class, "TagBuilder_core", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "applyToLaunchedInstances_java_lang_Boolean_", null, 0, 1,
				TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList(), ecorePackage.getEString(),
				"excludeResourceTypes_java_lang_String_AsList", null, 0, 1, TagBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList(), ecorePackage.getEString(),
				"includeResourceTypes_java_lang_String_AsList", null, 0, 1, TagBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_Priority_java_lang_Number_(), ecorePackage.getEInt(),
				"priority_java_lang_Number_", null, 0, 1, TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Tag", 0, 1, TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0, 1,
				TagBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropsBuilder_coreEClass, ResourcePropsBuilder_core.class, "ResourcePropsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcePropsBuilder_core_PhysicalName_java_lang_String_(), ecorePackage.getEString(),
				"physicalName_java_lang_String_", null, 0, 1, ResourcePropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.ResourceProps", 0, 1,
				ResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				ResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, ResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeConversionOptionsBuilder_coreEClass, SizeConversionOptionsBuilder_core.class,
				"SizeConversionOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getSizeConversionOptionsBuilder_core_Rounding_software_amazon_awscdk_core_SizeRoundingBehavior_(),
				this.getSizeRoundingBehavior(), "rounding_software_amazon_awscdk_core_SizeRoundingBehavior_", null, 0,
				1, SizeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeConversionOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.SizeConversionOptions", 0, 1,
				SizeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeConversionOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				SizeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeConversionOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, SizeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSizeConversionOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SizeConversionOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodingOptionsBuilder_coreEClass, EncodingOptionsBuilder_core.class, "EncodingOptionsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncodingOptionsBuilder_core_DisplayHint_java_lang_String_(), ecorePackage.getEString(),
				"displayHint_java_lang_String_", null, 0, 1, EncodingOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.EncodingOptions", 0, 1,
				EncodingOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				EncodingOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				EncodingOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncodingOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, EncodingOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromCloudFormationOptionsBuilder_coreEClass, FromCloudFormationOptionsBuilder_core.class,
				"FromCloudFormationOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getFromCloudFormationOptionsBuilder_core_FinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference(),
				ecorePackage.getEString(), "finderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference",
				null, 0, 1, FromCloudFormationOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromCloudFormationOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.FromCloudFormationOptions", 0, 1,
				FromCloudFormationOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromCloudFormationOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, FromCloudFormationOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromCloudFormationOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, FromCloudFormationOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromCloudFormationOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, FromCloudFormationOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(customResourceProviderPropsBuilder_coreEClass, CustomResourceProviderPropsBuilder_core.class,
				"CustomResourceProviderPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_CodeDirectory_java_lang_String_(),
				ecorePackage.getEString(), "codeDirectory_java_lang_String_", null, 0, 1,
				CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCustomResourceProviderPropsBuilder_core_Runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(),
				this.getCustomResourceProviderRuntime(),
				"runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_", null, 0, 1,
				CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCustomResourceProviderPropsBuilder_core_MemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference(),
				ecorePackage.getEString(), "memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference", null, 0,
				1, CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_PolicyStatements_java_lang_Object_AsList(),
				ecorePackage.getEString(), "policyStatements_java_lang_Object_AsList", null, 0, 1,
				CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getCustomResourceProviderPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null,
				0, 1, CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.CustomResourceProviderProps", 0, 1,
				CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourceProviderPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, CustomResourceProviderPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyStringValueOptionsBuilder_coreEClass, LazyStringValueOptionsBuilder_core.class,
				"LazyStringValueOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLazyStringValueOptionsBuilder_core_DisplayHint_java_lang_String_(), ecorePackage.getEString(),
				"displayHint_java_lang_String_", null, 0, 1, LazyStringValueOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyStringValueOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.LazyStringValueOptions", 0, 1,
				LazyStringValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyStringValueOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, LazyStringValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyStringValueOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, LazyStringValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyStringValueOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, LazyStringValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appPropsBuilder_coreEClass, AppPropsBuilder_core.class, "AppPropsBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppPropsBuilder_core_AutoSynth_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"autoSynth_java_lang_Boolean_", null, 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_Context_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "context_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_Outdir_java_lang_String_(), ecorePackage.getEString(),
				"outdir_java_lang_String_", null, 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_RuntimeInfo_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"runtimeInfo_java_lang_Boolean_", null, 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_StackTraces_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"stackTraces_java_lang_Boolean_", null, 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_TreeMetadata_java_lang_Boolean_(), ecorePackage.getEBooleanObject(),
				"treeMetadata_java_lang_Boolean_", null, 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.AppProps", 0, 1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, AppPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultStackSynthesizerPropsBuilder_coreEClass, DefaultStackSynthesizerPropsBuilder_core.class,
				"DefaultStackSynthesizerPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingExternalId_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingExternalId_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "assetPublishingRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_CloudFormationExecutionRole_java_lang_String_(),
				ecorePackage.getEString(), "cloudFormationExecutionRole_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "deployRoleArn_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_FileAssetsBucketName_java_lang_String_(),
				ecorePackage.getEString(), "fileAssetsBucketName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_ImageAssetsRepositoryName_java_lang_String_(),
				ecorePackage.getEString(), "imageAssetsRepositoryName_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_Qualifier_java_lang_String_(),
				ecorePackage.getEString(), "qualifier_java_lang_String_", null, 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.DefaultStackSynthesizerProps", 0, 1,
				DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultStackSynthesizerPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DefaultStackSynthesizerPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagManagerOptionsBuilder_coreEClass, TagManagerOptionsBuilder_core.class,
				"TagManagerOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagManagerOptionsBuilder_core_TagPropertyName_java_lang_String_(), ecorePackage.getEString(),
				"tagPropertyName_java_lang_String_", null, 0, 1, TagManagerOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.TagManagerOptions", 0, 1,
				TagManagerOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TagManagerOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, TagManagerOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, TagManagerOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretsManagerSecretOptionsBuilder_coreEClass, SecretsManagerSecretOptionsBuilder_core.class,
				"SecretsManagerSecretOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_JsonField_java_lang_String_(),
				ecorePackage.getEString(), "jsonField_java_lang_String_", null, 0, 1,
				SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_VersionId_java_lang_String_(),
				ecorePackage.getEString(), "versionId_java_lang_String_", null, 0, 1,
				SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_VersionStage_java_lang_String_(),
				ecorePackage.getEString(), "versionStage_java_lang_String_", null, 0, 1,
				SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.SecretsManagerSecretOptions", 0, 1,
				SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null,
				0, 1, SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsManagerSecretOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, SecretsManagerSecretOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstraplessSynthesizerPropsBuilder_coreEClass, BootstraplessSynthesizerPropsBuilder_core.class,
				"BootstraplessSynthesizerPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "cloudFormationExecutionRoleArn_java_lang_String_", null, 0, 1,
				BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_(),
				ecorePackage.getEString(), "deployRoleArn_java_lang_String_", null, 0, 1,
				BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.BootstraplessSynthesizerProps", 0, 1,
				BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName",
				null, 0, 1, BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_Identifier(), ecorePackage.getEString(),
				"identifier", null, 0, 1, BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstraplessSynthesizerPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, BootstraplessSynthesizerPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContextValueResultBuilder_coreEClass, GetContextValueResultBuilder_core.class,
				"GetContextValueResultBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetContextValueResultBuilder_core_Value_java_lang_Object_(), ecorePackage.getEJavaObject(),
				"value_java_lang_Object_", null, 0, 1, GetContextValueResultBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueResultBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.GetContextValueResult", 0, 1,
				GetContextValueResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueResultBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GetContextValueResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueResultBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, GetContextValueResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextValueResultBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, GetContextValueResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(tagManagerBuilder_coreEClass, TagManagerBuilder_core.class, "TagManagerBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagManagerBuilder_core_TagPropertyName_java_lang_String_(), ecorePackage.getEString(),
				"tagPropertyName_java_lang_String_", null, 0, 1, TagManagerBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.TagManager", 0, 1, TagManagerBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				TagManagerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				TagManagerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagManagerBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, TagManagerBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyAnyValueOptionsBuilder_coreEClass, LazyAnyValueOptionsBuilder_core.class,
				"LazyAnyValueOptionsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_DisplayHint_java_lang_String_(), ecorePackage.getEString(),
				"displayHint_java_lang_String_", null, 0, 1, LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_OmitEmptyArray_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "omitEmptyArray_java_lang_Boolean_", null, 0, 1,
				LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.LazyAnyValueOptions", 0, 1,
				LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLazyAnyValueOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, LazyAnyValueOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerImageAssetSourceBuilder_coreEClass, DockerImageAssetSourceBuilder_core.class,
				"DockerImageAssetSourceBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerImageAssetSourceBuilder_core_DirectoryName_java_lang_String_(),
				ecorePackage.getEString(), "directoryName_java_lang_String_", null, 0, 1,
				DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_SourceHash_java_lang_String_(), ecorePackage.getEString(),
				"sourceHash_java_lang_String_", null, 0, 1, DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_DockerBuildArgs_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "dockerBuildArgs_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_DockerBuildTarget_java_lang_String_(),
				ecorePackage.getEString(), "dockerBuildTarget_java_lang_String_", null, 0, 1,
				DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_DockerFile_java_lang_String_(), ecorePackage.getEString(),
				"dockerFile_java_lang_String_", null, 0, 1, DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_RepositoryName_java_lang_String_(),
				ecorePackage.getEString(), "repositoryName_java_lang_String_", null, 0, 1,
				DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.DockerImageAssetSource", 0, 1,
				DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0,
				1, DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_Identifier(), ecorePackage.getEString(), "identifier",
				null, 0, 1, DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImageAssetSourceBuilder_core_AdditionalCode(), ecorePackage.getEString(),
				"additionalCode", null, 0, 1, DockerImageAssetSourceBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedStackPropsBuilder_coreEClass, NestedStackPropsBuilder_core.class,
				"NestedStackPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedStackPropsBuilder_core_NotificationArns_java_lang_String_AsList(),
				ecorePackage.getEString(), "notificationArns_java_lang_String_AsList", null, 0, 1,
				NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackPropsBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap(),
				ecorePackage.getEString(), "parameters_java_lang_String__java_lang_String_AsMap", null, 0, 1,
				NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getNestedStackPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(),
				ecorePackage.getEString(), "timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference", null,
				0, 1, NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.NestedStackProps", 0, 1,
				NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedStackPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, NestedStackPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getContextKeyResultBuilder_coreEClass, GetContextKeyResultBuilder_core.class,
				"GetContextKeyResultBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetContextKeyResultBuilder_core_Key_java_lang_String_(), ecorePackage.getEString(),
				"key_java_lang_String_", null, 0, 1, GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyResultBuilder_core_Props_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "props_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyResultBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.GetContextKeyResult", 0, 1,
				GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyResultBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyResultBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetContextKeyResultBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, GetContextKeyResultBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetStagingPropsBuilder_coreEClass, AssetStagingPropsBuilder_core.class,
				"AssetStagingPropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetStagingPropsBuilder_core_SourcePath_java_lang_String_(), ecorePackage.getEString(),
				"sourcePath_java_lang_String_", null, 0, 1, AssetStagingPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_ExtraHash_java_lang_String_(), ecorePackage.getEString(),
				"extraHash_java_lang_String_", null, 0, 1, AssetStagingPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_Exclude_java_lang_String_AsList(), ecorePackage.getEString(),
				"exclude_java_lang_String_AsList", null, 0, 1, AssetStagingPropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_(),
				this.getSymlinkFollowMode(), "follow_software_amazon_awscdk_core_SymlinkFollowMode_", null, 0, 1,
				AssetStagingPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.AssetStagingProps", 0, 1,
				AssetStagingPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				AssetStagingPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0,
				1, AssetStagingPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetStagingPropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, AssetStagingPropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyBuilder_coreEClass, DependencyBuilder_core.class, "DependencyBuilder_core", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
				getDependencyBuilder_core_SourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "sourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, DependencyBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
				getDependencyBuilder_core_TargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(),
				ecorePackage.getEString(), "targetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference",
				null, 0, 1, DependencyBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.Dependency", 0, 1, DependencyBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				DependencyBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				DependencyBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null, 0,
				1, DependencyBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyOptionsBuilder_coreEClass, CopyOptionsBuilder_core.class, "CopyOptionsBuilder_core",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyOptionsBuilder_core_Exclude_java_lang_String_AsList(), ecorePackage.getEString(),
				"exclude_java_lang_String_AsList", null, 0, 1, CopyOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_(),
				this.getSymlinkFollowMode(), "follow_software_amazon_awscdk_core_SymlinkFollowMode_", null, 0, 1,
				CopyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOptionsBuilder_core_GeneratedClassName(), ecorePackage.getEString(), "generatedClassName",
				"software.amazon.awscdk.core.CopyOptions", 0, 1, CopyOptionsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOptionsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CopyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOptionsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				CopyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOptionsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode", null,
				0, 1, CopyOptionsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customResourcePropsBuilder_coreEClass, CustomResourcePropsBuilder_core.class,
				"CustomResourcePropsBuilder_core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomResourcePropsBuilder_core_ServiceToken_java_lang_String_(), ecorePackage.getEString(),
				"serviceToken_java_lang_String_", null, 0, 1, CustomResourcePropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_PascalCaseProperties_java_lang_Boolean_(),
				ecorePackage.getEBooleanObject(), "pascalCaseProperties_java_lang_Boolean_", null, 0, 1,
				CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap(),
				ecorePackage.getEString(), "properties_java_lang_String__java_lang_Object_AsMap", null, 0, 1,
				CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(),
				this.getRemovalPolicy(), "removalPolicy_software_amazon_awscdk_core_RemovalPolicy_", null, 0, 1,
				CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_ResourceType_java_lang_String_(), ecorePackage.getEString(),
				"resourceType_java_lang_String_", null, 0, 1, CustomResourcePropsBuilder_core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_GeneratedClassName(), ecorePackage.getEString(),
				"generatedClassName", "software.amazon.awscdk.core.CustomResourceProps", 0, 1,
				CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_VarName(), ecorePackage.getEString(), "varName", null, 0, 1,
				CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_Identifier(), ecorePackage.getEString(), "identifier", null,
				0, 1, CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomResourcePropsBuilder_core_AdditionalCode(), ecorePackage.getEString(), "additionalCode",
				null, 0, 1, CustomResourcePropsBuilder_core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fileAssetPackagingEEnum, FileAssetPackaging.class, "FileAssetPackaging");
		addEEnumLiteral(fileAssetPackagingEEnum, FileAssetPackaging.ZIP_DIRECTORY);
		addEEnumLiteral(fileAssetPackagingEEnum, FileAssetPackaging.FILE);

		initEEnum(cfnDynamicReferenceServiceEEnum, CfnDynamicReferenceService.class, "CfnDynamicReferenceService");
		addEEnumLiteral(cfnDynamicReferenceServiceEEnum, CfnDynamicReferenceService.SSM);
		addEEnumLiteral(cfnDynamicReferenceServiceEEnum, CfnDynamicReferenceService.SSM_SECURE);
		addEEnumLiteral(cfnDynamicReferenceServiceEEnum, CfnDynamicReferenceService.SECRETS_MANAGER);

		initEEnum(tagTypeEEnum, TagType.class, "TagType");
		addEEnumLiteral(tagTypeEEnum, TagType.STANDARD);
		addEEnumLiteral(tagTypeEEnum, TagType.AUTOSCALING_GROUP);
		addEEnumLiteral(tagTypeEEnum, TagType.MAP);
		addEEnumLiteral(tagTypeEEnum, TagType.KEY_VALUE);
		addEEnumLiteral(tagTypeEEnum, TagType.NOT_TAGGABLE);

		initEEnum(removalPolicyEEnum, RemovalPolicy.class, "RemovalPolicy");
		addEEnumLiteral(removalPolicyEEnum, RemovalPolicy.DESTROY);
		addEEnumLiteral(removalPolicyEEnum, RemovalPolicy.RETAIN);

		initEEnum(sizeRoundingBehaviorEEnum, SizeRoundingBehavior.class, "SizeRoundingBehavior");
		addEEnumLiteral(sizeRoundingBehaviorEEnum, SizeRoundingBehavior.FAIL);
		addEEnumLiteral(sizeRoundingBehaviorEEnum, SizeRoundingBehavior.FLOOR);
		addEEnumLiteral(sizeRoundingBehaviorEEnum, SizeRoundingBehavior.NONE);

		initEEnum(cfnCapabilitiesEEnum, CfnCapabilities.class, "CfnCapabilities");
		addEEnumLiteral(cfnCapabilitiesEEnum, CfnCapabilities.NONE);
		addEEnumLiteral(cfnCapabilitiesEEnum, CfnCapabilities.ANONYMOUS_IAM);
		addEEnumLiteral(cfnCapabilitiesEEnum, CfnCapabilities.NAMED_IAM);
		addEEnumLiteral(cfnCapabilitiesEEnum, CfnCapabilities.AUTO_EXPAND);

		initEEnum(constructOrderEEnum, ConstructOrder.class, "ConstructOrder");
		addEEnumLiteral(constructOrderEEnum, ConstructOrder.PREORDER);
		addEEnumLiteral(constructOrderEEnum, ConstructOrder.POSTORDER);

		initEEnum(customResourceProviderRuntimeEEnum, CustomResourceProviderRuntime.class,
				"CustomResourceProviderRuntime");
		addEEnumLiteral(customResourceProviderRuntimeEEnum, CustomResourceProviderRuntime.NODEJS_12);

		initEEnum(cfnDeletionPolicyEEnum, CfnDeletionPolicy.class, "CfnDeletionPolicy");
		addEEnumLiteral(cfnDeletionPolicyEEnum, CfnDeletionPolicy.DELETE);
		addEEnumLiteral(cfnDeletionPolicyEEnum, CfnDeletionPolicy.RETAIN);
		addEEnumLiteral(cfnDeletionPolicyEEnum, CfnDeletionPolicy.SNAPSHOT);

		initEEnum(symlinkFollowModeEEnum, SymlinkFollowMode.class, "SymlinkFollowMode");
		addEEnumLiteral(symlinkFollowModeEEnum, SymlinkFollowMode.NEVER);
		addEEnumLiteral(symlinkFollowModeEEnum, SymlinkFollowMode.ALWAYS);
		addEEnumLiteral(symlinkFollowModeEEnum, SymlinkFollowMode.EXTERNAL);
		addEEnumLiteral(symlinkFollowModeEEnum, SymlinkFollowMode.BLOCK_EXTERNAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl
