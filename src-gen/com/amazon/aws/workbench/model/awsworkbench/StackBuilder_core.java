/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironmentAsReference <em>Env With Environment As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName <em>Stack Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizerAsReference <em>Synthesizer With IStack Synthesizer As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTagsAsMap <em>Tags As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection <em>Termination Protection</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getServiceresources <em>Serviceresources</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core()
 * @model
 * @generated
 */
public interface StackBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Env With Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env With Environment As Reference</em>' attribute.
	 * @see #setEnvWithEnvironmentAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_EnvWithEnvironmentAsReference()
	 * @model
	 * @generated
	 */
	String getEnvWithEnvironmentAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getEnvWithEnvironmentAsReference <em>Env With Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env With Environment As Reference</em>' attribute.
	 * @see #getEnvWithEnvironmentAsReference()
	 * @generated
	 */
	void setEnvWithEnvironmentAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Stack Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Name</em>' attribute.
	 * @see #setStackName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_StackName()
	 * @model
	 * @generated
	 */
	String getStackName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getStackName <em>Stack Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Name</em>' attribute.
	 * @see #getStackName()
	 * @generated
	 */
	void setStackName(String value);

	/**
	 * Returns the value of the '<em><b>Synthesizer With IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthesizer With IStack Synthesizer As Reference</em>' attribute.
	 * @see #setSynthesizerWithIStackSynthesizerAsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_SynthesizerWithIStackSynthesizerAsReference()
	 * @model
	 * @generated
	 */
	String getSynthesizerWithIStackSynthesizerAsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getSynthesizerWithIStackSynthesizerAsReference <em>Synthesizer With IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthesizer With IStack Synthesizer As Reference</em>' attribute.
	 * @see #getSynthesizerWithIStackSynthesizerAsReference()
	 * @generated
	 */
	void setSynthesizerWithIStackSynthesizerAsReference(String value);

	/**
	 * Returns the value of the '<em><b>Tags As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags As Map</em>' attribute.
	 * @see #setTagsAsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_TagsAsMap()
	 * @model
	 * @generated
	 */
	String getTagsAsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTagsAsMap <em>Tags As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags As Map</em>' attribute.
	 * @see #getTagsAsMap()
	 * @generated
	 */
	void setTagsAsMap(String value);

	/**
	 * Returns the value of the '<em><b>Termination Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Protection</em>' attribute.
	 * @see #setTerminationProtection(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_TerminationProtection()
	 * @model
	 * @generated
	 */
	Boolean getTerminationProtection();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getTerminationProtection <em>Termination Protection</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Stack" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getStackBuilder_core_Serviceresources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceResources> getServiceresources();

} // StackBuilder_core
