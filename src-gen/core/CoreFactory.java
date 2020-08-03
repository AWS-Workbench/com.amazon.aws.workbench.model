/**
 */
package core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Environment Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Builder core</em>'.
	 * @generated
	 */
	EnvironmentBuilder_core createEnvironmentBuilder_core();

	/**
	 * Returns a new object of class '<em>Resolve Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolve Options Builder core</em>'.
	 * @generated
	 */
	ResolveOptionsBuilder_core createResolveOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Asset Staging Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Staging Builder core</em>'.
	 * @generated
	 */
	AssetStagingBuilder_core createAssetStagingBuilder_core();

	/**
	 * Returns a new object of class '<em>Nested Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Stack Builder core</em>'.
	 * @generated
	 */
	NestedStackBuilder_core createNestedStackBuilder_core();

	/**
	 * Returns a new object of class '<em>Stack Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Props Builder core</em>'.
	 * @generated
	 */
	StackPropsBuilder_core createStackPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Time Conversion Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Conversion Options Builder core</em>'.
	 * @generated
	 */
	TimeConversionOptionsBuilder_core createTimeConversionOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Remove Tag Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Tag Builder core</em>'.
	 * @generated
	 */
	RemoveTagBuilder_core createRemoveTagBuilder_core();

	/**
	 * Returns a new object of class '<em>Tag Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Props Builder core</em>'.
	 * @generated
	 */
	TagPropsBuilder_core createTagPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Removal Policy Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Removal Policy Options Builder core</em>'.
	 * @generated
	 */
	RemovalPolicyOptionsBuilder_core createRemovalPolicyOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Stack Synthesizer Builder core</em>'.
	 * @generated
	 */
	DefaultStackSynthesizerBuilder_core createDefaultStackSynthesizerBuilder_core();

	/**
	 * Returns a new object of class '<em>File Asset Location Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Asset Location Builder core</em>'.
	 * @generated
	 */
	FileAssetLocationBuilder_core createFileAssetLocationBuilder_core();

	/**
	 * Returns a new object of class '<em>Fingerprint Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fingerprint Options Builder core</em>'.
	 * @generated
	 */
	FingerprintOptionsBuilder_core createFingerprintOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Lazy List Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lazy List Value Options Builder core</em>'.
	 * @generated
	 */
	LazyListValueOptionsBuilder_core createLazyListValueOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Custom Resource Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Resource Builder core</em>'.
	 * @generated
	 */
	CustomResourceBuilder_core createCustomResourceBuilder_core();

	/**
	 * Returns a new object of class '<em>Get Context Key Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Context Key Options Builder core</em>'.
	 * @generated
	 */
	GetContextKeyOptionsBuilder_core createGetContextKeyOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Validation Error Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Error Builder core</em>'.
	 * @generated
	 */
	ValidationErrorBuilder_core createValidationErrorBuilder_core();

	/**
	 * Returns a new object of class '<em>Synthesis Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synthesis Options Builder core</em>'.
	 * @generated
	 */
	SynthesisOptionsBuilder_core createSynthesisOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Docker Image Asset Location Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Image Asset Location Builder core</em>'.
	 * @generated
	 */
	DockerImageAssetLocationBuilder_core createDockerImageAssetLocationBuilder_core();

	/**
	 * Returns a new object of class '<em>File Asset Source Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Asset Source Builder core</em>'.
	 * @generated
	 */
	FileAssetSourceBuilder_core createFileAssetSourceBuilder_core();

	/**
	 * Returns a new object of class '<em>Get Context Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Context Value Options Builder core</em>'.
	 * @generated
	 */
	GetContextValueOptionsBuilder_core createGetContextValueOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Bootstrapless Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bootstrapless Synthesizer Builder core</em>'.
	 * @generated
	 */
	BootstraplessSynthesizerBuilder_core createBootstraplessSynthesizerBuilder_core();

	/**
	 * Returns a new object of class '<em>Arn Components Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arn Components Builder core</em>'.
	 * @generated
	 */
	ArnComponentsBuilder_core createArnComponentsBuilder_core();

	/**
	 * Returns a new object of class '<em>Tag Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Builder core</em>'.
	 * @generated
	 */
	TagBuilder_core createTagBuilder_core();

	/**
	 * Returns a new object of class '<em>Resource Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Props Builder core</em>'.
	 * @generated
	 */
	ResourcePropsBuilder_core createResourcePropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Size Conversion Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Conversion Options Builder core</em>'.
	 * @generated
	 */
	SizeConversionOptionsBuilder_core createSizeConversionOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Encoding Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoding Options Builder core</em>'.
	 * @generated
	 */
	EncodingOptionsBuilder_core createEncodingOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>From Cloud Formation Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Cloud Formation Options Builder core</em>'.
	 * @generated
	 */
	FromCloudFormationOptionsBuilder_core createFromCloudFormationOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Builder core</em>'.
	 * @generated
	 */
	StackBuilder_core createStackBuilder_core();

	/**
	 * Returns a new object of class '<em>Custom Resource Provider Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Resource Provider Props Builder core</em>'.
	 * @generated
	 */
	CustomResourceProviderPropsBuilder_core createCustomResourceProviderPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Lazy String Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lazy String Value Options Builder core</em>'.
	 * @generated
	 */
	LazyStringValueOptionsBuilder_core createLazyStringValueOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>App Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Props Builder core</em>'.
	 * @generated
	 */
	AppPropsBuilder_core createAppPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Default Stack Synthesizer Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Stack Synthesizer Props Builder core</em>'.
	 * @generated
	 */
	DefaultStackSynthesizerPropsBuilder_core createDefaultStackSynthesizerPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Tag Manager Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Manager Options Builder core</em>'.
	 * @generated
	 */
	TagManagerOptionsBuilder_core createTagManagerOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Secrets Manager Secret Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secrets Manager Secret Options Builder core</em>'.
	 * @generated
	 */
	SecretsManagerSecretOptionsBuilder_core createSecretsManagerSecretOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Bootstrapless Synthesizer Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bootstrapless Synthesizer Props Builder core</em>'.
	 * @generated
	 */
	BootstraplessSynthesizerPropsBuilder_core createBootstraplessSynthesizerPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Get Context Value Result Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Context Value Result Builder core</em>'.
	 * @generated
	 */
	GetContextValueResultBuilder_core createGetContextValueResultBuilder_core();

	/**
	 * Returns a new object of class '<em>App Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Builder core</em>'.
	 * @generated
	 */
	AppBuilder_core createAppBuilder_core();

	/**
	 * Returns a new object of class '<em>Tag Manager Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Manager Builder core</em>'.
	 * @generated
	 */
	TagManagerBuilder_core createTagManagerBuilder_core();

	/**
	 * Returns a new object of class '<em>Lazy Any Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lazy Any Value Options Builder core</em>'.
	 * @generated
	 */
	LazyAnyValueOptionsBuilder_core createLazyAnyValueOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Docker Image Asset Source Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Image Asset Source Builder core</em>'.
	 * @generated
	 */
	DockerImageAssetSourceBuilder_core createDockerImageAssetSourceBuilder_core();

	/**
	 * Returns a new object of class '<em>Nested Stack Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Stack Props Builder core</em>'.
	 * @generated
	 */
	NestedStackPropsBuilder_core createNestedStackPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Get Context Key Result Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Context Key Result Builder core</em>'.
	 * @generated
	 */
	GetContextKeyResultBuilder_core createGetContextKeyResultBuilder_core();

	/**
	 * Returns a new object of class '<em>Asset Staging Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Staging Props Builder core</em>'.
	 * @generated
	 */
	AssetStagingPropsBuilder_core createAssetStagingPropsBuilder_core();

	/**
	 * Returns a new object of class '<em>Dependency Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Builder core</em>'.
	 * @generated
	 */
	DependencyBuilder_core createDependencyBuilder_core();

	/**
	 * Returns a new object of class '<em>Copy Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Options Builder core</em>'.
	 * @generated
	 */
	CopyOptionsBuilder_core createCopyOptionsBuilder_core();

	/**
	 * Returns a new object of class '<em>Custom Resource Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Resource Props Builder core</em>'.
	 * @generated
	 */
	CustomResourcePropsBuilder_core createCustomResourcePropsBuilder_core();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
