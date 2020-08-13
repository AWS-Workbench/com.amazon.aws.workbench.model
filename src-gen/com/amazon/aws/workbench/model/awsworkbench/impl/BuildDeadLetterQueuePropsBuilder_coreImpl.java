/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BuildDeadLetterQueuePropsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Dead Letter Queue Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference <em>Dead Letter Queue With Queue software amazon awscdk services sqs Queue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildDeadLetterQueuePropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildDeadLetterQueuePropsBuilder_coreImpl extends ServiceResourcesImpl
		implements BuildDeadLetterQueuePropsBuilder_core {
	/**
	 * The default value of the '{@link #getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() <em>Dead Letter Queue With Queue software amazon awscdk services sqs Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() <em>Dead Letter Queue With Queue software amazon awscdk services sqs Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxReceiveCount_java_lang_Number_() <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxReceiveCount_java_lang_Number_ = MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.core.BuildDeadLetterQueueProps";

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
	protected BuildDeadLetterQueuePropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference() {
		return deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(
			String newDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference) {
		String oldDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
		deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference = newDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE,
					oldDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference,
					deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxReceiveCount_java_lang_Number_() {
		return maxReceiveCount_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReceiveCount_java_lang_Number_(int newMaxReceiveCount_java_lang_Number_) {
		int oldMaxReceiveCount_java_lang_Number_ = maxReceiveCount_java_lang_Number_;
		maxReceiveCount_java_lang_Number_ = newMaxReceiveCount_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
					oldMaxReceiveCount_java_lang_Number_, maxReceiveCount_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			return getDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return getMaxReceiveCount_java_lang_Number_();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			setDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			setDeadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference(
					DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_(MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
			return DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT == null
					? deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference != null
					: !DEAD_LETTER_QUEUE_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE_EDEFAULT
							.equals(deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference);
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return maxReceiveCount_java_lang_Number_ != MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BUILD_DEAD_LETTER_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference: ");
		result.append(deadLetterQueueWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference);
		result.append(", maxReceiveCount_java_lang_Number_: ");
		result.append(maxReceiveCount_java_lang_Number_);
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

} //BuildDeadLetterQueuePropsBuilder_coreImpl
