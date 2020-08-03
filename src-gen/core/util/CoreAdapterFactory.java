/**
 */
package core.util;

import core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch = new CoreSwitch<Adapter>() {
		@Override
		public Adapter caseEnvironmentBuilder_core(EnvironmentBuilder_core object) {
			return createEnvironmentBuilder_coreAdapter();
		}

		@Override
		public Adapter caseResolveOptionsBuilder_core(ResolveOptionsBuilder_core object) {
			return createResolveOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseAssetStagingBuilder_core(AssetStagingBuilder_core object) {
			return createAssetStagingBuilder_coreAdapter();
		}

		@Override
		public Adapter caseNestedStackBuilder_core(NestedStackBuilder_core object) {
			return createNestedStackBuilder_coreAdapter();
		}

		@Override
		public Adapter caseStackPropsBuilder_core(StackPropsBuilder_core object) {
			return createStackPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseTimeConversionOptionsBuilder_core(TimeConversionOptionsBuilder_core object) {
			return createTimeConversionOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseRemoveTagBuilder_core(RemoveTagBuilder_core object) {
			return createRemoveTagBuilder_coreAdapter();
		}

		@Override
		public Adapter caseTagPropsBuilder_core(TagPropsBuilder_core object) {
			return createTagPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseRemovalPolicyOptionsBuilder_core(RemovalPolicyOptionsBuilder_core object) {
			return createRemovalPolicyOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDefaultStackSynthesizerBuilder_core(DefaultStackSynthesizerBuilder_core object) {
			return createDefaultStackSynthesizerBuilder_coreAdapter();
		}

		@Override
		public Adapter caseFileAssetLocationBuilder_core(FileAssetLocationBuilder_core object) {
			return createFileAssetLocationBuilder_coreAdapter();
		}

		@Override
		public Adapter caseFingerprintOptionsBuilder_core(FingerprintOptionsBuilder_core object) {
			return createFingerprintOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseLazyListValueOptionsBuilder_core(LazyListValueOptionsBuilder_core object) {
			return createLazyListValueOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseCustomResourceBuilder_core(CustomResourceBuilder_core object) {
			return createCustomResourceBuilder_coreAdapter();
		}

		@Override
		public Adapter caseGetContextKeyOptionsBuilder_core(GetContextKeyOptionsBuilder_core object) {
			return createGetContextKeyOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseValidationErrorBuilder_core(ValidationErrorBuilder_core object) {
			return createValidationErrorBuilder_coreAdapter();
		}

		@Override
		public Adapter caseSynthesisOptionsBuilder_core(SynthesisOptionsBuilder_core object) {
			return createSynthesisOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDockerImageAssetLocationBuilder_core(DockerImageAssetLocationBuilder_core object) {
			return createDockerImageAssetLocationBuilder_coreAdapter();
		}

		@Override
		public Adapter caseFileAssetSourceBuilder_core(FileAssetSourceBuilder_core object) {
			return createFileAssetSourceBuilder_coreAdapter();
		}

		@Override
		public Adapter caseGetContextValueOptionsBuilder_core(GetContextValueOptionsBuilder_core object) {
			return createGetContextValueOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBootstraplessSynthesizerBuilder_core(BootstraplessSynthesizerBuilder_core object) {
			return createBootstraplessSynthesizerBuilder_coreAdapter();
		}

		@Override
		public Adapter caseArnComponentsBuilder_core(ArnComponentsBuilder_core object) {
			return createArnComponentsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseTagBuilder_core(TagBuilder_core object) {
			return createTagBuilder_coreAdapter();
		}

		@Override
		public Adapter caseResourcePropsBuilder_core(ResourcePropsBuilder_core object) {
			return createResourcePropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseSizeConversionOptionsBuilder_core(SizeConversionOptionsBuilder_core object) {
			return createSizeConversionOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseEncodingOptionsBuilder_core(EncodingOptionsBuilder_core object) {
			return createEncodingOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseFromCloudFormationOptionsBuilder_core(FromCloudFormationOptionsBuilder_core object) {
			return createFromCloudFormationOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseStackBuilder_core(StackBuilder_core object) {
			return createStackBuilder_coreAdapter();
		}

		@Override
		public Adapter caseCustomResourceProviderPropsBuilder_core(CustomResourceProviderPropsBuilder_core object) {
			return createCustomResourceProviderPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseLazyStringValueOptionsBuilder_core(LazyStringValueOptionsBuilder_core object) {
			return createLazyStringValueOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseAppPropsBuilder_core(AppPropsBuilder_core object) {
			return createAppPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDefaultStackSynthesizerPropsBuilder_core(DefaultStackSynthesizerPropsBuilder_core object) {
			return createDefaultStackSynthesizerPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseTagManagerOptionsBuilder_core(TagManagerOptionsBuilder_core object) {
			return createTagManagerOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseSecretsManagerSecretOptionsBuilder_core(SecretsManagerSecretOptionsBuilder_core object) {
			return createSecretsManagerSecretOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseBootstraplessSynthesizerPropsBuilder_core(BootstraplessSynthesizerPropsBuilder_core object) {
			return createBootstraplessSynthesizerPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseGetContextValueResultBuilder_core(GetContextValueResultBuilder_core object) {
			return createGetContextValueResultBuilder_coreAdapter();
		}

		@Override
		public Adapter caseAppBuilder_core(AppBuilder_core object) {
			return createAppBuilder_coreAdapter();
		}

		@Override
		public Adapter caseTagManagerBuilder_core(TagManagerBuilder_core object) {
			return createTagManagerBuilder_coreAdapter();
		}

		@Override
		public Adapter caseLazyAnyValueOptionsBuilder_core(LazyAnyValueOptionsBuilder_core object) {
			return createLazyAnyValueOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDockerImageAssetSourceBuilder_core(DockerImageAssetSourceBuilder_core object) {
			return createDockerImageAssetSourceBuilder_coreAdapter();
		}

		@Override
		public Adapter caseNestedStackPropsBuilder_core(NestedStackPropsBuilder_core object) {
			return createNestedStackPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseGetContextKeyResultBuilder_core(GetContextKeyResultBuilder_core object) {
			return createGetContextKeyResultBuilder_coreAdapter();
		}

		@Override
		public Adapter caseAssetStagingPropsBuilder_core(AssetStagingPropsBuilder_core object) {
			return createAssetStagingPropsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseDependencyBuilder_core(DependencyBuilder_core object) {
			return createDependencyBuilder_coreAdapter();
		}

		@Override
		public Adapter caseCopyOptionsBuilder_core(CopyOptionsBuilder_core object) {
			return createCopyOptionsBuilder_coreAdapter();
		}

		@Override
		public Adapter caseCustomResourcePropsBuilder_core(CustomResourcePropsBuilder_core object) {
			return createCustomResourcePropsBuilder_coreAdapter();
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
	 * Creates a new adapter for an object of class '{@link core.EnvironmentBuilder_core <em>Environment Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.EnvironmentBuilder_core
	 * @generated
	 */
	public Adapter createEnvironmentBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.ResolveOptionsBuilder_core <em>Resolve Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.ResolveOptionsBuilder_core
	 * @generated
	 */
	public Adapter createResolveOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.AssetStagingBuilder_core <em>Asset Staging Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.AssetStagingBuilder_core
	 * @generated
	 */
	public Adapter createAssetStagingBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.NestedStackBuilder_core <em>Nested Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.NestedStackBuilder_core
	 * @generated
	 */
	public Adapter createNestedStackBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.StackPropsBuilder_core <em>Stack Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.StackPropsBuilder_core
	 * @generated
	 */
	public Adapter createStackPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.TimeConversionOptionsBuilder_core <em>Time Conversion Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.TimeConversionOptionsBuilder_core
	 * @generated
	 */
	public Adapter createTimeConversionOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.RemoveTagBuilder_core <em>Remove Tag Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.RemoveTagBuilder_core
	 * @generated
	 */
	public Adapter createRemoveTagBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.TagPropsBuilder_core <em>Tag Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.TagPropsBuilder_core
	 * @generated
	 */
	public Adapter createTagPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.RemovalPolicyOptionsBuilder_core <em>Removal Policy Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.RemovalPolicyOptionsBuilder_core
	 * @generated
	 */
	public Adapter createRemovalPolicyOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.DefaultStackSynthesizerBuilder_core <em>Default Stack Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.DefaultStackSynthesizerBuilder_core
	 * @generated
	 */
	public Adapter createDefaultStackSynthesizerBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.FileAssetLocationBuilder_core <em>File Asset Location Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.FileAssetLocationBuilder_core
	 * @generated
	 */
	public Adapter createFileAssetLocationBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.FingerprintOptionsBuilder_core <em>Fingerprint Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.FingerprintOptionsBuilder_core
	 * @generated
	 */
	public Adapter createFingerprintOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.LazyListValueOptionsBuilder_core <em>Lazy List Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.LazyListValueOptionsBuilder_core
	 * @generated
	 */
	public Adapter createLazyListValueOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CustomResourceBuilder_core <em>Custom Resource Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CustomResourceBuilder_core
	 * @generated
	 */
	public Adapter createCustomResourceBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.GetContextKeyOptionsBuilder_core <em>Get Context Key Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.GetContextKeyOptionsBuilder_core
	 * @generated
	 */
	public Adapter createGetContextKeyOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.ValidationErrorBuilder_core <em>Validation Error Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.ValidationErrorBuilder_core
	 * @generated
	 */
	public Adapter createValidationErrorBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.SynthesisOptionsBuilder_core <em>Synthesis Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.SynthesisOptionsBuilder_core
	 * @generated
	 */
	public Adapter createSynthesisOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.DockerImageAssetLocationBuilder_core <em>Docker Image Asset Location Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.DockerImageAssetLocationBuilder_core
	 * @generated
	 */
	public Adapter createDockerImageAssetLocationBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.FileAssetSourceBuilder_core <em>File Asset Source Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.FileAssetSourceBuilder_core
	 * @generated
	 */
	public Adapter createFileAssetSourceBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.GetContextValueOptionsBuilder_core <em>Get Context Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.GetContextValueOptionsBuilder_core
	 * @generated
	 */
	public Adapter createGetContextValueOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.BootstraplessSynthesizerBuilder_core <em>Bootstrapless Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.BootstraplessSynthesizerBuilder_core
	 * @generated
	 */
	public Adapter createBootstraplessSynthesizerBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.ArnComponentsBuilder_core <em>Arn Components Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.ArnComponentsBuilder_core
	 * @generated
	 */
	public Adapter createArnComponentsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.TagBuilder_core <em>Tag Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.TagBuilder_core
	 * @generated
	 */
	public Adapter createTagBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.ResourcePropsBuilder_core <em>Resource Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.ResourcePropsBuilder_core
	 * @generated
	 */
	public Adapter createResourcePropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.SizeConversionOptionsBuilder_core <em>Size Conversion Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.SizeConversionOptionsBuilder_core
	 * @generated
	 */
	public Adapter createSizeConversionOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.EncodingOptionsBuilder_core <em>Encoding Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.EncodingOptionsBuilder_core
	 * @generated
	 */
	public Adapter createEncodingOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.FromCloudFormationOptionsBuilder_core <em>From Cloud Formation Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.FromCloudFormationOptionsBuilder_core
	 * @generated
	 */
	public Adapter createFromCloudFormationOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.StackBuilder_core <em>Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.StackBuilder_core
	 * @generated
	 */
	public Adapter createStackBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CustomResourceProviderPropsBuilder_core <em>Custom Resource Provider Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CustomResourceProviderPropsBuilder_core
	 * @generated
	 */
	public Adapter createCustomResourceProviderPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.LazyStringValueOptionsBuilder_core <em>Lazy String Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.LazyStringValueOptionsBuilder_core
	 * @generated
	 */
	public Adapter createLazyStringValueOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.AppPropsBuilder_core <em>App Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.AppPropsBuilder_core
	 * @generated
	 */
	public Adapter createAppPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.DefaultStackSynthesizerPropsBuilder_core <em>Default Stack Synthesizer Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core
	 * @generated
	 */
	public Adapter createDefaultStackSynthesizerPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.TagManagerOptionsBuilder_core <em>Tag Manager Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.TagManagerOptionsBuilder_core
	 * @generated
	 */
	public Adapter createTagManagerOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.SecretsManagerSecretOptionsBuilder_core <em>Secrets Manager Secret Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.SecretsManagerSecretOptionsBuilder_core
	 * @generated
	 */
	public Adapter createSecretsManagerSecretOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.BootstraplessSynthesizerPropsBuilder_core <em>Bootstrapless Synthesizer Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core
	 * @generated
	 */
	public Adapter createBootstraplessSynthesizerPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.GetContextValueResultBuilder_core <em>Get Context Value Result Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.GetContextValueResultBuilder_core
	 * @generated
	 */
	public Adapter createGetContextValueResultBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.AppBuilder_core
	 * @generated
	 */
	public Adapter createAppBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.TagManagerBuilder_core <em>Tag Manager Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.TagManagerBuilder_core
	 * @generated
	 */
	public Adapter createTagManagerBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.LazyAnyValueOptionsBuilder_core <em>Lazy Any Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.LazyAnyValueOptionsBuilder_core
	 * @generated
	 */
	public Adapter createLazyAnyValueOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.DockerImageAssetSourceBuilder_core <em>Docker Image Asset Source Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.DockerImageAssetSourceBuilder_core
	 * @generated
	 */
	public Adapter createDockerImageAssetSourceBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.NestedStackPropsBuilder_core <em>Nested Stack Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.NestedStackPropsBuilder_core
	 * @generated
	 */
	public Adapter createNestedStackPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.GetContextKeyResultBuilder_core <em>Get Context Key Result Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.GetContextKeyResultBuilder_core
	 * @generated
	 */
	public Adapter createGetContextKeyResultBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.AssetStagingPropsBuilder_core <em>Asset Staging Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.AssetStagingPropsBuilder_core
	 * @generated
	 */
	public Adapter createAssetStagingPropsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.DependencyBuilder_core <em>Dependency Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.DependencyBuilder_core
	 * @generated
	 */
	public Adapter createDependencyBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CopyOptionsBuilder_core <em>Copy Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CopyOptionsBuilder_core
	 * @generated
	 */
	public Adapter createCopyOptionsBuilder_coreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CustomResourcePropsBuilder_core <em>Custom Resource Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CustomResourcePropsBuilder_core
	 * @generated
	 */
	public Adapter createCustomResourcePropsBuilder_coreAdapter() {
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

} //CoreAdapterFactory
