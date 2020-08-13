/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth Settings Builder cognito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getCallbackUrls_java_lang_String_AsList <em>Callback Urls java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference <em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList <em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.OAuthSettingsBuilder_cognitoImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuthSettingsBuilder_cognitoImpl extends ServiceResourcesImpl implements OAuthSettingsBuilder_cognito {
	/**
	 * The default value of the '{@link #getCallbackUrls_java_lang_String_AsList() <em>Callback Urls java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackUrls_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallbackUrls_java_lang_String_AsList() <em>Callback Urls java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackUrls_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String callbackUrls_java_lang_String_AsList = CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference() <em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference() <em>Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference = FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList() <em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList() <em>Scopes software amazon awscdk services cognito OAuth Scope As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList()
	 * @generated
	 * @ordered
	 */
	protected String scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList = SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cognito.OAuthSettings";

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
	protected OAuthSettingsBuilder_cognitoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCallbackUrls_java_lang_String_AsList() {
		return callbackUrls_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallbackUrls_java_lang_String_AsList(String newCallbackUrls_java_lang_String_AsList) {
		String oldCallbackUrls_java_lang_String_AsList = callbackUrls_java_lang_String_AsList;
		callbackUrls_java_lang_String_AsList = newCallbackUrls_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST,
					oldCallbackUrls_java_lang_String_AsList, callbackUrls_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference() {
		return flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference(
			String newFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference) {
		String oldFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference = flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference;
		flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference = newFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE,
					oldFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference,
					flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList() {
		return scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList(
			String newScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList) {
		String oldScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList = scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList;
		scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList = newScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST,
					oldScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList,
					scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList));
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
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST:
			return getCallbackUrls_java_lang_String_AsList();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE:
			return getFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST:
			return getScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST:
			setCallbackUrls_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE:
			setFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST:
			setScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST:
			setCallbackUrls_java_lang_String_AsList(CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE:
			setFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference(
					FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST:
			setScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList(
					SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST:
			return CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? callbackUrls_java_lang_String_AsList != null
					: !CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(callbackUrls_java_lang_String_AsList);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE:
			return FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE_EDEFAULT == null
					? flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference != null
					: !FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE_EDEFAULT
							.equals(flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST:
			return SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST_EDEFAULT == null
					? scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList != null
					: !SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST_EDEFAULT
							.equals(scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
		result.append(" (callbackUrls_java_lang_String_AsList: ");
		result.append(callbackUrls_java_lang_String_AsList);
		result.append(", flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference: ");
		result.append(flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference);
		result.append(", scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList: ");
		result.append(scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList);
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

} //OAuthSettingsBuilder_cognitoImpl
