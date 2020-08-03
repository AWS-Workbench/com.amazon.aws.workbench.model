/**
 */
package iam.impl;

import iam.AddToPrincipalPolicyResultBuilder_iam;
import iam.IamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add To Principal Policy Result Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getStatementAdded_java_lang_Boolean_ <em>Statement Added java lang Boolean </em>}</li>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}</li>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.impl.AddToPrincipalPolicyResultBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddToPrincipalPolicyResultBuilder_iamImpl extends MinimalEObjectImpl.Container
		implements AddToPrincipalPolicyResultBuilder_iam {
	/**
	 * The default value of the '{@link #getStatementAdded_java_lang_Boolean_() <em>Statement Added java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementAdded_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATEMENT_ADDED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementAdded_java_lang_Boolean_() <em>Statement Added java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementAdded_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean statementAdded_java_lang_Boolean_ = STATEMENT_ADDED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() <em>Policy Dependable With IDependable software amazon awscdk core IDependable As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult";

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
	protected AddToPrincipalPolicyResultBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStatementAdded_java_lang_Boolean_() {
		return statementAdded_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementAdded_java_lang_Boolean_(Boolean newStatementAdded_java_lang_Boolean_) {
		Boolean oldStatementAdded_java_lang_Boolean_ = statementAdded_java_lang_Boolean_;
		statementAdded_java_lang_Boolean_ = newStatementAdded_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_,
					oldStatementAdded_java_lang_Boolean_, statementAdded_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference() {
		return policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(
			String newPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference) {
		String oldPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
		policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference = newPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE,
					oldPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference,
					policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference));
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
					IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME, oldVarName, varName));
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
					IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER, oldIdentifier, identifier));
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
					IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode,
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
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_:
			return getStatementAdded_java_lang_Boolean_();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			return getPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_:
			setStatementAdded_java_lang_Boolean_((Boolean) newValue);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			setPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference((String) newValue);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_:
			setStatementAdded_java_lang_Boolean_(STATEMENT_ADDED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			setPolicyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference(
					POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__STATEMENT_ADDED_JAVA_LANG_BOOLEAN_:
			return STATEMENT_ADDED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? statementAdded_java_lang_Boolean_ != null
					: !STATEMENT_ADDED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(statementAdded_java_lang_Boolean_);
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE:
			return POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT == null
					? policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference != null
					: !POLICY_DEPENDABLE_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE_EDEFAULT
							.equals(policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference);
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (statementAdded_java_lang_Boolean_: ");
		result.append(statementAdded_java_lang_Boolean_);
		result.append(", policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference: ");
		result.append(policyDependableWithIDependable_software_amazon_awscdk_core_IDependable_AsReference);
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

} //AddToPrincipalPolicyResultBuilder_iamImpl
