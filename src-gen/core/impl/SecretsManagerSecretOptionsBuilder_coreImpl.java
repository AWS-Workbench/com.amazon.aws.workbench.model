/**
 */
package core.impl;

import core.CorePackage;
import core.SecretsManagerSecretOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secrets Manager Secret Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getJsonField_java_lang_String_ <em>Json Field java lang String </em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getVersionId_java_lang_String_ <em>Version Id java lang String </em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getVersionStage_java_lang_String_ <em>Version Stage java lang String </em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsManagerSecretOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements SecretsManagerSecretOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getJsonField_java_lang_String_() <em>Json Field java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonField_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_FIELD_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonField_java_lang_String_() <em>Json Field java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonField_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String jsonField_java_lang_String_ = JSON_FIELD_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionId_java_lang_String_() <em>Version Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionId_java_lang_String_() <em>Version Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String versionId_java_lang_String_ = VERSION_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionStage_java_lang_String_() <em>Version Stage java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionStage_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_STAGE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionStage_java_lang_String_() <em>Version Stage java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionStage_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String versionStage_java_lang_String_ = VERSION_STAGE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.SecretsManagerSecretOptions";

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
	protected SecretsManagerSecretOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonField_java_lang_String_() {
		return jsonField_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonField_java_lang_String_(String newJsonField_java_lang_String_) {
		String oldJsonField_java_lang_String_ = jsonField_java_lang_String_;
		jsonField_java_lang_String_ = newJsonField_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_,
					oldJsonField_java_lang_String_, jsonField_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionId_java_lang_String_() {
		return versionId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionId_java_lang_String_(String newVersionId_java_lang_String_) {
		String oldVersionId_java_lang_String_ = versionId_java_lang_String_;
		versionId_java_lang_String_ = newVersionId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_,
					oldVersionId_java_lang_String_, versionId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionStage_java_lang_String_() {
		return versionStage_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionStage_java_lang_String_(String newVersionStage_java_lang_String_) {
		String oldVersionStage_java_lang_String_ = versionStage_java_lang_String_;
		versionStage_java_lang_String_ = newVersionStage_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_,
					oldVersionStage_java_lang_String_, versionStage_java_lang_String_));
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
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_:
			return getJsonField_java_lang_String_();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_:
			return getVersionId_java_lang_String_();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_:
			return getVersionStage_java_lang_String_();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_:
			setJsonField_java_lang_String_((String) newValue);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_:
			setVersionId_java_lang_String_((String) newValue);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_:
			setVersionStage_java_lang_String_((String) newValue);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_:
			setJsonField_java_lang_String_(JSON_FIELD_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_:
			setVersionId_java_lang_String_(VERSION_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_:
			setVersionStage_java_lang_String_(VERSION_STAGE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_:
			return JSON_FIELD_JAVA_LANG_STRING__EDEFAULT == null ? jsonField_java_lang_String_ != null
					: !JSON_FIELD_JAVA_LANG_STRING__EDEFAULT.equals(jsonField_java_lang_String_);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_:
			return VERSION_ID_JAVA_LANG_STRING__EDEFAULT == null ? versionId_java_lang_String_ != null
					: !VERSION_ID_JAVA_LANG_STRING__EDEFAULT.equals(versionId_java_lang_String_);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_:
			return VERSION_STAGE_JAVA_LANG_STRING__EDEFAULT == null ? versionStage_java_lang_String_ != null
					: !VERSION_STAGE_JAVA_LANG_STRING__EDEFAULT.equals(versionStage_java_lang_String_);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (jsonField_java_lang_String_: ");
		result.append(jsonField_java_lang_String_);
		result.append(", versionId_java_lang_String_: ");
		result.append(versionId_java_lang_String_);
		result.append(", versionStage_java_lang_String_: ");
		result.append(versionStage_java_lang_String_);
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

} //SecretsManagerSecretOptionsBuilder_coreImpl
