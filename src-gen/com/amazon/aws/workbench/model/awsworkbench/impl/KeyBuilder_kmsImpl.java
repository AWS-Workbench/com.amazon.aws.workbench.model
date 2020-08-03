/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms;
import com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Builder kms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getAlias_java_lang_String_ <em>Alias java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getEnableKeyRotation_java_lang_Boolean_ <em>Enable Key Rotation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getTrustAccountIdentities_java_lang_Boolean_ <em>Trust Account Identities java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.KeyBuilder_kmsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyBuilder_kmsImpl extends MinimalEObjectImpl.Container implements KeyBuilder_kms {
	/**
	 * The default value of the '{@link #getAlias_java_lang_String_() <em>Alias java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias_java_lang_String_() <em>Alias java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String alias_java_lang_String_ = ALIAS_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled_java_lang_Boolean_ = ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableKeyRotation_java_lang_Boolean_() <em>Enable Key Rotation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableKeyRotation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableKeyRotation_java_lang_Boolean_() <em>Enable Key Rotation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableKeyRotation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableKeyRotation_java_lang_Boolean_ = ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() <em>Policy With Policy Document software amazon awscdk services iam Policy Document As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getTrustAccountIdentities_java_lang_Boolean_() <em>Trust Account Identities java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustAccountIdentities_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustAccountIdentities_java_lang_Boolean_() <em>Trust Account Identities java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustAccountIdentities_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean trustAccountIdentities_java_lang_Boolean_ = TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.kms.Key";

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
	protected KeyBuilder_kmsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.KEY_BUILDER_KMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias_java_lang_String_() {
		return alias_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias_java_lang_String_(String newAlias_java_lang_String_) {
		String oldAlias_java_lang_String_ = alias_java_lang_String_;
		alias_java_lang_String_ = newAlias_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_, oldAlias_java_lang_String_,
					alias_java_lang_String_));
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
					AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled_java_lang_Boolean_() {
		return enabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled_java_lang_Boolean_(Boolean newEnabled_java_lang_Boolean_) {
		Boolean oldEnabled_java_lang_Boolean_ = enabled_java_lang_Boolean_;
		enabled_java_lang_Boolean_ = newEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_, oldEnabled_java_lang_Boolean_,
					enabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableKeyRotation_java_lang_Boolean_() {
		return enableKeyRotation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableKeyRotation_java_lang_Boolean_(Boolean newEnableKeyRotation_java_lang_Boolean_) {
		Boolean oldEnableKeyRotation_java_lang_Boolean_ = enableKeyRotation_java_lang_Boolean_;
		enableKeyRotation_java_lang_Boolean_ = newEnableKeyRotation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_,
					oldEnableKeyRotation_java_lang_Boolean_, enableKeyRotation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference() {
		return policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
			String newPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference) {
		String oldPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference = newPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
					oldPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference,
					policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference));
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
					AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
					oldRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_,
					removalPolicy_software_amazon_awscdk_core_RemovalPolicy_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTrustAccountIdentities_java_lang_Boolean_() {
		return trustAccountIdentities_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustAccountIdentities_java_lang_Boolean_(Boolean newTrustAccountIdentities_java_lang_Boolean_) {
		Boolean oldTrustAccountIdentities_java_lang_Boolean_ = trustAccountIdentities_java_lang_Boolean_;
		trustAccountIdentities_java_lang_Boolean_ = newTrustAccountIdentities_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_,
					oldTrustAccountIdentities_java_lang_Boolean_, trustAccountIdentities_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER,
					oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_:
			return getAlias_java_lang_String_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_:
			return getEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_:
			return getEnableKeyRotation_java_lang_Boolean_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return getPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_:
			return getTrustAccountIdentities_java_lang_Boolean_();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_:
			setAlias_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_:
			setEnableKeyRotation_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_((RemovalPolicy) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_:
			setTrustAccountIdentities_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_:
			setAlias_java_lang_String_(ALIAS_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_(ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_:
			setEnableKeyRotation_java_lang_Boolean_(ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			setPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference(
					POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(
					REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_:
			setTrustAccountIdentities_java_lang_Boolean_(TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_:
			return ALIAS_JAVA_LANG_STRING__EDEFAULT == null ? alias_java_lang_String_ != null
					: !ALIAS_JAVA_LANG_STRING__EDEFAULT.equals(alias_java_lang_String_);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_:
			return ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enabled_java_lang_Boolean_ != null
					: !ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enabled_java_lang_Boolean_);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_:
			return ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? enableKeyRotation_java_lang_Boolean_ != null
					: !ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enableKeyRotation_java_lang_Boolean_);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
			return POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT == null
					? policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference != null
					: !POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE_EDEFAULT
							.equals(policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
			return removalPolicy_software_amazon_awscdk_core_RemovalPolicy_ != REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY__EDEFAULT;
		case AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_:
			return TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? trustAccountIdentities_java_lang_Boolean_ != null
					: !TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(trustAccountIdentities_java_lang_Boolean_);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE:
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
		result.append(" (alias_java_lang_String_: ");
		result.append(alias_java_lang_String_);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", enabled_java_lang_Boolean_: ");
		result.append(enabled_java_lang_Boolean_);
		result.append(", enableKeyRotation_java_lang_Boolean_: ");
		result.append(enableKeyRotation_java_lang_Boolean_);
		result.append(", policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference: ");
		result.append(policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference);
		result.append(", removalPolicy_software_amazon_awscdk_core_RemovalPolicy_: ");
		result.append(removalPolicy_software_amazon_awscdk_core_RemovalPolicy_);
		result.append(", trustAccountIdentities_java_lang_Boolean_: ");
		result.append(trustAccountIdentities_java_lang_Boolean_);
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

} //KeyBuilder_kmsImpl
