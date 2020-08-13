/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.TransitionBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference <em>Storage Class With Storage Class software amazon awscdk services s3 Storage Class As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Transition After With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getTransitionDateWithInstant_java_time_Instant_AsReference <em>Transition Date With Instant java time Instant As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TransitionBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionBuilder_s3Impl extends ServiceResourcesImpl implements TransitionBuilder_s3 {
	/**
	 * The default value of the '{@link #getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference() <em>Storage Class With Storage Class software amazon awscdk services s3 Storage Class As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference() <em>Storage Class With Storage Class software amazon awscdk services s3 Storage Class As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference = STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Transition After With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Transition After With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionDateWithInstant_java_time_Instant_AsReference() <em>Transition Date With Instant java time Instant As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionDateWithInstant_java_time_Instant_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionDateWithInstant_java_time_Instant_AsReference() <em>Transition Date With Instant java time Instant As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionDateWithInstant_java_time_Instant_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String transitionDateWithInstant_java_time_Instant_AsReference = TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.Transition";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.TRANSITION_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference() {
		return storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference(
			String newStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference) {
		String oldStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference = storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference;
		storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference = newStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE,
					oldStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference,
					storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = newTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionDateWithInstant_java_time_Instant_AsReference() {
		return transitionDateWithInstant_java_time_Instant_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionDateWithInstant_java_time_Instant_AsReference(
			String newTransitionDateWithInstant_java_time_Instant_AsReference) {
		String oldTransitionDateWithInstant_java_time_Instant_AsReference = transitionDateWithInstant_java_time_Instant_AsReference;
		transitionDateWithInstant_java_time_Instant_AsReference = newTransitionDateWithInstant_java_time_Instant_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE,
					oldTransitionDateWithInstant_java_time_Instant_AsReference,
					transitionDateWithInstant_java_time_Instant_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.TRANSITION_BUILDER_S3__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.TRANSITION_BUILDER_S3__IDENTIFIER,
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
					AwsworkbenchPackage.TRANSITION_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE:
			return getStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			return getTransitionDateWithInstant_java_time_Instant_AsReference();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE:
			setStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			setTransitionDateWithInstant_java_time_Instant_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
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
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE:
			setStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference(
					STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			setTransitionDateWithInstant_java_time_Instant_AsReference(
					TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
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
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE:
			return STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE_EDEFAULT == null
					? storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference != null
					: !STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE_EDEFAULT
							.equals(storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			return TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT == null
					? transitionDateWithInstant_java_time_Instant_AsReference != null
					: !TRANSITION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT
							.equals(transitionDateWithInstant_java_time_Instant_AsReference);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.TRANSITION_BUILDER_S3__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
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
		result.append(" (storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference: ");
		result.append(storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference);
		result.append(", transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", transitionDateWithInstant_java_time_Instant_AsReference: ");
		result.append(transitionDateWithInstant_java_time_Instant_AsReference);
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

} //TransitionBuilder_s3Impl
