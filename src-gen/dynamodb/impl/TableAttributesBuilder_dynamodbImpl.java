/**
 */
package dynamodb.impl;

import dynamodb.DynamodbPackage;
import dynamodb.TableAttributesBuilder_dynamodb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Attributes Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getGlobalIndexes_java_lang_String_AsList <em>Global Indexes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getLocalIndexes_java_lang_String_AsList <em>Local Indexes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getTableArn_java_lang_String_ <em>Table Arn java lang String </em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getTableName_java_lang_String_ <em>Table Name java lang String </em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getTableStreamArn_java_lang_String_ <em>Table Stream Arn java lang String </em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.impl.TableAttributesBuilder_dynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableAttributesBuilder_dynamodbImpl extends MinimalEObjectImpl.Container
		implements TableAttributesBuilder_dynamodb {
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
	 * The default value of the '{@link #getGlobalIndexes_java_lang_String_AsList() <em>Global Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalIndexes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalIndexes_java_lang_String_AsList() <em>Global Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalIndexes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String globalIndexes_java_lang_String_AsList = GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalIndexes_java_lang_String_AsList() <em>Local Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIndexes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIndexes_java_lang_String_AsList() <em>Local Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIndexes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String localIndexes_java_lang_String_AsList = LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableArn_java_lang_String_() <em>Table Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableArn_java_lang_String_() <em>Table Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String tableArn_java_lang_String_ = TABLE_ARN_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getTableStreamArn_java_lang_String_() <em>Table Stream Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableStreamArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_STREAM_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableStreamArn_java_lang_String_() <em>Table Stream Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableStreamArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String tableStreamArn_java_lang_String_ = TABLE_STREAM_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.dynamodb.TableAttributes";

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
	protected TableAttributesBuilder_dynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB;
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
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlobalIndexes_java_lang_String_AsList() {
		return globalIndexes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalIndexes_java_lang_String_AsList(String newGlobalIndexes_java_lang_String_AsList) {
		String oldGlobalIndexes_java_lang_String_AsList = globalIndexes_java_lang_String_AsList;
		globalIndexes_java_lang_String_AsList = newGlobalIndexes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST,
					oldGlobalIndexes_java_lang_String_AsList, globalIndexes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalIndexes_java_lang_String_AsList() {
		return localIndexes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalIndexes_java_lang_String_AsList(String newLocalIndexes_java_lang_String_AsList) {
		String oldLocalIndexes_java_lang_String_AsList = localIndexes_java_lang_String_AsList;
		localIndexes_java_lang_String_AsList = newLocalIndexes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST,
					oldLocalIndexes_java_lang_String_AsList, localIndexes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableArn_java_lang_String_() {
		return tableArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableArn_java_lang_String_(String newTableArn_java_lang_String_) {
		String oldTableArn_java_lang_String_ = tableArn_java_lang_String_;
		tableArn_java_lang_String_ = newTableArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_,
					oldTableArn_java_lang_String_, tableArn_java_lang_String_));
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
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_,
					oldTableName_java_lang_String_, tableName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableStreamArn_java_lang_String_() {
		return tableStreamArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableStreamArn_java_lang_String_(String newTableStreamArn_java_lang_String_) {
		String oldTableStreamArn_java_lang_String_ = tableStreamArn_java_lang_String_;
		tableStreamArn_java_lang_String_ = newTableStreamArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_,
					oldTableStreamArn_java_lang_String_, tableStreamArn_java_lang_String_));
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
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME, oldVarName, varName));
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
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER, oldIdentifier, identifier));
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
					DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE, oldAdditionalCode,
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
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			return getGlobalIndexes_java_lang_String_AsList();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			return getLocalIndexes_java_lang_String_AsList();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_:
			return getTableArn_java_lang_String_();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			return getTableName_java_lang_String_();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_:
			return getTableStreamArn_java_lang_String_();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME:
			return getVarName();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER:
			return getIdentifier();
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			setGlobalIndexes_java_lang_String_AsList((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			setLocalIndexes_java_lang_String_AsList((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_:
			setTableArn_java_lang_String_((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			setTableName_java_lang_String_((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_:
			setTableStreamArn_java_lang_String_((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			setGlobalIndexes_java_lang_String_AsList(GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			setLocalIndexes_java_lang_String_AsList(LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_:
			setTableArn_java_lang_String_(TABLE_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			setTableName_java_lang_String_(TABLE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_:
			setTableStreamArn_java_lang_String_(TABLE_STREAM_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			return GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? globalIndexes_java_lang_String_AsList != null
					: !GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(globalIndexes_java_lang_String_AsList);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
			return LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? localIndexes_java_lang_String_AsList != null
					: !LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(localIndexes_java_lang_String_AsList);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_:
			return TABLE_ARN_JAVA_LANG_STRING__EDEFAULT == null ? tableArn_java_lang_String_ != null
					: !TABLE_ARN_JAVA_LANG_STRING__EDEFAULT.equals(tableArn_java_lang_String_);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
			return TABLE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? tableName_java_lang_String_ != null
					: !TABLE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(tableName_java_lang_String_);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_:
			return TABLE_STREAM_ARN_JAVA_LANG_STRING__EDEFAULT == null ? tableStreamArn_java_lang_String_ != null
					: !TABLE_STREAM_ARN_JAVA_LANG_STRING__EDEFAULT.equals(tableStreamArn_java_lang_String_);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		result.append(" (encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(", globalIndexes_java_lang_String_AsList: ");
		result.append(globalIndexes_java_lang_String_AsList);
		result.append(", localIndexes_java_lang_String_AsList: ");
		result.append(localIndexes_java_lang_String_AsList);
		result.append(", tableArn_java_lang_String_: ");
		result.append(tableArn_java_lang_String_);
		result.append(", tableName_java_lang_String_: ");
		result.append(tableName_java_lang_String_);
		result.append(", tableStreamArn_java_lang_String_: ");
		result.append(tableStreamArn_java_lang_String_);
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

} //TableAttributesBuilder_dynamodbImpl
