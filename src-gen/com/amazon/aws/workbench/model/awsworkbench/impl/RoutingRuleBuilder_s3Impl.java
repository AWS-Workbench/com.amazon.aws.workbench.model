/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol;
import com.amazon.aws.workbench.model.awsworkbench.RoutingRuleBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Rule Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference <em>Condition With Routing Rule Condition software amazon awscdk services s3 Routing Rule Condition As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getHostName_java_lang_String_ <em>Host Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getHttpRedirectCode_java_lang_String_ <em>Http Redirect Code java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference <em>Replace Key With Replace Key software amazon awscdk services s3 Replace Key As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RoutingRuleBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingRuleBuilder_s3Impl extends MinimalEObjectImpl.Container implements RoutingRuleBuilder_s3 {
	/**
	 * The default value of the '{@link #getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference() <em>Condition With Routing Rule Condition software amazon awscdk services s3 Routing Rule Condition As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference() <em>Condition With Routing Rule Condition software amazon awscdk services s3 Routing Rule Condition As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference = CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostName_java_lang_String_() <em>Host Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostName_java_lang_String_() <em>Host Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String hostName_java_lang_String_ = HOST_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpRedirectCode_java_lang_String_() <em>Http Redirect Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpRedirectCode_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_REDIRECT_CODE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpRedirectCode_java_lang_String_() <em>Http Redirect Code java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpRedirectCode_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String httpRedirectCode_java_lang_String_ = HTTP_REDIRECT_CODE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @generated
	 * @ordered
	 */
	protected static final RedirectProtocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT = RedirectProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @generated
	 * @ordered
	 */
	protected RedirectProtocol protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference() <em>Replace Key With Replace Key software amazon awscdk services s3 Replace Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference() <em>Replace Key With Replace Key software amazon awscdk services s3 Replace Key As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference = REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.RoutingRule";

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
	protected RoutingRuleBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference() {
		return conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference(
			String newConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference) {
		String oldConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference = conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference;
		conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference = newConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE,
					oldConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference,
					conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostName_java_lang_String_() {
		return hostName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostName_java_lang_String_(String newHostName_java_lang_String_) {
		String oldHostName_java_lang_String_ = hostName_java_lang_String_;
		hostName_java_lang_String_ = newHostName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_,
					oldHostName_java_lang_String_, hostName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpRedirectCode_java_lang_String_() {
		return httpRedirectCode_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpRedirectCode_java_lang_String_(String newHttpRedirectCode_java_lang_String_) {
		String oldHttpRedirectCode_java_lang_String_ = httpRedirectCode_java_lang_String_;
		httpRedirectCode_java_lang_String_ = newHttpRedirectCode_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_,
					oldHttpRedirectCode_java_lang_String_, httpRedirectCode_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedirectProtocol getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() {
		return protocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(
			RedirectProtocol newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_) {
		RedirectProtocol oldProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = protocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
		protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_,
					protocol_software_amazon_awscdk_services_s3_RedirectProtocol_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference() {
		return replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference(
			String newReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference) {
		String oldReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference = replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference;
		replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference = newReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE,
					oldReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference,
					replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME,
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
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE:
			return getConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			return getHostName_java_lang_String_();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_:
			return getHttpRedirectCode_java_lang_String_();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE:
			return getReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE:
			setConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			setHostName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_:
			setHttpRedirectCode_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_((RedirectProtocol) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE:
			setReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE:
			setConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference(
					CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			setHostName_java_lang_String_(HOST_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_:
			setHttpRedirectCode_java_lang_String_(HTTP_REDIRECT_CODE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE:
			setReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference(
					REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE:
			return CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE_EDEFAULT == null
					? conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference != null
					: !CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE_EDEFAULT
							.equals(conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			return HOST_NAME_JAVA_LANG_STRING__EDEFAULT == null ? hostName_java_lang_String_ != null
					: !HOST_NAME_JAVA_LANG_STRING__EDEFAULT.equals(hostName_java_lang_String_);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_:
			return HTTP_REDIRECT_CODE_JAVA_LANG_STRING__EDEFAULT == null ? httpRedirectCode_java_lang_String_ != null
					: !HTTP_REDIRECT_CODE_JAVA_LANG_STRING__EDEFAULT.equals(httpRedirectCode_java_lang_String_);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE:
			return REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE_EDEFAULT == null
					? replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference != null
					: !REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE_EDEFAULT
							.equals(replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
				" (conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference: ");
		result.append(
				conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference);
		result.append(", hostName_java_lang_String_: ");
		result.append(hostName_java_lang_String_);
		result.append(", httpRedirectCode_java_lang_String_: ");
		result.append(httpRedirectCode_java_lang_String_);
		result.append(", protocol_software_amazon_awscdk_services_s3_RedirectProtocol_: ");
		result.append(protocol_software_amazon_awscdk_services_s3_RedirectProtocol_);
		result.append(", replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference: ");
		result.append(replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference);
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

} //RoutingRuleBuilder_s3Impl
