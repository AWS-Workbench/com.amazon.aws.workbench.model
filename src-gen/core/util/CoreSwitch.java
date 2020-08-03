/**
 */
package core.util;

import core.*;

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
 * @see core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
		case CorePackage.ENVIRONMENT_BUILDER_CORE: {
			EnvironmentBuilder_core environmentBuilder_core = (EnvironmentBuilder_core) theEObject;
			T result = caseEnvironmentBuilder_core(environmentBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE: {
			ResolveOptionsBuilder_core resolveOptionsBuilder_core = (ResolveOptionsBuilder_core) theEObject;
			T result = caseResolveOptionsBuilder_core(resolveOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.ASSET_STAGING_BUILDER_CORE: {
			AssetStagingBuilder_core assetStagingBuilder_core = (AssetStagingBuilder_core) theEObject;
			T result = caseAssetStagingBuilder_core(assetStagingBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.NESTED_STACK_BUILDER_CORE: {
			NestedStackBuilder_core nestedStackBuilder_core = (NestedStackBuilder_core) theEObject;
			T result = caseNestedStackBuilder_core(nestedStackBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.STACK_PROPS_BUILDER_CORE: {
			StackPropsBuilder_core stackPropsBuilder_core = (StackPropsBuilder_core) theEObject;
			T result = caseStackPropsBuilder_core(stackPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TIME_CONVERSION_OPTIONS_BUILDER_CORE: {
			TimeConversionOptionsBuilder_core timeConversionOptionsBuilder_core = (TimeConversionOptionsBuilder_core) theEObject;
			T result = caseTimeConversionOptionsBuilder_core(timeConversionOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.REMOVE_TAG_BUILDER_CORE: {
			RemoveTagBuilder_core removeTagBuilder_core = (RemoveTagBuilder_core) theEObject;
			T result = caseRemoveTagBuilder_core(removeTagBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TAG_PROPS_BUILDER_CORE: {
			TagPropsBuilder_core tagPropsBuilder_core = (TagPropsBuilder_core) theEObject;
			T result = caseTagPropsBuilder_core(tagPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.REMOVAL_POLICY_OPTIONS_BUILDER_CORE: {
			RemovalPolicyOptionsBuilder_core removalPolicyOptionsBuilder_core = (RemovalPolicyOptionsBuilder_core) theEObject;
			T result = caseRemovalPolicyOptionsBuilder_core(removalPolicyOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE: {
			DefaultStackSynthesizerBuilder_core defaultStackSynthesizerBuilder_core = (DefaultStackSynthesizerBuilder_core) theEObject;
			T result = caseDefaultStackSynthesizerBuilder_core(defaultStackSynthesizerBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE: {
			FileAssetLocationBuilder_core fileAssetLocationBuilder_core = (FileAssetLocationBuilder_core) theEObject;
			T result = caseFileAssetLocationBuilder_core(fileAssetLocationBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.FINGERPRINT_OPTIONS_BUILDER_CORE: {
			FingerprintOptionsBuilder_core fingerprintOptionsBuilder_core = (FingerprintOptionsBuilder_core) theEObject;
			T result = caseFingerprintOptionsBuilder_core(fingerprintOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE: {
			LazyListValueOptionsBuilder_core lazyListValueOptionsBuilder_core = (LazyListValueOptionsBuilder_core) theEObject;
			T result = caseLazyListValueOptionsBuilder_core(lazyListValueOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.CUSTOM_RESOURCE_BUILDER_CORE: {
			CustomResourceBuilder_core customResourceBuilder_core = (CustomResourceBuilder_core) theEObject;
			T result = caseCustomResourceBuilder_core(customResourceBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE: {
			GetContextKeyOptionsBuilder_core getContextKeyOptionsBuilder_core = (GetContextKeyOptionsBuilder_core) theEObject;
			T result = caseGetContextKeyOptionsBuilder_core(getContextKeyOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.VALIDATION_ERROR_BUILDER_CORE: {
			ValidationErrorBuilder_core validationErrorBuilder_core = (ValidationErrorBuilder_core) theEObject;
			T result = caseValidationErrorBuilder_core(validationErrorBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.SYNTHESIS_OPTIONS_BUILDER_CORE: {
			SynthesisOptionsBuilder_core synthesisOptionsBuilder_core = (SynthesisOptionsBuilder_core) theEObject;
			T result = caseSynthesisOptionsBuilder_core(synthesisOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE: {
			DockerImageAssetLocationBuilder_core dockerImageAssetLocationBuilder_core = (DockerImageAssetLocationBuilder_core) theEObject;
			T result = caseDockerImageAssetLocationBuilder_core(dockerImageAssetLocationBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.FILE_ASSET_SOURCE_BUILDER_CORE: {
			FileAssetSourceBuilder_core fileAssetSourceBuilder_core = (FileAssetSourceBuilder_core) theEObject;
			T result = caseFileAssetSourceBuilder_core(fileAssetSourceBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE: {
			GetContextValueOptionsBuilder_core getContextValueOptionsBuilder_core = (GetContextValueOptionsBuilder_core) theEObject;
			T result = caseGetContextValueOptionsBuilder_core(getContextValueOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE: {
			BootstraplessSynthesizerBuilder_core bootstraplessSynthesizerBuilder_core = (BootstraplessSynthesizerBuilder_core) theEObject;
			T result = caseBootstraplessSynthesizerBuilder_core(bootstraplessSynthesizerBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.ARN_COMPONENTS_BUILDER_CORE: {
			ArnComponentsBuilder_core arnComponentsBuilder_core = (ArnComponentsBuilder_core) theEObject;
			T result = caseArnComponentsBuilder_core(arnComponentsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TAG_BUILDER_CORE: {
			TagBuilder_core tagBuilder_core = (TagBuilder_core) theEObject;
			T result = caseTagBuilder_core(tagBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.RESOURCE_PROPS_BUILDER_CORE: {
			ResourcePropsBuilder_core resourcePropsBuilder_core = (ResourcePropsBuilder_core) theEObject;
			T result = caseResourcePropsBuilder_core(resourcePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.SIZE_CONVERSION_OPTIONS_BUILDER_CORE: {
			SizeConversionOptionsBuilder_core sizeConversionOptionsBuilder_core = (SizeConversionOptionsBuilder_core) theEObject;
			T result = caseSizeConversionOptionsBuilder_core(sizeConversionOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.ENCODING_OPTIONS_BUILDER_CORE: {
			EncodingOptionsBuilder_core encodingOptionsBuilder_core = (EncodingOptionsBuilder_core) theEObject;
			T result = caseEncodingOptionsBuilder_core(encodingOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE: {
			FromCloudFormationOptionsBuilder_core fromCloudFormationOptionsBuilder_core = (FromCloudFormationOptionsBuilder_core) theEObject;
			T result = caseFromCloudFormationOptionsBuilder_core(fromCloudFormationOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.STACK_BUILDER_CORE: {
			StackBuilder_core stackBuilder_core = (StackBuilder_core) theEObject;
			T result = caseStackBuilder_core(stackBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE: {
			CustomResourceProviderPropsBuilder_core customResourceProviderPropsBuilder_core = (CustomResourceProviderPropsBuilder_core) theEObject;
			T result = caseCustomResourceProviderPropsBuilder_core(customResourceProviderPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE: {
			LazyStringValueOptionsBuilder_core lazyStringValueOptionsBuilder_core = (LazyStringValueOptionsBuilder_core) theEObject;
			T result = caseLazyStringValueOptionsBuilder_core(lazyStringValueOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.APP_PROPS_BUILDER_CORE: {
			AppPropsBuilder_core appPropsBuilder_core = (AppPropsBuilder_core) theEObject;
			T result = caseAppPropsBuilder_core(appPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE: {
			DefaultStackSynthesizerPropsBuilder_core defaultStackSynthesizerPropsBuilder_core = (DefaultStackSynthesizerPropsBuilder_core) theEObject;
			T result = caseDefaultStackSynthesizerPropsBuilder_core(defaultStackSynthesizerPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TAG_MANAGER_OPTIONS_BUILDER_CORE: {
			TagManagerOptionsBuilder_core tagManagerOptionsBuilder_core = (TagManagerOptionsBuilder_core) theEObject;
			T result = caseTagManagerOptionsBuilder_core(tagManagerOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE: {
			SecretsManagerSecretOptionsBuilder_core secretsManagerSecretOptionsBuilder_core = (SecretsManagerSecretOptionsBuilder_core) theEObject;
			T result = caseSecretsManagerSecretOptionsBuilder_core(secretsManagerSecretOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE: {
			BootstraplessSynthesizerPropsBuilder_core bootstraplessSynthesizerPropsBuilder_core = (BootstraplessSynthesizerPropsBuilder_core) theEObject;
			T result = caseBootstraplessSynthesizerPropsBuilder_core(bootstraplessSynthesizerPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.GET_CONTEXT_VALUE_RESULT_BUILDER_CORE: {
			GetContextValueResultBuilder_core getContextValueResultBuilder_core = (GetContextValueResultBuilder_core) theEObject;
			T result = caseGetContextValueResultBuilder_core(getContextValueResultBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.APP_BUILDER_CORE: {
			AppBuilder_core appBuilder_core = (AppBuilder_core) theEObject;
			T result = caseAppBuilder_core(appBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TAG_MANAGER_BUILDER_CORE: {
			TagManagerBuilder_core tagManagerBuilder_core = (TagManagerBuilder_core) theEObject;
			T result = caseTagManagerBuilder_core(tagManagerBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE: {
			LazyAnyValueOptionsBuilder_core lazyAnyValueOptionsBuilder_core = (LazyAnyValueOptionsBuilder_core) theEObject;
			T result = caseLazyAnyValueOptionsBuilder_core(lazyAnyValueOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE: {
			DockerImageAssetSourceBuilder_core dockerImageAssetSourceBuilder_core = (DockerImageAssetSourceBuilder_core) theEObject;
			T result = caseDockerImageAssetSourceBuilder_core(dockerImageAssetSourceBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.NESTED_STACK_PROPS_BUILDER_CORE: {
			NestedStackPropsBuilder_core nestedStackPropsBuilder_core = (NestedStackPropsBuilder_core) theEObject;
			T result = caseNestedStackPropsBuilder_core(nestedStackPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.GET_CONTEXT_KEY_RESULT_BUILDER_CORE: {
			GetContextKeyResultBuilder_core getContextKeyResultBuilder_core = (GetContextKeyResultBuilder_core) theEObject;
			T result = caseGetContextKeyResultBuilder_core(getContextKeyResultBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.ASSET_STAGING_PROPS_BUILDER_CORE: {
			AssetStagingPropsBuilder_core assetStagingPropsBuilder_core = (AssetStagingPropsBuilder_core) theEObject;
			T result = caseAssetStagingPropsBuilder_core(assetStagingPropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.DEPENDENCY_BUILDER_CORE: {
			DependencyBuilder_core dependencyBuilder_core = (DependencyBuilder_core) theEObject;
			T result = caseDependencyBuilder_core(dependencyBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.COPY_OPTIONS_BUILDER_CORE: {
			CopyOptionsBuilder_core copyOptionsBuilder_core = (CopyOptionsBuilder_core) theEObject;
			T result = caseCopyOptionsBuilder_core(copyOptionsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.CUSTOM_RESOURCE_PROPS_BUILDER_CORE: {
			CustomResourcePropsBuilder_core customResourcePropsBuilder_core = (CustomResourcePropsBuilder_core) theEObject;
			T result = caseCustomResourcePropsBuilder_core(customResourcePropsBuilder_core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveOptionsBuilder_core(ResolveOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Staging Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Staging Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetStagingBuilder_core(AssetStagingBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Stack Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Stack Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedStackBuilder_core(NestedStackBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackPropsBuilder_core(StackPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Conversion Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Conversion Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConversionOptionsBuilder_core(TimeConversionOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Tag Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Tag Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveTagBuilder_core(RemoveTagBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagPropsBuilder_core(TagPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removal Policy Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removal Policy Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovalPolicyOptionsBuilder_core(RemovalPolicyOptionsBuilder_core object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>File Asset Location Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Asset Location Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAssetLocationBuilder_core(FileAssetLocationBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fingerprint Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fingerprint Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFingerprintOptionsBuilder_core(FingerprintOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy List Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy List Value Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyListValueOptionsBuilder_core(LazyListValueOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Resource Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Resource Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomResourceBuilder_core(CustomResourceBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Context Key Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Context Key Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetContextKeyOptionsBuilder_core(GetContextKeyOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Error Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Error Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationErrorBuilder_core(ValidationErrorBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthesis Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthesis Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynthesisOptionsBuilder_core(SynthesisOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Image Asset Location Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Image Asset Location Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerImageAssetLocationBuilder_core(DockerImageAssetLocationBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Asset Source Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Asset Source Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAssetSourceBuilder_core(FileAssetSourceBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Context Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Context Value Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetContextValueOptionsBuilder_core(GetContextValueOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bootstrapless Synthesizer Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bootstrapless Synthesizer Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstraplessSynthesizerBuilder_core(BootstraplessSynthesizerBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arn Components Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arn Components Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArnComponentsBuilder_core(ArnComponentsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagBuilder_core(TagBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePropsBuilder_core(ResourcePropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Conversion Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Conversion Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeConversionOptionsBuilder_core(SizeConversionOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodingOptionsBuilder_core(EncodingOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Cloud Formation Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Cloud Formation Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromCloudFormationOptionsBuilder_core(FromCloudFormationOptionsBuilder_core object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Resource Provider Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Resource Provider Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomResourceProviderPropsBuilder_core(CustomResourceProviderPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy String Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy String Value Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyStringValueOptionsBuilder_core(LazyStringValueOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppPropsBuilder_core(AppPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Stack Synthesizer Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultStackSynthesizerPropsBuilder_core(DefaultStackSynthesizerPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Manager Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Manager Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagManagerOptionsBuilder_core(TagManagerOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secrets Manager Secret Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secrets Manager Secret Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretsManagerSecretOptionsBuilder_core(SecretsManagerSecretOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bootstrapless Synthesizer Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bootstrapless Synthesizer Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstraplessSynthesizerPropsBuilder_core(BootstraplessSynthesizerPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Context Value Result Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Context Value Result Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetContextValueResultBuilder_core(GetContextValueResultBuilder_core object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tag Manager Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Manager Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagManagerBuilder_core(TagManagerBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Any Value Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Any Value Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyAnyValueOptionsBuilder_core(LazyAnyValueOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Image Asset Source Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Image Asset Source Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerImageAssetSourceBuilder_core(DockerImageAssetSourceBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Stack Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Stack Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedStackPropsBuilder_core(NestedStackPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Context Key Result Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Context Key Result Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetContextKeyResultBuilder_core(GetContextKeyResultBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Staging Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Staging Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetStagingPropsBuilder_core(AssetStagingPropsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyBuilder_core(DependencyBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Options Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Options Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyOptionsBuilder_core(CopyOptionsBuilder_core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Resource Props Builder core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Resource Props Builder core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomResourcePropsBuilder_core(CustomResourcePropsBuilder_core object) {
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

} //CoreSwitch
