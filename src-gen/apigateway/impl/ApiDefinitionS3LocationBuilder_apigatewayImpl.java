/**
 */
package apigateway.impl;

import apigateway.ApiDefinitionS3LocationBuilder_apigateway;
import apigateway.ApigatewayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Definition S3 Location Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getBucket_java_lang_String_ <em>Bucket java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getKey_java_lang_String_ <em>Key java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getVersion_java_lang_String_ <em>Version java lang String </em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.ApiDefinitionS3LocationBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiDefinitionS3LocationBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements ApiDefinitionS3LocationBuilder_apigateway {
	/**
	 * The default value of the '{@link #getBucket_java_lang_String_() <em>Bucket java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucket_java_lang_String_() <em>Bucket java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String bucket_java_lang_String_ = BUCKET_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getKey_java_lang_String_() <em>Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey_java_lang_String_() <em>Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String key_java_lang_String_ = KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion_java_lang_String_() <em>Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion_java_lang_String_() <em>Version java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String version_java_lang_String_ = VERSION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location";

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
	protected ApiDefinitionS3LocationBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucket_java_lang_String_() {
		return bucket_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucket_java_lang_String_(String newBucket_java_lang_String_) {
		String oldBucket_java_lang_String_ = bucket_java_lang_String_;
		bucket_java_lang_String_ = newBucket_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_,
					oldBucket_java_lang_String_, bucket_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey_java_lang_String_() {
		return key_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey_java_lang_String_(String newKey_java_lang_String_) {
		String oldKey_java_lang_String_ = key_java_lang_String_;
		key_java_lang_String_ = newKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_,
					oldKey_java_lang_String_, key_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion_java_lang_String_() {
		return version_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion_java_lang_String_(String newVersion_java_lang_String_) {
		String oldVersion_java_lang_String_ = version_java_lang_String_;
		version_java_lang_String_ = newVersion_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_,
					oldVersion_java_lang_String_, version_java_lang_String_));
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
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
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
					ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_:
			return getBucket_java_lang_String_();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_:
			return getKey_java_lang_String_();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_:
			return getVersion_java_lang_String_();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_:
			setBucket_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_:
			setKey_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_:
			setVersion_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_:
			setBucket_java_lang_String_(BUCKET_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_:
			setKey_java_lang_String_(KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_:
			setVersion_java_lang_String_(VERSION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__BUCKET_JAVA_LANG_STRING_:
			return BUCKET_JAVA_LANG_STRING__EDEFAULT == null ? bucket_java_lang_String_ != null
					: !BUCKET_JAVA_LANG_STRING__EDEFAULT.equals(bucket_java_lang_String_);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__KEY_JAVA_LANG_STRING_:
			return KEY_JAVA_LANG_STRING__EDEFAULT == null ? key_java_lang_String_ != null
					: !KEY_JAVA_LANG_STRING__EDEFAULT.equals(key_java_lang_String_);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VERSION_JAVA_LANG_STRING_:
			return VERSION_JAVA_LANG_STRING__EDEFAULT == null ? version_java_lang_String_ != null
					: !VERSION_JAVA_LANG_STRING__EDEFAULT.equals(version_java_lang_String_);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.API_DEFINITION_S3_LOCATION_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (bucket_java_lang_String_: ");
		result.append(bucket_java_lang_String_);
		result.append(", key_java_lang_String_: ");
		result.append(key_java_lang_String_);
		result.append(", version_java_lang_String_: ");
		result.append(version_java_lang_String_);
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

} //ApiDefinitionS3LocationBuilder_apigatewayImpl
