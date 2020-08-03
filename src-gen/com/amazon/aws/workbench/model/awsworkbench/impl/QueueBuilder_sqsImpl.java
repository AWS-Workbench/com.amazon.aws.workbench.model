/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.QueueBuilder_sqs;
import com.amazon.aws.workbench.model.awsworkbench.QueueEncryption;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Builder sqs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getContentBasedDeduplication_java_lang_Boolean_ <em>Content Based Deduplication java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference <em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_ <em>Encryption software amazon awscdk services sqs Queue Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getFifo_java_lang_Boolean_ <em>Fifo java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getMaxMessageSizeBytes_java_lang_Number_ <em>Max Message Size Bytes java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getQueueName_java_lang_String_ <em>Queue Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.QueueBuilder_sqsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueBuilder_sqsImpl extends MinimalEObjectImpl.Container implements QueueBuilder_sqs {
	/**
	 * The default value of the '{@link #getContentBasedDeduplication_java_lang_Boolean_() <em>Content Based Deduplication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentBasedDeduplication_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentBasedDeduplication_java_lang_Boolean_() <em>Content Based Deduplication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentBasedDeduplication_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean contentBasedDeduplication_java_lang_Boolean_ = CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference = DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference() <em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference() <em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference = DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference = DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_() <em>Encryption software amazon awscdk services sqs Queue Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_()
	 * @generated
	 * @ordered
	 */
	protected static final QueueEncryption ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION__EDEFAULT = QueueEncryption.UNENCRYPTED;

	/**
	 * The cached value of the '{@link #getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_() <em>Encryption software amazon awscdk services sqs Queue Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_()
	 * @generated
	 * @ordered
	 */
	protected QueueEncryption encryption_software_amazon_awscdk_services_sqs_QueueEncryption_ = ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFifo_java_lang_Boolean_() <em>Fifo java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifo_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FIFO_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFifo_java_lang_Boolean_() <em>Fifo java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifo_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean fifo_java_lang_Boolean_ = FIFO_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMessageSizeBytes_java_lang_Number_() <em>Max Message Size Bytes java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSizeBytes_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMessageSizeBytes_java_lang_Number_() <em>Max Message Size Bytes java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSizeBytes_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxMessageSizeBytes_java_lang_Number_ = MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueName_java_lang_String_() <em>Queue Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName_java_lang_String_() <em>Queue Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String queueName_java_lang_String_ = QUEUE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.sqs.Queue";

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
	protected QueueBuilder_sqsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.QUEUE_BUILDER_SQS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getContentBasedDeduplication_java_lang_Boolean_() {
		return contentBasedDeduplication_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentBasedDeduplication_java_lang_Boolean_(
			Boolean newContentBasedDeduplication_java_lang_Boolean_) {
		Boolean oldContentBasedDeduplication_java_lang_Boolean_ = contentBasedDeduplication_java_lang_Boolean_;
		contentBasedDeduplication_java_lang_Boolean_ = newContentBasedDeduplication_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_,
					oldContentBasedDeduplication_java_lang_Boolean_, contentBasedDeduplication_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference = dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference = newDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference() {
		return deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(
			String newDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference) {
		String oldDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference = deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference;
		deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference = newDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE,
					oldDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference,
					deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference = deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference = newDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueEncryption getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_() {
		return encryption_software_amazon_awscdk_services_sqs_QueueEncryption_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_(
			QueueEncryption newEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_) {
		QueueEncryption oldEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_ = encryption_software_amazon_awscdk_services_sqs_QueueEncryption_;
		encryption_software_amazon_awscdk_services_sqs_QueueEncryption_ = newEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_ == null
				? ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION__EDEFAULT
				: newEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_,
					oldEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_,
					encryption_software_amazon_awscdk_services_sqs_QueueEncryption_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFifo_java_lang_Boolean_() {
		return fifo_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFifo_java_lang_Boolean_(Boolean newFifo_java_lang_Boolean_) {
		Boolean oldFifo_java_lang_Boolean_ = fifo_java_lang_Boolean_;
		fifo_java_lang_Boolean_ = newFifo_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_, oldFifo_java_lang_Boolean_,
					fifo_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxMessageSizeBytes_java_lang_Number_() {
		return maxMessageSizeBytes_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMessageSizeBytes_java_lang_Number_(int newMaxMessageSizeBytes_java_lang_Number_) {
		int oldMaxMessageSizeBytes_java_lang_Number_ = maxMessageSizeBytes_java_lang_Number_;
		maxMessageSizeBytes_java_lang_Number_ = newMaxMessageSizeBytes_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_,
					oldMaxMessageSizeBytes_java_lang_Number_, maxMessageSizeBytes_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueName_java_lang_String_() {
		return queueName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueName_java_lang_String_(String newQueueName_java_lang_String_) {
		String oldQueueName_java_lang_String_ = queueName_java_lang_String_;
		queueName_java_lang_String_ = newQueueName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_, oldQueueName_java_lang_String_,
					queueName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference = newReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference = newRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference = newVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.QUEUE_BUILDER_SQS__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.QUEUE_BUILDER_SQS__IDENTIFIER,
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
					AwsworkbenchPackage.QUEUE_BUILDER_SQS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_:
			return getContentBasedDeduplication_java_lang_Boolean_();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
			return getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_:
			return getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_:
			return getFifo_java_lang_Boolean_();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_:
			return getMaxMessageSizeBytes_java_lang_Number_();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_:
			return getQueueName_java_lang_String_();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_:
			setContentBasedDeduplication_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
			setDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_((QueueEncryption) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_:
			setFifo_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_:
			setMaxMessageSizeBytes_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_:
			setQueueName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_:
			setContentBasedDeduplication_java_lang_Boolean_(CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
			setDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(
					DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_(
					ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_:
			setFifo_java_lang_Boolean_(FIFO_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_:
			setMaxMessageSizeBytes_java_lang_Number_(MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_:
			setQueueName_java_lang_String_(QUEUE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_:
			return CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? contentBasedDeduplication_java_lang_Boolean_ != null
					: !CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(contentBasedDeduplication_java_lang_Boolean_);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
			return DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE_EDEFAULT == null
					? deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference != null
					: !DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE_EDEFAULT
							.equals(deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_:
			return encryption_software_amazon_awscdk_services_sqs_QueueEncryption_ != ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_:
			return FIFO_JAVA_LANG_BOOLEAN__EDEFAULT == null ? fifo_java_lang_Boolean_ != null
					: !FIFO_JAVA_LANG_BOOLEAN__EDEFAULT.equals(fifo_java_lang_Boolean_);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_:
			return maxMessageSizeBytes_java_lang_Number_ != MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_:
			return QUEUE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? queueName_java_lang_String_ != null
					: !QUEUE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(queueName_java_lang_String_);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
		result.append(" (contentBasedDeduplication_java_lang_Boolean_: ");
		result.append(contentBasedDeduplication_java_lang_Boolean_);
		result.append(", dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(
				", deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference: ");
		result.append(
				deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference);
		result.append(", deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", encryption_software_amazon_awscdk_services_sqs_QueueEncryption_: ");
		result.append(encryption_software_amazon_awscdk_services_sqs_QueueEncryption_);
		result.append(", encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(", fifo_java_lang_Boolean_: ");
		result.append(fifo_java_lang_Boolean_);
		result.append(", maxMessageSizeBytes_java_lang_Number_: ");
		result.append(maxMessageSizeBytes_java_lang_Number_);
		result.append(", queueName_java_lang_String_: ");
		result.append(queueName_java_lang_String_);
		result.append(", receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference);
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

} //QueueBuilder_sqsImpl
