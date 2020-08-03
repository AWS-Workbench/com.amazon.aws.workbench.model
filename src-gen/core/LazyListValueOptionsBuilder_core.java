/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy List Value Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}</li>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getOmitEmpty_java_lang_Boolean_ <em>Omit Empty java lang Boolean </em>}</li>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.LazyListValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getLazyListValueOptionsBuilder_core()
 * @model
 * @generated
 */
public interface LazyListValueOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #setDisplayHint_java_lang_String_(String)
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_DisplayHint_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDisplayHint_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.LazyListValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Hint java lang String </em>' attribute.
	 * @see #getDisplayHint_java_lang_String_()
	 * @generated
	 */
	void setDisplayHint_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Omit Empty java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Empty java lang Boolean </em>' attribute.
	 * @see #setOmitEmpty_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_OmitEmpty_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getOmitEmpty_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.LazyListValueOptionsBuilder_core#getOmitEmpty_java_lang_Boolean_ <em>Omit Empty java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Empty java lang Boolean </em>' attribute.
	 * @see #getOmitEmpty_java_lang_Boolean_()
	 * @generated
	 */
	void setOmitEmpty_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.LazyListValueOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.LazyListValueOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.LazyListValueOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.LazyListValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getLazyListValueOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.LazyListValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LazyListValueOptionsBuilder_core
