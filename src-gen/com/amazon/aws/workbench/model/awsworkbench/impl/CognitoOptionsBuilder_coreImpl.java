/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognito Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference <em>Identitypool With Cfn Identity Pool software amazon awscdk services cognito Cfn Identity Pool As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference <em>Userpool With User Pool software amazon awscdk services cognito User Pool As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference <em>Userpoolclient With User Pool Client software amazon awscdk services cognito User Pool Client As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CognitoOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CognitoOptionsBuilder_coreImpl extends ServiceResourcesImpl implements CognitoOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference() <em>Identitypool With Cfn Identity Pool software amazon awscdk services cognito Cfn Identity Pool As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference() <em>Identitypool With Cfn Identity Pool software amazon awscdk services cognito Cfn Identity Pool As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference = IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference() <em>Userpool With User Pool software amazon awscdk services cognito User Pool As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference() <em>Userpool With User Pool software amazon awscdk services cognito User Pool As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference = USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference() <em>Userpoolclient With User Pool Client software amazon awscdk services cognito User Pool Client As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference() <em>Userpoolclient With User Pool Client software amazon awscdk services cognito User Pool Client As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference = USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.core.CognitoOptions";

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
	protected CognitoOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference() {
		return identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference(
			String newIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference) {
		String oldIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference = identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference;
		identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference = newIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE,
					oldIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference,
					identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference() {
		return userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference(
			String newUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference) {
		String oldUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference = userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference;
		userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference = newUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE,
					oldUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference,
					userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference() {
		return userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference(
			String newUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference) {
		String oldUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference = userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference;
		userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference = newUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE,
					oldUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference,
					userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference));
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
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE:
			return getIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE:
			return getUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE:
			return getUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE:
			setIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE:
			setUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE:
			setUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE:
			setIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference(
					IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE:
			setUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference(
					USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE:
			setUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference(
					USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE:
			return IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE_EDEFAULT == null
					? identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference != null
					: !IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE_EDEFAULT
							.equals(identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE:
			return USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE_EDEFAULT == null
					? userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference != null
					: !USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE_EDEFAULT
							.equals(userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE:
			return USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE_EDEFAULT == null
					? userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference != null
					: !USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE_EDEFAULT
							.equals(userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(
				" (identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference: ");
		result.append(
				identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference);
		result.append(", userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference: ");
		result.append(userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference);
		result.append(
				", userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference: ");
		result.append(
				userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference);
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

} //CognitoOptionsBuilder_coreImpl
