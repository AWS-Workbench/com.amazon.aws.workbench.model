/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.TopicPropsBuilder_sns;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Props Builder sns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getDisplayName_java_lang_String_ <em>Display Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getTopicName_java_lang_String_ <em>Topic Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.TopicPropsBuilder_snsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicPropsBuilder_snsImpl extends ServiceResourcesImpl implements TopicPropsBuilder_sns {
	/**
	 * The default value of the '{@link #getDisplayName_java_lang_String_() <em>Display Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName_java_lang_String_() <em>Display Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String displayName_java_lang_String_ = DISPLAY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() <em>Master Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopicName_java_lang_String_() <em>Topic Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName_java_lang_String_() <em>Topic Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String topicName_java_lang_String_ = TOPIC_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.sns.TopicProps";

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
	protected TopicPropsBuilder_snsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.TOPIC_PROPS_BUILDER_SNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName_java_lang_String_() {
		return displayName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName_java_lang_String_(String newDisplayName_java_lang_String_) {
		String oldDisplayName_java_lang_String_ = displayName_java_lang_String_;
		displayName_java_lang_String_ = newDisplayName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_,
					oldDisplayName_java_lang_String_, displayName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference() {
		return masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
			String newMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference) {
		String oldMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference = newMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
					oldMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference,
					masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTopicName_java_lang_String_() {
		return topicName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopicName_java_lang_String_(String newTopicName_java_lang_String_) {
		String oldTopicName_java_lang_String_ = topicName_java_lang_String_;
		topicName_java_lang_String_ = newTopicName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_,
					oldTopicName_java_lang_String_, topicName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__VAR_NAME,
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
					AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_:
			return getDisplayName_java_lang_String_();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return getMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_:
			return getTopicName_java_lang_String_();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_:
			setDisplayName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_:
			setTopicName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_:
			setDisplayName_java_lang_String_(DISPLAY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			setMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(
					MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_:
			setTopicName_java_lang_String_(TOPIC_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_:
			return DISPLAY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? displayName_java_lang_String_ != null
					: !DISPLAY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(displayName_java_lang_String_);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
			return MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT == null
					? masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference != null
					: !MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE_EDEFAULT
							.equals(masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_:
			return TOPIC_NAME_JAVA_LANG_STRING__EDEFAULT == null ? topicName_java_lang_String_ != null
					: !TOPIC_NAME_JAVA_LANG_STRING__EDEFAULT.equals(topicName_java_lang_String_);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.TOPIC_PROPS_BUILDER_SNS__ADDITIONAL_CODE:
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
		result.append(" (displayName_java_lang_String_: ");
		result.append(displayName_java_lang_String_);
		result.append(", masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference: ");
		result.append(masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference);
		result.append(", topicName_java_lang_String_: ");
		result.append(topicName_java_lang_String_);
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

} //TopicPropsBuilder_snsImpl
