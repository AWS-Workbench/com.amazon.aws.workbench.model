/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy Any Value Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}</li>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getOmitEmptyArray_java_lang_Boolean_ <em>Omit Empty Array java lang Boolean </em>}</li>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.LazyAnyValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core()
 * @model
 * @generated
 */
public interface LazyAnyValueOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #setDisplayHint_java_lang_String_(String)
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_DisplayHint_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDisplayHint_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.LazyAnyValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #getDisplayHint_java_lang_String_()
	 * @generated
	 */
	void setDisplayHint_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Omit Empty Array java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Empty Array java lang Boolean </em>' attribute.
	 * @see #setOmitEmptyArray_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_OmitEmptyArray_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getOmitEmptyArray_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.LazyAnyValueOptionsBuilder_core#getOmitEmptyArray_java_lang_Boolean_ <em>Omit Empty Array java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Empty Array java lang Boolean </em>' attribute.
	 * @see #getOmitEmptyArray_java_lang_Boolean_()
	 * @generated
	 */
	void setOmitEmptyArray_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.LazyAnyValueOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.LazyAnyValueOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.LazyAnyValueOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.LazyAnyValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getLazyAnyValueOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.LazyAnyValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LazyAnyValueOptionsBuilder_core
