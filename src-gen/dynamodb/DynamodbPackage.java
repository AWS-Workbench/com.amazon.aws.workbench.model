/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dynamodb.DynamodbFactory
 * @model kind="package"
 * @generated
 */
public interface DynamodbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamodb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AWSWorkbenchSources/default.software.amazon.awscdk.services.dynamodb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamodb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamodbPackage eINSTANCE = dynamodb.impl.DynamodbPackageImpl.init();

	/**
	 * The meta object id for the '{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl <em>Local Secondary Index Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = 0;

	/**
	 * The feature id for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Index Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Local Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Local Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl <em>Enable Scaling Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB = 1;

	/**
	 * The feature id for the '<em><b>Max Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Min Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Enable Scaling Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Enable Scaling Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_SCALING_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.TablePropsBuilder_dynamodbImpl <em>Table Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.TablePropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB = 2;

	/**
	 * The feature id for the '<em><b>Table Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = 2;

	/**
	 * The feature id for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = 3;

	/**
	 * The feature id for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = 5;

	/**
	 * The feature id for the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = 6;

	/**
	 * The feature id for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 7;

	/**
	 * The feature id for the '<em><b>Replication Regions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = 8;

	/**
	 * The feature id for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = 9;

	/**
	 * The feature id for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = 11;

	/**
	 * The feature id for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = 12;

	/**
	 * The feature id for the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = 13;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 14;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 16;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 17;

	/**
	 * The number of structural features of the '<em>Table Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Table Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.TableBuilder_dynamodbImpl <em>Table Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.TableBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getTableBuilder_dynamodb()
	 * @generated
	 */
	int TABLE_BUILDER_DYNAMODB = 3;

	/**
	 * The feature id for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = 1;

	/**
	 * The feature id for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = 2;

	/**
	 * The feature id for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = 5;

	/**
	 * The feature id for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 6;

	/**
	 * The feature id for the '<em><b>Replication Regions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = 8;

	/**
	 * The feature id for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = 10;

	/**
	 * The feature id for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = 11;

	/**
	 * The feature id for the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = 12;

	/**
	 * The feature id for the '<em><b>Table Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = 13;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 14;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__VAR_NAME = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__IDENTIFIER = 16;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE = 17;

	/**
	 * The number of structural features of the '<em>Table Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Table Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.GlobalSecondaryIndexPropsBuilder_dynamodbImpl <em>Global Secondary Index Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.GlobalSecondaryIndexPropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = 4;

	/**
	 * The feature id for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Index Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Global Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Global Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.TableOptionsBuilder_dynamodbImpl <em>Table Options Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.TableOptionsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB = 5;

	/**
	 * The feature id for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = 1;

	/**
	 * The feature id for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = 2;

	/**
	 * The feature id for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = 5;

	/**
	 * The feature id for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 6;

	/**
	 * The feature id for the '<em><b>Replication Regions java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = 8;

	/**
	 * The feature id for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = 10;

	/**
	 * The feature id for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = 11;

	/**
	 * The feature id for the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = 12;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 13;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__VAR_NAME = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 16;

	/**
	 * The number of structural features of the '<em>Table Options Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Table Options Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPTIONS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.SecondaryIndexPropsBuilder_dynamodbImpl <em>Secondary Index Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.SecondaryIndexPropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = 6;

	/**
	 * The feature id for the '<em><b>Index Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Secondary Index Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl <em>Utilization Scaling Props Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB = 7;

	/**
	 * The feature id for the '<em><b>Target Utilization Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Disable Scale In java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Utilization Scaling Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Utilization Scaling Props Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.AttributeBuilder_dynamodbImpl <em>Attribute Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.AttributeBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getAttributeBuilder_dynamodb()
	 * @generated
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB = 8;

	/**
	 * The feature id for the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Type software amazon awscdk services dynamodb Attribute Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl <em>Table Attributes Builder dynamodb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.impl.TableAttributesBuilder_dynamodbImpl
	 * @see dynamodb.impl.DynamodbPackageImpl#getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB = 9;

	/**
	 * The feature id for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Global Indexes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Local Indexes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Table Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Table Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Table Stream Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Table Attributes Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Table Attributes Builder dynamodb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ATTRIBUTES_BUILDER_DYNAMODB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamodb.StreamViewType <em>Stream View Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.StreamViewType
	 * @see dynamodb.impl.DynamodbPackageImpl#getStreamViewType()
	 * @generated
	 */
	int STREAM_VIEW_TYPE = 10;

	/**
	 * The meta object id for the '{@link dynamodb.TableEncryption <em>Table Encryption</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.TableEncryption
	 * @see dynamodb.impl.DynamodbPackageImpl#getTableEncryption()
	 * @generated
	 */
	int TABLE_ENCRYPTION = 11;

	/**
	 * The meta object id for the '{@link dynamodb.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.AttributeType
	 * @see dynamodb.impl.DynamodbPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 12;

	/**
	 * The meta object id for the '{@link dynamodb.ProjectionType <em>Projection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.ProjectionType
	 * @see dynamodb.impl.DynamodbPackageImpl#getProjectionType()
	 * @generated
	 */
	int PROJECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link dynamodb.BillingMode <em>Billing Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamodb.BillingMode
	 * @see dynamodb.impl.DynamodbPackageImpl#getBillingMode()
	 * @generated
	 */
	int BILLING_MODE = 14;

	/**
	 * Returns the meta object for class '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb <em>Local Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Secondary Index Props Builder dynamodb</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	EClass getLocalSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name java lang String </em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Key Attributes java lang String As List</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection Type software amazon awscdk services dynamodb Projection Type </em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getVarName()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getIdentifier()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getLocalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getLocalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.EnableScalingPropsBuilder_dynamodb <em>Enable Scaling Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Scaling Props Builder dynamodb</em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb
	 * @generated
	 */
	EClass getEnableScalingPropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Capacity java lang Number </em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getMaxCapacity_java_lang_Number_()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_MaxCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Capacity java lang Number </em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getMinCapacity_java_lang_Number_()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_MinCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getVarName()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getIdentifier()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.EnableScalingPropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getEnableScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getEnableScalingPropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.TablePropsBuilder_dynamodb <em>Table Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Props Builder dynamodb</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb
	 * @generated
	 */
	EClass getTablePropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name java lang String </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getTableName_java_lang_String_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_TableName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption software amazon awscdk services dynamodb Table Encryption </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point In Time Recovery java lang Boolean </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Capacity java lang Number </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getReadCapacity_java_lang_Number_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Policy software amazon awscdk core Removal Policy </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Regions java lang String As List</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Side Encryption java lang Boolean </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream software amazon awscdk services dynamodb Stream View Type </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Live Attribute java lang String </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Capacity java lang Number </em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getVarName()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getIdentifier()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TablePropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.TablePropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getTablePropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTablePropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.TableBuilder_dynamodb <em>Table Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Builder dynamodb</em>'.
	 * @see dynamodb.TableBuilder_dynamodb
	 * @generated
	 */
	EClass getTableBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption software amazon awscdk services dynamodb Table Encryption </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point In Time Recovery java lang Boolean </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Capacity java lang Number </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getReadCapacity_java_lang_Number_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_ReadCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Policy software amazon awscdk core Removal Policy </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Regions java lang String As List</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Side Encryption java lang Boolean </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream software amazon awscdk services dynamodb Stream View Type </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Live Attribute java lang String </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Capacity java lang Number </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getWriteCapacity_java_lang_Number_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_WriteCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name java lang String </em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getTableName_java_lang_String_()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_TableName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getGeneratedClassName()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getVarName()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getIdentifier()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.TableBuilder_dynamodb#getAdditionalCode()
	 * @see #getTableBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb <em>Global Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Secondary Index Props Builder dynamodb</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	EClass getGlobalSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Capacity java lang Number </em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getReadCapacity_java_lang_Number_()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Capacity java lang Number </em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name java lang String </em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Key Attributes java lang String As List</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection Type software amazon awscdk services dynamodb Projection Type </em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getVarName()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIdentifier()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getGlobalSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getGlobalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.TableOptionsBuilder_dynamodb <em>Table Options Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Options Builder dynamodb</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb
	 * @generated
	 */
	EClass getTableOptionsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_ <em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Mode software amazon awscdk services dynamodb Billing Mode </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_ <em>Encryption software amazon awscdk services dynamodb Table Encryption </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption software amazon awscdk services dynamodb Table Encryption </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_ <em>Point In Time Recovery java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point In Time Recovery java lang Boolean </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getPointInTimeRecovery_java_lang_Boolean_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Capacity java lang Number </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getReadCapacity_java_lang_Number_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Policy software amazon awscdk core Removal Policy </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList <em>Replication Regions java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Regions java lang String As List</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getReplicationRegions_java_lang_String_AsList()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_ <em>Server Side Encryption java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Side Encryption java lang Boolean </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getServerSideEncryption_java_lang_Boolean_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_ <em>Stream software amazon awscdk services dynamodb Stream View Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream software amazon awscdk services dynamodb Stream View Type </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getStream_software_amazon_awscdk_services_dynamodb_StreamViewType_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_ <em>Time To Live Attribute java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Live Attribute java lang String </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getTimeToLiveAttribute_java_lang_String_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Capacity java lang Number </em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getWriteCapacity_java_lang_Number_()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getVarName()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getIdentifier()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableOptionsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.TableOptionsBuilder_dynamodb#getAdditionalCode()
	 * @see #getTableOptionsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableOptionsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb <em>Secondary Index Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Index Props Builder dynamodb</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb
	 * @generated
	 */
	EClass getSecondaryIndexPropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name java lang String </em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Key Attributes java lang String As List</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection Type software amazon awscdk services dynamodb Projection Type </em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getVarName()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIdentifier()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.SecondaryIndexPropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getSecondaryIndexPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb <em>Utilization Scaling Props Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilization Scaling Props Builder dynamodb</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb
	 * @generated
	 */
	EClass getUtilizationScalingPropsBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getTargetUtilizationPercent_java_lang_Number_ <em>Target Utilization Percent java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Utilization Percent java lang Number </em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getTargetUtilizationPercent_java_lang_Number_()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_TargetUtilizationPercent_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getDisableScaleIn_java_lang_Boolean_ <em>Disable Scale In java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Scale In java lang Boolean </em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getDisableScaleIn_java_lang_Boolean_()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_DisableScaleIn_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name java lang String </em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getPolicyName_java_lang_String_()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_PolicyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_ScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_ScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getGeneratedClassName()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getVarName()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getIdentifier()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.UtilizationScalingPropsBuilder_dynamodb#getAdditionalCode()
	 * @see #getUtilizationScalingPropsBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getUtilizationScalingPropsBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.AttributeBuilder_dynamodb <em>Attribute Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Builder dynamodb</em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb
	 * @generated
	 */
	EClass getAttributeBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getName_java_lang_String_ <em>Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name java lang String </em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getName_java_lang_String_()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_Name_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getType_software_amazon_awscdk_services_dynamodb_AttributeType_ <em>Type software amazon awscdk services dynamodb Attribute Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type software amazon awscdk services dynamodb Attribute Type </em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getType_software_amazon_awscdk_services_dynamodb_AttributeType_()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getGeneratedClassName()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getVarName()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getIdentifier()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.AttributeBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.AttributeBuilder_dynamodb#getAdditionalCode()
	 * @see #getAttributeBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getAttributeBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link dynamodb.TableAttributesBuilder_dynamodb <em>Table Attributes Builder dynamodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Attributes Builder dynamodb</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb
	 * @generated
	 */
	EClass getTableAttributesBuilder_dynamodb();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getGlobalIndexes_java_lang_String_AsList <em>Global Indexes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Indexes java lang String As List</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getGlobalIndexes_java_lang_String_AsList()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_GlobalIndexes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getLocalIndexes_java_lang_String_AsList <em>Local Indexes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Indexes java lang String As List</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getLocalIndexes_java_lang_String_AsList()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_LocalIndexes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableArn_java_lang_String_ <em>Table Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Arn java lang String </em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getTableArn_java_lang_String_()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_TableArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name java lang String </em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getTableName_java_lang_String_()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_TableName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableStreamArn_java_lang_String_ <em>Table Stream Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Stream Arn java lang String </em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getTableStreamArn_java_lang_String_()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_TableStreamArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getGeneratedClassName()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getVarName()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_VarName();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getIdentifier()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dynamodb.TableAttributesBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see dynamodb.TableAttributesBuilder_dynamodb#getAdditionalCode()
	 * @see #getTableAttributesBuilder_dynamodb()
	 * @generated
	 */
	EAttribute getTableAttributesBuilder_dynamodb_AdditionalCode();

	/**
	 * Returns the meta object for enum '{@link dynamodb.StreamViewType <em>Stream View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stream View Type</em>'.
	 * @see dynamodb.StreamViewType
	 * @generated
	 */
	EEnum getStreamViewType();

	/**
	 * Returns the meta object for enum '{@link dynamodb.TableEncryption <em>Table Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Encryption</em>'.
	 * @see dynamodb.TableEncryption
	 * @generated
	 */
	EEnum getTableEncryption();

	/**
	 * Returns the meta object for enum '{@link dynamodb.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see dynamodb.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link dynamodb.ProjectionType <em>Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Projection Type</em>'.
	 * @see dynamodb.ProjectionType
	 * @generated
	 */
	EEnum getProjectionType();

	/**
	 * Returns the meta object for enum '{@link dynamodb.BillingMode <em>Billing Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Billing Mode</em>'.
	 * @see dynamodb.BillingMode
	 * @generated
	 */
	EEnum getBillingMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamodbFactory getDynamodbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl <em>Local Secondary Index Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getLocalSecondaryIndexPropsBuilder_dynamodb()
		 * @generated
		 */
		EClass LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = eINSTANCE.getLocalSecondaryIndexPropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Index Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getLocalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl <em>Enable Scaling Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.EnableScalingPropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getEnableScalingPropsBuilder_dynamodb()
		 * @generated
		 */
		EClass ENABLE_SCALING_PROPS_BUILDER_DYNAMODB = eINSTANCE.getEnableScalingPropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Max Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_MaxCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Min Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_MinCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getEnableScalingPropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.TablePropsBuilder_dynamodbImpl <em>Table Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.TablePropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getTablePropsBuilder_dynamodb()
		 * @generated
		 */
		EClass TABLE_PROPS_BUILDER_DYNAMODB = eINSTANCE.getTablePropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Table Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_TableName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTablePropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

		/**
		 * The meta object literal for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

		/**
		 * The meta object literal for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = eINSTANCE
				.getTablePropsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

		/**
		 * The meta object literal for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Read Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Replication Regions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTablePropsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTablePropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

		/**
		 * The meta object literal for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Write Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTablePropsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getTablePropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE.getTablePropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE.getTablePropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getTablePropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.TableBuilder_dynamodbImpl <em>Table Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.TableBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getTableBuilder_dynamodb()
		 * @generated
		 */
		EClass TABLE_BUILDER_DYNAMODB = eINSTANCE.getTableBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTableBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = eINSTANCE
				.getTableBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

		/**
		 * The meta object literal for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = eINSTANCE
				.getTableBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

		/**
		 * The meta object literal for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = eINSTANCE
				.getTableBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

		/**
		 * The meta object literal for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTableBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Read Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTableBuilder_dynamodb_ReadCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getTableBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Replication Regions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTableBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTableBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTableBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = eINSTANCE
				.getTableBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

		/**
		 * The meta object literal for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = eINSTANCE
				.getTableBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Write Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTableBuilder_dynamodb_WriteCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Table Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getTableBuilder_dynamodb_TableName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getTableBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE.getTableBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE.getTableBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE.getTableBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.GlobalSecondaryIndexPropsBuilder_dynamodbImpl <em>Global Secondary Index Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.GlobalSecondaryIndexPropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getGlobalSecondaryIndexPropsBuilder_dynamodb()
		 * @generated
		 */
		EClass GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = eINSTANCE.getGlobalSecondaryIndexPropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Read Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Write Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Index Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getGlobalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.TableOptionsBuilder_dynamodbImpl <em>Table Options Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.TableOptionsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getTableOptionsBuilder_dynamodb()
		 * @generated
		 */
		EClass TABLE_OPTIONS_BUILDER_DYNAMODB = eINSTANCE.getTableOptionsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTableOptionsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Billing Mode software amazon awscdk services dynamodb Billing Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_BillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_();

		/**
		 * The meta object literal for the '<em><b>Encryption software amazon awscdk services dynamodb Table Encryption </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_Encryption_software_amazon_awscdk_services_dynamodb_TableEncryption_();

		/**
		 * The meta object literal for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = eINSTANCE
				.getTableOptionsBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

		/**
		 * The meta object literal for the '<em><b>Point In Time Recovery java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_PointInTimeRecovery_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Read Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_ReadCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Replication Regions java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTableOptionsBuilder_dynamodb_ReplicationRegions_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Server Side Encryption java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_ServerSideEncryption_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE = eINSTANCE
				.getTableOptionsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stream software amazon awscdk services dynamodb Stream View Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_Stream_software_amazon_awscdk_services_dynamodb_StreamViewType_();

		/**
		 * The meta object literal for the '<em><b>Time To Live Attribute java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_TimeToLiveAttribute_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Write Capacity java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTableOptionsBuilder_dynamodb_WriteCapacity_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getTableOptionsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE.getTableOptionsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE.getTableOptionsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OPTIONS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getTableOptionsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.SecondaryIndexPropsBuilder_dynamodbImpl <em>Secondary Index Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.SecondaryIndexPropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getSecondaryIndexPropsBuilder_dynamodb()
		 * @generated
		 */
		EClass SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB = eINSTANCE.getSecondaryIndexPropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Index Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_ = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getSecondaryIndexPropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl <em>Utilization Scaling Props Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.UtilizationScalingPropsBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getUtilizationScalingPropsBuilder_dynamodb()
		 * @generated
		 */
		EClass UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB = eINSTANCE.getUtilizationScalingPropsBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Target Utilization Percent java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_TargetUtilizationPercent_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Disable Scale In java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_DisableScaleIn_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Policy Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_PolicyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_ScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_ScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getUtilizationScalingPropsBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.AttributeBuilder_dynamodbImpl <em>Attribute Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.AttributeBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getAttributeBuilder_dynamodb()
		 * @generated
		 */
		EClass ATTRIBUTE_BUILDER_DYNAMODB = eINSTANCE.getAttributeBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getAttributeBuilder_dynamodb_Name_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Type software amazon awscdk services dynamodb Attribute Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_TYPE_ = eINSTANCE
				.getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getAttributeBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE.getAttributeBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE.getAttributeBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getAttributeBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl <em>Table Attributes Builder dynamodb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.impl.TableAttributesBuilder_dynamodbImpl
		 * @see dynamodb.impl.DynamodbPackageImpl#getTableAttributesBuilder_dynamodb()
		 * @generated
		 */
		EClass TABLE_ATTRIBUTES_BUILDER_DYNAMODB = eINSTANCE.getTableAttributesBuilder_dynamodb();

		/**
		 * The meta object literal for the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE = eINSTANCE
				.getTableAttributesBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

		/**
		 * The meta object literal for the '<em><b>Global Indexes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTableAttributesBuilder_dynamodb_GlobalIndexes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Local Indexes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTableAttributesBuilder_dynamodb_LocalIndexes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Table Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getTableAttributesBuilder_dynamodb_TableArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Table Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getTableAttributesBuilder_dynamodb_TableName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Table Stream Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getTableAttributesBuilder_dynamodb_TableStreamArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME = eINSTANCE
				.getTableAttributesBuilder_dynamodb_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME = eINSTANCE.getTableAttributesBuilder_dynamodb_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER = eINSTANCE
				.getTableAttributesBuilder_dynamodb_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE = eINSTANCE
				.getTableAttributesBuilder_dynamodb_AdditionalCode();

		/**
		 * The meta object literal for the '{@link dynamodb.StreamViewType <em>Stream View Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.StreamViewType
		 * @see dynamodb.impl.DynamodbPackageImpl#getStreamViewType()
		 * @generated
		 */
		EEnum STREAM_VIEW_TYPE = eINSTANCE.getStreamViewType();

		/**
		 * The meta object literal for the '{@link dynamodb.TableEncryption <em>Table Encryption</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.TableEncryption
		 * @see dynamodb.impl.DynamodbPackageImpl#getTableEncryption()
		 * @generated
		 */
		EEnum TABLE_ENCRYPTION = eINSTANCE.getTableEncryption();

		/**
		 * The meta object literal for the '{@link dynamodb.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.AttributeType
		 * @see dynamodb.impl.DynamodbPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link dynamodb.ProjectionType <em>Projection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.ProjectionType
		 * @see dynamodb.impl.DynamodbPackageImpl#getProjectionType()
		 * @generated
		 */
		EEnum PROJECTION_TYPE = eINSTANCE.getProjectionType();

		/**
		 * The meta object literal for the '{@link dynamodb.BillingMode <em>Billing Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamodb.BillingMode
		 * @see dynamodb.impl.DynamodbPackageImpl#getBillingMode()
		 * @generated
		 */
		EEnum BILLING_MODE = eINSTANCE.getBillingMode();

	}

} //DynamodbPackage
