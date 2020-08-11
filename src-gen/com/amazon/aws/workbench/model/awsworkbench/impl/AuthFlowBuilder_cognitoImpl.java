/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AuthFlowBuilder_cognito;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth Flow Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getAdminUserPassword_java_lang_Boolean_ <em>Admin User Password java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getCustom_java_lang_Boolean_ <em>Custom java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getRefreshToken_java_lang_Boolean_ <em>Refresh Token java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getUserPassword_java_lang_Boolean_ <em>User Password java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getUserSrp_java_lang_Boolean_ <em>User Srp java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AuthFlowBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthFlowBuilder_cognitoImpl extends MinimalEObjectImpl.Container implements AuthFlowBuilder_cognito {
	/**
	 * The default value of the '{@link #getAdminUserPassword_java_lang_Boolean_() <em>Admin User Password java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUserPassword_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminUserPassword_java_lang_Boolean_() <em>Admin User Password java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUserPassword_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean adminUserPassword_java_lang_Boolean_ = ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom_java_lang_Boolean_() <em>Custom java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CUSTOM_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom_java_lang_Boolean_() <em>Custom java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean custom_java_lang_Boolean_ = CUSTOM_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshToken_java_lang_Boolean_() <em>Refresh Token java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshToken_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REFRESH_TOKEN_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshToken_java_lang_Boolean_() <em>Refresh Token java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshToken_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean refreshToken_java_lang_Boolean_ = REFRESH_TOKEN_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPassword_java_lang_Boolean_() <em>User Password java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPassword_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPassword_java_lang_Boolean_() <em>User Password java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPassword_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean userPassword_java_lang_Boolean_ = USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserSrp_java_lang_Boolean_() <em>User Srp java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSrp_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USER_SRP_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserSrp_java_lang_Boolean_() <em>User Srp java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSrp_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean userSrp_java_lang_Boolean_ = USER_SRP_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.AuthFlow";

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
	protected AuthFlowBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdminUserPassword_java_lang_Boolean_() {
		return adminUserPassword_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminUserPassword_java_lang_Boolean_(Boolean newAdminUserPassword_java_lang_Boolean_) {
		Boolean oldAdminUserPassword_java_lang_Boolean_ = adminUserPassword_java_lang_Boolean_;
		adminUserPassword_java_lang_Boolean_ = newAdminUserPassword_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_,
					oldAdminUserPassword_java_lang_Boolean_, adminUserPassword_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCustom_java_lang_Boolean_() {
		return custom_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustom_java_lang_Boolean_(Boolean newCustom_java_lang_Boolean_) {
		Boolean oldCustom_java_lang_Boolean_ = custom_java_lang_Boolean_;
		custom_java_lang_Boolean_ = newCustom_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_,
					oldCustom_java_lang_Boolean_, custom_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRefreshToken_java_lang_Boolean_() {
		return refreshToken_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshToken_java_lang_Boolean_(Boolean newRefreshToken_java_lang_Boolean_) {
		Boolean oldRefreshToken_java_lang_Boolean_ = refreshToken_java_lang_Boolean_;
		refreshToken_java_lang_Boolean_ = newRefreshToken_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_,
					oldRefreshToken_java_lang_Boolean_, refreshToken_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUserPassword_java_lang_Boolean_() {
		return userPassword_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPassword_java_lang_Boolean_(Boolean newUserPassword_java_lang_Boolean_) {
		Boolean oldUserPassword_java_lang_Boolean_ = userPassword_java_lang_Boolean_;
		userPassword_java_lang_Boolean_ = newUserPassword_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_,
					oldUserPassword_java_lang_Boolean_, userPassword_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUserSrp_java_lang_Boolean_() {
		return userSrp_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserSrp_java_lang_Boolean_(Boolean newUserSrp_java_lang_Boolean_) {
		Boolean oldUserSrp_java_lang_Boolean_ = userSrp_java_lang_Boolean_;
		userSrp_java_lang_Boolean_ = newUserSrp_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_,
					oldUserSrp_java_lang_Boolean_, userSrp_java_lang_Boolean_));
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
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			return getAdminUserPassword_java_lang_Boolean_();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_:
			return getCustom_java_lang_Boolean_();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_:
			return getRefreshToken_java_lang_Boolean_();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			return getUserPassword_java_lang_Boolean_();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_:
			return getUserSrp_java_lang_Boolean_();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			setAdminUserPassword_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_:
			setCustom_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_:
			setRefreshToken_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			setUserPassword_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_:
			setUserSrp_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			setAdminUserPassword_java_lang_Boolean_(ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_:
			setCustom_java_lang_Boolean_(CUSTOM_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_:
			setRefreshToken_java_lang_Boolean_(REFRESH_TOKEN_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			setUserPassword_java_lang_Boolean_(USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_:
			setUserSrp_java_lang_Boolean_(USER_SRP_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			return ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? adminUserPassword_java_lang_Boolean_ != null
					: !ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT.equals(adminUserPassword_java_lang_Boolean_);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_:
			return CUSTOM_JAVA_LANG_BOOLEAN__EDEFAULT == null ? custom_java_lang_Boolean_ != null
					: !CUSTOM_JAVA_LANG_BOOLEAN__EDEFAULT.equals(custom_java_lang_Boolean_);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_:
			return REFRESH_TOKEN_JAVA_LANG_BOOLEAN__EDEFAULT == null ? refreshToken_java_lang_Boolean_ != null
					: !REFRESH_TOKEN_JAVA_LANG_BOOLEAN__EDEFAULT.equals(refreshToken_java_lang_Boolean_);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_:
			return USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT == null ? userPassword_java_lang_Boolean_ != null
					: !USER_PASSWORD_JAVA_LANG_BOOLEAN__EDEFAULT.equals(userPassword_java_lang_Boolean_);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_:
			return USER_SRP_JAVA_LANG_BOOLEAN__EDEFAULT == null ? userSrp_java_lang_Boolean_ != null
					: !USER_SRP_JAVA_LANG_BOOLEAN__EDEFAULT.equals(userSrp_java_lang_Boolean_);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (adminUserPassword_java_lang_Boolean_: ");
		result.append(adminUserPassword_java_lang_Boolean_);
		result.append(", custom_java_lang_Boolean_: ");
		result.append(custom_java_lang_Boolean_);
		result.append(", refreshToken_java_lang_Boolean_: ");
		result.append(refreshToken_java_lang_Boolean_);
		result.append(", userPassword_java_lang_Boolean_: ");
		result.append(userPassword_java_lang_Boolean_);
		result.append(", userSrp_java_lang_Boolean_: ");
		result.append(userSrp_java_lang_Boolean_);
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

} //AuthFlowBuilder_cognitoImpl
