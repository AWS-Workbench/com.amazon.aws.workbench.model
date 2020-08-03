/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bootstrapless Synthesizer Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_ <em>Cloud Formation Execution Role Arn java lang String </em>}</li>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}</li>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.BootstraplessSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core()
 * @model
 * @generated
 */
public interface BootstraplessSynthesizerBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud Formation Execution Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Formation Execution Role Arn java lang String </em>' attribute.
	 * @see #setCloudFormationExecutionRoleArn_java_lang_String_(String)
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCloudFormationExecutionRoleArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.BootstraplessSynthesizerBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_ <em>Cloud Formation Execution Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Formation Execution Role Arn java lang String </em>' attribute.
	 * @see #getCloudFormationExecutionRoleArn_java_lang_String_()
	 * @generated
	 */
	void setCloudFormationExecutionRoleArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Role Arn java lang String </em>' attribute.
	 * @see #setDeployRoleArn_java_lang_String_(String)
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_DeployRoleArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDeployRoleArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.BootstraplessSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Role Arn java lang String </em>' attribute.
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 */
	void setDeployRoleArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.BootstraplessSynthesizer"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.BootstraplessSynthesizer" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.BootstraplessSynthesizerBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.BootstraplessSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getBootstraplessSynthesizerBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.BootstraplessSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BootstraplessSynthesizerBuilder_core
