/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb()
 * @model
 * @generated
 */
public interface TableBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @model
	 * @generated
	 */
	String getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 */
	void setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.BillingMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BillingMode
	 * @see #setBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(BillingMode)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.BillingMode"
	 * @generated
	 */
	BillingMode getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BillingMode
	 * @see #getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @generated
	 */
	void setBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(BillingMode value);

	/**
	 * Returns the value of the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.TableEncryption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption software amazon awscdk services dynamodb Table Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TableEncryption
	 * @see #setEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(TableEncryption)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.TableEncryption"
	 * @generated
	 */
	TableEncryption getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption software amazon awscdk services dynamodb Table Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.TableEncryption
	 * @see #getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @generated
	 */
	void setEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(TableEncryption value);

	/**
	 * Returns the value of the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point In Time Recovery java lang Boolean </em>' attribute.
	 * @see #setPointInTimeRecovery_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPointInTimeRecovery_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point In Time Recovery java lang Boolean </em>' attribute.
	 * @see #getPointInTimeRecovery_java_lang_Boolean_()
	 * @generated
	 */
	void setPointInTimeRecovery_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Capacity java lang Number </em>' attribute.
	 * @see #setReadCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_ReadCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getReadCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Capacity java lang Number </em>' attribute.
	 * @see #getReadCapacity_java_lang_Number_()
	 * @generated
	 */
	void setReadCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Replication Regions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication Regions java lang String As List</em>' attribute.
	 * @see #setReplicationRegions_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getReplicationRegions_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Regions java lang String As List</em>' attribute.
	 * @see #getReplicationRegions_java_lang_String_AsList()
	 * @generated
	 */
	void setReplicationRegions_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Side Encryption java lang Boolean </em>' attribute.
	 * @see #setServerSideEncryption_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getServerSideEncryption_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Side Encryption java lang Boolean </em>' attribute.
	 * @see #getServerSideEncryption_java_lang_Boolean_()
	 * @generated
	 */
	void setServerSideEncryption_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @model
	 * @generated
	 */
	String getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 */
	void setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.StreamViewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream software amazon awscdk services dynamodb Stream View Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StreamViewType
	 * @see #setStream_software_amazon_awscdk_services_dynamodb_StreamViewType_(StreamViewType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.StreamViewType"
	 * @generated
	 */
	StreamViewType getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream software amazon awscdk services dynamodb Stream View Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.StreamViewType
	 * @see #getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @generated
	 */
	void setStream_software_amazon_awscdk_services_dynamodb_StreamViewType_(StreamViewType value);

	/**
	 * Returns the value of the '<em><b>Time To Live Attribute java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Live Attribute java lang String </em>' attribute.
	 * @see #setTimeToLiveAttribute_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTimeToLiveAttribute_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Live Attribute java lang String </em>' attribute.
	 * @see #getTimeToLiveAttribute_java_lang_String_()
	 * @generated
	 */
	void setTimeToLiveAttribute_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Capacity java lang Number </em>' attribute.
	 * @see #setWriteCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_WriteCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getWriteCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Capacity java lang Number </em>' attribute.
	 * @see #getWriteCapacity_java_lang_Number_()
	 * @generated
	 */
	void setWriteCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Table Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name java lang String </em>' attribute.
	 * @see #setTableName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_TableName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTableName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name java lang String </em>' attribute.
	 * @see #getTableName_java_lang_String_()
	 * @generated
	 */
	void setTableName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.Table"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.Table" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getTableBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // TableBuilder_dynamodb
