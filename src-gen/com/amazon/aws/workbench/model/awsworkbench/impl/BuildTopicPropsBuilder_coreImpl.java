/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BuildTopicPropsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Topic Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getEnableEncryption_java_lang_Boolean_ <em>Enable Encryption java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getTopicProps_java_lang_Object_ <em>Topic Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BuildTopicPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildTopicPropsBuilder_coreImpl extends ServiceResourcesImpl implements BuildTopicPropsBuilder_core {
	/**
	 * The default value of the '{@link #getEnableEncryption_java_lang_Boolean_() <em>Enable Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableEncryption_java_lang_Boolean_() <em>Enable Encryption java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableEncryption_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableEncryption_java_lang_Boolean_ = ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() <em>Encryption Key With Key software amazon awscdk services kms Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopicProps_java_lang_Object_() <em>Topic Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicProps_java_lang_Object_() <em>Topic Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object topicProps_java_lang_Object_ = TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.core.BuildTopicProps";

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
	protected BuildTopicPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BUILD_TOPIC_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableEncryption_java_lang_Boolean_() {
		return enableEncryption_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableEncryption_java_lang_Boolean_(Boolean newEnableEncryption_java_lang_Boolean_) {
		Boolean oldEnableEncryption_java_lang_Boolean_ = enableEncryption_java_lang_Boolean_;
		enableEncryption_java_lang_Boolean_ = newEnableEncryption_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_,
					oldEnableEncryption_java_lang_Boolean_, enableEncryption_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference() {
		return encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(
			String newEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference) {
		String oldEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
		encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference = newEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE,
					oldEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference,
					encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTopicProps_java_lang_Object_() {
		return topicProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopicProps_java_lang_Object_(Object newTopicProps_java_lang_Object_) {
		Object oldTopicProps_java_lang_Object_ = topicProps_java_lang_Object_;
		topicProps_java_lang_Object_ = newTopicProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_,
					oldTopicProps_java_lang_Object_, topicProps_java_lang_Object_));
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
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return getEnableEncryption_java_lang_Boolean_();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			return getEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			return getTopicProps_java_lang_Object_();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setEnableEncryption_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			setTopicProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			setEnableEncryption_java_lang_Boolean_(ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			setEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference(
					ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			setTopicProps_java_lang_Object_(TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
			return ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enableEncryption_java_lang_Boolean_ != null
					: !ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableEncryption_java_lang_Boolean_);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
			return ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT == null
					? encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference != null
					: !ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE_EDEFAULT
							.equals(encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__TOPIC_PROPS_JAVA_LANG_OBJECT_:
			return TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null ? topicProps_java_lang_Object_ != null
					: !TOPIC_PROPS_JAVA_LANG_OBJECT__EDEFAULT.equals(topicProps_java_lang_Object_);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BUILD_TOPIC_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (enableEncryption_java_lang_Boolean_: ");
		result.append(enableEncryption_java_lang_Boolean_);
		result.append(", encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference: ");
		result.append(encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference);
		result.append(", topicProps_java_lang_Object_: ");
		result.append(topicProps_java_lang_Object_);
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

} //BuildTopicPropsBuilder_coreImpl
