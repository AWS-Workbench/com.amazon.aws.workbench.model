/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.EnvironmentBuilder_core#getAccount_java_lang_String_ <em>Account java lang String </em>}</li>
 *   <li>{@link core.EnvironmentBuilder_core#getRegion_java_lang_String_ <em>Region java lang String </em>}</li>
 *   <li>{@link core.EnvironmentBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.EnvironmentBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.EnvironmentBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.EnvironmentBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getEnvironmentBuilder_core()
 * @model
 * @generated
 */
public interface EnvironmentBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Account java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account java lang String </em>' attribute.
	 * @see #setAccount_java_lang_String_(String)
	 * @see core.CorePackage#getEnvironmentBuilder_core_Account_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAccount_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.EnvironmentBuilder_core#getAccount_java_lang_String_ <em>Account java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account java lang String </em>' attribute.
	 * @see #getAccount_java_lang_String_()
	 * @generated
	 */
	void setAccount_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region java lang String </em>' attribute.
	 * @see #setRegion_java_lang_String_(String)
	 * @see core.CorePackage#getEnvironmentBuilder_core_Region_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRegion_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.EnvironmentBuilder_core#getRegion_java_lang_String_ <em>Region java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region java lang String </em>' attribute.
	 * @see #getRegion_java_lang_String_()
	 * @generated
	 */
	void setRegion_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.Environment"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getEnvironmentBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Environment" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getEnvironmentBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.EnvironmentBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getEnvironmentBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.EnvironmentBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getEnvironmentBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.EnvironmentBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // EnvironmentBuilder_core
