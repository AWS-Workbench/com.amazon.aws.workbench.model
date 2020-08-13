/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth Flows Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getAuthorizationCodeGrant_java_lang_Boolean_ <em>Authorization Code Grant java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getClientCredentials_java_lang_Boolean_ <em>Client Credentials java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getImplicitCodeGrant_java_lang_Boolean_ <em>Implicit Code Grant java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthFlowsBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuthFlowsBuilder_cognitoImpl extends ServiceResourcesImpl implements OAuthFlowsBuilder_cognito {
	/**
	 * The default value of the '{@link #getAuthorizationCodeGrant_java_lang_Boolean_() <em>Authorization Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationCodeGrant_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationCodeGrant_java_lang_Boolean_() <em>Authorization Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationCodeGrant_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean authorizationCodeGrant_java_lang_Boolean_ = AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getClientCredentials_java_lang_Boolean_() <em>Client Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCredentials_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCredentials_java_lang_Boolean_() <em>Client Credentials java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCredentials_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean clientCredentials_java_lang_Boolean_ = CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitCodeGrant_java_lang_Boolean_() <em>Implicit Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitCodeGrant_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplicitCodeGrant_java_lang_Boolean_() <em>Implicit Code Grant java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitCodeGrant_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean implicitCodeGrant_java_lang_Boolean_ = IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.OAuthFlows";

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
	protected OAuthFlowsBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAuthorizationCodeGrant_java_lang_Boolean_() {
		return authorizationCodeGrant_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationCodeGrant_java_lang_Boolean_(Boolean newAuthorizationCodeGrant_java_lang_Boolean_) {
		Boolean oldAuthorizationCodeGrant_java_lang_Boolean_ = authorizationCodeGrant_java_lang_Boolean_;
		authorizationCodeGrant_java_lang_Boolean_ = newAuthorizationCodeGrant_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_,
					oldAuthorizationCodeGrant_java_lang_Boolean_, authorizationCodeGrant_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getClientCredentials_java_lang_Boolean_() {
		return clientCredentials_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientCredentials_java_lang_Boolean_(Boolean newClientCredentials_java_lang_Boolean_) {
		Boolean oldClientCredentials_java_lang_Boolean_ = clientCredentials_java_lang_Boolean_;
		clientCredentials_java_lang_Boolean_ = newClientCredentials_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_,
					oldClientCredentials_java_lang_Boolean_, clientCredentials_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getImplicitCodeGrant_java_lang_Boolean_() {
		return implicitCodeGrant_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitCodeGrant_java_lang_Boolean_(Boolean newImplicitCodeGrant_java_lang_Boolean_) {
		Boolean oldImplicitCodeGrant_java_lang_Boolean_ = implicitCodeGrant_java_lang_Boolean_;
		implicitCodeGrant_java_lang_Boolean_ = newImplicitCodeGrant_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_,
					oldImplicitCodeGrant_java_lang_Boolean_, implicitCodeGrant_java_lang_Boolean_));
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
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			return getAuthorizationCodeGrant_java_lang_Boolean_();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			return getClientCredentials_java_lang_Boolean_();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			return getImplicitCodeGrant_java_lang_Boolean_();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			setAuthorizationCodeGrant_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			setClientCredentials_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			setImplicitCodeGrant_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			setAuthorizationCodeGrant_java_lang_Boolean_(AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			setClientCredentials_java_lang_Boolean_(CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			setImplicitCodeGrant_java_lang_Boolean_(IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			return AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? authorizationCodeGrant_java_lang_Boolean_ != null
					: !AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(authorizationCodeGrant_java_lang_Boolean_);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_:
			return CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? clientCredentials_java_lang_Boolean_ != null
					: !CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(clientCredentials_java_lang_Boolean_);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_:
			return IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? implicitCodeGrant_java_lang_Boolean_ != null
					: !IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN__EDEFAULT.equals(implicitCodeGrant_java_lang_Boolean_);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (authorizationCodeGrant_java_lang_Boolean_: ");
		result.append(authorizationCodeGrant_java_lang_Boolean_);
		result.append(", clientCredentials_java_lang_Boolean_: ");
		result.append(clientCredentials_java_lang_Boolean_);
		result.append(", implicitCodeGrant_java_lang_Boolean_: ");
		result.append(implicitCodeGrant_java_lang_Boolean_);
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

} //OAuthFlowsBuilder_cognitoImpl
