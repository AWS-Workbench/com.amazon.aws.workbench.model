/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getStackName <em>Stack Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getTerminationProtection <em>Termination Protection</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getServiceresources <em>Serviceresources</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder()
 * @model
 * @generated
 */
public interface StackBuilder extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Stack Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Name</em>' attribute.
	 * @see #setStackName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_StackName()
	 * @model
	 * @generated
	 */
	String getStackName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getStackName <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Name</em>' attribute.
	 * @see #getStackName()
	 * @generated
	 */
	void setStackName(String value);

	/**
	 * Returns the value of the '<em><b>Termination Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Protection</em>' attribute.
	 * @see #setTerminationProtection(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_TerminationProtection()
	 * @model
	 * @generated
	 */
	Boolean getTerminationProtection();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getTerminationProtection <em>Termination Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Protection</em>' attribute.
	 * @see #getTerminationProtection()
	 * @generated
	 */
	void setTerminationProtection(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.Stack"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see #setGeneratedClassName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Stack"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getGeneratedClassName <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Class Name</em>' attribute.
	 * @see #getGeneratedClassName()
	 * @generated
	 */
	void setGeneratedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

	/**
	 * Returns the value of the '<em><b>Serviceresources</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceresources</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_Serviceresources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceResources> getServiceresources();

} // StackBuilder
