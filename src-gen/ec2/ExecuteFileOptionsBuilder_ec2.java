/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute File Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getFilePath_java_lang_String_ <em>File Path java lang String </em>}</li>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getArguments_java_lang_String_ <em>Arguments java lang String </em>}</li>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.ExecuteFileOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface ExecuteFileOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>File Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path java lang String </em>' attribute.
	 * @see #setFilePath_java_lang_String_(String)
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_FilePath_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFilePath_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.ExecuteFileOptionsBuilder_ec2#getFilePath_java_lang_String_ <em>File Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path java lang String </em>' attribute.
	 * @see #getFilePath_java_lang_String_()
	 * @generated
	 */
	void setFilePath_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Arguments java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments java lang String </em>' attribute.
	 * @see #setArguments_java_lang_String_(String)
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_Arguments_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getArguments_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.ExecuteFileOptionsBuilder_ec2#getArguments_java_lang_String_ <em>Arguments java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments java lang String </em>' attribute.
	 * @see #getArguments_java_lang_String_()
	 * @generated
	 */
	void setArguments_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.ExecuteFileOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.ExecuteFileOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.ExecuteFileOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.ExecuteFileOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getExecuteFileOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.ExecuteFileOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ExecuteFileOptionsBuilder_ec2
