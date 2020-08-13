/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dead Letter Queue Builder sqs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs()
 * @model
 * @generated
 */
public interface DeadLetterQueueBuilder_sqs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Max Receive Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #setMaxReceiveCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_MaxReceiveCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxReceiveCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 */
	void setMaxReceiveCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_QueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @model
	 * @generated
	 */
	String getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 */
	void setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.sqs.DeadLetterQueue"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.sqs.DeadLetterQueue" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDeadLetterQueueBuilder_sqs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DeadLetterQueueBuilder_sqs
