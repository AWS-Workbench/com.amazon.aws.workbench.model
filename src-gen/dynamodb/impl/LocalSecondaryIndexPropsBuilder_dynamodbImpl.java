/**
 */
package dynamodb.impl;

import dynamodb.DynamodbPackage;
import dynamodb.LocalSecondaryIndexPropsBuilder_dynamodb;
import dynamodb.ProjectionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Secondary Index Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.impl.LocalSecondaryIndexPropsBuilder_dynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalSecondaryIndexPropsBuilder_dynamodbImpl extends MinimalEObjectImpl.Container
		implements LocalSecondaryIndexPropsBuilder_dynamodb {
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
	 * The default value of the '{@link #getIndexName_java_lang_String_() <em>Index Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexName_java_lang_String_() <em>Index Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String indexName_java_lang_String_ = INDEX_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getNonKeyAttributes_java_lang_String_AsList() <em>Non Key Attributes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonKeyAttributes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonKeyAttributes_java_lang_String_AsList() <em>Non Key Attributes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonKeyAttributes_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String nonKeyAttributes_java_lang_String_AsList = NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @generated
	 * @ordered
	 */
	protected static final ProjectionType PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE__EDEFAULT = ProjectionType.KEYS_ONLY;

	/**
	 * The cached value of the '{@link #getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @generated
	 * @ordered
	 */
	protected ProjectionType projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ = PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps";

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
	protected LocalSecondaryIndexPropsBuilder_dynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamodbPackage.Literals.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB;
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
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
					oldSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference,
					sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndexName_java_lang_String_() {
		return indexName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexName_java_lang_String_(String newIndexName_java_lang_String_) {
		String oldIndexName_java_lang_String_ = indexName_java_lang_String_;
		indexName_java_lang_String_ = newIndexName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_,
					oldIndexName_java_lang_String_, indexName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNonKeyAttributes_java_lang_String_AsList() {
		return nonKeyAttributes_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonKeyAttributes_java_lang_String_AsList(String newNonKeyAttributes_java_lang_String_AsList) {
		String oldNonKeyAttributes_java_lang_String_AsList = nonKeyAttributes_java_lang_String_AsList;
		nonKeyAttributes_java_lang_String_AsList = newNonKeyAttributes_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST,
					oldNonKeyAttributes_java_lang_String_AsList, nonKeyAttributes_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectionType getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_() {
		return projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(
			ProjectionType newProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_) {
		ProjectionType oldProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ = projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_;
		projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ = newProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ == null
				? PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE__EDEFAULT
				: newProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_,
					oldProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_,
					projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_));
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
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME, oldVarName, varName));
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
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER, oldIdentifier,
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
					DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, oldAdditionalCode,
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
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_:
			return getIndexName_java_lang_String_();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST:
			return getNonKeyAttributes_java_lang_String_AsList();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_:
			return getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return getVarName();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return getIdentifier();
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference((String) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_:
			setIndexName_java_lang_String_((String) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST:
			setNonKeyAttributes_java_lang_String_AsList((String) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_:
			setProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_((ProjectionType) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(
					SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_:
			setIndexName_java_lang_String_(INDEX_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST:
			setNonKeyAttributes_java_lang_String_AsList(NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_:
			setProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(
					PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE__EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
			return SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT == null
					? sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference != null
					: !SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE_EDEFAULT
							.equals(sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_:
			return INDEX_NAME_JAVA_LANG_STRING__EDEFAULT == null ? indexName_java_lang_String_ != null
					: !INDEX_NAME_JAVA_LANG_STRING__EDEFAULT.equals(indexName_java_lang_String_);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST:
			return NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? nonKeyAttributes_java_lang_String_AsList != null
					: !NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(nonKeyAttributes_java_lang_String_AsList);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_:
			return projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ != PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE__EDEFAULT;
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case DynamodbPackage.LOCAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
		result.append(" (sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference: ");
		result.append(sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference);
		result.append(", indexName_java_lang_String_: ");
		result.append(indexName_java_lang_String_);
		result.append(", nonKeyAttributes_java_lang_String_AsList: ");
		result.append(nonKeyAttributes_java_lang_String_AsList);
		result.append(", projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_: ");
		result.append(projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_);
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

} //LocalSecondaryIndexPropsBuilder_dynamodbImpl
