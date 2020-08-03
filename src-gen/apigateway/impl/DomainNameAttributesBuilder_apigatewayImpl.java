/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.DomainNameAttributesBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Name Attributes Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getDomainNameAliasHostedZoneId_java_lang_String_ <em>Domain Name Alias Hosted Zone Id java lang String </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getDomainNameAliasTarget_java_lang_String_ <em>Domain Name Alias Target java lang String </em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.DomainNameAttributesBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainNameAttributesBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements DomainNameAttributesBuilder_apigateway {
	/**
	 * The default value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName_java_lang_String_() <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String domainName_java_lang_String_ = DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainNameAliasHostedZoneId_java_lang_String_() <em>Domain Name Alias Hosted Zone Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameAliasHostedZoneId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainNameAliasHostedZoneId_java_lang_String_() <em>Domain Name Alias Hosted Zone Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameAliasHostedZoneId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String domainNameAliasHostedZoneId_java_lang_String_ = DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainNameAliasTarget_java_lang_String_() <em>Domain Name Alias Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameAliasTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainNameAliasTarget_java_lang_String_() <em>Domain Name Alias Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameAliasTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String domainNameAliasTarget_java_lang_String_ = DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.DomainNameAttributes";

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
	protected DomainNameAttributesBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName_java_lang_String_() {
		return domainName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName_java_lang_String_(String newDomainName_java_lang_String_) {
		String oldDomainName_java_lang_String_ = domainName_java_lang_String_;
		domainName_java_lang_String_ = newDomainName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_,
					oldDomainName_java_lang_String_, domainName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainNameAliasHostedZoneId_java_lang_String_() {
		return domainNameAliasHostedZoneId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainNameAliasHostedZoneId_java_lang_String_(
			String newDomainNameAliasHostedZoneId_java_lang_String_) {
		String oldDomainNameAliasHostedZoneId_java_lang_String_ = domainNameAliasHostedZoneId_java_lang_String_;
		domainNameAliasHostedZoneId_java_lang_String_ = newDomainNameAliasHostedZoneId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_,
					oldDomainNameAliasHostedZoneId_java_lang_String_, domainNameAliasHostedZoneId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainNameAliasTarget_java_lang_String_() {
		return domainNameAliasTarget_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainNameAliasTarget_java_lang_String_(String newDomainNameAliasTarget_java_lang_String_) {
		String oldDomainNameAliasTarget_java_lang_String_ = domainNameAliasTarget_java_lang_String_;
		domainNameAliasTarget_java_lang_String_ = newDomainNameAliasTarget_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_,
					oldDomainNameAliasTarget_java_lang_String_, domainNameAliasTarget_java_lang_String_));
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
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
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
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier,
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
					ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
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
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			return getDomainName_java_lang_String_();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_:
			return getDomainNameAliasHostedZoneId_java_lang_String_();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_:
			return getDomainNameAliasTarget_java_lang_String_();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_:
			setDomainNameAliasHostedZoneId_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_:
			setDomainNameAliasTarget_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			setDomainName_java_lang_String_(DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_:
			setDomainNameAliasHostedZoneId_java_lang_String_(
					DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_:
			setDomainNameAliasTarget_java_lang_String_(DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
			return DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT == null ? domainName_java_lang_String_ != null
					: !DOMAIN_NAME_JAVA_LANG_STRING__EDEFAULT.equals(domainName_java_lang_String_);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING_:
			return DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING__EDEFAULT == null
					? domainNameAliasHostedZoneId_java_lang_String_ != null
					: !DOMAIN_NAME_ALIAS_HOSTED_ZONE_ID_JAVA_LANG_STRING__EDEFAULT
							.equals(domainNameAliasHostedZoneId_java_lang_String_);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING_:
			return DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING__EDEFAULT == null
					? domainNameAliasTarget_java_lang_String_ != null
					: !DOMAIN_NAME_ALIAS_TARGET_JAVA_LANG_STRING__EDEFAULT
							.equals(domainNameAliasTarget_java_lang_String_);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.DOMAIN_NAME_ATTRIBUTES_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
		result.append(" (domainName_java_lang_String_: ");
		result.append(domainName_java_lang_String_);
		result.append(", domainNameAliasHostedZoneId_java_lang_String_: ");
		result.append(domainNameAliasHostedZoneId_java_lang_String_);
		result.append(", domainNameAliasTarget_java_lang_String_: ");
		result.append(domainNameAliasTarget_java_lang_String_);
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

} //DomainNameAttributesBuilder_apigatewayImpl
