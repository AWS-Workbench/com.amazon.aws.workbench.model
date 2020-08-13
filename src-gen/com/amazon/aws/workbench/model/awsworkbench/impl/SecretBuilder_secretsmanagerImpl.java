/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret Builder secretsmanager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference <em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getSecretName_java_lang_String_ <em>Secret Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretBuilder_secretsmanagerImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretBuilder_secretsmanagerImpl extends ServiceResourcesImpl implements SecretBuilder_secretsmanager {
	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference() <em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference() <em>Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference = GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretName_java_lang_String_() <em>Secret Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretName_java_lang_String_() <em>Secret Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String secretName_java_lang_String_ = SECRET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.secretsmanager.Secret";

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
	protected SecretBuilder_secretsmanagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
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
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference() {
		return generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference(
			String newGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference) {
		String oldGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference = generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference;
		generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference = newGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE,
					oldGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference,
					generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretName_java_lang_String_() {
		return secretName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretName_java_lang_String_(String newSecretName_java_lang_String_) {
		String oldSecretName_java_lang_String_ = secretName_java_lang_String_;
		secretName_java_lang_String_ = newSecretName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_,
					oldSecretName_java_lang_String_, secretName_java_lang_String_));
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
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE:
			return getGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_:
			return getSecretName_java_lang_String_();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE:
			setGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_:
			setSecretName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE:
			setGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference(
					GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_:
			setSecretName_java_lang_String_(SECRET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE:
			return GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE_EDEFAULT == null
					? generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference != null
					: !GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE_EDEFAULT
							.equals(generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_:
			return SECRET_NAME_JAVA_LANG_STRING__EDEFAULT == null ? secretName_java_lang_String_ != null
					: !SECRET_NAME_JAVA_LANG_STRING__EDEFAULT.equals(secretName_java_lang_String_);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
		result.append(" (description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(
				", generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference: ");
		result.append(
				generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference);
		result.append(", secretName_java_lang_String_: ");
		result.append(secretName_java_lang_String_);
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

} //SecretBuilder_secretsmanagerImpl
