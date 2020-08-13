/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BlockPublicAccessBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Public Access Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getBlockPublicAcls_java_lang_Boolean_ <em>Block Public Acls java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getBlockPublicPolicy_java_lang_Boolean_ <em>Block Public Policy java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getIgnorePublicAcls_java_lang_Boolean_ <em>Ignore Public Acls java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getRestrictPublicBuckets_java_lang_Boolean_ <em>Restrict Public Buckets java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockPublicAccessBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockPublicAccessBuilder_s3Impl extends ServiceResourcesImpl implements BlockPublicAccessBuilder_s3 {
	/**
	 * The default value of the '{@link #getBlockPublicAcls_java_lang_Boolean_() <em>Block Public Acls java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicAcls_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockPublicAcls_java_lang_Boolean_() <em>Block Public Acls java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicAcls_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean blockPublicAcls_java_lang_Boolean_ = BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockPublicPolicy_java_lang_Boolean_() <em>Block Public Policy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicPolicy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockPublicPolicy_java_lang_Boolean_() <em>Block Public Policy java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockPublicPolicy_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean blockPublicPolicy_java_lang_Boolean_ = BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnorePublicAcls_java_lang_Boolean_() <em>Ignore Public Acls java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnorePublicAcls_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnorePublicAcls_java_lang_Boolean_() <em>Ignore Public Acls java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnorePublicAcls_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignorePublicAcls_java_lang_Boolean_ = IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictPublicBuckets_java_lang_Boolean_() <em>Restrict Public Buckets java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictPublicBuckets_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictPublicBuckets_java_lang_Boolean_() <em>Restrict Public Buckets java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictPublicBuckets_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean restrictPublicBuckets_java_lang_Boolean_ = RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.BlockPublicAccess";

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
	protected BlockPublicAccessBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBlockPublicAcls_java_lang_Boolean_() {
		return blockPublicAcls_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockPublicAcls_java_lang_Boolean_(Boolean newBlockPublicAcls_java_lang_Boolean_) {
		Boolean oldBlockPublicAcls_java_lang_Boolean_ = blockPublicAcls_java_lang_Boolean_;
		blockPublicAcls_java_lang_Boolean_ = newBlockPublicAcls_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_,
					oldBlockPublicAcls_java_lang_Boolean_, blockPublicAcls_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBlockPublicPolicy_java_lang_Boolean_() {
		return blockPublicPolicy_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockPublicPolicy_java_lang_Boolean_(Boolean newBlockPublicPolicy_java_lang_Boolean_) {
		Boolean oldBlockPublicPolicy_java_lang_Boolean_ = blockPublicPolicy_java_lang_Boolean_;
		blockPublicPolicy_java_lang_Boolean_ = newBlockPublicPolicy_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_,
					oldBlockPublicPolicy_java_lang_Boolean_, blockPublicPolicy_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIgnorePublicAcls_java_lang_Boolean_() {
		return ignorePublicAcls_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnorePublicAcls_java_lang_Boolean_(Boolean newIgnorePublicAcls_java_lang_Boolean_) {
		Boolean oldIgnorePublicAcls_java_lang_Boolean_ = ignorePublicAcls_java_lang_Boolean_;
		ignorePublicAcls_java_lang_Boolean_ = newIgnorePublicAcls_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_,
					oldIgnorePublicAcls_java_lang_Boolean_, ignorePublicAcls_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRestrictPublicBuckets_java_lang_Boolean_() {
		return restrictPublicBuckets_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestrictPublicBuckets_java_lang_Boolean_(Boolean newRestrictPublicBuckets_java_lang_Boolean_) {
		Boolean oldRestrictPublicBuckets_java_lang_Boolean_ = restrictPublicBuckets_java_lang_Boolean_;
		restrictPublicBuckets_java_lang_Boolean_ = newRestrictPublicBuckets_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_,
					oldRestrictPublicBuckets_java_lang_Boolean_, restrictPublicBuckets_java_lang_Boolean_));
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
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			return getBlockPublicAcls_java_lang_Boolean_();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_:
			return getBlockPublicPolicy_java_lang_Boolean_();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			return getIgnorePublicAcls_java_lang_Boolean_();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_:
			return getRestrictPublicBuckets_java_lang_Boolean_();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			setBlockPublicAcls_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_:
			setBlockPublicPolicy_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			setIgnorePublicAcls_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_:
			setRestrictPublicBuckets_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			setBlockPublicAcls_java_lang_Boolean_(BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_:
			setBlockPublicPolicy_java_lang_Boolean_(BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			setIgnorePublicAcls_java_lang_Boolean_(IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_:
			setRestrictPublicBuckets_java_lang_Boolean_(RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			return BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? blockPublicAcls_java_lang_Boolean_ != null
					: !BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(blockPublicAcls_java_lang_Boolean_);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_:
			return BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? blockPublicPolicy_java_lang_Boolean_ != null
					: !BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN__EDEFAULT.equals(blockPublicPolicy_java_lang_Boolean_);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
			return IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? ignorePublicAcls_java_lang_Boolean_ != null
					: !IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(ignorePublicAcls_java_lang_Boolean_);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_:
			return RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? restrictPublicBuckets_java_lang_Boolean_ != null
					: !RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(restrictPublicBuckets_java_lang_Boolean_);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE:
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
		result.append(" (blockPublicAcls_java_lang_Boolean_: ");
		result.append(blockPublicAcls_java_lang_Boolean_);
		result.append(", blockPublicPolicy_java_lang_Boolean_: ");
		result.append(blockPublicPolicy_java_lang_Boolean_);
		result.append(", ignorePublicAcls_java_lang_Boolean_: ");
		result.append(ignorePublicAcls_java_lang_Boolean_);
		result.append(", restrictPublicBuckets_java_lang_Boolean_: ");
		result.append(restrictPublicBuckets_java_lang_Boolean_);
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

} //BlockPublicAccessBuilder_s3Impl
