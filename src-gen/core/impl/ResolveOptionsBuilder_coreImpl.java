/**
 */
package core.impl;

import core.CorePackage;
import core.ResolveOptionsBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getPreparing_java_lang_Boolean_ <em>Preparing java lang Boolean </em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.ResolveOptionsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolveOptionsBuilder_coreImpl extends MinimalEObjectImpl.Container implements ResolveOptionsBuilder_core {
	/**
	 * The default value of the '{@link #getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference() <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference() <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference = RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreparing_java_lang_Boolean_() <em>Preparing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparing_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREPARING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreparing_java_lang_Boolean_() <em>Preparing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparing_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean preparing_java_lang_Boolean_ = PREPARING_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.ResolveOptions";

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
	protected ResolveOptionsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference() {
		return resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference(
			String newResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference) {
		String oldResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference = resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference;
		resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference = newResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE,
					oldResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference,
					resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference() {
		return scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
			String newScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference) {
		String oldScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference = newScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE,
					oldScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference,
					scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPreparing_java_lang_Boolean_() {
		return preparing_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreparing_java_lang_Boolean_(Boolean newPreparing_java_lang_Boolean_) {
		Boolean oldPreparing_java_lang_Boolean_ = preparing_java_lang_Boolean_;
		preparing_java_lang_Boolean_ = newPreparing_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_,
					oldPreparing_java_lang_Boolean_, preparing_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE:
			return getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_:
			return getPreparing_java_lang_Boolean_();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE:
			setResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference((String) newValue);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference((String) newValue);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_:
			setPreparing_java_lang_Boolean_((Boolean) newValue);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE:
			setResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference(
					RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			setScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference(
					SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_:
			setPreparing_java_lang_Boolean_(PREPARING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE:
			return RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE_EDEFAULT == null
					? resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference != null
					: !RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE_EDEFAULT
							.equals(resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
			return SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT == null
					? scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference != null
					: !SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE_EDEFAULT
							.equals(scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_:
			return PREPARING_JAVA_LANG_BOOLEAN__EDEFAULT == null ? preparing_java_lang_Boolean_ != null
					: !PREPARING_JAVA_LANG_BOOLEAN__EDEFAULT.equals(preparing_java_lang_Boolean_);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference: ");
		result.append(resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference);
		result.append(", scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference: ");
		result.append(scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference);
		result.append(", preparing_java_lang_Boolean_: ");
		result.append(preparing_java_lang_Boolean_);
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

} //ResolveOptionsBuilder_coreImpl
