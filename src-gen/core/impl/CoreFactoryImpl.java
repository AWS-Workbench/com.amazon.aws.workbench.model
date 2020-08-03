/**
 */
package core.impl;

import core.*;

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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory) EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
		case CorePackage.ENVIRONMENT_BUILDER_CORE:
			return createEnvironmentBuilder_core();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE:
			return createResolveOptionsBuilder_core();
		case CorePackage.ASSET_STAGING_BUILDER_CORE:
			return createAssetStagingBuilder_core();
		case CorePackage.NESTED_STACK_BUILDER_CORE:
			return createNestedStackBuilder_core();
		case CorePackage.STACK_PROPS_BUILDER_CORE:
			return createStackPropsBuilder_core();
		case CorePackage.TIME_CONVERSION_OPTIONS_BUILDER_CORE:
			return createTimeConversionOptionsBuilder_core();
		case CorePackage.REMOVE_TAG_BUILDER_CORE:
			return createRemoveTagBuilder_core();
		case CorePackage.TAG_PROPS_BUILDER_CORE:
			return createTagPropsBuilder_core();
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE:
			return createRemovalPolicyOptionsBuilder_core();
		case CorePackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE:
			return createDefaultStackSynthesizerBuilder_core();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE:
			return createFileAssetLocationBuilder_core();
		case CorePackage.FINGERPRINT_OPTIONS_BUILDER_CORE:
			return createFingerprintOptionsBuilder_core();
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE:
			return createLazyListValueOptionsBuilder_core();
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE:
			return createCustomResourceBuilder_core();
		case CorePackage.GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE:
			return createGetContextKeyOptionsBuilder_core();
		case CorePackage.VALIDATION_ERROR_BUILDER_CORE:
			return createValidationErrorBuilder_core();
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE:
			return createSynthesisOptionsBuilder_core();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE:
			return createDockerImageAssetLocationBuilder_core();
		case CorePackage.FILE_ASSET_SOURCE_BUILDER_CORE:
			return createFileAssetSourceBuilder_core();
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE:
			return createGetContextValueOptionsBuilder_core();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE:
			return createBootstraplessSynthesizerBuilder_core();
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE:
			return createArnComponentsBuilder_core();
		case CorePackage.TAG_BUILDER_CORE:
			return createTagBuilder_core();
		case CorePackage.RESOURCE_PROPS_BUILDER_CORE:
			return createResourcePropsBuilder_core();
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE:
			return createSizeConversionOptionsBuilder_core();
		case CorePackage.ENCODING_OPTIONS_BUILDER_CORE:
			return createEncodingOptionsBuilder_core();
		case CorePackage.FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE:
			return createFromCloudFormationOptionsBuilder_core();
		case CorePackage.STACK_BUILDER_CORE:
			return createStackBuilder_core();
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE:
			return createCustomResourceProviderPropsBuilder_core();
		case CorePackage.LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE:
			return createLazyStringValueOptionsBuilder_core();
		case CorePackage.APP_PROPS_BUILDER_CORE:
			return createAppPropsBuilder_core();
		case CorePackage.DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE:
			return createDefaultStackSynthesizerPropsBuilder_core();
		case CorePackage.TAG_MANAGER_OPTIONS_BUILDER_CORE:
			return createTagManagerOptionsBuilder_core();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE:
			return createSecretsManagerSecretOptionsBuilder_core();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE:
			return createBootstraplessSynthesizerPropsBuilder_core();
		case CorePackage.GET_CONTEXT_VALUE_RESULT_BUILDER_CORE:
			return createGetContextValueResultBuilder_core();
		case CorePackage.APP_BUILDER_CORE:
			return createAppBuilder_core();
		case CorePackage.TAG_MANAGER_BUILDER_CORE:
			return createTagManagerBuilder_core();
		case CorePackage.LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE:
			return createLazyAnyValueOptionsBuilder_core();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE:
			return createDockerImageAssetSourceBuilder_core();
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE:
			return createNestedStackPropsBuilder_core();
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE:
			return createGetContextKeyResultBuilder_core();
		case CorePackage.ASSET_STAGING_PROPS_BUILDER_CORE:
			return createAssetStagingPropsBuilder_core();
		case CorePackage.DEPENDENCY_BUILDER_CORE:
			return createDependencyBuilder_core();
		case CorePackage.COPY_OPTIONS_BUILDER_CORE:
			return createCopyOptionsBuilder_core();
		case CorePackage.CUSTOM_RESOURCE_PROPS_BUILDER_CORE:
			return createCustomResourcePropsBuilder_core();
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
		case CorePackage.FILE_ASSET_PACKAGING:
			return createFileAssetPackagingFromString(eDataType, initialValue);
		case CorePackage.CFN_DYNAMIC_REFERENCE_SERVICE:
			return createCfnDynamicReferenceServiceFromString(eDataType, initialValue);
		case CorePackage.TAG_TYPE:
			return createTagTypeFromString(eDataType, initialValue);
		case CorePackage.REMOVAL_POLICY:
			return createRemovalPolicyFromString(eDataType, initialValue);
		case CorePackage.SIZE_ROUNDING_BEHAVIOR:
			return createSizeRoundingBehaviorFromString(eDataType, initialValue);
		case CorePackage.CFN_CAPABILITIES:
			return createCfnCapabilitiesFromString(eDataType, initialValue);
		case CorePackage.CONSTRUCT_ORDER:
			return createConstructOrderFromString(eDataType, initialValue);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_RUNTIME:
			return createCustomResourceProviderRuntimeFromString(eDataType, initialValue);
		case CorePackage.CFN_DELETION_POLICY:
			return createCfnDeletionPolicyFromString(eDataType, initialValue);
		case CorePackage.SYMLINK_FOLLOW_MODE:
			return createSymlinkFollowModeFromString(eDataType, initialValue);
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
		case CorePackage.FILE_ASSET_PACKAGING:
			return convertFileAssetPackagingToString(eDataType, instanceValue);
		case CorePackage.CFN_DYNAMIC_REFERENCE_SERVICE:
			return convertCfnDynamicReferenceServiceToString(eDataType, instanceValue);
		case CorePackage.TAG_TYPE:
			return convertTagTypeToString(eDataType, instanceValue);
		case CorePackage.REMOVAL_POLICY:
			return convertRemovalPolicyToString(eDataType, instanceValue);
		case CorePackage.SIZE_ROUNDING_BEHAVIOR:
			return convertSizeRoundingBehaviorToString(eDataType, instanceValue);
		case CorePackage.CFN_CAPABILITIES:
			return convertCfnCapabilitiesToString(eDataType, instanceValue);
		case CorePackage.CONSTRUCT_ORDER:
			return convertConstructOrderToString(eDataType, instanceValue);
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_RUNTIME:
			return convertCustomResourceProviderRuntimeToString(eDataType, instanceValue);
		case CorePackage.CFN_DELETION_POLICY:
			return convertCfnDeletionPolicyToString(eDataType, instanceValue);
		case CorePackage.SYMLINK_FOLLOW_MODE:
			return convertSymlinkFollowModeToString(eDataType, instanceValue);
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
	public ResolveOptionsBuilder_core createResolveOptionsBuilder_core() {
		ResolveOptionsBuilder_coreImpl resolveOptionsBuilder_core = new ResolveOptionsBuilder_coreImpl();
		return resolveOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetStagingBuilder_core createAssetStagingBuilder_core() {
		AssetStagingBuilder_coreImpl assetStagingBuilder_core = new AssetStagingBuilder_coreImpl();
		return assetStagingBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedStackBuilder_core createNestedStackBuilder_core() {
		NestedStackBuilder_coreImpl nestedStackBuilder_core = new NestedStackBuilder_coreImpl();
		return nestedStackBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StackPropsBuilder_core createStackPropsBuilder_core() {
		StackPropsBuilder_coreImpl stackPropsBuilder_core = new StackPropsBuilder_coreImpl();
		return stackPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeConversionOptionsBuilder_core createTimeConversionOptionsBuilder_core() {
		TimeConversionOptionsBuilder_coreImpl timeConversionOptionsBuilder_core = new TimeConversionOptionsBuilder_coreImpl();
		return timeConversionOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveTagBuilder_core createRemoveTagBuilder_core() {
		RemoveTagBuilder_coreImpl removeTagBuilder_core = new RemoveTagBuilder_coreImpl();
		return removeTagBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagPropsBuilder_core createTagPropsBuilder_core() {
		TagPropsBuilder_coreImpl tagPropsBuilder_core = new TagPropsBuilder_coreImpl();
		return tagPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicyOptionsBuilder_core createRemovalPolicyOptionsBuilder_core() {
		RemovalPolicyOptionsBuilder_coreImpl removalPolicyOptionsBuilder_core = new RemovalPolicyOptionsBuilder_coreImpl();
		return removalPolicyOptionsBuilder_core;
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
	public FileAssetLocationBuilder_core createFileAssetLocationBuilder_core() {
		FileAssetLocationBuilder_coreImpl fileAssetLocationBuilder_core = new FileAssetLocationBuilder_coreImpl();
		return fileAssetLocationBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FingerprintOptionsBuilder_core createFingerprintOptionsBuilder_core() {
		FingerprintOptionsBuilder_coreImpl fingerprintOptionsBuilder_core = new FingerprintOptionsBuilder_coreImpl();
		return fingerprintOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LazyListValueOptionsBuilder_core createLazyListValueOptionsBuilder_core() {
		LazyListValueOptionsBuilder_coreImpl lazyListValueOptionsBuilder_core = new LazyListValueOptionsBuilder_coreImpl();
		return lazyListValueOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomResourceBuilder_core createCustomResourceBuilder_core() {
		CustomResourceBuilder_coreImpl customResourceBuilder_core = new CustomResourceBuilder_coreImpl();
		return customResourceBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetContextKeyOptionsBuilder_core createGetContextKeyOptionsBuilder_core() {
		GetContextKeyOptionsBuilder_coreImpl getContextKeyOptionsBuilder_core = new GetContextKeyOptionsBuilder_coreImpl();
		return getContextKeyOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationErrorBuilder_core createValidationErrorBuilder_core() {
		ValidationErrorBuilder_coreImpl validationErrorBuilder_core = new ValidationErrorBuilder_coreImpl();
		return validationErrorBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynthesisOptionsBuilder_core createSynthesisOptionsBuilder_core() {
		SynthesisOptionsBuilder_coreImpl synthesisOptionsBuilder_core = new SynthesisOptionsBuilder_coreImpl();
		return synthesisOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerImageAssetLocationBuilder_core createDockerImageAssetLocationBuilder_core() {
		DockerImageAssetLocationBuilder_coreImpl dockerImageAssetLocationBuilder_core = new DockerImageAssetLocationBuilder_coreImpl();
		return dockerImageAssetLocationBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileAssetSourceBuilder_core createFileAssetSourceBuilder_core() {
		FileAssetSourceBuilder_coreImpl fileAssetSourceBuilder_core = new FileAssetSourceBuilder_coreImpl();
		return fileAssetSourceBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetContextValueOptionsBuilder_core createGetContextValueOptionsBuilder_core() {
		GetContextValueOptionsBuilder_coreImpl getContextValueOptionsBuilder_core = new GetContextValueOptionsBuilder_coreImpl();
		return getContextValueOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstraplessSynthesizerBuilder_core createBootstraplessSynthesizerBuilder_core() {
		BootstraplessSynthesizerBuilder_coreImpl bootstraplessSynthesizerBuilder_core = new BootstraplessSynthesizerBuilder_coreImpl();
		return bootstraplessSynthesizerBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArnComponentsBuilder_core createArnComponentsBuilder_core() {
		ArnComponentsBuilder_coreImpl arnComponentsBuilder_core = new ArnComponentsBuilder_coreImpl();
		return arnComponentsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagBuilder_core createTagBuilder_core() {
		TagBuilder_coreImpl tagBuilder_core = new TagBuilder_coreImpl();
		return tagBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePropsBuilder_core createResourcePropsBuilder_core() {
		ResourcePropsBuilder_coreImpl resourcePropsBuilder_core = new ResourcePropsBuilder_coreImpl();
		return resourcePropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeConversionOptionsBuilder_core createSizeConversionOptionsBuilder_core() {
		SizeConversionOptionsBuilder_coreImpl sizeConversionOptionsBuilder_core = new SizeConversionOptionsBuilder_coreImpl();
		return sizeConversionOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncodingOptionsBuilder_core createEncodingOptionsBuilder_core() {
		EncodingOptionsBuilder_coreImpl encodingOptionsBuilder_core = new EncodingOptionsBuilder_coreImpl();
		return encodingOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromCloudFormationOptionsBuilder_core createFromCloudFormationOptionsBuilder_core() {
		FromCloudFormationOptionsBuilder_coreImpl fromCloudFormationOptionsBuilder_core = new FromCloudFormationOptionsBuilder_coreImpl();
		return fromCloudFormationOptionsBuilder_core;
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
	public CustomResourceProviderPropsBuilder_core createCustomResourceProviderPropsBuilder_core() {
		CustomResourceProviderPropsBuilder_coreImpl customResourceProviderPropsBuilder_core = new CustomResourceProviderPropsBuilder_coreImpl();
		return customResourceProviderPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LazyStringValueOptionsBuilder_core createLazyStringValueOptionsBuilder_core() {
		LazyStringValueOptionsBuilder_coreImpl lazyStringValueOptionsBuilder_core = new LazyStringValueOptionsBuilder_coreImpl();
		return lazyStringValueOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppPropsBuilder_core createAppPropsBuilder_core() {
		AppPropsBuilder_coreImpl appPropsBuilder_core = new AppPropsBuilder_coreImpl();
		return appPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultStackSynthesizerPropsBuilder_core createDefaultStackSynthesizerPropsBuilder_core() {
		DefaultStackSynthesizerPropsBuilder_coreImpl defaultStackSynthesizerPropsBuilder_core = new DefaultStackSynthesizerPropsBuilder_coreImpl();
		return defaultStackSynthesizerPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagManagerOptionsBuilder_core createTagManagerOptionsBuilder_core() {
		TagManagerOptionsBuilder_coreImpl tagManagerOptionsBuilder_core = new TagManagerOptionsBuilder_coreImpl();
		return tagManagerOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretsManagerSecretOptionsBuilder_core createSecretsManagerSecretOptionsBuilder_core() {
		SecretsManagerSecretOptionsBuilder_coreImpl secretsManagerSecretOptionsBuilder_core = new SecretsManagerSecretOptionsBuilder_coreImpl();
		return secretsManagerSecretOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstraplessSynthesizerPropsBuilder_core createBootstraplessSynthesizerPropsBuilder_core() {
		BootstraplessSynthesizerPropsBuilder_coreImpl bootstraplessSynthesizerPropsBuilder_core = new BootstraplessSynthesizerPropsBuilder_coreImpl();
		return bootstraplessSynthesizerPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetContextValueResultBuilder_core createGetContextValueResultBuilder_core() {
		GetContextValueResultBuilder_coreImpl getContextValueResultBuilder_core = new GetContextValueResultBuilder_coreImpl();
		return getContextValueResultBuilder_core;
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
	public TagManagerBuilder_core createTagManagerBuilder_core() {
		TagManagerBuilder_coreImpl tagManagerBuilder_core = new TagManagerBuilder_coreImpl();
		return tagManagerBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LazyAnyValueOptionsBuilder_core createLazyAnyValueOptionsBuilder_core() {
		LazyAnyValueOptionsBuilder_coreImpl lazyAnyValueOptionsBuilder_core = new LazyAnyValueOptionsBuilder_coreImpl();
		return lazyAnyValueOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerImageAssetSourceBuilder_core createDockerImageAssetSourceBuilder_core() {
		DockerImageAssetSourceBuilder_coreImpl dockerImageAssetSourceBuilder_core = new DockerImageAssetSourceBuilder_coreImpl();
		return dockerImageAssetSourceBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedStackPropsBuilder_core createNestedStackPropsBuilder_core() {
		NestedStackPropsBuilder_coreImpl nestedStackPropsBuilder_core = new NestedStackPropsBuilder_coreImpl();
		return nestedStackPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetContextKeyResultBuilder_core createGetContextKeyResultBuilder_core() {
		GetContextKeyResultBuilder_coreImpl getContextKeyResultBuilder_core = new GetContextKeyResultBuilder_coreImpl();
		return getContextKeyResultBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetStagingPropsBuilder_core createAssetStagingPropsBuilder_core() {
		AssetStagingPropsBuilder_coreImpl assetStagingPropsBuilder_core = new AssetStagingPropsBuilder_coreImpl();
		return assetStagingPropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyBuilder_core createDependencyBuilder_core() {
		DependencyBuilder_coreImpl dependencyBuilder_core = new DependencyBuilder_coreImpl();
		return dependencyBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyOptionsBuilder_core createCopyOptionsBuilder_core() {
		CopyOptionsBuilder_coreImpl copyOptionsBuilder_core = new CopyOptionsBuilder_coreImpl();
		return copyOptionsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomResourcePropsBuilder_core createCustomResourcePropsBuilder_core() {
		CustomResourcePropsBuilder_coreImpl customResourcePropsBuilder_core = new CustomResourcePropsBuilder_coreImpl();
		return customResourcePropsBuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileAssetPackaging createFileAssetPackagingFromString(EDataType eDataType, String initialValue) {
		FileAssetPackaging result = FileAssetPackaging.get(initialValue);
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
	public String convertFileAssetPackagingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfnDynamicReferenceService createCfnDynamicReferenceServiceFromString(EDataType eDataType,
			String initialValue) {
		CfnDynamicReferenceService result = CfnDynamicReferenceService.get(initialValue);
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
	public String convertCfnDynamicReferenceServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType createTagTypeFromString(EDataType eDataType, String initialValue) {
		TagType result = TagType.get(initialValue);
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
	public String convertTagTypeToString(EDataType eDataType, Object instanceValue) {
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
	public SizeRoundingBehavior createSizeRoundingBehaviorFromString(EDataType eDataType, String initialValue) {
		SizeRoundingBehavior result = SizeRoundingBehavior.get(initialValue);
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
	public String convertSizeRoundingBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfnCapabilities createCfnCapabilitiesFromString(EDataType eDataType, String initialValue) {
		CfnCapabilities result = CfnCapabilities.get(initialValue);
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
	public String convertCfnCapabilitiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructOrder createConstructOrderFromString(EDataType eDataType, String initialValue) {
		ConstructOrder result = ConstructOrder.get(initialValue);
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
	public String convertConstructOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomResourceProviderRuntime createCustomResourceProviderRuntimeFromString(EDataType eDataType,
			String initialValue) {
		CustomResourceProviderRuntime result = CustomResourceProviderRuntime.get(initialValue);
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
	public String convertCustomResourceProviderRuntimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfnDeletionPolicy createCfnDeletionPolicyFromString(EDataType eDataType, String initialValue) {
		CfnDeletionPolicy result = CfnDeletionPolicy.get(initialValue);
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
	public String convertCfnDeletionPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymlinkFollowMode createSymlinkFollowModeFromString(EDataType eDataType, String initialValue) {
		SymlinkFollowMode result = SymlinkFollowMode.get(initialValue);
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
	public String convertSymlinkFollowModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorePackage getCorePackage() {
		return (CorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
