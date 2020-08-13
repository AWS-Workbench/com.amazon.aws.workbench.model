/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Document Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getAssignSids_java_lang_Boolean_ <em>Assign Sids java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam()
 * @model
 * @generated
 */
public interface PolicyDocumentBuilder_iam extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Assign Sids java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Sids java lang Boolean </em>' attribute.
	 * @see #setAssignSids_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_AssignSids_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getAssignSids_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getAssignSids_java_lang_Boolean_ <em>Assign Sids java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Sids java lang Boolean </em>' attribute.
	 * @see #getAssignSids_java_lang_Boolean_()
	 * @generated
	 */
	void setAssignSids_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Statements software amazon awscdk services iam Policy Statement As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_Statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @model
	 * @generated
	 */
	String getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList <em>Statements software amazon awscdk services iam Policy Statement As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements software amazon awscdk services iam Policy Statement As List</em>' attribute.
	 * @see #getStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList()
	 * @generated
	 */
	void setStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.PolicyDocument"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.PolicyDocument" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getPolicyDocumentBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PolicyDocumentBuilder_iam
