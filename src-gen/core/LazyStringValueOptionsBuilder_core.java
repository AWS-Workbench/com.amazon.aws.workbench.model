/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy String Value Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.LazyStringValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}</li>
 *   <li>{@link core.LazyStringValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.LazyStringValueOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.LazyStringValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.LazyStringValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core()
 * @model
 * @generated
 */
public interface LazyStringValueOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #setDisplayHint_java_lang_String_(String)
	 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core_DisplayHint_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDisplayHint_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.LazyStringValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #getDisplayHint_java_lang_String_()
	 * @generated
	 */
	void setDisplayHint_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.LazyStringValueOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.LazyStringValueOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.LazyStringValueOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.LazyStringValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getLazyStringValueOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.LazyStringValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LazyStringValueOptionsBuilder_core
