/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RequestAuthorizerBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Authorizer Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getAuthorizerName_java_lang_String_ <em>Authorizer Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getIdentitySources_java_lang_String_AsList <em>Identity Sources java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RequestAuthorizerBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestAuthorizerBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements RequestAuthorizerBuilder_apigateway {
	/**
	 * The default value of the '{@link #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() <em>Handler With IFunction software amazon awscdk services lambda IFunction As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() <em>Assume Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizerName_java_lang_String_() <em>Authorizer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZER_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizerName_java_lang_String_() <em>Authorizer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String authorizerName_java_lang_String_ = AUTHORIZER_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Results Cache Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentitySources_java_lang_String_AsList() <em>Identity Sources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitySources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentitySources_java_lang_String_AsList() <em>Identity Sources java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitySources_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String identitySources_java_lang_String_AsList = IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.RequestAuthorizer";

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
	protected RequestAuthorizerBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference() {
		return handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(
			String newHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference) {
		String oldHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
		handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference = newHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
					oldHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference,
					handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference() {
		return assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
			String newAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference) {
		String oldAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference = newAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
					oldAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference,
					assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizerName_java_lang_String_() {
		return authorizerName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizerName_java_lang_String_(String newAuthorizerName_java_lang_String_) {
		String oldAuthorizerName_java_lang_String_ = authorizerName_java_lang_String_;
		authorizerName_java_lang_String_ = newAuthorizerName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_,
					oldAuthorizerName_java_lang_String_, authorizerName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentitySources_java_lang_String_AsList() {
		return identitySources_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentitySources_java_lang_String_AsList(String newIdentitySources_java_lang_String_AsList) {
		String oldIdentitySources_java_lang_String_AsList = identitySources_java_lang_String_AsList;
		identitySources_java_lang_String_AsList = newIdentitySources_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST,
					oldIdentitySources_java_lang_String_AsList, identitySources_java_lang_String_AsList));
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
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			return getHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return getAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_:
			return getAuthorizerName_java_lang_String_();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST:
			return getIdentitySources_java_lang_String_AsList();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_:
			setAuthorizerName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST:
			setIdentitySources_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			setHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference(
					HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			setAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(
					ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_:
			setAuthorizerName_java_lang_String_(AUTHORIZER_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST:
			setIdentitySources_java_lang_String_AsList(IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
			return HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT == null
					? handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference != null
					: !HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE_EDEFAULT
							.equals(handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
			return ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT == null
					? assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference != null
					: !ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE_EDEFAULT
							.equals(assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_:
			return AUTHORIZER_NAME_JAVA_LANG_STRING__EDEFAULT == null ? authorizerName_java_lang_String_ != null
					: !AUTHORIZER_NAME_JAVA_LANG_STRING__EDEFAULT.equals(authorizerName_java_lang_String_);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST:
			return IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? identitySources_java_lang_String_AsList != null
					: !IDENTITY_SOURCES_JAVA_LANG_STRING_AS_LIST_EDEFAULT
							.equals(identitySources_java_lang_String_AsList);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.REQUEST_AUTHORIZER_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference: ");
		result.append(handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference);
		result.append(", assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference: ");
		result.append(assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference);
		result.append(", authorizerName_java_lang_String_: ");
		result.append(authorizerName_java_lang_String_);
		result.append(", resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", identitySources_java_lang_String_AsList: ");
		result.append(identitySources_java_lang_String_AsList);
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

} //RequestAuthorizerBuilder_apigatewayImpl
