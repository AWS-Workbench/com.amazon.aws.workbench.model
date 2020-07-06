/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getEnvWithEnvironmentAsReference <em>Env With Environment As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getStackName <em>Stack Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getSynthesizerWithIStackSynthesizerAsReference <em>Synthesizer With IStack Synthesizer As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getTagsAsMap <em>Tags As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getTerminationProtection <em>Termination Protection</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.StackBuilder_coreImpl#getServiceresources <em>Serviceresources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackBuilder_coreImpl extends MinimalEObjectImpl.Container implements StackBuilder_core {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvWithEnvironmentAsReference() <em>Env With Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvWithEnvironmentAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_WITH_ENVIRONMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvWithEnvironmentAsReference() <em>Env With Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvWithEnvironmentAsReference()
	 * @generated
	 * @ordered
	 */
	protected String envWithEnvironmentAsReference = ENV_WITH_ENVIRONMENT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackName() <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackName() <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackName()
	 * @generated
	 * @ordered
	 */
	protected String stackName = STACK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynthesizerWithIStackSynthesizerAsReference() <em>Synthesizer With IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesizerWithIStackSynthesizerAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynthesizerWithIStackSynthesizerAsReference() <em>Synthesizer With IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesizerWithIStackSynthesizerAsReference()
	 * @generated
	 * @ordered
	 */
	protected String synthesizerWithIStackSynthesizerAsReference = SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTagsAsMap() <em>Tags As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagsAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGS_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagsAsMap() <em>Tags As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagsAsMap()
	 * @generated
	 * @ordered
	 */
	protected String tagsAsMap = TAGS_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationProtection() <em>Termination Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TERMINATION_PROTECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationProtection() <em>Termination Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationProtection()
	 * @generated
	 * @ordered
	 */
	protected Boolean terminationProtection = TERMINATION_PROTECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.Stack";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceresources() <em>Serviceresources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceresources()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceResources> serviceresources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.STACK_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvWithEnvironmentAsReference() {
		return envWithEnvironmentAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvWithEnvironmentAsReference(String newEnvWithEnvironmentAsReference) {
		String oldEnvWithEnvironmentAsReference = envWithEnvironmentAsReference;
		envWithEnvironmentAsReference = newEnvWithEnvironmentAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE,
					oldEnvWithEnvironmentAsReference, envWithEnvironmentAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStackName() {
		return stackName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackName(String newStackName) {
		String oldStackName = stackName;
		stackName = newStackName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME,
					oldStackName, stackName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSynthesizerWithIStackSynthesizerAsReference() {
		return synthesizerWithIStackSynthesizerAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynthesizerWithIStackSynthesizerAsReference(String newSynthesizerWithIStackSynthesizerAsReference) {
		String oldSynthesizerWithIStackSynthesizerAsReference = synthesizerWithIStackSynthesizerAsReference;
		synthesizerWithIStackSynthesizerAsReference = newSynthesizerWithIStackSynthesizerAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE,
					oldSynthesizerWithIStackSynthesizerAsReference, synthesizerWithIStackSynthesizerAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagsAsMap() {
		return tagsAsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagsAsMap(String newTagsAsMap) {
		String oldTagsAsMap = tagsAsMap;
		tagsAsMap = newTagsAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_AS_MAP,
					oldTagsAsMap, tagsAsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTerminationProtection() {
		return terminationProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationProtection(Boolean newTerminationProtection) {
		Boolean oldTerminationProtection = terminationProtection;
		terminationProtection = newTerminationProtection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION, oldTerminationProtection,
					terminationProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME,
					oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceResources> getServiceresources() {
		if (serviceresources == null) {
			serviceresources = new EObjectContainmentEList<ServiceResources>(ServiceResources.class, this,
					AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES);
		}
		return serviceresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
			return ((InternalEList<?>) getServiceresources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION:
			return getDescription();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE:
			return getEnvWithEnvironmentAsReference();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME:
			return getStackName();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE:
			return getSynthesizerWithIStackSynthesizerAsReference();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_AS_MAP:
			return getTagsAsMap();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION:
			return getTerminationProtection();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			return getAdditionalCode();
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
			return getServiceresources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE:
			setEnvWithEnvironmentAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME:
			setStackName((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE:
			setSynthesizerWithIStackSynthesizerAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_AS_MAP:
			setTagsAsMap((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION:
			setTerminationProtection((Boolean) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
			getServiceresources().clear();
			getServiceresources().addAll((Collection<? extends ServiceResources>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE:
			setEnvWithEnvironmentAsReference(ENV_WITH_ENVIRONMENT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME:
			setStackName(STACK_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE:
			setSynthesizerWithIStackSynthesizerAsReference(SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_AS_MAP:
			setTagsAsMap(TAGS_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION:
			setTerminationProtection(TERMINATION_PROTECTION_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
			getServiceresources().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_AS_REFERENCE:
			return ENV_WITH_ENVIRONMENT_AS_REFERENCE_EDEFAULT == null ? envWithEnvironmentAsReference != null
					: !ENV_WITH_ENVIRONMENT_AS_REFERENCE_EDEFAULT.equals(envWithEnvironmentAsReference);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME:
			return STACK_NAME_EDEFAULT == null ? stackName != null : !STACK_NAME_EDEFAULT.equals(stackName);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE:
			return SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT == null
					? synthesizerWithIStackSynthesizerAsReference != null
					: !SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_AS_REFERENCE_EDEFAULT
							.equals(synthesizerWithIStackSynthesizerAsReference);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_AS_MAP:
			return TAGS_AS_MAP_EDEFAULT == null ? tagsAsMap != null : !TAGS_AS_MAP_EDEFAULT.equals(tagsAsMap);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION:
			return TERMINATION_PROTECTION_EDEFAULT == null ? terminationProtection != null
					: !TERMINATION_PROTECTION_EDEFAULT.equals(terminationProtection);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
			return serviceresources != null && !serviceresources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", envWithEnvironmentAsReference: ");
		result.append(envWithEnvironmentAsReference);
		result.append(", stackName: ");
		result.append(stackName);
		result.append(", synthesizerWithIStackSynthesizerAsReference: ");
		result.append(synthesizerWithIStackSynthesizerAsReference);
		result.append(", tagsAsMap: ");
		result.append(tagsAsMap);
		result.append(", terminationProtection: ");
		result.append(terminationProtection);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //StackBuilder_coreImpl
