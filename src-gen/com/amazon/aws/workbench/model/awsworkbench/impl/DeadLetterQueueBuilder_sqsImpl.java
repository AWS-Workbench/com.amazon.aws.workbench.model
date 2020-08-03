/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dead Letter Queue Builder sqs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DeadLetterQueueBuilder_sqsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeadLetterQueueBuilder_sqsImpl extends MinimalEObjectImpl.Container implements DeadLetterQueueBuilder_sqs {
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
	 * The default value of the '{@link #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.sqs.DeadLetterQueue";

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
	protected DeadLetterQueueBuilder_sqsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS;
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
					AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
					oldMaxReceiveCount_java_lang_Number_, maxReceiveCount_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference() {
		return queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
			String newQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference) {
		String oldQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference = newQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
					oldQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference,
					queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference));
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
					AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return getMaxReceiveCount_java_lang_Number_();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			setMaxReceiveCount_java_lang_Number_(MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(
					QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
			return maxReceiveCount_java_lang_Number_ != MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
			return QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT == null
					? queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference != null
					: !QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE_EDEFAULT
							.equals(queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		result.append(" (maxReceiveCount_java_lang_Number_: ");
		result.append(maxReceiveCount_java_lang_Number_);
		result.append(", queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference: ");
		result.append(queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference);
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

} //DeadLetterQueueBuilder_sqsImpl
