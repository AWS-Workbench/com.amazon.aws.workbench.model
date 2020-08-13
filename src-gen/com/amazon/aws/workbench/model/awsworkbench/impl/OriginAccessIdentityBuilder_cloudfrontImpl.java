/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OriginAccessIdentityBuilder_cloudfront;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Origin Access Identity Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OriginAccessIdentityBuilder_cloudfrontImpl#getComment_java_lang_String_ <em>Comment java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OriginAccessIdentityBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OriginAccessIdentityBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OriginAccessIdentityBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OriginAccessIdentityBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginAccessIdentityBuilder_cloudfrontImpl extends ServiceResourcesImpl
		implements OriginAccessIdentityBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getComment_java_lang_String_() <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment_java_lang_String_() <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String comment_java_lang_String_ = COMMENT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.OriginAccessIdentity";

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
	protected OriginAccessIdentityBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment_java_lang_String_() {
		return comment_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment_java_lang_String_(String newComment_java_lang_String_) {
		String oldComment_java_lang_String_ = comment_java_lang_String_;
		comment_java_lang_String_ = newComment_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_,
					oldComment_java_lang_String_, comment_java_lang_String_));
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
					AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_:
			return getComment_java_lang_String_();
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_:
			setComment_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_:
			setComment_java_lang_String_(COMMENT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_:
			return COMMENT_JAVA_LANG_STRING__EDEFAULT == null ? comment_java_lang_String_ != null
					: !COMMENT_JAVA_LANG_STRING__EDEFAULT.equals(comment_java_lang_String_);
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ORIGIN_ACCESS_IDENTITY_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		result.append(" (comment_java_lang_String_: ");
		result.append(comment_java_lang_String_);
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

} //OriginAccessIdentityBuilder_cloudfrontImpl
