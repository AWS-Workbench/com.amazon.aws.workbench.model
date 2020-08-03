/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Document Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getAssignSids_java_lang_Boolean_ <em>Assign Sids java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.PolicyDocumentBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyDocumentBuilder_iamImpl extends MinimalEObjectImpl.Container implements PolicyDocumentBuilder_iam {
	/**
	 * The default value of the '{@link #getAssignSids_java_lang_Boolean_() <em>Assign Sids java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignSids_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSIGN_SIDS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignSids_java_lang_Boolean_() <em>Assign Sids java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignSids_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean assignSids_java_lang_Boolean_ = ASSIGN_SIDS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 * @ordered
	 */
	protected String statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.PolicyDocument";

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
	protected PolicyDocumentBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAssignSids_java_lang_Boolean_() {
		return assignSids_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignSids_java_lang_Boolean_(Boolean newAssignSids_java_lang_Boolean_) {
		Boolean oldAssignSids_java_lang_Boolean_ = assignSids_java_lang_Boolean_;
		assignSids_java_lang_Boolean_ = newAssignSids_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_,
					oldAssignSids_java_lang_Boolean_, assignSids_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList() {
		return statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
			String newStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList) {
		String oldStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList = newStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
					oldStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList,
					statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList));
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
					AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_:
			return getAssignSids_java_lang_Boolean_();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_:
			setAssignSids_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_:
			setAssignSids_java_lang_Boolean_(ASSIGN_SIDS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(
					STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_:
			return ASSIGN_SIDS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? assignSids_java_lang_Boolean_ != null
					: !ASSIGN_SIDS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(assignSids_java_lang_Boolean_);
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
			return STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT == null
					? statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList != null
					: !STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST_EDEFAULT
							.equals(statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (assignSids_java_lang_Boolean_: ");
		result.append(assignSids_java_lang_Boolean_);
		result.append(", statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList: ");
		result.append(statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList);
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

} //PolicyDocumentBuilder_iamImpl
