/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BillingMode;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;
import com.amazon.aws.workbench.model.awsworkbench.StreamViewType;
import com.amazon.aws.workbench.model.awsworkbench.TableBuilder_dynamodb;
import com.amazon.aws.workbench.model.awsworkbench.TableEncryption;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getTableName_java_lang_String_ <em>Table Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TableBuilder_dynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableBuilder_dynamodbImpl extends MinimalEObjectImpl.Container implements TableBuilder_dynamodb {
	/**
	 * The default value of the '{@link #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @generated
	 * @ordered
	 */
	protected static final BillingMode BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE__EDEFAULT = BillingMode.PAY_PER_REQUEST;

	/**
	 * The cached value of the '{@link #getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @generated
	 * @ordered
	 */
	protected BillingMode billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ = BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @generated
	 * @ordered
	 */
	protected static final TableEncryption ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION__EDEFAULT = TableEncryption.DEFAULT;

	/**
	 * The cached value of the '{@link #getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @generated
	 * @ordered
	 */
	protected TableEncryption encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ = ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointInTimeRecovery_java_lang_Boolean_() <em>Point In Time Recovery java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInTimeRecovery_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointInTimeRecovery_java_lang_Boolean_() <em>Point In Time Recovery java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInTimeRecovery_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean pointInTimeRecovery_java_lang_Boolean_ = POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getReadCapacity_java_lang_Number_() <em>Read Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReadCapacity_java_lang_Number_() <em>Read Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int readCapacity_java_lang_Number_ = READ_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalPolicy REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT = RemovalPolicy.DESTROY;

	/**
	 * The cached value of the '{@link #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 * @ordered
	 */
	protected RemovalPolicy removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationRegions_java_lang_String_AsList() <em>Replication Regions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationRegions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationRegions_java_lang_String_AsList() <em>Replication Regions java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationRegions_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String replicationRegions_java_lang_String_AsList = REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerSideEncryption_java_lang_Boolean_() <em>Server Side Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerSideEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerSideEncryption_java_lang_Boolean_() <em>Server Side Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerSideEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean serverSideEncryption_java_lang_Boolean_ = SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_() <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @generated
	 * @ordered
	 */
	protected static final StreamViewType STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE__EDEFAULT = StreamViewType.NEW_IMAGE;

	/**
	 * The cached value of the '{@link #getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_() <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @generated
	 * @ordered
	 */
	protected StreamViewType stream_software_amazon_awscdk_services_dynamodb_StreamViewType_ = STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeToLiveAttribute_java_lang_String_() <em>Time To Live Attribute java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToLiveAttribute_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToLiveAttribute_java_lang_String_() <em>Time To Live Attribute java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToLiveAttribute_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String timeToLiveAttribute_java_lang_String_ = TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteCapacity_java_lang_Number_() <em>Write Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITE_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriteCapacity_java_lang_Number_() <em>Write Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteCapacity_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int writeCapacity_java_lang_Number_ = WRITE_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName_java_lang_String_() <em>Table Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName_java_lang_String_() <em>Table Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String tableName_java_lang_String_ = TABLE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.dynamodb.Table";

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
	protected TableBuilder_dynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.TABLE_BUILDER_DYNAMODB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
			String newPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference) {
		String oldPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
		partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = newPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
					oldPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference,
					partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingMode getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_() {
		return billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(
			BillingMode newBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_) {
		BillingMode oldBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ = billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_;
		billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ = newBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ == null
				? BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE__EDEFAULT
				: newBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_,
					oldBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_,
					billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableEncryption getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_() {
		return encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(
			TableEncryption newEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_) {
		TableEncryption oldEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ = encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_;
		encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ = newEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ == null
				? ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION__EDEFAULT
				: newEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_,
					oldEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_,
					encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPointInTimeRecovery_java_lang_Boolean_() {
		return pointInTimeRecovery_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointInTimeRecovery_java_lang_Boolean_(Boolean newPointInTimeRecovery_java_lang_Boolean_) {
		Boolean oldPointInTimeRecovery_java_lang_Boolean_ = pointInTimeRecovery_java_lang_Boolean_;
		pointInTimeRecovery_java_lang_Boolean_ = newPointInTimeRecovery_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_,
					oldPointInTimeRecovery_java_lang_Boolean_, pointInTimeRecovery_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReadCapacity_java_lang_Number_() {
		return readCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadCapacity_java_lang_Number_(int newReadCapacity_java_lang_Number_) {
		int oldReadCapacity_java_lang_Number_ = readCapacity_java_lang_Number_;
		readCapacity_java_lang_Number_ = newReadCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_,
					oldReadCapacity_java_lang_Number_, readCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_() {
		return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
			RemovalPolicy newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_) {
		RemovalPolicy oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = removalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ = newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ == null
				? REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT
				: newRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReplicationRegions_java_lang_String_AsList() {
		return replicationRegions_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationRegions_java_lang_String_AsList(String newReplicationRegions_java_lang_String_AsList) {
		String oldReplicationRegions_java_lang_String_AsList = replicationRegions_java_lang_String_AsList;
		replicationRegions_java_lang_String_AsList = newReplicationRegions_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST,
					oldReplicationRegions_java_lang_String_AsList, replicationRegions_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getServerSideEncryption_java_lang_Boolean_() {
		return serverSideEncryption_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerSideEncryption_java_lang_Boolean_(Boolean newServerSideEncryption_java_lang_Boolean_) {
		Boolean oldServerSideEncryption_java_lang_Boolean_ = serverSideEncryption_java_lang_Boolean_;
		serverSideEncryption_java_lang_Boolean_ = newServerSideEncryption_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_,
					oldServerSideEncryption_java_lang_Boolean_, serverSideEncryption_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference() {
		return sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
			String newSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference) {
		String oldSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
		sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference = newSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
					oldSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference,
					sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamViewType getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_() {
		return stream_software_amazon_awscdk_services_dynamodb_StreamViewType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStream_software_amazon_awscdk_services_dynamodb_StreamViewType_(
			StreamViewType newStream_software_amazon_awscdk_services_dynamodb_StreamViewType_) {
		StreamViewType oldStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ = stream_software_amazon_awscdk_services_dynamodb_StreamViewType_;
		stream_software_amazon_awscdk_services_dynamodb_StreamViewType_ = newStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ == null
				? STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE__EDEFAULT
				: newStream_software_amazon_awscdk_services_dynamodb_StreamViewType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_,
					oldStream_software_amazon_awscdk_services_dynamodb_StreamViewType_,
					stream_software_amazon_awscdk_services_dynamodb_StreamViewType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeToLiveAttribute_java_lang_String_() {
		return timeToLiveAttribute_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeToLiveAttribute_java_lang_String_(String newTimeToLiveAttribute_java_lang_String_) {
		String oldTimeToLiveAttribute_java_lang_String_ = timeToLiveAttribute_java_lang_String_;
		timeToLiveAttribute_java_lang_String_ = newTimeToLiveAttribute_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_,
					oldTimeToLiveAttribute_java_lang_String_, timeToLiveAttribute_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWriteCapacity_java_lang_Number_() {
		return writeCapacity_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteCapacity_java_lang_Number_(int newWriteCapacity_java_lang_Number_) {
		int oldWriteCapacity_java_lang_Number_ = writeCapacity_java_lang_Number_;
		writeCapacity_java_lang_Number_ = newWriteCapacity_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_,
					oldWriteCapacity_java_lang_Number_, writeCapacity_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName_java_lang_String_() {
		return tableName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName_java_lang_String_(String newTableName_java_lang_String_) {
		String oldTableName_java_lang_String_ = tableName_java_lang_String_;
		tableName_java_lang_String_ = newTableName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_,
					oldTableName_java_lang_String_, tableName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_:
			return getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_:
			return getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_:
			return getPointInTimeRecovery_java_lang_Boolean_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
			return getReadCapacity_java_lang_Number_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST:
			return getReplicationRegions_java_lang_String_AsList();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return getServerSideEncryption_java_lang_Boolean_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_:
			return getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_:
			return getTimeToLiveAttribute_java_lang_String_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
			return getWriteCapacity_java_lang_Number_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			return getTableName_java_lang_String_();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_:
			setBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_((BillingMode) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_((TableEncryption) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_:
			setPointInTimeRecovery_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
			setReadCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST:
			setReplicationRegions_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setServerSideEncryption_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_:
			setStream_software_amazon_awscdk_services_dynamodb_StreamViewType_((StreamViewType) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_:
			setTimeToLiveAttribute_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
			setWriteCapacity_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			setTableName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
					PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_:
			setBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_(
					BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_:
			setEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_(
					ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_:
			setPointInTimeRecovery_java_lang_Boolean_(POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
			setReadCapacity_java_lang_Number_(READ_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST:
			setReplicationRegions_java_lang_String_AsList(REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setServerSideEncryption_java_lang_Boolean_(SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
					SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_:
			setStream_software_amazon_awscdk_services_dynamodb_StreamViewType_(
					STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_:
			setTimeToLiveAttribute_java_lang_String_(TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
			setWriteCapacity_java_lang_Number_(WRITE_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			setTableName_java_lang_String_(TABLE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT == null
					? partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference != null
					: !PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT
							.equals(partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_:
			return billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ != BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_:
			return encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ != ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_:
			return POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? pointInTimeRecovery_java_lang_Boolean_ != null
					: !POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(pointInTimeRecovery_java_lang_Boolean_);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
			return readCapacity_java_lang_Number_ != READ_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST:
			return REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? replicationRegions_java_lang_String_AsList != null
					: !REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(replicationRegions_java_lang_String_AsList);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? serverSideEncryption_java_lang_Boolean_ != null
					: !SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(serverSideEncryption_java_lang_Boolean_);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT == null
					? sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference != null
					: !SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT
							.equals(sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_:
			return stream_software_amazon_awscdk_services_dynamodb_StreamViewType_ != STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_:
			return TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING__EDEFAULT == null
					? timeToLiveAttribute_java_lang_String_ != null
					: !TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING__EDEFAULT.equals(timeToLiveAttribute_java_lang_String_);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
			return writeCapacity_java_lang_Number_ != WRITE_CAPACITY_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			return TABLE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? tableName_java_lang_String_ != null
					: !TABLE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(tableName_java_lang_String_);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		result.append(" (partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference: ");
		result.append(partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		result.append(", billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_: ");
		result.append(billingMode_software_amazon_awscdk_services_dynamodb_BillingMode_);
		result.append(", encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_: ");
		result.append(encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_);
		result.append(", encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(", pointInTimeRecovery_java_lang_Boolean_: ");
		result.append(pointInTimeRecovery_java_lang_Boolean_);
		result.append(", readCapacity_java_lang_Number_: ");
		result.append(readCapacity_java_lang_Number_);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", replicationRegions_java_lang_String_AsList: ");
		result.append(replicationRegions_java_lang_String_AsList);
		result.append(", serverSideEncryption_java_lang_Boolean_: ");
		result.append(serverSideEncryption_java_lang_Boolean_);
		result.append(", sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference: ");
		result.append(sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		result.append(", stream_software_amazon_awscdk_services_dynamodb_StreamViewType_: ");
		result.append(stream_software_amazon_awscdk_services_dynamodb_StreamViewType_);
		result.append(", timeToLiveAttribute_java_lang_String_: ");
		result.append(timeToLiveAttribute_java_lang_String_);
		result.append(", writeCapacity_java_lang_Number_: ");
		result.append(writeCapacity_java_lang_Number_);
		result.append(", tableName_java_lang_String_: ");
		result.append(tableName_java_lang_String_);
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

} //TableBuilder_dynamodbImpl
