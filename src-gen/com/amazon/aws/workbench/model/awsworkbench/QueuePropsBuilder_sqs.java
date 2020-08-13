/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Props Builder sqs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getContentBasedDeduplication_java_lang_Boolean_ <em>Content Based Deduplication java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference <em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_ <em>Encryption software amazon awscdk services sqs Queue Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getFifo_java_lang_Boolean_ <em>Fifo java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getMaxMessageSizeBytes_java_lang_Number_ <em>Max Message Size Bytes java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getQueueName_java_lang_String_ <em>Queue Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs()
 * @model
 * @generated
 */
public interface QueuePropsBuilder_sqs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Content Based Deduplication java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Based Deduplication java lang Boolean </em>' attribute.
	 * @see #setContentBasedDeduplication_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_ContentBasedDeduplication_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getContentBasedDeduplication_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getContentBasedDeduplication_java_lang_Boolean_ <em>Content Based Deduplication java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Based Deduplication java lang Boolean </em>' attribute.
	 * @see #getContentBasedDeduplication_java_lang_Boolean_()
	 * @generated
	 */
	void setContentBasedDeduplication_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_DataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Key Reuse With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>' attribute.
	 * @see #setDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_DeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference()
	 * @model
	 * @generated
	 */
	String getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference <em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference</em>' attribute.
	 * @see #getDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference()
	 * @generated
	 */
	void setDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Delivery Delay With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_DeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Delay With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Encryption software amazon awscdk services sqs Queue Encryption </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.QueueEncryption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption software amazon awscdk services sqs Queue Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueueEncryption
	 * @see #setEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_(QueueEncryption)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_Encryption_software_amazon_awscdk_services_sqs_QueueEncryption_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.QueueEncryption"
	 * @generated
	 */
	QueueEncryption getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_ <em>Encryption software amazon awscdk services sqs Queue Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption software amazon awscdk services sqs Queue Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.QueueEncryption
	 * @see #getEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_()
	 * @generated
	 */
	void setEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_(QueueEncryption value);

	/**
	 * Returns the value of the '<em><b>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_EncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Fifo java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fifo java lang Boolean </em>' attribute.
	 * @see #setFifo_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_Fifo_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getFifo_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getFifo_java_lang_Boolean_ <em>Fifo java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifo java lang Boolean </em>' attribute.
	 * @see #getFifo_java_lang_Boolean_()
	 * @generated
	 */
	void setFifo_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Message Size Bytes java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Message Size Bytes java lang Number </em>' attribute.
	 * @see #setMaxMessageSizeBytes_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_MaxMessageSizeBytes_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxMessageSizeBytes_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getMaxMessageSizeBytes_java_lang_Number_ <em>Max Message Size Bytes java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Size Bytes java lang Number </em>' attribute.
	 * @see #getMaxMessageSizeBytes_java_lang_Number_()
	 * @generated
	 */
	void setMaxMessageSizeBytes_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Queue Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Name java lang String </em>' attribute.
	 * @see #setQueueName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_QueueName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getQueueName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getQueueName_java_lang_String_ <em>Queue Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Name java lang String </em>' attribute.
	 * @see #getQueueName_java_lang_String_()
	 * @generated
	 */
	void setQueueName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_ReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Retention Period With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_RetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_VisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.sqs.QueueProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.sqs.QueueProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueuePropsBuilder_sqs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // QueuePropsBuilder_sqs
